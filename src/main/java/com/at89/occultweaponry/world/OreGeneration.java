package com.at89.occultweaponry.world;


import com.at89.occultweaponry.core.init.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {
	public static void generateOres(final BiomeLoadingEvent event) {
		
		//Mythral generation
		if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))
				&& event.getCategory().equals(Biome.Category.EXTREME_HILLS)) {
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
					BlockInit.MYTHRAL_ORE.get().defaultBlockState(), 8, 24, 46, 18);
		}
		
		//Onyx genration
		if(event.getCategory().equals(Biome.Category.NETHER)){
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK,
					BlockInit.ONYX_ORE.get().defaultBlockState(), 12, 8, 124, 18);
		}
	}

	private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state,
			int veinSize, int minHeight, int maxHeight, int amount) {
		settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize))
						.decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
						.squared().count(amount));
	}
}
