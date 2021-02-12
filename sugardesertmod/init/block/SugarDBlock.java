package com.sugar.sugardesertmod.init.block;

import com.sugar.sugardesertmod.blocks.BlockBismuthCrystalBlock;
import com.sugar.sugardesertmod.blocks.BlockBismuthOre;
import com.sugar.sugardesertmod.blocks.CaramelSauce;
import com.sugar.sugardesertmod.blocks.CookieBlock;
import com.sugar.sugardesertmod.blocks.EndSugarStone;
import com.sugar.sugardesertmod.blocks.MoistSugarBlock;
import com.sugar.sugardesertmod.blocks.PuddingBlock;
import com.sugar.sugardesertmod.blocks.RawSugarBlock;
import com.sugar.sugardesertmod.blocks.RottenFleshBlock;
import com.sugar.sugardesertmod.blocks.SugarBlock;
import com.sugar.sugardesertmod.blocks.SugarCandy;
import com.sugar.sugardesertmod.blocks.SugarCobblestone;
import com.sugar.sugardesertmod.blocks.SugarDiamondBlock;
import com.sugar.sugardesertmod.blocks.SugarDiamondOre;
import com.sugar.sugardesertmod.blocks.SugarFence;
import com.sugar.sugardesertmod.blocks.SugarLeaves;
import com.sugar.sugardesertmod.blocks.SugarLog;
import com.sugar.sugardesertmod.blocks.SugarPane;
import com.sugar.sugardesertmod.blocks.SugarPillar;
import com.sugar.sugardesertmod.blocks.SugarPlanks;
import com.sugar.sugardesertmod.blocks.SugarPlanksButton;
import com.sugar.sugardesertmod.blocks.SugarPlanksStairs;
import com.sugar.sugardesertmod.blocks.SugarPlanks_slab;
import com.sugar.sugardesertmod.blocks.SugarSapling;
import com.sugar.sugardesertmod.blocks.SugarStone;
import com.sugar.sugardesertmod.blocks.SugarStoneButton;
import com.sugar.sugardesertmod.blocks.SugarStoneStairs;
import com.sugar.sugardesertmod.blocks.SugarStoneWall;
import com.sugar.sugardesertmod.blocks.SugarTorch;
import com.sugar.sugardesertmod.blocks.SugarTrapDoor;
import com.sugar.sugardesertmod.blocks.Sugar_slab;
import com.sugar.sugardesertmod.blocks.Sugarbricks;
import com.sugar.sugardesertmod.blocks.Sugarbricksslab;
import com.sugar.sugardesertmod.blocks.Sugarbricksstairs;
import com.sugar.sugardesertmod.blocks.Sugarcobslab;
import com.sugar.sugardesertmod.blocks.Sugarcobstairs;
import com.sugar.sugardesertmod.blocks.Sugarrack;

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
	public static Block Sugar_cobblestone;
	public static Block Sugarrack;
	public static Block End_sugar_stone;
	public static Block Sugar_stone_stairs;
	public static Block Sugar_planks_stairs;
	public static Block Sugar_stone_wall;
	public static Block Sugar_leaves;
	public static Block Sugar_sapling;
	public static Block Sugar_trapdoor;
	public static Block Sugar_bricks;
	public static Block Sugar_pane;
	public static Block Caramel_sauce;
	public static Block Pudding_block;
	public static Block Sugar_bricks_slab;
	public static Block Sugar_bricks_stairs;
	public static Block Sugar_cob_slab;
	public static Block Sugar_cob_stairs;
	public static Block Sugar_planks_button;
	public static Block Sugar_stone_button;
	public static Block Cookie_block;
	public static Block Raw_sugar_block;
	public static Block Moist_sugar_block;

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
	/**CHANGED 1.4 change blockclass blockLog*/
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
	/**1.4*/
	public static void Sugar_cobblestone(RegistryEvent.Register<Item> event) {

		Sugar_cobblestone = new SugarCobblestone();

		event.getRegistry().register(new ItemBlock(Sugar_cobblestone).setRegistryName("sugar_cobblestone"));
		ForgeRegistries.BLOCKS.register(Sugar_cobblestone);
	}

	public static void Sugar_cobblestoneModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_cobblestone), 0,
				new ModelResourceLocation("sugard:sugar_cobblestone"));
	}
	//
	public static void Sugarrack(RegistryEvent.Register<Item> event) {

		Sugarrack = new Sugarrack();

		event.getRegistry().register(new ItemBlock(Sugarrack).setRegistryName("sugarrack"));
		ForgeRegistries.BLOCKS.register(Sugarrack);
	}

	public static void SugarrackModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugarrack), 0,
				new ModelResourceLocation("sugard:sugarrack"));
	}
	//
	public static void End_sugar_stone(RegistryEvent.Register<Item> event) {

		End_sugar_stone = new EndSugarStone();

		event.getRegistry().register(new ItemBlock(End_sugar_stone).setRegistryName("end_sugar_stone"));
		ForgeRegistries.BLOCKS.register(End_sugar_stone);
	}

	public static void End_sugar_stoneModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(End_sugar_stone), 0,
				new ModelResourceLocation("sugard:end_sugar_stone"));
	}
	//
	public static void Sugar_stone_stairs(RegistryEvent.Register<Item> event) {

		Sugar_stone_stairs = new SugarStoneStairs();

		event.getRegistry().register(new ItemBlock(Sugar_stone_stairs).setRegistryName("sugar_stone_stairs"));
		ForgeRegistries.BLOCKS.register(Sugar_stone_stairs);
	}

	public static void Sugar_stone_stairsModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_stone_stairs), 0,
				new ModelResourceLocation("sugard:sugar_stone_stairs"));
	}
	//
	public static void Sugar_planks_stairs(RegistryEvent.Register<Item> event) {

		Sugar_planks_stairs = new SugarPlanksStairs();

		event.getRegistry().register(new ItemBlock(Sugar_planks_stairs).setRegistryName("sugar_planks_stairs"));
		ForgeRegistries.BLOCKS.register(Sugar_planks_stairs);
	}

	public static void Sugar_planks_stairsModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_planks_stairs), 0,
				new ModelResourceLocation("sugard:sugar_planks_stairs"));
	}
	//FIXME おそらくアイテムとブロック両方ともあるって状況っぽい？ガバやんけ
	public static void Sugar_stone_wall(RegistryEvent.Register<Item> event) {

		Sugar_stone_wall = new SugarStoneWall();

		event.getRegistry().register(new ItemBlock(Sugar_stone_wall).setRegistryName("sugar_stone_wall"));
		ForgeRegistries.BLOCKS.register(Sugar_stone_wall);
	}

	public static void Sugar_stone_wallModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_stone_wall), 0,
				new ModelResourceLocation("sugard:sugar_stone_wall"));
	}
	//
	public static void Sugar_leaves(RegistryEvent.Register<Item> event) {

		Sugar_leaves = new SugarLeaves();

		event.getRegistry().register(new ItemBlock(Sugar_leaves).setRegistryName("sugar_leaves"));
		ForgeRegistries.BLOCKS.register(Sugar_leaves);
	}

	public static void Sugar_leavesModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_leaves), 0,
				new ModelResourceLocation("sugard:sugar_leaves"));
	}
	//
	public static void Sugar_sapling(RegistryEvent.Register<Item> event) {

		Sugar_sapling = new SugarSapling();

		event.getRegistry().register(new ItemBlock(Sugar_sapling).setRegistryName("sugar_sapling"));
		ForgeRegistries.BLOCKS.register(Sugar_sapling);
	}

	public static void Sugar_saplingModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_sapling), 0,
				new ModelResourceLocation("sugard:sugar_sapling"));
	}
	/**1.5*/
	public static void Sugar_trapdoor(RegistryEvent.Register<Item> event) {

		Sugar_trapdoor = new SugarTrapDoor();

		event.getRegistry().register(new ItemBlock(Sugar_trapdoor).setRegistryName("sugar_trapdoor"));
		ForgeRegistries.BLOCKS.register(Sugar_trapdoor);
	}

	public static void Sugar_trapdoorModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_trapdoor), 0,
				new ModelResourceLocation("sugard:sugar_trapdoor"));
	}
	//
	public static void Sugar_bricks(RegistryEvent.Register<Item> event) {

		Sugar_bricks = new Sugarbricks();

		event.getRegistry().register(new ItemBlock(Sugar_bricks).setRegistryName("sugar_bricks"));
		ForgeRegistries.BLOCKS.register(Sugar_bricks);
	}

	public static void Sugar_bricksModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_bricks), 0,
				new ModelResourceLocation("sugard:sugar_bricks"));
	}
	//
	public static void Sugar_pane(RegistryEvent.Register<Item> event) {

		Sugar_pane = new SugarPane();

		event.getRegistry().register(new ItemBlock(Sugar_pane).setRegistryName("sugar_pane"));
		ForgeRegistries.BLOCKS.register(Sugar_pane);
	}

	public static void Sugar_paneModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_pane), 0,
				new ModelResourceLocation("sugard:sugar_pane"));
	}
	//
	public static void Caramel_sauce(RegistryEvent.Register<Item> event) {

		Caramel_sauce = new CaramelSauce();

		event.getRegistry().register(new ItemBlock(Caramel_sauce).setRegistryName("caramel_sauce"));
		ForgeRegistries.BLOCKS.register(Caramel_sauce);
	}

	public static void Caramel_sauceModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Caramel_sauce), 0,
				new ModelResourceLocation("sugard:caramel_sauce"));
	}
	//
	public static void Pudding_block(RegistryEvent.Register<Item> event) {

		Pudding_block = new PuddingBlock();

		event.getRegistry().register(new ItemBlock(Pudding_block).setRegistryName("pudding_block"));
		ForgeRegistries.BLOCKS.register(Pudding_block);
	}

	public static void Pudding_blockModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Pudding_block), 0,
				new ModelResourceLocation("sugard:pudding_block"));
	}
	//
	public static void Sugar_bricks_slab(RegistryEvent.Register<Item> event) {

		Sugar_bricks_slab = new Sugarbricksslab();

		event.getRegistry().register(new ItemBlock(Sugar_bricks_slab).setRegistryName("sugar_bricks_slab"));
		ForgeRegistries.BLOCKS.register(Sugar_bricks_slab);
	}

	public static void Sugar_bricks_slabModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_bricks_slab), 0,
				new ModelResourceLocation("sugard:sugar_bricks_slab"));
	}
	//
	public static void Sugar_bricks_stairs(RegistryEvent.Register<Item> event) {

		Sugar_bricks_stairs = new Sugarbricksstairs();

		event.getRegistry().register(new ItemBlock(Sugar_bricks_stairs).setRegistryName("sugar_bricks_stairs"));
		ForgeRegistries.BLOCKS.register(Sugar_bricks_stairs);
	}

	public static void Sugar_bricks_stairsModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_bricks_stairs), 0,
				new ModelResourceLocation("sugard:sugar_bricks_stairs"));
	}
	//
	public static void Sugar_cob_slab(RegistryEvent.Register<Item> event) {

		Sugar_cob_slab = new Sugarcobslab();

		event.getRegistry().register(new ItemBlock(Sugar_cob_slab).setRegistryName("sugar_cob_slab"));
		ForgeRegistries.BLOCKS.register(Sugar_cob_slab);
	}

	public static void Sugar_cob_slabModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_cob_slab), 0,
				new ModelResourceLocation("sugard:sugar_cob_slab"));
	}
	//
	public static void Sugar_cob_stairs(RegistryEvent.Register<Item> event) {

		Sugar_cob_stairs = new Sugarcobstairs();

		event.getRegistry().register(new ItemBlock(Sugar_cob_stairs).setRegistryName("sugar_cob_stairs"));
		ForgeRegistries.BLOCKS.register(Sugar_cob_stairs);
	}

	public static void Sugar_cob_stairsModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_cob_stairs), 0,
				new ModelResourceLocation("sugard:sugar_cob_stairs"));
	}


	/**1.6*/
	public static void Sugar_planks_button(RegistryEvent.Register<Item> event) {

		Sugar_planks_button = new SugarPlanksButton();

		event.getRegistry().register(new ItemBlock(Sugar_planks_button).setRegistryName("sugar_planks_button"));
		ForgeRegistries.BLOCKS.register(Sugar_planks_button);
	}

	public static void Sugar_planks_buttonModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_planks_button), 0,
				new ModelResourceLocation("sugard:sugar_planks_button"));
	}
	//
	public static void Sugar_stone_button(RegistryEvent.Register<Item> event) {

		Sugar_stone_button = new SugarStoneButton();

		event.getRegistry().register(new ItemBlock(Sugar_stone_button).setRegistryName("sugar_stone_button"));
		ForgeRegistries.BLOCKS.register(Sugar_stone_button);
	}

	public static void Sugar_stone_buttonModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Sugar_stone_button), 0,
				new ModelResourceLocation("sugard:sugar_stone_button"));
	}
	/**1.7*/
	public static void Cookie_block(RegistryEvent.Register<Item> event) {

		Cookie_block = new CookieBlock();

		event.getRegistry().register(new ItemBlock(Cookie_block).setRegistryName("cookie_block"));
		ForgeRegistries.BLOCKS.register(Cookie_block);
	}
	public static void Cookie_blockModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Cookie_block), 0,
				new ModelResourceLocation("sugard:cookie_block"));
	}
	//
	public static void Raw_sugar_block(RegistryEvent.Register<Item> event) {

		Raw_sugar_block = new RawSugarBlock();

		event.getRegistry().register(new ItemBlock(Raw_sugar_block).setRegistryName("raw_sugar_block"));
		ForgeRegistries.BLOCKS.register(Raw_sugar_block);
	}
	public static void Raw_sugar_blockModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Raw_sugar_block), 0,
				new ModelResourceLocation("sugard:raw_sugar_block"));
	}
	//
	public static void Moist_sugar_block(RegistryEvent.Register<Item> event) {

		Moist_sugar_block = new MoistSugarBlock();

		event.getRegistry().register(new ItemBlock(Moist_sugar_block).setRegistryName("moist_sugar_block"));
		ForgeRegistries.BLOCKS.register(Moist_sugar_block);
	}
	public static void Moist_sugaar_blockModel(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Moist_sugar_block), 0,
				new ModelResourceLocation("sugard:moist_sugar_block"));
	}
	/*
	public static void Sugar_crystal(RegistryEvent.Register<Item> event) {

		Sugar_crystal = new SugarCrystal();

		event.getRegistry().register(new ItemBlock(Sugar_crystal).setRegistryName("sugar_crystal"));
		ForgeRegistries.BLOCKS.register(Sugar_crystal);
	}

	public static void Sugar_crystalModel(ModelRegistryEvent event) {

		ModelLoader.setCustomModelResourceLocation(ItemBlock.getItemFromBlock(Sugar_crystal), 0,
				new ModelResourceLocation("sugard:sugar_crystal"));
	}
	*/
}
