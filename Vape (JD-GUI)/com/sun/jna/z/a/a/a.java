package com.sun.jna.z.a.a;

import java.lang.reflect.Method;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;

public abstract class a
{
  static Minecraft a;
  public String b;
  public String c;
  public String[] d;
  public String e;
  public String f;
  public String g;
  public static boolean h;
  private static final String i;
  
  public void a(String[] a)
  {
    a.d = a;
  }
  
  public void d(String a)
  {
    a.e = a;
  }
  
  public void c(String a)
  {
    a.g = a;
  }
  
  public static void e(String a)
  {
    try
    {
      Method a = GuiNewChat.class.getDeclaredMethod(i, new Class[] { IChatComponent.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE });
      
      a.setAccessible(true);a.invoke(a.field_71456_v.func_146158_b(), new Object[] { new ChatComponentTranslation(a, new Object[0]), Integer.valueOf(420), Integer.valueOf(a.field_71456_v.func_73834_c()), Boolean.valueOf(false) });
    }
    catch (Exception a)
    {
      a.printStackTrace();
    }
  }
  
  public void b(String a)
  {
    a.c = a;
  }
  
  public void a(String a)
  {
    a.b = a;
  }
  
  public abstract void a();
  
  public abstract String b();
}
