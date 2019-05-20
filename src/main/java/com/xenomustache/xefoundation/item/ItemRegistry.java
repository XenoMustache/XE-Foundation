package com.xenomustache.xefoundation.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemRegistry {
    public static ItemMaterial material = new ItemMaterial("material");

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(material);
    }

    public static void registerModels() {
        material.registerItemModel();
    }
}