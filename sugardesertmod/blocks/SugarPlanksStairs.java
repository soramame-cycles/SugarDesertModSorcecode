package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;
import com.sugar.sugardesertmod.init.block.SugarDBlock;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class SugarPlanksStairs extends BlockStairs {

	public SugarPlanksStairs() {
		super(SugarDBlock.Sugar_planks.getDefaultState());
		this.setRegistryName("sugar_planks_stairs");
		this.setUnlocalizedName("sugar_planks_stairs");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.useNeighborBrightness = true;

	}

	protected SugarPlanksStairs(IBlockState modelState) {
		super(modelState);

	}

}
