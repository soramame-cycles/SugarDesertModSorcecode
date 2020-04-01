package com.sugar.sugardesertmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SugarDBlock {

	public static Block Bismuth_Ore;
	public static Block Bismuth_crystal_block;
	public static Block Sugar_block;
	public static Block Sugar_stone;
	public static Block Sugar_pillar;
	public static Block Sugar_log;
	public static Block Sugar_planks;
	public static Block Sugar_planks_slab;
	public static Block Sugar_slab;
	public static Block Sugar_torch;
	public static Block Sugar_candy;
	public static Block Sugar_fence;
	public static Block Sugar_diamond_ore;
	public static Block Sugar_diamond_block;
	public static Block Rotten_flesh_block;
	//public static Block Sugar_door;

	public static void Bismuth_Ore(RegistryEvent.Register<Item> event) {

		Bismuth_Ore = new BlockBismuthOre();

		event.getRegistry().register(new ItemBlock(Bismuth_Ore).setRegistryName("bismuth_ore"));
		ForgeRegistries.BLOCKS.register(Bismuth_Ore);
	}

	public static void Bismuth_OreModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Bismuth_Ore),0,
				new ModelResourceLocation("sugard:bismuth_ore"));
	}
	//区切り
	public static void Bismuth_crystal_block(RegistryEvent.Register<Item> event) {

		Bismuth_crystal_block = new BlockBismuthCrystalBlock();

		event.getRegistry().register(new ItemBlock(Bismuth_crystal_block).setRegistryName("bismuth_crystal_block"));
		ForgeRegistries.BLOCKS.register(Bismuth_crystal_block);
	}

	public static void Bismuth_crystal_blockModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Bismuth_crystal_block),0,
				new ModelResourceLocation("sugard:bismuth_crystal_block"));
	}
	//区切り
	public static void Suger_block(RegistryEvent.Register<Item> event) {

		Sugar_block = new SugarBlock();

		event.getRegistry().register(new ItemBlock(Sugar_block).setRegistryName("sugar_block"));
		ForgeRegistries.BLOCKS.register(Sugar_block);

	}

	public static void Sugar_blockModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_block), 0,
				new ModelResourceLocation("sugard:sugar_block"));

	}
	//区切り
	public static void Sugar_stone(RegistryEvent.Register<Item> event) {
		Sugar_stone = new SugarStone();

		event.getRegistry().register(new ItemBlock(Sugar_stone).setRegistryName("sugar_stone"));
		ForgeRegistries.BLOCKS.register(Sugar_stone);
	}

	public static void Sugar_stoneModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_stone), 0,
				new ModelResourceLocation("sugard:sugar_stone"));
	}
	//区切り
	public static void Sugar_pillar(RegistryEvent.Register<Item> event) {

		Sugar_pillar = new SugarPillar();

		event.getRegistry().register(new ItemBlock(Sugar_pillar).setRegistryName("sugar_pillar"));
		ForgeRegistries.BLOCKS.register(Sugar_pillar);
	}

	public static void Sugar_pillarModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_pillar), 0,
				new ModelResourceLocation("sugard:sugar_pillar"));
	}
	//区切り
	public static void Sugar_log(RegistryEvent.Register<Item> event) {

		Sugar_log = new SugarLog();

		event.getRegistry().register(new ItemBlock(Sugar_log).setRegistryName("sugar_log"));
		ForgeRegistries.BLOCKS.register(Sugar_log);
	}

	public static void Sugar_logModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_log), 0,
				new ModelResourceLocation("sugard:sugar_log"));
	}
	//区切り
	public static void Sugar_planks(RegistryEvent.Register<Item> event) {

		Sugar_planks = new SugarPlanks();

		event.getRegistry().register(new ItemBlock(Sugar_planks).setRegistryName("sugar_planks"));
		ForgeRegistries.BLOCKS.register(Sugar_planks);
	}

	public static void Sugar_planksModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_planks), 0,
				new ModelResourceLocation("sugard:sugar_planks"));
	}
	//区切り
	public static void Sugar_planks_slab(RegistryEvent.Register<Item> event) {

		Sugar_planks_slab = new SugarPlanks_slab();

		event.getRegistry().register(new ItemBlock(Sugar_planks_slab).setRegistryName("sugar_planks_slab"));
		ForgeRegistries.BLOCKS.register(Sugar_planks_slab);
	}

	public static void Sugar_planks_slabModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_planks_slab), 0,
				new ModelResourceLocation("sugard:sugar_planks_slab"));
	}
	//区切り
	public static void Sugar_slab(RegistryEvent.Register<Item> event) {

		Sugar_slab = new Sugar_slab();

		event.getRegistry().register(new ItemBlock(Sugar_slab).setRegistryName("sugar_slab"));
		ForgeRegistries.BLOCKS.register(Sugar_slab);
	}

	public static void Sugar_slabModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_slab), 0,
				new ModelResourceLocation("sugard:sugar_slab"));
	}
	//区切り
	public static void Sugar_torch(RegistryEvent.Register<Item> event) {

		Sugar_torch = new SugarTorch();

		event.getRegistry().register(new ItemBlock(Sugar_torch).setRegistryName("sugar_torch"));
		ForgeRegistries.BLOCKS.register(Sugar_torch);
	}

	public static void Sugar_torchModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_torch), 0,
				new ModelResourceLocation("sugard:sugar_torch"));
	}
	//区切り
	public static void Sugar_candy(RegistryEvent.Register<Item> event) {

		Sugar_candy = new SugarCandy();

		event.getRegistry().register(new ItemBlock(Sugar_candy).setRegistryName("sugar_candy"));
		ForgeRegistries.BLOCKS.register(Sugar_candy);
	}

	public static void Sugar_candyModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_candy), 0,
				new ModelResourceLocation("sugard:sugar_candy"));
	}
	//
	public static void Sugar_fence(RegistryEvent.Register<Item> event) {

		Sugar_fence = new SugarFence();

		event.getRegistry().register(new ItemBlock(Sugar_fence).setRegistryName("sugar_fence"));
		ForgeRegistries.BLOCKS.register(Sugar_fence);
	}

	public static void Sugar_fenceModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_fence), 0,
				new ModelResourceLocation("sugard:sugar_fence"));
	}
	//
	public static void Sugar_diamond_ore(RegistryEvent.Register<Item> event) {

		Sugar_diamond_ore = new SugarDiamondOre();

		event.getRegistry().register(new ItemBlock(Sugar_diamond_ore).setRegistryName("sugar_diamond_ore"));
		ForgeRegistries.BLOCKS.register(Sugar_diamond_ore);
	}

	public static void Sugar_diamond_oreModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_diamond_ore), 0,
				new ModelResourceLocation("sugard:sugar_diamond_ore"));
	}
	//
	public static void Sugar_diamond_block(RegistryEvent.Register<Item> event) {

		Sugar_diamond_block = new SugarDiamondBlock();

		event.getRegistry().register(new ItemBlock(Sugar_diamond_block).setRegistryName("sugar_diamond_block"));
		ForgeRegistries.BLOCKS.register(Sugar_diamond_block);
	}

	public static void Sugar_diamond_blockModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_diamond_block), 0,
				new ModelResourceLocation("sugard:sugar_diamond_block"));
	}
	//
	public static void Rotten_flesh_block(RegistryEvent.Register<Item> event) {

		Rotten_flesh_block = new RottenFleshBlock();

		event.getRegistry().register(new ItemBlock(Rotten_flesh_block).setRegistryName("rotten_flesh_block"));
		ForgeRegistries.BLOCKS.register(Rotten_flesh_block);
	}

	public static void Rotten_flesh_blockModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Rotten_flesh_block), 0,
				new ModelResourceLocation("sugard:rotten_flesh_block"));
	}
}
