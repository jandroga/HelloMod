package com.jteam.brownffins.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {

    public static final String TAB = "brownffins";
    public static final CreativeModeTab TAB_GROUP = new CreativeModeTab(TAB) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Registration.BROWNFFIN.get());
        }
    };

    public static void init(final FMLCommonSetupEvent event){


    }
}
