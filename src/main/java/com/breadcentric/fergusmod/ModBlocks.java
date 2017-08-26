package com.breadcentric.fergusmod;

import com.breadcentric.fergusmod.blocks.BluestoneOre;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("fergusmod:bluestoneore")
    public static BluestoneOre bluestoneOre;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        bluestoneOre.initModel();
    }

    @SideOnly(Side.CLIENT)
    public static void initItemModels() {
        bluestoneOre.initItemModel();
    }
}
