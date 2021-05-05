package com.at89.occultweaponry.common.blocks;

import java.util.Random;

import com.at89.occultweaponry.core.init.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class OccultOreBlock extends OreBlock{
	
	public OccultOreBlock(Properties propreties) {
		super(propreties);
	}
	
	protected int xpDrop(Random p_220281_1_) {
		
		if(this == BlockInit.ONYX_ORE.get()) {
			return MathHelper.nextInt(p_220281_1_, 2, 5);
		}else
			return 0;
		
	}
	
	@Override
	   public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
	      return silktouch == 0 ? this.xpDrop(RANDOM) : 0;
	   }
	
}
