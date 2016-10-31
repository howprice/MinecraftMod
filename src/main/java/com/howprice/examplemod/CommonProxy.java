package com.howprice.examplemod;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

// Common or server stuff here that needs to be overridden on the client
public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("CommonProxy.preInit");
	}

	public void init(FMLInitializationEvent event)
	{
		System.out.println("CommonProxy.init");
	}

	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("CommonProxy.postInit");
	}
}
