package com.sun.jna.z.a.a;

import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.e.g;
import com.sun.jna.z.a.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.input.Keyboard;

public class b
  extends a
{
  private static final String[] j;
  
  public void a()
  {
    int a = a.h;String[] a = j;
    Iterator localIterator;
    if (a.b.equalsIgnoreCase(a[5]))
    {
      localIterator = i.d.a.a.values().iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        c a = (c)localIterator.next();
        
        a.b(65235);
        if (a != 0) {
          break label89;
        }
      } while (a == 0);
      a = j;e(a[0]);
    }
    else
    {
      label89:
      localIterator = i.d.a.a.values().iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        c a = (c)localIterator.next();
        if (a != 0) {
          break label309;
        }
        if ((a != 0) || (a.a().toLowerCase().equalsIgnoreCase(a.b)))
        {
          if (a == 0)
          {
            if (Keyboard.getKeyIndex(a.c.toUpperCase()) == 0)
            {
              a = j;e(a[2]);
              if (a == 0) {}
            }
            else
            {
              a = j;
            }
          }
          else
          {
            if (a.c.equalsIgnoreCase(a[1]))
            {
              a.b(65235);
              if (a == 0) {}
            }
            else
            {
              a.b(Keyboard.getKeyIndex(a.c.toUpperCase()));
            }
            a = j;e(a[6] + a.b + a[7] + a.c);
          }
          return;
        }
      } while (a == 0);
      label309:
      e(a.b + j[3]);
    }
  }
  
  public String b()
  {
    return j[4];
  }
}
