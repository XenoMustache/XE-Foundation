package com.xenomustache.xefoundation.proxy;

import com.xenomustache.xefoundation.Foundation;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Foundation.MODID + ":" + id, "inventory"));
    }

    public EntityPlayer getPlayer() {return Minecraft.getMinecraft().player;}

    public static void postInitClientOnly() {/*TODO postInitClient*/}

    public void registerModelBakery() {/*TODO modelBakery*/}
}