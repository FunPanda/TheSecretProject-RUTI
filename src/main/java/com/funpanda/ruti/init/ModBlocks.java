package com.funpanda.ruti.init;

import com.funpanda.ruti.block.BlockRUTI;
import com.funpanda.ruti.block.fluid.fluidBlock.blockFluidTar;
import com.funpanda.ruti.block.fluid.fluidTar;
import com.funpanda.ruti.block.rare.BlockHype;
import com.funpanda.ruti.reference.BlockNames;
import com.funpanda.ruti.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.*;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.ruti.init
 *         Date: 8/25/2014
 */
@ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    //Creating Objects
    public static BlockRUTI blockHype = new BlockHype();
    public static Fluid fluidTar = new fluidTar(64);
    public static BlockFluidClassic blockFluidTar = new blockFluidTar(fluidTar, Material.water);

    public static void init(){
        //Init Blocks
        GameRegistry.registerBlock(blockHype, BlockNames.BLOCK_HYPE_NAME);

        //Register Fluids;
        FluidRegistry.registerFluid(fluidTar);
        fluidTar.setUnlocalizedName(blockFluidTar.getUnlocalizedName());

    }



}
