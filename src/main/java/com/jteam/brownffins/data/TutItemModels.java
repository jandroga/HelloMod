package com.jteam.brownffins.data;

import com.jteam.brownffins.Brownffins;
import com.jteam.brownffins.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemModels extends ItemModelProvider {

    public TutItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper){
        super(generator, Brownffins.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        /*
        Exemple:
        withExistingParent(Registration.BROWNFFIN_ORE_CHOCO_ITEM.get().getRegistryName().getPath(), modLoc("block/brownffin_ore_choco"));
        withExistingParent(Registration.BROWNFFIN_ORE_MASA_ITEM.get().getRegistryName().getPath(), modLoc("block/brownffin_ore_masa"));
         */
        withExistingParent(Registration.BROWNFFIN.get().getRegistryName().getPath(),
                modLoc("item/brownffin"));

    }
}
