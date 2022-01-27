package com.jteam.brownffins.data;

import com.jteam.brownffins.Brownffins;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class TutLanguageProvider extends LanguageProvider {
    public TutLanguageProvider(DataGenerator gen, String modid, String locale) {
        super(gen, Brownffins.MODID, locale);
    }

    @Override
    protected void addTranslations() {

    }
}
