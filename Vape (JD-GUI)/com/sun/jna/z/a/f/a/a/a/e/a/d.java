package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.a.n;
import com.sun.jna.z.a.f.a.a.a.c.g;
import com.sun.jna.z.a.f.a.a.a.e.b;
import com.sun.jna.z.a.f.a.a.a.e.e;
import com.sun.jna.z.a.f.a.a.a.h;
import com.sun.jna.z.a.g.f;
import com.sun.jna.z.a.j;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class d
  extends b<n>
{
  private final i e;
  
  protected Rectangle[] d(n a)
  {
    return 
    
      new Rectangle[] { new Rectangle(0, 0, a.f(), a.e.a().field_78288_b + 4) };
  }
  
  protected Dimension c(n a)
  {
    k[] a = a.b();Rectangle[] a = new Rectangle[a.length];com.sun.jna.z.a.f.a.a.a.c.d[][] a = new com.sun.jna.z.a.f.a.a.a.c.d[a.length][];int a = i.f;int a = 0;
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
      
        a.a().a(a).b(a);a[a] = new Rectangle(0, 0, a.width, a.height);a[a] = a.a(a);a++;
    } while (a == 0);
    label127:
    Dimension a = a.a().a(a, a);
    a.width += 4;
    
    a.height += a.e.a().field_78288_b + 8;return a;
  }
  
  Color f = new Color(22, 22, 22, 220);
  private static final String g;
  
  protected void a(n a, Point a, int a)
  {
    int a = i.f;
    if (a == 0) {
      if (a != 0) {
        return;
      }
    }
    int a = a.f() - 2;float a = a.e.a().a("I");
    if (a == 0) {
      if (a.g())
      {
        if (a == 0) {
          if (a.x >= a - a)
          {
            if (a != 0) {
              break label134;
            }
            if (a.x <= a)
            {
              if (a != 0) {
                break label134;
              }
              if (a.y >= 2)
              {
                if (a != 0) {
                  break label134;
                }
                if (a.y <= a + 2.0F)
                {
                  a.f();return;
                }
              }
            }
          }
        }
        label134:
        a = (int)(a - (a + 2.0F));
      }
    }
    if (a == 0) {
      if (a.c())
      {
        if (a == 0) {
          if (a.x >= a - a)
          {
            if (a != 0) {
              break label250;
            }
            if (a.x <= a)
            {
              if (a != 0) {
                break label250;
              }
              if (a.y >= 2)
              {
                if (a != 0) {
                  break label250;
                }
                if (a.y <= a + 2.0F)
                {
                  if (a == 0) {}
                  a.b(!a.b());return;
                }
              }
            }
          }
        }
        label250:
        a = (int)(a - (a + 2.0F));
      }
    }
    if (a == 0) {
      if (a.e())
      {
        if (a == 0) {
          if (a.x >= a - a)
          {
            if (a != 0) {
              break label366;
            }
            if (a.x <= a)
            {
              if (a != 0) {
                break label366;
              }
              if (a.y >= 2)
              {
                if (a != 0) {
                  break label366;
                }
                if (a.y <= a + 2.0F)
                {
                  if (a == 0) {}
                  a.f(!a.d());
                  
                  return;
                }
              }
            }
          }
        }
        label366:
        a = (int)(a - (a + 2.0F));
      }
    }
    if (((a != 0) || (a.x >= 0)) && ((a != 0) || (a.x <= a)) && ((a != 0) || ((a.y >= 0) && (a.y <= a + 4.0F))))
    {
      a.a(true); return;
    }
  }
  
  protected Rectangle b(n a)
  {
    Rectangle a = new Rectangle(a.j());
    
    a.x = 2;a.y = (a.e.a().field_78288_b + 6);
    
    a.width -= 4;a.height -= a.e.a().field_78288_b + 8;return a;
  }
  
  d(i a)
  {
    a.<init>(n.class);
    
    a.e = a;a.b = Color.WHITE;a.c = new Color(128, 128, 128, 200);
  }
  
  protected void a(n a)
  {
    int a = i.f;boolean a = Minecraft.func_71410_x().field_71462_r != null;
    
    GL11.glPushMatrix();Rectangle a = new Rectangle(a.j());int a = a.e.a().field_78288_b;a.a(a, false);boolean a = GL11.glIsEnabled(3042);GL11.glEnable(3042);GL11.glDisable(2884);GL11.glDisable(3553);GL11.glBlendFunc(770, 771);
    if ((a != 0) || (!a.d()))
    {
      if (a != 0) {
        break label127;
      }
      if (a.b().length != 0) {}
    }
    else
    {
      a.height = (a + 4);
    }
    label127:
    int a = 1;
    if (a == 0) {}
    boolean a = a.b().length > 0;
    if (a == 0) {
      if (a)
      {
        com.sun.jna.z.a.f.a.a.a.f.a.a(a.f);GL11.glBegin(7);
        
        GL11.glVertex2d(a, 16.0D);
        
        GL11.glVertex2d(a.width - a, 16.0D);
        if (a == 0) {}
        GL11.glVertex2d(a.width - a, a.height + (a ? 0 : 1));
        if (a == 0) {}
        GL11.glVertex2d(a, a.height + (a ? 0 : 1));
        
        GL11.glEnd();
      }
    }
    if (a == 0) {
      if (a)
      {
        com.sun.jna.z.a.f.a.a.a.f.a.a(new Color(h.e.getRed(), h.e.getGreen(), h.e.getBlue(), 255));GL11.glBegin(7);GL11.glVertex2d(0.0D, 0.0D);GL11.glVertex2d(a.width, 0.0D);GL11.glVertex2d(a.width, 16.0D);GL11.glVertex2d(0.0D, 16.0D);GL11.glEnd();
      }
    }
    int a = a.f() - 2;
    
    Point a = com.sun.jna.z.a.f.a.a.a.f.a.b();k a = a;
    do
    {
      if (a == null) {
        break;
      }
      a.x -= a.d();a.y -= a.e();
      
      a = a.k();
    } while (a == 0);
    boolean[] a = 
    
      { a.g(), a.c(), a.e() };
    if (a == 0) {}
    new boolean[] { false, a.b() }[2] = (!a.d() ? 1 : 0);boolean[] a = tmp457_448;int a = 0;
    label639:
    do
    {
      if (a >= a.length) {
        break;
      }
      if (a != 0) {
        break label655;
      }
      if ((a != 0) || ((a[a] != 0) || 
      
        (a != 0)))
      {
        if (a == 0) {
          if (a.x >= a - a)
          {
            if (a != 0) {
              break label639;
            }
            if (a.x <= a)
            {
              if (a != 0) {
                break label639;
              }
              if (a.y >= 2)
              {
                if (a != 0) {
                  break label639;
                }
                if (a.y <= a + 2)
                {
                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.16F);
                  
                  GL11.glBegin(7);
                  
                  GL11.glVertex2d(a - a, 2.0D);GL11.glVertex2d(a, 2.0D);GL11.glVertex2d(a, a + 2);GL11.glVertex2d(a - a, a + 2);GL11.glEnd();
                }
              }
            }
          }
        }
        a -= a + 2;
      }
      a++;
    } while (a == 0);
    label655:
    double a = !a.c() ? 13.0D : 0.0D;
    if (a == 0) {
      if (a)
      {
        if (a != 0) {
          break label852;
        }
        if (a.e()) {
          if (a == 0)
          {
            if (a.d())
            {
              GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
              
              GL11.glLineWidth(2.0F);
              
              GL11.glBegin(1);
              
              GL11.glVertex2d(a.width - 23 + a, 7.5D);GL11.glVertex2d(a.width - 18 + a, 7.5D);GL11.glVertex2d(a.width - 20.5D + a, 5.0D);GL11.glVertex2d(a.width - 20.5D + a, 10.0D);GL11.glEnd();
              if (a == 0) {}
            }
            else
            {
              GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);GL11.glLineWidth(2.0F);GL11.glBegin(1);
              
              GL11.glVertex2d(a.width - 23 + a, 7.5D);
            }
          }
          else
          {
            GL11.glVertex2d(a.width - 18 + a, 7.5D);
            
            GL11.glEnd();
          }
        }
      }
    }
    label852:
    if (a == 0)
    {
      if (a)
      {
        a.e.a().a(a.a(), 18.0F, 2.0F, 
        
          com.sun.jna.z.a.f.a.a.a.f.a.b(a.m()), -1879048192);com.sun.jna.z.a.i.d.b.a(Color.WHITE, 4.0F, 4.0F, a.a(), 0.4F);
        if (a != 0) {
          break label989;
        }
        if (a.c()) {
          com.sun.jna.z.a.i.d.b.a(a.b() ? Color.WHITE : Color.GRAY, (a.width - 7) * 2, 2.0F, g, 0.45F);
        }
      }
      GL11.glEnable(3553);GL11.glEnable(2884);
      if (a != 0) {
        break label1007;
      }
    }
    if (!a) {
      label989:
      GL11.glDisable(3042);
    }
    a.a(a, true);GL11.glPopMatrix();
    label1007:
    if (j.g)
    {
      a++;i.f = a;
    }
  }
}
