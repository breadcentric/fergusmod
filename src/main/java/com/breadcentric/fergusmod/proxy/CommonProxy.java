package com.breadcentric.fergusmod.proxy;

import com.breadcentric.fergusmod.ModBlocks;
import com.breadcentric.fergusmod.blocks.BlueStone;
import com.breadcentric.fergusmod.generator.BluestoneGenerator;
import com.breadcentric.fergusmod.items.ItemBluestoneSword;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.breadcentric.fergusmod.ModItems.BLUESTONE;

@Mod.EventBusSubscriber
public class CommonProxy {


    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
        GameRegistry.registerWorldGenerator(new BluestoneGenerator(), 10);
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlueStone());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event
                .getRegistry()
                .register(
                        new ItemBlock(ModBlocks.blueStone)
                                .setRegistryName(
                                        ModBlocks.blueStone.getRegistryName()));
        event.getRegistry().register(new ItemBluestoneSword(BLUESTONE));
    }

}
