package cyano.poweradvantage.fluids.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import cyano.poweradvantage.api.GUIBlock;
import cyano.poweradvantage.api.IFluidHandlerBlock;
import cyano.poweradvantage.api.simple.TileEntitySimplePowerSource;

public class FluidDrainBlock extends GUIBlock implements IFluidHandlerBlock{
// TODO: add new creative tab
	public FluidDrainBlock() {
		super(Material.iron);
		super.setHardness(3f);
		super.setCreativeTab(CreativeTabs.tabDecorations);
	}

	@Override
	public TileEntity createNewTileEntity(World w, int m) {
		return new FluidDrainTileEntity(w,m);
	}
	

	/**
	 * Override of default block behavior
	 */
    @Override
    public Item getItemDropped(final IBlockState state, final Random prng, final int i3) {
        return Item.getItemFromBlock(this);
    }
    
    // TODO: redstone output
    
    /**
     * (Client-only) Override of default block behavior
     */
    @SideOnly(Side.CLIENT)
    @Override
    public Item getItem(final World world, final BlockPos coord) {
        return Item.getItemFromBlock(this);
    }

	@Override
	public boolean canConnect(EnumFacing face) {
		return face != EnumFacing.UP;
	}
}