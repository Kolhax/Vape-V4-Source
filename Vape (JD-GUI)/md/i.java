package md;

import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.a.t;
import com.sun.jna.z.a.f.a.a.a.f.a;
import com.sun.jna.z.a.g.d;
import com.sun.jna.z.a.j;
import java.awt.Color;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

public class i
  extends c
{
  public com.sun.jna.z.a.e.m d(int a)
  {
    Iterator localIterator = a.r.iterator();int a = R;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      com.sun.jna.z.a.e.m a = (com.sun.jna.z.a.e.m)localIterator.next();
      if (a == 0)
      {
        if (!a.a()) {
          continue;
        }
        if (a != 0) {}
      }
      else
      {
        if (a.s != a) {
          continue;
        }
      }
      return a;
    } while (a == 0);
    return null;
  }
  
  public d a(int a, int a, int a)
  {
    Iterator localIterator = a.q.iterator();int a = R;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      d a = (d)localIterator.next();
      if (((a != 0) || (a.a == a)) && ((a != 0) || ((a.b == a) && ((a != 0) || (a.c == a))))) {
        return a;
      }
    } while (a == 0);
    return null;
  }
  
  public void a(AxisAlignedBB a, int a)
  {
    GL11.glPushMatrix();GL11.glEnable(3042);GL11.glBlendFunc(770, 771);GL11.glLineWidth(1.5F);GL11.glDisable(2896);GL11.glDisable(3553);
    
    GL11.glEnable(2848);GL11.glDisable(2929);GL11.glDepthMask(false);Color a = a.a(a);GL11.glColor4d(a.getBlue() / 255.0F, a.getGreen() / 255.0F, a.getRed() / 255.0F, 1.0D);j.e.f.b();double a = a.field_72336_d - com.sun.jna.z.a.i.d.i.a();double a = a.field_72340_a - com.sun.jna.z.a.i.d.i.a();double a = a.field_72337_e - com.sun.jna.z.a.i.d.i.b();double a = a.field_72338_b - com.sun.jna.z.a.i.d.i.b();double a = a.field_72334_f - com.sun.jna.z.a.i.d.i.c();double a = a.field_72339_c - com.sun.jna.z.a.i.d.i.c();j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);j.e.f.a(a, a, a);int a = R;j.e.f.a(a, a, a);j.e.f.c();GL11.glDepthMask(true);GL11.glEnable(2929);GL11.glEnable(3553);GL11.glEnable(2896);GL11.glDisable(2848);GL11.glDisable(3042);GL11.glPopMatrix();
    if (a != 0) {
      y = !y;
    }
  }
  
  com.sun.jna.z.a.e.m v = new com.sun.jna.z.a.e.m(a[2], true, 14, 16772608, a.q);
  CopyOnWriteArrayList<com.sun.jna.z.a.e.m> r = new CopyOnWriteArrayList();
  com.sun.jna.z.a.e.m t = new com.sun.jna.z.a.e.m(a[3], true, 56, -9379585, a.q);
  com.sun.jna.z.a.e.m u = new com.sun.jna.z.a.e.m(a[6], false, 15, 15773043, a.q);
  
  public void a(float a)
  {
    int i = (int)a.n.a();
    int a;
    int a = 
    
      R;Iterator localIterator = a.q.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      d a = (d)localIterator.next();
      if ((a != 0) || (a.c().func_70011_f(a.a, a.b, a.c) <= a)) {
        a.a(AxisAlignedBB.func_178781_a(a.a, a.b, a.c, a.a + 1, a.b + 1, a.c + 1), a.e);
      }
    } while (a == 0);
  }
  
  public void e()
  {
    a.o = true;int a = R;
    if ((a != 0) || (a.p == null))
    {
      a.p = new com.sun.jna.z.a.e.l(a);new Thread(a.p).start();
    }
  }
  
  Queue<d> s = new ConcurrentLinkedDeque();
  
  public void g()
  {
    a.o = false;int a = R;
    if (a == 0)
    {
      if (a.p != null) {
        a.p.a = null;
      }
      a.q.clear();a.r.clear();
    }
    a.p = null;
  }
  
  public k[] k()
  {
    a.r.add(a.t);a.r.add(a.u);
    
    a.r.add(a.v);a.r.add(a.w);a.r.add(a.x);return new k[] { a.x, a.w, a.v, a.u, a.t, a.n };
  }
  
  public i()
  {
    a.<init>(a[5], com.sun.jna.z.a.e.b.Render, -16737793);
    
    int a = 
    
      R;a.x = new com.sun.jna.z.a.e.m(a[1], false, 11, 16742144, a.q);
    if (y) {
      R = a == 0;
    }
  }
  
  t n = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[4], 60.0D, 10.0D, 100.0D, 0.01D, com.sun.jna.z.a.f.a.a.a.a.b.INTEGER);
  CopyOnWriteArrayList<d> q = new CopyOnWriteArrayList();
  com.sun.jna.z.a.e.m w = new com.sun.jna.z.a.e.m(a[0], false, 16, 2368548, a.q);
  boolean o;
  com.sun.jna.z.a.e.l p;
  com.sun.jna.z.a.e.m x;
  public static boolean y;
  public static int z;
  public static boolean A;
  public static boolean B;
  public static boolean C;
  public static int D;
  public static boolean E;
  public static boolean F;
  public static int G;
  public static int H;
  public static boolean I;
  public static int J;
  public static boolean K;
  public static int L;
  public static boolean M;
  public static boolean N;
  public static int O;
  public static boolean P;
  public static boolean Q;
  public static boolean R;
  private static final String[] S;
  
  /* Error */
  public void m()
  {
    // Byte code:
    //   0: getstatic 401	md/i:R	Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 256	md/i:o	Z
    //   8: ifeq +408 -> 416
    //   11: ldc2_w 281
    //   14: invokestatic 286	java/lang/Thread:sleep	(J)V
    //   17: aload_0
    //   18: getfield 81	md/i:s	Ljava/util/Queue;
    //   21: invokeinterface 291 1 0
    //   26: ifne +85 -> 111
    //   29: aload_0
    //   30: getfield 81	md/i:s	Ljava/util/Queue;
    //   33: invokeinterface 294 1 0
    //   38: checkcast 120	com/sun/jna/z/a/g/d
    //   41: astore_2
    //   42: aload_0
    //   43: aload_2
    //   44: getfield 127	com/sun/jna/z/a/g/d:a	I
    //   47: aload_2
    //   48: getfield 130	com/sun/jna/z/a/g/d:b	I
    //   51: aload_2
    //   52: getfield 132	com/sun/jna/z/a/g/d:c	I
    //   55: invokevirtual 297	md/i:a	(III)Lcom/sun/jna/z/a/g/d;
    //   58: astore_3
    //   59: iload_1
    //   60: ifne -56 -> 4
    //   63: aload_3
    //   64: ifnonnull +43 -> 107
    //   67: aload_0
    //   68: aload_2
    //   69: getfield 300	com/sun/jna/z/a/g/d:d	I
    //   72: invokevirtual 303	md/i:d	(I)Lcom/sun/jna/z/a/e/m;
    //   75: astore 4
    //   77: iload_1
    //   78: ifne +25 -> 103
    //   81: aload 4
    //   83: ifnull +24 -> 107
    //   86: goto +4 -> 90
    //   89: athrow
    //   90: aload_0
    //   91: getfield 74	md/i:q	Ljava/util/concurrent/CopyOnWriteArrayList;
    //   94: aload_2
    //   95: invokevirtual 307	java/util/concurrent/CopyOnWriteArrayList:add	(Ljava/lang/Object;)Z
    //   98: pop
    //   99: goto +4 -> 103
    //   102: athrow
    //   103: goto +4 -> 107
    //   106: athrow
    //   107: iload_1
    //   108: ifeq -91 -> 17
    //   111: iconst_5
    //   112: istore_2
    //   113: iload_2
    //   114: ineg
    //   115: istore_3
    //   116: iload_3
    //   117: iload_2
    //   118: if_icmpge +286 -> 404
    //   121: iload_2
    //   122: ineg
    //   123: iload_1
    //   124: ifne -116 -> 8
    //   127: istore 4
    //   129: iload 4
    //   131: iload_2
    //   132: if_icmpge +265 -> 397
    //   135: iload_2
    //   136: ineg
    //   137: iload_1
    //   138: ifne -21 -> 117
    //   141: istore 5
    //   143: iload 5
    //   145: iload_2
    //   146: if_icmpge +244 -> 390
    //   149: aload_0
    //   150: invokevirtual 124	md/i:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   153: getfield 310	net/minecraft/client/entity/EntityPlayerSP:field_70165_t	D
    //   156: d2i
    //   157: iload_3
    //   158: iadd
    //   159: istore 6
    //   161: aload_0
    //   162: invokevirtual 124	md/i:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   165: getfield 313	net/minecraft/client/entity/EntityPlayerSP:field_70163_u	D
    //   168: d2i
    //   169: iload 5
    //   171: iadd
    //   172: istore 7
    //   174: aload_0
    //   175: invokevirtual 124	md/i:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   178: getfield 316	net/minecraft/client/entity/EntityPlayerSP:field_70161_v	D
    //   181: d2i
    //   182: iload 4
    //   184: iadd
    //   185: istore 8
    //   187: aload_0
    //   188: invokevirtual 319	md/i:b	()Lnet/minecraft/client/Minecraft;
    //   191: getfield 325	net/minecraft/client/Minecraft:field_71441_e	Lnet/minecraft/client/multiplayer/WorldClient;
    //   194: new 327	net/minecraft/util/BlockPos
    //   197: dup
    //   198: iload 6
    //   200: iload 7
    //   202: iload 8
    //   204: invokespecial 330	net/minecraft/util/BlockPos:<init>	(III)V
    //   207: invokevirtual 336	net/minecraft/client/multiplayer/WorldClient:func_180495_p	(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   210: invokeinterface 342 1 0
    //   215: invokestatic 348	net/minecraft/block/Block:func_149682_b	(Lnet/minecraft/block/Block;)I
    //   218: istore 9
    //   220: aload_0
    //   221: iload 6
    //   223: iload 7
    //   225: iload 8
    //   227: invokevirtual 297	md/i:a	(III)Lcom/sun/jna/z/a/g/d;
    //   230: astore 10
    //   232: aload 10
    //   234: iload_1
    //   235: ifne -194 -> 41
    //   238: ifnull +9 -> 247
    //   241: iconst_1
    //   242: goto +6 -> 248
    //   245: athrow
    //   246: athrow
    //   247: iconst_0
    //   248: istore 11
    //   250: iload 11
    //   252: iload_1
    //   253: ifne +73 -> 326
    //   256: ifne +68 -> 324
    //   259: goto +4 -> 263
    //   262: athrow
    //   263: aload_0
    //   264: iload 9
    //   266: invokevirtual 303	md/i:d	(I)Lcom/sun/jna/z/a/e/m;
    //   269: astore 12
    //   271: iload_1
    //   272: ifne +44 -> 316
    //   275: aload 12
    //   277: ifnull +43 -> 320
    //   280: goto +4 -> 284
    //   283: athrow
    //   284: aload_0
    //   285: getfield 74	md/i:q	Ljava/util/concurrent/CopyOnWriteArrayList;
    //   288: new 120	com/sun/jna/z/a/g/d
    //   291: dup
    //   292: iload 6
    //   294: iload 7
    //   296: iload 8
    //   298: aload 12
    //   300: getfield 349	com/sun/jna/z/a/e/m:t	I
    //   303: iload 9
    //   305: invokespecial 352	com/sun/jna/z/a/g/d:<init>	(IIIII)V
    //   308: invokevirtual 307	java/util/concurrent/CopyOnWriteArrayList:add	(Ljava/lang/Object;)Z
    //   311: pop
    //   312: goto +4 -> 316
    //   315: athrow
    //   316: goto +4 -> 320
    //   319: athrow
    //   320: iload_1
    //   321: ifeq +62 -> 383
    //   324: iload 9
    //   326: iload_1
    //   327: ifne +51 -> 378
    //   330: aload 10
    //   332: getfield 300	com/sun/jna/z/a/g/d:d	I
    //   335: if_icmpne +34 -> 369
    //   338: goto +4 -> 342
    //   341: athrow
    //   342: aload_0
    //   343: invokevirtual 124	md/i:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   346: iload 6
    //   348: i2d
    //   349: iload 7
    //   351: i2d
    //   352: iload 8
    //   354: i2d
    //   355: invokevirtual 138	net/minecraft/client/entity/EntityPlayerSP:func_70011_f	(DDD)D
    //   358: ldc2_w 353
    //   361: dcmpl
    //   362: ifle +21 -> 383
    //   365: goto +4 -> 369
    //   368: athrow
    //   369: aload_0
    //   370: getfield 74	md/i:q	Ljava/util/concurrent/CopyOnWriteArrayList;
    //   373: aload 10
    //   375: invokevirtual 357	java/util/concurrent/CopyOnWriteArrayList:remove	(Ljava/lang/Object;)Z
    //   378: pop
    //   379: goto +4 -> 383
    //   382: athrow
    //   383: iinc 5 1
    //   386: iload_1
    //   387: ifeq -244 -> 143
    //   390: iinc 4 1
    //   393: iload_1
    //   394: ifeq -265 -> 129
    //   397: iinc 3 1
    //   400: iload_1
    //   401: ifeq -285 -> 116
    //   404: goto -400 -> 4
    //   407: astore_2
    //   408: aload_2
    //   409: invokevirtual 360	java/lang/InterruptedException:printStackTrace	()V
    //   412: iload_1
    //   413: ifeq -409 -> 4
    //   416: return
    // Line number table:
    //   Java source line #53	-> byte code offset #4
    //   Java source line #150	-> byte code offset #11
    //   Java source line #143	-> byte code offset #17
    //   Java source line #69	-> byte code offset #29
    //   Java source line #56	-> byte code offset #42
    //   Java source line #98	-> byte code offset #59
    //   Java source line #16	-> byte code offset #67
    //   Java source line #123	-> byte code offset #77
    //   Java source line #39	-> byte code offset #90
    //   Java source line #146	-> byte code offset #107
    //   Java source line #8	-> byte code offset #111
    //   Java source line #71	-> byte code offset #113
    //   Java source line #59	-> byte code offset #121
    //   Java source line #152	-> byte code offset #135
    //   Java source line #55	-> byte code offset #149
    //   Java source line #4	-> byte code offset #161
    //   Java source line #74	-> byte code offset #174
    //   Java source line #142	-> byte code offset #187
    //   Java source line #99	-> byte code offset #188
    //   Java source line #97	-> byte code offset #210
    //   Java source line #116	-> byte code offset #215
    //   Java source line #117	-> byte code offset #220
    //   Java source line #137	-> byte code offset #232
    //   Java source line #124	-> byte code offset #250
    //   Java source line #140	-> byte code offset #263
    //   Java source line #159	-> byte code offset #271
    //   Java source line #93	-> byte code offset #284
    //   Java source line #100	-> byte code offset #320
    //   Java source line #66	-> byte code offset #369
    //   Java source line #54	-> byte code offset #383
    //   Java source line #161	-> byte code offset #390
    //   Java source line #30	-> byte code offset #397
    //   Java source line #136	-> byte code offset #404
    //   Java source line #95	-> byte code offset #407
    //   Java source line #70	-> byte code offset #408
    //   Java source line #10	-> byte code offset #412
    //   Java source line #87	-> byte code offset #416
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	417	0	a	i
    //   3	410	1	a	int
    //   41	54	2	a	d
    //   112	34	2	a	int
    //   407	2	2	a	InterruptedException
    //   58	6	3	a	d
    //   115	283	3	a	int
    //   75	7	4	a	com.sun.jna.z.a.e.m
    //   127	264	4	a	int
    //   141	243	5	a	int
    //   159	188	6	a	int
    //   172	178	7	a	int
    //   185	168	8	a	int
    //   218	107	9	a	int
    //   230	144	10	a	d
    //   248	3	11	a	boolean
    //   269	30	12	a	com.sun.jna.z.a.e.m
    //   89	1	17	localInterruptedException1	InterruptedException
    //   102	1	18	localInterruptedException2	InterruptedException
    //   106	1	19	localInterruptedException3	InterruptedException
    //   245	1	20	localInterruptedException4	InterruptedException
    //   246	1	21	localInterruptedException5	InterruptedException
    //   262	1	22	localInterruptedException6	InterruptedException
    //   283	1	23	localInterruptedException7	InterruptedException
    //   315	1	24	localInterruptedException8	InterruptedException
    //   319	1	25	localInterruptedException9	InterruptedException
    //   341	1	26	localInterruptedException10	InterruptedException
    //   368	1	27	localInterruptedException11	InterruptedException
    //   382	1	28	localInterruptedException12	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   77	86	89	java/lang/InterruptedException
    //   81	99	102	java/lang/InterruptedException
    //   77	103	106	java/lang/InterruptedException
    //   238	245	245	java/lang/InterruptedException
    //   232	246	246	java/lang/InterruptedException
    //   250	259	262	java/lang/InterruptedException
    //   271	280	283	java/lang/InterruptedException
    //   275	312	315	java/lang/InterruptedException
    //   271	316	319	java/lang/InterruptedException
    //   326	338	341	java/lang/InterruptedException
    //   324	365	368	java/lang/InterruptedException
    //   342	379	382	java/lang/InterruptedException
    //   11	404	407	java/lang/InterruptedException
  }
  
  /* Error */
  public void h()
  {
    // Byte code:
    //   0: getstatic 401	md/i:R	Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 256	md/i:o	Z
    //   8: ifeq +242 -> 250
    //   11: aload_0
    //   12: getfield 68	md/i:n	Lcom/sun/jna/z/a/f/a/a/a/a/t;
    //   15: invokeinterface 104 1 0
    //   20: d2i
    //   21: istore_2
    //   22: ldc2_w 363
    //   25: invokestatic 286	java/lang/Thread:sleep	(J)V
    //   28: aload_0
    //   29: invokevirtual 124	md/i:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   32: getfield 310	net/minecraft/client/entity/EntityPlayerSP:field_70165_t	D
    //   35: d2i
    //   36: istore_3
    //   37: aload_0
    //   38: invokevirtual 124	md/i:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   41: getfield 313	net/minecraft/client/entity/EntityPlayerSP:field_70163_u	D
    //   44: d2i
    //   45: istore 4
    //   47: aload_0
    //   48: invokevirtual 124	md/i:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   51: getfield 316	net/minecraft/client/entity/EntityPlayerSP:field_70161_v	D
    //   54: d2i
    //   55: istore 5
    //   57: iload_2
    //   58: ineg
    //   59: istore 6
    //   61: iload 6
    //   63: iload_2
    //   64: if_icmpge +174 -> 238
    //   67: iload_2
    //   68: ineg
    //   69: iload_1
    //   70: ifne -62 -> 8
    //   73: istore 7
    //   75: iload 7
    //   77: iload_2
    //   78: if_icmpge +153 -> 231
    //   81: iload_2
    //   82: i2d
    //   83: ldc2_w 365
    //   86: dmul
    //   87: dneg
    //   88: d2i
    //   89: iload_1
    //   90: ifne -27 -> 63
    //   93: istore 8
    //   95: iload 8
    //   97: iload_2
    //   98: if_icmpge +126 -> 224
    //   101: iload_3
    //   102: iload 6
    //   104: iadd
    //   105: istore 9
    //   107: iload 4
    //   109: iload 8
    //   111: iadd
    //   112: istore 10
    //   114: iload 5
    //   116: iload 7
    //   118: iadd
    //   119: istore 11
    //   121: aload_0
    //   122: invokevirtual 319	md/i:b	()Lnet/minecraft/client/Minecraft;
    //   125: getfield 325	net/minecraft/client/Minecraft:field_71441_e	Lnet/minecraft/client/multiplayer/WorldClient;
    //   128: new 327	net/minecraft/util/BlockPos
    //   131: dup
    //   132: iload 9
    //   134: iload 10
    //   136: iload 11
    //   138: invokespecial 330	net/minecraft/util/BlockPos:<init>	(III)V
    //   141: invokevirtual 336	net/minecraft/client/multiplayer/WorldClient:func_180495_p	(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   144: invokeinterface 342 1 0
    //   149: invokestatic 348	net/minecraft/block/Block:func_149682_b	(Lnet/minecraft/block/Block;)I
    //   152: istore 12
    //   154: aload_0
    //   155: iload 12
    //   157: invokevirtual 303	md/i:d	(I)Lcom/sun/jna/z/a/e/m;
    //   160: astore 13
    //   162: iload_1
    //   163: ifne +64 -> 227
    //   166: iload_1
    //   167: ifne +53 -> 220
    //   170: goto +4 -> 174
    //   173: athrow
    //   174: aload 13
    //   176: ifnull +41 -> 217
    //   179: goto +4 -> 183
    //   182: athrow
    //   183: aload_0
    //   184: getfield 81	md/i:s	Ljava/util/Queue;
    //   187: new 120	com/sun/jna/z/a/g/d
    //   190: dup
    //   191: iload 9
    //   193: iload 10
    //   195: iload 11
    //   197: aload 13
    //   199: getfield 349	com/sun/jna/z/a/e/m:t	I
    //   202: iload 12
    //   204: invokespecial 352	com/sun/jna/z/a/g/d:<init>	(IIIII)V
    //   207: invokeinterface 367 2 0
    //   212: pop
    //   213: goto +4 -> 217
    //   216: athrow
    //   217: iinc 8 1
    //   220: iload_1
    //   221: ifeq -126 -> 95
    //   224: iinc 7 1
    //   227: iload_1
    //   228: ifeq -153 -> 75
    //   231: iinc 6 1
    //   234: iload_1
    //   235: ifeq -174 -> 61
    //   238: goto -234 -> 4
    //   241: astore_2
    //   242: aload_2
    //   243: invokevirtual 360	java/lang/InterruptedException:printStackTrace	()V
    //   246: iload_1
    //   247: ifeq -243 -> 4
    //   250: return
    // Line number table:
    //   Java source line #2	-> byte code offset #4
    //   Java source line #106	-> byte code offset #11
    //   Java source line #110	-> byte code offset #22
    //   Java source line #64	-> byte code offset #28
    //   Java source line #41	-> byte code offset #37
    //   Java source line #109	-> byte code offset #47
    //   Java source line #27	-> byte code offset #57
    //   Java source line #138	-> byte code offset #67
    //   Java source line #129	-> byte code offset #81
    //   Java source line #83	-> byte code offset #101
    //   Java source line #113	-> byte code offset #107
    //   Java source line #52	-> byte code offset #114
    //   Java source line #19	-> byte code offset #121
    //   Java source line #158	-> byte code offset #122
    //   Java source line #119	-> byte code offset #144
    //   Java source line #155	-> byte code offset #149
    //   Java source line #120	-> byte code offset #154
    //   Java source line #149	-> byte code offset #162
    //   Java source line #108	-> byte code offset #183
    //   Java source line #40	-> byte code offset #217
    //   Java source line #31	-> byte code offset #224
    //   Java source line #75	-> byte code offset #231
    //   Java source line #24	-> byte code offset #238
    //   Java source line #104	-> byte code offset #241
    //   Java source line #23	-> byte code offset #242
    //   Java source line #133	-> byte code offset #246
    //   Java source line #32	-> byte code offset #250
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	a	i
    //   3	244	1	a	int
    //   21	77	2	a	int
    //   241	2	2	a	InterruptedException
    //   36	66	3	a	int
    //   45	63	4	a	int
    //   55	60	5	a	int
    //   59	173	6	a	int
    //   73	152	7	a	int
    //   93	125	8	a	int
    //   105	87	9	a	int
    //   112	82	10	a	int
    //   119	77	11	a	int
    //   152	51	12	a	int
    //   160	38	13	a	com.sun.jna.z.a.e.m
    //   173	1	15	localInterruptedException1	InterruptedException
    //   182	1	16	localInterruptedException2	InterruptedException
    //   216	1	17	localInterruptedException3	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   162	170	173	java/lang/InterruptedException
    //   166	179	182	java/lang/InterruptedException
    //   162	213	216	java/lang/InterruptedException
    //   11	238	241	java/lang/InterruptedException
  }
}
