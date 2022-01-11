package com.sun.jna.z.a.f.a.a.a.e;

import com.sun.jna.z.a.f.a.a.a.a.k;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class b<T extends k>
  implements d
{
  protected final Class<T> a;
  protected Color b;
  protected Color c;
  public static boolean d;
  
  protected Color f(T a)
  {
    return a.b;
  }
  
  protected Rectangle c(T a)
  {
    return new Rectangle(new Point(0, 0), a.i());
  }
  
  public b(Class<T> a)
  {
    a.a = a;
  }
  
  protected Rectangle[] g(T a)
  {
    return new Rectangle[0];
  }
  
  protected Color e(T a)
  {
    return a.c;
  }
  
  /* Error */
  public void a(k a)
  {
    // Byte code:
    //   0: getstatic 139	com/sun/jna/z/a/f/a/a/a/e/b:d	Z
    //   3: istore_2
    //   4: aload_1
    //   5: ifnonnull +26 -> 31
    //   8: new 28	java/lang/NullPointerException
    //   11: dup
    //   12: invokespecial 29	java/lang/NullPointerException:<init>	()V
    //   15: athrow
    //   16: athrow
    //   17: athrow
    //   18: athrow
    //   19: athrow
    //   20: athrow
    //   21: athrow
    //   22: athrow
    //   23: athrow
    //   24: athrow
    //   25: athrow
    //   26: athrow
    //   27: athrow
    //   28: athrow
    //   29: athrow
    //   30: athrow
    //   31: aload_0
    //   32: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   35: aload_1
    //   36: invokevirtual 35	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   39: iload_2
    //   40: ifne +25 -> 65
    //   43: ifne +16 -> 59
    //   46: goto +4 -> 50
    //   49: athrow
    //   50: new 37	java/lang/IllegalArgumentException
    //   53: dup
    //   54: invokespecial 38	java/lang/IllegalArgumentException:<init>	()V
    //   57: athrow
    //   58: athrow
    //   59: aload_1
    //   60: invokeinterface 44 1 0
    //   65: ifne +4 -> 69
    //   68: return
    //   69: aload_0
    //   70: aload_0
    //   71: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   74: aload_1
    //   75: invokevirtual 48	java/lang/Class:cast	(Ljava/lang/Object;)Ljava/lang/Object;
    //   78: checkcast 40	com/sun/jna/z/a/f/a/a/a/a/k
    //   81: invokevirtual 50	com/sun/jna/z/a/f/a/a/a/e/b:b	(Lcom/sun/jna/z/a/f/a/a/a/a/k;)V
    //   84: return
    // Line number table:
    //   Java source line #26	-> byte code offset #4
    //   Java source line #5	-> byte code offset #8
    //   Java source line #8	-> byte code offset #31
    //   Java source line #41	-> byte code offset #50
    //   Java source line #59	-> byte code offset #59
    //   Java source line #47	-> byte code offset #68
    //   Java source line #6	-> byte code offset #69
    //   Java source line #33	-> byte code offset #84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	a	b<T>
    //   0	85	1	a	k
    //   3	37	2	a	int
    //   16	1	3	localNullPointerException1	NullPointerException
    //   17	1	4	localIllegalArgumentException1	IllegalArgumentException
    //   18	1	5	localNullPointerException2	NullPointerException
    //   19	1	6	localIllegalArgumentException2	IllegalArgumentException
    //   20	1	7	localNullPointerException3	NullPointerException
    //   21	1	8	localIllegalArgumentException3	IllegalArgumentException
    //   22	1	9	localNullPointerException4	NullPointerException
    //   23	1	10	localIllegalArgumentException4	IllegalArgumentException
    //   24	1	11	localNullPointerException5	NullPointerException
    //   25	1	12	localIllegalArgumentException5	IllegalArgumentException
    //   26	1	13	localNullPointerException6	NullPointerException
    //   27	1	14	localIllegalArgumentException6	IllegalArgumentException
    //   28	1	15	localNullPointerException7	NullPointerException
    //   29	1	16	localIllegalArgumentException7	IllegalArgumentException
    //   30	1	17	localNullPointerException8	NullPointerException
    //   49	1	18	localNullPointerException9	NullPointerException
    //   58	1	19	localNullPointerException10	NullPointerException
    // Exception table:
    //   from	to	target	type
    //   4	16	16	java/lang/NullPointerException
    //   4	17	17	java/lang/IllegalArgumentException
    //   4	18	18	java/lang/NullPointerException
    //   4	19	19	java/lang/IllegalArgumentException
    //   4	20	20	java/lang/NullPointerException
    //   4	21	21	java/lang/IllegalArgumentException
    //   4	22	22	java/lang/NullPointerException
    //   4	23	23	java/lang/IllegalArgumentException
    //   4	24	24	java/lang/NullPointerException
    //   4	25	25	java/lang/IllegalArgumentException
    //   4	26	26	java/lang/NullPointerException
    //   4	27	27	java/lang/IllegalArgumentException
    //   4	28	28	java/lang/NullPointerException
    //   4	29	29	java/lang/IllegalArgumentException
    //   4	30	30	java/lang/NullPointerException
    //   31	46	49	java/lang/NullPointerException
    //   43	58	58	java/lang/NullPointerException
  }
  
  protected abstract void b(T paramT);
  
  /* Error */
  public Rectangle a(com.sun.jna.z.a.f.a.a.a.a.l a)
  {
    // Byte code:
    //   0: getstatic 139	com/sun/jna/z/a/f/a/a/a/e/b:d	Z
    //   3: istore_2
    //   4: ldc 1
    //   6: aload_0
    //   7: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   10: invokevirtual 57	java/lang/Class:isAssignableFrom	(Ljava/lang/Class;)Z
    //   13: ifne +26 -> 39
    //   16: new 59	java/lang/UnsupportedOperationException
    //   19: dup
    //   20: invokespecial 60	java/lang/UnsupportedOperationException:<init>	()V
    //   23: athrow
    //   24: athrow
    //   25: athrow
    //   26: athrow
    //   27: athrow
    //   28: athrow
    //   29: athrow
    //   30: athrow
    //   31: athrow
    //   32: athrow
    //   33: athrow
    //   34: athrow
    //   35: athrow
    //   36: athrow
    //   37: athrow
    //   38: athrow
    //   39: aload_1
    //   40: ifnonnull +26 -> 66
    //   43: new 28	java/lang/NullPointerException
    //   46: dup
    //   47: invokespecial 29	java/lang/NullPointerException:<init>	()V
    //   50: athrow
    //   51: athrow
    //   52: athrow
    //   53: athrow
    //   54: athrow
    //   55: athrow
    //   56: athrow
    //   57: athrow
    //   58: athrow
    //   59: athrow
    //   60: athrow
    //   61: athrow
    //   62: athrow
    //   63: athrow
    //   64: athrow
    //   65: athrow
    //   66: aload_0
    //   67: iload_2
    //   68: ifne +27 -> 95
    //   71: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   74: aload_1
    //   75: invokevirtual 35	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   78: ifne +16 -> 94
    //   81: goto +4 -> 85
    //   84: athrow
    //   85: new 37	java/lang/IllegalArgumentException
    //   88: dup
    //   89: invokespecial 38	java/lang/IllegalArgumentException:<init>	()V
    //   92: athrow
    //   93: athrow
    //   94: aload_0
    //   95: aload_0
    //   96: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   99: aload_1
    //   100: invokevirtual 48	java/lang/Class:cast	(Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast 40	com/sun/jna/z/a/f/a/a/a/a/k
    //   106: invokevirtual 63	com/sun/jna/z/a/f/a/a/a/e/b:c	(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Ljava/awt/Rectangle;
    //   109: areturn
    // Line number table:
    //   Java source line #30	-> byte code offset #4
    //   Java source line #50	-> byte code offset #16
    //   Java source line #25	-> byte code offset #39
    //   Java source line #22	-> byte code offset #43
    //   Java source line #62	-> byte code offset #66
    //   Java source line #55	-> byte code offset #85
    //   Java source line #23	-> byte code offset #94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	a	b<T>
    //   0	110	1	a	com.sun.jna.z.a.f.a.a.a.a.l
    //   3	65	2	a	int
    //   24	1	3	localNullPointerException1	NullPointerException
    //   25	1	4	localIllegalArgumentException1	IllegalArgumentException
    //   26	1	5	localNullPointerException2	NullPointerException
    //   27	1	6	localIllegalArgumentException2	IllegalArgumentException
    //   28	1	7	localNullPointerException3	NullPointerException
    //   29	1	8	localIllegalArgumentException3	IllegalArgumentException
    //   30	1	9	localNullPointerException4	NullPointerException
    //   31	1	10	localIllegalArgumentException4	IllegalArgumentException
    //   32	1	11	localNullPointerException5	NullPointerException
    //   33	1	12	localIllegalArgumentException5	IllegalArgumentException
    //   34	1	13	localNullPointerException6	NullPointerException
    //   35	1	14	localIllegalArgumentException6	IllegalArgumentException
    //   36	1	15	localNullPointerException7	NullPointerException
    //   37	1	16	localIllegalArgumentException7	IllegalArgumentException
    //   38	1	17	localNullPointerException8	NullPointerException
    //   51	1	18	localNullPointerException9	NullPointerException
    //   52	1	19	localIllegalArgumentException8	IllegalArgumentException
    //   53	1	20	localNullPointerException10	NullPointerException
    //   54	1	21	localIllegalArgumentException9	IllegalArgumentException
    //   55	1	22	localNullPointerException11	NullPointerException
    //   56	1	23	localIllegalArgumentException10	IllegalArgumentException
    //   57	1	24	localNullPointerException12	NullPointerException
    //   58	1	25	localIllegalArgumentException11	IllegalArgumentException
    //   59	1	26	localNullPointerException13	NullPointerException
    //   60	1	27	localIllegalArgumentException12	IllegalArgumentException
    //   61	1	28	localNullPointerException14	NullPointerException
    //   62	1	29	localIllegalArgumentException13	IllegalArgumentException
    //   63	1	30	localNullPointerException15	NullPointerException
    //   64	1	31	localIllegalArgumentException14	IllegalArgumentException
    //   65	1	32	localNullPointerException16	NullPointerException
    //   84	1	33	localNullPointerException17	NullPointerException
    //   93	1	34	localNullPointerException18	NullPointerException
    // Exception table:
    //   from	to	target	type
    //   4	24	24	java/lang/NullPointerException
    //   4	25	25	java/lang/IllegalArgumentException
    //   4	26	26	java/lang/NullPointerException
    //   4	27	27	java/lang/IllegalArgumentException
    //   4	28	28	java/lang/NullPointerException
    //   4	29	29	java/lang/IllegalArgumentException
    //   4	30	30	java/lang/NullPointerException
    //   4	31	31	java/lang/IllegalArgumentException
    //   4	32	32	java/lang/NullPointerException
    //   4	33	33	java/lang/IllegalArgumentException
    //   4	34	34	java/lang/NullPointerException
    //   4	35	35	java/lang/IllegalArgumentException
    //   4	36	36	java/lang/NullPointerException
    //   4	37	37	java/lang/IllegalArgumentException
    //   4	38	38	java/lang/NullPointerException
    //   39	51	51	java/lang/NullPointerException
    //   39	52	52	java/lang/IllegalArgumentException
    //   39	53	53	java/lang/NullPointerException
    //   39	54	54	java/lang/IllegalArgumentException
    //   39	55	55	java/lang/NullPointerException
    //   39	56	56	java/lang/IllegalArgumentException
    //   39	57	57	java/lang/NullPointerException
    //   39	58	58	java/lang/IllegalArgumentException
    //   39	59	59	java/lang/NullPointerException
    //   39	60	60	java/lang/IllegalArgumentException
    //   39	61	61	java/lang/NullPointerException
    //   39	62	62	java/lang/IllegalArgumentException
    //   39	63	63	java/lang/NullPointerException
    //   39	64	64	java/lang/IllegalArgumentException
    //   39	65	65	java/lang/NullPointerException
    //   66	81	84	java/lang/NullPointerException
    //   71	93	93	java/lang/NullPointerException
  }
  
  /* Error */
  public Dimension b(k a)
  {
    // Byte code:
    //   0: getstatic 139	com/sun/jna/z/a/f/a/a/a/e/b:d	Z
    //   3: istore_2
    //   4: aload_1
    //   5: ifnonnull +26 -> 31
    //   8: new 28	java/lang/NullPointerException
    //   11: dup
    //   12: invokespecial 29	java/lang/NullPointerException:<init>	()V
    //   15: athrow
    //   16: athrow
    //   17: athrow
    //   18: athrow
    //   19: athrow
    //   20: athrow
    //   21: athrow
    //   22: athrow
    //   23: athrow
    //   24: athrow
    //   25: athrow
    //   26: athrow
    //   27: athrow
    //   28: athrow
    //   29: athrow
    //   30: athrow
    //   31: aload_0
    //   32: iload_2
    //   33: ifne +27 -> 60
    //   36: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   39: aload_1
    //   40: invokevirtual 35	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   43: ifne +16 -> 59
    //   46: goto +4 -> 50
    //   49: athrow
    //   50: new 37	java/lang/IllegalArgumentException
    //   53: dup
    //   54: invokespecial 38	java/lang/IllegalArgumentException:<init>	()V
    //   57: athrow
    //   58: athrow
    //   59: aload_0
    //   60: aload_0
    //   61: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   64: aload_1
    //   65: invokevirtual 48	java/lang/Class:cast	(Ljava/lang/Object;)Ljava/lang/Object;
    //   68: checkcast 40	com/sun/jna/z/a/f/a/a/a/a/k
    //   71: invokevirtual 83	com/sun/jna/z/a/f/a/a/a/e/b:d	(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Ljava/awt/Dimension;
    //   74: areturn
    // Line number table:
    //   Java source line #21	-> byte code offset #4
    //   Java source line #54	-> byte code offset #8
    //   Java source line #10	-> byte code offset #31
    //   Java source line #20	-> byte code offset #50
    //   Java source line #18	-> byte code offset #59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	a	b<T>
    //   0	75	1	a	k
    //   3	30	2	a	int
    //   16	1	3	localNullPointerException1	NullPointerException
    //   17	1	4	localIllegalArgumentException1	IllegalArgumentException
    //   18	1	5	localNullPointerException2	NullPointerException
    //   19	1	6	localIllegalArgumentException2	IllegalArgumentException
    //   20	1	7	localNullPointerException3	NullPointerException
    //   21	1	8	localIllegalArgumentException3	IllegalArgumentException
    //   22	1	9	localNullPointerException4	NullPointerException
    //   23	1	10	localIllegalArgumentException4	IllegalArgumentException
    //   24	1	11	localNullPointerException5	NullPointerException
    //   25	1	12	localIllegalArgumentException5	IllegalArgumentException
    //   26	1	13	localNullPointerException6	NullPointerException
    //   27	1	14	localIllegalArgumentException6	IllegalArgumentException
    //   28	1	15	localNullPointerException7	NullPointerException
    //   29	1	16	localIllegalArgumentException7	IllegalArgumentException
    //   30	1	17	localNullPointerException8	NullPointerException
    //   49	1	18	localNullPointerException9	NullPointerException
    //   58	1	19	localNullPointerException10	NullPointerException
    // Exception table:
    //   from	to	target	type
    //   4	16	16	java/lang/NullPointerException
    //   4	17	17	java/lang/IllegalArgumentException
    //   4	18	18	java/lang/NullPointerException
    //   4	19	19	java/lang/IllegalArgumentException
    //   4	20	20	java/lang/NullPointerException
    //   4	21	21	java/lang/IllegalArgumentException
    //   4	22	22	java/lang/NullPointerException
    //   4	23	23	java/lang/IllegalArgumentException
    //   4	24	24	java/lang/NullPointerException
    //   4	25	25	java/lang/IllegalArgumentException
    //   4	26	26	java/lang/NullPointerException
    //   4	27	27	java/lang/IllegalArgumentException
    //   4	28	28	java/lang/NullPointerException
    //   4	29	29	java/lang/IllegalArgumentException
    //   4	30	30	java/lang/NullPointerException
    //   31	46	49	java/lang/NullPointerException
    //   36	58	58	java/lang/NullPointerException
  }
  
  protected abstract Dimension d(T paramT);
  
  /* Error */
  protected void a(k a, boolean a)
  {
    // Byte code:
    //   0: getstatic 139	com/sun/jna/z/a/f/a/a/a/e/b:d	Z
    //   3: aload_1
    //   4: invokeinterface 88 1 0
    //   9: astore 4
    //   11: istore_3
    //   12: aload 4
    //   14: ifnull +165 -> 179
    //   17: iload_2
    //   18: iload_3
    //   19: ifne +161 -> 180
    //   22: iload_3
    //   23: ifne +15 -> 38
    //   26: goto +4 -> 30
    //   29: athrow
    //   30: ifeq +11 -> 41
    //   33: goto +4 -> 37
    //   36: athrow
    //   37: iconst_m1
    //   38: goto +4 -> 42
    //   41: iconst_1
    //   42: aload 4
    //   44: invokeinterface 91 1 0
    //   49: imul
    //   50: i2d
    //   51: iload_2
    //   52: iload_3
    //   53: ifne +67 -> 120
    //   56: ifeq +67 -> 123
    //   59: goto +4 -> 63
    //   62: athrow
    //   63: goto +4 -> 67
    //   66: athrow
    //   67: goto +4 -> 71
    //   70: athrow
    //   71: goto +4 -> 75
    //   74: athrow
    //   75: goto +4 -> 79
    //   78: athrow
    //   79: goto +4 -> 83
    //   82: athrow
    //   83: goto +4 -> 87
    //   86: athrow
    //   87: goto +4 -> 91
    //   90: athrow
    //   91: goto +4 -> 95
    //   94: athrow
    //   95: goto +4 -> 99
    //   98: athrow
    //   99: goto +4 -> 103
    //   102: athrow
    //   103: goto +4 -> 107
    //   106: athrow
    //   107: goto +4 -> 111
    //   110: athrow
    //   111: goto +4 -> 115
    //   114: athrow
    //   115: goto +4 -> 119
    //   118: athrow
    //   119: iconst_m1
    //   120: goto +4 -> 124
    //   123: iconst_1
    //   124: aload 4
    //   126: invokeinterface 94 1 0
    //   131: imul
    //   132: i2d
    //   133: dconst_0
    //   134: invokestatic 100	org/lwjgl/opengl/GL11:glTranslated	(DDD)V
    //   137: aload 4
    //   139: invokeinterface 88 1 0
    //   144: astore 4
    //   146: iload_3
    //   147: ifeq -135 -> 12
    //   150: getstatic 143	com/sun/jna/z/a/j:g	Z
    //   153: ifeq +22 -> 175
    //   156: iconst_0
    //   157: goto +19 -> 176
    //   160: athrow
    //   161: athrow
    //   162: athrow
    //   163: athrow
    //   164: athrow
    //   165: athrow
    //   166: athrow
    //   167: athrow
    //   168: athrow
    //   169: athrow
    //   170: athrow
    //   171: athrow
    //   172: athrow
    //   173: athrow
    //   174: athrow
    //   175: iconst_1
    //   176: putstatic 143	com/sun/jna/z/a/j:g	Z
    //   179: iload_2
    //   180: iload_3
    //   181: ifne +67 -> 248
    //   184: ifeq +67 -> 251
    //   187: goto +4 -> 191
    //   190: athrow
    //   191: goto +4 -> 195
    //   194: athrow
    //   195: goto +4 -> 199
    //   198: athrow
    //   199: goto +4 -> 203
    //   202: athrow
    //   203: goto +4 -> 207
    //   206: athrow
    //   207: goto +4 -> 211
    //   210: athrow
    //   211: goto +4 -> 215
    //   214: athrow
    //   215: goto +4 -> 219
    //   218: athrow
    //   219: goto +4 -> 223
    //   222: athrow
    //   223: goto +4 -> 227
    //   226: athrow
    //   227: goto +4 -> 231
    //   230: athrow
    //   231: goto +4 -> 235
    //   234: athrow
    //   235: goto +4 -> 239
    //   238: athrow
    //   239: goto +4 -> 243
    //   242: athrow
    //   243: goto +4 -> 247
    //   246: athrow
    //   247: iconst_m1
    //   248: goto +4 -> 252
    //   251: iconst_1
    //   252: aload_1
    //   253: invokeinterface 91 1 0
    //   258: imul
    //   259: i2d
    //   260: iload_2
    //   261: iload_3
    //   262: ifne +67 -> 329
    //   265: ifeq +67 -> 332
    //   268: goto +4 -> 272
    //   271: athrow
    //   272: goto +4 -> 276
    //   275: athrow
    //   276: goto +4 -> 280
    //   279: athrow
    //   280: goto +4 -> 284
    //   283: athrow
    //   284: goto +4 -> 288
    //   287: athrow
    //   288: goto +4 -> 292
    //   291: athrow
    //   292: goto +4 -> 296
    //   295: athrow
    //   296: goto +4 -> 300
    //   299: athrow
    //   300: goto +4 -> 304
    //   303: athrow
    //   304: goto +4 -> 308
    //   307: athrow
    //   308: goto +4 -> 312
    //   311: athrow
    //   312: goto +4 -> 316
    //   315: athrow
    //   316: goto +4 -> 320
    //   319: athrow
    //   320: goto +4 -> 324
    //   323: athrow
    //   324: goto +4 -> 328
    //   327: athrow
    //   328: iconst_m1
    //   329: goto +4 -> 333
    //   332: iconst_1
    //   333: aload_1
    //   334: invokeinterface 94 1 0
    //   339: imul
    //   340: i2d
    //   341: dconst_0
    //   342: invokestatic 100	org/lwjgl/opengl/GL11:glTranslated	(DDD)V
    //   345: return
    // Line number table:
    //   Java source line #31	-> byte code offset #3
    //   Java source line #9	-> byte code offset #12
    //   Java source line #57	-> byte code offset #17
    //   Java source line #16	-> byte code offset #137
    //   Java source line #49	-> byte code offset #179
    //   Java source line #29	-> byte code offset #345
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	346	0	a	b<T>
    //   0	346	1	a	k
    //   0	346	2	a	boolean
    //   11	334	3	a	int
    //   12	334	4	a	k
    // Exception table:
    //   from	to	target	type
    //   17	26	29	java/lang/NullPointerException
    //   22	33	36	java/lang/NullPointerException
    //   42	59	62	java/lang/NullPointerException
    //   42	63	66	java/lang/IllegalArgumentException
    //   42	67	70	java/lang/NullPointerException
    //   42	71	74	java/lang/IllegalArgumentException
    //   42	75	78	java/lang/NullPointerException
    //   42	79	82	java/lang/IllegalArgumentException
    //   42	83	86	java/lang/NullPointerException
    //   42	87	90	java/lang/IllegalArgumentException
    //   42	91	94	java/lang/NullPointerException
    //   42	95	98	java/lang/IllegalArgumentException
    //   42	99	102	java/lang/NullPointerException
    //   42	103	106	java/lang/IllegalArgumentException
    //   42	107	110	java/lang/NullPointerException
    //   42	111	114	java/lang/IllegalArgumentException
    //   42	115	118	java/lang/NullPointerException
    //   150	160	160	java/lang/NullPointerException
    //   150	161	161	java/lang/IllegalArgumentException
    //   150	162	162	java/lang/NullPointerException
    //   150	163	163	java/lang/IllegalArgumentException
    //   150	164	164	java/lang/NullPointerException
    //   150	165	165	java/lang/IllegalArgumentException
    //   150	166	166	java/lang/NullPointerException
    //   150	167	167	java/lang/IllegalArgumentException
    //   150	168	168	java/lang/NullPointerException
    //   150	169	169	java/lang/IllegalArgumentException
    //   150	170	170	java/lang/NullPointerException
    //   150	171	171	java/lang/IllegalArgumentException
    //   150	172	172	java/lang/NullPointerException
    //   150	173	173	java/lang/IllegalArgumentException
    //   150	174	174	java/lang/NullPointerException
    //   180	187	190	java/lang/NullPointerException
    //   180	191	194	java/lang/IllegalArgumentException
    //   180	195	198	java/lang/NullPointerException
    //   180	199	202	java/lang/IllegalArgumentException
    //   180	203	206	java/lang/NullPointerException
    //   180	207	210	java/lang/IllegalArgumentException
    //   180	211	214	java/lang/NullPointerException
    //   180	215	218	java/lang/IllegalArgumentException
    //   180	219	222	java/lang/NullPointerException
    //   180	223	226	java/lang/IllegalArgumentException
    //   180	227	230	java/lang/NullPointerException
    //   180	231	234	java/lang/IllegalArgumentException
    //   180	235	238	java/lang/NullPointerException
    //   180	239	242	java/lang/IllegalArgumentException
    //   180	243	246	java/lang/NullPointerException
    //   252	268	271	java/lang/NullPointerException
    //   252	272	275	java/lang/IllegalArgumentException
    //   252	276	279	java/lang/NullPointerException
    //   252	280	283	java/lang/IllegalArgumentException
    //   252	284	287	java/lang/NullPointerException
    //   252	288	291	java/lang/IllegalArgumentException
    //   252	292	295	java/lang/NullPointerException
    //   252	296	299	java/lang/IllegalArgumentException
    //   252	300	303	java/lang/NullPointerException
    //   252	304	307	java/lang/IllegalArgumentException
    //   252	308	311	java/lang/NullPointerException
    //   252	312	315	java/lang/IllegalArgumentException
    //   252	316	319	java/lang/NullPointerException
    //   252	320	323	java/lang/IllegalArgumentException
    //   252	324	327	java/lang/NullPointerException
  }
  
  /* Error */
  public Color c(k a)
  {
    // Byte code:
    //   0: getstatic 139	com/sun/jna/z/a/f/a/a/a/e/b:d	Z
    //   3: istore_2
    //   4: aload_1
    //   5: ifnonnull +26 -> 31
    //   8: new 28	java/lang/NullPointerException
    //   11: dup
    //   12: invokespecial 29	java/lang/NullPointerException:<init>	()V
    //   15: athrow
    //   16: athrow
    //   17: athrow
    //   18: athrow
    //   19: athrow
    //   20: athrow
    //   21: athrow
    //   22: athrow
    //   23: athrow
    //   24: athrow
    //   25: athrow
    //   26: athrow
    //   27: athrow
    //   28: athrow
    //   29: athrow
    //   30: athrow
    //   31: aload_0
    //   32: iload_2
    //   33: ifne +27 -> 60
    //   36: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   39: aload_1
    //   40: invokevirtual 35	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   43: ifne +16 -> 59
    //   46: goto +4 -> 50
    //   49: athrow
    //   50: new 37	java/lang/IllegalArgumentException
    //   53: dup
    //   54: invokespecial 38	java/lang/IllegalArgumentException:<init>	()V
    //   57: athrow
    //   58: athrow
    //   59: aload_0
    //   60: aload_0
    //   61: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   64: aload_1
    //   65: invokevirtual 48	java/lang/Class:cast	(Ljava/lang/Object;)Ljava/lang/Object;
    //   68: checkcast 40	com/sun/jna/z/a/f/a/a/a/a/k
    //   71: invokevirtual 104	com/sun/jna/z/a/f/a/a/a/e/b:e	(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Ljava/awt/Color;
    //   74: areturn
    // Line number table:
    //   Java source line #2	-> byte code offset #4
    //   Java source line #44	-> byte code offset #8
    //   Java source line #46	-> byte code offset #31
    //   Java source line #34	-> byte code offset #50
    //   Java source line #27	-> byte code offset #59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	a	b<T>
    //   0	75	1	a	k
    //   3	30	2	a	int
    //   16	1	3	localNullPointerException1	NullPointerException
    //   17	1	4	localIllegalArgumentException1	IllegalArgumentException
    //   18	1	5	localNullPointerException2	NullPointerException
    //   19	1	6	localIllegalArgumentException2	IllegalArgumentException
    //   20	1	7	localNullPointerException3	NullPointerException
    //   21	1	8	localIllegalArgumentException3	IllegalArgumentException
    //   22	1	9	localNullPointerException4	NullPointerException
    //   23	1	10	localIllegalArgumentException4	IllegalArgumentException
    //   24	1	11	localNullPointerException5	NullPointerException
    //   25	1	12	localIllegalArgumentException5	IllegalArgumentException
    //   26	1	13	localNullPointerException6	NullPointerException
    //   27	1	14	localIllegalArgumentException6	IllegalArgumentException
    //   28	1	15	localNullPointerException7	NullPointerException
    //   29	1	16	localIllegalArgumentException7	IllegalArgumentException
    //   30	1	17	localNullPointerException8	NullPointerException
    //   49	1	18	localNullPointerException9	NullPointerException
    //   58	1	19	localNullPointerException10	NullPointerException
    // Exception table:
    //   from	to	target	type
    //   4	16	16	java/lang/NullPointerException
    //   4	17	17	java/lang/IllegalArgumentException
    //   4	18	18	java/lang/NullPointerException
    //   4	19	19	java/lang/IllegalArgumentException
    //   4	20	20	java/lang/NullPointerException
    //   4	21	21	java/lang/IllegalArgumentException
    //   4	22	22	java/lang/NullPointerException
    //   4	23	23	java/lang/IllegalArgumentException
    //   4	24	24	java/lang/NullPointerException
    //   4	25	25	java/lang/IllegalArgumentException
    //   4	26	26	java/lang/NullPointerException
    //   4	27	27	java/lang/IllegalArgumentException
    //   4	28	28	java/lang/NullPointerException
    //   4	29	29	java/lang/IllegalArgumentException
    //   4	30	30	java/lang/NullPointerException
    //   31	46	49	java/lang/NullPointerException
    //   36	58	58	java/lang/NullPointerException
  }
  
  /* Error */
  public Color d(k a)
  {
    // Byte code:
    //   0: getstatic 139	com/sun/jna/z/a/f/a/a/a/e/b:d	Z
    //   3: istore_2
    //   4: aload_1
    //   5: ifnonnull +26 -> 31
    //   8: new 28	java/lang/NullPointerException
    //   11: dup
    //   12: invokespecial 29	java/lang/NullPointerException:<init>	()V
    //   15: athrow
    //   16: athrow
    //   17: athrow
    //   18: athrow
    //   19: athrow
    //   20: athrow
    //   21: athrow
    //   22: athrow
    //   23: athrow
    //   24: athrow
    //   25: athrow
    //   26: athrow
    //   27: athrow
    //   28: athrow
    //   29: athrow
    //   30: athrow
    //   31: aload_0
    //   32: iload_2
    //   33: ifne +27 -> 60
    //   36: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   39: aload_1
    //   40: invokevirtual 35	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   43: ifne +16 -> 59
    //   46: goto +4 -> 50
    //   49: athrow
    //   50: new 37	java/lang/IllegalArgumentException
    //   53: dup
    //   54: invokespecial 38	java/lang/IllegalArgumentException:<init>	()V
    //   57: athrow
    //   58: athrow
    //   59: aload_0
    //   60: aload_0
    //   61: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   64: aload_1
    //   65: invokevirtual 48	java/lang/Class:cast	(Ljava/lang/Object;)Ljava/lang/Object;
    //   68: checkcast 40	com/sun/jna/z/a/f/a/a/a/a/k
    //   71: invokevirtual 109	com/sun/jna/z/a/f/a/a/a/e/b:f	(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Ljava/awt/Color;
    //   74: areturn
    // Line number table:
    //   Java source line #11	-> byte code offset #4
    //   Java source line #60	-> byte code offset #8
    //   Java source line #1	-> byte code offset #31
    //   Java source line #28	-> byte code offset #50
    //   Java source line #38	-> byte code offset #59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	a	b<T>
    //   0	75	1	a	k
    //   3	30	2	a	int
    //   16	1	3	localNullPointerException1	NullPointerException
    //   17	1	4	localIllegalArgumentException1	IllegalArgumentException
    //   18	1	5	localNullPointerException2	NullPointerException
    //   19	1	6	localIllegalArgumentException2	IllegalArgumentException
    //   20	1	7	localNullPointerException3	NullPointerException
    //   21	1	8	localIllegalArgumentException3	IllegalArgumentException
    //   22	1	9	localNullPointerException4	NullPointerException
    //   23	1	10	localIllegalArgumentException4	IllegalArgumentException
    //   24	1	11	localNullPointerException5	NullPointerException
    //   25	1	12	localIllegalArgumentException5	IllegalArgumentException
    //   26	1	13	localNullPointerException6	NullPointerException
    //   27	1	14	localIllegalArgumentException6	IllegalArgumentException
    //   28	1	15	localNullPointerException7	NullPointerException
    //   29	1	16	localIllegalArgumentException7	IllegalArgumentException
    //   30	1	17	localNullPointerException8	NullPointerException
    //   49	1	18	localNullPointerException9	NullPointerException
    //   58	1	19	localNullPointerException10	NullPointerException
    // Exception table:
    //   from	to	target	type
    //   4	16	16	java/lang/NullPointerException
    //   4	17	17	java/lang/IllegalArgumentException
    //   4	18	18	java/lang/NullPointerException
    //   4	19	19	java/lang/IllegalArgumentException
    //   4	20	20	java/lang/NullPointerException
    //   4	21	21	java/lang/IllegalArgumentException
    //   4	22	22	java/lang/NullPointerException
    //   4	23	23	java/lang/IllegalArgumentException
    //   4	24	24	java/lang/NullPointerException
    //   4	25	25	java/lang/IllegalArgumentException
    //   4	26	26	java/lang/NullPointerException
    //   4	27	27	java/lang/IllegalArgumentException
    //   4	28	28	java/lang/NullPointerException
    //   4	29	29	java/lang/IllegalArgumentException
    //   4	30	30	java/lang/NullPointerException
    //   31	46	49	java/lang/NullPointerException
    //   36	58	58	java/lang/NullPointerException
  }
  
  /* Error */
  public Rectangle[] e(k a)
  {
    // Byte code:
    //   0: getstatic 139	com/sun/jna/z/a/f/a/a/a/e/b:d	Z
    //   3: istore_2
    //   4: aload_1
    //   5: ifnonnull +26 -> 31
    //   8: new 28	java/lang/NullPointerException
    //   11: dup
    //   12: invokespecial 29	java/lang/NullPointerException:<init>	()V
    //   15: athrow
    //   16: athrow
    //   17: athrow
    //   18: athrow
    //   19: athrow
    //   20: athrow
    //   21: athrow
    //   22: athrow
    //   23: athrow
    //   24: athrow
    //   25: athrow
    //   26: athrow
    //   27: athrow
    //   28: athrow
    //   29: athrow
    //   30: athrow
    //   31: aload_0
    //   32: iload_2
    //   33: ifne +27 -> 60
    //   36: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   39: aload_1
    //   40: invokevirtual 35	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   43: ifne +16 -> 59
    //   46: goto +4 -> 50
    //   49: athrow
    //   50: new 37	java/lang/IllegalArgumentException
    //   53: dup
    //   54: invokespecial 38	java/lang/IllegalArgumentException:<init>	()V
    //   57: athrow
    //   58: athrow
    //   59: aload_0
    //   60: aload_0
    //   61: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   64: aload_1
    //   65: invokevirtual 48	java/lang/Class:cast	(Ljava/lang/Object;)Ljava/lang/Object;
    //   68: checkcast 40	com/sun/jna/z/a/f/a/a/a/a/k
    //   71: invokevirtual 115	com/sun/jna/z/a/f/a/a/a/e/b:g	(Lcom/sun/jna/z/a/f/a/a/a/a/k;)[Ljava/awt/Rectangle;
    //   74: areturn
    // Line number table:
    //   Java source line #12	-> byte code offset #4
    //   Java source line #51	-> byte code offset #8
    //   Java source line #42	-> byte code offset #31
    //   Java source line #61	-> byte code offset #50
    //   Java source line #37	-> byte code offset #59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	a	b<T>
    //   0	75	1	a	k
    //   3	30	2	a	int
    //   16	1	3	localNullPointerException1	NullPointerException
    //   17	1	4	localIllegalArgumentException1	IllegalArgumentException
    //   18	1	5	localNullPointerException2	NullPointerException
    //   19	1	6	localIllegalArgumentException2	IllegalArgumentException
    //   20	1	7	localNullPointerException3	NullPointerException
    //   21	1	8	localIllegalArgumentException3	IllegalArgumentException
    //   22	1	9	localNullPointerException4	NullPointerException
    //   23	1	10	localIllegalArgumentException4	IllegalArgumentException
    //   24	1	11	localNullPointerException5	NullPointerException
    //   25	1	12	localIllegalArgumentException5	IllegalArgumentException
    //   26	1	13	localNullPointerException6	NullPointerException
    //   27	1	14	localIllegalArgumentException6	IllegalArgumentException
    //   28	1	15	localNullPointerException7	NullPointerException
    //   29	1	16	localIllegalArgumentException7	IllegalArgumentException
    //   30	1	17	localNullPointerException8	NullPointerException
    //   49	1	18	localNullPointerException9	NullPointerException
    //   58	1	19	localNullPointerException10	NullPointerException
    // Exception table:
    //   from	to	target	type
    //   4	16	16	java/lang/NullPointerException
    //   4	17	17	java/lang/IllegalArgumentException
    //   4	18	18	java/lang/NullPointerException
    //   4	19	19	java/lang/IllegalArgumentException
    //   4	20	20	java/lang/NullPointerException
    //   4	21	21	java/lang/IllegalArgumentException
    //   4	22	22	java/lang/NullPointerException
    //   4	23	23	java/lang/IllegalArgumentException
    //   4	24	24	java/lang/NullPointerException
    //   4	25	25	java/lang/IllegalArgumentException
    //   4	26	26	java/lang/NullPointerException
    //   4	27	27	java/lang/IllegalArgumentException
    //   4	28	28	java/lang/NullPointerException
    //   4	29	29	java/lang/IllegalArgumentException
    //   4	30	30	java/lang/NullPointerException
    //   31	46	49	java/lang/NullPointerException
    //   36	58	58	java/lang/NullPointerException
  }
  
  /* Error */
  public void a(k a, Point a, int a)
  {
    // Byte code:
    //   0: getstatic 139	com/sun/jna/z/a/f/a/a/a/e/b:d	Z
    //   3: istore 4
    //   5: aload_1
    //   6: ifnonnull +26 -> 32
    //   9: new 28	java/lang/NullPointerException
    //   12: dup
    //   13: invokespecial 29	java/lang/NullPointerException:<init>	()V
    //   16: athrow
    //   17: athrow
    //   18: athrow
    //   19: athrow
    //   20: athrow
    //   21: athrow
    //   22: athrow
    //   23: athrow
    //   24: athrow
    //   25: athrow
    //   26: athrow
    //   27: athrow
    //   28: athrow
    //   29: athrow
    //   30: athrow
    //   31: athrow
    //   32: aload_0
    //   33: iload 4
    //   35: ifne +27 -> 62
    //   38: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   41: aload_1
    //   42: invokevirtual 35	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   45: ifne +16 -> 61
    //   48: goto +4 -> 52
    //   51: athrow
    //   52: new 37	java/lang/IllegalArgumentException
    //   55: dup
    //   56: invokespecial 38	java/lang/IllegalArgumentException:<init>	()V
    //   59: athrow
    //   60: athrow
    //   61: aload_0
    //   62: aload_0
    //   63: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   66: aload_1
    //   67: invokevirtual 48	java/lang/Class:cast	(Ljava/lang/Object;)Ljava/lang/Object;
    //   70: checkcast 40	com/sun/jna/z/a/f/a/a/a/a/k
    //   73: aload_2
    //   74: iload_3
    //   75: invokevirtual 118	com/sun/jna/z/a/f/a/a/a/e/b:b	(Lcom/sun/jna/z/a/f/a/a/a/a/k;Ljava/awt/Point;I)V
    //   78: return
    // Line number table:
    //   Java source line #52	-> byte code offset #5
    //   Java source line #43	-> byte code offset #9
    //   Java source line #17	-> byte code offset #32
    //   Java source line #13	-> byte code offset #52
    //   Java source line #48	-> byte code offset #61
    //   Java source line #56	-> byte code offset #78
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	a	b<T>
    //   0	79	1	a	k
    //   0	79	2	a	Point
    //   0	79	3	a	int
    //   3	31	4	a	int
    //   17	1	5	localNullPointerException1	NullPointerException
    //   18	1	6	localIllegalArgumentException1	IllegalArgumentException
    //   19	1	7	localNullPointerException2	NullPointerException
    //   20	1	8	localIllegalArgumentException2	IllegalArgumentException
    //   21	1	9	localNullPointerException3	NullPointerException
    //   22	1	10	localIllegalArgumentException3	IllegalArgumentException
    //   23	1	11	localNullPointerException4	NullPointerException
    //   24	1	12	localIllegalArgumentException4	IllegalArgumentException
    //   25	1	13	localNullPointerException5	NullPointerException
    //   26	1	14	localIllegalArgumentException5	IllegalArgumentException
    //   27	1	15	localNullPointerException6	NullPointerException
    //   28	1	16	localIllegalArgumentException6	IllegalArgumentException
    //   29	1	17	localNullPointerException7	NullPointerException
    //   30	1	18	localIllegalArgumentException7	IllegalArgumentException
    //   31	1	19	localNullPointerException8	NullPointerException
    //   51	1	20	localNullPointerException9	NullPointerException
    //   60	1	21	localNullPointerException10	NullPointerException
    // Exception table:
    //   from	to	target	type
    //   5	17	17	java/lang/NullPointerException
    //   5	18	18	java/lang/IllegalArgumentException
    //   5	19	19	java/lang/NullPointerException
    //   5	20	20	java/lang/IllegalArgumentException
    //   5	21	21	java/lang/NullPointerException
    //   5	22	22	java/lang/IllegalArgumentException
    //   5	23	23	java/lang/NullPointerException
    //   5	24	24	java/lang/IllegalArgumentException
    //   5	25	25	java/lang/NullPointerException
    //   5	26	26	java/lang/IllegalArgumentException
    //   5	27	27	java/lang/NullPointerException
    //   5	28	28	java/lang/IllegalArgumentException
    //   5	29	29	java/lang/NullPointerException
    //   5	30	30	java/lang/IllegalArgumentException
    //   5	31	31	java/lang/NullPointerException
    //   32	48	51	java/lang/NullPointerException
    //   38	60	60	java/lang/NullPointerException
  }
  
  protected void b(T a, Point a, int a) {}
  
  /* Error */
  public void f(k a)
  {
    // Byte code:
    //   0: getstatic 139	com/sun/jna/z/a/f/a/a/a/e/b:d	Z
    //   3: istore_2
    //   4: aload_1
    //   5: ifnonnull +26 -> 31
    //   8: new 28	java/lang/NullPointerException
    //   11: dup
    //   12: invokespecial 29	java/lang/NullPointerException:<init>	()V
    //   15: athrow
    //   16: athrow
    //   17: athrow
    //   18: athrow
    //   19: athrow
    //   20: athrow
    //   21: athrow
    //   22: athrow
    //   23: athrow
    //   24: athrow
    //   25: athrow
    //   26: athrow
    //   27: athrow
    //   28: athrow
    //   29: athrow
    //   30: athrow
    //   31: aload_0
    //   32: iload_2
    //   33: ifne +27 -> 60
    //   36: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   39: aload_1
    //   40: invokevirtual 35	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   43: ifne +16 -> 59
    //   46: goto +4 -> 50
    //   49: athrow
    //   50: new 37	java/lang/IllegalArgumentException
    //   53: dup
    //   54: invokespecial 38	java/lang/IllegalArgumentException:<init>	()V
    //   57: athrow
    //   58: athrow
    //   59: aload_0
    //   60: aload_0
    //   61: getfield 22	com/sun/jna/z/a/f/a/a/a/e/b:a	Ljava/lang/Class;
    //   64: aload_1
    //   65: invokevirtual 48	java/lang/Class:cast	(Ljava/lang/Object;)Ljava/lang/Object;
    //   68: checkcast 40	com/sun/jna/z/a/f/a/a/a/a/k
    //   71: invokevirtual 123	com/sun/jna/z/a/f/a/a/a/e/b:h	(Lcom/sun/jna/z/a/f/a/a/a/a/k;)V
    //   74: return
    // Line number table:
    //   Java source line #36	-> byte code offset #4
    //   Java source line #40	-> byte code offset #8
    //   Java source line #7	-> byte code offset #31
    //   Java source line #35	-> byte code offset #50
    //   Java source line #4	-> byte code offset #59
    //   Java source line #39	-> byte code offset #74
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	a	b<T>
    //   0	75	1	a	k
    //   3	30	2	a	int
    //   16	1	3	localNullPointerException1	NullPointerException
    //   17	1	4	localIllegalArgumentException1	IllegalArgumentException
    //   18	1	5	localNullPointerException2	NullPointerException
    //   19	1	6	localIllegalArgumentException2	IllegalArgumentException
    //   20	1	7	localNullPointerException3	NullPointerException
    //   21	1	8	localIllegalArgumentException3	IllegalArgumentException
    //   22	1	9	localNullPointerException4	NullPointerException
    //   23	1	10	localIllegalArgumentException4	IllegalArgumentException
    //   24	1	11	localNullPointerException5	NullPointerException
    //   25	1	12	localIllegalArgumentException5	IllegalArgumentException
    //   26	1	13	localNullPointerException6	NullPointerException
    //   27	1	14	localIllegalArgumentException6	IllegalArgumentException
    //   28	1	15	localNullPointerException7	NullPointerException
    //   29	1	16	localIllegalArgumentException7	IllegalArgumentException
    //   30	1	17	localNullPointerException8	NullPointerException
    //   49	1	18	localNullPointerException9	NullPointerException
    //   58	1	19	localNullPointerException10	NullPointerException
    // Exception table:
    //   from	to	target	type
    //   4	16	16	java/lang/NullPointerException
    //   4	17	17	java/lang/IllegalArgumentException
    //   4	18	18	java/lang/NullPointerException
    //   4	19	19	java/lang/IllegalArgumentException
    //   4	20	20	java/lang/NullPointerException
    //   4	21	21	java/lang/IllegalArgumentException
    //   4	22	22	java/lang/NullPointerException
    //   4	23	23	java/lang/IllegalArgumentException
    //   4	24	24	java/lang/NullPointerException
    //   4	25	25	java/lang/IllegalArgumentException
    //   4	26	26	java/lang/NullPointerException
    //   4	27	27	java/lang/IllegalArgumentException
    //   4	28	28	java/lang/NullPointerException
    //   4	29	29	java/lang/IllegalArgumentException
    //   4	30	30	java/lang/NullPointerException
    //   31	46	49	java/lang/NullPointerException
    //   36	58	58	java/lang/NullPointerException
  }
  
  protected void h(T a) {}
}
