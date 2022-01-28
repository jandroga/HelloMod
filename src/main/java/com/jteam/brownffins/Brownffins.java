package com.jteam.brownffins;

import com.jteam.brownffins.setup.ClientSetup;
import com.jteam.brownffins.setup.ModSetup;
import com.jteam.brownffins.setup.Registration;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Brownffins.MODID)
public class Brownffins {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "brownffins";

    public Brownffins(){

        Registration.init();

        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        modBus.addListener(ModSetup::init);

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modBus.addListener(ClientSetup::init));
    }
}
