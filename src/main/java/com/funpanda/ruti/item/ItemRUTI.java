package com.funpanda.ruti.item;

import com.funpanda.ruti.creativetab.CreativeTabRUTI;
import com.funpanda.ruti.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.ruti.item
 *         Date: 8/25/2014
 */
public class ItemRUTI extends Item {
    public ItemRUTI(){
        super();
        this.setCreativeTab(CreativeTabRUTI.TAB_RUTI);
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
