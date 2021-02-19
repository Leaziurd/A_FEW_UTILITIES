package net.leaziurd.afu.init.ExtendsBlocks;

import net.leaziurd.afu.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class WC extends Block
{
    public WC(Settings settings)
    {
        super(settings.nonOpaque());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context)
    {
        return VoxelShapes.cuboid(0.1f, 0f, 0.1f, 0.9f, 0.7f, 0.9f);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        if (!world.isClient)
        {
            player.giveItemStack(new ItemStack(ModItems.POOP, 1));
        }
        return ActionResult.SUCCESS;
    }
}