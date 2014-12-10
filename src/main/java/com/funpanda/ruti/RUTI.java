package com.funpanda.ruti;

import com.funpanda.ruti.init.ModBlocks;
import com.funpanda.ruti.init.ModItems;
import com.funpanda.ruti.proxy.IProxy;
import com.funpanda.ruti.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod.EventHandler;
import com.funpanda.ruti.util.LogHelper;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.ruti
 *         Date: 8/25/2014
 */
@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class RUTI {

    //Define Instance
    @Instance(Reference.MOD_ID)
    public static RUTI instance;

    //Add Proxy
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS, modId = Reference.MOD_ID)
    public static IProxy proxy;

    //PreInit
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        LogHelper.Info("Initializing Random Utilities version " + Reference.VERSION);
        ModItems.init();
        ModBlocks.init();
    }

    //Init
    @EventHandler
    public void init(FMLInitializationEvent event){

    }

    //PostInit
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}