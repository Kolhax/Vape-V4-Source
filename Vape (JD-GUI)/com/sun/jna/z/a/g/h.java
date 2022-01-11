package com.sun.jna.z.a.g;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;

public class h
{
  private BufferedImage a;
  private DynamicTexture b;
  private final int c;
  
  public float d(String a)
  {
    return (float)(a.a(a).getWidth() + a.d) / 2.0F;
  }
  
  public void a(String a, float a, float a, a a, int a)
  {
    a.a(a, a, a, a, a, (a & 0xFCFCFC) >> 2 | a & 0xFF000000);
  }
  
  public List a(String a, int a)
  {
    return Arrays.asList(a.b(a, a).split("\n"));
  }
  
  public void a(String a, float a, float a, int a, int a)
  {
    a.a(a, a, a, a.SHADOW_THICK, a, a);
  }
  
  public String f(String a)
  {
    return a.g.matcher(a).replaceAll("");
  }
  
  public h(Object a, float a)
  {
    a.<init>(a, a, 0.0F);
  }
  
  public String e(String a)
  {
    return a.f.matcher(a).replaceAll("");
  }
  
  private void c()
  {
    a.a = new BufferedImage(256, 256, 2);
    
    a.k = ((Graphics2D)a.a.getGraphics());a.k.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
  }
  
  private Rectangle2D a(String a)
  {
    return a.l.getStringBounds(a, a.k);
  }
  
  public Font a()
  {
    return a.j;
  }
  
  public Graphics2D b()
  {
    return a.k;
  }
  
  private void a(float a, float a, float a, float a, float a, float a)
  {
    float a = 0.0039063F;WorldRenderer a = Tessellator.func_178181_a().func_178180_c();Tessellator a = Tessellator.func_178181_a();
    
    a.func_178970_b();a.func_178985_a(a + 0.0F, a + a, 0.0D, (a + 0.0F) * 0.0039063F, (a + a) * 0.0039063F);
    
    a.func_178985_a(a + a, a + a, 0.0D, (a + a) * 0.0039063F, (a + a) * 0.0039063F);a.func_178985_a(a + a, a + 0.0F, 0.0D, (a + a) * 0.0039063F, (a + 0.0F) * 0.0039063F);a.func_178985_a(a + 0.0F, a + 0.0F, 0.0D, (a + 0.0F) * 0.0039063F, (a + 0.0F) * 0.0039063F);a.func_78381_a();
  }
  
  private float d = 0.0F;
  private final float e;
  private final Pattern f;
  private final Pattern g;
  private ResourceLocation h;
  private final int i;
  private Font j;
  private Graphics2D k;
  private FontMetrics l;
  private final float[] m;
  private final float[] n;
  public int o;
  private static final String[] p;
  
  private void a(char a, float a, float a)
  {
    Rectangle2D a = a.l.getStringBounds(Character.toString(a), a.k);
    
    a.a(a, a, a.m[(a - a.i)], a.n[(a - a.i)], (float)a.getWidth(), (float)a.getHeight() + a.l.getMaxDescent() + 1.0F);
  }
  
  public void b(String a, float a, float a, int a)
  {
    a.a(a, a + 0.5F, a + 0.5F, a.NORMAL, -16777216, -16777216);a.a(a, a, a, a.NORMAL, a, (a & 0xFCFCFC) >> 2 | a & 0xFF000000);
  }
  
  public void b(String a, float a, float a, int a, int a)
  {
    a.a(a, a + 0.5F, a + 0.5F, a.NORMAL, a, (a & 0xFCFCFC) >> 2 | a & 0xFF000000);
    
    a.a(a, a, a, a.NORMAL, a, (a & 0xFCFCFC) >> 2 | a & 0xFF000000);
  }
  
  public void c(String a, float a, float a, int a)
  {
    a.a(a, a, a, a.NORMAL, a, (a & 0xFCFCFC) >> 2 | a & 0xFF000000);
  }
  
  public h(Object a, float a, float a)
  {
    String[] a = p;a.f = Pattern.compile(a[4]);
    
    a.g = Pattern.compile(a[2]);a.e = a;a.i = 32;a.c = 255;a.d = a;a.m = new float[a.c - a.i];a.n = new float[a.c - a.i];a.c();
    a.a(a, a);
  }
  
  public float c(String a)
  {
    return (float)a.a(a).getHeight() / 2.0F;
  }
  
