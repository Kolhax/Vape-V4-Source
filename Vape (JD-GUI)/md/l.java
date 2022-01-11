package md;

import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.a.t;
import com.sun.jna.z.a.g.p;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class l
  extends c
{
  int n;
  ItemStack o;
  boolean p;
  EntityFishHook q;
  p r;
  t s;
  boolean t;
  com.sun.jna.z.a.e.i u;
  public static boolean v;
  public static int w;
  public static boolean x;
  public static boolean y;
  public static boolean z;
  public static int A;
  public static boolean B;
  public static boolean C;
  public static int D;
  public static int E;
  public static boolean F;
  public static int G;
  public static boolean H;
  public static int I;
  public static boolean J;
  public static boolean K;
  public static int L;
  public static boolean M;
  public static boolean N;
  public static boolean O;
  private static final String[] P;
  
  public void f()
  {
    a.c().field_71071_by.field_70461_c = a.n;a.n = 0;a.o = null;int a = O;a.p = false;a.q = null;
    if (v) {
      O = a == 0;
    }
  }
  
  public void e()
  {
    a.t = true;
    
    int a = O;
    if (a == 0) {
      if (a.u == null)
      {
        a.u = new com.sun.jna.z.a.e.i(a);a.u.a();
      }
    }
    a.n = a.c().field_71071_by.field_70461_c;
  }
  
  public void g()
  {
    a.t = false;
    
    int a = O;
    if (a == 0) {
      if (a.u != null) {
        a.u.a = null;
      }
    }
    a.u = null;
  }
  
  public void a(TickEvent.PlayerTickEvent a)
  {
    int a = O;
    if (a == 0) {
      if (a.o != null)
      {
        if (a == 0) {
          if (!a.p)
          {
            a.b().field_71442_b.func_78769_a(a.c(), a.b().field_71441_e, a.o);a.p = true;
          }
        }
        a.q = a.c().field_71104_cf; return;
      }
    }
    InventoryPlayer a = a.c().field_71071_by;
    
    int a = 0;
    do
    {
      if (a >= 9) {
        break;
      }
      a.o = a.field_70462_a[a];
      if ((a != 0) || ((a.o != null) || (a != 0)))
      {
        Item a = a.o.func_77973_b();
        if (a != 0) {
          continue;
        }
        if ((a != null) && ((a instanceof ItemFishingRod)))
        {
          a.c().field_71071_by.field_70461_c = a;a.r.c();
          if (a == 0) {
            break;
          }
        }
      }
      a++;
    } while (a == 0);
  }
  
  public k[] k()
  {
    return new k[] { a.s };
  }
  
  public l()
  {
    a.<init>(a[0], com.sun.jna.z.a.e.b.Utility, -16777216);int a = O;a.r = new p();
    
    a.s = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[1], 500.0D, 100.0D, 1000.0D, 1.0D, com.sun.jna.z.a.f.a.a.a.a.b.INTEGER);
    if (a != 0) {
      v = !v;
    }
  }
  
  /* Error */
  public void h()
  {
    // Byte code:
    //   0: getstatic 206	md/l:O	Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 127	md/l:t	Z
    //   8: ifeq +119 -> 127
    //   11: ldc2_w 128
    //   14: invokestatic 135	java/lang/Thread:sleep	(J)V
    //   17: aload_0
    //   18: invokevirtual 138	md/l:c	()Z
    //   21: iload_1
    //   22: ifne +11 -> 33
    //   25: ifne +7 -> 32
    //   28: iload_1
    //   29: ifeq -25 -> 4
    //   32: iconst_0
    //   33: istore_2
    //   34: aload_0
    //   35: iload_1
    //   36: ifne +35 -> 71
    //   39: getfield 97	md/l:q	Lnet/minecraft/entity/projectile/EntityFishHook;
    //   42: ifnull +28 -> 70
    //   45: goto +4 -> 49
    //   48: athrow
    //   49: aload_0
    //   50: getfield 97	md/l:q	Lnet/minecraft/entity/projectile/EntityFishHook;
    //   53: getfield 144	net/minecraft/entity/projectile/EntityFishHook:field_146043_c	Lnet/minecraft/entity/Entity;
    //   56: ifnull +12 -> 68
    //   59: goto +4 -> 63
    //   62: athrow
    //   63: iconst_1
    //   64: goto +5 -> 69
    //   67: athrow
    //   68: iconst_0
    //   69: istore_2
    //   70: aload_0
    //   71: iload_1
    //   72: ifne +35 -> 107
    //   75: getfield 42	md/l:r	Lcom/sun/jna/z/a/g/p;
    //   78: aload_0
    //   79: getfield 59	md/l:s	Lcom/sun/jna/z/a/f/a/a/a/a/t;
    //   82: invokeinterface 149 1 0
    //   87: d2l
    //   88: invokevirtual 152	com/sun/jna/z/a/g/p:a	(J)Z
    //   91: ifne +15 -> 106
    //   94: goto +4 -> 98
    //   97: athrow
    //   98: iload_2
    //   99: ifeq +16 -> 115
    //   102: goto +4 -> 106
    //   105: athrow
    //   106: aload_0
    //   107: iconst_0
    //   108: invokevirtual 155	md/l:a	(Z)V
    //   111: goto +4 -> 115
    //   114: athrow
    //   115: goto -111 -> 4
    //   118: astore_2
    //   119: aload_2
    //   120: invokevirtual 158	java/lang/InterruptedException:printStackTrace	()V
    //   123: iload_1
    //   124: ifeq -120 -> 4
    //   127: return
    // Line number table:
    //   Java source line #50	-> byte code offset #4
    //   Java source line #4	-> byte code offset #11
    //   Java source line #33	-> byte code offset #17
    //   Java source line #1	-> byte code offset #28
    //   Java source line #34	-> byte code offset #32
    //   Java source line #24	-> byte code offset #34
    //   Java source line #25	-> byte code offset #49
    //   Java source line #9	-> byte code offset #70
    //   Java source line #46	-> byte code offset #106
    //   Java source line #23	-> byte code offset #115
    //   Java source line #3	-> byte code offset #118
    //   Java source line #52	-> byte code offset #119
    //   Java source line #13	-> byte code offset #123
    //   Java source line #43	-> byte code offset #127
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	a	l
    //   3	121	1	a	int
    //   33	66	2	a	boolean
    //   118	2	2	a	InterruptedException
    //   48	1	4	localInterruptedException1	InterruptedException
    //   62	1	5	localInterruptedException2	InterruptedException
    //   67	1	6	localInterruptedException3	InterruptedException
    //   97	1	7	localInterruptedException4	InterruptedException
    //   105	1	8	localInterruptedException5	InterruptedException
    //   114	1	9	localInterruptedException6	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   34	45	48	java/lang/InterruptedException
    //   34	59	62	java/lang/InterruptedException
    //   49	67	67	java/lang/InterruptedException
    //   71	94	97	java/lang/InterruptedException
    //   70	102	105	java/lang/InterruptedException
    //   98	111	114	java/lang/InterruptedException
    //   11	28	118	java/lang/InterruptedException
    //   32	115	118	java/lang/InterruptedException
  }
}
