package mod.sutten.common;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class RClickItem extends Item {
	

	 @Override
public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
	 player.swingItem();
	 System.out.print("Item RClicked");
	return stack;
	
}
	public static Item RClickItem;
	public static final void init() {
		RClickItem = new Item().setUnlocalizedName("RClickItem").setCreativeTab(CreativeTabs.tabMisc).setMaxStackSize(1);
		 GameRegistry.registerItem(RClickItem, "RClickItem");
	 
}
}