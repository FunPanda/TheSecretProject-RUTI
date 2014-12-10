package com.funpanda.ruti.block.fluid;

import net.minecraftforge.fluids.Fluid;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.ruti.block.fluid.fluidBlock
 *         Date: 12/8/2014
 */
public class fluidTar extends Fluid {
    public fluidTar(int id) {
        super("fluidtar");
        this.setLuminosity(7);
        this.setDensity(16);
        this.setViscosity(12000);

    }
}
