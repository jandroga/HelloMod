package com.jteam.brownffins.data;

import com.jteam.brownffins.Brownffins;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockTags extends BlockTagsProvider {

    public TutBlockTags(DataGenerator generator, ExistingFileHelper existingFileHelper){
        super(generator, Brownffins.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(){
        /*
        tag(BlockTags.MINEABLE_WITH_SHOVEL)
        .add(Registration.BROWNFFINS_ORE_CHOCO.get())
        .add(Registration.BROWNFFINS_ORE_MASA.get());
         */

         //CodeTogether
    }
}
