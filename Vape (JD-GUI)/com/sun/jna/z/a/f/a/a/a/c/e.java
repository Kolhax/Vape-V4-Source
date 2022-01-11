package com.sun.jna.z.a.f.a.a.a.c;

import java.awt.Dimension;
import java.awt.Rectangle;

public class e
  implements g
{
  private int a;
  private int b;
  public static boolean c;
  
  public Dimension a(Rectangle[] a, d[][] a)
  {
    int a = c;
    if (a == 0) {
      if (a.length == 0) {
        return new Dimension(0, 0);
      }
    }
    if (a == 0) {
      if (a.a == 0)
      {
        if (a == 0) {
          if (a.b == 0)
          {
            double a = Math.sqrt(a.length);
            
            int a = (int)a;int a = (int)a;
            if (a - (int)a > 0.0D) {
              a++;
            }
            if (a == 0) {
              break label177;
            }
          }
        }
        int a = a.length / a.b;
        if (a == 0) {
          if (a.length % a.b > 0) {
            a++;
          }
        }
        int a = a.b;
        if (a == 0) {
          break label177;
        }
      }
    }
    if (a == 0) {
      if (a.b == 0)
      {
        int a = a.length / a.a;
        if (a == 0) {
          if (a.length % a.a > 0) {
            a++;
          }
        }
        int a = a.a;
        if (a == 0) {
          break label177;
        }
      }
    }
    int a = a.a;
    
    int a = a.b;
    label177:
    int a = 0;
    int a = 0;Rectangle[] a = a;int a = a.length;int a = 0;
    do
    {
      if (a >= a) {
        break;
      }
      Rectangle a = a[a];
      a = Math.max(a, a.width);a = Math.max(a, a.height);a++;
    } while (a == 0);
    return new Dimension(a * a, a * a);
  }
  
  public void a(int a)
  {
    a.a = a;
  }
  
  public void b(int a)
  {
    a.b = a;
  }
  
  public void a(Rectangle a, Rectangle[] a, d[][] a)
  {
    int a = c;
    if (a == 0) {
      if (a.length == 0) {
        return;
      }
    }
    if (a == 0) {
      if (a.a == 0)
      {
        if (a == 0) {
          if (a.b == 0)
          {
            double a = Math.sqrt(a.length);
            
            int a = (int)a;int a = (int)a;
            if (a - (int)a > 0.0D) {
              a++;
            }
            if (a == 0) {
              break label178;
            }
          }
        }
        int a = a.length / a.b;
        if (a == 0) {
          if (a.length % a.b > 0) {
            a++;
          }
        }
        int a = a.b;
        if (a == 0) {
          break label178;
        }
      }
    }
    if (a == 0) {
      if (a.b == 0)
      {
        int a = a.length / a.a;
        if (a == 0) {
          if (a.length % a.a > 0) {
            a++;
          }
        }
        int a = a.a;
        if (a == 0) {
          break label178;
        }
      }
    }
    int a = a.a;int a = a.b;
    label178:
    double a = a.width / a;
    double a = a.height / a;
    
    int a = 0;
    label362:
    label637:
    do
    {
      if (a >= a) {
        break;
      }
      int a = 0;
      do
      {
        if (a >= a) {
          break label637;
        }
        int a = a * a + a;
        if (a != 0) {
          break;
        }
        if ((a >= a.length) && (a == 0)) {
          return;
        }
        Rectangle a = a[a];
        
        d[] a = a[a];a a = a.LEFT;b a = b.CENTER;d[] a = a;int a = a.length;int a = 0;
        do
        {
          if (a >= a) {
            break;
          }
          d a = a[a];
          if (a != 0) {
            break label362;
          }
          if (a == 0) {
            if ((a instanceof a)) {
              a = (a)a;
            }
          }
          if ((a != 0) && ((a != 0) || ((a instanceof b)))) {
            a = (b)a;
          }
          a++;
        } while (a == 0);
        if (a == 0) {
          switch (f.a[a.ordinal()])
          {
          case 1: 
            a.width = ((int)a);
          case 2: 
            a.x = ((int)(a.x + a * a));
            if (a == 0) {
              break;
            }
          case 3: 
            a.x = ((int)(a.x + (a + 1) * a - a.width));
            if (a == 0) {
              break;
            }
          case 4: 
            a.x = ((int)(a.x + a * a + a / 2.0D - a.width / 2));
          }
        }
        switch (f.b[a.ordinal()])
        {
        case 1: 
          a.height = ((int)a);
        case 2: 
          a.y = ((int)(a.y + a * a));
          if (a == 0) {
            break;
          }
        case 3: 
          a.y = ((int)(a.y + (a + 1) * a - a.height));
          if (a == 0) {
            break;
          }
        case 4: 
          a.y = ((int)(a.y + a * a + a / 2.0D - a.height / 2));
        }
        a++;
      } while (a == 0);
      a++;
    } while (a == 0);
  }
  
  public int a()
  {
    return a.a;
  }
  
  public e(int a, int a)
  {
    a.a = a;a.b = a;
  }
  
  public int b()
  {
    return a.b;
  }
}
