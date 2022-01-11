package md;

import com.sun.jna.z.a.e.b;
import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.a.t;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemStack;

public class n
  extends c
{
  com.sun.jna.z.a.e.i n;
  boolean o;
  InventoryPlayer p;
  int q;
  t r = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[1], 100.0D, 0.0D, 200.0D, 1);
  public static boolean s;
  public static int t;
  public static boolean u;
  public static boolean v;
  public static boolean w;
  public static int x;
  public static boolean y;
  public static boolean z;
  public static int A;
  public static int B;
  public static boolean C;
  public static int D;
  public static boolean E;
  public static int F;
  public static boolean G;
  public static boolean H;
  public static int I;
  public static boolean J;
  public static boolean K;
  public static boolean L;
  private static final String[] M;
  
  public void h()
  {
    int a = a.b().field_71474_y.field_74313_G.func_151463_i();
    
    KeyBinding.func_74510_a(a, true);
    
    KeyBinding.func_74507_a(a);KeyBinding.func_74510_a(a, false);
    try
    {
      Thread.sleep(a.r.a());
    }
    catch (InterruptedException localInterruptedException) {}
    a.p.field_70461_c = a.q;
  }
  
  public k[] k()
  {
    return new k[] { a.r };
  }
  
  public void g()
  {
    a.o = false;int a = L;
    if (a == 0) {
      if (a.n != null) {
        a.n.a = null;
      }
    }
    a.n = null;
  }
  
  public void e()
  {
    a.o = true;int a = L;
    if (a == 0)
    {
      if (a.n == null) {
        a.n = new com.sun.jna.z.a.e.i(a);
      }
      a.p = a.c().field_71071_by;
    }
    a.q = a.p.field_70461_c;int a = 0;
    label139:
    do
    {
      if (a >= 9) {
        break;
      }
      ItemStack a = a.p.field_70462_a[a];
      if (a != 0) {
        return;
      }
      if (a == 0) {
        if (a == null)
        {
          if (a == 0) {
            break label139;
          }
          s = !s;
        }
      }
      Item a = a.func_77973_b();
      if (a == 0)
      {
        if ((a instanceof ItemEnderPearl))
        {
          a.p.field_70461_c = a;a.n.a();
          if (a == 0) {
            break;
          }
        }
        a++;
      }
    } while (a == 0);
    a.a(false);
  }
  
  public n()
  {
    a.<init>(a[0], b.Utility, 0);int a = L;
    if (s) {
      L = a == 0;
    }
  }
}
