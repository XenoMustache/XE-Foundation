package com.xenomustache.xefoundation.item;

import net.minecraft.util.IStringSerializable;

public class EnumItemMeta {
    public enum Materials implements IStringSerializable {
        COAL_TRACE("coal_trace", 0),
        IRON_TRACE("iron_trace", 1),
        GOLD_TRACE("gold_trace", 2),
        DIAMOND_TRACE("diamond_trace", 3),
        EMERALD_TRACE("emerald_trace", 4),
        STEEL_TRACE("steel_trace", 5),
        COAL_DUST("coal_dust", 6),
        IRON_DUST("iron_dust", 7),
        GOLD_DUST("gold_dust", 8),
        DIAMOND_DUST("diamond_dust", 9),
        EMERALD_DUST("emerald_dust", 10),
        STEEL_DUST("steel_dust", 11),
        STEEL_INGOT("steel_ingot", 12);

        private int id;
        private String name;

        Materials(String name, int id) {
            this.id = id;
            this.name = name;
        }

        public String getName() {return this.name;}
        public int getId() {return id;}
        public String toString() {return getName();}
    }
}