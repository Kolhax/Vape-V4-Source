package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.g;

class A
  extends Thread
{
  final l b;
  private static final String[] c;
  
  A(l a, g paramg) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: getstatic 115	com/sun/jna/z/a/f/a/a/a/g:c	I
    //   3: aload_0
    //   4: getfield 19	com/sun/jna/z/a/f/a/a/a/A:a	Lcom/sun/jna/z/a/f/a/a/a/a/g;
    //   7: getstatic 119	com/sun/jna/z/a/f/a/a/a/A:c	[Ljava/lang/String;
    //   10: astore 8
    //   12: aload 8
    //   14: iconst_1
    //   15: aaload
    //   16: invokeinterface 31 2 0
    //   21: invokestatic 37	org/lwjgl/input/Keyboard:getEventNanoseconds	()J
    //   24: lstore_2
    //   25: istore_1
    //   26: invokestatic 40	org/lwjgl/input/Mouse:getEventNanoseconds	()J
    //   29: lstore 4
    //   31: invokestatic 44	java/lang/Thread:interrupted	()Z
    //   34: ifeq +13 -> 47
    //   37: iload_1
    //   38: ifne +117 -> 155
    //   41: goto +4 -> 45
    //   44: athrow
    //   45: return
    //   46: athrow
    //   47: lload_2
    //   48: invokestatic 37	org/lwjgl/input/Keyboard:getEventNanoseconds	()J
    //   51: lcmp
    //   52: iload_1
    //   53: ifne +107 -> 160
    //   56: ifeq +91 -> 147
    //   59: goto +4 -> 63
    //   62: athrow
    //   63: invokestatic 47	org/lwjgl/input/Keyboard:isRepeatEvent	()Z
    //   66: iload_1
    //   67: ifne +93 -> 160
    //   70: goto +4 -> 74
    //   73: athrow
    //   74: ifne +73 -> 147
    //   77: goto +4 -> 81
    //   80: athrow
    //   81: invokestatic 50	org/lwjgl/input/Keyboard:getEventKeyState	()Z
    //   84: iload_1
    //   85: ifne +75 -> 160
    //   88: goto +4 -> 92
    //   91: athrow
    //   92: ifeq +55 -> 147
    //   95: goto +4 -> 99
    //   98: athrow
    //   99: invokestatic 54	org/lwjgl/input/Keyboard:getEventKey	()I
    //   102: istore 6
    //   104: aload_0
    //   105: getfield 19	com/sun/jna/z/a/f/a/a/a/A:a	Lcom/sun/jna/z/a/f/a/a/a/a/g;
    //   108: new 56	java/lang/StringBuilder
    //   111: dup
    //   112: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   115: getstatic 119	com/sun/jna/z/a/f/a/a/a/A:c	[Ljava/lang/String;
    //   118: astore 8
    //   120: aload 8
    //   122: iconst_0
    //   123: aaload
    //   124: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: iload 6
    //   129: invokestatic 65	org/lwjgl/input/Keyboard:getKeyName	(I)Ljava/lang/String;
    //   132: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   138: invokeinterface 31 2 0
    //   143: iload_1
    //   144: ifeq +128 -> 272
    //   147: invokestatic 72	org/lwjgl/input/Keyboard:next	()Z
    //   150: pop
    //   151: goto +4 -> 155
    //   154: athrow
    //   155: bipush 42
    //   157: invokestatic 76	org/lwjgl/input/Keyboard:isKeyDown	(I)Z
    //   160: iload_1
    //   161: ifne +24 -> 185
    //   164: ifeq +15 -> 179
    //   167: goto +4 -> 171
    //   170: athrow
    //   171: iload_1
    //   172: ifeq -141 -> 31
    //   175: goto +4 -> 179
    //   178: athrow
    //   179: lload 4
    //   181: invokestatic 40	org/lwjgl/input/Mouse:getEventNanoseconds	()J
    //   184: lcmp
    //   185: iload_1
    //   186: ifne +82 -> 268
    //   189: ifeq +72 -> 261
    //   192: goto +4 -> 196
    //   195: athrow
    //   196: invokestatic 79	org/lwjgl/input/Mouse:getEventButtonState	()Z
    //   199: iload_1
    //   200: ifne +68 -> 268
    //   203: goto +4 -> 207
    //   206: athrow
    //   207: ifeq +54 -> 261
    //   210: goto +4 -> 214
    //   213: athrow
    //   214: aload_0
    //   215: getfield 19	com/sun/jna/z/a/f/a/a/a/A:a	Lcom/sun/jna/z/a/f/a/a/a/a/g;
    //   218: new 56	java/lang/StringBuilder
    //   221: dup
    //   222: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   225: getstatic 119	com/sun/jna/z/a/f/a/a/a/A:c	[Ljava/lang/String;
    //   228: iconst_2
    //   229: aaload
    //   230: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: invokestatic 82	org/lwjgl/input/Mouse:getEventButton	()I
    //   236: iconst_1
    //   237: iadd
    //   238: invokevirtual 85	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   241: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   244: invokeinterface 31 2 0
    //   249: bipush -100
    //   251: invokestatic 82	org/lwjgl/input/Mouse:getEventButton	()I
    //   254: iadd
    //   255: istore 6
    //   257: iload_1
    //   258: ifeq +14 -> 272
    //   261: invokestatic 86	org/lwjgl/input/Mouse:next	()Z
    //   264: goto +4 -> 268
    //   267: athrow
    //   268: pop
    //   269: goto -238 -> 31
    //   272: aload_0
    //   273: getfield 17	com/sun/jna/z/a/f/a/a/a/A:b	Lcom/sun/jna/z/a/f/a/a/a/l;
    //   276: getfield 89	com/sun/jna/z/a/f/a/a/a/l:b	Lcom/sun/jna/z/a/e/c;
    //   279: iload 6
    //   281: invokevirtual 94	com/sun/jna/z/a/e/c:b	(I)V
    //   284: ldc2_w 95
    //   287: invokestatic 100	java/lang/Thread:sleep	(J)V
    //   290: goto +6 -> 296
    //   293: astore 7
    //   295: return
    //   296: aload_0
    //   297: getfield 19	com/sun/jna/z/a/f/a/a/a/A:a	Lcom/sun/jna/z/a/f/a/a/a/a/g;
    //   300: aload_0
    //   301: getfield 17	com/sun/jna/z/a/f/a/a/a/A:b	Lcom/sun/jna/z/a/f/a/a/a/l;
    //   304: getfield 89	com/sun/jna/z/a/f/a/a/a/l:b	Lcom/sun/jna/z/a/e/c;
    //   307: invokevirtual 102	com/sun/jna/z/a/e/c:a	()Ljava/lang/String;
    //   310: invokeinterface 31 2 0
    //   315: return
    // Line number table:
    //   Java source line #22	-> byte code offset #3
    //   Java source line #23	-> byte code offset #21
    //   Java source line #13	-> byte code offset #25
    //   Java source line #25	-> byte code offset #31
    //   Java source line #5	-> byte code offset #37
    //   Java source line #15	-> byte code offset #47
    //   Java source line #9	-> byte code offset #99
    //   Java source line #1	-> byte code offset #104
    //   Java source line #7	-> byte code offset #143
    //   Java source line #19	-> byte code offset #147
    //   Java source line #2	-> byte code offset #155
    //   Java source line #11	-> byte code offset #171
    //   Java source line #8	-> byte code offset #179
    //   Java source line #24	-> byte code offset #214
    //   Java source line #6	-> byte code offset #249
    //   Java source line #3	-> byte code offset #257
    //   Java source line #4	-> byte code offset #261
    //   Java source line #17	-> byte code offset #272
    //   Java source line #16	-> byte code offset #284
    //   Java source line #18	-> byte code offset #290
    //   Java source line #12	-> byte code offset #293
    //   Java source line #21	-> byte code offset #295
    //   Java source line #20	-> byte code offset #296
    //   Java source line #14	-> byte code offset #315
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	316	0	a	A
    //   25	290	1	a	int
    //   25	291	2	a	long
    //   31	285	4	a	long
    //   104	43	6	a	int
    //   257	4	6	a	int
    //   272	44	6	a	int
    //   295	1	7	a	InterruptedException
    //   10	305	8	a	String[]
    // Exception table:
    //   from	to	target	type
    //   31	41	44	java/lang/InterruptedException
    //   37	46	46	java/lang/InterruptedException
    //   47	59	62	java/lang/InterruptedException
    //   56	70	73	java/lang/InterruptedException
    //   63	77	80	java/lang/InterruptedException
    //   74	88	91	java/lang/InterruptedException
    //   81	95	98	java/lang/InterruptedException
    //   104	151	154	java/lang/InterruptedException
    //   160	167	170	java/lang/InterruptedException
    //   164	175	178	java/lang/InterruptedException
    //   185	192	195	java/lang/InterruptedException
    //   189	203	206	java/lang/InterruptedException
    //   196	210	213	java/lang/InterruptedException
    //   257	264	267	java/lang/InterruptedException
    //   284	290	293	java/lang/InterruptedException
  }
}
