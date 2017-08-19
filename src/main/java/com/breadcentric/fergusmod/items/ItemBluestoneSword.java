package com.breadcentric.fergusmod.items;

import com.breadcentric.fergusmod.FergusMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBluestoneSword extends ItemSword {
    public ItemBluestoneSword(ToolMaterial material) {
        super(material);
        setRegistryName("bluestonesword");
        this.setUnlocalizedName(FergusMod.MODID + ".bluestonesword");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(
                this,
                0,
                new ModelResourceLocation(getRegistryName(), "inventory")
        );
    }
}
