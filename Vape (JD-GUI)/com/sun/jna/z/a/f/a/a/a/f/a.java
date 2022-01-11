package com.sun.jna.z.a.f.a.a.a.f;

import com.sun.jna.z.a.j;
import java.awt.Color;
import java.awt.Point;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.settings.GameSettings;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class a
{
  public static boolean b;
  
  public static void a(double a, double a, double a, double a, double a, double a, float a)
  {
    GL11.glPushMatrix();a();GL11.glLineWidth(a);GL11.glBegin(1);GL11.glVertex3d(a, a, a);GL11.glVertex3d(a, a, a);GL11.glEnd();
    
    GL11.glDisable(3042);GL11.glEnable(3553);GL11.glDisable(2848);GL11.glEnable(2896);GL11.glEnable(2929);GL11.glDisable(32925);GL11.glDisable(32926);GL11.glPopMatrix();
  }
  
  public static void a()
  {
    GL11.glEnable(3042);
    
    GL11.glDisable(2896);GL11.glDisable(2929);
    
    GL11.glEnable(2848);GL11.glDisable(3553);GL11.glHint(3154, 4354);
    
    GL11.glBlendFunc(770, 771);GL11.glEnable(32925);GL11.glEnable(32926);GL11.glShadeModel(7425);
  }
  
  public static void a(int a, int a, int a, int a)
  {
    int a = a - a;int a = a - a;ScaledResolution a = new ScaledResolution(Minecraft.func_71410_x(), Minecraft.func_71410_x().field_71443_c, Minecraft.func_71410_x().field_71440_d);
    
    int a = a.func_78325_e();
    
    int a = Minecraft.func_71410_x().field_71462_r.field_146295_m - a;GL11.glScissor(a * a, a * a, a * a, a * a);
  }
  
  public static int b(Color a)
  {
    return a.getRed() | a.getGreen() << 8 | a.getBlue() << 16 | a.getAlpha() << 24;
  }
  
  public static void a(Color a)
  {
    GL11.glColor4f(a.getRed() / 255.0F, a.getGreen() / 255.0F, a.getBlue() / 255.0F, a.getAlpha() / 255.0F);
  }
  
  public static int a(int a, int a, float a)
  {
    int a = a & 0xFF;int a = a >> 8 & 0xFF;int a = a >> 16 & 0xFF;int a = a >> 24 & 0xFF;int a = a & 0xFF;int a = b;int a = a >> 8 & 0xFF;int a = a >> 16 & 0xFF;int a = a >> 24 & 0xFF;
    if (a == 0) {}
    int a = (int)(a < a ? a + (a - a) * a : a + (a - a) * a);
    if (a == 0) {}
    int a = (int)(a < a ? a + (a - a) * a : a + (a - a) * a);
    if (a == 0) {}
    int a = (int)(a < a ? a + (a - a) * a : a + (a - a) * a);
    if (a == 0) {}
    int a = (int)(a < a ? a + (a - a) * a : a + (a - a) * a);
    if (a != 0) {
      j.g = !j.g;
    }
    return a | a << 8 | a << 16 | a << 24;
  }
  
  public static void b(int a)
  {
    int a = a & 0xFF;int a = a >> 8 & 0xFF;int a = a >> 16 & 0xFF;int a = a >> 24 & 0xFF;
    
    GL11.glColor4b((byte)a, (byte)a, (byte)a, (byte)a);
  }
  
  public static void a(int a, int a, int a, int a, int a)
  {
    double a = a / 2;double a = a / 2;GL11.glDisable(2884);GL11.glBindTexture(3553, a);GL11.glPushMatrix();GL11.glTranslated(a + a, a + a, 0.0D);
    
    GL11.glScalef(a, a, 0.0F);GL11.glEnable(3042);GL11.glBlendFunc(770, 771);GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);GL11.glBegin(4);GL11.glNormal3f(0.0F, 0.0F, 1.0F);GL11.glTexCoord2f(1.0F, 1.0F);GL11.glVertex2d(1.0D, 1.0D);GL11.glTexCoord2f(0.0F, 1.0F);GL11.glVertex2d(-1.0D, 1.0D);GL11.glTexCoord2f(0.0F, 0.0F);GL11.glVertex2d(-1.0D, -1.0D);GL11.glTexCoord2f(0.0F, 0.0F);GL11.glVertex2d(-1.0D, -1.0D);GL11.glTexCoord2f(1.0F, 0.0F);
    GL11.glVertex2d(1.0D, -1.0D);GL11.glTexCoord2f(1.0F, 1.0F);GL11.glVertex2d(1.0D, 1.0D);GL11.glEnd();GL11.glDisable(3042);GL11.glBindTexture(3553, 0);GL11.glPopMatrix();
  }
  
  public static Color a(int a)
  {
    int a = a & 0xFF;int a = a >> 8 & 0xFF;int a = a >> 16 & 0xFF;int a = a >> 24 & 0xFF;return new Color(a, a, a, a);
  }
  
  public static Point b()
  {
    int i = Minecraft.func_71410_x().field_71474_y.field_74335_Z;int a = b;
    int a;
    if (a == 0) {}
    if (a == 0) {}
    float a = (float)(a == 1 ? 2.0D : a == 0 ? 0.0025D : a == 3 ? 1.2D : 1.0D);
    
    Minecraft a = Minecraft.func_71410_x();int a = a.field_71474_y.field_74335_Z;
    if (a == 0) {
      if (a == 0)
      {
        a = (int)(1000.0F * a);
        if (a == 0) {
          break label120;
        }
      }
    }
    if (a == 0) {
      if (a == 3)
      {
        a = (int)(a / a);
        if (a == 0) {
          break label120;
        }
      }
    }
    a = (int)(a * a);
    label120:
    int a = 0;
    do
    {
      if ((a >= a) || ((a == 0) && ((a.field_71443_c / (a + 1) < 320) || (a.field_71440_d / (a + 1) < 240)))) {
        break;
      }
      a++;
    } while (a == 0);
    return new Point(Mouse.getX() / a, a.field_71440_d / a - Mouse.getY() / a - 1);
  }
  
  public static void a(double a, double a, double a, double a, int a, int a) {}
}
