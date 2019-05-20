package com.xenomustache.xefoundation.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;

public class CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id) {}

    public EntityPlayer getPlayer() {return null;}

    public void registerModelBakery() {}
}