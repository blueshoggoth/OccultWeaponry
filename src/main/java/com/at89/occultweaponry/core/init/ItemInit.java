package com.at89.occultweaponry.core.init;

import com.at89.occultweaponry.OccultWeaponry;
import com.at89.occultweaponry.common.material.CustomArmorMaterial;
import com.at89.occultweaponry.common.material.CustomToolMaterial;
import com.at89.occultweaponry.core.itemgroup.OccultWeaponryItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    
	//Registration
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            OccultWeaponry.MOD_ID);
    
    //Items
    
	//Mythral ingot
    
	public static final RegistryObject<Item> MYTHRAL_INGOT = ITEMS.register("mythral_ingot", 
    		()-> new Item(new Item.Properties().tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    //Mythral nugget
   
    public static final RegistryObject<Item> MYTHRAL_NUGGET = ITEMS.register("mythral_nugget", 
    		()-> new Item(new Item.Properties().tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    //tools stanno a riga 603 della classe Items
    
    //Tools
    
    public static final RegistryObject<Item> MYTHRAL_AXE = ITEMS.register("mythral_axe", 
    		() -> new AxeItem(CustomToolMaterial.MYTHRAL_TIER, 5.0F, -3.0F, 
    				(new Item.Properties()).tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    public static final RegistryObject<Item> MYTHRAL_HOE = ITEMS.register("mythral_hoe", 
    		() -> new HoeItem(CustomToolMaterial.MYTHRAL_TIER, -3, 0.0F, 
    				(new Item.Properties()).tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    public static final RegistryObject<Item> MYTHRAL_PICKAXE = ITEMS.register("mythral_pickaxe", 
    		() -> new PickaxeItem(CustomToolMaterial.MYTHRAL_TIER, 1, -2.8F, 
    				(new Item.Properties()).tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    public static final RegistryObject<Item> MYTHRAL_SHOVEL = ITEMS.register("mythral_shovel", 
    		() -> new ShovelItem(CustomToolMaterial.MYTHRAL_TIER, 1.5F, -3.0F, 
    				(new Item.Properties()).tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    public static final RegistryObject<Item> MYTHRAL_SWORD = ITEMS.register("mythral_sword", 
    		() -> new SwordItem(CustomToolMaterial.MYTHRAL_TIER, 3, -2.4F, 
    				(new Item.Properties()).tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    //public static final RegistryObject<Item> MYTHRAL_SHIELD = ;

    //Onyx
    
    public static final RegistryObject<Item> ONYX = ITEMS.register("onyx", 
    		()-> new Item(new Item.Properties().tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    // Mythral Armor
    
    public static final RegistryObject<Item> MYTHRAL_HELMET = ITEMS.register("mythral_helmet", 
    		() -> new ArmorItem(CustomArmorMaterial.MYTHRAL_ARMOR_TIER, EquipmentSlotType.HEAD, new Item.Properties().tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));

    public static final RegistryObject<Item> MYTHRAL_CHESTPLATE = ITEMS.register("mythral_chestplate", 
    		() -> new ArmorItem(CustomArmorMaterial.MYTHRAL_ARMOR_TIER, EquipmentSlotType.CHEST, new Item.Properties().tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));

    public static final RegistryObject<Item> MYTHRAL_LEGGINGS = ITEMS.register("mythral_leggings", 
    		() -> new ArmorItem(CustomArmorMaterial.MYTHRAL_ARMOR_TIER, EquipmentSlotType.LEGS, new Item.Properties().tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    public static final RegistryObject<Item> MYTHRAL_BOOTS = ITEMS.register("mythral_boots", 
    		() -> new ArmorItem(CustomArmorMaterial.MYTHRAL_ARMOR_TIER, EquipmentSlotType.FEET, new Item.Properties().tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    //Block items
    
    //Mythral Ore
    public static final RegistryObject<BlockItem> MYTHRAL_ORE = ITEMS.register("mythral_ore",
            () -> new BlockItem(BlockInit.MYTHRAL_ORE.get(), new Item.Properties().tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    //Mythral Block
    
    public static final RegistryObject<BlockItem> MYTHRAL_BLOCK = ITEMS.register("mythral_block",
            () -> new BlockItem(BlockInit.MYTHRAL_BLOCK.get(), new Item.Properties().tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    //Onyx Ore
    
    public static final RegistryObject<BlockItem> ONYX_ORE = ITEMS.register("onyx_ore",
            () -> new BlockItem(BlockInit.ONYX_ORE.get(), new Item.Properties().tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    //Onyx Block
    
    public static final RegistryObject<BlockItem> ONYX_BLOCK = ITEMS.register("onyx_block",
            () -> new BlockItem(BlockInit.ONYX_BLOCK.get(), new Item.Properties().tab(OccultWeaponryItemGroup.OCCULTWEAPONRY_TAB)));
    
    
}
