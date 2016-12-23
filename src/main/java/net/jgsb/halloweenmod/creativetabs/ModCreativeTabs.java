package net.jgsb.halloweenmod.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Jacob on 10/29/2016.
 */
public class ModCreativeTabs {

    public static CreativeTabs tabCostumes;

    public static void init() {
        tabCostumes = new TabCostumes("costumes");
    }

}
