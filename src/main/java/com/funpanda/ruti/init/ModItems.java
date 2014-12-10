package com.funpanda.ruti.init;

import com.funpanda.ruti.item.ItemRUTI;
import com.funpanda.ruti.item.blastfurnace.ItemStainlessIngot;
import com.funpanda.ruti.item.containers.ItemTar;
import com.funpanda.ruti.item.craftable.ItemCup;
import com.funpanda.ruti.item.craftable.ItemTea;
import com.funpanda.ruti.item.craftable.temp.ItemCement;
import com.funpanda.ruti.item.rare.ItemPopTart;
import com.funpanda.ruti.reference.ItemNames;
import com.funpanda.ruti.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemFood;


/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.ruti.init
 *         Date: 8/25/2014
 */
@ObjectHolder(Reference.MOD_ID)
public class ModItems {
    //Creates Item Objects
    public static ItemFood itemTea = new ItemTea();
    public static ItemRUTI itemCup = new ItemCup();
    public static ItemRUTI itemCement = new ItemCement();
    public static ItemBucket itemTar = new ItemTar();
    public static ItemRUTI itemStainlessIngot = new ItemStainlessIngot();
    public static ItemFood itemPopTart = new ItemPopTart();

    //Registers Items
    public static void init(){
        GameRegistry.registerItem(itemTea, ItemNames.ITEM_TEA_NAME);
        GameRegistry.registerItem(itemCup,ItemNames.ITEM_CUP_NAME);
        GameRegistry.registerItem(itemCement, ItemNames.ITEM_CEMENT_NAME);
        GameRegistry.registerItem(itemTar,ItemNames.ITEM_TAR_NAME);
        GameRegistry.registerItem(itemStainlessIngot, ItemNames.ITEM_STAINLESSINGOT_NAME);
        GameRegistry.registerItem(itemPopTart,ItemNames.ITEM_POPTART_NAME);
    }
}
