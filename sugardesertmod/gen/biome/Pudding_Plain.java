package com.sugar.sugardesertmod.gen.biome;

import java.util.Random;

import com.sugar.sugardesertmod.init.block.SugarDBlock;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

public class Pudding_Plain extends Biome{

	public Pudding_Plain() {
		super(new BiomeProperties("pudding_plain")
				.setTemperature(0.05F)
				.setBaseHeight(0.075F)
				.setHeightVariation(0.05F)
				.setRainfall(0.3F)
				.setWaterColor(8388608));
		this.setRegistryName("pudding_plain");
		this.setSpawnables();
		this.getEnableSnow();
		this.decorator.treesPerChunk = 5;
		this.decorator.generateFalls = false;

	}

	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn,int x, int z, double noiseVal) {
		this.topBlock = SugarDBlock.Caramel_sauce.getDefaultState();
		this.fillerBlock = SugarDBlock.Pudding_block.getDefaultState();
		this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
		IBlockState iblockstate1 = SugarDBlock.Pudding_block.getDefaultState();
		for (int j1 = 255; j1 >= 0; --j1) {
		int j = -1;
		int k = (int)(noiseVal / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
		if (j == 0 && iblockstate1.getBlock() == SugarDBlock.Pudding_block && k > 1){
			j = rand.nextInt(4) + Math.max(0, j1 - 63);
			}
		}
	}

	private void setSpawnables() {
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCaveCreatureList.clear();

		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityCow.class, 1, 1, 2));
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityChicken.class,1, 1, 2));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySlime.class,1,1,2));
	}

	@Override
	public float getSpawningChance() {
		return 0.15F;
	}
}
