package com.sugar.sugardesertmod.blocks;

import java.util.Random;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EndSugarStone extends BlockOre {

	public EndSugarStone() {
		super();
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setHarvestLevel("pickaxe", 0);
		this.setRegistryName("end_sugar_stone");
		this.setUnlocalizedName("end_sugar_stone");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.GLASS);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return SugarDesertMod.Sugar_diamond_nugget;
	}

	@Override
	public int quantityDropped(Random random) {
		return 1;
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune > 0 && Item.getItemFromBlock(this) !=
        		this.getItemDropped((IBlockState)this.getBlockState()
        				.getValidStates().iterator().next(), random, fortune)) {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }

	@Override
	public int getExpDrop(IBlockState state,
			net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
		Random rand = world instanceof World ? ((World)world).rand : new Random();
		return MathHelper.getInt(rand,3,7);
	}

	@Override
	public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) {
		if (entity instanceof net.minecraft.entity.boss.EntityDragon) {
			return false;
		}
		return true;
	}
}