  /* Error */
  private void a(Object a, float a)
  {
    // Byte code:
    //   0: getstatic 471	com/sun/jna/z/a/g/g:b	I
    //   3: istore_3
    //   4: aload_1
    //   5: instanceof 92
    //   8: iload_3
    //   9: ifne +34 -> 43
    //   12: ifeq +23 -> 35
    //   15: goto +4 -> 19
    //   18: athrow
    //   19: aload_0
    //   20: aload_1
    //   21: checkcast 92	java/awt/Font
    //   24: putfield 94	com/sun/jna/z/a/g/h:j	Ljava/awt/Font;
    //   27: iload_3
    //   28: ifeq +161 -> 189
    //   31: goto +4 -> 35
    //   34: athrow
    //   35: aload_1
    //   36: instanceof 96
    //   39: goto +4 -> 43
    //   42: athrow
    //   43: iload_3
    //   44: ifne +42 -> 86
    //   47: ifeq +31 -> 78
    //   50: goto +4 -> 54
    //   53: athrow
    //   54: aload_0
    //   55: iconst_0
    //   56: aload_1
    //   57: checkcast 96	java/io/File
    //   60: invokestatic 99	java/awt/Font:createFont	(ILjava/io/File;)Ljava/awt/Font;
    //   63: fload_2
    //   64: invokevirtual 103	java/awt/Font:deriveFont	(F)Ljava/awt/Font;
    //   67: putfield 94	com/sun/jna/z/a/g/h:j	Ljava/awt/Font;
    //   70: iload_3
    //   71: ifeq +118 -> 189
    //   74: goto +4 -> 78
    //   77: athrow
    //   78: aload_1
    //   79: instanceof 105
    //   82: goto +4 -> 86
    //   85: athrow
    //   86: iload_3
    //   87: ifne +42 -> 129
    //   90: ifeq +31 -> 121
    //   93: goto +4 -> 97
    //   96: athrow
    //   97: aload_0
    //   98: iconst_0
    //   99: aload_1
    //   100: checkcast 105	java/io/InputStream
    //   103: invokestatic 108	java/awt/Font:createFont	(ILjava/io/InputStream;)Ljava/awt/Font;
    //   106: fload_2
    //   107: invokevirtual 103	java/awt/Font:deriveFont	(F)Ljava/awt/Font;
    //   110: putfield 94	com/sun/jna/z/a/g/h:j	Ljava/awt/Font;
    //   113: iload_3
    //   114: ifeq +75 -> 189
    //   117: goto +4 -> 121
    //   120: athrow
    //   121: aload_1
    //   122: instanceof 110
    //   125: goto +4 -> 129
    //   128: athrow
    //   129: ifeq +31 -> 160
    //   132: aload_0
    //   133: new 92	java/awt/Font
    //   136: dup
    //   137: aload_1
    //   138: checkcast 110	java/lang/String
    //   141: iconst_0
    //   142: fload_2
    //   143: invokestatic 116	java/lang/Math:round	(F)I
    //   146: invokespecial 119	java/awt/Font:<init>	(Ljava/lang/String;II)V
    //   149: putfield 94	com/sun/jna/z/a/g/h:j	Ljava/awt/Font;
    //   152: iload_3
    //   153: ifeq +36 -> 189
    //   156: goto +4 -> 160
    //   159: athrow
    //   160: aload_0
    //   161: new 92	java/awt/Font
    //   164: dup
    //   165: getstatic 476	com/sun/jna/z/a/g/h:p	[Ljava/lang/String;
    //   168: astore 7
    //   170: aload 7
    //   172: iconst_0
    //   173: aaload
    //   174: iconst_0
    //   175: fload_2
    //   176: invokestatic 116	java/lang/Math:round	(F)I
    //   179: invokespecial 119	java/awt/Font:<init>	(Ljava/lang/String;II)V
    //   182: putfield 94	com/sun/jna/z/a/g/h:j	Ljava/awt/Font;
    //   185: goto +4 -> 189
    //   188: athrow
    //   189: aload_0
    //   190: getfield 121	com/sun/jna/z/a/g/h:k	Ljava/awt/Graphics2D;
    //   193: aload_0
    //   194: getfield 94	com/sun/jna/z/a/g/h:j	Ljava/awt/Font;
    //   197: invokevirtual 127	java/awt/Graphics2D:setFont	(Ljava/awt/Font;)V
    //   200: goto +35 -> 235
    //   203: astore 4
    //   205: aload 4
    //   207: invokevirtual 130	java/lang/Exception:printStackTrace	()V
    //   210: aload_0
    //   211: new 92	java/awt/Font
    //   214: dup
    //   215: getstatic 476	com/sun/jna/z/a/g/h:p	[Ljava/lang/String;
    //   218: astore 7
    //   220: aload 7
    //   222: iconst_0
    //   223: aaload
    //   224: iconst_0
    //   225: fload_2
    //   226: invokestatic 116	java/lang/Math:round	(F)I
    //   229: invokespecial 119	java/awt/Font:<init>	(Ljava/lang/String;II)V
    //   232: putfield 94	com/sun/jna/z/a/g/h:j	Ljava/awt/Font;
    //   235: aload_0
    //   236: getfield 121	com/sun/jna/z/a/g/h:k	Ljava/awt/Graphics2D;
    //   239: aload_0
    //   240: getfield 94	com/sun/jna/z/a/g/h:j	Ljava/awt/Font;
    //   243: invokevirtual 127	java/awt/Graphics2D:setFont	(Ljava/awt/Font;)V
    //   246: aload_0
    //   247: getfield 121	com/sun/jna/z/a/g/h:k	Ljava/awt/Graphics2D;
    //   250: new 132	java/awt/Color
    //   253: dup
    //   254: sipush 255
    //   257: sipush 255
    //   260: sipush 255
    //   263: iconst_0
    //   264: invokespecial 135	java/awt/Color:<init>	(IIII)V
    //   267: invokevirtual 139	java/awt/Graphics2D:setColor	(Ljava/awt/Color;)V
    //   270: aload_0
    //   271: getfield 121	com/sun/jna/z/a/g/h:k	Ljava/awt/Graphics2D;
    //   274: iconst_0
    //   275: iconst_0
    //   276: sipush 256
    //   279: sipush 256
    //   282: invokevirtual 142	java/awt/Graphics2D:fillRect	(IIII)V
    //   285: aload_0
    //   286: getfield 121	com/sun/jna/z/a/g/h:k	Ljava/awt/Graphics2D;
    //   289: getstatic 146	java/awt/Color:white	Ljava/awt/Color;
    //   292: invokevirtual 139	java/awt/Graphics2D:setColor	(Ljava/awt/Color;)V
    //   295: aload_0
    //   296: aload_0
    //   297: getfield 121	com/sun/jna/z/a/g/h:k	Ljava/awt/Graphics2D;
    //   300: invokevirtual 150	java/awt/Graphics2D:getFontMetrics	()Ljava/awt/FontMetrics;
    //   303: putfield 152	com/sun/jna/z/a/g/h:l	Ljava/awt/FontMetrics;
    //   306: ldc 1
    //   308: fstore 4
    //   310: ldc 1
    //   312: fstore 5
    //   314: aload_0
    //   315: getfield 78	com/sun/jna/z/a/g/h:i	I
    //   318: istore 6
    //   320: iload 6
    //   322: aload_0
    //   323: getfield 80	com/sun/jna/z/a/g/h:c	I
    //   326: if_icmpge +160 -> 486
    //   329: aload_0
    //   330: getfield 121	com/sun/jna/z/a/g/h:k	Ljava/awt/Graphics2D;
    //   333: iload 6
    //   335: i2c
    //   336: invokestatic 158	java/lang/Character:toString	(C)Ljava/lang/String;
    //   339: fload 4
    //   341: fload 5
    //   343: aload_0
    //   344: getfield 152	com/sun/jna/z/a/g/h:l	Ljava/awt/FontMetrics;
    //   347: invokevirtual 164	java/awt/FontMetrics:getAscent	()I
    //   350: i2f
    //   351: fadd
    //   352: invokevirtual 168	java/awt/Graphics2D:drawString	(Ljava/lang/String;FF)V
    //   355: aload_0
    //   356: getfield 82	com/sun/jna/z/a/g/h:m	[F
    //   359: iload 6
    //   361: aload_0
    //   362: getfield 78	com/sun/jna/z/a/g/h:i	I
    //   365: isub
    //   366: fload 4
    //   368: fastore
    //   369: aload_0
    //   370: getfield 84	com/sun/jna/z/a/g/h:n	[F
    //   373: iload 6
    //   375: aload_0
    //   376: getfield 78	com/sun/jna/z/a/g/h:i	I
    //   379: isub
    //   380: fload 5
    //   382: aload_0
    //   383: getfield 152	com/sun/jna/z/a/g/h:l	Ljava/awt/FontMetrics;
    //   386: invokevirtual 171	java/awt/FontMetrics:getMaxDescent	()I
    //   389: i2f
    //   390: fsub
    //   391: fastore
    //   392: fload 4
    //   394: aload_0
    //   395: getfield 152	com/sun/jna/z/a/g/h:l	Ljava/awt/FontMetrics;
    //   398: iload 6
    //   400: i2c
    //   401: invokestatic 158	java/lang/Character:toString	(C)Ljava/lang/String;
    //   404: invokevirtual 175	java/awt/FontMetrics:stringWidth	(Ljava/lang/String;)I
    //   407: i2f
    //   408: fconst_2
    //   409: fadd
    //   410: fadd
    //   411: fstore 4
    //   413: iload_3
    //   414: ifne +141 -> 555
    //   417: iload_3
    //   418: ifne +64 -> 482
    //   421: goto +4 -> 425
    //   424: athrow
    //   425: fload 4
    //   427: sipush 250
    //   430: aload_0
    //   431: getfield 152	com/sun/jna/z/a/g/h:l	Ljava/awt/FontMetrics;
    //   434: invokevirtual 178	java/awt/FontMetrics:getMaxAdvance	()I
    //   437: isub
    //   438: i2f
    //   439: fcmpl
    //   440: iflt +39 -> 479
    //   443: goto +4 -> 447
    //   446: athrow
    //   447: ldc 1
    //   449: fstore 4
    //   451: fload 5
    //   453: aload_0
    //   454: getfield 152	com/sun/jna/z/a/g/h:l	Ljava/awt/FontMetrics;
    //   457: invokevirtual 181	java/awt/FontMetrics:getMaxAscent	()I
    //   460: aload_0
    //   461: getfield 152	com/sun/jna/z/a/g/h:l	Ljava/awt/FontMetrics;
    //   464: invokevirtual 171	java/awt/FontMetrics:getMaxDescent	()I
    //   467: iadd
    //   468: i2f
    //   469: aload_0
    //   470: getfield 76	com/sun/jna/z/a/g/h:e	F
    //   473: fconst_2
    //   474: fdiv
    //   475: fadd
    //   476: fadd
    //   477: fstore 5
    //   479: iinc 6 1
    //   482: iload_3
    //   483: ifeq -163 -> 320
    //   486: aload_0
    //   487: invokestatic 187	net/minecraft/client/Minecraft:func_71410_x	()Lnet/minecraft/client/Minecraft;
    //   490: invokevirtual 191	net/minecraft/client/Minecraft:func_110434_K	()Lnet/minecraft/client/renderer/texture/TextureManager;
    //   493: new 193	java/lang/StringBuilder
    //   496: dup
    //   497: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   500: getstatic 476	com/sun/jna/z/a/g/h:p	[Ljava/lang/String;
    //   503: iconst_1
    //   504: aaload
    //   505: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   508: aload_1
    //   509: invokevirtual 201	java/lang/Object:toString	()Ljava/lang/String;
    //   512: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   515: fload_2
    //   516: invokevirtual 204	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   519: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   522: aload_0
    //   523: new 207	net/minecraft/client/renderer/texture/DynamicTexture
    //   526: dup
    //   527: aload_0
    //   528: getfield 209	com/sun/jna/z/a/g/h:a	Ljava/awt/image/BufferedImage;
    //   531: invokespecial 212	net/minecraft/client/renderer/texture/DynamicTexture:<init>	(Ljava/awt/image/BufferedImage;)V
    //   534: dup_x1
    //   535: putfield 214	com/sun/jna/z/a/g/h:b	Lnet/minecraft/client/renderer/texture/DynamicTexture;
    //   538: invokevirtual 220	net/minecraft/client/renderer/texture/TextureManager:func_110578_a	(Ljava/lang/String;Lnet/minecraft/client/renderer/texture/DynamicTexture;)Lnet/minecraft/util/ResourceLocation;
    //   541: putfield 222	com/sun/jna/z/a/g/h:h	Lnet/minecraft/util/ResourceLocation;
    //   544: aload_0
    //   545: aload_0
    //   546: ldc 2
    //   548: invokevirtual 225	com/sun/jna/z/a/g/h:c	(Ljava/lang/String;)F
    //   551: f2i
    //   552: putfield 227	com/sun/jna/z/a/g/h:o	I
    //   555: return
    // Line number table:
    //   Java source line #135	-> byte code offset #4
    //   Java source line #22	-> byte code offset #19
    //   Java source line #139	-> byte code offset #35
    //   Java source line #141	-> byte code offset #54
    //   Java source line #101	-> byte code offset #78
    //   Java source line #122	-> byte code offset #97
    //   Java source line #103	-> byte code offset #121
    //   Java source line #160	-> byte code offset #132
    //   Java source line #58	-> byte code offset #160
    //   Java source line #200	-> byte code offset #189
    //   Java source line #55	-> byte code offset #200
    //   Java source line #32	-> byte code offset #203
    //   Java source line #41	-> byte code offset #205
    //   Java source line #77	-> byte code offset #210
    //   Java source line #126	-> byte code offset #235
    //   Java source line #145	-> byte code offset #246
    //   Java source line #109	-> byte code offset #270
    //   Java source line #27	-> byte code offset #285
    //   Java source line #168	-> byte code offset #295
    //   Java source line #129	-> byte code offset #306
    //   Java source line #166	-> byte code offset #310
    //   Java source line #194	-> byte code offset #314
    //   Java source line #50	-> byte code offset #329
    //   Java source line #28	-> byte code offset #355
    //   Java source line #195	-> byte code offset #369
    //   Java source line #70	-> byte code offset #392
    //   Java source line #96	-> byte code offset #413
    //   Java source line #150	-> byte code offset #447
    //   Java source line #97	-> byte code offset #451
    //   Java source line #118	-> byte code offset #479
    //   Java source line #184	-> byte code offset #486
    //   Java source line #3	-> byte code offset #544
    //   Java source line #136	-> byte code offset #555
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	556	0	a	h
    //   0	556	1	a	Object
    //   0	556	2	a	float
    //   3	552	3	a	int
    //   205	30	4	a	Exception
    //   310	246	4	a	float
    //   314	242	5	a	float
    //   320	166	6	a	int
    //   168	64	7	a	String[]
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/Exception
    //   12	31	34	java/lang/Exception
    //   19	39	42	java/lang/Exception
    //   43	50	53	java/lang/Exception
    //   47	74	77	java/lang/Exception
    //   54	82	85	java/lang/Exception
    //   86	93	96	java/lang/Exception
    //   90	117	120	java/lang/Exception
    //   97	125	128	java/lang/Exception
    //   129	156	159	java/lang/Exception
    //   132	185	188	java/lang/Exception
    //   4	200	203	java/lang/Exception
    //   413	421	424	java/lang/Exception
    //   417	443	446	java/lang/Exception
  }
  
