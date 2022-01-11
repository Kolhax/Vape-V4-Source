package com.sun.jna.z.a.a;

import com.sun.jna.z.a.g.g;
import com.sun.jna.z.a.j;
import java.util.List;

public class c
  extends a
{
  private static final String[] j;
  
  public void a()
  {
    a.c = a.c.toLowerCase();g localg1 = j.e.d;
    g a;
    int a = a.h;String[] a = j;
    if (a == 0)
    {
      if (a.b.equalsIgnoreCase(a[5]))
      {
        if (a != 0) {
          break label127;
        }
        if (!a.a.contains(a.c))
        {
          a.a.add(a.c);
          e(a[1] + a.c + a[2]);
          if (a == 0) {
            return;
          }
        }
      }
      a = j;
    }
    label127:
    if (((a != 0) || (a.b.equalsIgnoreCase(a[0]))) && ((a != 0) || (a.a.contains(a.c))))
    {
      a.a.remove(a.c);
      
      e(a.c + j[3]);
    }
  }
  
  public String b()
  {
    return j[4];
  }
}
