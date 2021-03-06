package com.at89.occultweaponry.common.material;

import java.util.function.Supplier;
import com.at89.occultweaponry.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum OccultToolMaterial implements IItemTier{
	
	MYTHRAL(4, 4000, 15f, 2f, 17, () -> Ingredient.of(ItemInit.MYTHRAL_INGOT.get()));
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairMaterial;
	
	OccultToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
		 this.harvestLevel = harvestLevel;
		 this.maxUses = maxUses;
		 this.efficiency = efficiency;
		 this.attackDamage = attackDamage;
		 this.enchantability = enchantability;
		 this.repairMaterial = repairMaterial.get();
	}
	
	@Override
	public int getUses() {
		return this.maxUses;
	}
	@Override
	public float getSpeed() {
		return this.efficiency;
	}
	@Override
	public float getAttackDamageBonus() {
		return this.attackDamage;
	}
	@Override
	public int getLevel() {
		return this.harvestLevel;
	}
	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}
	@Override
	public Ingredient getRepairIngredient() {
		return this.repairMaterial;
	}

}
