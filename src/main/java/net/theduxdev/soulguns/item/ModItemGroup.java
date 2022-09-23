package net.theduxdev.soulguns.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.theduxdev.soulguns.SoulGuns;
import net.theduxdev.soulguns.block.ModBlocks;

public class ModItemGroup {

    public static final ItemGroup NEZERTHRAN =  FabricItemGroupBuilder.build(new Identifier(SoulGuns.MOD_ID,
            "nezerthran"), () -> new ItemStack(ModItems.RAW_NEZERTHRAN));

    public static final ItemGroup ENDERBRITE =  FabricItemGroupBuilder.build(new Identifier(SoulGuns.MOD_ID,
            "enderbrite"), () -> new ItemStack(ModItems.RAW_ENDERBRITE));

    public static final ItemGroup MONOLITH_MATERIALS =  FabricItemGroupBuilder.build(new Identifier(SoulGuns.MOD_ID,
            "monolith_materials"), () -> new ItemStack(ModItems.PLASMA_FUEL));
}
