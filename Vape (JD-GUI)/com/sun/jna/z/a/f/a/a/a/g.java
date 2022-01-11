package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.n;
import com.sun.jna.z.a.f.a.a.a.e.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.opengl.GL11;

public abstract class g
  implements j
{
  public void a(e a)
  {
    a.b = a;int a = c;Iterator localIterator = a.a.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      n a = (n)localIterator.next();
      
      a.a(a);
      if (a != 0) {
        return;
      }
    } while (a == 0);
    a.b();
  }
  
  public void a(n a)
  {
    a.a(a.b);
    
    a.a.add(0, a);
  }
  
  public void e()
  {
    n[] arrayOfn1 = a.b();int a = c;
    n[] a;
    int a = a.length - 1;
    do
    {
      if (a < 0) {
        break;
      }
      if (a[a].b())
      {
        Minecraft a = Minecraft.func_71410_x();ScaledResolution a = new ScaledResolution(Minecraft.func_71410_x(), Minecraft.func_71410_x().field_71443_c, Minecraft.func_71410_x().field_71440_d);
        
        int a = a.func_78325_e();float a = h.a();GL11.glPushMatrix();GL11.glScalef(a, a, a);a[a].b();GL11.glPopMatrix();
      }
      a--;
    } while (a == 0);
  }
  
  public void b(n a)
  {
    a.a.remove(a);
  }
  
  public n[] b()
  {
    return (n[])a.a.toArray(new n[a.a.size()]);
  }
  
  public final List<n> a = new CopyOnWriteArrayList();
  private e b;
  public static int c;
  
  public void c(n a)
  {
    int a = c;
    if ((a != 0) || (a.a.remove(a))) {
      a.a.add(0, a);
    }
  }
  
  public void d()
  {
    n[] a = a.b();
    
    int a = c;int a = a.length - 1;
    do
    {
      if (a < 0) {
        break;
      }
      n a = a[a];int a = 2;
      
      GL11.glEnable(3089);GL11.glScissor(
      
        a.d() * a, Minecraft.func_71410_x().field_71440_d - a.e() * a - a.g() * a, a
        
        .f() * a, a.g() * a);a[a].b();
      
      GL11.glDisable(3089);a--;
    } while (a == 0);
  }
  
  public void f()
  {
    n[] a = a.b();int a = c;int a = a.length - 1;
    do
    {
      if (a < 0) {
        break;
      }
      a[a].c();
      
      a--;
    } while (a == 0);
  }
  
  public e c()
  {
    return a.b;
  }
  
  public abstract void a();
  
  protected abstract void b();
}
