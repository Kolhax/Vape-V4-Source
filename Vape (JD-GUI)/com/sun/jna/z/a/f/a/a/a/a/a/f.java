package com.sun.jna.z.a.f.a.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.j;
import com.sun.jna.z.a.f.a.a.a.d.b;

public class f
  extends com.sun.jna.z.a.f.a.a.a.a.d
  implements j
{
  private String[] l;
  private int m;
  private boolean n;
  
  public boolean a()
  {
    return a.n;
  }
  
  public void a(b a)
  {
    a.a(a);
  }
  
  public void b(b a)
  {
    a.b(a);
  }
  
  public void a(int a)
  {
    a.m = a;int a = c.q;com.sun.jna.z.a.f.a.a.a.d.c[] a = a.b();int a = a.length;int a = 0;
    label71:
    do
    {
      if (a >= a) {
        break;
      }
      com.sun.jna.z.a.f.a.a.a.d.c a = a[a];
      try
      {
        if (a != 0) {
          continue;
        }
        if (!(a instanceof b)) {
          break label71;
        }
      }
      catch (Exception localException1)
      {
        throw localException1;
      }
      try
      {
        
        
          ((b)a).a(a);
      }
      catch (Exception a)
      {
        a.printStackTrace();
      }
      a++;
    } while (a == 0);
  }
  
  public void e(boolean a)
  {
    a.n = a;int a = c.q;com.sun.jna.z.a.f.a.a.a.d.c[] a = a.b();int a = a.length;int a = 0;
    label71:
    do
    {
      if (a >= a) {
        break;
      }
      com.sun.jna.z.a.f.a.a.a.d.c a = a[a];
      try
      {
        if (a != 0) {
          continue;
        }
        if (!(a instanceof com.sun.jna.z.a.f.a.a.a.d.d)) {
          break label71;
        }
      }
      catch (Exception localException1)
      {
        throw localException1;
      }
      try
      {
        ((com.sun.jna.z.a.f.a.a.a.d.d)a).a(a);
      }
      catch (Exception a)
      {
        a.printStackTrace();
      }
      a++;
    } while (a == 0);
  }
  
  public void a(com.sun.jna.z.a.f.a.a.a.d.d a)
  {
    a.a(a);
  }
  
  public int b()
  {
    return a.m;
  }
  
  public f()
  {
    a.l = new String[0];
  }
  
  public String c()
  {
    return a.l[a.m];
  }
  
  public String[] a()
  {
    return a.l;
  }
  
  public void b(com.sun.jna.z.a.f.a.a.a.d.d a)
  {
    a.b(a);
  }
  
  public f(String... a)
  {
    a.l = a;
  }
  
  public void a(String... a)
  {
    a.m = 0;
    a.l = a;
  }
}
