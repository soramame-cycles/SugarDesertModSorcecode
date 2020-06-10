package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PuddingBlock extends Block {

	public PuddingBlock() {
		super(Material.GROUND);
		this.setHardness(2.0F);
		this.setResistance(2.0F);
		this.setHarvestLevel("shovel", 1);
		this.setRegistryName("pudding_block");
		this.setUnlocalizedName("pudding_block");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.SNOW);

	}

	public PuddingBlock(Material materialIn) {
		super(materialIn);

	}
}
