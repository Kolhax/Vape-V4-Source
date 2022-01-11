package com.sun.jna.z.a.g;

import java.lang.reflect.Method;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;

public class n
{
  private EntityRenderer a;
  private Method b;
  private static final String c;
  
  public n()
  {
    try
    {
      a.a = Minecraft.func_71410_x().field_71460_t;a.b = EntityRenderer.class.getDeclaredMethod(c, new Class[] { Float.TYPE, Integer.TYPE });a.b.setAccessible(true);
    }
    catch (Exception a) {}
    a.printStackTrace();
  }
  
  public void a(float a, int a)
  {
    try
    {
      a.b.invoke(a.a, new Object[] { Float.valueOf(a), Integer.valueOf(a) });
    }
    catch (Exception a)
    {
      a.printStackTrace();
    }
  }
}
