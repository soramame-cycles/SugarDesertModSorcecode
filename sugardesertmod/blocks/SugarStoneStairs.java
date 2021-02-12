package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;
import com.sugar.sugardesertmod.init.block.SugarDBlock;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class SugarStoneStairs extends BlockStairs {

	public SugarStoneStairs() {
		super(SugarDBlock.Sugar_stone.getDefaultState());
		this.setRegistryName("sugar_stone_stairs");
		this.setUnlocalizedName("sugar_stone_stairs");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.useNeighborBrightness = true;

	}

	protected SugarStoneStairs(IBlockState modelState) {
		super(modelState);

	}

}
