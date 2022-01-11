package md;

import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.f.a.a.a.a.a.i;
import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.a.t;
import java.text.DecimalFormat;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class g
  extends c
{
  t n;
  t o;
  private float p;
  World q;
  EntityPlayerSP r;
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
  
  public g()
  {
    a.<init>(a[2], com.sun.jna.z.a.e.b.Combat, -65404);int a = L;
    
    a.n = new i(a[0], 100.0D, 0.0D, 100.0D, 1.0D, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);
    
    a.o = new i(a[1], 100.0D, 0.0D, 100.0D, 1.0D, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);a.p = -999.0F;
    if (s) {
      L = a == 0;
    }
  }
  
  double a(double a, double a)
  {
    String str1 = Double.toString(Math.abs(a));
    String a;
    int a = L;
    if (a == 0) {}
    String a = a.contains(",") ? "," : ".";int a = a.indexOf(a);int a = a.length() - a - 1;String a = a;
    for (int a = 0; a < a;)
    {
      a = a + "#";a++;
      if (a != 0) {
        s = !s;
      }
    }
    DecimalFormat a = new DecimalFormat(a);
    
    double a = Double.valueOf(a.format(a * a).replace(",", ".")).doubleValue();return a;
  }
  
  public k[] k()
  {
    return new k[] { a.n, a.o };
  }
  
  public void a(LivingEvent.LivingUpdateEvent a)
  {
    int a = L;
    if (a == 0)
    {
      if (a.q != null)
      {
        if (a != 0) {
          break label55;
        }
        if (a.q.equals(a.b().field_71441_e)) {}
      }
      else
      {
        a.q = a.b().field_71441_e;
      }
    }
    else
    {
      a.p = -999.0F;return;
    }
    label55:
    if (a == 0)
    {
      if (a.r != null)
      {
        if (a != 0) {
          break label109;
        }
        if (a.r.equals(a.c())) {}
      }
      else
      {
        a.r = a.c();
      }
    }
    else
    {
      a.p = -999.0F;return;
    }
    if (a.entity.equals(a.c()))
    {
      label109:
      float a = a.c().func_110143_aJ();
      if (a == 0) {
        if (a.p != -999.0F)
        {
          if (a != 0) {
            break label162;
          }
          if (a <= a.p) {
            break label156;
          }
        }
      }
      a.p = a;
      if (a != 0) {
        label156:
        label162:
        if (((a != 0) || (a < a.p)) && (((a == 0) && (a.c().field_70159_w != 0.0D)) || ((a != 0) || ((a.c().field_70181_x != 0.0D) || (a.c().field_70179_y != 0.0D)))))
        {
          Random a = new Random();
          
          double a = a.nextDouble();
          
          double a = a.o.a();
          double a = a + (a + 5.0D - a) * a;
          if (a == 0) {
            if (a >= 100.0D) {
              a = 100.0D;
            }
          }
          double a = a.n.a();double a = a + (a + 5.0D - a) * a;
          if (a == 0) {
            if (a >= 100.0D) {
              a = 100.0D;
            }
          }
          double a = a / 100.0D;double a = a / 100.0D;a.c().field_70159_w = a.a(a.c().field_70159_w, a);a.c().field_70181_x = a.a(a.c().field_70181_x, a);a.c().field_70179_y = a.a(a.c().field_70179_y, a);
          if (a == 0) {
            if (a <= 1.0D)
            {
              a.c().field_70159_w = 0.0D;
              
              a.c().field_70179_y = 0.0D;
            }
          }
          if (a <= 1.0D) {
            a.c().field_70181_x = 0.0D;
          }
          a.p = a;
        }
      }
    }
  }
}
