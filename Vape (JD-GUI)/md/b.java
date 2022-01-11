package md;

import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.f.a.a.a.a.a.d;
import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.a.t;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MouseFilter;
import net.minecraft.util.MovementInput;

public class b
  extends c
{
  boolean h(Entity a)
  {
    double a = 0.0D;
    
    int a = Z;double a = a.field_70165_t - a.b().field_71439_g.field_70165_t;double a = a.field_70161_v - a.b().field_71439_g.field_70161_v;
    if (a == 0) {
      if (a > 0.0D)
      {
        if (a != 0) {
          break label83;
        }
        if (a > 0.0D)
        {
          a = Math.toDegrees(-Math.atan(a / a));
          if (a == 0) {
            break label198;
          }
        }
      }
    }
    label83:
    if (a == 0) {
      if (a > 0.0D)
      {
        if (a != 0) {
          break label122;
        }
        if (a < 0.0D)
        {
          a = Math.toDegrees(-Math.atan(a / a));
          if (a == 0) {
            break label198;
          }
        }
      }
    }
    label122:
    if (a == 0) {
      if (a < 0.0D)
      {
        if (a != 0) {
          break label164;
        }
        if (a > 0.0D)
        {
          a = -90.0D + Math.toDegrees(Math.atan(a / a));
          if (a == 0) {
            break label198;
          }
        }
      }
    }
    label164:
    if (a == 0) {
      if (a < 0.0D)
      {
        if (a != 0) {
          break label216;
        }
        if (a < 0.0D) {
          a = 90.0D + Math.toDegrees(Math.atan(a / a));
        }
      }
    }
    label198:
    label216:
    int a = (int)(Math.abs(a - a.c().field_70177_z) % 360.0D);
    if (a == 0) {}
    return a < 180;
  }
  
  public b()
  {
    a.<init>(a[4], com.sun.jna.z.a.e.b.Combat, -327674);int a = Z;a.v = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[1], 180.0D, 0.0D, 360.0D, 1.0D, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);a.y = new MouseFilter();
    if (G) {
      Z = a == 0;
    }
  }
  
  com.sun.jna.z.a.f.a.a.a.a.i s = new d(a[3]);
  com.sun.jna.z.a.f.a.a.a.a.i u = new d(a[2]);
  
  private int g(Entity a)
  {
    double d1 = 0.0D;
    
    double a = a.field_70165_t - a.b().field_71439_g.field_70165_t;
    
    double a = a.field_70161_v - a.b().field_71439_g.field_70161_v;double a = a.field_70163_u - a.b().field_71439_g.field_70163_u + a.field_70131_O / 2.0F;
    
    int a = Z;double a = Math.atan2(Math.sqrt(a * a + a * a), a) + 3.141592653589793D;int a = (int)(Math.abs(a - a.c().field_70125_A) % 360.0D);int a = (a != 0) || (a > 180) ? 360 - a : a;return a;
  }
  
  public void g()
  {
    a.o = false;int a = Z;
    if (a == 0) {
      if (a.n != null) {
        a.n.a = null;
      }
    }
    a.n = null;
  }
  
  t r = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[0], 4.2D, 0.0D, 8.0D, 0.01D, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);
  
  public void a(Entity a, double a, boolean a)
  {
    a.B = a.z;
    
    a.C = a.A;
    
    a.z = a.field_70142_S;
    
    a.A = a.field_70136_U;
    
    double a = a.field_70165_t - a.z;double d1 = a.field_70161_v - a.A;int a = Z;
    double a;
    if (a == 0)
    {
      if (a != 0.0D)
      {
        if (a != 0) {
          break label126;
        }
        if (a != 0.0D) {}
      }
      else
      {
        a = a.field_70165_t - a.B;
      }
    }
    else {
      a = a.field_70161_v - a.C;
    }
    label126:
    double a = a.field_70165_t + a * 2.0D - a.b().field_71439_g.field_70165_t;
    double a = a.field_70163_u - a.b().field_71439_g.field_70163_u + a.field_70131_O / 2.0F + 0.2D;
    
    double a = a.field_70161_v + a * 2.0D - a.b().field_71439_g.field_70161_v;double a = MathHelper.func_76133_a(a * a + a * a);double a = a.field_70165_t + a * 2.0D - a.b().field_71439_g.field_70165_t;double a = a.field_70161_v + a * 2.0D - a.b().field_71439_g.field_70161_v;float a = (float)-(Math.atan2(a, a) * 180.0D / 3.141592653589793D);int a = a.f(a.p);
    if (a == 0) {
      if (!a.t.a())
      {
        if (a != 0) {
          break label321;
        }
        if (a > a.v.a() / 2.0D) {
          return;
        }
      }
    }
    label321:
    if (a == 0)
    {
      if (a)
      {
        if (a != 0) {
          break label418;
        }
        if (a.g(a.p) > 5)
        {
          float a = a.c().field_70125_A;float a = a.a(a.b().field_71439_g.field_70125_A, a, (float)a / 15.0F) - a;a.c().field_70125_A += a;
        }
      }
      a.F += 1.0D;
      if (a != 0) {
        break label503;
      }
    }
    if (a.F > 100.0D)
    {
      label418:
      a.F = 0.0D;
      a.D = (ThreadLocalRandom.current().nextDouble(-5.0D, 5.0D) / 1000.0D);a.E = (ThreadLocalRandom.current().nextDouble(-5.0D, 5.0D) / 1000.0D);
    }
    EntityPlayerSP tmp470_467 = a.c();tmp470_467.field_70125_A = ((float)(tmp470_467.field_70125_A + a.D)); EntityPlayerSP tmp488_485 = a.c();tmp488_485.field_70177_z = ((float)(tmp488_485.field_70177_z + a.E));
    label503:
    float a = a.c().field_70177_z;
    float a = (float)(Math.atan2(a, a) * 180.0D / 3.141592653589793D) - 90.0F;
    
    a += tmp488_485 / 100.0D;
    
    boolean a = a.h(a.p);
    if (a == 0) {
      if (a.u.a()) {
        if ((a != 0) || ((!a) || ((a != 0) || (a.c().field_71158_b.field_78902_a <= 0.0F))))
        {
          if (a == 0)
          {
            if (!a) {
              if (a != 0) {
                break label658;
              }
            }
          }
          else if (a.c().field_71158_b.field_78902_a >= 0.0F) {}
        }
        else {
          a *= 2.0D;
        }
      }
    }
    label658:
    float a = a.a(a.b().field_71439_g.field_70177_z, a, (float)a / 10.0F) - a;
    if (a == 0)
    {
      if (tmp488_485 > 0)
      {
        a.w += a;a = a.x;
        
        a.x = a.y.func_76333_a(a.w, 0.05F);a.w = 0.0F;
      }
    }
    else {
      a.c().field_70177_z += a;
    }
    if (a != 0) {
      G = !G;
    }
  }
  
  public k[] k()
  {
    return new k[] { a.v, a.q, a.r, a.u, a.s, a.t };
  }
  
  t q = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[6], 3.0D, 1.0D, 5.0D, 0.01D, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);
  
  public void e()
  {
    a.o = true;int a = Z;
    if (a == 0)
    {
      if (a.n == null) {
        a.n = new com.sun.jna.z.a.e.i(a);
      }
    }
    else {
      a.n.a();
    }
  }
  
  public Entity m()
  {
    Entity a = null;double a = 360.0D;Iterator localIterator = a.b().field_71441_e.field_72996_f.iterator();int a = Z;
    do
    {
      Entity a;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        Object a = localIterator.next();
        if (a != 0) {
          break label159;
        }
        a = (Entity)a;
      } while (((a == 0) && ((!a.b(a)) && 
      
        (a == 0))) || (
        
        (a == 0) && ((a.c().func_70032_d(a) > a.r.a()) && (a == 0))));
      double a = a.f(a);
      if ((a != 0) || ((a < a) && ((a != 0) || (a <= a.v.a() / 2.0D))))
      {
        a = a;a = a;
      }
    } while (a == 0);
    label159:
    return a;
  }
  
  private int f(Entity a)
  {
    double a = 0.0D;
    
    double a = a.field_70165_t - a.b().field_71439_g.field_70165_t;
    
    double a = a.field_70161_v - a.b().field_71439_g.field_70161_v;double d1 = a.field_70163_u - a.b().field_71439_g.field_70163_u + a.field_70131_O;
    double a;
    int a = Z;
    if (a == 0) {
      if (a > 0.0D)
      {
        if (a != 0) {
          break label106;
        }
        if (a > 0.0D)
        {
          a = Math.toDegrees(-Math.atan(a / a));
          if (a == 0) {
            break label221;
          }
        }
      }
    }
    label106:
    if (a == 0) {
      if (a > 0.0D)
      {
        if (a != 0) {
          break label145;
        }
        if (a < 0.0D)
        {
          a = Math.toDegrees(-Math.atan(a / a));
          if (a == 0) {
            break label221;
          }
        }
      }
    }
    label145:
    if (a == 0)
    {
      if (a < 0.0D)
      {
        if (a != 0) {
          break label191;
        }
        if (a > 0.0D)
        {
          a = -90.0D + Math.toDegrees(Math.atan(a / a));
          if (a == 0) {
            break label221;
          }
        }
      }
      if (a != 0) {
        break label231;
      }
    }
    if (a < 0.0D)
    {
      label191:
      if (a != 0) {
        break label231;
      }
      if (a < 0.0D) {
        a = 90.0D + Math.toDegrees(Math.atan(a / a));
      }
    }
    label221:
    label231:
    double a = Math.sqrt(a * a + a * a);
    double a = -Math.toDegrees(Math.atan(a / a));int a = (int)(Math.abs(a - a.c().field_70177_z) % 360.0D);
    
    int a = (a != 0) || (a > 180) ? 360 - a : a;return a;
  }
  
  com.sun.jna.z.a.f.a.a.a.a.i t = new d(a[5]);
  com.sun.jna.z.a.e.i n;
  boolean o;
  EntityLivingBase p;
  t v;
  private float w;
  private float x;
  private MouseFilter y;
  double z;
  double A;
  double B;
  double C;
  double D;
  double E;
  double F;
  public static boolean G;
  public static int H;
  public static boolean I;
  public static boolean J;
  public static boolean K;
  public static int L;
  public static boolean M;
  public static boolean N;
  public static int O;
  public static int P;
  public static boolean Q;
  public static int R;
  public static boolean S;
  public static int T;
  public static boolean U;
  public static boolean V;
  public static int W;
  public static boolean X;
  public static boolean Y;
  public static boolean Z;
  private static final String[] aa;
  
  public float a(float a, float a, float a)
  {
    float a = (float)MathHelper.func_76138_g(a - a);int a = Z;
    if (a == 0)
    {
      if (a > a) {
        a = a;
      }
      if (a != 0) {}
    }
    else if (a < -a)
    {
      a = -a;
    }
    return a + a;
  }
  
  public Entity n()
  {
    return a.p;
  }
  
  /* Error */
  public void h()
  {
    // Byte code:
    //   0: getstatic 390	md/b:Z	Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 104	md/b:o	Z
    //   8: ifeq +454 -> 462
    //   11: lconst_1
    //   12: invokestatic 110	java/lang/Thread:sleep	(J)V
    //   15: aload_0
    //   16: invokevirtual 114	md/b:c	()Z
    //   19: iload_1
    //   20: ifne +14 -> 34
    //   23: ifne +7 -> 30
    //   26: iload_1
    //   27: ifeq -23 -> 4
    //   30: aload_0
    //   31: invokevirtual 117	md/b:e	()Z
    //   34: iload_1
    //   35: ifne +31 -> 66
    //   38: ifeq +11 -> 49
    //   41: goto +4 -> 45
    //   44: athrow
    //   45: iload_1
    //   46: ifeq -42 -> 4
    //   49: aload_0
    //   50: iload_1
    //   51: ifne +43 -> 94
    //   54: getfield 83	md/b:t	Lcom/sun/jna/z/a/f/a/a/a/a/i;
    //   57: invokeinterface 121 1 0
    //   62: goto +4 -> 66
    //   65: athrow
    //   66: ifeq +27 -> 93
    //   69: iconst_0
    //   70: invokestatic 127	org/lwjgl/input/Mouse:isButtonDown	(I)Z
    //   73: ifne +20 -> 93
    //   76: goto +4 -> 80
    //   79: athrow
    //   80: goto +4 -> 84
    //   83: athrow
    //   84: aload_0
    //   85: aconst_null
    //   86: putfield 129	md/b:p	Lnet/minecraft/entity/EntityLivingBase;
    //   89: iload_1
    //   90: ifeq -86 -> 4
    //   93: aload_0
    //   94: iload_1
    //   95: ifne +83 -> 178
    //   98: getfield 129	md/b:p	Lnet/minecraft/entity/EntityLivingBase;
    //   101: ifnull +76 -> 177
    //   104: goto +4 -> 108
    //   107: athrow
    //   108: aload_0
    //   109: iload_1
    //   110: ifne +59 -> 169
    //   113: aload_0
    //   114: getfield 129	md/b:p	Lnet/minecraft/entity/EntityLivingBase;
    //   117: invokevirtual 132	md/b:a	(Lnet/minecraft/entity/Entity;)Z
    //   120: ifne +48 -> 168
    //   123: goto +4 -> 127
    //   126: athrow
    //   127: goto +4 -> 131
    //   130: athrow
    //   131: aload_0
    //   132: invokevirtual 135	md/b:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   135: aload_0
    //   136: getfield 129	md/b:p	Lnet/minecraft/entity/EntityLivingBase;
    //   139: invokevirtual 141	net/minecraft/client/entity/EntityPlayerSP:func_70032_d	(Lnet/minecraft/entity/Entity;)F
    //   142: f2d
    //   143: aload_0
    //   144: getfield 74	md/b:r	Lcom/sun/jna/z/a/f/a/a/a/a/t;
    //   147: invokeinterface 146 1 0
    //   152: dcmpl
    //   153: iload_1
    //   154: ifne +32 -> 186
    //   157: ifle +20 -> 177
    //   160: goto +4 -> 164
    //   163: athrow
    //   164: goto +4 -> 168
    //   167: athrow
    //   168: aload_0
    //   169: aconst_null
    //   170: putfield 129	md/b:p	Lnet/minecraft/entity/EntityLivingBase;
    //   173: goto +4 -> 177
    //   176: athrow
    //   177: aload_0
    //   178: getfield 83	md/b:t	Lcom/sun/jna/z/a/f/a/a/a/a/i;
    //   181: invokeinterface 121 1 0
    //   186: iload_1
    //   187: ifne +65 -> 252
    //   190: ifeq +45 -> 235
    //   193: goto +4 -> 197
    //   196: athrow
    //   197: iconst_0
    //   198: invokestatic 127	org/lwjgl/input/Mouse:isButtonDown	(I)Z
    //   201: iload_1
    //   202: ifne +50 -> 252
    //   205: ifeq +30 -> 235
    //   208: goto +4 -> 212
    //   211: athrow
    //   212: goto +4 -> 216
    //   215: athrow
    //   216: aload_0
    //   217: iload_1
    //   218: ifne +42 -> 260
    //   221: getfield 129	md/b:p	Lnet/minecraft/entity/EntityLivingBase;
    //   224: ifnull +35 -> 259
    //   227: goto +4 -> 231
    //   230: athrow
    //   231: goto +4 -> 235
    //   234: athrow
    //   235: aload_0
    //   236: iload_1
    //   237: ifne +38 -> 275
    //   240: getfield 83	md/b:t	Lcom/sun/jna/z/a/f/a/a/a/a/i;
    //   243: invokeinterface 121 1 0
    //   248: goto +4 -> 252
    //   251: athrow
    //   252: ifne +22 -> 274
    //   255: goto +4 -> 259
    //   258: athrow
    //   259: aload_0
    //   260: aload_0
    //   261: invokevirtual 150	md/b:m	()Lnet/minecraft/entity/Entity;
    //   264: checkcast 152	net/minecraft/entity/EntityLivingBase
    //   267: putfield 129	md/b:p	Lnet/minecraft/entity/EntityLivingBase;
    //   270: goto +4 -> 274
    //   273: athrow
    //   274: aload_0
    //   275: iload_1
    //   276: ifne +168 -> 444
    //   279: getfield 129	md/b:p	Lnet/minecraft/entity/EntityLivingBase;
    //   282: ifnull +157 -> 439
    //   285: goto +4 -> 289
    //   288: athrow
    //   289: aload_0
    //   290: iload_1
    //   291: ifne +153 -> 444
    //   294: invokevirtual 156	md/b:b	()Lnet/minecraft/client/Minecraft;
    //   297: getfield 162	net/minecraft/client/Minecraft:field_71462_r	Lnet/minecraft/client/gui/GuiScreen;
    //   300: ifnonnull +139 -> 439
    //   303: goto +4 -> 307
    //   306: athrow
    //   307: goto +4 -> 311
    //   310: athrow
    //   311: aload_0
    //   312: iload_1
    //   313: ifne +131 -> 444
    //   316: aload_0
    //   317: getfield 129	md/b:p	Lnet/minecraft/entity/EntityLivingBase;
    //   320: invokevirtual 165	md/b:a	(Lnet/minecraft/entity/EntityLivingBase;)Z
    //   323: ifne +116 -> 439
    //   326: goto +4 -> 330
    //   329: athrow
    //   330: goto +4 -> 334
    //   333: athrow
    //   334: aload_0
    //   335: getfield 68	md/b:q	Lcom/sun/jna/z/a/f/a/a/a/a/t;
    //   338: invokeinterface 146 1 0
    //   343: dstore_2
    //   344: aload_0
    //   345: iload_1
    //   346: ifne +68 -> 414
    //   349: getfield 168	md/b:a	Lnet/minecraft/client/Minecraft;
    //   352: getfield 172	net/minecraft/client/Minecraft:field_71476_x	Lnet/minecraft/util/MovingObjectPosition;
    //   355: ifnull +58 -> 413
    //   358: goto +4 -> 362
    //   361: athrow
    //   362: aload_0
    //   363: getfield 168	md/b:a	Lnet/minecraft/client/Minecraft;
    //   366: getfield 172	net/minecraft/client/Minecraft:field_71476_x	Lnet/minecraft/util/MovingObjectPosition;
    //   369: getfield 178	net/minecraft/util/MovingObjectPosition:field_72308_g	Lnet/minecraft/entity/Entity;
    //   372: astore 4
    //   374: iload_1
    //   375: ifne +60 -> 435
    //   378: aload 4
    //   380: ifnull +33 -> 413
    //   383: goto +4 -> 387
    //   386: athrow
    //   387: aload 4
    //   389: aload_0
    //   390: getfield 129	md/b:p	Lnet/minecraft/entity/EntityLivingBase;
    //   393: invokevirtual 184	net/minecraft/entity/Entity:equals	(Ljava/lang/Object;)Z
    //   396: ifeq +17 -> 413
    //   399: goto +4 -> 403
    //   402: athrow
    //   403: goto +4 -> 407
    //   406: athrow
    //   407: dload_2
    //   408: ldc2_w 185
    //   411: dmul
    //   412: dstore_2
    //   413: aload_0
    //   414: aload_0
    //   415: getfield 129	md/b:p	Lnet/minecraft/entity/EntityLivingBase;
    //   418: dload_2
    //   419: ldc2_w 187
    //   422: ddiv
    //   423: aload_0
    //   424: getfield 81	md/b:s	Lcom/sun/jna/z/a/f/a/a/a/a/i;
    //   427: invokeinterface 121 1 0
    //   432: invokevirtual 191	md/b:a	(Lnet/minecraft/entity/Entity;DZ)V
    //   435: iload_1
    //   436: ifeq +18 -> 454
    //   439: aload_0
    //   440: goto +4 -> 444
    //   443: athrow
    //   444: new 93	net/minecraft/util/MouseFilter
    //   447: dup
    //   448: invokespecial 95	net/minecraft/util/MouseFilter:<init>	()V
    //   451: putfield 97	md/b:y	Lnet/minecraft/util/MouseFilter;
    //   454: goto -450 -> 4
    //   457: astore_2
    //   458: iload_1
    //   459: ifeq -455 -> 4
    //   462: return
    // Line number table:
    //   Java source line #108	-> byte code offset #4
    //   Java source line #25	-> byte code offset #11
    //   Java source line #5	-> byte code offset #15
    //   Java source line #85	-> byte code offset #26
    //   Java source line #93	-> byte code offset #30
    //   Java source line #24	-> byte code offset #45
    //   Java source line #145	-> byte code offset #49
    //   Java source line #44	-> byte code offset #84
    //   Java source line #53	-> byte code offset #89
    //   Java source line #104	-> byte code offset #93
    //   Java source line #141	-> byte code offset #168
    //   Java source line #122	-> byte code offset #177
    //   Java source line #146	-> byte code offset #259
    //   Java source line #138	-> byte code offset #274
    //   Java source line #112	-> byte code offset #334
    //   Java source line #126	-> byte code offset #344
    //   Java source line #36	-> byte code offset #362
    //   Java source line #131	-> byte code offset #374
    //   Java source line #32	-> byte code offset #387
    //   Java source line #101	-> byte code offset #407
    //   Java source line #114	-> byte code offset #413
    //   Java source line #144	-> byte code offset #435
    //   Java source line #46	-> byte code offset #439
    //   Java source line #27	-> byte code offset #454
    //   Java source line #105	-> byte code offset #457
    //   Java source line #128	-> byte code offset #458
    //   Java source line #124	-> byte code offset #462
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	463	0	a	b
    //   3	459	1	a	int
    //   344	91	2	a	double
    //   374	39	4	a	Entity
    // Exception table:
    //   from	to	target	type
    //   34	41	44	java/lang/Exception
    //   49	62	65	java/lang/Exception
    //   66	76	79	java/lang/Exception
    //   49	80	83	java/lang/Exception
    //   94	104	107	java/lang/Exception
    //   108	123	126	java/lang/Exception
    //   93	127	130	java/lang/Exception
    //   131	160	163	java/lang/Exception
    //   108	164	167	java/lang/Exception
    //   131	173	176	java/lang/Exception
    //   186	193	196	java/lang/Exception
    //   197	208	211	java/lang/Exception
    //   177	212	215	java/lang/Exception
    //   216	227	230	java/lang/Exception
    //   197	231	234	java/lang/Exception
    //   235	248	251	java/lang/Exception
    //   216	255	258	java/lang/Exception
    //   235	270	273	java/lang/Exception
    //   275	285	288	java/lang/Exception
    //   289	303	306	java/lang/Exception
    //   274	307	310	java/lang/Exception
    //   311	326	329	java/lang/Exception
    //   289	330	333	java/lang/Exception
    //   344	358	361	java/lang/Exception
    //   374	383	386	java/lang/Exception
    //   378	399	402	java/lang/Exception
    //   374	403	406	java/lang/Exception
    //   435	440	443	java/lang/Exception
    //   11	26	457	java/lang/Exception
    //   30	45	457	java/lang/Exception
    //   49	89	457	java/lang/Exception
    //   93	454	457	java/lang/Exception
  }
}
