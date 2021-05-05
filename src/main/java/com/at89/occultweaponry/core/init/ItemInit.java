package com.at89.occultweaponry.core.init;

import com.at89.occultweaponry.OccultWeaponry;

import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            OccultWeaponry.MOD_ID);
    
    //Items
    //Mythral ingot
    public static final RegistryObject<Item> MYTHRAL_INGOT = ITEMS.register("mythral_ingot", 
    		()-> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
    //Mythral nugget
    public static final RegistryObject<Item> MYTHRAL_NUGGET = ITEMS.register("mythral_nugget", 
    		()-> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
    
    //Onyx
    public static final RegistryObject<Item> ONYX = ITEMS.register("onyx", 
    		()-> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
    //tools
    
    //tools stanno a riga 603 della classe Items
    public static final RegistryObject<Item> MYTHRAL_AXE = ITEMS.register("mythral_axe", 
    		() -> new AxeItem(ItemTier.DIAMOND, 5.0F, -3.0F, 
    				(new Item.Properties()).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> MYTHRAL_HOE = ITEMS.register("mythral_hoe", 
    		() -> new HoeItem(ItemTier.DIAMOND, -3, 0.0F, 
    				(new Item.Properties()).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> MYTHRAL_PICKAXE = ITEMS.register("mythral_pickaxe", 
    		() -> new PickaxeItem(ItemTier.DIAMOND, 1, -2.8F, 
    				(new Item.Properties()).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> MYTHRAL_SHOVEL = ITEMS.register("mythral_shovel", 
    		() -> new ShovelItem(ItemTier.DIAMOND, 1.5F, -3.0F, 
    				(new Item.Properties()).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> MYTHRAL_SWORD = ITEMS.register("mythral_sword", 
    		() -> new SwordItem(ItemTier.DIAMOND, 3, -2.4F, 
    				(new Item.Properties()).tab(ItemGroup.TAB_MISC)));
    
    //Block items
    //Mythral Ore
    public static final RegistryObject<BlockItem> MYTHRAL_ORE = ITEMS.register("mythral_ore",
            () -> new BlockItem(BlockInit.MYTHRAL_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MISC)));
    //Mythral Block
    public static final RegistryObject<BlockItem> MYTHRAL_BLOCK = ITEMS.register("mythral_block",
            () -> new BlockItem(BlockInit.MYTHRAL_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MISC)));
    
    //Onyx Ore
    public static final RegistryObject<BlockItem> ONYX_ORE = ITEMS.register("onyx_ore",
            () -> new BlockItem(BlockInit.ONYX_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MISC)));
    
    //Onyx Block
    public static final RegistryObject<BlockItem> ONYX_BLOCK = ITEMS.register("onyx_block",
            () -> new BlockItem(BlockInit.ONYX_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MISC)));


}
