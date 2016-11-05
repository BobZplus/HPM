package mod.sutten.common;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class HuiPizda extends Item {
	public static Item HuiPizda;

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		System.out.print("BLEEEEEEEEEEEEEEEEEEEEEEEEEEEEAT");
		player.swingItem();
		return stack;
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase entityP, EntityLivingBase entity) {
		System.out.println("Pidrblya");
		return true;
	}
	 public static final void init() {
	HuiPizda = new Item().setUnlocalizedName("HuiPizda").setCreativeTab(CreativeTabs.tabMisc).setMaxStackSize(16);
	 GameRegistry.registerItem(HuiPizda, "HuiPizda");
}
}