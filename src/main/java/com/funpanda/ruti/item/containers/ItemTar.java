package com.funpanda.ruti.item.containers;

import com.funpanda.ruti.reference.ItemNames;
import com.funpanda.ruti.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBucket;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.ruti.item.containers
 *         Date: 8/26/2014
 */
public class ItemTar extends ItemBucket {
    public ItemTar(){
        super(Blocks.flowing_water);
        this.setUnlocalizedName(ItemNames.ITEM_TAR_NAME);
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s%s", Reference.TEXTURE_PATH,getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        itemIcon = iconRegister.registerIcon(getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }
}
