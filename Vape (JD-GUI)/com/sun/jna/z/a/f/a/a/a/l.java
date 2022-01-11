package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.c.d;
import org.lwjgl.input.Keyboard;

class l
  implements com.sun.jna.z.a.f.a.a.a.d.a
{
  Thread a = new Thread();
  final h c;
  
  l(h a, c paramc) {}
  
  public void a(com.sun.jna.z.a.f.a.a.a.a.g a, int a)
  {
    int a = g.c;
    if (a == 0) {
      if (a == 0)
      {
        if (a != 0) {
          break label36;
        }
        if (!Keyboard.isKeyDown(42))
        {
          a.b.d();
          if (a == 0) {
            return;
          }
        }
      }
    }
    label36:
    if (a == 0) {
      if (a == 0)
      {
        if (a != 0) {
          break label110;
        }
        if (Keyboard.isKeyDown(42))
        {
          if (a == 0)
          {
            if (!a.a.isAlive()) {
              a.a = new A(a, a);
            }
          }
          else
          {
            a.a.start();
            if (a == 0) {
              return;
            }
          }
          
          
            new B(a, a).start();
          if (a == 0) {
            return;
          }
        }
      }
    }
    label110:
    if ((a != 0) || (a == 1))
    {
      if (a == 0)
      {
        if (!a.c()) {
          return;
        }
        if (a != 0) {}
      }
      else if (a.b())
      {
        a.a(false);
        
        a = a.b.k();a = a.length;a = 0;
        do
        {
          if (a >= a) {
            break;
          }
          k a = a[a];a.k().c(a);
          
          a.c.b();a++;
          if (a != 0) {
            return;
          }
        } while (a == 0);
        if (a == 0) {
          return;
        }
      }
      a.a(true);
      
      k[] a = a.b.k();int a = a.length;int a = 0;
      do
      {
        if (a >= a) {
          break;
        }
        k a = a[a];a.k().a(a, a, new d[] { com.sun.jna.z.a.f.a.a.a.c.a.CENTER });a.k().d();a.c.b();
        
        a++;
      } while (a == 0);
    }
  }
}
