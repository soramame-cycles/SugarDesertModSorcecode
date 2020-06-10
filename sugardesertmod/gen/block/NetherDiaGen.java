package com.sugar.sugardesertmod.gen.block;

import java.util.Random;

import com.sugar.sugardesertmod.blocks.SugarDBlock;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class NetherDiaGen implements IWorldGenerator{

	private WorldGenerator nsr;

	public NetherDiaGen() {
		nsr = new WorldGenMinable(SugarDBlock.Sugarrack.getDefaultState(),8);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {

		if(world.provider.getDimension() == -1) {
			runGenerator(nsr,world, random, chunkX, chunkZ,20,Blocks.NETHERRACK);
		}
	}

	private void runGenerator(WorldGenerator gen,World world, Random rand,int chunkX,int chunkZ,int chance,Block taget) {

	for (int i = 0; i < 10; i++) {
		int x = chunkX * 16 + rand.nextInt(16);
		int y = 1 + rand.nextInt(40);
		int z = chunkZ * 16 + rand.nextInt(16);
		gen.generate(world, rand, new BlockPos(x, y+1, z));
		}
	}

}
