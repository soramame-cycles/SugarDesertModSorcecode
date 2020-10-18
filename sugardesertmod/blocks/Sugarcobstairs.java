package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;
import com.sugar.sugardesertmod.init.SugarDBlock;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class Sugarcobstairs extends BlockStairs {

	public Sugarcobstairs() {
		super(SugarDBlock.Sugar_cobblestone.getDefaultState());
		this.setRegistryName("sugar_cob_stairs");
		this.setUnlocalizedName("sugar_cob_stairs");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.useNeighborBrightness = true;
	}

	protected Sugarcobstairs(IBlockState modelState) {
		super(modelState);
	}

}
