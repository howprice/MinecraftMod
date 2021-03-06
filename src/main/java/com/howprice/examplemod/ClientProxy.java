package com.howprice.examplemod;

import com.howprice.examplemod.client.render.block.BlockRenderRegister;
import com.howprice.examplemod.client.render.item.ItemRenderRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	// Override common stuff with client specific stuff here

	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("ClientProxy.preInit");
		super.preInit(event);
		ItemRenderRegister.registerItemRenderers();
		BlockRenderRegister.registerBlockRenderer();
	}

	@Override
	public void init(FMLInitializationEvent event)
	{
		System.out.println("ClientProxy.init");
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("ClientProxy.postInit");
		super.postInit(event);
	}

}
