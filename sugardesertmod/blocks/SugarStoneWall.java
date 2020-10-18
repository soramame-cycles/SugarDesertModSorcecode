package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;
import com.sugar.sugardesertmod.init.SugarDBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;

public class SugarStoneWall extends BlockWall {

	public SugarStoneWall() {
		super(SugarDBlock.Sugar_stone);
		this.setHardness(2.0F);
		this.setResistance(2.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setRegistryName("sugar_stone_wall");
		this.setUnlocalizedName("sugar_stone_wall");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
	}

	public SugarStoneWall(Block modelBlock) {
		super(modelBlock);
	}

}
