package com.jteam.brownffins.data;

import com.jteam.brownffins.Brownffins;
import com.jteam.brownffins.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.jteam.brownffins.setup.ModSetup.TAB;

public class TutLanguageProvider extends LanguageProvider {
    public TutLanguageProvider(DataGenerator gen, String locale) {
        super(gen, Brownffins.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB,  "Brownffins");
        add(Registration.BROWNFFIN.get(), "Brownffin");
        add(Registration.BROWNFFIN_BLOCK.get(), "Brownffin Block");

    }
}
