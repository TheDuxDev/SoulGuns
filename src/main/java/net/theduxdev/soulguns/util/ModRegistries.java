package net.theduxdev.soulguns.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.theduxdev.soulguns.SoulGuns;
import net.theduxdev.soulguns.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs (){
        registerFuels();
    }


    private  static  void registerFuels(){
        SoulGuns.LOGGER.info("Registers fuels for" + SoulGuns.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItems.PLASMA_FUEL,20000);
    }
}
