package com.howprice.examplemod;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy
{
	// Override common stuff with server specific stuff here
	
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("ServerProxy.preInit");
		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event)
	{
		System.out.println("ServerProxy.init");
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("ServerProxy.postInit");
		super.postInit(event);
	}

}
