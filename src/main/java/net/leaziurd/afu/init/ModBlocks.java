package net.leaziurd.afu.init;

import net.leaziurd.afu.AFU;
import net.leaziurd.afu.init.ExtendsBlocks.POOP;
import net.leaziurd.afu.init.ExtendsBlocks.WC;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{
    public static final Block POOP_BLOCK = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).hardness(0.2f).sounds(BlockSoundGroup.WET_GRASS).breakByTool(FabricToolTags.HOES).resistance(0.2f));
    public static final Block FAKE_GOLD_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(3f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,2).resistance(6f).requiresTool());
    public static final net.leaziurd.afu.init.ExtendsBlocks.WC WC = new WC(FabricBlockSettings.of(Material.STONE).hardness(2f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES,2).resistance(6f).requiresTool());
    public static final Block FAKE_NETHERITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(50f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES,3).resistance(1200f).requiresTool());
    public static final net.leaziurd.afu.init.ExtendsBlocks.POOP POOP = new POOP(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).hardness(0.2f).sounds(BlockSoundGroup.WET_GRASS).breakByTool(FabricToolTags.HOES).resistance(0.2f));
    public static final RedstoneLampBlock ROBOT = new RedstoneLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).hardness(3f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES));

    public static void registerAll()
    {
        Registry.register(Registry.BLOCK, new Identifier(AFU.MODID, "poop_block"), POOP_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID, "poop_block"), new BlockItem(POOP_BLOCK, new Item.Settings().group(AFU.AFU_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(AFU.MODID, "fake_gold_block"),FAKE_GOLD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID, "fake_gold_block"), new BlockItem(FAKE_GOLD_BLOCK, new Item.Settings().group(AFU.AFU_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(AFU.MODID, "wc"),WC);
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID, "wc"), new BlockItem(WC, new Item.Settings().group(AFU.AFU_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(AFU.MODID, "fake_netherite_block"),FAKE_NETHERITE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID, "fake_netherite_block"), new BlockItem(FAKE_NETHERITE_BLOCK, new Item.Settings().group(AFU.AFU_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(AFU.MODID, "poop"),POOP);
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID,"poop"),new BlockItem(POOP,new Item.Settings().group(AFU.AFU_GROUP).food((new FoodComponent.Builder()).hunger(1).saturationModifier(0.1F).build())));

        Registry.register(Registry.BLOCK, new Identifier(AFU.MODID, "robot"),ROBOT);
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID, "robot"), new BlockItem(ROBOT, new Item.Settings().group(AFU.AFU_GROUP)));
    }
}