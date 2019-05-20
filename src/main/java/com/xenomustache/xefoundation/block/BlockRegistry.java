package com.xenomustache.xefoundation.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockRegistry {
    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll();
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll();
    }

    public static void registerModels() {}
}