package com.sun.jna.z.a.g;

import java.lang.reflect.Field;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;

public class l
{
  private Field a;
  private Field b;
  private Field c;
  private static final String[] d;
  
  public double c()
  {
    try
    {
      return a.c.getDouble(Minecraft.func_71410_x().func_175598_ae());
    }
    catch (Exception a)
    {
      a.printStackTrace();
    }
    return 0.0D;
  }
  
  public double b()
  {
    try
    {
      return a.b.getDouble(Minecraft.func_71410_x().func_175598_ae());
    }
    catch (Exception a)
    {
      a.printStackTrace();
    }
    return 0.0D;
  }
  
  public l()
  {
    try
    {
      String[] a = d;a.a = RenderManager.class.getDeclaredField(a[1]);a.b = RenderManager.class.getDeclaredField(a[2]);a.c = RenderManager.class.getDeclaredField(a[0]);
      
      a.a.setAccessible(true);a.b.setAccessible(true);a.c.setAccessible(true);
    }
    catch (Exception a)
    {
      a.printStackTrace();
    }
  }
  
  public double a()
  {
    try
    {
      return a.a.getDouble(Minecraft.func_71410_x().func_175598_ae());
    }
    catch (Exception a)
    {
      a.printStackTrace();
    }
    return 0.0D;
  }
}
