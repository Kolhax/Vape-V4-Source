package com.sun.jna.z.a.f.a.a.a.b;

import com.sun.jna.z.a.g.e;
import com.sun.jna.z.a.j;
import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class a
  extends FontRenderer
{
  e a;
  public static int b;
  private static final String[] c;
  
  public int func_175063_a(String a, float a, float a, int a)
  {
    int a = b;
    if (a == 0)
    {
      if (a == null) {
        return 0;
      }
      GL11.glPushMatrix();GL11.glScaled(0.5D, 0.5D, 0.5D);
    }
    boolean a = GL11.glIsEnabled(3042);
    
    boolean a = GL11.glIsEnabled(2896);boolean a = GL11.glIsEnabled(3553);
    
    boolean a = GL11.glIsEnabled(2884);
    if (a == 0) {
      if (!a) {
        GL11.glEnable(3042);
      }
    }
    if (a == 0) {
      if (a) {
        GL11.glDisable(2896);
      }
    }
    if (a == 0) {
      if (!a) {
        GL11.glEnable(3553);
      }
    }
    if (a == 0)
    {
      if (a) {
        GL11.glDisable(2884);
      }
      a *= 2.0F;a *= 2.0F;
    }
    Color a = com.sun.jna.z.a.f.a.a.a.f.a.a(a);
    
    Color a = new Color(a.getBlue(), a.getGreen(), a.getRed(), a.getAlpha());a.a.a(a, a + 1.0F, a + 1.0F, -16777216);a.a.a(a, a, a, com.sun.jna.z.a.f.a.a.a.f.a.b(a));
    if (a == 0) {
      if (a) {
        GL11.glEnable(2884);
      }
    }
    if (a == 0) {
      if (!a) {
        GL11.glDisable(3553);
      }
    }
    if (a == 0) {
      if (a) {
        GL11.glEnable(2896);
      }
    }
    if (a == 0)
    {
      if (!a) {
        GL11.glDisable(3042);
      }
      GL11.glPopMatrix();
    }
    return (int)a;
  }
  
  public int a(String a, float a, float a, int a, int a)
  {
    int a = b;
    if (a == 0)
    {
      if (a == null) {
        return 0;
      }
      GL11.glPushMatrix();GL11.glScaled(0.5D, 0.5D, 0.5D);
    }
    boolean a = GL11.glIsEnabled(3042);
    
    boolean a = GL11.glIsEnabled(2896);boolean a = GL11.glIsEnabled(3553);boolean a = GL11.glIsEnabled(2884);
    if (a == 0) {
      if (!a) {
        GL11.glEnable(3042);
      }
    }
    if (a == 0) {
      if (a) {
        GL11.glDisable(2896);
      }
    }
    if (a == 0) {
      if (!a) {
        GL11.glEnable(3553);
      }
    }
    if (a == 0)
    {
      if (a) {
        GL11.glDisable(2884);
      }
      a *= 2.0F;
      
      a *= 2.0F;
      
      a.a.a(a, a + 1.0F, a + 1.0F, a);
      
      a.a.a(a, a, a, a);
    }
    if (a == 0) {
      if (a) {
        GL11.glEnable(2884);
      }
    }
    if (a == 0) {
      if (!a) {
        GL11.glDisable(3553);
      }
    }
    if (a == 0) {
      if (a) {
        GL11.glEnable(2896);
      }
    }
    if (a == 0)
    {
      if (!a) {
        GL11.glDisable(3042);
      }
      GL11.glPopMatrix();
    }
    return (int)a;
  }
  
  public int func_78263_a(char a)
  {
    return a.func_78256_a(Character.toString(a));
  }
  
  public a(e a)
  {
    a.<init>(Minecraft.func_71410_x().field_71474_y, new ResourceLocation(a[0]), Minecraft.func_71410_x().field_71446_o, false);a.a = a;
    
    int a = b;String a = a[1];a.field_78288_b = ((int)a.a(a));
    if (a != 0) {
      j.g = !j.g;
    }
  }
  
  public int func_78256_a(String a)
  {
    int a = b;
    if (j.g) {
      b = ++a;
    }
    return (int)(a.a.a(a) / 2.0F);
  }
  
  public int func_78276_b(String a, int a, int a, int a)
  {
    int a = b;
    if (a == 0)
    {
      if (a == null) {
        return 0;
      }
      GL11.glPushMatrix();GL11.glScaled(0.5D, 0.5D, 0.5D);
    }
    boolean a = GL11.glIsEnabled(3042);boolean a = GL11.glIsEnabled(2896);boolean a = GL11.glIsEnabled(3553);
    
    boolean a = GL11.glIsEnabled(2884);
    if (a == 0) {
      if (!a) {
        GL11.glEnable(3042);
      }
    }
    if (a == 0) {
      if (a) {
        GL11.glDisable(2896);
      }
    }
    if (a == 0) {
      if (!a) {
        GL11.glEnable(3553);
      }
    }
    if (a == 0)
    {
      if (a) {
        GL11.glDisable(2884);
      }
      a *= 2;
      
      a *= 2;
      
      a.a.a(a, a, a, a);
    }
    if (a == 0) {
      if (a) {
        GL11.glEnable(2884);
      }
    }
    if (a == 0) {
      if (!a) {
        GL11.glDisable(3553);
      }
    }
    if (a == 0) {
      if (a) {
        GL11.glEnable(2896);
      }
    }
    if (a == 0)
    {
      if (!a) {
        GL11.glDisable(3042);
      }
      GL11.glPopMatrix();
    }
    return a;
  }
  
  public float a(String a)
  {
    return a.a.b(a);
  }
}
