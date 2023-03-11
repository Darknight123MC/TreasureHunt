package com.mao.treasure_hunt.init;

import com.mao.treasure_hunt.TreasureHunt;
import com.mao.treasure_hunt.common.block.DustSandBlock;
import com.mao.treasure_hunt.common.block.DustSoulSandBlock;
import com.mao.treasure_hunt.common.block.SoftTuffBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit {
    public static final DustSandBlock DUST_SAND_BLOCK = new DustSandBlock();
    public static final SoftTuffBlock SOFT_TUFF_BLOCK = new SoftTuffBlock();
    public static final DustSoulSandBlock DUST_SOUL_SAND_BLOCK = new DustSoulSandBlock();

    public static void blockInit() {
        {
            Registry.register(Registry.BLOCK,new Identifier(TreasureHunt.MODID,"dust_sand"),DUST_SAND_BLOCK);
            Registry.register(Registry.BLOCK,new Identifier(TreasureHunt.MODID,"soft_tuff"),SOFT_TUFF_BLOCK);
            Registry.register(Registry.BLOCK,new Identifier(TreasureHunt.MODID, "dust_soul_sand"),DUST_SOUL_SAND_BLOCK);
        }
    }

    public static void blockItemInit() {
        {
            Registry.register(Registry.ITEM,new Identifier(TreasureHunt.MODID,"dust_sand"),new BlockItem(DUST_SAND_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
            Registry.register(Registry.ITEM,new Identifier(TreasureHunt.MODID,"soft_tuff"),new BlockItem(SOFT_TUFF_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
            Registry.register(Registry.ITEM,new Identifier(TreasureHunt.MODID, "dust_soul_sand"),new BlockItem(DUST_SOUL_SAND_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        }
    }
}