  /* Error */
  private void a(String a, float a, float a, int a)
  {
    // Byte code:
    //   0: fload_2
    //   1: fconst_2
    //   2: fmul
    //   3: fstore_2
    //   4: fload_3
    //   5: fconst_2
    //   6: fmul
    //   7: fstore_3
    //   8: invokestatic 255	net/minecraft/client/renderer/GlStateManager:func_179098_w	()V
    //   11: invokestatic 187	net/minecraft/client/Minecraft:func_71410_x	()Lnet/minecraft/client/Minecraft;
    //   14: invokevirtual 191	net/minecraft/client/Minecraft:func_110434_K	()Lnet/minecraft/client/renderer/texture/TextureManager;
    //   17: aload_0
    //   18: getfield 222	com/sun/jna/z/a/g/h:h	Lnet/minecraft/util/ResourceLocation;
    //   21: invokevirtual 259	net/minecraft/client/renderer/texture/TextureManager:func_110577_a	(Lnet/minecraft/util/ResourceLocation;)V
    //   24: iload 4
    //   26: bipush 24
    //   28: ishr
    //   29: sipush 255
    //   32: iand
    //   33: i2f
    //   34: ldc 3
    //   36: fdiv
    //   37: fstore 6
    //   39: iload 4
    //   41: bipush 16
    //   43: ishr
    //   44: sipush 255
    //   47: iand
    //   48: i2f
    //   49: ldc 3
    //   51: fdiv
    //   52: fstore 7
    //   54: getstatic 471	com/sun/jna/z/a/g/g:b	I
    //   57: iload 4
    //   59: bipush 8
    //   61: ishr
    //   62: sipush 255
    //   65: iand
    //   66: i2f
    //   67: ldc 3
    //   69: fdiv
    //   70: fstore 8
    //   72: iload 4
    //   74: sipush 255
    //   77: iand
    //   78: i2f
    //   79: ldc 3
    //   81: fdiv
    //   82: fstore 9
    //   84: fload 7
    //   86: fload 8
    //   88: fload 9
    //   90: fload 6
    //   92: invokestatic 263	net/minecraft/client/renderer/GlStateManager:func_179131_c	(FFFF)V
    //   95: fload_2
    //   96: fstore 10
    //   98: istore 5
    //   100: iconst_0
    //   101: istore 11
    //   103: iload 11
    //   105: aload_1
    //   106: invokevirtual 266	java/lang/String:length	()I
    //   109: if_icmpge +309 -> 418
    //   112: iload 5
    //   114: ifne +311 -> 425
    //   117: aload_1
    //   118: iload 11
    //   120: invokevirtual 270	java/lang/String:charAt	(I)C
    //   123: iload 5
    //   125: ifne +244 -> 369
    //   128: goto +4 -> 132
    //   131: athrow
    //   132: sipush 167
    //   135: if_icmpne +224 -> 359
    //   138: goto +4 -> 142
    //   141: athrow
    //   142: iload 11
    //   144: iconst_1
    //   145: iadd
    //   146: iload 5
    //   148: ifne +221 -> 369
    //   151: goto +4 -> 155
    //   154: athrow
    //   155: aload_1
    //   156: invokevirtual 266	java/lang/String:length	()I
    //   159: if_icmpge +200 -> 359
    //   162: goto +4 -> 166
    //   165: athrow
    //   166: aload_1
    //   167: iload 11
    //   169: iconst_1
    //   170: iadd
    //   171: invokevirtual 270	java/lang/String:charAt	(I)C
    //   174: invokestatic 274	java/lang/Character:toLowerCase	(C)C
    //   177: istore 12
    //   179: iload 12
    //   181: iload 5
    //   183: ifne +39 -> 222
    //   186: bipush 110
    //   188: if_icmpne +23 -> 211
    //   191: goto +4 -> 195
    //   194: athrow
    //   195: fload_3
    //   196: aload_0
    //   197: getfield 152	com/sun/jna/z/a/g/h:l	Ljava/awt/FontMetrics;
    //   200: invokevirtual 164	java/awt/FontMetrics:getAscent	()I
    //   203: iconst_2
    //   204: iadd
    //   205: i2f
    //   206: fadd
    //   207: fstore_3
    //   208: fload 10
    //   210: fstore_2
    //   211: invokestatic 187	net/minecraft/client/Minecraft:func_71410_x	()Lnet/minecraft/client/Minecraft;
    //   214: getfield 278	net/minecraft/client/Minecraft:field_71466_p	Lnet/minecraft/client/gui/FontRenderer;
    //   217: iload 12
    //   219: invokevirtual 284	net/minecraft/client/gui/FontRenderer:func_175064_b	(C)I
    //   222: istore 13
    //   224: iload 13
    //   226: ldc 4
    //   228: iload 5
    //   230: ifne +64 -> 294
    //   233: if_icmpeq +53 -> 286
    //   236: goto +4 -> 240
    //   239: athrow
    //   240: iload 13
    //   242: bipush 16
    //   244: ishr
    //   245: i2f
    //   246: ldc 3
    //   248: fdiv
    //   249: iload 13
    //   251: bipush 8
    //   253: ishr
    //   254: sipush 255
    //   257: iand
    //   258: i2f
    //   259: ldc 3
    //   261: fdiv
    //   262: iload 13
    //   264: sipush 255
    //   267: iand
    //   268: i2f
    //   269: ldc 3
    //   271: fdiv
    //   272: fload 6
    //   274: invokestatic 263	net/minecraft/client/renderer/GlStateManager:func_179131_c	(FFFF)V
    //   277: iload 5
    //   279: ifeq +72 -> 351
    //   282: goto +4 -> 286
    //   285: athrow
    //   286: iload 12
    //   288: bipush 114
    //   290: goto +4 -> 294
    //   293: athrow
    //   294: iload 5
    //   296: ifne +38 -> 334
    //   299: if_icmpne +27 -> 326
    //   302: goto +4 -> 306
    //   305: athrow
    //   306: fload 7
    //   308: fload 8
    //   310: fload 9
    //   312: fload 6
    //   314: invokestatic 263	net/minecraft/client/renderer/GlStateManager:func_179131_c	(FFFF)V
    //   317: iload 5
    //   319: ifeq +32 -> 351
    //   322: goto +4 -> 326
    //   325: athrow
    //   326: iload 12
    //   328: bipush 103
    //   330: goto +4 -> 334
    //   333: athrow
    //   334: if_icmpne +17 -> 351
    //   337: ldc 5
    //   339: ldc 6
    //   341: fconst_1
    //   342: fload 6
    //   344: invokestatic 263	net/minecraft/client/renderer/GlStateManager:func_179131_c	(FFFF)V
    //   347: goto +4 -> 351
    //   350: athrow
    //   351: iinc 11 1
    //   354: iload 5
    //   356: ifeq +54 -> 410
    //   359: aload_1
    //   360: iload 11
    //   362: invokevirtual 270	java/lang/String:charAt	(I)C
    //   365: goto +4 -> 369
    //   368: athrow
    //   369: istore 12
    //   371: aload_0
    //   372: iload 12
    //   374: fload_2
    //   375: fload_3
    //   376: invokespecial 286	com/sun/jna/z/a/g/h:a	(CFF)V
    //   379: goto +17 -> 396
    //   382: astore 13
    //   384: bipush 63
    //   386: istore 12
    //   388: aload_0
    //   389: iload 12
    //   391: fload_2
    //   392: fload_3
    //   393: invokespecial 286	com/sun/jna/z/a/g/h:a	(CFF)V
    //   396: fload_2
    //   397: aload_0
    //   398: iload 12
    //   400: invokestatic 158	java/lang/Character:toString	(C)Ljava/lang/String;
    //   403: invokevirtual 288	com/sun/jna/z/a/g/h:d	(Ljava/lang/String;)F
    //   406: fconst_2
    //   407: fmul
    //   408: fadd
    //   409: fstore_2
    //   410: iinc 11 1
    //   413: iload 5
    //   415: ifeq -312 -> 103
    //   418: fconst_1
    //   419: fconst_1
    //   420: fconst_1
    //   421: fconst_1
    //   422: invokestatic 263	net/minecraft/client/renderer/GlStateManager:func_179131_c	(FFFF)V
    //   425: return
    // Line number table:
    //   Java source line #18	-> byte code offset #0
    //   Java source line #63	-> byte code offset #4
    //   Java source line #72	-> byte code offset #8
    //   Java source line #106	-> byte code offset #11
    //   Java source line #186	-> byte code offset #24
    //   Java source line #23	-> byte code offset #39
    //   Java source line #93	-> byte code offset #54
    //   Java source line #92	-> byte code offset #72
    //   Java source line #57	-> byte code offset #84
    //   Java source line #165	-> byte code offset #95
    //   Java source line #9	-> byte code offset #100
    //   Java source line #172	-> byte code offset #112
    //   Java source line #88	-> byte code offset #166
    //   Java source line #113	-> byte code offset #179
    //   Java source line #156	-> byte code offset #195
    //   Java source line #115	-> byte code offset #208
    //   Java source line #45	-> byte code offset #211
    //   Java source line #64	-> byte code offset #224
    //   Java source line #187	-> byte code offset #240
    //   Java source line #191	-> byte code offset #286
    //   Java source line #15	-> byte code offset #306
    //   Java source line #83	-> byte code offset #326
    //   Java source line #94	-> byte code offset #337
    //   Java source line #209	-> byte code offset #351
    //   Java source line #75	-> byte code offset #354
    //   Java source line #36	-> byte code offset #359
    //   Java source line #29	-> byte code offset #371
    //   Java source line #114	-> byte code offset #379
    //   Java source line #158	-> byte code offset #382
    //   Java source line #176	-> byte code offset #384
    //   Java source line #98	-> byte code offset #388
    //   Java source line #87	-> byte code offset #396
    //   Java source line #170	-> byte code offset #410
    //   Java source line #84	-> byte code offset #418
    //   Java source line #143	-> byte code offset #425
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	426	0	a	h
    //   0	426	1	a	String
    //   0	426	2	a	float
    //   0	426	3	a	float
    //   0	426	4	a	int
    //   98	327	5	a	int
    //   39	387	6	a	float
    //   54	372	7	a	float
    //   72	354	8	a	float
    //   84	342	9	a	float
    //   100	326	10	a	float
    //   103	315	11	a	int
    //   179	175	12	a	char
    //   371	39	12	a	char
    //   224	130	13	a	int
    //   384	12	13	a	ArrayIndexOutOfBoundsException
    // Exception table:
    //   from	to	target	type
    //   112	128	131	java/lang/ArrayIndexOutOfBoundsException
    //   117	138	141	java/lang/ArrayIndexOutOfBoundsException
    //   132	151	154	java/lang/ArrayIndexOutOfBoundsException
    //   142	162	165	java/lang/ArrayIndexOutOfBoundsException
    //   179	191	194	java/lang/ArrayIndexOutOfBoundsException
    //   224	236	239	java/lang/ArrayIndexOutOfBoundsException
    //   233	282	285	java/lang/ArrayIndexOutOfBoundsException
    //   240	290	293	java/lang/ArrayIndexOutOfBoundsException
    //   294	302	305	java/lang/ArrayIndexOutOfBoundsException
    //   299	322	325	java/lang/ArrayIndexOutOfBoundsException
    //   306	330	333	java/lang/ArrayIndexOutOfBoundsException
    //   334	347	350	java/lang/ArrayIndexOutOfBoundsException
    //   351	365	368	java/lang/ArrayIndexOutOfBoundsException
    //   371	379	382	java/lang/ArrayIndexOutOfBoundsException
  }
  
