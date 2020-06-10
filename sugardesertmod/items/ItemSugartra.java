package com.sugar.sugardesertmod.items;

import javax.annotation.Nullable;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemElytra;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSugartra extends ItemElytra{

	public ItemSugartra() {
		this.maxStackSize = 1;
		this.setMaxDamage(30);
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.addPropertyOverride(new ResourceLocation("broken"), new IItemPropertyGetter() {
			@SideOnly(Side.CLIENT)
			public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
				return ItemSugartra.isUsable(stack) ? 0.0F : 1.0F;
			}
		});
	}

	//現在時点で追加予定なし

	public static boolean isUsable(ItemStack stack) {
		return stack.getItemDamage() < stack.getMaxDamage() - 1;
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == SugarDesertMod.Sugar_diamond;
	}

}
