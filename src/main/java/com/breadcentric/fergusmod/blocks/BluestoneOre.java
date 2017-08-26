package com.breadcentric.fergusmod.blocks;

import com.breadcentric.fergusmod.FergusMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BluestoneOre extends Block {

    public BluestoneOre() {
        super(Material.ROCK);
        setUnlocalizedName(FergusMod.MODID + ".bluestoneore");
        setRegistryName("bluestoneore");
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setLightLevel(1);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @SideOnly(Side.CLIENT)
    public void initItemModel() {
    }
}
