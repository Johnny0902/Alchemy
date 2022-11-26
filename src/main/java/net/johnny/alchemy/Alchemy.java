package net.johnny.alchemy;

import net.fabricmc.api.ModInitializer;
import net.johnny.alchemy.block.ModBlocks;
import net.johnny.alchemy.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//important comment: 912219ss
public class Alchemy implements ModInitializer {
	public static final String MOD_ID = "alchemy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}
