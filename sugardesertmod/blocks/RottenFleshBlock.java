package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RottenFleshBlock extends Block {

	public RottenFleshBlock() {
		super(Material.GROUND);
		this.setHardness(0.25F);
		this.setResistance(0.25F);
		this.setHarvestLevel("pickaxe", 0);
		this.setRegistryName("rotten_flesh_block");
		this.setUnlocalizedName("rotten_flesh_block");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.SLIME);
		this.setLightLevel(0.2F);
	}

	public RottenFleshBlock(Material materialIn) {
		super(materialIn);
		// TODO 自動生成されたコンストラクター・スタブ
	}
}
