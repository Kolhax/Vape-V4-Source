package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.f.a.a.a.d.a;
import com.sun.jna.z.a.j;

class n
  implements a
{
  long a;
  final h c;
  private static final String[] d;
  
  n(h a, com.sun.jna.z.a.f.a.a.a.a.g paramg) {}
  
  public void a(com.sun.jna.z.a.f.a.a.a.a.g a, int a)
  {
    int a = g.c;
    if ((a != 0) || (a == 0))
    {
      String[] a;
      if (a == 0)
      {
        if (System.currentTimeMillis() - a.a <= 60000L) {
          break label161;
        }
        a = d;a.b.b(a[2]);
        if (a != 0) {}
      }
      else
      {
        if (j.e.a())
        {
          a = d;a.b.b(a[0]);new C(a).start();
          a.a = System.currentTimeMillis();
          if (a == 0) {
            return;
          }
        }
        a = d;a.b.b(a[1] + (a.a - System.currentTimeMillis() + 60000L) / 1000L + "s");
      }
      if (a != 0) {
        label161:
        a.b.b(d[1] + (a.a - System.currentTimeMillis() + 60000L) / 1000L + "s");
      }
    }
  }
}
