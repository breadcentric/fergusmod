package com.breadcentric.fergusmod.proxy;

import com.breadcentric.fergusmod.ModBlocks;
import com.breadcentric.fergusmod.blocks.BluestoneOre;
import com.breadcentric.fergusmod.generator.BluestoneOreGenerator;
import com.breadcentric.fergusmod.items.Bluestone;
import com.breadcentric.fergusmod.items.ItemBluestoneSword;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.breadcentric.fergusmod.ModItems.BLUESTONE;
import static com.breadcentric.fergusmod.ModItems.bluestone;

@Mod.EventBusSubscriber
public class CommonProxy {


    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
        GameRegistry.registerWorldGenerator(new BluestoneOreGenerator(), 10);
        GameRegistry.addSmelting(ModBlocks.bluestoneOre, new ItemStack(bluestone), 0.1f);
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BluestoneOre());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event
                .getRegistry()
                .register(
                        new ItemBlock(ModBlocks.bluestoneOre)
                                .setRegistryName(
                                        ModBlocks.bluestoneOre.getRegistryName()));
        event.getRegistry().register(new Bluestone());
        event.getRegistry().register(new ItemBluestoneSword(BLUESTONE));
    }

}
