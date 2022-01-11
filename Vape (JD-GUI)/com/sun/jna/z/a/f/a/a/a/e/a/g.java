package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.a.q;
import com.sun.jna.z.a.f.a.a.a.e.b;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.lwjgl.opengl.GL11;

public class g
  extends b<q>
{
  private i e;
  private static final String[] f;
  
  protected Rectangle[] c(q a)
  {
    return new Rectangle[0];
  }
  
  public g(i a)
  {
    a.<init>(q.class);a.e = a;a.b = Color.LIGHT_GRAY;a.c = new Color(128, 128, 128, 192);
  }
  
  protected Dimension b(q a)
  {
    return new Dimension(100, 4 + a.e.a().field_78288_b);
  }
  
  protected void a(q a)
  {
    Rectangle a = a.j();int a = a.e.a().field_78288_b;
    
    com.sun.jna.z.a.f.a.a.a.b.a a = a.e.a();a.a(a, false);GL11.glEnable(3042);GL11.glDisable(2884);GL11.glDisable(3553);com.sun.jna.z.a.f.a.a.a.f.a.a(a.l());GL11.glLineWidth(0.9F);GL11.glBegin(2);GL11.glVertex2d(0.0D, 0.0D);GL11.glVertex2d(a.width, 0.0D);GL11.glVertex2d(a.width, a.height);GL11.glVertex2d(0.0D, a.height);GL11.glEnd();double a = (a.a() - a.c()) / (a.d() - a.c());com.sun.jna.z.a.f.a.a.a.f.a.a(a.m());GL11.glBegin(7);GL11.glVertex2d(0.0D, 0.0D);GL11.glVertex2d(a.width * a, 0.0D);GL11.glVertex2d(a.width * a, a.height);GL11.glVertex2d(0.0D, a.height);GL11.glEnd();
    
    GL11.glEnable(3553);String a = null;
    String[] a;
    switch (k.a[a.f().ordinal()])
    {
    case 1: 
      a = f;a = String.format(a[1], new Object[] { Double.valueOf(a.a()) });
      
      break;
    case 2: 
      a = f;a = String.format(a[0], new Object[] { Long.valueOf(Math.round(a.a())) });break;
    case 3: 
      int a = (int)Math.round((a.a() - a.c()) / (a.d() - a.c()) * 100.0D);
      
      a = String.format(f[2], new Object[] { Integer.valueOf(a) });
    }
    if (a != null)
    {
      GL11.glBlendFunc(775, 769);a.func_78276_b(a, a.f() / 2 - a.func_78256_a(a) / 2, a.g() / 2 - a / 2, com.sun.jna.z.a.f.a.a.a.f.a.b(a.m()));
      
      GL11.glBlendFunc(770, 771);
    }
    GL11.glEnable(2884);GL11.glDisable(3042);a.a(a, true);
  }
}
