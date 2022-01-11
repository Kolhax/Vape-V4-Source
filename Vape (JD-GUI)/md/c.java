package md;

import com.sun.jna.z.a.f.a.a.a.a.a.d;
import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.a.t;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.MouseEvent;

public class c
  extends com.sun.jna.z.a.e.c
{
  public k[] k()
  {
    int a = O;
    if (a != 0) {
      v = !v;
    }
    return new k[] { a.u, a.t, a.s };
  }
  
  t t = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[0], 12.0D, 1.0D, 20.0D, 0.01D, com.sun.jna.z.a.f.a.a.a.a.b.INTEGER);
  
  public void g()
  {
    a.p = false;int a = O;
    if (a == 0) {
      if (a.r != null) {
        a.r.a = null;
      }
    }
    a.r = null;
    if (v) {
      O = a == 0;
    }
  }
  
  t s = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[1], 6.0D, 1.0D, 20.0D, 0.01D, com.sun.jna.z.a.f.a.a.a.a.b.INTEGER);
  
  public c()
  {
    a.<init>(a[5], com.sun.jna.z.a.e.b.Combat, -62703);
    try
    {
      a.n = Minecraft.class.getDeclaredMethod(a[2], new Class[0]);
      
      a.n.setAccessible(true);a.o = MouseEvent.class.getDeclaredField(a[3]);a.o.setAccessible(true);
    }
    catch (Exception a)
    {
      a.printStackTrace();
    }
  }
  
  public void e()
  {
    a.p = true;
    
    int a = O;
    if (a == 0)
    {
      if (a.r == null) {
        a.r = new com.sun.jna.z.a.e.i(a);
      }
    }
    else {
      a.r.a();
    }
  }
  
  com.sun.jna.z.a.f.a.a.a.a.i u = new d(a[4]);
  Method n;
  Field o;
  boolean p;
  boolean q;
  com.sun.jna.z.a.e.i r;
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
  
  /* Error */
  public void h()
  {
    // Byte code:
    //   0: getstatic 242	md/c:O	Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 102	md/c:p	Z
    //   8: ifeq +451 -> 459
    //   11: ldc2_w 103
    //   14: invokestatic 110	java/lang/Thread:sleep	(J)V
    //   17: aload_0
    //   18: invokevirtual 114	md/c:c	()Z
    //   21: iload_1
    //   22: ifne +14 -> 36
    //   25: ifne +7 -> 32
    //   28: iload_1
    //   29: ifeq -25 -> 4
    //   32: aload_0
    //   33: invokevirtual 117	md/c:e	()Z
    //   36: ifeq +7 -> 43
    //   39: iload_1
    //   40: ifeq -36 -> 4
    //   43: new 119	java/util/Random
    //   46: dup
    //   47: invokespecial 121	java/util/Random:<init>	()V
    //   50: astore_2
    //   51: aload_0
    //   52: getfield 61	md/c:t	Lcom/sun/jna/z/a/f/a/a/a/a/t;
    //   55: invokeinterface 126 1 0
    //   60: d2i
    //   61: istore_3
    //   62: aload_0
    //   63: getfield 57	md/c:s	Lcom/sun/jna/z/a/f/a/a/a/a/t;
    //   66: invokeinterface 126 1 0
    //   71: d2i
    //   72: istore 4
    //   74: iload_3
    //   75: iload 4
    //   77: iload_1
    //   78: ifne +28 -> 106
    //   81: if_icmpge +22 -> 103
    //   84: goto +4 -> 88
    //   87: athrow
    //   88: aload_0
    //   89: getfield 57	md/c:s	Lcom/sun/jna/z/a/f/a/a/a/a/t;
    //   92: iload_3
    //   93: i2d
    //   94: invokeinterface 129 3 0
    //   99: iload_1
    //   100: ifeq -96 -> 4
    //   103: iload_3
    //   104: iload 4
    //   106: isub
    //   107: istore 5
    //   109: iload 5
    //   111: iload_1
    //   112: ifne +26 -> 138
    //   115: ifgt +14 -> 129
    //   118: goto +4 -> 122
    //   121: athrow
    //   122: iload 4
    //   124: goto +16 -> 140
    //   127: athrow
    //   128: athrow
    //   129: aload_2
    //   130: iload 5
    //   132: invokevirtual 133	java/util/Random:nextInt	(I)I
    //   135: iload 4
    //   137: iadd
    //   138: iconst_1
    //   139: iadd
    //   140: istore 6
    //   142: aload_0
    //   143: iload_1
    //   144: ifne +299 -> 443
    //   147: getfield 136	md/c:a	Lnet/minecraft/client/Minecraft;
    //   150: getfield 140	net/minecraft/client/Minecraft:field_71462_r	Lnet/minecraft/client/gui/GuiScreen;
    //   153: ifnonnull +285 -> 438
    //   156: goto +4 -> 160
    //   159: athrow
    //   160: sipush 1000
    //   163: iload 6
    //   165: idiv
    //   166: aload_2
    //   167: bipush 20
    //   169: invokevirtual 133	java/util/Random:nextInt	(I)I
    //   172: iadd
    //   173: bipush 30
    //   175: isub
    //   176: i2l
    //   177: invokestatic 110	java/lang/Thread:sleep	(J)V
    //   180: iconst_0
    //   181: invokestatic 146	org/lwjgl/input/Mouse:isButtonDown	(I)Z
    //   184: iload_1
    //   185: ifne +39 -> 224
    //   188: goto +4 -> 192
    //   191: athrow
    //   192: ifne +20 -> 212
    //   195: goto +4 -> 199
    //   198: athrow
    //   199: goto +4 -> 203
    //   202: athrow
    //   203: aload_0
    //   204: iconst_1
    //   205: putfield 148	md/c:q	Z
    //   208: iload_1
    //   209: ifeq -205 -> 4
    //   212: aload_0
    //   213: iload_1
    //   214: ifne +23 -> 237
    //   217: getfield 148	md/c:q	Z
    //   220: goto +4 -> 224
    //   223: athrow
    //   224: ifeq +12 -> 236
    //   227: aload_0
    //   228: iconst_0
    //   229: putfield 148	md/c:q	Z
    //   232: iload_1
    //   233: ifeq -229 -> 4
    //   236: aload_0
    //   237: getfield 136	md/c:a	Lnet/minecraft/client/Minecraft;
    //   240: getfield 152	net/minecraft/client/Minecraft:field_71474_y	Lnet/minecraft/client/settings/GameSettings;
    //   243: getfield 158	net/minecraft/client/settings/GameSettings:field_74312_F	Lnet/minecraft/client/settings/KeyBinding;
    //   246: astore 7
    //   248: aload_0
    //   249: invokevirtual 162	md/c:b	()Lnet/minecraft/client/Minecraft;
    //   252: getfield 152	net/minecraft/client/Minecraft:field_71474_y	Lnet/minecraft/client/settings/GameSettings;
    //   255: getfield 165	net/minecraft/client/settings/GameSettings:field_74313_G	Lnet/minecraft/client/settings/KeyBinding;
    //   258: astore 8
    //   260: aload 7
    //   262: pop
    //   263: aload 7
    //   265: invokevirtual 171	net/minecraft/client/settings/KeyBinding:func_151463_i	()I
    //   268: iconst_1
    //   269: invokestatic 175	net/minecraft/client/settings/KeyBinding:func_74510_a	(IZ)V
    //   272: aload 7
    //   274: pop
    //   275: aload 7
    //   277: invokevirtual 171	net/minecraft/client/settings/KeyBinding:func_151463_i	()I
    //   280: invokestatic 179	net/minecraft/client/settings/KeyBinding:func_74507_a	(I)V
    //   283: iconst_1
    //   284: invokestatic 146	org/lwjgl/input/Mouse:isButtonDown	(I)Z
    //   287: iload_1
    //   288: ifne +77 -> 365
    //   291: ifeq +58 -> 349
    //   294: goto +4 -> 298
    //   297: athrow
    //   298: aload_0
    //   299: getfield 68	md/c:u	Lcom/sun/jna/z/a/f/a/a/a/a/i;
    //   302: invokeinterface 183 1 0
    //   307: iload_1
    //   308: ifne +57 -> 365
    //   311: ifeq +38 -> 349
    //   314: goto +4 -> 318
    //   317: athrow
    //   318: goto +4 -> 322
    //   321: athrow
    //   322: aload 8
    //   324: pop
    //   325: aload 8
    //   327: invokevirtual 171	net/minecraft/client/settings/KeyBinding:func_151463_i	()I
    //   330: iconst_1
    //   331: invokestatic 175	net/minecraft/client/settings/KeyBinding:func_74510_a	(IZ)V
    //   334: aload 8
    //   336: pop
    //   337: aload 8
    //   339: invokevirtual 171	net/minecraft/client/settings/KeyBinding:func_151463_i	()I
    //   342: invokestatic 179	net/minecraft/client/settings/KeyBinding:func_74507_a	(I)V
    //   345: goto +4 -> 349
    //   348: athrow
    //   349: ldc2_w 184
    //   352: invokestatic 110	java/lang/Thread:sleep	(J)V
    //   355: aload_0
    //   356: invokevirtual 162	md/c:b	()Lnet/minecraft/client/Minecraft;
    //   359: getfield 189	net/minecraft/client/Minecraft:field_71439_g	Lnet/minecraft/client/entity/EntityPlayerSP;
    //   362: invokevirtual 194	net/minecraft/client/entity/EntityPlayerSP:func_70632_aY	()Z
    //   365: iload_1
    //   366: ifne +64 -> 430
    //   369: ifeq +47 -> 416
    //   372: goto +4 -> 376
    //   375: athrow
    //   376: aload_0
    //   377: getfield 68	md/c:u	Lcom/sun/jna/z/a/f/a/a/a/a/i;
    //   380: invokeinterface 183 1 0
    //   385: iload_1
    //   386: ifne +44 -> 430
    //   389: ifeq +27 -> 416
    //   392: goto +4 -> 396
    //   395: athrow
    //   396: goto +4 -> 400
    //   399: athrow
    //   400: aload 8
    //   402: pop
    //   403: aload 8
    //   405: invokevirtual 171	net/minecraft/client/settings/KeyBinding:func_151463_i	()I
    //   408: iconst_0
    //   409: invokestatic 175	net/minecraft/client/settings/KeyBinding:func_74510_a	(IZ)V
    //   412: goto +4 -> 416
    //   415: athrow
    //   416: ldc2_w 195
    //   419: invokestatic 110	java/lang/Thread:sleep	(J)V
    //   422: aload 7
    //   424: pop
    //   425: aload 7
    //   427: invokevirtual 171	net/minecraft/client/settings/KeyBinding:func_151463_i	()I
    //   430: iconst_0
    //   431: invokestatic 175	net/minecraft/client/settings/KeyBinding:func_74510_a	(IZ)V
    //   434: iload_1
    //   435: ifeq +12 -> 447
    //   438: aload_0
    //   439: goto +4 -> 443
    //   442: athrow
    //   443: iconst_1
    //   444: putfield 148	md/c:q	Z
    //   447: goto -443 -> 4
    //   450: astore_2
    //   451: aload_2
    //   452: invokevirtual 96	java/lang/Exception:printStackTrace	()V
    //   455: iload_1
    //   456: ifeq -452 -> 4
    //   459: return
    // Line number table:
    //   Java source line #38	-> byte code offset #4
    //   Java source line #8	-> byte code offset #11
    //   Java source line #60	-> byte code offset #17
    //   Java source line #62	-> byte code offset #28
    //   Java source line #2	-> byte code offset #32
    //   Java source line #26	-> byte code offset #39
    //   Java source line #54	-> byte code offset #43
    //   Java source line #35	-> byte code offset #51
    //   Java source line #11	-> byte code offset #62
    //   Java source line #23	-> byte code offset #74
    //   Java source line #53	-> byte code offset #88
    //   Java source line #29	-> byte code offset #99
    //   Java source line #33	-> byte code offset #103
    //   Java source line #28	-> byte code offset #109
    //   Java source line #12	-> byte code offset #142
    //   Java source line #17	-> byte code offset #160
    //   Java source line #3	-> byte code offset #180
    //   Java source line #9	-> byte code offset #203
    //   Java source line #40	-> byte code offset #208
    //   Java source line #5	-> byte code offset #212
    //   Java source line #24	-> byte code offset #227
    //   Java source line #44	-> byte code offset #232
    //   Java source line #25	-> byte code offset #236
    //   Java source line #61	-> byte code offset #248
    //   Java source line #64	-> byte code offset #260
    //   Java source line #42	-> byte code offset #272
    //   Java source line #56	-> byte code offset #283
    //   Java source line #45	-> byte code offset #322
    //   Java source line #63	-> byte code offset #334
    //   Java source line #48	-> byte code offset #349
    //   Java source line #20	-> byte code offset #355
    //   Java source line #1	-> byte code offset #400
    //   Java source line #13	-> byte code offset #416
    //   Java source line #57	-> byte code offset #422
    //   Java source line #58	-> byte code offset #434
    //   Java source line #19	-> byte code offset #438
    //   Java source line #16	-> byte code offset #447
    //   Java source line #50	-> byte code offset #450
    //   Java source line #27	-> byte code offset #451
    //   Java source line #14	-> byte code offset #455
    //   Java source line #65	-> byte code offset #459
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	460	0	a	c
    //   3	456	1	a	int
    //   51	396	2	a	java.util.Random
    //   451	4	2	a	Exception
    //   62	385	3	a	int
    //   74	373	4	a	int
    //   109	338	5	a	int
    //   142	305	6	a	int
    //   248	186	7	a	net.minecraft.client.settings.KeyBinding
    //   260	174	8	a	net.minecraft.client.settings.KeyBinding
    // Exception table:
    //   from	to	target	type
    //   74	84	87	java/lang/Exception
    //   109	118	121	java/lang/Exception
    //   115	127	127	java/lang/Exception
    //   109	128	128	java/lang/Exception
    //   142	156	159	java/lang/Exception
    //   147	188	191	java/lang/Exception
    //   160	195	198	java/lang/Exception
    //   142	199	202	java/lang/Exception
    //   212	220	223	java/lang/Exception
    //   260	294	297	java/lang/Exception
    //   298	314	317	java/lang/Exception
    //   260	318	321	java/lang/Exception
    //   298	345	348	java/lang/Exception
    //   365	372	375	java/lang/Exception
    //   376	392	395	java/lang/Exception
    //   349	396	399	java/lang/Exception
    //   376	412	415	java/lang/Exception
    //   430	439	442	java/lang/Exception
    //   11	28	450	java/lang/Exception
    //   32	39	450	java/lang/Exception
    //   43	99	450	java/lang/Exception
    //   103	208	450	java/lang/Exception
    //   212	232	450	java/lang/Exception
    //   236	447	450	java/lang/Exception
  }
  
  public void f() {}
}
