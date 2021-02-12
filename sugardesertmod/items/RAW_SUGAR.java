package com.sugar.sugardesertmod.items;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.blacklab.lmr.api.item.IItemSpecialSugar;
import net.blacklab.lmr.entity.littlemaid.EntityLittleMaid;
import net.blacklab.lmr.entity.littlemaid.EntityLittleMaid.EnumConsumeSugar;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Optional.Interface;

@Interface(iface = "net.blacklab.lmr.api.item.IItemSpecialSugar", modid = "lmreengaged")
public class RAW_SUGAR extends Item implements IItemSpecialSugar{

	public RAW_SUGAR() {
		super();
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setRegistryName("raw_sugar");
		this.setUnlocalizedName("raw_sugar");

	}

	@Override
	public boolean onSugarEaten(EntityLittleMaid maid, EnumConsumeSugar purpose, ItemStack stack) {
		maid.heal(1.0F);
		return true;
	}

	@Override
	public boolean onSugarInteract(World world, EntityPlayer player, ItemStack stack, EntityLittleMaid maid) {
		return true;
	}

}
