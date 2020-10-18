package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;
import com.sugar.sugardesertmod.init.SugarDBlock;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class Sugarbricksstairs extends BlockStairs {

	public Sugarbricksstairs() {
		super(SugarDBlock.Sugar_bricks.getDefaultState());
		this.setRegistryName("sugar_bricks_stairs");
		this.setUnlocalizedName("sugar_bricks_stairs");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.useNeighborBrightness = true;
	}

	protected Sugarbricksstairs(IBlockState modelState) {
		super(modelState);
	}

}
