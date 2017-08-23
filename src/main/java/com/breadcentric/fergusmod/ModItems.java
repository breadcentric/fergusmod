package com.breadcentric.fergusmod;

import com.breadcentric.fergusmod.items.ItemBluestoneSword;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    public static Item.ToolMaterial BLUESTONE = EnumHelper.addToolMaterial(
            "BLUESTONE",
            3,
            1000,
            15.0F,
            14.0F,
            30
    );

    @GameRegistry.ObjectHolder("fergusmod:bluestonesword")
    public static ItemBluestoneSword itemBluestoneSword;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemBluestoneSword.initModel();
    }


}
