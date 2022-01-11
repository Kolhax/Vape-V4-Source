package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.a.l;
import com.sun.jna.z.a.f.a.a.a.a.t;
import com.sun.jna.z.a.f.a.a.a.e.b;
import com.sun.jna.z.a.f.a.a.a.f.a;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import net.minecraft.client.gui.FontRenderer;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class h
  extends b<t>
{
  private i e;
  final Color f;
  private static final String[] g;
  
  protected Dimension b(t a)
  {
    return new Dimension(75, 6);
  }
  
  protected void a(t a)
  {
    a.a(a, false);
    
    GL11.glEnable(3042);int a = i.f;
    
    GL11.glDisable(2884);GL11.glDisable(3553);Rectangle a = a.j();double a = (a.a() - a.c()) / (a.d() - a.c());
    if (a == 0) {
      if (a < 0.0D) {
        a = 0.0D;
      }
    }
    int a = 4;a.a(com.sun.jna.z.a.f.a.a.a.h.e);GL11.glBegin(7);
    GL11.glVertex2d(0.0D, a);
    GL11.glVertex2d(a.width * a, a);GL11.glVertex2d(a.width * a, a.height + a);GL11.glVertex2d(0.0D, a.height + a);GL11.glEnd();FontRenderer a = a.e.c();a.func_78276_b(a.b(), 1, -4, -1);String a = null;String[] a = g;DecimalFormat a = new DecimalFormat(a[2]);DecimalFormat a = new DecimalFormat(a[1]);
    switch (l.a[a.f().ordinal()])
    {
    case 1: 
      a = a.format(a.a());
      
      break;
    case 2: 
      a = a.format(a.a());break;
    case 3: 
      a = g;a = String.format(a[0], new Object[] { Long.valueOf(Math.round(a.a())) });break;
    case 4: 
      int a = (int)Math.round((a.a() - a.c()) / (a.d() - a.c()) * 100.0D);a = String.format(g[3], new Object[] { Integer.valueOf(a) });
    }
    if ((a != 0) || (a != null))
    {
      String a = a.a();
      if ((a != 0) || (a != null))
      {
        if (a != 0) {
          break label456;
        }
        if (!a.trim().isEmpty()) {
          a = a.concat(" ").concat(a);
        }
      }
      label456:
      a.func_78276_b(a, a.f() - a.func_78256_a(a) - 4, -4, -1);
    }
    GL11.glEnable(3553);GL11.glEnable(2884);
    
    GL11.glDisable(3042);a.a(a, true);
  }
  
  protected void a(t a, Point a, int a)
  {
    int a = i.f;
    if (((a != 0) || (a.c(a)[0].contains(a))) && ((a != 0) || (a == 0)))
    {
      if (a == 0) {
        if (Mouse.isButtonDown(a))
        {
          if (a != 0) {
            break label75;
          }
          if (!a.b())
          {
            a.a(true);
            if (a == 0) {
              return;
            }
          }
        }
      }
      label75:
      if ((a != 0) || ((!Mouse.isButtonDown(a)) && ((a != 0) || (a.b())))) {
        a.a(false);
      }
    }
  }
  
  protected void d(t a)
  {
    int a = i.f;
    if ((a != 0) || (a.b())) {
      if (!Mouse.isButtonDown(0))
      {
        a.a(false);
      }
      else
      {
        Point a = a.b();l a = a.k();
        if (a != null) {
          a.translate(-a.d(), -a.e());
        }
        double a = (a.x - 4) / a.f();
        
        double a = a.c() + a * (a.d() - a.c());a.a(a);
      }
    }
  }
  
  protected Rectangle[] c(t a)
  {
    return new Rectangle[] { new Rectangle(-2, 4, a.f() + 2, a.g()) };
  }
  
  public h()
  {
    a.<init>(t.class);a.f = Color.lightGray;
  }
  
  public h(i a)
  {
    a.<init>(t.class);a.f = Color.lightGray;a.e = a;
    
    a.c = new Color(128, 128, 128, 192);
  }
}
