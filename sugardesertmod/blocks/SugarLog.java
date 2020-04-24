package com.sugar.sugardesertmod.blocks;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.BlockLog;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;

public class SugarLog extends BlockLog {

	public SugarLog() {
		super();
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("axe", 0);
		this.setRegistryName("sugar_log");
		this.setUnlocalizedName("sugar_log");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.WOOD);
		this.setDefaultState(this.blockState.getBaseState().withProperty(LOG_AXIS, BlockLog.EnumAxis.Y));
	}

	@Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, LOG_AXIS);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        switch (state.getValue(LOG_AXIS)) {
            case X:
                return 4;
            case Y:
                return 0;
            case Z:
                return 8;
            case NONE:
            default:
                return 12;
        }
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        switch (meta) {
            case 0:
                return getDefaultState().withProperty(LOG_AXIS, EnumAxis.Y);
            case 4:
                return getDefaultState().withProperty(LOG_AXIS, EnumAxis.X);
            case 8:
                return getDefaultState().withProperty(LOG_AXIS, EnumAxis.Z);
            case 12:
            default:
                return getDefaultState().withProperty(LOG_AXIS, EnumAxis.NONE);
        }
    }
}
