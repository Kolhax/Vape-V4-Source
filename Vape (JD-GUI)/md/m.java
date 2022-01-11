package md;

import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.a.t;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class m
  extends c
{
  t n;
  t o;
  c p;
  boolean q;
  com.sun.jna.z.a.e.i r;
  boolean s;
  public static boolean t;
  public static int u;
  public static boolean v;
  public static boolean w;
  public static boolean x;
  public static int y;
  public static boolean z;
  public static boolean A;
  public static int B;
  public static int C;
  public static boolean D;
  public static int E;
  public static boolean F;
  public static int G;
  public static boolean H;
  public static boolean I;
  public static int J;
  public static boolean K;
  public static boolean L;
  public static boolean M;
  private static final String[] N;
  
  public boolean b(EntityLivingBase a)
  {
    int a = M;
    if (a == 0) {
      if (!a.field_70128_L)
      {
        if (a != 0) {
          break label65;
        }
        if (!
        
          a.func_145748_c_().equals(""))
        {
          if (a != 0) {
            break label65;
          }
          if (
          
            a.c().func_70032_d(a) <= 5.0F) {
            if (a != 0) {
              break label65;
            }
          }
        }
      }
    }
    label65:
    boolean a = !
    
      a.c().func_70685_l(a);
    if (a == 0) {
      if (a) {
        return false;
      }
    }
    int a = a.a(a, a.c());
    if (a == 0) {
      if (a < 60.0D) {
        return true;
      }
    }
    if (t) {
      M = a == 0;
    }
    return false;
  }
  
  public m()
  {
    a.<init>(a[1], com.sun.jna.z.a.e.b.Combat, 65280);
    
    int a = M;a.n = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[2], 3.3D, 0.1D, 5.0D, 0.01D, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);a.o = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[0], 0.5D, 0.1D, 1.0D, 0.01D, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);
    if (a != 0) {
      t = !t;
    }
  }
  
  public void e()
  {
    int a = M;
    if (a == 0)
    {
      if (a.r == null) {
        a.r = new com.sun.jna.z.a.e.i(a);
      }
    }
    else
    {
      a.r.a();
      
      a.s = true;
    }
  }
  
  public void g()
  {
    a.s = false;
  }
  
  public void a(TickEvent.PlayerTickEvent a)
  {
    int a = M;
    if (a == 0)
    {
      if (a.q) {
        a.c().func_70031_b(false);
      }
    }
    else {
      a.q = false;
    }
  }
  
  public k[] k()
  {
    return new k[] { a.n, a.o };
  }
  
  /* Error */
  public void h()
  {
    // Byte code:
    //   0: getstatic 256	md/m:M	Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 77	md/m:s	Z
    //   8: ifeq +560 -> 568
    //   11: ldc2_w 78
    //   14: invokestatic 85	java/lang/Thread:sleep	(J)V
    //   17: aload_0
    //   18: iload_1
    //   19: ifne +25 -> 44
    //   22: invokevirtual 88	md/m:c	()Z
    //   25: ifeq +531 -> 556
    //   28: goto +4 -> 32
    //   31: athrow
    //   32: aload_0
    //   33: iload_1
    //   34: ifne +59 -> 93
    //   37: getfield 90	md/m:p	Lcom/sun/jna/z/a/e/c;
    //   40: goto +4 -> 44
    //   43: athrow
    //   44: ifnonnull +48 -> 92
    //   47: goto +4 -> 51
    //   50: athrow
    //   51: aload_0
    //   52: getstatic 96	com/sun/jna/z/a/i:d	Lcom/sun/jna/z/a/i;
    //   55: getfield 99	com/sun/jna/z/a/i:a	Lcom/sun/jna/z/a/e/g;
    //   58: getstatic 263	md/m:N	[Ljava/lang/String;
    //   61: iconst_3
    //   62: aaload
    //   63: invokevirtual 104	com/sun/jna/z/a/e/g:a	(Ljava/lang/String;)Lcom/sun/jna/z/a/e/c;
    //   66: putfield 90	md/m:p	Lcom/sun/jna/z/a/e/c;
    //   69: aload_0
    //   70: iload_1
    //   71: ifne +22 -> 93
    //   74: getfield 90	md/m:p	Lcom/sun/jna/z/a/e/c;
    //   77: ifnonnull +15 -> 92
    //   80: goto +4 -> 84
    //   83: athrow
    //   84: goto +4 -> 88
    //   87: athrow
    //   88: iload_1
    //   89: ifeq -85 -> 4
    //   92: aload_0
    //   93: invokevirtual 108	md/m:b	()Lnet/minecraft/client/Minecraft;
    //   96: iload_1
    //   97: ifne +29 -> 126
    //   100: getfield 114	net/minecraft/client/Minecraft:field_71462_r	Lnet/minecraft/client/gui/GuiScreen;
    //   103: ifnonnull +38 -> 141
    //   106: goto +4 -> 110
    //   109: athrow
    //   110: aload_0
    //   111: iload_1
    //   112: ifne +34 -> 146
    //   115: goto +4 -> 119
    //   118: athrow
    //   119: invokevirtual 108	md/m:b	()Lnet/minecraft/client/Minecraft;
    //   122: goto +4 -> 126
    //   125: athrow
    //   126: getfield 118	net/minecraft/client/Minecraft:field_71474_y	Lnet/minecraft/client/settings/GameSettings;
    //   129: getfield 124	net/minecraft/client/settings/GameSettings:field_74368_y	Lnet/minecraft/client/settings/KeyBinding;
    //   132: invokevirtual 130	net/minecraft/client/settings/KeyBinding:func_151463_i	()I
    //   135: invokestatic 136	org/lwjgl/input/Keyboard:isKeyDown	(I)Z
    //   138: ifeq +7 -> 145
    //   141: iload_1
    //   142: ifeq -138 -> 4
    //   145: aload_0
    //   146: getfield 52	md/m:n	Lcom/sun/jna/z/a/f/a/a/a/a/t;
    //   149: invokeinterface 141 1 0
    //   154: dstore_2
    //   155: aload_0
    //   156: getfield 56	md/m:o	Lcom/sun/jna/z/a/f/a/a/a/a/t;
    //   159: invokeinterface 141 1 0
    //   164: ldc2_w 40
    //   167: ddiv
    //   168: dstore 4
    //   170: dload 4
    //   172: ldc2_w 38
    //   175: dmul
    //   176: dstore 4
    //   178: aload_0
    //   179: getfield 90	md/m:p	Lcom/sun/jna/z/a/e/c;
    //   182: checkcast 143	md/b
    //   185: astore 6
    //   187: aload_0
    //   188: getfield 90	md/m:p	Lcom/sun/jna/z/a/e/c;
    //   191: invokevirtual 144	com/sun/jna/z/a/e/c:c	()Z
    //   194: ifeq +20 -> 214
    //   197: aload 6
    //   199: invokevirtual 147	md/b:n	()Lnet/minecraft/entity/Entity;
    //   202: ifnull +12 -> 214
    //   205: goto +4 -> 209
    //   208: athrow
    //   209: iconst_1
    //   210: goto +5 -> 215
    //   213: athrow
    //   214: iconst_0
    //   215: istore 7
    //   217: aload 6
    //   219: invokevirtual 147	md/b:n	()Lnet/minecraft/entity/Entity;
    //   222: checkcast 149	net/minecraft/entity/EntityLivingBase
    //   225: astore 8
    //   227: aload 8
    //   229: ifnonnull +7 -> 236
    //   232: iload_1
    //   233: ifeq -229 -> 4
    //   236: aload_0
    //   237: aload 8
    //   239: invokevirtual 152	md/m:b	(Lnet/minecraft/entity/EntityLivingBase;)Z
    //   242: istore 9
    //   244: iload 7
    //   246: iload_1
    //   247: ifne +12 -> 259
    //   250: ifeq +306 -> 556
    //   253: goto +4 -> 257
    //   256: athrow
    //   257: iload 9
    //   259: ifeq +297 -> 556
    //   262: goto +4 -> 266
    //   265: athrow
    //   266: aload_0
    //   267: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   270: aload 8
    //   272: invokevirtual 156	net/minecraft/client/entity/EntityPlayerSP:func_70032_d	(Lnet/minecraft/entity/Entity;)F
    //   275: f2d
    //   276: dstore 10
    //   278: dload 10
    //   280: dload_2
    //   281: dcmpg
    //   282: iload_1
    //   283: ifne +17 -> 300
    //   286: ifge +270 -> 556
    //   289: goto +4 -> 293
    //   292: athrow
    //   293: aload_0
    //   294: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   297: invokevirtual 159	net/minecraft/client/entity/EntityPlayerSP:func_70090_H	()Z
    //   300: ifne +256 -> 556
    //   303: goto +4 -> 307
    //   306: athrow
    //   307: aload_0
    //   308: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   311: getfield 162	net/minecraft/client/entity/EntityPlayerSP:field_70123_F	Z
    //   314: ifne +242 -> 556
    //   317: goto +4 -> 321
    //   320: athrow
    //   321: aload_0
    //   322: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   325: invokevirtual 165	net/minecraft/client/entity/EntityPlayerSP:func_70617_f_	()Z
    //   328: ifne +228 -> 556
    //   331: goto +4 -> 335
    //   334: athrow
    //   335: aload_0
    //   336: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   339: getfield 168	net/minecraft/client/entity/EntityPlayerSP:field_70122_E	Z
    //   342: ifeq +214 -> 556
    //   345: goto +4 -> 349
    //   348: athrow
    //   349: aload_0
    //   350: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   353: invokevirtual 171	net/minecraft/client/entity/EntityPlayerSP:func_70632_aY	()Z
    //   356: ifne +200 -> 556
    //   359: goto +4 -> 363
    //   362: athrow
    //   363: aload 8
    //   365: getfield 175	net/minecraft/entity/EntityLivingBase:field_70165_t	D
    //   368: dstore 12
    //   370: aload 8
    //   372: getfield 178	net/minecraft/entity/EntityLivingBase:field_70161_v	D
    //   375: dstore 14
    //   377: aload_0
    //   378: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   381: getfield 179	net/minecraft/client/entity/EntityPlayerSP:field_70165_t	D
    //   384: dload 12
    //   386: dsub
    //   387: ldc2_w 53
    //   390: dcmpl
    //   391: iload_1
    //   392: ifne +42 -> 434
    //   395: ifle +25 -> 420
    //   398: goto +4 -> 402
    //   401: athrow
    //   402: aload_0
    //   403: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   406: dup
    //   407: getfield 182	net/minecraft/client/entity/EntityPlayerSP:field_70159_w	D
    //   410: dload 4
    //   412: dadd
    //   413: putfield 182	net/minecraft/client/entity/EntityPlayerSP:field_70159_w	D
    //   416: goto +4 -> 420
    //   419: athrow
    //   420: aload_0
    //   421: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   424: getfield 179	net/minecraft/client/entity/EntityPlayerSP:field_70165_t	D
    //   427: dload 12
    //   429: dsub
    //   430: ldc2_w 53
    //   433: dcmpg
    //   434: iload_1
    //   435: ifne +43 -> 478
    //   438: ifge +26 -> 464
    //   441: goto +4 -> 445
    //   444: athrow
    //   445: aload_0
    //   446: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   449: dup
    //   450: getfield 182	net/minecraft/client/entity/EntityPlayerSP:field_70159_w	D
    //   453: dload 4
    //   455: dneg
    //   456: dadd
    //   457: putfield 182	net/minecraft/client/entity/EntityPlayerSP:field_70159_w	D
    //   460: goto +4 -> 464
    //   463: athrow
    //   464: aload_0
    //   465: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   468: getfield 183	net/minecraft/client/entity/EntityPlayerSP:field_70161_v	D
    //   471: dload 14
    //   473: dsub
    //   474: ldc2_w 53
    //   477: dcmpl
    //   478: iload_1
    //   479: ifne +50 -> 529
    //   482: ifle +25 -> 507
    //   485: goto +4 -> 489
    //   488: athrow
    //   489: aload_0
    //   490: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   493: dup
    //   494: getfield 186	net/minecraft/client/entity/EntityPlayerSP:field_70179_y	D
    //   497: dload 4
    //   499: dadd
    //   500: putfield 186	net/minecraft/client/entity/EntityPlayerSP:field_70179_y	D
    //   503: goto +4 -> 507
    //   506: athrow
    //   507: aload_0
    //   508: iload_1
    //   509: ifne +43 -> 552
    //   512: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   515: getfield 183	net/minecraft/client/entity/EntityPlayerSP:field_70161_v	D
    //   518: dload 14
    //   520: dsub
    //   521: ldc2_w 53
    //   524: dcmpg
    //   525: goto +4 -> 529
    //   528: athrow
    //   529: ifge +22 -> 551
    //   532: aload_0
    //   533: invokevirtual 65	md/m:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   536: dup
    //   537: getfield 186	net/minecraft/client/entity/EntityPlayerSP:field_70179_y	D
    //   540: dload 4
    //   542: dneg
    //   543: dadd
    //   544: putfield 186	net/minecraft/client/entity/EntityPlayerSP:field_70179_y	D
    //   547: goto +4 -> 551
    //   550: athrow
    //   551: aload_0
    //   552: iconst_1
    //   553: putfield 61	md/m:q	Z
    //   556: goto -552 -> 4
    //   559: astore_2
    //   560: aload_2
    //   561: invokevirtual 189	java/lang/InterruptedException:printStackTrace	()V
    //   564: iload_1
    //   565: ifeq -561 -> 4
    //   568: return
    // Line number table:
    //   Java source line #60	-> byte code offset #4
    //   Java source line #63	-> byte code offset #11
    //   Java source line #57	-> byte code offset #17
    //   Java source line #12	-> byte code offset #32
    //   Java source line #62	-> byte code offset #51
    //   Java source line #55	-> byte code offset #69
    //   Java source line #8	-> byte code offset #88
    //   Java source line #42	-> byte code offset #92
    //   Java source line #16	-> byte code offset #141
    //   Java source line #52	-> byte code offset #145
    //   Java source line #25	-> byte code offset #155
    //   Java source line #43	-> byte code offset #170
    //   Java source line #38	-> byte code offset #178
    //   Java source line #45	-> byte code offset #187
    //   Java source line #6	-> byte code offset #217
    //   Java source line #7	-> byte code offset #227
    //   Java source line #33	-> byte code offset #232
    //   Java source line #30	-> byte code offset #236
    //   Java source line #37	-> byte code offset #244
    //   Java source line #40	-> byte code offset #266
    //   Java source line #18	-> byte code offset #278
    //   Java source line #20	-> byte code offset #294
    //   Java source line #47	-> byte code offset #336
    //   Java source line #5	-> byte code offset #363
    //   Java source line #56	-> byte code offset #370
    //   Java source line #35	-> byte code offset #377
    //   Java source line #4	-> byte code offset #402
    //   Java source line #65	-> byte code offset #420
    //   Java source line #54	-> byte code offset #445
    //   Java source line #2	-> byte code offset #464
    //   Java source line #50	-> byte code offset #489
    //   Java source line #49	-> byte code offset #507
    //   Java source line #27	-> byte code offset #532
    //   Java source line #34	-> byte code offset #551
    //   Java source line #53	-> byte code offset #556
    //   Java source line #61	-> byte code offset #559
    //   Java source line #23	-> byte code offset #560
    //   Java source line #28	-> byte code offset #564
    //   Java source line #9	-> byte code offset #568
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	569	0	a	m
    //   3	565	1	a	int
    //   155	401	2	a	double
    //   560	4	2	a	InterruptedException
    //   170	386	4	a	double
    //   187	369	6	a	b
    //   217	339	7	a	boolean
    //   227	329	8	a	EntityLivingBase
    //   244	312	9	a	boolean
    //   278	278	10	a	double
    //   370	186	12	a	double
    //   377	179	14	a	double
    // Exception table:
    //   from	to	target	type
    //   11	28	31	java/lang/InterruptedException
    //   32	40	43	java/lang/InterruptedException
    //   11	47	50	java/lang/InterruptedException
    //   51	80	83	java/lang/InterruptedException
    //   32	84	87	java/lang/InterruptedException
    //   93	106	109	java/lang/InterruptedException
    //   100	115	118	java/lang/InterruptedException
    //   110	122	125	java/lang/InterruptedException
    //   187	205	208	java/lang/InterruptedException
    //   197	213	213	java/lang/InterruptedException
    //   244	253	256	java/lang/InterruptedException
    //   244	262	265	java/lang/InterruptedException
    //   278	289	292	java/lang/InterruptedException
    //   278	303	306	java/lang/InterruptedException
    //   293	317	320	java/lang/InterruptedException
    //   307	331	334	java/lang/InterruptedException
    //   321	345	348	java/lang/InterruptedException
    //   335	359	362	java/lang/InterruptedException
    //   377	398	401	java/lang/InterruptedException
    //   377	416	419	java/lang/InterruptedException
    //   434	441	444	java/lang/InterruptedException
    //   420	460	463	java/lang/InterruptedException
    //   478	485	488	java/lang/InterruptedException
    //   464	503	506	java/lang/InterruptedException
    //   507	525	528	java/lang/InterruptedException
    //   507	547	550	java/lang/InterruptedException
    //   11	88	559	java/lang/InterruptedException
    //   92	141	559	java/lang/InterruptedException
    //   145	232	559	java/lang/InterruptedException
    //   236	556	559	java/lang/InterruptedException
  }
}
