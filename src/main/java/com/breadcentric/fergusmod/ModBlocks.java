package com.breadcentric.fergusmod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("fergusmod:bluestone")
    public static BlueStone blueStone;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blueStone.initModel();
    }

    @SideOnly(Side.CLIENT)
    public static void initItemModels() {
        blueStone.initItemModel();
    }
}
