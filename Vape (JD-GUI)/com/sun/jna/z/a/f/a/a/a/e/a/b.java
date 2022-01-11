package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.f.a;
import com.sun.jna.z.a.f.a.a.a.h;
import com.sun.jna.z.a.g.f;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import net.minecraft.client.gui.FontRenderer;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class b
  extends com.sun.jna.z.a.f.a.a.a.e.b<com.sun.jna.z.a.f.a.a.a.a.i>
{
  private final i e;
  private static final String f;
  
  protected void a(com.sun.jna.z.a.f.a.a.a.a.i a)
  {
    a.a(a, false);
    
    Rectangle a = a.j();GL11.glEnable(3042);GL11.glDisable(2884);
    
    GL11.glDisable(3553);int i = a.height - 4;int a = i.f;
    int a;
    GL11.glColor4f(0.5F, 0.5F, 0.5F, 0.25F);
    
    GL11.glBegin(7);
    
    GL11.glVertex2d(2.0D, 2.0D);GL11.glVertex2d(a + 2, 2.0D);
    
    GL11.glVertex2d(a + 2, a + 2);GL11.glVertex2d(2.0D, a + 2);
    GL11.glEnd();Point2D a = a.b();k a = a.k();
    do
    {
      if (a == null) {
        break;
      }
      a.setLocation(a.getX() - a.d(), a.getY() - a.e());a = a.k();
      if (a != 0) {
        break label257;
      }
    } while (a == 0);
    if (a == 0) {
      if (a.contains(a))
      {
        GL11.glColor4f(0.0F, 0.0F, 0.0F, Mouse.isButtonDown(0) ? 0.5F : 0.3F);GL11.glBegin(7);GL11.glVertex2d(0.0D, 0.0D);GL11.glVertex2d(a.width, 0.0D);GL11.glVertex2d(a.width, a.height);GL11.glVertex2d(0.0D, a.height);GL11.glEnd();
      }
    }
    GL11.glEnable(3553);
    label257:
    String a = a.b();
    a.e.d().func_78276_b(a, a + 4, a.height / 2 - a.e.b().field_78288_b / 2 + 2, a.b(a.m()));GL11.glEnable(2884);GL11.glDisable(3042);
    if (a == 0)
    {
      if (a.a()) {
        com.sun.jna.z.a.i.d.b.a(h.e, 10.0F, 4.0F, f, 0.25F);
      }
      a.a(a, true);
    }
  }
  
  protected Dimension b(com.sun.jna.z.a.f.a.a.a.a.i a)
  {
    return new Dimension(a.e.d().func_78256_a(a
    
      .b()) + a.e.d().field_78288_b + 6, a.e.d().field_78288_b + 4);
  }
  
  protected Rectangle[] c(com.sun.jna.z.a.f.a.a.a.a.i a)
  {
    return new Rectangle[] { new Rectangle(0, 0, a.f(), a.g()) };
  }
  
  protected void a(com.sun.jna.z.a.f.a.a.a.a.i a, Point a, int a)
  {
    int a = i.f;
    if ((a != 0) || (a.x <= a.f())) {
      if (a.y <= a.g()) {
        a.a(a);
      }
    }
  }
  
  b(i a)
  {
    a.<init>(com.sun.jna.z.a.f.a.a.a.a.i.class);a.e = a;a.b = Color.WHITE;a.c = new Color(128, 128, 128, 192);
  }
}
