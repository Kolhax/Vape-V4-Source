package com.sun.jna.z.a.e.a;

import com.sun.jna.z.a.e.b;
import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.j;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;

public class a
  extends c
{
  public static boolean n;
  
  public static void a()
  {
    a(e.d());
  }
  
  public static void a(GuiScreen a)
  {
    e.a.field_71462_r = a;int a = n;
    if (a == 0)
    {
      if (a != null) {
        e.a.func_71364_i();
      }
    }
    else
    {
      ScaledResolution a = new ScaledResolution(Minecraft.func_71410_x(), Minecraft.func_71410_x().field_71443_c, Minecraft.func_71410_x().field_71440_d);int a = a.func_78326_a();
      int a = a.func_78328_b();
      
      a.func_146280_a(e.a, a, a);e.a.field_71454_w = false;
    }
    if (a != 0) {
      j.g = !j.g;
    }
  }
  
  public a(String a, b a, int a, int a)
  {
    a.<init>(a, a, a, a);int a = n;
    if (j.g) {
      n = a == 0;
    }
  }
}
