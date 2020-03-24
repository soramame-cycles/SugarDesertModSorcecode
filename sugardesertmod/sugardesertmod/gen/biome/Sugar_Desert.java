package com.sugar.sugardesertmod.gen.biome;

import java.util.Random;

import com.sugar.sugardesertmod.blocks.SugarDBlock;

import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

public class Sugar_Desert extends Biome{

	public Sugar_Desert() {

		super(new BiomeProperties("sugar_desert")
				.setTemperature(0.25F)
				.setBaseHeight(0.05F)
				.setHeightVariation(0.05F));
		this.setRegistryName("sugar_desert");
		this.setSpawnables();
		this.decorator.treesPerChunk = -999;
		this.decorator.generateFalls = false;
	}
@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn,
			int x, int z, double noiseVal) {
		this.topBlock = SugarDBlock.Sugar_block.getDefaultState();
		this.fillerBlock = SugarDBlock.Sugar_stone.getDefaultState();
		this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	}

	private void setSpawnables() {
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCaveCreatureList.clear();

		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityCow.class, 8, 2, 4));
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityChicken.class, 8, 2, 4));
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));

		spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySkeleton.class, 100, 4, 4));

	}

@Override
	public float getSpawningChance()
	{
		return 0.15F;
	}

}
