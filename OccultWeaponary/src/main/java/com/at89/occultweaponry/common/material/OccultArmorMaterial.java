package com.at89.occultweaponry.common.material;

import java.util.function.Supplier;

import com.at89.occultweaponry.core.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum OccultArmorMaterial implements IArmorMaterial{
	
	MYTHRAL("mythral", 10, new int[] {4, 7, 9, 4}, 17, SoundEvents.ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.of(ItemInit.MYTHRAL_INGOT.get()));
	
	
	private static final int[] baseDurability = { 128, 144, 160, 112};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorVal;
	private final int enchentability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knokbackResistance;
	private Ingredient repairIngredient;
	
	OccultArmorMaterial(String name, int durabilityMultiplier, int[] armorVal, int enchentability, SoundEvent equipSound, float toughness, float knokbackResistance, Supplier<Ingredient> repairIngredient){
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorVal = armorVal;
		this.enchentability = enchentability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knokbackResistance = knokbackResistance;
		this.repairIngredient = repairIngredient.get();
	}
	
	@Override
	public int getDurabilityForSlot(EquipmentSlotType slot) {
		return baseDurability[slot.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType slot) {
		return this.armorVal[slot.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchentability;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knokbackResistance;
	}

}
