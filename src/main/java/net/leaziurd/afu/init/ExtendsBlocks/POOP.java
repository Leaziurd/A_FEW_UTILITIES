package net.leaziurd.afu.init.ExtendsBlocks;

import net.leaziurd.afu.init.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class POOP extends Block
{
    public POOP(Settings settings)
    {
        super(settings.nonOpaque());
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context)
    {
        return VoxelShapes.cuboid(0.4f, 0f, 0.4f, 0.6f, 0.1f, 0.6f);
    }
    public ActionResult onUse(BlockState blockState, World world, BlockPos blockPos, PlayerEntity placedBy, Hand hand, BlockHitResult blockHitResult) {
        if (!world.isClient) {
            world.playSound(null, blockPos, ModSounds.FART_EVENT, SoundCategory.BLOCKS, 1f, 1f
            );
        }
        return ActionResult.SUCCESS;
    }
}
