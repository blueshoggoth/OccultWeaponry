package com.at89.occultweaponry.core.init;

import com.at89.occultweaponry.OccultWeaponry;
import com.at89.occultweaponry.common.blocks.OccultOreBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            OccultWeaponry.MOD_ID);
	
	//Mythral ore
	//public static final RegistryObject<Block> MYTHRAL_ORE = BLOCKS.register("mythral_ore", 
			//()-> new Block(AbstractBlock.Properties.copy(Blocks.GOLD_ORE)));
	public static final RegistryObject<Block> MYTHRAL_ORE = BLOCKS.register("mythral_ore", 
			()-> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
					.strength(15f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(3)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE)
					.lightLevel((p_235468_0_) -> {return 8;})));
	
	//Onyx Ore
	public static final RegistryObject<OccultOreBlock> ONYX_ORE = BLOCKS.register("onyx_ore", 
			()-> new OccultOreBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
					.strength(8f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(2)
					.requiresCorrectToolForDrops()
					.sound(SoundType.NETHER_ORE)));
	
	//Mythral block
	public static final RegistryObject<Block> MYTHRAL_BLOCK = BLOCKS.register("mythral_block", 
			()-> new Block(AbstractBlock.Properties.copy(Blocks.GOLD_BLOCK)
					.lightLevel((p_235468_0_) -> {return 15;})));
	
	//Onyx Block
	public static final RegistryObject<Block> ONYX_BLOCK = BLOCKS.register("onyx_block", 
			()-> new Block(AbstractBlock.Properties.copy(Blocks.QUARTZ_BLOCK)));
}
