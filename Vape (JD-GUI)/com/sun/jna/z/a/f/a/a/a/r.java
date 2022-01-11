package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.e.b;
import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.j;
import java.awt.Font;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class r
  extends com.sun.jna.z.a.f.a.a.a.a.a.a
{
  com.sun.jna.z.a.g.h u;
  final h v;
  private static final String w;
  
  public void c()
  {
    com.sun.jna.z.a.f.a.a.a.e.a.i a = (com.sun.jna.z.a.f.a.a.a.e.a.i)a.a();int a = g.c;Minecraft a = Minecraft.func_71410_x();
    if (a == 0) {}
    boolean a = a.d() * 2 > a.field_71443_c / 2;
    
    int a = 18;Iterator localIterator = com.sun.jna.z.a.i.d.a.a.values().iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      c a = (c)localIterator.next();
      if (a != 0) {
        break label294;
      }
      if ((a == 0) && ((!a.b()) && (a == 0))) {
        break;
      }
      if ((a != 0) || (a.c()))
      {
        a.i();
        if (a.i() != b.None)
        {
          float a = h.a();
          
          GL11.glPushMatrix();GL11.glScalef(a, a, a);
          if (a.u == null)
          {
            Font a = new Font(w, 0, 22);
            
            a.u = new com.sun.jna.z.a.g.h(a, 22.0F);
          }
          if (a == 0) {}
          a.a().func_175063_a(a.a(), a ? a.d() + a.f() - a.a().func_78256_a(a.a()) - 2 : a.d(), a.e() + a, a.j());
          
          GL11.glPopMatrix();a += 10;
        }
      }
    } while (a == 0);
    if (Minecraft.func_71410_x().field_71462_r != j.e.d())
    {
      a.c(false);
      if (a == 0) {}
    }
    else
    {
      label294:
      a.c(true);
    }
  }
  
  r(h a, String a)
  {
    a.<init>(a);
  }
}
