package com.sugar.sugardesertmod.gen.biome;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBiome {

	public static Biome Suger_Desert = new Sugar_Desert();
	public static Biome PuddingPlain = new Pudding_Plain();

	public static void registerBiomes(IForgeRegistry<Biome> registry) {
		registry.register(Suger_Desert);
		registry.register(PuddingPlain);
	}

	public static void registerBiomeTypes() {
		//Sugar_Desert
		BiomeManager.addBiome(BiomeType.DESERT,new BiomeEntry(Suger_Desert, 8));
		BiomeManager.addSpawnBiome(Suger_Desert);
		BiomeManager.addStrongholdBiome(Suger_Desert);
		BiomeDictionary.addTypes(Suger_Desert,Type.HOT);
		ForgeRegistries.BIOMES.register(Suger_Desert);

		//Pudding_Plain
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(PuddingPlain, 9));
		BiomeManager.addSpawnBiome(PuddingPlain);
		BiomeManager.addStrongholdBiome(PuddingPlain);
		BiomeDictionary.addTypes(PuddingPlain, Type.PLAINS);
		ForgeRegistries.BIOMES.register(PuddingPlain);
	}
}
