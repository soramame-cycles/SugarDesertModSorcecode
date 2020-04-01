package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class SugarFence extends BlockFence {

	public SugarFence() {
		super(Material.WOOD, MapColor.AIR);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("axe", 0);
		this.setRegistryName("sugar_fence");
		this.setUnlocalizedName("sugar_fence");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.WOOD);
	}

	public SugarFence(Material materialIn,MapColor mapColorIn) {
		super(materialIn, mapColorIn);

}

}
