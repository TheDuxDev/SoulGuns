package net.theduxdev.soulguns;

import net.fabricmc.api.ModInitializer;
import net.theduxdev.soulguns.block.ModBlocks;
import net.theduxdev.soulguns.item.ModItems;
import net.theduxdev.soulguns.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoulGuns implements ModInitializer {
	public  static  final String MOD_ID = "soulguns";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();

		LOGGER.info("Hello Fabric world!");
	}
}
