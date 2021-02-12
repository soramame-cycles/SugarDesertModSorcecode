package com.sugar.sugardesertmod.items;

import java.util.List;

import javax.annotation.Nullable;

import com.sugar.sugardesertmod.SugarDesertMod;

import net.blacklab.lmr.api.item.IItemSpecialSugar;
import net.blacklab.lmr.entity.littlemaid.EntityLittleMaid;
import net.blacklab.lmr.entity.littlemaid.EntityLittleMaid.EnumConsumeSugar;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Optional.Interface;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SuppressWarnings("deprecation")
@Interface(iface = "net.blacklab.lmr.api.item.IItemSpecialSugar", modid = "lmreengaged")
public class AZUKI_PASTE extends ItemFood implements IItemSpecialSugar{

	public AZUKI_PASTE() {
		super(4, 0.3F, true);
		this.setCreativeTab(SugarDesertMod.Tab_sugard);
		this.setUnlocalizedName("azuki_paste");
		this.setRegistryName("azuki_paste");
	}

	public AZUKI_PASTE(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn){
		if(Loader.isModLoaded("lmreengaged")) {
			tooltip.add(I18n.translateToLocal("tooltip.can_eat_wolf_and_maid"));
		}
		else {
			tooltip.add(I18n.translateToLocal("tooltip.can_eat_wolf"));
		}
	}

	@Override
	public boolean onSugarEaten(EntityLittleMaid maid, EnumConsumeSugar purpose, ItemStack stack) {
		maid.heal(1.5F);
		return true;
	}

	@Override
	public boolean onSugarInteract(World world, EntityPlayer player, ItemStack stack, EntityLittleMaid maid) {
		return true;
	}

}
