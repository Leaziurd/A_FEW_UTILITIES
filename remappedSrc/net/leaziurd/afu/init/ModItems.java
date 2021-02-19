package net.leaziurd.afu.init;

import net.leaziurd.afu.AFU;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{

    public static final Item POOP = new Item(new Item.Settings().group(AFU.AFU_GROUP).food((new FoodComponent.Builder()).hunger(1).saturationModifier(0.1F).build()));
    public static final Item FAKE_NETHERITE_SCRAP = new Item(new Item.Settings().group(AFU.AFU_GROUP));
    public static final Item FAKE_GOLD_MIX = new Item(new Item.Settings().group(AFU.AFU_GROUP));
    public static final Item FAKE_GOLD_INGOT = new Item(new Item.Settings().group(AFU.AFU_GROUP));
    public static final Item FAKE_GOLD_NUGGET = new Item(new Item.Settings().group(AFU.AFU_GROUP));
    public static final Item OMELET = new Item(new Item.Settings().group(AFU.AFU_GROUP).food((new FoodComponent.Builder()).hunger(9).saturationModifier(6F).build()));
    public static final Item TURTLE_OMELET = new Item(new Item.Settings().group(AFU.AFU_GROUP).food((new FoodComponent.Builder()).hunger(10).saturationModifier(7F).build()));
    public static final Item FAKE_NETHERITE_INGOT = new Item(new Item.Settings().group(AFU.AFU_GROUP));

    public static void registerAll()
    {
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID,"poop"),POOP);
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID,"fake_netherite_scrap"),FAKE_NETHERITE_SCRAP);
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID,"fake_gold_mix"),FAKE_GOLD_MIX);
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID,"fake_gold_ingot"),FAKE_GOLD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID,"fake_gold_nugget"),FAKE_GOLD_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID,"omelet"),OMELET);
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID,"turtle_omelet"),TURTLE_OMELET);
        Registry.register(Registry.ITEM, new Identifier(AFU.MODID,"fake_netherite_ingot"),FAKE_NETHERITE_INGOT);
    }
}