package com.jteam.brownffins.data;

import com.jteam.brownffins.Brownffins;
import com.jteam.brownffins.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.jteam.brownffins.Brownffins.MODID;

public class TutBlockStates extends BlockStateProvider {
    public TutBlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.BROWNFFIN_BLOCK.get());
    }
}
