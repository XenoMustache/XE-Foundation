package com.xenomustache.xefoundation.item;

import com.xenomustache.xefoundation.Foundation;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemMaterial extends Item {
    protected String name;

    public ItemMaterial(String name) {
        this.name = name;
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(null);
    }

    public int getMetadata(int damage) {return damage;}

    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
        if (this.isInCreativeTab(tab)) {
            for (int i = 0; i < EnumItemMeta.Materials.values().length; ++i) {
                items.add(new ItemStack(this, 1, i));
            }
        }
    }

    public void registerItemModel() {
        for (int i = 0; i < EnumItemMeta.Materials.values().length; i++) {
            Foundation.proxy.registerItemRenderer(this, i, "material_" + EnumItemMeta.Materials.values()[i].getName());
        }
    }

    public String getUnlocalizedName(ItemStack stack) {
        for (int i = 0; i < EnumItemMeta.Materials.values().length; i++) {
            if (stack.getItemDamage() == i) {
                return this.getUnlocalizedName() + "." + EnumItemMeta.Materials.values()[i].getName();
            } else {
                continue;
            }
        }
        return this.getUnlocalizedName() + "." + EnumItemMeta.Materials.STEEL_INGOT.getName();
    }
}