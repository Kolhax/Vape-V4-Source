package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.e.b;
import com.sun.jna.z.a.j;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.settings.GameSettings;

public final class h
  extends g
{
  private static final String[] r;
  public static boolean q;
  public com.sun.jna.z.a.f.a.a.a.a.n p;
  public com.sun.jna.z.a.f.a.a.a.a.n o;
  public com.sun.jna.z.a.f.a.a.a.a.n n;
  public com.sun.jna.z.a.f.a.a.a.a.i m;
  public com.sun.jna.z.a.f.a.a.a.a.i l;
  public com.sun.jna.z.a.f.a.a.a.a.i k;
  public com.sun.jna.z.a.f.a.a.a.a.i j;
  com.sun.jna.z.a.f.a.a.a.a.n i;
  
  public h()
  {
    String[] a = r;a.i = new com.sun.jna.z.a.f.a.a.a.a.a.a(a[0]);
    
    a.j = new com.sun.jna.z.a.f.a.a.a.a.a.d(a[1]);a.k = new com.sun.jna.z.a.f.a.a.a.a.a.d(a[7]);
    a.l = new com.sun.jna.z.a.f.a.a.a.a.a.d(a[2]);
    
    a.m = new com.sun.jna.z.a.f.a.a.a.a.a.d(a[13]);int a = g.c;a.n = new com.sun.jna.z.a.f.a.a.a.a.a.a(a[11]);a.o = new q(a, a[12]);a.p = new r(a, a[6]);a.d = new AtomicBoolean();
    if (a != 0) {
      j.g = !j.g;
    }
  }
  
  private void i()
  {
    com.sun.jna.z.a.f.a.a.a.e.e a = a.c();a.o.a(a);a.o.h(false);
    
    Dimension a = a.a(a.o).b(a.o);a.o.d(a.width);
    
    a.o.e(a.height);a.o.d();a.o.c(true);a.o.g(false);a.o.e(true);
    
    a.o.b(false);a.a.add(a.o);
  }
  
  final Color h = new Color(0, 0, 0, 130);
  final Color g = new Color(10, 10, 10, 255);
  public static Color f;
  public static Color e;
  private final AtomicBoolean d;
  
  public void a()
  {
    int a = g.c;
    if (a == 0) {
      if (!a.d.compareAndSet(false, true)) {
        return;
      }
    }
    a.h();
    
    Map<b, s> a = new HashMap();Iterator localIterator = com.sun.jna.z.a.i.d.a.a.values().iterator();
    String[] a;
    label443:
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      com.sun.jna.z.a.e.c a = (com.sun.jna.z.a.e.c)localIterator.next();s a = (s)a.get(a.i());
      if (a != 0) {
        break label499;
      }
      if (a == null)
      {
        String a = a.i().name().toLowerCase();
        
        a = Character.toUpperCase(a.charAt(0)) + a.substring(1);
        
        a = new s(a, a, null);a.a(a.c());
        
        a.a(new com.sun.jna.z.a.f.a.a.a.c.e(1, 0));a.c(true);a.h(false);a.f(true);a.e(false);
        if (a == 0)
        {
          a = r;
          if (!a.a().equals(a[9])) {
            a.a(a);
          }
        }
        a.put(a.i(), a);
      }
      com.sun.jna.z.a.e.c a = a;
      
      com.sun.jna.z.a.f.a.a.a.a.g a = new t(a, a);a.a(a.k());a.a(new l(a, a));Color a = new Color(0, 255, 255, 255);a.b(a.toString());a.a(a, new com.sun.jna.z.a.f.a.a.a.c.d[] { com.sun.jna.z.a.f.a.a.a.c.a.FILL });
      if ((a != 0) || (a.k() != null))
      {
        a = a.k();a = a.length;a = 0;
        do
        {
          if (a >= a) {
            break;
          }
          com.sun.jna.z.a.f.a.a.a.a.k a = a[a];
          
          a.k().a(a, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
          
          a.k().c(a);a++;
          if (a != 0) {
            break label443;
          }
        } while (a == 0);
        a.b(true);a.a(false);a.b(a.b() + " ");
      }
    } while (a == 0);
    a.g();a.k();
    a.c();
    
    a.j();
    label499:
    a.n.d(130);
    a.b();Minecraft a = Minecraft.func_71410_x();Dimension a = a.l();int a = a.width + 10;int a = 5;int a = a.field_71474_y.field_74335_Z;
    if (a == 0) {
      if (a == 0) {
        a = 1000;
      }
    }
    int a = 0;
    do
    {
      if ((a >= a) || ((a == 0) && ((a.field_71443_c / (a + 1) < 320) || (a.field_71440_d / (a + 1) < 240)))) {
        break;
      }
      a++;
    } while (a == 0);
    com.sun.jna.z.a.f.a.a.a.a.k[] a = a.b();int a = a.length;int a = 0;
    do
    {
      if (a >= a) {
        break;
      }
      com.sun.jna.z.a.f.a.a.a.a.n a = a[a];
      if (a == 0)
      {
        if (a != 0) {
          break label836;
        }
        a = r;
        if (a.a() != a[0]) {
          if (a == 0)
          {
            if (a.a() != a[6]) {
              a.b(a);
            }
          }
          else
          {
            a.c(a);a += a.f() + 10;a += a.width + 10;
            if (a != 0) {
              continue;
            }
            if (a + a.width + 5 > a.field_71443_c / a)
            {
              a = a.width + 10;a += a.height + 5;
            }
          }
        }
        a++;
      }
    } while (a == 0);
    a.i.b(5);a.i.c(40);
    
    a.i.f(false);
    
    a.p.b(5);a.p.c(5);
    label836:
    a.o.d(100);
  }
  
  private void k()
  {
    com.sun.jna.z.a.f.a.a.a.e.e a = a.c();com.sun.jna.z.a.f.a.a.a.a.n a = new com.sun.jna.z.a.f.a.a.a.a.a.a(r[4]);
    
    a.a(a);a.h(false);k a = new k();a.a(a.a, new com.sun.jna.z.a.f.a.a.a.c.d[0]);a.a(a.b, new com.sun.jna.z.a.f.a.a.a.c.d[0]);a.a(a.c, new com.sun.jna.z.a.f.a.a.a.c.d[0]);a.a(a.d, new com.sun.jna.z.a.f.a.a.a.c.d[0]);a.a(a.e, new com.sun.jna.z.a.f.a.a.a.c.d[0]);a.c(50);Dimension a = a.a(a).b(a);a.d();a.c(true);a.f(true);a.a(a);
  }
  
  public static float a()
  {
    Minecraft localMinecraft1 = Minecraft.func_71410_x();
    Minecraft a;
    int a = 
    
      g.c;ScaledResolution a = new ScaledResolution(Minecraft.func_71410_x(), Minecraft.func_71410_x().field_71443_c, Minecraft.func_71410_x().field_71440_d);int a = a.func_78325_e();
    if (a == 0) {}
    if (a == 0) {}
    if (a == 0) {
      if (a != 0) {
        break label95;
      }
    }
    label95:
    return (float)(a == 0 ? 0.5D : a == 1 ? 2.0D : a == 2 ? 1.0D : a == 3 ? 0.66666D : a == 4 ? 0.5D : 1.0D);
  }
  
  private Dimension l()
  {
    com.sun.jna.z.a.f.a.a.a.a.n[] a = a.b();
    
    int i1 = 0;
    int a;
    int i2 = 0;int a = g.c;
    int a;
    com.sun.jna.z.a.f.a.a.a.a.n[] a = a;int a = a.length;int a = 0;
    label188:
    label191:
    do
    {
      if (a >= a) {
        break;
      }
      com.sun.jna.z.a.f.a.a.a.a.n a = a[a];
      
      Dimension a = a.a().a(a).b(a);a = Math.max(a, a.f());a.e(a.height);
      if (a != 0) {
        break label204;
      }
      if (a == 0) {
        if (a.d())
        {
          Rectangle[] a = a.a().a(a).e(a);int a = a.length;int a = 0;
          do
          {
            if (a >= a) {
              break;
            }
            Rectangle a = a[a];a = Math.max(a, a.height);
            
            a++;
            if (a != 0) {
              break label191;
            }
          } while (a == 0);
          if (a == 0) {
            break label188;
          }
        }
      }
      a = Math.max(a, a.height);
      
      a++;
    } while (a == 0);
    a = a;a = a.length;
    label204:
    a = 0;
    do
    {
      if (a >= a) {
        break;
      }
      com.sun.jna.z.a.f.a.a.a.a.n a = a[a];
      if (a == 0)
      {
        String[] a = r;
        if (!a.a().equalsIgnoreCase(a[11])) {
          if (a == 0)
          {
            if ((!a.a().equalsIgnoreCase(a[12])) || 
            
              (a != 0)) {
              a.d(85);
            }
          }
          else {
            a.d();
          }
        }
        a++;
      }
    } while (a == 0);
    return new Dimension(85, a);
  }
  
  private void h()
  {
    com.sun.jna.z.a.f.a.a.a.e.e a = a.c();a.n.a(a);a.n.h(false);Dimension a = a.a(a.n).b(a.n);
    
    a.n.d(a.width);a.n.e(a.height);
    
    a.n.d();a.n.c(true);a.n.g(false);a.n.f(false);a.n.e(false);a.n.b(false);a.a.add(a.n);
  }
  
  protected void b()
  {
    com.sun.jna.z.a.f.a.a.a.e.e a = a.c();
    
    com.sun.jna.z.a.f.a.a.a.a.n[] a = a.b();String[] a = r;com.sun.jna.z.a.f.a.a.a.a.g a = new com.sun.jna.z.a.f.a.a.a.a.a.c(a[5]);
    
    com.sun.jna.z.a.f.a.a.a.a.g a = new com.sun.jna.z.a.f.a.a.a.a.a.c(a[8]);Dimension a = a.a(a).b(a);Dimension localDimension1 = a.a(a).b(a);
    Dimension a;
    int a = 
    
      g.c;int a = Math.max(a.width, a.width);int a = Math.max(a.height, a.height);
    
    com.sun.jna.z.a.f.a.a.a.a.n[] a = a;int a = a.length;int a = 0;
    label235:
    do
    {
      if (a >= a) {
        break;
      }
      com.sun.jna.z.a.f.a.a.a.a.n a = a[a];
      if (a != 0) {
        return;
      }
      if (a == 0)
      {
        if ((a instanceof s))
        {
          com.sun.jna.z.a.f.a.a.a.a.k[] a = a.b();int a = a.length;int a = 0;
          do
          {
            if (a >= a) {
              break label235;
            }
            com.sun.jna.z.a.f.a.a.a.a.k a = a[a];
            if (a == 0)
            {
              if (a != 0) {
                break;
              }
              if ((a instanceof com.sun.jna.z.a.f.a.a.a.a.g)) {
                if (a == 0)
                {
                  if (!(a instanceof com.sun.jna.z.a.f.a.a.a.a.i)) {
                    a.d(a);
                  }
                }
                else {
                  a.e(a);
                }
              }
              a++;
            }
          } while (a == 0);
        }
        a++;
      }
    } while (a == 0);
    a.l();
  }
  
  private void g()
  {
    com.sun.jna.z.a.f.a.a.a.e.e a = a.c();String[] a = r;com.sun.jna.z.a.f.a.a.a.a.n a = new com.sun.jna.z.a.f.a.a.a.a.a.a(a[10]);a.a(a);
    
    a.h(false);a.a(a.j, new com.sun.jna.z.a.f.a.a.a.c.d[0]);a.a(a.k, new com.sun.jna.z.a.f.a.a.a.c.d[0]);a.a(a.l, new com.sun.jna.z.a.f.a.a.a.c.d[0]);a.a(a.m, new com.sun.jna.z.a.f.a.a.a.c.d[0]);com.sun.jna.z.a.f.a.a.a.a.g a = new com.sun.jna.z.a.f.a.a.a.a.a.c(a[3]);a.a(new n(a, a));
    
    a.a(a.c());a.a(a, new com.sun.jna.z.a.f.a.a.a.c.d[0]);a.k.e(true);a.j.e(true);a.d();a.c(true);a.f(true);a.e(false);a.a(a);
  }
  
  private void c()
  {
    com.sun.jna.z.a.f.a.a.a.e.e a = a.c();
    
    a.i.a(a);a.i.h(false);com.sun.jna.z.a.f.a.a.a.a.n[] a = a.b();int a = g.c;int a = a.length;int a = 0;
    do
    {
      if (a >= a) {
        break;
      }
      com.sun.jna.z.a.f.a.a.a.a.n a = a[a];com.sun.jna.z.a.f.a.a.a.a.g a = new u(a, a);a.a(new m(a, a));a.d(a.p());a.i.a(a, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
      
      a++;
      if (a != 0) {
        return;
      }
    } while (a == 0);
    a.i.d();a.i.c(true);a.i.f(true);a.i.e(false);a.a(a.i);
  }
  
  public void j()
  {
    com.sun.jna.z.a.f.a.a.a.e.a.i a = (com.sun.jna.z.a.f.a.a.a.e.a.i)a.c();a.p.a(a);a.p.h(false);
    
    Dimension a = a.a(a.p).b(a.p);a.p.d(a.width);a.p.e(a.height);a.p.d();a.p.c(true);a.p.g(false);a.p.e(true);
    
    a.p.b(true);int a = g.c;a.a(a.p);
    if (j.g)
    {
      a++;g.c = a;
    }
  }
}
