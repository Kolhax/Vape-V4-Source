package com.sun.jna.z.a.f.a.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.e;
import com.sun.jna.z.a.f.a.a.a.a.n;
import com.sun.jna.z.a.f.a.a.a.e.d;
import java.awt.Point;
import org.lwjgl.input.Mouse;

public class a
  extends e
  implements n
{
  private boolean s = true;
  
  public boolean a()
  {
    return a.o != null;
  }
  
  public a()
  {
    a.<init>("");
  }
  
  public boolean d()
  {
    return a.r;
  }
  
  public boolean e()
  {
    return a.s;
  }
  
  private boolean q = true;
  
  public void b()
  {
    int a = c.q;
    if (a == 0)
    {
      if (a.a()) {
        if (Mouse.isButtonDown(0))
        {
          Point a = com.sun.jna.z.a.f.a.a.a.f.a.b();a.b(a.x - a.o.x);a.c(a.y - a.o.y);
          if (a == 0) {}
        }
        else
        {
          a.a(false);
        }
      }
      if (a != 0) {}
    }
    else if (a.r)
    {
      if ((a == 0) && (a.d == null)) {
        return;
      }
      a.d.a(a);
      if (a == 0) {
        return;
      }
    }
    a.b();
  }
  
  public void f(boolean a)
  {
    a.r = a;
  }
  
  public void h(boolean a)
  {
    a.t = a;
  }
  
  public void a(boolean a)
  {
    int a = c.q;
    if (a)
    {
      Point a = com.sun.jna.z.a.f.a.a.a.f.a.b();
      
      a.o = new Point(a.x - a.d(), a.y - a.e());
      if (a == 0) {}
    }
    else
    {
      a.o = null;
    }
  }
  
  public void g(boolean a)
  {
    int a = c.q;
    if (a == 0)
    {
      if (!a) {
        a.r = true;
      }
      a.s = a;
    }
  }
  
  public void b(boolean a)
  {
    int a = c.q;
    if (a == 0) {
      if (!a.q) {
        a = false;
      }
    }
    a.p = a;
  }
  
  public void f()
  {
    int a = c.q;
    if ((a != 0) || (a.t)) {
      a.c(false);
    }
  }
  
  public a(String a)
  {
    a.c(false);
    
    a.n = a;
  }
  
  public String a()
  {
    return a.n;
  }
  
  public boolean c()
  {
    return a.q;
  }
  
  public boolean b()
  {
    return a.p;
  }
  
  public void a(String a)
  {
    a.n = a;
  }
  
  private boolean t = true;
  private String n;
  private Point o;
  private boolean p;
  private boolean r;
  
  public void e(boolean a)
  {
    int a = c.q;
    if (a == 0)
    {
      if (!a) {
        a.p = false;
      }
      a.q = a;
    }
  }
  
  public boolean g()
  {
    return a.t;
  }
}
