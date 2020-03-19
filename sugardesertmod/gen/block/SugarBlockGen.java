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

public class SugarBlockGen implements IWorldGenerator {

	private WorldGenerator sugar_block;

	public SugarBlockGen() {
		sugar_block = new WorldGenMinable(SugarDBlock.Sugar_block.getDefaultState(),9);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {

		case 0://overworld
			runGenerator(sugar_block,world,random,chunkX,chunkZ,20,Blocks.DIRT);
			break;

		case 1://end
			break;

		case -1://nether
			break;
		}
		// TODO 自動生成されたメソッド・スタブ

	}
	private void runGenerator(WorldGenerator gen,World world,Random rand,int chunkX,int chunkZ,int chance,Block taget) {;
		for (int i=0; i<10; i++) {
			int x = chunkX * 16 + 8 + rand.nextInt(16);
			int y = rand.nextInt(120) + 10;
			int z = chunkZ * 16 +8 + rand.nextInt(16);
			gen.generate(world, rand, new BlockPos(x, y+1, z));

		}
	}
}
