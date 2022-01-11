package com.sun.jna.z.a.f.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.d.c;
import com.sun.jna.z.a.f.a.a.a.e.e;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class d
  implements k
{
  public int e()
  {
    return a.c.y;
  }
  
  public Color n()
  {
    return a.g;
  }
  
  protected com.sun.jna.z.a.f.a.a.a.e.d a()
  {
    return a.b.a(a);
  }
  
  public int g()
  {
    return a.c.height;
  }
  
  public boolean p()
  {
    return a.i;
  }
  
  public void b(int a)
  {
    a.c.x = a;
  }
  
  private List<c> j = new CopyOnWriteArrayList();
  
  protected void b(c a)
  {
    synchronized (a.j)
    {
      a.j.remove(a);
    }
  }
  
  public Dimension i()
  {
    return a.c.getSize();
  }
  
  public e a()
  {
    return a.b;
  }
  
  protected void a(c a)
  {
    synchronized (a.j)
    {
      a.j.add(a);
    }
  }
  
  public void c(Color a)
  {
    a.g = a;
  }
  
  protected Rectangle c = new Rectangle(0, 0, 0, 0);
  
  public void b(Color a)
  {
    a.e = a;
  }
  
  public void a(Color a)
  {
    a.f = a;
  }
  
  private l a = null;
  
  public int f()
  {
    return a.c.width;
  }
  
  public Rectangle j()
  {
    return a.c;
  }
  
  public void c(int a)
  {
    a.c.y = a;
  }
  
  public int d()
  {
    return a.c.x;
  }
  
  public boolean q()
  {
    return a.h;
  }
  
  public void o()
  {
    Dimension a = a.d.b(a);a.d(a.width);a.e(a.height);
  }
  
  public void d(int a)
  {
    a.c.width = a;
  }
  
  public void b()
  {
    int a = k;
    try
    {
      if (a != 0) {
        break label24;
      }
      if (a.d != null) {
        break label20;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw localIllegalArgumentException;
    }
    return;
    label20:
    label24:
    a.d.a(a);
  }
  
  public void c()
  {
    int a = k;
    try
    {
      if (a != 0) {
        break label24;
      }
      if (a.d != null) {
        break label20;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw localIllegalArgumentException;
    }
    return;
    label20:
    label24:
    a.d.f(a);
  }
  
  public l k()
  {
    return a.a;
  }
  
  public Color l()
  {
    return a.f;
  }
  
  public Color m()
  {
    return a.e;
  }
  
  public void e(int a)
  {
    a.c.height = a;
  }
  
  public Point h()
  {
    return a.c.getLocation();
  }
  
  protected boolean h = true;
  protected boolean i = true;
  private e b;
  protected com.sun.jna.z.a.f.a.a.a.e.d d;
  protected Color e;
  protected Color f;
  protected Color g;
  public static int k;
  
  /* Error */
  public void a(int a, int a, int a)
  {
    // Byte code:
    //   0: getstatic 196	com/sun/jna/z/a/f/a/a/a/a/d:k	I
    //   3: istore 4
    //   5: aload_0
    //   6: getfield 51	com/sun/jna/z/a/f/a/a/a/a/d:d	Lcom/sun/jna/z/a/f/a/a/a/e/d;
    //   9: iload 4
    //   11: ifne +18 -> 29
    //   14: ifnull +105 -> 119
    //   17: goto +4 -> 21
    //   20: athrow
    //   21: aload_0
    //   22: getfield 51	com/sun/jna/z/a/f/a/a/a/a/d:d	Lcom/sun/jna/z/a/f/a/a/a/e/d;
    //   25: goto +4 -> 29
    //   28: athrow
    //   29: aload_0
    //   30: invokeinterface 70 2 0
    //   35: astore 5
    //   37: aload 5
    //   39: arraylength
    //   40: istore 6
    //   42: iconst_0
    //   43: istore 7
    //   45: iload 7
    //   47: iload 6
    //   49: if_icmpge +70 -> 119
    //   52: aload 5
    //   54: iload 7
    //   56: aaload
    //   57: astore 8
    //   59: iload 4
    //   61: ifne +53 -> 114
    //   64: aload 8
    //   66: iload_1
    //   67: iload_2
    //   68: invokevirtual 76	java/awt/Rectangle:contains	(II)Z
    //   71: ifeq +36 -> 107
    //   74: goto +4 -> 78
    //   77: athrow
    //   78: aload_0
    //   79: getfield 51	com/sun/jna/z/a/f/a/a/a/a/d:d	Lcom/sun/jna/z/a/f/a/a/a/e/d;
    //   82: aload_0
    //   83: new 78	java/awt/Point
    //   86: dup
    //   87: iload_1
    //   88: iload_2
    //   89: invokespecial 81	java/awt/Point:<init>	(II)V
    //   92: iload_3
    //   93: invokeinterface 84 4 0
    //   98: iload 4
    //   100: ifeq +19 -> 119
    //   103: goto +4 -> 107
    //   106: athrow
    //   107: iinc 7 1
    //   110: goto +4 -> 114
    //   113: athrow
    //   114: iload 4
    //   116: ifeq -71 -> 45
    //   119: return
    // Line number table:
    //   Java source line #36	-> byte code offset #5
    //   Java source line #97	-> byte code offset #21
    //   Java source line #76	-> byte code offset #59
    //   Java source line #51	-> byte code offset #78
    //   Java source line #16	-> byte code offset #98
    //   Java source line #45	-> byte code offset #107
    //   Java source line #10	-> byte code offset #119
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	a	d
    //   0	120	1	a	int
    //   0	120	2	a	int
    //   0	120	3	a	int
    //   3	116	4	a	int
    //   35	81	5	a	Rectangle[]
    //   40	76	6	a	int
    //   43	73	7	a	int
    //   59	48	8	a	Rectangle
    // Exception table:
    //   from	to	target	type
    //   5	17	20	java/lang/IllegalArgumentException
    //   14	25	28	java/lang/IllegalArgumentException
    //   59	74	77	java/lang/IllegalArgumentException
    //   64	103	106	java/lang/IllegalArgumentException
    //   78	110	113	java/lang/IllegalArgumentException
  }
  
  public void b(int a, int a, int a) {}
  
  /* Error */
  public void a(e a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 61	com/sun/jna/z/a/f/a/a/a/a/d:b	Lcom/sun/jna/z/a/f/a/a/a/e/e;
    //   4: astore_3
    //   5: getstatic 196	com/sun/jna/z/a/f/a/a/a/a/d:k	I
    //   8: aload_0
    //   9: aload_1
    //   10: putfield 61	com/sun/jna/z/a/f/a/a/a/a/d:b	Lcom/sun/jna/z/a/f/a/a/a/e/e;
    //   13: istore_2
    //   14: aload_1
    //   15: iload_2
    //   16: ifne +44 -> 60
    //   19: ifnonnull +24 -> 43
    //   22: goto +4 -> 26
    //   25: athrow
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield 51	com/sun/jna/z/a/f/a/a/a/a/d:d	Lcom/sun/jna/z/a/f/a/a/a/e/d;
    //   31: aload_0
    //   32: aconst_null
    //   33: putfield 91	com/sun/jna/z/a/f/a/a/a/a/d:e	Ljava/awt/Color;
    //   36: aload_0
    //   37: aconst_null
    //   38: putfield 93	com/sun/jna/z/a/f/a/a/a/a/d:f	Ljava/awt/Color;
    //   41: return
    //   42: athrow
    //   43: aload_0
    //   44: iload_2
    //   45: ifne +99 -> 144
    //   48: aload_0
    //   49: invokevirtual 95	com/sun/jna/z/a/f/a/a/a/a/d:a	()Lcom/sun/jna/z/a/f/a/a/a/e/d;
    //   52: putfield 51	com/sun/jna/z/a/f/a/a/a/a/d:d	Lcom/sun/jna/z/a/f/a/a/a/e/d;
    //   55: aload_3
    //   56: goto +4 -> 60
    //   59: athrow
    //   60: ifnull +79 -> 139
    //   63: aload_3
    //   64: aload_0
    //   65: invokeinterface 66 2 0
    //   70: aload_0
    //   71: invokeinterface 98 2 0
    //   76: astore 5
    //   78: aload_0
    //   79: getfield 38	com/sun/jna/z/a/f/a/a/a/a/d:c	Ljava/awt/Rectangle;
    //   82: getfield 101	java/awt/Rectangle:width	I
    //   85: aload 5
    //   87: getfield 104	java/awt/Dimension:width	I
    //   90: iload_2
    //   91: ifne +34 -> 125
    //   94: if_icmpne +38 -> 132
    //   97: goto +4 -> 101
    //   100: athrow
    //   101: aload_0
    //   102: getfield 38	com/sun/jna/z/a/f/a/a/a/a/d:c	Ljava/awt/Rectangle;
    //   105: getfield 107	java/awt/Rectangle:height	I
    //   108: iload_2
    //   109: ifne +20 -> 129
    //   112: goto +4 -> 116
    //   115: athrow
    //   116: aload 5
    //   118: getfield 108	java/awt/Dimension:height	I
    //   121: goto +4 -> 125
    //   124: athrow
    //   125: if_icmpne +7 -> 132
    //   128: iconst_1
    //   129: goto +4 -> 133
    //   132: iconst_0
    //   133: istore 4
    //   135: iload_2
    //   136: ifeq +27 -> 163
    //   139: aload_0
    //   140: goto +4 -> 144
    //   143: athrow
    //   144: getfield 38	com/sun/jna/z/a/f/a/a/a/a/d:c	Ljava/awt/Rectangle;
    //   147: new 33	java/awt/Rectangle
    //   150: dup
    //   151: iconst_0
    //   152: iconst_0
    //   153: iconst_0
    //   154: iconst_0
    //   155: invokespecial 36	java/awt/Rectangle:<init>	(IIII)V
    //   158: invokevirtual 112	java/awt/Rectangle:equals	(Ljava/lang/Object;)Z
    //   161: istore 4
    //   163: iload 4
    //   165: ifeq +50 -> 215
    //   168: aload_0
    //   169: getfield 51	com/sun/jna/z/a/f/a/a/a/a/d:d	Lcom/sun/jna/z/a/f/a/a/a/e/d;
    //   172: aload_0
    //   173: invokeinterface 98 2 0
    //   178: astore 5
    //   180: aload_0
    //   181: new 33	java/awt/Rectangle
    //   184: dup
    //   185: aload_0
    //   186: getfield 38	com/sun/jna/z/a/f/a/a/a/a/d:c	Ljava/awt/Rectangle;
    //   189: getfield 114	java/awt/Rectangle:x	I
    //   192: aload_0
    //   193: getfield 38	com/sun/jna/z/a/f/a/a/a/a/d:c	Ljava/awt/Rectangle;
    //   196: getfield 116	java/awt/Rectangle:y	I
    //   199: aload 5
    //   201: getfield 104	java/awt/Dimension:width	I
    //   204: aload 5
    //   206: getfield 108	java/awt/Dimension:height	I
    //   209: invokespecial 36	java/awt/Rectangle:<init>	(IIII)V
    //   212: putfield 38	com/sun/jna/z/a/f/a/a/a/a/d:c	Ljava/awt/Rectangle;
    //   215: aload_0
    //   216: aload_0
    //   217: getfield 51	com/sun/jna/z/a/f/a/a/a/a/d:d	Lcom/sun/jna/z/a/f/a/a/a/e/d;
    //   220: aload_0
    //   221: invokeinterface 119 2 0
    //   226: putfield 91	com/sun/jna/z/a/f/a/a/a/a/d:e	Ljava/awt/Color;
    //   229: aload_0
    //   230: aload_0
    //   231: getfield 51	com/sun/jna/z/a/f/a/a/a/a/d:d	Lcom/sun/jna/z/a/f/a/a/a/e/d;
    //   234: aload_0
    //   235: invokeinterface 121 2 0
    //   240: putfield 93	com/sun/jna/z/a/f/a/a/a/a/d:f	Ljava/awt/Color;
    //   243: return
    // Line number table:
    //   Java source line #11	-> byte code offset #0
    //   Java source line #49	-> byte code offset #8
    //   Java source line #87	-> byte code offset #13
    //   Java source line #38	-> byte code offset #26
    //   Java source line #18	-> byte code offset #31
    //   Java source line #95	-> byte code offset #36
    //   Java source line #24	-> byte code offset #41
    //   Java source line #30	-> byte code offset #43
    //   Java source line #93	-> byte code offset #55
    //   Java source line #55	-> byte code offset #63
    //   Java source line #48	-> byte code offset #78
    //   Java source line #13	-> byte code offset #135
    //   Java source line #21	-> byte code offset #139
    //   Java source line #83	-> byte code offset #163
    //   Java source line #12	-> byte code offset #168
    //   Java source line #28	-> byte code offset #180
    //   Java source line #47	-> byte code offset #215
    //   Java source line #58	-> byte code offset #229
    //   Java source line #92	-> byte code offset #243
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	244	0	a	d
    //   0	244	1	a	e
    //   13	230	2	a	int
    //   8	236	3	a	e
    //   135	4	4	a	boolean
    //   163	81	4	a	boolean
    //   78	57	5	a	Dimension
    //   180	35	5	a	Dimension
    // Exception table:
    //   from	to	target	type
    //   14	22	25	java/lang/IllegalArgumentException
    //   19	42	42	java/lang/IllegalArgumentException
    //   43	56	59	java/lang/IllegalArgumentException
    //   78	97	100	java/lang/IllegalArgumentException
    //   94	112	115	java/lang/IllegalArgumentException
    //   101	121	124	java/lang/IllegalArgumentException
    //   135	140	143	java/lang/IllegalArgumentException
  }
  
  /* Error */
  public void a(l a)
  {
    // Byte code:
    //   0: getstatic 196	com/sun/jna/z/a/f/a/a/a/a/d:k	I
    //   3: istore_2
    //   4: aload_1
    //   5: iload_2
    //   6: ifne +32 -> 38
    //   9: aload_0
    //   10: invokeinterface 148 2 0
    //   15: ifeq +51 -> 66
    //   18: goto +4 -> 22
    //   21: athrow
    //   22: aload_0
    //   23: iload_2
    //   24: ifne +52 -> 76
    //   27: goto +4 -> 31
    //   30: athrow
    //   31: getfield 31	com/sun/jna/z/a/f/a/a/a/a/d:a	Lcom/sun/jna/z/a/f/a/a/a/a/l;
    //   34: goto +4 -> 38
    //   37: athrow
    //   38: ifnull +37 -> 75
    //   41: aload_0
    //   42: iload_2
    //   43: ifne +33 -> 76
    //   46: goto +4 -> 50
    //   49: athrow
    //   50: getfield 31	com/sun/jna/z/a/f/a/a/a/a/d:a	Lcom/sun/jna/z/a/f/a/a/a/a/l;
    //   53: aload_0
    //   54: invokeinterface 148 2 0
    //   59: ifeq +16 -> 75
    //   62: goto +4 -> 66
    //   65: athrow
    //   66: new 150	java/lang/IllegalArgumentException
    //   69: dup
    //   70: invokespecial 151	java/lang/IllegalArgumentException:<init>	()V
    //   73: athrow
    //   74: athrow
    //   75: aload_0
    //   76: aload_1
    //   77: putfield 31	com/sun/jna/z/a/f/a/a/a/a/d:a	Lcom/sun/jna/z/a/f/a/a/a/a/l;
    //   80: return
    // Line number table:
    //   Java source line #57	-> byte code offset #4
    //   Java source line #63	-> byte code offset #54
    //   Java source line #39	-> byte code offset #66
    //   Java source line #54	-> byte code offset #75
    //   Java source line #56	-> byte code offset #80
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	a	d
    //   0	81	1	a	l
    //   3	77	2	a	int
    // Exception table:
    //   from	to	target	type
    //   4	18	21	java/lang/IllegalArgumentException
    //   9	27	30	java/lang/IllegalArgumentException
    //   22	34	37	java/lang/IllegalArgumentException
    //   38	46	49	java/lang/IllegalArgumentException
    //   41	62	65	java/lang/IllegalArgumentException
    //   50	74	74	java/lang/IllegalArgumentException
  }
  
  /* Error */
  public void d(boolean a)
  {
    // Byte code:
    //   0: getstatic 196	com/sun/jna/z/a/f/a/a/a/a/d:k	I
    //   3: istore_2
    //   4: aload_0
    //   5: iload_2
    //   6: ifne +55 -> 61
    //   9: getfield 31	com/sun/jna/z/a/f/a/a/a/a/d:a	Lcom/sun/jna/z/a/f/a/a/a/a/l;
    //   12: ifnull +44 -> 56
    //   15: goto +4 -> 19
    //   18: athrow
    //   19: aload_0
    //   20: iload_2
    //   21: ifne +40 -> 61
    //   24: goto +4 -> 28
    //   27: athrow
    //   28: getfield 31	com/sun/jna/z/a/f/a/a/a/a/d:a	Lcom/sun/jna/z/a/f/a/a/a/a/l;
    //   31: invokeinterface 161 1 0
    //   36: ifne +20 -> 56
    //   39: goto +4 -> 43
    //   42: athrow
    //   43: aload_0
    //   44: iconst_0
    //   45: putfield 40	com/sun/jna/z/a/f/a/a/a/a/d:h	Z
    //   48: iload_2
    //   49: ifeq +16 -> 65
    //   52: goto +4 -> 56
    //   55: athrow
    //   56: aload_0
    //   57: goto +4 -> 61
    //   60: athrow
    //   61: iload_1
    //   62: putfield 40	com/sun/jna/z/a/f/a/a/a/a/d:h	Z
    //   65: return
    // Line number table:
    //   Java source line #22	-> byte code offset #4
    //   Java source line #88	-> byte code offset #43
    //   Java source line #6	-> byte code offset #56
    //   Java source line #20	-> byte code offset #65
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	a	d
    //   0	66	1	a	boolean
    //   3	62	2	a	int
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/IllegalArgumentException
    //   9	24	27	java/lang/IllegalArgumentException
    //   19	39	42	java/lang/IllegalArgumentException
    //   28	52	55	java/lang/IllegalArgumentException
    //   43	57	60	java/lang/IllegalArgumentException
  }
  
  /* Error */
  public void c(boolean a)
  {
    // Byte code:
    //   0: getstatic 196	com/sun/jna/z/a/f/a/a/a/a/d:k	I
    //   3: istore_2
    //   4: aload_0
    //   5: iload_2
    //   6: ifne +55 -> 61
    //   9: getfield 31	com/sun/jna/z/a/f/a/a/a/a/d:a	Lcom/sun/jna/z/a/f/a/a/a/a/l;
    //   12: ifnull +44 -> 56
    //   15: goto +4 -> 19
    //   18: athrow
    //   19: aload_0
    //   20: iload_2
    //   21: ifne +40 -> 61
    //   24: goto +4 -> 28
    //   27: athrow
    //   28: getfield 31	com/sun/jna/z/a/f/a/a/a/a/d:a	Lcom/sun/jna/z/a/f/a/a/a/a/l;
    //   31: invokeinterface 164 1 0
    //   36: ifne +20 -> 56
    //   39: goto +4 -> 43
    //   42: athrow
    //   43: aload_0
    //   44: iconst_0
    //   45: putfield 42	com/sun/jna/z/a/f/a/a/a/a/d:i	Z
    //   48: iload_2
    //   49: ifeq +16 -> 65
    //   52: goto +4 -> 56
    //   55: athrow
    //   56: aload_0
    //   57: goto +4 -> 61
    //   60: athrow
    //   61: iload_1
    //   62: putfield 42	com/sun/jna/z/a/f/a/a/a/a/d:i	Z
    //   65: return
    // Line number table:
    //   Java source line #3	-> byte code offset #4
    //   Java source line #81	-> byte code offset #43
    //   Java source line #40	-> byte code offset #56
    //   Java source line #84	-> byte code offset #65
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	a	d
    //   0	66	1	a	boolean
    //   3	62	2	a	int
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/IllegalArgumentException
    //   9	24	27	java/lang/IllegalArgumentException
    //   19	39	42	java/lang/IllegalArgumentException
    //   28	52	55	java/lang/IllegalArgumentException
    //   43	57	60	java/lang/IllegalArgumentException
  }
  
  /* Error */
  protected c[] b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 47	com/sun/jna/z/a/f/a/a/a/a/d:j	Ljava/util/List;
    //   4: dup
    //   5: astore_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 47	com/sun/jna/z/a/f/a/a/a/a/d:j	Ljava/util/List;
    //   11: aload_0
    //   12: getfield 47	com/sun/jna/z/a/f/a/a/a/a/d:j	Ljava/util/List;
    //   15: invokeinterface 182 1 0
    //   20: anewarray 172	com/sun/jna/z/a/f/a/a/a/d/c
    //   23: invokeinterface 186 2 0
    //   28: checkcast 188	[Lcom/sun/jna/z/a/f/a/a/a/d/c;
    //   31: aload_1
    //   32: monitorexit
    //   33: areturn
    //   34: astore_2
    //   35: aload_1
    //   36: monitorexit
    //   37: aload_2
    //   38: athrow
    // Line number table:
    //   Java source line #9	-> byte code offset #0
    //   Java source line #41	-> byte code offset #7
    //   Java source line #46	-> byte code offset #34
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	a	d
    //   5	31	1	Ljava/lang/Object;	Object
    //   34	4	2	localObject1	Object
    // Exception table:
    //   from	to	target	type
    //   7	33	34	finally
    //   34	37	34	finally
  }
}
