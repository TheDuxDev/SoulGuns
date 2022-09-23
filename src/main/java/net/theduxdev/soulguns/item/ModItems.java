package net.theduxdev.soulguns.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.theduxdev.soulguns.SoulGuns;


public class ModItems {
    public static final Item NEZERTHRAN_INGOT = registerItem("nezerthran_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.NEZERTHRAN)));

    public static final Item NEZERTHRAN_NUGGET= registerItem("nezerthran_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.NEZERTHRAN)));

    public static final Item NEZERTHRAN_ENHANCEMENT_STONE= registerItem("nezerthran_enhancement_stone",
            new Item(new FabricItemSettings().group(ModItemGroup.NEZERTHRAN)));

    public static final Item RAW_NEZERTHRAN= registerItem("raw_nezerthran",
            new Item(new FabricItemSettings().group(ModItemGroup.NEZERTHRAN)));

    public static final Item NEZERTHRAN_SWORD= registerItem("nezerthran_sword",
            new SwordItem(ModToolMaterials.NEZERTHRAN,3,1,
                    new FabricItemSettings().group(ModItemGroup.NEZERTHRAN)));

    public static final Item ENHANCED_NEZERTHRAN_SWORD= registerItem("enhanced_nezerthran_sword",
            new SwordItem(ModToolMaterials.NEZERTHRAN,7,3,
                    new FabricItemSettings().group(ModItemGroup.NEZERTHRAN)));


    public static final Item ENDERBRITE_INGOT = registerItem("enderbrite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ENDERBRITE)));

    public static final Item ENDERBRITE_NUGGET= registerItem("enderbrite_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ENDERBRITE)));
    public static final Item RAW_ENDERBRITE= registerItem("raw_enderbrite",
            new Item(new FabricItemSettings().group(ModItemGroup.ENDERBRITE)));

    public static final Item ENDERBRITE_SWORD= registerItem("enderbrite_sword",
            new SwordItem(ModToolMaterials.ENDERBRITE,7,1,
                    new FabricItemSettings().group(ModItemGroup.ENDERBRITE)));

    public static final Item ENHANCED_ENDERBRITE_SWORD= registerItem("enhanced_enderbrite_sword",
            new SwordItem(ModToolMaterials.ENDERBRITE,9,4,
                    new FabricItemSettings().group(ModItemGroup.ENDERBRITE)));

    public static final Item ENDERBRITE_ENHANCEMENT_STONE= registerItem("enderbrite_enhancement_stone",
            new Item(new FabricItemSettings().group(ModItemGroup.ENDERBRITE)));



    public static final Item MONOLITH_CRYSTAL= registerItem("monolith_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.MONOLITH_MATERIALS)));

    public static final Item MONO_VIRUS= registerItem("mono_virus",
            new Item(new FabricItemSettings().group(ModItemGroup.MONOLITH_MATERIALS).food(ModFoodComponents.MONO_VIRUS)));

    public static final Item PLASMA_FUEL= registerItem("plasma_fuel",
            new Item(new FabricItemSettings().group(ModItemGroup.MONOLITH_MATERIALS)));


    public static Item registerItem(String name, Item item ){
        return Registry.register(Registry.ITEM, new Identifier(SoulGuns.MOD_ID,name),item);

    }
    public static void  registerModItems(){
        SoulGuns.LOGGER.info("Register mod items for "+ SoulGuns.MOD_ID);
    }
}
