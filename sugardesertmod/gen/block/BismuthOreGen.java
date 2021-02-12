package com.sugar.sugardesertmod.gen.block;

import java.util.Random;

import com.sugar.sugardesertmod.config.SugarD_Config;
import com.sugar.sugardesertmod.init.block.SugarDBlock;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class BismuthOreGen implements IWorldGenerator {

	private WorldGenerator bismuth_ore;

	public BismuthOreGen() {
		bismuth_ore = new WorldGenMinable(SugarDBlock.Bismuth_Ore.getDefaultState(),9,BlockMatcher.forBlock(Blocks.STONE));

	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {

		case 0: //overworld
			if(SugarD_Config.generate.genBismuth == true) {
			runGenerator(bismuth_ore,world, random, chunkX, chunkZ,20);
			}
			break;

		case 1: //end
			break;

		case -1: //nether
			break;


		}
	}

	private void runGenerator(WorldGenerator gen,World world, Random rand,int chunkX,int chunkZ,int chance) {
	//ランジェネレータの構文のいい加減な覚え方
	//(生成マン,世界に,ランダムに,チャンクのX軸,チャンクのZ軸,生成チャンス,どのブロックと置き換えるか)

		for (int i = 0; i < 10; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = 1 + rand.nextInt(24);
			int z = chunkZ * 16 + rand.nextInt(16);
			gen.generate(world, rand, new BlockPos(x, y+1, z));
		}
	}
}
