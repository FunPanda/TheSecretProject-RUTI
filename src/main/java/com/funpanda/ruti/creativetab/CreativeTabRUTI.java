package com.funpanda.ruti.creativetab;

import com.funpanda.ruti.init.ModItems;
import com.funpanda.ruti.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.ruti.creativetab
 *         Date: 8/25/2014
 */
public class CreativeTabRUTI {
    public static final CreativeTabs TAB_RUTI = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.itemCement;
        }

        @Override
        public String getTranslatedTabLabel(){
            return "Random Utilities Creative Tab";
        }
    };
}

