package com.howprice.examplemod.client.render.items;

import com.howprice.examplemod.ExampleMod;
import com.howprice.examplemod.items.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemRenderRegister
{
	// this should only be called on the client (the server doesn't do any rendering)
	public static void registerItemRenderers()
	{
		String itemName = ModItems.exampleItem.getUnlocalizedName().substring(5); // .substring(5) skips over "item." at the start
		String resourceName = ExampleMod.MODID + ":" + itemName;
		ModelResourceLocation exampleItemModelResourceLocation = new ModelResourceLocation(resourceName, "inventory");
		
		// n.b. ModelLoader.setCustomModelResourceLocation must be called in preInit
		ModelLoader.setCustomModelResourceLocation(ModItems.exampleItem, 0, exampleItemModelResourceLocation);
	}
}
