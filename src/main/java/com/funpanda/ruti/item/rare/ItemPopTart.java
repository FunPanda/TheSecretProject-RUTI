package com.funpanda.ruti.item.rare;

import com.funpanda.ruti.creativetab.CreativeTabRUTI;
import com.funpanda.ruti.item.ItemRUTI;
import com.funpanda.ruti.reference.ItemNames;
import com.funpanda.ruti.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.ruti.item.rare
 *         Date: 8/26/2014
 */
public class ItemPopTart extends ItemFood{
    public ItemPopTart(){
        super(20,1F,true);
        this.setCreativeTab(CreativeTabRUTI.TAB_RUTI);
        this.setUnlocalizedName(ItemNames.ITEM_POPTART_NAME);
        if(Reference.DEBUG_ALWAYS_EDIBLE) {
            this.setAlwaysEdible();
        }

    }
    //Allows Multiple Potion Effects
    @Override
    public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_){
        --p_77654_1_.stackSize;
        p_77654_3_.getFoodStats().func_151686_a(this, p_77654_1_);
        p_77654_2_.playSoundAtEntity(p_77654_3_, "random.burp", 0.5F, p_77654_2_.rand.nextFloat() * 0.1F + 0.9F);
            if(!p_77654_2_.isRemote){
                p_77654_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id,300*20,5));
                p_77654_3_.addPotionEffect(new PotionEffect(Potion.damageBoost.id,300*20,5));
                p_77654_3_.addPotionEffect(new PotionEffect(Potion.digSpeed.id,300*20,5));
                p_77654_3_.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,300*20,5));
                p_77654_3_.addPotionEffect(new PotionEffect(Potion.nightVision.id,300*20,5));
                p_77654_3_.addPotionEffect(new PotionEffect(Potion.invisibility.id,300*20,5));
                p_77654_3_.addPotionEffect(new PotionEffect(Potion.resistance.id,300*20,5));
                p_77654_3_.addPotionEffect(new PotionEffect(Potion.waterBreathing.id,300*20,5));
                p_77654_3_.addPotionEffect(new PotionEffect(Potion.heal.id,300*20,5));
                p_77654_3_.addPotionEffect(new PotionEffect(Potion.jump.id,300*20,5));
                p_77654_3_.addPotionEffect(new PotionEffect(Potion.field_76434_w.id,300*20,5));
                p_77654_3_.addPotionEffect(new PotionEffect(Potion.field_76443_y.id,300*20,5));
                p_77654_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id,300*20,5));
            }



        return p_77654_1_;

    }

    //Sets Eating Time
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 32;
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
