package com.jteam.brownffins.data;

import com.jteam.brownffins.Brownffins;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Brownffins.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();

        if (event.includeServer()) {
            dataGenerator.addProvider(new TutRecipes(dataGenerator));
            dataGenerator.addProvider(new TutLootTables(dataGenerator));
            TutBlockTags tutBlockTags = new TutBlockTags(dataGenerator, event.getExistingFileHelper());
            dataGenerator.addProvider(tutBlockTags);
            dataGenerator.addProvider(new TutItemTags(dataGenerator, tutBlockTags, event.getExistingFileHelper()));

        }
        if (event.includeClient()) {
            dataGenerator.addProvider(new TutBlockStates(dataGenerator, event.getExistingFileHelper()));
            dataGenerator.addProvider(new TutItemModels(dataGenerator, event.getExistingFileHelper()));
            dataGenerator.addProvider(new TutLanguageProvider(dataGenerator, "en_us"));
        }
    }
}
