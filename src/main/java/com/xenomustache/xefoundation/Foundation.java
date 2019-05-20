package com.xenomustache.xefoundation;

import com.xenomustache.xefoundation.block.BlockRegistry;
import com.xenomustache.xefoundation.item.ItemRegistry;
import com.xenomustache.xefoundation.proxy.ClientProxy;
import com.xenomustache.xefoundation.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Foundation.MODID, name = Foundation.NAME, version = Foundation.VERSION)
public class Foundation {
    public static final String MODID = "xefoundation";
    public static final String NAME = "XenonCorp: Foundation";
    public static final String VERSION = "0.1";
    @SidedProxy(serverSide = "com.xenomustache.xefoundation.proxy.CommonProxy", clientSide = "com.xenomustache.xefoundation.proxy.ClientProxy")
    public static CommonProxy proxy;
    @Mod.Instance(MODID)
    public static Foundation instance;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {ClientProxy.postInitClientOnly();}

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            BlockRegistry.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ItemRegistry.register(event.getRegistry());
            BlockRegistry.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event) {
            ItemRegistry.registerModels();
            BlockRegistry.registerModels();
        }
    }
}