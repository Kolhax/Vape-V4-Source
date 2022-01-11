package com.sun.jna.z.a.e;

public class d
  extends c
{
  public d(String a, b a, int a)
  {
    a.<init>(a, a, a);
  }
  
  /* Error */
  public void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	com/sun/jna/z/a/e/d:a	Lnet/minecraft/client/Minecraft;
    //   4: aconst_null
    //   5: putfield 30	net/minecraft/client/Minecraft:field_71462_r	Lnet/minecraft/client/gui/GuiScreen;
    //   8: getstatic 161	com/sun/jna/z/a/e/c:m	Z
    //   11: aload_0
    //   12: getfield 24	com/sun/jna/z/a/e/d:a	Lnet/minecraft/client/Minecraft;
    //   15: invokevirtual 33	net/minecraft/client/Minecraft:func_71381_h	()V
    //   18: istore_1
    //   19: getstatic 39	com/sun/jna/z/a/i:d	Lcom/sun/jna/z/a/i;
    //   22: getfield 42	com/sun/jna/z/a/i:a	Lcom/sun/jna/z/a/e/g;
    //   25: getfield 47	com/sun/jna/z/a/e/g:a	Ljava/util/Map;
    //   28: invokeinterface 53 1 0
    //   33: invokeinterface 59 1 0
    //   38: astore_2
    //   39: aload_2
    //   40: invokeinterface 65 1 0
    //   45: ifeq +45 -> 90
    //   48: aload_2
    //   49: invokeinterface 69 1 0
    //   54: checkcast 4	com/sun/jna/z/a/e/c
    //   57: astore_3
    //   58: aload_3
    //   59: iload_1
    //   60: ifne +22 -> 82
    //   63: invokevirtual 72	com/sun/jna/z/a/e/c:c	()Z
    //   66: iload_1
    //   67: ifne +86 -> 153
    //   70: goto +4 -> 74
    //   73: athrow
    //   74: ifeq +12 -> 86
    //   77: goto +4 -> 81
    //   80: athrow
    //   81: aload_3
    //   82: iconst_0
    //   83: invokevirtual 75	com/sun/jna/z/a/e/c:a	(Z)V
    //   86: iload_1
    //   87: ifeq -48 -> 39
    //   90: aload_0
    //   91: invokevirtual 79	com/sun/jna/z/a/e/d:b	()Lnet/minecraft/client/Minecraft;
    //   94: getfield 83	net/minecraft/client/Minecraft:field_71456_v	Lnet/minecraft/client/gui/GuiIngame;
    //   97: invokevirtual 89	net/minecraft/client/gui/GuiIngame:func_146158_b	()Lnet/minecraft/client/gui/GuiNewChat;
    //   100: sipush 420
    //   103: invokevirtual 95	net/minecraft/client/gui/GuiNewChat:func_146242_c	(I)V
    //   106: getstatic 39	com/sun/jna/z/a/i:d	Lcom/sun/jna/z/a/i;
    //   109: iconst_1
    //   110: putfield 98	com/sun/jna/z/a/i:e	Z
    //   113: ldc2_w 99
    //   116: invokestatic 106	java/lang/Thread:sleep	(J)V
    //   119: goto +8 -> 127
    //   122: astore_2
    //   123: aload_2
    //   124: invokevirtual 109	java/lang/InterruptedException:printStackTrace	()V
    //   127: getstatic 39	com/sun/jna/z/a/i:d	Lcom/sun/jna/z/a/i;
    //   130: getfield 42	com/sun/jna/z/a/i:a	Lcom/sun/jna/z/a/e/g;
    //   133: getfield 47	com/sun/jna/z/a/e/g:a	Ljava/util/Map;
    //   136: invokeinterface 53 1 0
    //   141: invokeinterface 59 1 0
    //   146: astore_2
    //   147: aload_2
    //   148: invokeinterface 65 1 0
    //   153: ifeq +29 -> 182
    //   156: aload_2
    //   157: invokeinterface 69 1 0
    //   162: checkcast 4	com/sun/jna/z/a/e/c
    //   165: astore_3
    //   166: aload_3
    //   167: invokevirtual 112	com/sun/jna/z/a/e/c:g	()V
    //   170: iload_1
    //   171: ifne +17 -> 188
    //   174: iload_1
    //   175: ifeq -28 -> 147
    //   178: goto +4 -> 182
    //   181: athrow
    //   182: ldc2_w 99
    //   185: invokestatic 106	java/lang/Thread:sleep	(J)V
    //   188: goto +8 -> 196
    //   191: astore_2
    //   192: aload_2
    //   193: invokevirtual 109	java/lang/InterruptedException:printStackTrace	()V
    //   196: aload_0
    //   197: getfield 24	com/sun/jna/z/a/e/d:a	Lnet/minecraft/client/Minecraft;
    //   200: getfield 116	net/minecraft/client/Minecraft:field_71438_f	Lnet/minecraft/client/renderer/RenderGlobal;
    //   203: invokevirtual 121	net/minecraft/client/renderer/RenderGlobal:func_72712_a	()V
    //   206: getstatic 126	com/sun/jna/z/a/j:e	Lcom/sun/jna/z/a/j;
    //   209: getfield 129	com/sun/jna/z/a/j:c	Lcom/sun/jna/z/a/f/a/a/a/h;
    //   212: getfield 134	com/sun/jna/z/a/f/a/a/a/h:a	Ljava/util/List;
    //   215: invokeinterface 139 1 0
    //   220: new 102	java/lang/Thread
    //   223: dup
    //   224: getstatic 142	com/sun/jna/z/Main:c	Lcom/sun/jna/z/Main;
    //   227: getfield 145	com/sun/jna/z/Main:b	Lcom/sun/jna/z/b;
    //   230: invokespecial 148	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   233: invokevirtual 151	java/lang/Thread:start	()V
    //   236: return
    // Line number table:
    //   Java source line #20	-> byte code offset #0
    //   Java source line #2	-> byte code offset #11
    //   Java source line #10	-> byte code offset #18
    //   Java source line #11	-> byte code offset #58
    //   Java source line #7	-> byte code offset #81
    //   Java source line #16	-> byte code offset #86
    //   Java source line #9	-> byte code offset #90
    //   Java source line #12	-> byte code offset #106
    //   Java source line #25	-> byte code offset #113
    //   Java source line #24	-> byte code offset #119
    //   Java source line #5	-> byte code offset #122
    //   Java source line #6	-> byte code offset #123
    //   Java source line #22	-> byte code offset #127
    //   Java source line #21	-> byte code offset #166
    //   Java source line #4	-> byte code offset #170
    //   Java source line #13	-> byte code offset #182
    //   Java source line #3	-> byte code offset #188
    //   Java source line #1	-> byte code offset #191
    //   Java source line #8	-> byte code offset #192
    //   Java source line #23	-> byte code offset #196
    //   Java source line #19	-> byte code offset #206
    //   Java source line #15	-> byte code offset #220
    //   Java source line #17	-> byte code offset #236
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	237	0	a	d
    //   18	218	1	a	int
    //   123	4	2	a	InterruptedException
    //   192	4	2	a	InterruptedException
    //   58	28	3	a	c
    //   166	4	3	a	c
    // Exception table:
    //   from	to	target	type
    //   58	70	73	java/lang/InterruptedException
    //   63	77	80	java/lang/InterruptedException
    //   113	119	122	java/lang/InterruptedException
    //   166	178	181	java/lang/InterruptedException
    //   182	188	191	java/lang/InterruptedException
  }
}
