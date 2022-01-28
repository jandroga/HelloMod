package com.jteam.brownffins.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.jteam.brownffins.Brownffins.MODID;

public class TutItemTags extends ItemTagsProvider {
    public TutItemTags(DataGenerator dataGenerator, TutBlockTags tutBlockTags, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, tutBlockTags, MODID, existingFileHelper);
    }
}
