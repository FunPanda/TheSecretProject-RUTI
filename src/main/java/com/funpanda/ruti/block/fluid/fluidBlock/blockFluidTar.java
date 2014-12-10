package com.funpanda.ruti.block.fluid.fluidBlock;

import com.funpanda.ruti.creativetab.CreativeTabRUTI;
import com.funpanda.ruti.reference.BlockNames;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.ruti.block.fluid
 *         Date: 12/8/2014
 */
public class blockFluidTar extends BlockFluidClassic {
    @SideOnly(Side.CLIENT)
    protected IIcon stillIcon;
    @SideOnly(Side.CLIENT)
    protected IIcon flowingIcon;

    public blockFluidTar(Fluid fluid, Material material) {
        super(fluid, material);
        setResistance(16F);
        setBlockName(BlockNames.BLOCKFLUID_TAR_NAME);
        this.setCreativeTab(CreativeTabRUTI.TAB_RUTI);
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return (side == 0 || side == 1)? stillIcon : flowingIcon;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
        stillIcon = register.registerIcon(getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1) + "Still");
        flowingIcon = register.registerIcon(getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1) + "Flowing");
    }

    @Override
    public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
        if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
        return super.canDisplace(world, x, y, z);
    }

    @Override
    public boolean displaceIfPossible(World world, int x, int y, int z) {
        if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
        return super.displaceIfPossible(world, x, y, z);
    }
}
