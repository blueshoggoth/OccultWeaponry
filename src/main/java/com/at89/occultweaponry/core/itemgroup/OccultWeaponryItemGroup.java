package com.at89.occultweaponry.core.itemgroup;

import com.at89.occultweaponry.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class OccultWeaponryItemGroup extends ItemGroup{

    public static final OccultWeaponryItemGroup OCCULTWEAPONRY_TAB = new OccultWeaponryItemGroup(ItemGroup.TABS.length, "occultweaponry_tab");

    public OccultWeaponryItemGroup(int p_i18531, String p_i18532) {
        super(p_i18531, p_i18532);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.MYTHRAL_BLOCK.get());
    }

}