package net.leaziurd.afu;


import net.leaziurd.afu.init.ModBlocks;
import net.leaziurd.afu.init.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AFU implements ModInitializer
{
    public static final String MODID = "afu";

    public static final ItemGroup AFU_GROUP = FabricItemGroupBuilder.create(new Identifier(MODID, "afu_group")).icon(() -> new ItemStack(ModItems.POOP)).build();

    @Override
    public void onInitialize()
    {
        System.out.println("IT'S WORKING !!!");

        ModItems.registerAll();
        ModBlocks.registerAll();
    }
}
