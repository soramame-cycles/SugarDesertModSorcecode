package com.sugar.sugardesertmod.gen.biome;

import java.util.Random;

import com.sugar.sugardesertmod.gen.feature.WorldGenSugarTree;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class Sugar_Forest extends Biome {

	protected static final WorldGenSugarTree Sugartree = new WorldGenSugarTree(false);

	public Sugar_Forest() {
		super(new BiomeProperties("sugar_forest")
				.setTemperature(0.05F)
				.setBaseHeight(0.2F)
				.setHeightVariation(0.2F)
				.setRainfall(0.8F)
				.setSnowEnabled());
		this.setRegistryName("sugar_forest");
		this.getEnableSnow();
		this.decorator.treesPerChunk = 10;
	}

	@Override
	public float getSpawningChance() {
		return 0.15F;
	}

	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
		return Sugartree;
	}
}
