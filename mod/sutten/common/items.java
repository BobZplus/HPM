package mod.sutten.common;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class items {
	static int SIN = 2;
	static int i = SIN;
	static String IArray[] = {"Copper", "Silver"};
	public static Item item1;
	 public static final void init() {
		 for(i=0; i<SIN; i++) {
			 item1 = new Item().setUnlocalizedName(IArray[i]).setCreativeTab(CreativeTabs.tabMisc).setMaxStackSize(16);
			 GameRegistry.registerItem(item1, IArray[i]);
		 }
	 }
}