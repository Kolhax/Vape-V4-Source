package com.sun.jna.z.a.e;

import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.j;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class c
  extends j
{
  private String h;
  private int i;
  private boolean j;
  private int k;
  private b l;
  public static boolean m;
  
  public String toString()
  {
    return a.h;
  }
  
  public void a(int a)
  {
    if (a == a.i) {
      a.d();
    }
  }
  
  public k[] k()
  {
    return null;
  }
  
  public boolean c()
  {
    return a.j;
  }
  
  public int b()
  {
    return a.i;
  }
  
  public void b(String a)
  {
    a.h = a;
  }
  
  public b i()
  {
    return a.l;
  }
  
  public String a()
  {
    return a.h;
  }
  
  public c(String a, b a, int a)
  {
    a.h = a;
    
    a.l = a;a.k = a;
    
    a.i = 65235;
  }
  
  public void d()
  {
    int a = m;
    if (a == 0) {}
    a.j = (!a.j);
    if (a == 0) {
      if (a.j)
      {
        a.e();
        if (a == 0) {
          return;
        }
      }
    }
    a.f();
  }
  
  public void a(boolean a)
  {
    int a = m;
    if (a == 0)
    {
      a.j = a;
      if (a)
      {
        a.e();
        if (a == 0) {
          return;
        }
      }
    }
    a.f();
  }
  
  public c(String a, b a, int a, int a)
  {
    a.h = a;a.l = a;a.k = a;a.i = a;
  }
  
  public int j()
  {
    return a.k;
  }
  
  public void b(int a)
  {
    a.i = a;
  }
  
  public void a(MouseEvent a) {}
  
  public void e() {}
  
  public void f() {}
  
  public void a(TickEvent.PlayerTickEvent a) {}
  
  public void a(LivingEvent.LivingUpdateEvent a) {}
  
  public void g() {}
  
  public void a(float a) {}
  
  public void b(float a) {}
  
  public void h() {}
}