  /* Error */
  public void a(String a, float a, float a, a a, int a, int a)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 305	com/sun/jna/z/a/g/h:f	(Ljava/lang/String;)Ljava/lang/String;
    //   5: astore_1
    //   6: getstatic 471	com/sun/jna/z/a/g/g:b	I
    //   9: invokestatic 308	net/minecraft/client/renderer/GlStateManager:func_179094_E	()V
    //   12: istore 7
    //   14: sipush 3042
    //   17: invokestatic 314	org/lwjgl/opengl/GL11:glIsEnabled	(I)Z
    //   20: istore 8
    //   22: sipush 2896
    //   25: invokestatic 314	org/lwjgl/opengl/GL11:glIsEnabled	(I)Z
    //   28: istore 9
    //   30: sipush 3553
    //   33: invokestatic 314	org/lwjgl/opengl/GL11:glIsEnabled	(I)Z
    //   36: istore 10
    //   38: iload 8
    //   40: iload 7
    //   42: ifne +15 -> 57
    //   45: ifne +10 -> 55
    //   48: goto +4 -> 52
    //   51: athrow
    //   52: invokestatic 317	net/minecraft/client/renderer/GlStateManager:func_179147_l	()V
    //   55: iload 9
    //   57: iload 7
    //   59: ifne +15 -> 74
    //   62: ifeq +10 -> 72
    //   65: goto +4 -> 69
    //   68: athrow
    //   69: invokestatic 320	net/minecraft/client/renderer/GlStateManager:func_179140_f	()V
    //   72: iload 10
    //   74: ifeq +6 -> 80
    //   77: invokestatic 323	net/minecraft/client/renderer/GlStateManager:func_179090_x	()V
    //   80: invokestatic 317	net/minecraft/client/renderer/GlStateManager:func_179147_l	()V
    //   83: ldc 7
    //   85: ldc 7
    //   87: ldc 7
    //   89: invokestatic 327	net/minecraft/client/renderer/GlStateManager:func_179152_a	(FFF)V
    //   92: aload_0
    //   93: aload_1
    //   94: invokevirtual 329	com/sun/jna/z/a/g/h:e	(Ljava/lang/String;)Ljava/lang/String;
    //   97: astore 11
    //   99: getstatic 332	com/sun/jna/z/a/g/i:a	[I
    //   102: aload 4
    //   104: invokevirtual 335	com/sun/jna/z/a/g/a:ordinal	()I
    //   107: iaload
    //   108: iload 7
    //   110: ifne +208 -> 318
    //   113: tableswitch	default:+188->301, 1:+40->153, 2:+63->176, 3:+88->201, 4:+149->262, 5:+171->284, 6:+188->301
    //   152: athrow
    //   153: aload_0
    //   154: aload 11
    //   156: fload_2
    //   157: fconst_1
    //   158: fadd
    //   159: fload_3
    //   160: fconst_1
    //   161: fadd
    //   162: iload 6
    //   164: invokespecial 337	com/sun/jna/z/a/g/h:a	(Ljava/lang/String;FFI)V
    //   167: iload 7
    //   169: ifeq +132 -> 301
    //   172: goto +4 -> 176
    //   175: athrow
    //   176: aload_0
    //   177: aload 11
    //   179: fload_2
    //   180: ldc 7
    //   182: fadd
    //   183: fload_3
    //   184: ldc 7
    //   186: fadd
    //   187: iload 6
    //   189: invokespecial 337	com/sun/jna/z/a/g/h:a	(Ljava/lang/String;FFI)V
    //   192: iload 7
    //   194: ifeq +107 -> 301
    //   197: goto +4 -> 201
    //   200: athrow
    //   201: aload_0
    //   202: aload 11
    //   204: fload_2
    //   205: ldc 7
    //   207: fadd
    //   208: fload_3
    //   209: iload 6
    //   211: invokespecial 337	com/sun/jna/z/a/g/h:a	(Ljava/lang/String;FFI)V
    //   214: aload_0
    //   215: aload 11
    //   217: fload_2
    //   218: ldc 7
    //   220: fsub
    //   221: fload_3
    //   222: iload 6
    //   224: invokespecial 337	com/sun/jna/z/a/g/h:a	(Ljava/lang/String;FFI)V
    //   227: aload_0
    //   228: aload 11
    //   230: fload_2
    //   231: fload_3
    //   232: ldc 7
    //   234: fadd
    //   235: iload 6
    //   237: invokespecial 337	com/sun/jna/z/a/g/h:a	(Ljava/lang/String;FFI)V
    //   240: aload_0
    //   241: aload 11
    //   243: fload_2
    //   244: fload_3
    //   245: ldc 7
    //   247: fsub
    //   248: iload 6
    //   250: invokespecial 337	com/sun/jna/z/a/g/h:a	(Ljava/lang/String;FFI)V
    //   253: iload 7
    //   255: ifeq +46 -> 301
    //   258: goto +4 -> 262
    //   261: athrow
    //   262: aload_0
    //   263: aload 11
    //   265: fload_2
    //   266: fload_3
    //   267: ldc 7
    //   269: fadd
    //   270: iload 6
    //   272: invokespecial 337	com/sun/jna/z/a/g/h:a	(Ljava/lang/String;FFI)V
    //   275: iload 7
    //   277: ifeq +24 -> 301
    //   280: goto +4 -> 284
    //   283: athrow
    //   284: aload_0
    //   285: aload 11
    //   287: fload_2
    //   288: fload_3
    //   289: ldc 7
    //   291: fsub
    //   292: iload 6
    //   294: invokespecial 337	com/sun/jna/z/a/g/h:a	(Ljava/lang/String;FFI)V
    //   297: goto +4 -> 301
    //   300: athrow
    //   301: aload_0
    //   302: aload_1
    //   303: fload_2
    //   304: fload_3
    //   305: iload 5
    //   307: invokespecial 337	com/sun/jna/z/a/g/h:a	(Ljava/lang/String;FFI)V
    //   310: fconst_2
    //   311: fconst_2
    //   312: fconst_2
    //   313: invokestatic 327	net/minecraft/client/renderer/GlStateManager:func_179152_a	(FFF)V
    //   316: iload 10
    //   318: iload 7
    //   320: ifne +15 -> 335
    //   323: ifeq +10 -> 333
    //   326: goto +4 -> 330
    //   329: athrow
    //   330: invokestatic 255	net/minecraft/client/renderer/GlStateManager:func_179098_w	()V
    //   333: iload 9
    //   335: iload 7
    //   337: ifne +15 -> 352
    //   340: ifeq +10 -> 350
    //   343: goto +4 -> 347
    //   346: athrow
    //   347: invokestatic 340	net/minecraft/client/renderer/GlStateManager:func_179145_e	()V
    //   350: iload 8
    //   352: ifne +6 -> 358
    //   355: invokestatic 343	net/minecraft/client/renderer/GlStateManager:func_179084_k	()V
    //   358: invokestatic 346	net/minecraft/client/renderer/GlStateManager:func_179121_F	()V
    //   361: return
    // Line number table:
    //   Java source line #82	-> byte code offset #0
    //   Java source line #90	-> byte code offset #6
    //   Java source line #210	-> byte code offset #14
    //   Java source line #161	-> byte code offset #22
    //   Java source line #173	-> byte code offset #30
    //   Java source line #12	-> byte code offset #38
    //   Java source line #47	-> byte code offset #52
    //   Java source line #175	-> byte code offset #55
    //   Java source line #128	-> byte code offset #69
    //   Java source line #2	-> byte code offset #72
    //   Java source line #79	-> byte code offset #77
    //   Java source line #163	-> byte code offset #80
    //   Java source line #76	-> byte code offset #83
    //   Java source line #34	-> byte code offset #92
    //   Java source line #157	-> byte code offset #99
    //   Java source line #203	-> byte code offset #153
    //   Java source line #205	-> byte code offset #167
    //   Java source line #53	-> byte code offset #176
    //   Java source line #5	-> byte code offset #192
    //   Java source line #127	-> byte code offset #201
    //   Java source line #174	-> byte code offset #214
    //   Java source line #104	-> byte code offset #227
    //   Java source line #33	-> byte code offset #240
    //   Java source line #80	-> byte code offset #253
    //   Java source line #167	-> byte code offset #262
    //   Java source line #66	-> byte code offset #275
    //   Java source line #107	-> byte code offset #284
    //   Java source line #69	-> byte code offset #297
    //   Java source line #14	-> byte code offset #301
    //   Java source line #25	-> byte code offset #310
    //   Java source line #185	-> byte code offset #316
    //   Java source line #108	-> byte code offset #330
    //   Java source line #81	-> byte code offset #333
    //   Java source line #123	-> byte code offset #347
    //   Java source line #148	-> byte code offset #350
    //   Java source line #182	-> byte code offset #355
    //   Java source line #147	-> byte code offset #358
    //   Java source line #110	-> byte code offset #361
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	362	0	a	h
    //   0	362	1	a	String
    //   0	362	2	a	float
    //   0	362	3	a	float
    //   0	362	4	a	a
    //   0	362	5	a	int
    //   0	362	6	a	int
    //   12	324	7	a	int
    //   20	331	8	a	boolean
    //   28	306	9	a	boolean
    //   36	281	10	a	boolean
    //   97	189	11	a	String
    //   51	1	12	localArrayIndexOutOfBoundsException1	ArrayIndexOutOfBoundsException
    //   68	1	13	localArrayIndexOutOfBoundsException2	ArrayIndexOutOfBoundsException
    //   152	1	14	localArrayIndexOutOfBoundsException3	ArrayIndexOutOfBoundsException
    //   175	1	15	localArrayIndexOutOfBoundsException4	ArrayIndexOutOfBoundsException
    //   200	1	16	localArrayIndexOutOfBoundsException5	ArrayIndexOutOfBoundsException
    //   261	1	17	localArrayIndexOutOfBoundsException6	ArrayIndexOutOfBoundsException
    //   283	1	18	localArrayIndexOutOfBoundsException7	ArrayIndexOutOfBoundsException
    //   300	1	19	localArrayIndexOutOfBoundsException8	ArrayIndexOutOfBoundsException
    //   329	1	20	localArrayIndexOutOfBoundsException9	ArrayIndexOutOfBoundsException
    //   346	1	21	localArrayIndexOutOfBoundsException10	ArrayIndexOutOfBoundsException
    // Exception table:
    //   from	to	target	type
    //   38	48	51	java/lang/ArrayIndexOutOfBoundsException
    //   57	65	68	java/lang/ArrayIndexOutOfBoundsException
    //   99	152	152	java/lang/ArrayIndexOutOfBoundsException
    //   113	172	175	java/lang/ArrayIndexOutOfBoundsException
    //   153	197	200	java/lang/ArrayIndexOutOfBoundsException
    //   176	258	261	java/lang/ArrayIndexOutOfBoundsException
    //   201	280	283	java/lang/ArrayIndexOutOfBoundsException
    //   262	300	300	java/lang/ArrayIndexOutOfBoundsException
    //   318	326	329	java/lang/ArrayIndexOutOfBoundsException
    //   335	343	346	java/lang/ArrayIndexOutOfBoundsException
  }
  
  /* Error */
  private String b(String a)
  {
    // Byte code:
    //   0: ldc 11
    //   2: astore_3
    //   3: getstatic 471	com/sun/jna/z/a/g/g:b	I
    //   6: iconst_m1
    //   7: istore 4
    //   9: aload_1
    //   10: invokevirtual 266	java/lang/String:length	()I
    //   13: istore 5
    //   15: istore_2
    //   16: aload_1
    //   17: sipush 167
    //   20: iload 4
    //   22: iconst_1
    //   23: iadd
    //   24: invokevirtual 378	java/lang/String:indexOf	(II)I
    //   27: dup
    //   28: istore 4
    //   30: iconst_m1
    //   31: if_icmpeq +114 -> 145
    //   34: iload 4
    //   36: iload_2
    //   37: ifne +22 -> 59
    //   40: iload 5
    //   42: iconst_1
    //   43: isub
    //   44: if_icmpge -28 -> 16
    //   47: goto +4 -> 51
    //   50: athrow
    //   51: aload_1
    //   52: iload 4
    //   54: iconst_1
    //   55: iadd
    //   56: invokevirtual 270	java/lang/String:charAt	(I)C
    //   59: istore 6
    //   61: aload_0
    //   62: iload 6
    //   64: invokespecial 381	com/sun/jna/z/a/g/h:a	(C)Z
    //   67: iload_2
    //   68: ifne +45 -> 113
    //   71: ifeq +32 -> 103
    //   74: goto +4 -> 78
    //   77: athrow
    //   78: new 193	java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   85: ldc 12
    //   87: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: iload 6
    //   92: invokevirtual 385	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   95: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: astore_3
    //   99: iload_2
    //   100: ifeq +41 -> 141
    //   103: aload_0
    //   104: iload 6
    //   106: invokespecial 387	com/sun/jna/z/a/g/h:b	(C)Z
    //   109: goto +4 -> 113
    //   112: athrow
    //   113: ifeq +28 -> 141
    //   116: new 193	java/lang/StringBuilder
    //   119: dup
    //   120: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   123: aload_3
    //   124: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: ldc 12
    //   129: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: iload 6
    //   134: invokevirtual 385	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   137: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: astore_3
    //   141: iload_2
    //   142: ifeq -126 -> 16
    //   145: aload_3
    //   146: areturn
    // Line number table:
    //   Java source line #1	-> byte code offset #0
    //   Java source line #121	-> byte code offset #6
    //   Java source line #65	-> byte code offset #9
    //   Java source line #60	-> byte code offset #16
    //   Java source line #132	-> byte code offset #34
    //   Java source line #100	-> byte code offset #51
    //   Java source line #201	-> byte code offset #61
    //   Java source line #35	-> byte code offset #78
    //   Java source line #48	-> byte code offset #103
    //   Java source line #39	-> byte code offset #116
    //   Java source line #120	-> byte code offset #141
    //   Java source line #131	-> byte code offset #145
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	a	h
    //   0	147	1	a	String
    //   15	131	2	a	int
    //   6	141	3	a	String
    //   9	138	4	a	int
    //   16	131	5	a	int
    //   61	80	6	a	char
    // Exception table:
    //   from	to	target	type
    //   34	47	50	java/lang/ArrayIndexOutOfBoundsException
    //   61	74	77	java/lang/ArrayIndexOutOfBoundsException
    //   99	109	112	java/lang/ArrayIndexOutOfBoundsException
  }
  
  /* Error */
  private boolean a(char a)
  {
    // Byte code:
    //   0: getstatic 471	com/sun/jna/z/a/g/g:b	I
    //   3: istore_2
    //   4: iload_1
    //   5: bipush 48
    //   7: iload_2
    //   8: ifne +35 -> 43
    //   11: if_icmplt +25 -> 36
    //   14: goto +4 -> 18
    //   17: athrow
    //   18: iload_1
    //   19: iload_2
    //   20: ifne +89 -> 109
    //   23: goto +4 -> 27
    //   26: athrow
    //   27: bipush 57
    //   29: if_icmple +79 -> 108
    //   32: goto +4 -> 36
    //   35: athrow
    //   36: iload_1
    //   37: bipush 97
    //   39: goto +4 -> 43
    //   42: athrow
    //   43: iload_2
    //   44: ifne +35 -> 79
    //   47: if_icmplt +25 -> 72
    //   50: goto +4 -> 54
    //   53: athrow
    //   54: iload_1
    //   55: iload_2
    //   56: ifne +53 -> 109
    //   59: goto +4 -> 63
    //   62: athrow
    //   63: bipush 102
    //   65: if_icmple +43 -> 108
    //   68: goto +4 -> 72
    //   71: athrow
    //   72: iload_1
    //   73: bipush 65
    //   75: goto +4 -> 79
    //   78: athrow
    //   79: iload_2
    //   80: ifne +25 -> 105
    //   83: if_icmplt +29 -> 112
    //   86: goto +4 -> 90
    //   89: athrow
    //   90: iload_1
    //   91: iload_2
    //   92: ifne +17 -> 109
    //   95: goto +4 -> 99
    //   98: athrow
    //   99: bipush 70
    //   101: goto +4 -> 105
    //   104: athrow
    //   105: if_icmpgt +7 -> 112
    //   108: iconst_1
    //   109: goto +4 -> 113
    //   112: iconst_0
    //   113: ireturn
    // Line number table:
    //   Java source line #169	-> byte code offset #4
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	a	h
    //   0	114	1	a	char
    //   3	110	2	a	int
    // Exception table:
    //   from	to	target	type
    //   4	14	17	java/lang/ArrayIndexOutOfBoundsException
    //   11	23	26	java/lang/ArrayIndexOutOfBoundsException
    //   18	32	35	java/lang/ArrayIndexOutOfBoundsException
    //   27	39	42	java/lang/ArrayIndexOutOfBoundsException
    //   43	50	53	java/lang/ArrayIndexOutOfBoundsException
    //   47	59	62	java/lang/ArrayIndexOutOfBoundsException
    //   54	68	71	java/lang/ArrayIndexOutOfBoundsException
    //   63	75	78	java/lang/ArrayIndexOutOfBoundsException
    //   79	86	89	java/lang/ArrayIndexOutOfBoundsException
    //   83	95	98	java/lang/ArrayIndexOutOfBoundsException
    //   90	101	104	java/lang/ArrayIndexOutOfBoundsException
  }
  
  /* Error */
  private boolean b(char a)
  {
    // Byte code:
    //   0: getstatic 471	com/sun/jna/z/a/g/g:b	I
    //   3: istore_2
    //   4: iload_1
    //   5: bipush 107
    //   7: iload_2
    //   8: ifne +35 -> 43
    //   11: if_icmplt +25 -> 36
    //   14: goto +4 -> 18
    //   17: athrow
    //   18: iload_1
    //   19: iload_2
    //   20: ifne +93 -> 113
    //   23: goto +4 -> 27
    //   26: athrow
    //   27: bipush 111
    //   29: if_icmple +79 -> 108
    //   32: goto +4 -> 36
    //   35: athrow
    //   36: iload_1
    //   37: bipush 75
    //   39: goto +4 -> 43
    //   42: athrow
    //   43: iload_2
    //   44: ifne +43 -> 87
    //   47: if_icmplt +25 -> 72
    //   50: goto +4 -> 54
    //   53: athrow
    //   54: iload_1
    //   55: iload_2
    //   56: ifne +57 -> 113
    //   59: goto +4 -> 63
    //   62: athrow
    //   63: bipush 79
    //   65: if_icmple +43 -> 108
    //   68: goto +4 -> 72
    //   71: athrow
    //   72: iload_1
    //   73: iload_2
    //   74: ifne +39 -> 113
    //   77: goto +4 -> 81
    //   80: athrow
    //   81: bipush 114
    //   83: goto +4 -> 87
    //   86: athrow
    //   87: if_icmpeq +21 -> 108
    //   90: iload_1
    //   91: iload_2
    //   92: ifne +21 -> 113
    //   95: goto +4 -> 99
    //   98: athrow
    //   99: bipush 82
    //   101: if_icmpne +15 -> 116
    //   104: goto +4 -> 108
    //   107: athrow
    //   108: iconst_1
    //   109: goto +4 -> 113
    //   112: athrow
    //   113: goto +4 -> 117
    //   116: iconst_0
    //   117: ireturn
    // Line number table:
    //   Java source line #154	-> byte code offset #4
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	a	h
    //   0	118	1	a	char
    //   3	114	2	a	int
    // Exception table:
    //   from	to	target	type
    //   4	14	17	java/lang/ArrayIndexOutOfBoundsException
    //   11	23	26	java/lang/ArrayIndexOutOfBoundsException
    //   18	32	35	java/lang/ArrayIndexOutOfBoundsException
    //   27	39	42	java/lang/ArrayIndexOutOfBoundsException
    //   43	50	53	java/lang/ArrayIndexOutOfBoundsException
    //   47	59	62	java/lang/ArrayIndexOutOfBoundsException
    //   54	68	71	java/lang/ArrayIndexOutOfBoundsException
    //   63	77	80	java/lang/ArrayIndexOutOfBoundsException
    //   72	83	86	java/lang/ArrayIndexOutOfBoundsException
    //   87	95	98	java/lang/ArrayIndexOutOfBoundsException
    //   90	104	107	java/lang/ArrayIndexOutOfBoundsException
    //   99	109	112	java/lang/ArrayIndexOutOfBoundsException
  }
  
  /* Error */
  private int a(String a, float a)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 266	java/lang/String:length	()I
    //   4: istore 4
    //   6: getstatic 471	com/sun/jna/z/a/g/g:b	I
    //   9: fconst_0
    //   10: fstore 5
    //   12: iconst_0
    //   13: istore 6
    //   15: istore_3
    //   16: iconst_m1
    //   17: istore 7
    //   19: iconst_0
    //   20: istore 8
    //   22: iload 6
    //   24: iload 4
    //   26: if_icmpge +334 -> 360
    //   29: aload_1
    //   30: iload 6
    //   32: invokevirtual 270	java/lang/String:charAt	(I)C
    //   35: istore 9
    //   37: iload 9
    //   39: iload_3
    //   40: ifne +322 -> 362
    //   43: iload_3
    //   44: ifne +225 -> 269
    //   47: goto +4 -> 51
    //   50: athrow
    //   51: lookupswitch	default:+216->267, 10:+58->109, 32:+212->263, 45:+212->263, 58:+212->263, 95:+212->263, 167:+69->120
    //   108: athrow
    //   109: iinc 6 -1
    //   112: iload_3
    //   113: ifeq +191 -> 304
    //   116: goto +4 -> 120
    //   119: athrow
    //   120: iload 6
    //   122: iload 4
    //   124: iconst_1
    //   125: isub
    //   126: iload_3
    //   127: ifne +189 -> 316
    //   130: goto +4 -> 134
    //   133: athrow
    //   134: if_icmpge +170 -> 304
    //   137: goto +4 -> 141
    //   140: athrow
    //   141: iinc 6 1
    //   144: aload_1
    //   145: iload 6
    //   147: invokevirtual 270	java/lang/String:charAt	(I)C
    //   150: istore 10
    //   152: iload 10
    //   154: iload_3
    //   155: ifne +102 -> 257
    //   158: bipush 108
    //   160: if_icmpeq +92 -> 252
    //   163: goto +4 -> 167
    //   166: athrow
    //   167: iload 10
    //   169: iload_3
    //   170: ifne +87 -> 257
    //   173: goto +4 -> 177
    //   176: athrow
    //   177: bipush 76
    //   179: if_icmpeq +73 -> 252
    //   182: goto +4 -> 186
    //   185: athrow
    //   186: iload 10
    //   188: iload_3
    //   189: ifne +57 -> 246
    //   192: goto +4 -> 196
    //   195: athrow
    //   196: bipush 114
    //   198: if_icmpeq +47 -> 245
    //   201: goto +4 -> 205
    //   204: athrow
    //   205: iload 10
    //   207: iload_3
    //   208: ifne +38 -> 246
    //   211: goto +4 -> 215
    //   214: athrow
    //   215: bipush 82
    //   217: if_icmpeq +28 -> 245
    //   220: goto +4 -> 224
    //   223: athrow
    //   224: aload_0
    //   225: iload 10
    //   227: invokespecial 381	com/sun/jna/z/a/g/h:a	(C)Z
    //   230: iload_3
    //   231: ifne +15 -> 246
    //   234: goto +4 -> 238
    //   237: athrow
    //   238: ifeq +21 -> 259
    //   241: goto +4 -> 245
    //   244: athrow
    //   245: iconst_0
    //   246: istore 8
    //   248: iload_3
    //   249: ifeq +10 -> 259
    //   252: iconst_1
    //   253: goto +4 -> 257
    //   256: athrow
    //   257: istore 8
    //   259: iload_3
    //   260: ifeq +44 -> 304
    //   263: iload 6
    //   265: istore 7
    //   267: iload 9
    //   269: invokestatic 429	java/lang/String:valueOf	(C)Ljava/lang/String;
    //   272: astore 10
    //   274: fload 5
    //   276: aload_0
    //   277: aload 10
    //   279: invokevirtual 288	com/sun/jna/z/a/g/h:d	(Ljava/lang/String;)F
    //   282: fadd
    //   283: fstore 5
    //   285: iload 8
    //   287: iload_3
    //   288: ifne +18 -> 306
    //   291: ifeq +13 -> 304
    //   294: goto +4 -> 298
    //   297: athrow
    //   298: fload 5
    //   300: fconst_1
    //   301: fadd
    //   302: fstore 5
    //   304: iload 9
    //   306: iload_3
    //   307: ifne +31 -> 338
    //   310: bipush 10
    //   312: goto +4 -> 316
    //   315: athrow
    //   316: if_icmpne +14 -> 330
    //   319: iinc 6 1
    //   322: iload 6
    //   324: istore 7
    //   326: iload_3
    //   327: ifeq +22 -> 349
    //   330: fload 5
    //   332: fload_2
    //   333: fcmpl
    //   334: goto +4 -> 338
    //   337: athrow
    //   338: ifle +11 -> 349
    //   341: iload_3
    //   342: ifeq +18 -> 360
    //   345: goto +4 -> 349
    //   348: athrow
    //   349: iinc 6 1
    //   352: iload_3
    //   353: ifeq -331 -> 22
    //   356: goto +4 -> 360
    //   359: athrow
    //   360: iload 6
    //   362: iload 4
    //   364: iload_3
    //   365: ifne +17 -> 382
    //   368: if_icmpeq +49 -> 417
    //   371: goto +4 -> 375
    //   374: athrow
    //   375: iload 7
    //   377: iconst_m1
    //   378: goto +4 -> 382
    //   381: athrow
    //   382: iload_3
    //   383: ifne +26 -> 409
    //   386: if_icmpeq +31 -> 417
    //   389: goto +4 -> 393
    //   392: athrow
    //   393: iload 7
    //   395: iload_3
    //   396: ifne +18 -> 414
    //   399: goto +4 -> 403
    //   402: athrow
    //   403: iload 6
    //   405: goto +4 -> 409
    //   408: athrow
    //   409: if_icmpge +8 -> 417
    //   412: iload 7
    //   414: goto +5 -> 419
    //   417: iload 6
    //   419: ireturn
    // Line number table:
    //   Java source line #124	-> byte code offset #0
    //   Java source line #138	-> byte code offset #6
    //   Java source line #189	-> byte code offset #12
    //   Java source line #153	-> byte code offset #15
    //   Java source line #112	-> byte code offset #19
    //   Java source line #13	-> byte code offset #29
    //   Java source line #24	-> byte code offset #37
    //   Java source line #117	-> byte code offset #109
    //   Java source line #197	-> byte code offset #112
    //   Java source line #193	-> byte code offset #120
    //   Java source line #99	-> byte code offset #141
    //   Java source line #42	-> byte code offset #144
    //   Java source line #74	-> byte code offset #152
    //   Java source line #204	-> byte code offset #186
    //   Java source line #26	-> byte code offset #245
    //   Java source line #102	-> byte code offset #252
    //   Java source line #208	-> byte code offset #259
    //   Java source line #144	-> byte code offset #263
    //   Java source line #78	-> byte code offset #267
    //   Java source line #142	-> byte code offset #274
    //   Java source line #116	-> byte code offset #285
    //   Java source line #134	-> byte code offset #298
    //   Java source line #149	-> byte code offset #304
    //   Java source line #151	-> byte code offset #319
    //   Java source line #130	-> byte code offset #322
    //   Java source line #188	-> byte code offset #330
    //   Java source line #181	-> byte code offset #341
    //   Java source line #171	-> byte code offset #349
    //   Java source line #111	-> byte code offset #360
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	420	0	a	h
    //   0	420	1	a	String
    //   0	420	2	a	float
    //   15	404	3	a	int
    //   6	414	4	a	int
    //   12	408	5	a	float
    //   15	405	6	a	int
    //   19	401	7	a	int
    //   22	338	8	a	boolean
    //   37	312	9	a	char
    //   152	107	10	a	char
    //   274	30	10	a	String
    // Exception table:
    //   from	to	target	type
    //   37	47	50	java/lang/ArrayIndexOutOfBoundsException
    //   43	108	108	java/lang/ArrayIndexOutOfBoundsException
    //   51	116	119	java/lang/ArrayIndexOutOfBoundsException
    //   109	130	133	java/lang/ArrayIndexOutOfBoundsException
    //   120	137	140	java/lang/ArrayIndexOutOfBoundsException
    //   152	163	166	java/lang/ArrayIndexOutOfBoundsException
    //   158	173	176	java/lang/ArrayIndexOutOfBoundsException
    //   167	182	185	java/lang/ArrayIndexOutOfBoundsException
    //   177	192	195	java/lang/ArrayIndexOutOfBoundsException
    //   186	201	204	java/lang/ArrayIndexOutOfBoundsException
    //   196	211	214	java/lang/ArrayIndexOutOfBoundsException
    //   205	220	223	java/lang/ArrayIndexOutOfBoundsException
    //   215	234	237	java/lang/ArrayIndexOutOfBoundsException
    //   224	241	244	java/lang/ArrayIndexOutOfBoundsException
    //   248	253	256	java/lang/ArrayIndexOutOfBoundsException
    //   285	294	297	java/lang/ArrayIndexOutOfBoundsException
    //   306	312	315	java/lang/ArrayIndexOutOfBoundsException
    //   326	334	337	java/lang/ArrayIndexOutOfBoundsException
    //   338	345	348	java/lang/ArrayIndexOutOfBoundsException
    //   341	356	359	java/lang/ArrayIndexOutOfBoundsException
    //   362	371	374	java/lang/ArrayIndexOutOfBoundsException
    //   368	378	381	java/lang/ArrayIndexOutOfBoundsException
    //   382	389	392	java/lang/ArrayIndexOutOfBoundsException
    //   386	399	402	java/lang/ArrayIndexOutOfBoundsException
    //   393	405	408	java/lang/ArrayIndexOutOfBoundsException
  }
  
  /* Error */
  public String b(String a, float a)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: fload_2
    //   3: invokespecial 440	com/sun/jna/z/a/g/h:a	(Ljava/lang/String;F)I
    //   6: istore 4
    //   8: getstatic 471	com/sun/jna/z/a/g/g:b	I
    //   11: istore_3
    //   12: aload_1
    //   13: iload_3
    //   14: ifne +25 -> 39
    //   17: invokevirtual 266	java/lang/String:length	()I
    //   20: iload 4
    //   22: if_icmpgt +10 -> 32
    //   25: goto +4 -> 29
    //   28: athrow
    //   29: aload_1
    //   30: areturn
    //   31: athrow
    //   32: aload_1
    //   33: iconst_0
    //   34: iload 4
    //   36: invokevirtual 444	java/lang/String:substring	(II)Ljava/lang/String;
    //   39: astore 5
    //   41: new 193	java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   48: aload_0
    //   49: aload 5
    //   51: invokespecial 446	com/sun/jna/z/a/g/h:b	(Ljava/lang/String;)Ljava/lang/String;
    //   54: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: aload_1
    //   58: iload 4
    //   60: aload_1
    //   61: iload 4
    //   63: invokevirtual 270	java/lang/String:charAt	(I)C
    //   66: iload_3
    //   67: ifne +40 -> 107
    //   70: bipush 32
    //   72: if_icmpeq +30 -> 102
    //   75: goto +4 -> 79
    //   78: athrow
    //   79: aload_1
    //   80: iload 4
    //   82: invokevirtual 270	java/lang/String:charAt	(I)C
    //   85: iload_3
    //   86: ifne +21 -> 107
    //   89: goto +4 -> 93
    //   92: athrow
    //   93: bipush 10
    //   95: if_icmpne +15 -> 110
    //   98: goto +4 -> 102
    //   101: athrow
    //   102: iconst_1
    //   103: goto +4 -> 107
    //   106: athrow
    //   107: goto +4 -> 111
    //   110: iconst_0
    //   111: iadd
    //   112: invokevirtual 449	java/lang/String:substring	(I)Ljava/lang/String;
    //   115: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   121: astore 6
    //   123: new 193	java/lang/StringBuilder
    //   126: dup
    //   127: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   130: aload 5
    //   132: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: ldc 13
    //   137: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: aload_0
    //   141: aload 6
    //   143: fload_2
    //   144: invokevirtual 395	com/sun/jna/z/a/g/h:b	(Ljava/lang/String;F)Ljava/lang/String;
    //   147: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: areturn
    //   154: astore 7
    //   156: getstatic 455	java/lang/System:out	Ljava/io/PrintStream;
    //   159: getstatic 476	com/sun/jna/z/a/g/h:p	[Ljava/lang/String;
    //   162: iconst_3
    //   163: aaload
    //   164: invokevirtual 461	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   167: ldc 11
    //   169: areturn
    // Line number table:
    //   Java source line #6	-> byte code offset #0
    //   Java source line #162	-> byte code offset #11
    //   Java source line #178	-> byte code offset #29
    //   Java source line #146	-> byte code offset #32
    //   Java source line #155	-> byte code offset #41
    //   Java source line #56	-> byte code offset #123
    //   Java source line #31	-> byte code offset #154
    //   Java source line #152	-> byte code offset #156
    //   Java source line #52	-> byte code offset #167
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	170	0	a	h
    //   0	170	1	a	String
    //   0	170	2	a	float
    //   11	158	3	a	int
    //   11	159	4	a	int
    //   41	129	5	a	String
    //   123	47	6	a	String
    //   156	11	7	a	Exception
    // Exception table:
    //   from	to	target	type
    //   12	25	28	java/lang/Exception
    //   17	31	31	java/lang/Exception
    //   41	75	78	java/lang/Exception
    //   70	89	92	java/lang/Exception
    //   79	98	101	java/lang/Exception
    //   93	103	106	java/lang/Exception
    //   123	153	154	java/lang/Exception
  }
}
