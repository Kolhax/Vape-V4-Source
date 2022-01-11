package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.a.p;
import com.sun.jna.z.a.f.a.a.a.c.g;
import com.sun.jna.z.a.f.a.a.a.e.b;
import com.sun.jna.z.a.f.a.a.a.e.e;
import com.sun.jna.z.a.f.a.a.a.f.a;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.lwjgl.opengl.GL11;

public class f
  extends b<p>
{
  private final i e;
  
  f(i a)
  {
    a.<init>(p.class);a.e = a;a.b = Color.WHITE;a.c = new Color(128, 128, 128, 128);
  }
  
  protected Dimension b(p a)
  {
    k[] a = a.b();Rectangle[] a = new Rectangle[a.length];
    
    int a = i.f;com.sun.jna.z.a.f.a.a.a.c.d[][] a = new com.sun.jna.z.a.f.a.a.a.c.d[a.length][];int a = 0;
    do
    {
      if (a >= a.length) {
        break;
      }
      k a = a[a];
      if (a != 0) {
        break label127;
      }
      Dimension a = 
      
        a.a().a(a).b(a);a[a] = new Rectangle(0, 0, a.width, a.height);
      
      a[a] = a.a(a);a++;
    } while (a == 0);
    label127:
    return a.a().a(a, a);
  }
  
  protected void a(p a)
  {
    int a = i.f;
    if (a == 0) {
      if (a.k() != null) {
        return;
      }
    }
    Rectangle a = a.j();a.a(a, false);GL11.glEnable(3042);GL11.glDisable(3553);GL11.glDisable(2884);GL11.glBlendFunc(770, 771);a.a(a.l());
    
    GL11.glBegin(7);GL11.glVertex2d(0.0D, 0.0D);GL11.glVertex2d(a.width, 0.0D);GL11.glVertex2d(a.width, a.height);GL11.glVertex2d(0.0D, a.height);GL11.glEnd();GL11.glEnable(2884);GL11.glEnable(3553);GL11.glDisable(3042);a.a(a, true);
  }
}
