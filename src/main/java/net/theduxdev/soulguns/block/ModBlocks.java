package net.theduxdev.soulguns.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.theduxdev.soulguns.SoulGuns;
import net.theduxdev.soulguns.item.ModItemGroup;

public class ModBlocks {

    public static final Block NEZERTHRAN_BLOCK = registerBlock("nezerthran_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6).requiresTool()),ModItemGroup.NEZERTHRAN);

    public static final Block NEZERTHRAN_ORE = registerBlock("nezerthran_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6).requiresTool()),ModItemGroup.NEZERTHRAN);

    public static final Block ENDERBRITE_BLOCK = registerBlock("enderbrite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6).requiresTool()),ModItemGroup.ENDERBRITE);

    public static final Block ENDERBRITE_ORE = registerBlock("enderbrite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6).requiresTool()),ModItemGroup.ENDERBRITE);


    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name,block,group);
        return Registry.register(Registry.BLOCK,new Identifier(SoulGuns.MOD_ID,name),block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM,new Identifier(SoulGuns.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings().group(group)));
    }

    public static  void registerModBlocks()
    {
        SoulGuns.LOGGER.info("Registers mod block for" + SoulGuns.MOD_ID);
    }
}
