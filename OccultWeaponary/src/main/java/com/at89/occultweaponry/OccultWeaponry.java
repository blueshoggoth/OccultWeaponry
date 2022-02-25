package com.at89.occultweaponry;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.at89.occultweaponry.core.init.ItemInit;
import com.at89.occultweaponry.world.OreGeneration;
import com.at89.occultweaponry.core.init.BlockInit;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(OccultWeaponry.MOD_ID)
public class OccultWeaponry
{
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "occultweaponry";
	
    public OccultWeaponry() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
        MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }
}
