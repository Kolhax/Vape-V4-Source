package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.a.g;
import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.e.b;
import com.sun.jna.z.a.g.f;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class a
  extends b<g>
{
  private final i e;
  private static final String[] f;
  
  protected void a(g a, Point a, int a)
  {
    int a = i.f;
    if ((a != 0) || (a.x <= a.f())) {
      if (a.y <= a.g()) {
        a.a(a);
      }
    }
  }
  
  a(i a)
  {
    a.<init>(g.class);a.e = a;
    
    a.b = Color.WHITE;a.c = new Color(128, 128, 128, 192);
  }
  
  protected void a(g a)
  {
    GL11.glPushMatrix();
    
    a.a(a, false);
    
    Rectangle a = a.j();
    
    GL11.glEnable(3042);GL11.glDisable(2884);
    
    GL11.glDisable(3553);float a = 0.3F;Point a = com.sun.jna.z.a.f.a.a.a.f.a.b();int a = i.f;k a = a.k();
    do
    {
      if (a == null) {
        break;
      }
      a.x -= a.d();a.y -= a.e();a = a.k();
      if (a != 0) {
        break label212;
      }
    } while (a == 0);
    if (a == 0) {
      if ((a.contains(a)) && (Minecraft.func_71410_x().field_71462_r != null))
      {
        GL11.glColor4f(0.3F, 0.3F, 0.3F, Mouse.isButtonDown(0) ? 0.3F : 0.2F);GL11.glBegin(7);GL11.glVertex2d(0.0D, a);GL11.glVertex2d(a.width, a);GL11.glVertex2d(a.width, a.height - a);GL11.glVertex2d(0.0D, a.height - a);GL11.glEnd();
      }
    }
    label212:
    if (a == 0) {
      if ((a.c()) && (Minecraft.func_71410_x().field_71462_r != null))
      {
        if (a != 0) {
          break label353;
        }
        if (a.b())
        {
          if (a != 0) {
            break label345;
          }
          if (a.d() != null)
          {
            int a = a.d().length * 17 + 1;
            
            GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.5F);
            
            GL11.glBegin(7);
            
            GL11.glVertex2d(1.0D, a.height);GL11.glVertex2d(a.width - 1, a.height);GL11.glVertex2d(a.width - 1, a.height + a);GL11.glVertex2d(1.0D, a.height + a);
            
            GL11.glEnd();
          }
        }
      }
    }
    label345:
    label353:
    int a = com.sun.jna.z.a.f.a.a.a.f.a.b(a.m());
    String a = a.b();
    
    a.e.a()
    
      .func_78276_b(a, a.width / 2 - a.e.a().func_78256_a(a) / 2 - 1, a.height / 2 - 
      
      a.e.a().field_78288_b / 2, a);
    if (a == 0)
    {
      if (a.c())
      {
        String[] a = f;com.sun.jna.z.a.i.d.b.a(a.m(), (a.width - 10) * 4, 14.0F, a.b() ? a[1] : f[0], 0.25F);
      }
      GL11.glEnable(3553);
      
      GL11.glEnable(2884);
    }
    GL11.glDisable(3042);a.a(a, true);
    
    GL11.glPopMatrix();
  }
  
  protected Dimension b(g a)
  {
    return 
    
      new Dimension(a.e.a().func_78256_a(a.b()) + 4, a.e.a().field_78288_b + 4);
  }
  
  protected Rectangle[] c(g a)
  {
    return 
    
      new Rectangle[] { new Rectangle(0, 0, a.f(), a.g()) };
  }
}
