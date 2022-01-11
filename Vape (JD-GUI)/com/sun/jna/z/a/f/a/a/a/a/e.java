package com.sun.jna.z.a.f.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.c.c;
import com.sun.jna.z.a.f.a.a.a.c.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public abstract class e
  extends d
  implements l
{
  public com.sun.jna.z.a.f.a.a.a.c.d[] a(k a)
  {
    int a = d.k;
    try
    {
      if (a == null) {
        throw new NullPointerException();
      }
    }
    catch (NullPointerException localNullPointerException1)
    {
      throw localNullPointerException1;
    }
    synchronized (a.l)
    {
      com.sun.jna.z.a.f.a.a.a.c.d[] a = (com.sun.jna.z.a.f.a.a.a.c.d[])a.l.get(a);
      try
      {
        if (a != 0) {
          break label54;
        }
        if (a == null) {
          break label57;
        }
      }
      catch (NullPointerException localNullPointerException2)
      {
        throw localNullPointerException2;
      }
      tmpTernaryOp = a;
      label54:
      label57:
      return new com.sun.jna.z.a.f.a.a.a.c.d[0];
    }
  }
  
  private Map<k, com.sun.jna.z.a.f.a.a.a.c.d[]> l = new LinkedHashMap();
  
  public boolean b(k a)
  {
    synchronized (a.l)
    {
      return a.l.get(a) != null;
    }
  }
  
  public g a()
  {
    return a.m;
  }
  
  public void c(boolean a)
  {
    a.c(a);
    
    a = a.p();int a = d.k;
    synchronized (a.l)
    {
      k a;
      for (Iterator localIterator = a.l.keySet().iterator(); localIterator.hasNext(); ) {
        a = (k)localIterator.next();
      }
    }
  }
  
  public void d(boolean a)
  {
    a.d(a);
    
    a = a.q();
    
    int a = d.k;
    synchronized (a.l)
    {
      k a;
      for (Iterator localIterator = a.l.keySet().iterator(); localIterator.hasNext(); ) {
        a = (k)localIterator.next();
      }
    }
  }
  
  public void b()
  {
    a.b();int a = d.k;
    synchronized (a.l)
    {
      for (k a : a.l.keySet()) {
        try
        {
          a.b();
          if (a == 0) {
            if (a == 0) {
              continue;
            }
          }
        }
        catch (NullPointerException localNullPointerException)
        {
          throw localNullPointerException;
        }
      }
    }
  }
  
  private g m = new c();
  
  public void c()
  {
    k[] a = a.b();int a = a.length;int a = d.k;int a = 0;
    do
    {
      if (a >= a) {
        break;
      }
      k a = a[a];a.c();
      
      a++;
    } while (a == 0);
  }
  
  public void a(com.sun.jna.z.a.f.a.a.a.e.e a)
  {
    a.a(a);
    
    int a = d.k;
    synchronized (a.l)
    {
      k a;
      for (Iterator localIterator = a.l.keySet().iterator(); localIterator.hasNext(); ) {
        a = (k)localIterator.next();
      }
    }
  }
  
  public void a(g a)
  {
    int a = d.k;
    try
    {
      if (a != 0) {
        return;
      }
      if (a != null) {
        break label24;
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      throw localNullPointerException;
    }
    a = new c();
    label24:
    a.m = a;
    a.d();
  }
  
  /* Error */
  public void a(k a, k a, com.sun.jna.z.a.f.a.a.a.c.d... a)
  {
    // Byte code:
    //   0: getstatic 218	com/sun/jna/z/a/f/a/a/a/a/d:k	I
    //   3: new 18	java/util/LinkedHashMap
    //   6: dup
    //   7: invokespecial 19	java/util/LinkedHashMap:<init>	()V
    //   10: astore 5
    //   12: istore 4
    //   14: aload_0
    //   15: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   18: dup
    //   19: astore 6
    //   21: monitorenter
    //   22: aload_0
    //   23: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   26: invokeinterface 37 1 0
    //   31: invokeinterface 43 1 0
    //   36: astore 7
    //   38: aload 7
    //   40: invokeinterface 51 1 0
    //   45: ifeq +86 -> 131
    //   48: aload 7
    //   50: invokeinterface 55 1 0
    //   55: checkcast 57	com/sun/jna/z/a/f/a/a/a/a/k
    //   58: astore 8
    //   60: aload 5
    //   62: aload 8
    //   64: aload_0
    //   65: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   68: aload 8
    //   70: invokeinterface 67 2 0
    //   75: invokeinterface 71 3 0
    //   80: pop
    //   81: iload 4
    //   83: ifne +51 -> 134
    //   86: aload 8
    //   88: iload 4
    //   90: ifne +31 -> 121
    //   93: goto +4 -> 97
    //   96: athrow
    //   97: aload_1
    //   98: invokevirtual 75	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   101: ifeq +25 -> 126
    //   104: goto +4 -> 108
    //   107: athrow
    //   108: aload 5
    //   110: aload_2
    //   111: aload_3
    //   112: invokeinterface 71 3 0
    //   117: goto +4 -> 121
    //   120: athrow
    //   121: pop
    //   122: aload_0
    //   123: invokevirtual 78	com/sun/jna/z/a/f/a/a/a/a/e:d	()V
    //   126: iload 4
    //   128: ifeq -90 -> 38
    //   131: aload 6
    //   133: monitorexit
    //   134: goto +11 -> 145
    //   137: astore 9
    //   139: aload 6
    //   141: monitorexit
    //   142: aload 9
    //   144: athrow
    //   145: aload_0
    //   146: aload 5
    //   148: putfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   151: return
    // Line number table:
    //   Java source line #104	-> byte code offset #3
    //   Java source line #57	-> byte code offset #12
    //   Java source line #118	-> byte code offset #22
    //   Java source line #111	-> byte code offset #60
    //   Java source line #138	-> byte code offset #81
    //   Java source line #146	-> byte code offset #108
    //   Java source line #30	-> byte code offset #122
    //   Java source line #42	-> byte code offset #126
    //   Java source line #38	-> byte code offset #131
    //   Java source line #154	-> byte code offset #145
    //   Java source line #85	-> byte code offset #151
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	152	0	a	e
    //   0	152	1	a	k
    //   0	152	2	a	k
    //   0	152	3	a	com.sun.jna.z.a.f.a.a.a.c.d[]
    //   12	139	4	a	int
    //   12	140	5	a	Map<k, com.sun.jna.z.a.f.a.a.a.c.d[]>
    //   60	66	8	a	k
    // Exception table:
    //   from	to	target	type
    //   60	93	96	java/lang/NullPointerException
    //   86	104	107	java/lang/NullPointerException
    //   97	117	120	java/lang/NullPointerException
    //   22	134	137	finally
    //   137	142	137	finally
  }
  
  /* Error */
  public k[] b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   4: dup
    //   5: astore_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   11: invokeinterface 37 1 0
    //   16: aload_0
    //   17: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   20: invokeinterface 86 1 0
    //   25: anewarray 57	com/sun/jna/z/a/f/a/a/a/a/k
    //   28: invokeinterface 90 2 0
    //   33: checkcast 92	[Lcom/sun/jna/z/a/f/a/a/a/a/k;
    //   36: aload_1
    //   37: monitorexit
    //   38: areturn
    //   39: astore_2
    //   40: aload_1
    //   41: monitorexit
    //   42: aload_2
    //   43: athrow
    // Line number table:
    //   Java source line #66	-> byte code offset #0
    //   Java source line #46	-> byte code offset #7
    //   Java source line #28	-> byte code offset #39
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	a	e
    //   5	36	1	Ljava/lang/Object;	Object
    //   39	4	2	localObject1	Object
    // Exception table:
    //   from	to	target	type
    //   7	38	39	finally
    //   39	42	39	finally
  }
  
  /* Error */
  public void a(k a, com.sun.jna.z.a.f.a.a.a.c.d... a)
  {
    // Byte code:
    //   0: getstatic 218	com/sun/jna/z/a/f/a/a/a/a/d:k	I
    //   3: aload_0
    //   4: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   7: dup
    //   8: astore 4
    //   10: monitorenter
    //   11: istore_3
    //   12: aload_1
    //   13: invokeinterface 97 1 0
    //   18: astore 5
    //   20: aload 5
    //   22: iload_3
    //   23: ifne +57 -> 80
    //   26: ifnull +43 -> 69
    //   29: goto +4 -> 33
    //   32: athrow
    //   33: aload 5
    //   35: aload_1
    //   36: invokeinterface 100 2 0
    //   41: iload_3
    //   42: ifne +43 -> 85
    //   45: goto +4 -> 49
    //   48: athrow
    //   49: ifeq +20 -> 69
    //   52: goto +4 -> 56
    //   55: athrow
    //   56: aload 5
    //   58: aload_1
    //   59: invokeinterface 103 2 0
    //   64: pop
    //   65: goto +4 -> 69
    //   68: athrow
    //   69: aload_0
    //   70: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   73: aload_1
    //   74: aload_2
    //   75: invokeinterface 71 3 0
    //   80: pop
    //   81: aload_0
    //   82: getfield 107	com/sun/jna/z/a/f/a/a/a/a/e:h	Z
    //   85: iload_3
    //   86: ifne +33 -> 119
    //   89: ifne +18 -> 107
    //   92: goto +4 -> 96
    //   95: athrow
    //   96: aload_1
    //   97: iconst_0
    //   98: invokeinterface 110 2 0
    //   103: goto +4 -> 107
    //   106: athrow
    //   107: aload_0
    //   108: iload_3
    //   109: ifne +42 -> 151
    //   112: getfield 113	com/sun/jna/z/a/f/a/a/a/a/e:i	Z
    //   115: goto +4 -> 119
    //   118: athrow
    //   119: ifne +14 -> 133
    //   122: aload_1
    //   123: iconst_0
    //   124: invokeinterface 115 2 0
    //   129: goto +4 -> 133
    //   132: athrow
    //   133: aload_1
    //   134: aload_0
    //   135: invokeinterface 118 2 0
    //   140: aload_1
    //   141: aload_0
    //   142: invokevirtual 121	com/sun/jna/z/a/f/a/a/a/a/e:a	()Lcom/sun/jna/z/a/f/a/a/a/e/e;
    //   145: invokeinterface 124 2 0
    //   150: aload_0
    //   151: invokevirtual 78	com/sun/jna/z/a/f/a/a/a/a/e:d	()V
    //   154: aload 4
    //   156: monitorexit
    //   157: goto +11 -> 168
    //   160: astore 6
    //   162: aload 4
    //   164: monitorexit
    //   165: aload 6
    //   167: athrow
    //   168: getstatic 223	com/sun/jna/z/a/j:g	Z
    //   171: ifeq +14 -> 185
    //   174: iinc 3 1
    //   177: iload_3
    //   178: putstatic 218	com/sun/jna/z/a/f/a/a/a/a/d:k	I
    //   181: goto +4 -> 185
    //   184: athrow
    //   185: return
    // Line number table:
    //   Java source line #124	-> byte code offset #3
    //   Java source line #88	-> byte code offset #12
    //   Java source line #19	-> byte code offset #20
    //   Java source line #55	-> byte code offset #56
    //   Java source line #112	-> byte code offset #69
    //   Java source line #143	-> byte code offset #81
    //   Java source line #23	-> byte code offset #96
    //   Java source line #24	-> byte code offset #107
    //   Java source line #5	-> byte code offset #122
    //   Java source line #17	-> byte code offset #133
    //   Java source line #36	-> byte code offset #140
    //   Java source line #35	-> byte code offset #150
    //   Java source line #64	-> byte code offset #154
    //   Java source line #122	-> byte code offset #168
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	186	0	a	e
    //   0	186	1	a	k
    //   0	186	2	a	com.sun.jna.z.a.f.a.a.a.c.d[]
    //   11	174	3	a	int
    //   20	134	5	a	l
    // Exception table:
    //   from	to	target	type
    //   20	29	32	java/lang/NullPointerException
    //   26	45	48	java/lang/NullPointerException
    //   33	52	55	java/lang/NullPointerException
    //   49	65	68	java/lang/NullPointerException
    //   85	92	95	java/lang/NullPointerException
    //   89	103	106	java/lang/NullPointerException
    //   107	115	118	java/lang/NullPointerException
    //   119	129	132	java/lang/NullPointerException
    //   12	157	160	finally
    //   160	165	160	finally
    //   168	181	184	java/lang/NullPointerException
  }
  
  /* Error */
  public k a(int a, int a)
  {
    // Byte code:
    //   0: getstatic 218	com/sun/jna/z/a/f/a/a/a/a/d:k	I
    //   3: aload_0
    //   4: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   7: dup
    //   8: astore 4
    //   10: monitorenter
    //   11: istore_3
    //   12: aload_0
    //   13: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   16: invokeinterface 37 1 0
    //   21: invokeinterface 43 1 0
    //   26: astore 5
    //   28: aload 5
    //   30: invokeinterface 51 1 0
    //   35: ifeq +52 -> 87
    //   38: aload 5
    //   40: invokeinterface 55 1 0
    //   45: checkcast 57	com/sun/jna/z/a/f/a/a/a/a/k
    //   48: astore 6
    //   50: aload 6
    //   52: iload_3
    //   53: ifne +29 -> 82
    //   56: invokeinterface 137 1 0
    //   61: iload_1
    //   62: iload_2
    //   63: invokevirtual 143	java/awt/Rectangle:contains	(II)Z
    //   66: ifeq +17 -> 83
    //   69: goto +4 -> 73
    //   72: athrow
    //   73: aload 6
    //   75: aload 4
    //   77: monitorexit
    //   78: goto +4 -> 82
    //   81: athrow
    //   82: areturn
    //   83: iload_3
    //   84: ifeq -56 -> 28
    //   87: aconst_null
    //   88: aload 4
    //   90: monitorexit
    //   91: areturn
    //   92: astore 7
    //   94: aload 4
    //   96: monitorexit
    //   97: aload 7
    //   99: athrow
    // Line number table:
    //   Java source line #48	-> byte code offset #3
    //   Java source line #72	-> byte code offset #12
    //   Java source line #60	-> byte code offset #50
    //   Java source line #139	-> byte code offset #73
    //   Java source line #78	-> byte code offset #83
    //   Java source line #10	-> byte code offset #87
    //   Java source line #121	-> byte code offset #92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	a	e
    //   0	100	1	a	int
    //   0	100	2	a	int
    //   11	88	3	a	int
    //   50	33	6	a	k
    // Exception table:
    //   from	to	target	type
    //   50	69	72	java/lang/NullPointerException
    //   56	78	81	java/lang/NullPointerException
    //   12	82	92	finally
    //   83	91	92	finally
    //   92	97	92	finally
  }
  
  /* Error */
  public boolean c(k a)
  {
    // Byte code:
    //   0: getstatic 218	com/sun/jna/z/a/f/a/a/a/a/d:k	I
    //   3: aload_0
    //   4: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   7: dup
    //   8: astore_3
    //   9: monitorenter
    //   10: istore_2
    //   11: aload_0
    //   12: iload_2
    //   13: ifne +24 -> 37
    //   16: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   19: aload_1
    //   20: invokeinterface 146 2 0
    //   25: ifnull +19 -> 44
    //   28: goto +4 -> 32
    //   31: athrow
    //   32: aload_0
    //   33: goto +4 -> 37
    //   36: athrow
    //   37: invokevirtual 78	com/sun/jna/z/a/f/a/a/a/a/e:d	()V
    //   40: iconst_1
    //   41: aload_3
    //   42: monitorexit
    //   43: ireturn
    //   44: iconst_0
    //   45: aload_3
    //   46: monitorexit
    //   47: ireturn
    //   48: astore 4
    //   50: aload_3
    //   51: monitorexit
    //   52: aload 4
    //   54: athrow
    // Line number table:
    //   Java source line #140	-> byte code offset #3
    //   Java source line #20	-> byte code offset #11
    //   Java source line #8	-> byte code offset #32
    //   Java source line #120	-> byte code offset #40
    //   Java source line #102	-> byte code offset #44
    //   Java source line #134	-> byte code offset #48
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	a	e
    //   0	55	1	a	k
    //   10	44	2	a	int
    // Exception table:
    //   from	to	target	type
    //   11	28	31	java/lang/NullPointerException
    //   16	33	36	java/lang/NullPointerException
    //   11	43	48	finally
    //   44	47	48	finally
    //   48	52	48	finally
  }
  
  /* Error */
  public void d()
  {
    // Byte code:
    //   0: getstatic 218	com/sun/jna/z/a/f/a/a/a/a/d:k	I
    //   3: aload_0
    //   4: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   7: dup
    //   8: astore_2
    //   9: monitorenter
    //   10: istore_1
    //   11: aload_0
    //   12: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   15: invokeinterface 37 1 0
    //   20: aload_0
    //   21: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   24: invokeinterface 86 1 0
    //   29: anewarray 57	com/sun/jna/z/a/f/a/a/a/a/k
    //   32: invokeinterface 90 2 0
    //   37: checkcast 92	[Lcom/sun/jna/z/a/f/a/a/a/a/k;
    //   40: astore_3
    //   41: aload_3
    //   42: arraylength
    //   43: anewarray 139	java/awt/Rectangle
    //   46: astore 4
    //   48: iconst_0
    //   49: istore 5
    //   51: iload 5
    //   53: aload_3
    //   54: arraylength
    //   55: if_icmpge +47 -> 102
    //   58: aload 4
    //   60: iload_1
    //   61: ifne +67 -> 128
    //   64: iload 5
    //   66: aload_3
    //   67: iload 5
    //   69: aaload
    //   70: invokeinterface 137 1 0
    //   75: aastore
    //   76: iinc 5 1
    //   79: iload_1
    //   80: ifeq -29 -> 51
    //   83: goto +4 -> 87
    //   86: athrow
    //   87: getstatic 223	com/sun/jna/z/a/j:g	Z
    //   90: ifeq +8 -> 98
    //   93: iconst_0
    //   94: goto +5 -> 99
    //   97: athrow
    //   98: iconst_1
    //   99: putstatic 223	com/sun/jna/z/a/j:g	Z
    //   102: aload_0
    //   103: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   106: invokeinterface 154 1 0
    //   111: aload_0
    //   112: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   115: invokeinterface 86 1 0
    //   120: anewarray 125	[Lcom/sun/jna/z/a/f/a/a/a/c/d;
    //   123: invokeinterface 157 2 0
    //   128: checkcast 159	[[Lcom/sun/jna/z/a/f/a/a/a/c/d;
    //   131: astore 5
    //   133: aload_0
    //   134: iload_1
    //   135: ifne +18 -> 153
    //   138: invokevirtual 121	com/sun/jna/z/a/f/a/a/a/a/e:a	()Lcom/sun/jna/z/a/f/a/a/a/e/e;
    //   141: ifnull +34 -> 175
    //   144: goto +4 -> 148
    //   147: athrow
    //   148: aload_0
    //   149: goto +4 -> 153
    //   152: athrow
    //   153: getfield 26	com/sun/jna/z/a/f/a/a/a/a/e:m	Lcom/sun/jna/z/a/f/a/a/a/c/g;
    //   156: aload_0
    //   157: getfield 162	com/sun/jna/z/a/f/a/a/a/a/e:d	Lcom/sun/jna/z/a/f/a/a/a/e/d;
    //   160: aload_0
    //   161: invokeinterface 167 2 0
    //   166: aload 4
    //   168: aload 5
    //   170: invokeinterface 172 4 0
    //   175: aload_3
    //   176: astore 6
    //   178: aload 6
    //   180: arraylength
    //   181: istore 7
    //   183: iconst_0
    //   184: istore 8
    //   186: iload 8
    //   188: iload 7
    //   190: if_icmpge +55 -> 245
    //   193: aload 6
    //   195: iload 8
    //   197: aaload
    //   198: astore 9
    //   200: iload_1
    //   201: ifne +46 -> 247
    //   204: iload_1
    //   205: ifne +36 -> 241
    //   208: goto +4 -> 212
    //   211: athrow
    //   212: aload 9
    //   214: instanceof 6
    //   217: ifeq +21 -> 238
    //   220: goto +4 -> 224
    //   223: athrow
    //   224: aload 9
    //   226: checkcast 6	com/sun/jna/z/a/f/a/a/a/a/l
    //   229: invokeinterface 173 1 0
    //   234: goto +4 -> 238
    //   237: athrow
    //   238: iinc 8 1
    //   241: iload_1
    //   242: ifeq -56 -> 186
    //   245: aload_2
    //   246: monitorexit
    //   247: goto +10 -> 257
    //   250: astore 10
    //   252: aload_2
    //   253: monitorexit
    //   254: aload 10
    //   256: athrow
    //   257: return
    // Line number table:
    //   Java source line #153	-> byte code offset #3
    //   Java source line #98	-> byte code offset #11
    //   Java source line #103	-> byte code offset #24
    //   Java source line #132	-> byte code offset #32
    //   Java source line #155	-> byte code offset #41
    //   Java source line #137	-> byte code offset #48
    //   Java source line #145	-> byte code offset #58
    //   Java source line #96	-> byte code offset #76
    //   Java source line #39	-> byte code offset #102
    //   Java source line #105	-> byte code offset #115
    //   Java source line #49	-> byte code offset #123
    //   Java source line #59	-> byte code offset #133
    //   Java source line #11	-> byte code offset #148
    //   Java source line #54	-> byte code offset #175
    //   Java source line #7	-> byte code offset #200
    //   Java source line #89	-> byte code offset #224
    //   Java source line #157	-> byte code offset #238
    //   Java source line #29	-> byte code offset #245
    //   Java source line #107	-> byte code offset #257
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	258	0	a	e
    //   10	247	1	a	int
    //   41	204	3	a	k[]
    //   48	197	4	a	java.awt.Rectangle[]
    //   51	51	5	a	int
    //   133	112	5	a	com.sun.jna.z.a.f.a.a.a.c.d[][]
    //   176	81	6	a	k[]
    //   181	76	7	a	int
    //   184	73	8	a	int
    //   200	38	9	a	k
    // Exception table:
    //   from	to	target	type
    //   58	83	86	java/lang/NullPointerException
    //   87	97	97	java/lang/NullPointerException
    //   133	144	147	java/lang/NullPointerException
    //   138	149	152	java/lang/NullPointerException
    //   200	208	211	java/lang/NullPointerException
    //   204	220	223	java/lang/NullPointerException
    //   212	234	237	java/lang/NullPointerException
    //   11	247	250	finally
    //   250	254	250	finally
  }
  
  /* Error */
  public void a(int a, int a, int a)
  {
    // Byte code:
    //   0: getstatic 218	com/sun/jna/z/a/f/a/a/a/a/d:k	I
    //   3: aload_0
    //   4: iload_1
    //   5: iload_2
    //   6: iload_3
    //   7: invokespecial 176	com/sun/jna/z/a/f/a/a/a/a/d:a	(III)V
    //   10: aload_0
    //   11: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   14: dup
    //   15: astore 5
    //   17: monitorenter
    //   18: istore 4
    //   20: aload_0
    //   21: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   24: invokeinterface 37 1 0
    //   29: invokeinterface 43 1 0
    //   34: astore 6
    //   36: aload 6
    //   38: invokeinterface 51 1 0
    //   43: ifeq +204 -> 247
    //   46: aload 6
    //   48: invokeinterface 55 1 0
    //   53: checkcast 57	com/sun/jna/z/a/f/a/a/a/a/k
    //   56: astore 7
    //   58: aload 7
    //   60: invokeinterface 179 1 0
    //   65: iload 4
    //   67: ifne +203 -> 270
    //   70: iload 4
    //   72: ifne +44 -> 116
    //   75: goto +4 -> 79
    //   78: athrow
    //   79: ifne +16 -> 95
    //   82: goto +4 -> 86
    //   85: athrow
    //   86: iload 4
    //   88: ifeq -52 -> 36
    //   91: goto +4 -> 95
    //   94: athrow
    //   95: aload 7
    //   97: iload 4
    //   99: ifne +22 -> 121
    //   102: invokeinterface 137 1 0
    //   107: iload_1
    //   108: iload_2
    //   109: invokevirtual 143	java/awt/Rectangle:contains	(II)Z
    //   112: goto +4 -> 116
    //   115: athrow
    //   116: ifne +126 -> 242
    //   119: aload 7
    //   121: invokeinterface 180 1 0
    //   126: aload 7
    //   128: invokeinterface 185 2 0
    //   133: aload 7
    //   135: invokeinterface 189 2 0
    //   140: astore 8
    //   142: aload 8
    //   144: arraylength
    //   145: istore 9
    //   147: iconst_0
    //   148: istore 10
    //   150: iload 10
    //   152: iload 9
    //   154: if_icmpge +88 -> 242
    //   157: aload 8
    //   159: iload 10
    //   161: aaload
    //   162: astore 11
    //   164: iload 4
    //   166: ifne +71 -> 237
    //   169: aload 11
    //   171: iload_1
    //   172: aload 7
    //   174: invokeinterface 191 1 0
    //   179: isub
    //   180: iload_2
    //   181: aload 7
    //   183: invokeinterface 193 1 0
    //   188: isub
    //   189: invokevirtual 143	java/awt/Rectangle:contains	(II)Z
    //   192: iload 4
    //   194: ifne -151 -> 43
    //   197: goto +4 -> 201
    //   200: athrow
    //   201: ifeq +33 -> 234
    //   204: aload 7
    //   206: iload_1
    //   207: aload 7
    //   209: invokeinterface 191 1 0
    //   214: isub
    //   215: iload_2
    //   216: aload 7
    //   218: invokeinterface 193 1 0
    //   223: isub
    //   224: iload_3
    //   225: invokeinterface 194 4 0
    //   230: aload 5
    //   232: monitorexit
    //   233: return
    //   234: iinc 10 1
    //   237: iload 4
    //   239: ifeq -89 -> 150
    //   242: iload 4
    //   244: ifeq -208 -> 36
    //   247: aload_0
    //   248: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   251: invokeinterface 37 1 0
    //   256: invokeinterface 43 1 0
    //   261: astore 6
    //   263: aload 6
    //   265: invokeinterface 51 1 0
    //   270: ifeq +111 -> 381
    //   273: aload 6
    //   275: invokeinterface 55 1 0
    //   280: checkcast 57	com/sun/jna/z/a/f/a/a/a/a/k
    //   283: astore 7
    //   285: iload 4
    //   287: ifne +97 -> 384
    //   290: aload 7
    //   292: invokeinterface 179 1 0
    //   297: iload 4
    //   299: ifne +44 -> 343
    //   302: goto +4 -> 306
    //   305: athrow
    //   306: ifne +16 -> 322
    //   309: goto +4 -> 313
    //   312: athrow
    //   313: iload 4
    //   315: ifeq -52 -> 263
    //   318: goto +4 -> 322
    //   321: athrow
    //   322: aload 7
    //   324: iload 4
    //   326: ifne +22 -> 348
    //   329: invokeinterface 137 1 0
    //   334: iload_1
    //   335: iload_2
    //   336: invokevirtual 143	java/awt/Rectangle:contains	(II)Z
    //   339: goto +4 -> 343
    //   342: athrow
    //   343: ifeq +33 -> 376
    //   346: aload 7
    //   348: iload_1
    //   349: aload 7
    //   351: invokeinterface 191 1 0
    //   356: isub
    //   357: iload_2
    //   358: aload 7
    //   360: invokeinterface 193 1 0
    //   365: isub
    //   366: iload_3
    //   367: invokeinterface 194 4 0
    //   372: aload 5
    //   374: monitorexit
    //   375: return
    //   376: iload 4
    //   378: ifeq -115 -> 263
    //   381: aload 5
    //   383: monitorexit
    //   384: goto +11 -> 395
    //   387: astore 12
    //   389: aload 5
    //   391: monitorexit
    //   392: aload 12
    //   394: athrow
    //   395: return
    // Line number table:
    //   Java source line #32	-> byte code offset #3
    //   Java source line #97	-> byte code offset #10
    //   Java source line #61	-> byte code offset #20
    //   Java source line #16	-> byte code offset #58
    //   Java source line #26	-> byte code offset #86
    //   Java source line #75	-> byte code offset #95
    //   Java source line #133	-> byte code offset #119
    //   Java source line #147	-> byte code offset #128
    //   Java source line #131	-> byte code offset #135
    //   Java source line #101	-> byte code offset #142
    //   Java source line #69	-> byte code offset #164
    //   Java source line #31	-> byte code offset #204
    //   Java source line #91	-> byte code offset #218
    //   Java source line #148	-> byte code offset #225
    //   Java source line #71	-> byte code offset #230
    //   Java source line #70	-> byte code offset #234
    //   Java source line #126	-> byte code offset #242
    //   Java source line #47	-> byte code offset #247
    //   Java source line #100	-> byte code offset #285
    //   Java source line #123	-> byte code offset #313
    //   Java source line #114	-> byte code offset #322
    //   Java source line #93	-> byte code offset #346
    //   Java source line #9	-> byte code offset #372
    //   Java source line #37	-> byte code offset #376
    //   Java source line #45	-> byte code offset #381
    //   Java source line #82	-> byte code offset #395
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	396	0	a	e
    //   0	396	1	a	int
    //   0	396	2	a	int
    //   0	396	3	a	int
    //   18	377	4	a	int
    //   58	184	7	a	k
    //   285	91	7	a	k
    //   140	99	8	a	java.awt.Rectangle[]
    //   145	94	9	a	int
    //   148	91	10	a	int
    //   164	70	11	a	java.awt.Rectangle
    // Exception table:
    //   from	to	target	type
    //   58	75	78	java/lang/NullPointerException
    //   70	82	85	java/lang/NullPointerException
    //   79	91	94	java/lang/NullPointerException
    //   95	112	115	java/lang/NullPointerException
    //   164	197	200	java/lang/NullPointerException
    //   285	302	305	java/lang/NullPointerException
    //   290	309	312	java/lang/NullPointerException
    //   306	318	321	java/lang/NullPointerException
    //   322	339	342	java/lang/NullPointerException
    //   20	233	387	finally
    //   234	375	387	finally
    //   376	384	387	finally
    //   387	392	387	finally
  }
  
  /* Error */
  public void b(int a, int a, int a)
  {
    // Byte code:
    //   0: getstatic 218	com/sun/jna/z/a/f/a/a/a/a/d:k	I
    //   3: aload_0
    //   4: iload_1
    //   5: iload_2
    //   6: iload_3
    //   7: invokespecial 197	com/sun/jna/z/a/f/a/a/a/a/d:b	(III)V
    //   10: istore 4
    //   12: aload_0
    //   13: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   16: dup
    //   17: astore 5
    //   19: monitorenter
    //   20: aload_0
    //   21: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   24: invokeinterface 37 1 0
    //   29: invokeinterface 43 1 0
    //   34: astore 6
    //   36: aload 6
    //   38: invokeinterface 51 1 0
    //   43: ifeq +204 -> 247
    //   46: aload 6
    //   48: invokeinterface 55 1 0
    //   53: checkcast 57	com/sun/jna/z/a/f/a/a/a/a/k
    //   56: astore 7
    //   58: aload 7
    //   60: invokeinterface 179 1 0
    //   65: iload 4
    //   67: ifne +203 -> 270
    //   70: iload 4
    //   72: ifne +44 -> 116
    //   75: goto +4 -> 79
    //   78: athrow
    //   79: ifne +16 -> 95
    //   82: goto +4 -> 86
    //   85: athrow
    //   86: iload 4
    //   88: ifeq -52 -> 36
    //   91: goto +4 -> 95
    //   94: athrow
    //   95: aload 7
    //   97: iload 4
    //   99: ifne +22 -> 121
    //   102: invokeinterface 137 1 0
    //   107: iload_1
    //   108: iload_2
    //   109: invokevirtual 143	java/awt/Rectangle:contains	(II)Z
    //   112: goto +4 -> 116
    //   115: athrow
    //   116: ifne +126 -> 242
    //   119: aload 7
    //   121: invokeinterface 180 1 0
    //   126: aload 7
    //   128: invokeinterface 185 2 0
    //   133: aload 7
    //   135: invokeinterface 189 2 0
    //   140: astore 8
    //   142: aload 8
    //   144: arraylength
    //   145: istore 9
    //   147: iconst_0
    //   148: istore 10
    //   150: iload 10
    //   152: iload 9
    //   154: if_icmpge +88 -> 242
    //   157: aload 8
    //   159: iload 10
    //   161: aaload
    //   162: astore 11
    //   164: iload 4
    //   166: ifne +71 -> 237
    //   169: aload 11
    //   171: iload_1
    //   172: aload 7
    //   174: invokeinterface 191 1 0
    //   179: isub
    //   180: iload_2
    //   181: aload 7
    //   183: invokeinterface 193 1 0
    //   188: isub
    //   189: invokevirtual 143	java/awt/Rectangle:contains	(II)Z
    //   192: iload 4
    //   194: ifne -151 -> 43
    //   197: goto +4 -> 201
    //   200: athrow
    //   201: ifeq +33 -> 234
    //   204: aload 7
    //   206: iload_1
    //   207: aload 7
    //   209: invokeinterface 191 1 0
    //   214: isub
    //   215: iload_2
    //   216: aload 7
    //   218: invokeinterface 193 1 0
    //   223: isub
    //   224: iload_3
    //   225: invokeinterface 198 4 0
    //   230: aload 5
    //   232: monitorexit
    //   233: return
    //   234: iinc 10 1
    //   237: iload 4
    //   239: ifeq -89 -> 150
    //   242: iload 4
    //   244: ifeq -208 -> 36
    //   247: aload_0
    //   248: getfield 21	com/sun/jna/z/a/f/a/a/a/a/e:l	Ljava/util/Map;
    //   251: invokeinterface 37 1 0
    //   256: invokeinterface 43 1 0
    //   261: astore 6
    //   263: aload 6
    //   265: invokeinterface 51 1 0
    //   270: ifeq +111 -> 381
    //   273: aload 6
    //   275: invokeinterface 55 1 0
    //   280: checkcast 57	com/sun/jna/z/a/f/a/a/a/a/k
    //   283: astore 7
    //   285: iload 4
    //   287: ifne +97 -> 384
    //   290: aload 7
    //   292: invokeinterface 179 1 0
    //   297: iload 4
    //   299: ifne +44 -> 343
    //   302: goto +4 -> 306
    //   305: athrow
    //   306: ifne +16 -> 322
    //   309: goto +4 -> 313
    //   312: athrow
    //   313: iload 4
    //   315: ifeq -52 -> 263
    //   318: goto +4 -> 322
    //   321: athrow
    //   322: aload 7
    //   324: iload 4
    //   326: ifne +22 -> 348
    //   329: invokeinterface 137 1 0
    //   334: iload_1
    //   335: iload_2
    //   336: invokevirtual 143	java/awt/Rectangle:contains	(II)Z
    //   339: goto +4 -> 343
    //   342: athrow
    //   343: ifeq +33 -> 376
    //   346: aload 7
    //   348: iload_1
    //   349: aload 7
    //   351: invokeinterface 191 1 0
    //   356: isub
    //   357: iload_2
    //   358: aload 7
    //   360: invokeinterface 193 1 0
    //   365: isub
    //   366: iload_3
    //   367: invokeinterface 198 4 0
    //   372: aload 5
    //   374: monitorexit
    //   375: return
    //   376: iload 4
    //   378: ifeq -115 -> 263
    //   381: aload 5
    //   383: monitorexit
    //   384: goto +11 -> 395
    //   387: astore 12
    //   389: aload 5
    //   391: monitorexit
    //   392: aload 12
    //   394: athrow
    //   395: return
    // Line number table:
    //   Java source line #15	-> byte code offset #3
    //   Java source line #44	-> byte code offset #10
    //   Java source line #1	-> byte code offset #20
    //   Java source line #159	-> byte code offset #58
    //   Java source line #135	-> byte code offset #86
    //   Java source line #33	-> byte code offset #95
    //   Java source line #56	-> byte code offset #119
    //   Java source line #50	-> byte code offset #128
    //   Java source line #34	-> byte code offset #135
    //   Java source line #2	-> byte code offset #142
    //   Java source line #18	-> byte code offset #164
    //   Java source line #41	-> byte code offset #204
    //   Java source line #68	-> byte code offset #218
    //   Java source line #156	-> byte code offset #225
    //   Java source line #53	-> byte code offset #230
    //   Java source line #151	-> byte code offset #234
    //   Java source line #136	-> byte code offset #242
    //   Java source line #109	-> byte code offset #247
    //   Java source line #80	-> byte code offset #285
    //   Java source line #67	-> byte code offset #313
    //   Java source line #116	-> byte code offset #322
    //   Java source line #130	-> byte code offset #346
    //   Java source line #12	-> byte code offset #372
    //   Java source line #117	-> byte code offset #376
    //   Java source line #62	-> byte code offset #381
    //   Java source line #52	-> byte code offset #395
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	396	0	a	e
    //   0	396	1	a	int
    //   0	396	2	a	int
    //   0	396	3	a	int
    //   10	385	4	a	int
    //   58	184	7	a	k
    //   285	91	7	a	k
    //   140	99	8	a	java.awt.Rectangle[]
    //   145	94	9	a	int
    //   148	91	10	a	int
    //   164	70	11	a	java.awt.Rectangle
    // Exception table:
    //   from	to	target	type
    //   58	75	78	java/lang/NullPointerException
    //   70	82	85	java/lang/NullPointerException
    //   79	91	94	java/lang/NullPointerException
    //   95	112	115	java/lang/NullPointerException
    //   164	197	200	java/lang/NullPointerException
    //   285	302	305	java/lang/NullPointerException
    //   290	309	312	java/lang/NullPointerException
    //   306	318	321	java/lang/NullPointerException
    //   322	339	342	java/lang/NullPointerException
    //   20	233	387	finally
    //   234	375	387	finally
    //   376	384	387	finally
    //   387	392	387	finally
  }
}
