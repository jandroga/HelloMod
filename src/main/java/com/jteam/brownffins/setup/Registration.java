package com.jteam.brownffins.setup;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.jteam.brownffins.Brownffins.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);


    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.TAB_GROUP);
    public static final Block.Properties BROWNFFIN_BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.SPONGE).strength(1f);


    public static final RegistryObject<Item> BROWNFFIN = ITEMS.register("brownffin",() -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Block> BROWNFFIN_BLOCK = BLOCKS.register("brownffin_block", () -> new Block(BROWNFFIN_BLOCK_PROPERTIES));
    public static final RegistryObject<Item> BROWNFFIN_BLOCK_ITEM = fromBlock(BROWNFFIN_BLOCK);


    public static RegistryObject<Item> fromBlock(RegistryObject<Block> block){
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }


}
