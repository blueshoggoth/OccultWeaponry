package com.at89.occultweaponry.core.itemgroup;

import com.at89.occultweaponry.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class OccultWeaponryItemGroup extends ItemGroup{
	
	public static final OccultWeaponryItemGroup OCCULTWEAPONRY_TAB = new OccultWeaponryItemGroup(12, "occultweaponry_tab");
	
	public OccultWeaponryItemGroup(int p_i1853_1_, String p_i1853_2_) {
		super(p_i1853_1_, p_i1853_2_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack makeIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ItemInit.MYTHRAL_BLOCK.get());
	}

}
