package com.funpanda.ruti.block.rare;

import com.funpanda.ruti.block.BlockRUTI;
import com.funpanda.ruti.reference.BlockNames;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.ruti.block.rare
 *         Date: 8/28/2014
 */
public class BlockHype extends BlockRUTI{
    public BlockHype(){
        super();
        this.setBlockName(BlockNames.BLOCK_HYPE_NAME);
    }

    //Override
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        p_149727_5_.addChatComponentMessage(new ChatComponentText("[RandomUtilities] Welcome To The Secret Project!!!"));
        p_149727_5_.addChatComponentMessage(new ChatComponentText(" "));
        p_149727_5_.addChatComponentMessage(new ChatComponentText("[RandomUtilities] (LOUD APPLAUSE!)"));
        p_149727_5_.addChatComponentMessage(new ChatComponentText(" "));
        p_149727_5_.addChatComponentMessage(new ChatComponentText("[RandomUtilities] HI! Guess what mod I rewrote!"));
        p_149727_5_.addChatComponentMessage(new ChatComponentText("[RandomUtilities] I still need your help with the textures...I found some but mine aren't very good!"));
        p_149727_5_.addChatComponentMessage(new ChatComponentText("[RandomUtilities] Welcome To The Secret Project!!!"));
        p_149727_5_.addChatComponentMessage(new ChatComponentText("[RandomUtilities] Oh yeah...hi Derek; alias: " + p_149727_5_.getDisplayName()));
        return false;
    }
}
