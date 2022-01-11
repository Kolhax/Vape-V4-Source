package com.sun.jna.z.a.f.a.a.a.c;

public class c
  implements g
{
  /* Error */
  public void a(java.awt.Rectangle a, java.awt.Rectangle[] a, d[][] a)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: aload_2
    //   4: astore 6
    //   6: getstatic 61	com/sun/jna/z/a/f/a/a/a/c/e:c	Z
    //   9: aload 6
    //   11: arraylength
    //   12: istore 7
    //   14: iconst_0
    //   15: istore 8
    //   17: istore 4
    //   19: iload 8
    //   21: iload 7
    //   23: if_icmpge +72 -> 95
    //   26: aload 6
    //   28: iload 8
    //   30: aaload
    //   31: astore 9
    //   33: aload 9
    //   35: iload 4
    //   37: ifne +30 -> 67
    //   40: ifnonnull +16 -> 56
    //   43: goto +4 -> 47
    //   46: athrow
    //   47: new 23	java/lang/NullPointerException
    //   50: dup
    //   51: invokespecial 24	java/lang/NullPointerException:<init>	()V
    //   54: athrow
    //   55: athrow
    //   56: aload 9
    //   58: aload_1
    //   59: getfield 28	java/awt/Rectangle:x	I
    //   62: putfield 28	java/awt/Rectangle:x	I
    //   65: aload 9
    //   67: aload_1
    //   68: getfield 31	java/awt/Rectangle:y	I
    //   71: iload 5
    //   73: iadd
    //   74: putfield 31	java/awt/Rectangle:y	I
    //   77: iload 5
    //   79: aload 9
    //   81: getfield 34	java/awt/Rectangle:height	I
    //   84: iadd
    //   85: istore 5
    //   87: iinc 8 1
    //   90: iload 4
    //   92: ifeq -73 -> 19
    //   95: getstatic 66	com/sun/jna/z/a/j:g	Z
    //   98: ifeq +21 -> 119
    //   101: iload 4
    //   103: ifeq +12 -> 115
    //   106: goto +4 -> 110
    //   109: athrow
    //   110: iconst_0
    //   111: goto +5 -> 116
    //   114: athrow
    //   115: iconst_1
    //   116: putstatic 61	com/sun/jna/z/a/f/a/a/a/c/e:c	Z
    //   119: return
    // Line number table:
    //   Java source line #10	-> byte code offset #0
    //   Java source line #2	-> byte code offset #3
    //   Java source line #6	-> byte code offset #33
    //   Java source line #5	-> byte code offset #47
    //   Java source line #18	-> byte code offset #56
    //   Java source line #15	-> byte code offset #65
    //   Java source line #14	-> byte code offset #77
    //   Java source line #4	-> byte code offset #87
    //   Java source line #13	-> byte code offset #95
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	a	c
    //   0	120	1	a	java.awt.Rectangle
    //   0	120	2	a	java.awt.Rectangle[]
    //   0	120	3	a	d[][]
    //   17	85	4	a	int
    //   1	85	5	a	int
    //   4	23	6	a	java.awt.Rectangle[]
    //   12	10	7	a	int
    //   15	73	8	a	int
    //   31	49	9	a	java.awt.Rectangle
    //   46	1	10	localNullPointerException1	NullPointerException
    //   55	1	11	localNullPointerException2	NullPointerException
    //   109	1	12	localNullPointerException3	NullPointerException
    //   114	1	13	localNullPointerException4	NullPointerException
    // Exception table:
    //   from	to	target	type
    //   33	43	46	java/lang/NullPointerException
    //   40	55	55	java/lang/NullPointerException
    //   95	106	109	java/lang/NullPointerException
    //   101	114	114	java/lang/NullPointerException
  }
  
  /* Error */
  public java.awt.Dimension a(java.awt.Rectangle[] a, d[][] a)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: getstatic 61	com/sun/jna/z/a/f/a/a/a/c/e:c	Z
    //   6: istore_3
    //   7: iconst_0
    //   8: istore 5
    //   10: aload_1
    //   11: astore 6
    //   13: aload 6
    //   15: arraylength
    //   16: istore 7
    //   18: iconst_0
    //   19: istore 8
    //   21: iload 8
    //   23: iload 7
    //   25: if_icmpge +76 -> 101
    //   28: aload 6
    //   30: iload 8
    //   32: aaload
    //   33: astore 9
    //   35: iload_3
    //   36: ifne +46 -> 82
    //   39: aload 9
    //   41: ifnonnull +16 -> 57
    //   44: goto +4 -> 48
    //   47: athrow
    //   48: new 23	java/lang/NullPointerException
    //   51: dup
    //   52: invokespecial 24	java/lang/NullPointerException:<init>	()V
    //   55: athrow
    //   56: athrow
    //   57: iload 5
    //   59: aload 9
    //   61: getfield 34	java/awt/Rectangle:height	I
    //   64: iadd
    //   65: istore 5
    //   67: iload 4
    //   69: aload 9
    //   71: getfield 39	java/awt/Rectangle:width	I
    //   74: invokestatic 45	java/lang/Math:max	(II)I
    //   77: istore 4
    //   79: iinc 8 1
    //   82: iload_3
    //   83: ifeq -62 -> 21
    //   86: getstatic 66	com/sun/jna/z/a/j:g	Z
    //   89: ifeq +8 -> 97
    //   92: iconst_0
    //   93: goto +5 -> 98
    //   96: athrow
    //   97: iconst_1
    //   98: putstatic 66	com/sun/jna/z/a/j:g	Z
    //   101: new 47	java/awt/Dimension
    //   104: dup
    //   105: iload 4
    //   107: iload 5
    //   109: invokespecial 50	java/awt/Dimension:<init>	(II)V
    //   112: areturn
    // Line number table:
    //   Java source line #8	-> byte code offset #0
    //   Java source line #9	-> byte code offset #10
    //   Java source line #3	-> byte code offset #35
    //   Java source line #16	-> byte code offset #48
    //   Java source line #12	-> byte code offset #57
    //   Java source line #7	-> byte code offset #67
    //   Java source line #1	-> byte code offset #79
    //   Java source line #17	-> byte code offset #101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	a	c
    //   0	113	1	a	java.awt.Rectangle[]
    //   0	113	2	a	d[][]
    //   6	77	3	a	int
    //   1	1	4	i	int
    //   6	100	4	a	int
    //   8	100	5	a	int
    //   11	18	6	a	java.awt.Rectangle[]
    //   16	8	7	a	int
    //   19	61	8	a	int
    //   33	37	9	a	java.awt.Rectangle
    //   47	1	11	localNullPointerException1	NullPointerException
    //   56	1	12	localNullPointerException2	NullPointerException
    //   96	1	13	localNullPointerException3	NullPointerException
    // Exception table:
    //   from	to	target	type
    //   35	44	47	java/lang/NullPointerException
    //   39	56	56	java/lang/NullPointerException
    //   86	96	96	java/lang/NullPointerException
  }
}
