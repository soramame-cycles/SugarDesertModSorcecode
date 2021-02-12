package com.sugar.sugardesertmod.blocks;

import java.util.List;
import java.util.Random;

import com.sugar.sugardesertmod.SugarDesertMod;
import com.sugar.sugardesertmod.init.block.SugarDBlock;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SugarLeaves extends BlockLeaves {

	public SugarLeaves() {
		this.setHardness(0.5F);
        this.setLightOpacity(1);
        this.setRegistryName("sugar_leaves");
		this.setUnlocalizedName("sugar_leaves");
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setSoundType(SoundType.PLANT);
		this.setDefaultState(blockState.getBaseState().withProperty(CHECK_DECAY, false).withProperty(DECAYABLE, true));
	}

	@Override
    public BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, CHECK_DECAY, DECAYABLE);
    }

	@Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(DECAYABLE, (meta & 4) == 0).withProperty(CHECK_DECAY, (meta & 8) > 0);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int i = 0;

        if (!state.getValue(DECAYABLE)) {
            i |= 4;
        }

        if (state.getValue(CHECK_DECAY)) {
            i |= 8;
        }

        return i;
    }

    @Override
    public void getSubBlocks(CreativeTabs creativeTab, NonNullList<ItemStack> list) {
        list.add(new ItemStack(this, 1, 0));
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
        return Item.getItemFromBlock(SugarDBlock.Sugar_sapling);
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this);
    }

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {

		return NonNullList.withSize(1, new ItemStack(this, 1));
	}

	@Override
	public EnumType getWoodType(int meta) {

		return null;
	}

	@Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer(){
        return Blocks.LEAVES.getBlockLayer();
    }

    @Override
    public boolean isOpaqueCube(IBlockState state){
        return Blocks.LEAVES.isOpaqueCube(state);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean shouldSideBeRendered(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side){
        return Blocks.LEAVES.shouldSideBeRendered(state, world, pos, side);
    }

}
