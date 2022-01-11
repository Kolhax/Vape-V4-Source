package com.sun.jna.z.a.f.a.a.a.e;

import com.sun.jna.z.a.f.a.a.a.a.k;
import java.util.HashMap;
import java.util.Map;

public abstract class c
  implements e
{
  protected final Map<Class<? extends k>, d> a = new HashMap();
  
  /* Error */
  public d a(Class<? extends k> a)
  {
    // Byte code:
    //   0: getstatic 90	com/sun/jna/z/a/f/a/a/a/e/b:d	Z
    //   3: aload_1
    //   4: invokevirtual 55	java/lang/Class:getInterfaces	()[Ljava/lang/Class;
    //   7: astore_3
    //   8: istore_2
    //   9: aload_3
    //   10: arraylength
    //   11: istore 4
    //   13: iconst_0
    //   14: istore 5
    //   16: iload 5
    //   18: iload 4
    //   20: if_icmpge +57 -> 77
    //   23: aload_3
    //   24: iload 5
    //   26: aaload
    //   27: astore 6
    //   29: aload_0
    //   30: getfield 20	com/sun/jna/z/a/f/a/a/a/e/c:a	Ljava/util/Map;
    //   33: aload 6
    //   35: invokeinterface 61 2 0
    //   40: checkcast 63	com/sun/jna/z/a/f/a/a/a/e/d
    //   43: astore 7
    //   45: iload_2
    //   46: ifne +27 -> 73
    //   49: aload 7
    //   51: iload_2
    //   52: ifne +83 -> 135
    //   55: goto +4 -> 59
    //   58: athrow
    //   59: ifnull +11 -> 70
    //   62: goto +4 -> 66
    //   65: athrow
    //   66: aload 7
    //   68: areturn
    //   69: athrow
    //   70: iinc 5 1
    //   73: iload_2
    //   74: ifeq -58 -> 16
    //   77: aload_1
    //   78: invokevirtual 66	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   81: ldc 1
    //   83: invokevirtual 70	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   86: iload_2
    //   87: ifne +34 -> 121
    //   90: ifeq +22 -> 112
    //   93: goto +4 -> 97
    //   96: athrow
    //   97: aload_0
    //   98: getfield 20	com/sun/jna/z/a/f/a/a/a/e/c:a	Ljava/util/Map;
    //   101: aload_1
    //   102: invokeinterface 61 2 0
    //   107: checkcast 63	com/sun/jna/z/a/f/a/a/a/e/d
    //   110: areturn
    //   111: athrow
    //   112: ldc 1
    //   114: aload_1
    //   115: invokevirtual 66	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   118: invokevirtual 74	java/lang/Class:isAssignableFrom	(Ljava/lang/Class;)Z
    //   121: ifne +6 -> 127
    //   124: aconst_null
    //   125: areturn
    //   126: athrow
    //   127: aload_0
    //   128: aload_1
    //   129: invokevirtual 66	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   132: invokevirtual 48	com/sun/jna/z/a/f/a/a/a/e/c:a	(Ljava/lang/Class;)Lcom/sun/jna/z/a/f/a/a/a/e/d;
    //   135: getstatic 95	com/sun/jna/z/a/j:g	Z
    //   138: ifeq +20 -> 158
    //   141: iload_2
    //   142: ifeq +12 -> 154
    //   145: goto +4 -> 149
    //   148: athrow
    //   149: iconst_0
    //   150: goto +5 -> 155
    //   153: athrow
    //   154: iconst_1
    //   155: putstatic 90	com/sun/jna/z/a/f/a/a/a/e/b:d	Z
    //   158: areturn
    // Line number table:
    //   Java source line #20	-> byte code offset #3
    //   Java source line #12	-> byte code offset #29
    //   Java source line #8	-> byte code offset #45
    //   Java source line #9	-> byte code offset #66
    //   Java source line #22	-> byte code offset #70
    //   Java source line #3	-> byte code offset #77
    //   Java source line #2	-> byte code offset #97
    //   Java source line #13	-> byte code offset #112
    //   Java source line #1	-> byte code offset #115
    //   Java source line #5	-> byte code offset #118
    //   Java source line #6	-> byte code offset #124
    //   Java source line #15	-> byte code offset #127
    //   Java source line #17	-> byte code offset #129
    //   Java source line #4	-> byte code offset #132
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	a	c
    //   0	159	1	a	Class<? extends k>
    //   8	150	2	a	int
    //   7	151	3	a	Class[]
    //   11	147	4	a	int
    //   14	144	5	a	int
    //   29	41	6	a	Class<?>
    //   45	25	7	a	d
    // Exception table:
    //   from	to	target	type
    //   45	55	58	java/lang/IllegalArgumentException
    //   49	62	65	java/lang/IllegalArgumentException
    //   59	69	69	java/lang/IllegalArgumentException
    //   77	93	96	java/lang/IllegalArgumentException
    //   90	111	111	java/lang/IllegalArgumentException
    //   121	126	126	java/lang/IllegalArgumentException
    //   135	145	148	java/lang/IllegalArgumentException
    //   141	153	153	java/lang/IllegalArgumentException
  }
  
  public d a(k a)
  {
    int a = b.d;
    try
    {
      if ((a != 0) || (a == null)) {}
      try
      {
        if (!(a instanceof k)) {
          throw new IllegalArgumentException();
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException2)
      {
        throw localIllegalArgumentException2;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException1)
    {
      throw localIllegalArgumentException1;
    }
    return a.a(a.getClass());
  }
  
  protected void a(b<?> a)
  {
    a.a.put(a.a, a);
  }
}
