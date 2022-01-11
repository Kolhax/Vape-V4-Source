package md;

import com.sun.jna.z.a.e.b;
import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.e.j;
import com.sun.jna.z.a.f.a.a.a.a.a.d;
import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.a.t;
import com.sun.jna.z.a.g.p;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;

public class e
  extends c
{
  public k[] k()
  {
    return new k[] { a.u, a.v, a.x, a.w };
  }
  
  p t = new p();
  
  public void f()
  {
    int a = R;
    if (a == 0)
    {
      if (a.s) {
        a.c().field_71071_by.field_70461_c = a.o;
      }
      a.p.clear();
      
      a.n = 0;
    }
    a.s = false;
  }
  
  int n = 0;
  
  void a(j a)
  {
    a.c().field_71071_by.field_70461_c = a.a;
    
    a.b().field_71442_b.func_78769_a(a.c(), a.b().field_71441_e, a.b);
    
    int a = R;
    if ((a != 0) || (((a.b.func_77973_b() instanceof ItemSoup)) && ((a != 0) || (a.x.a())))) {
      a.b().field_71439_g.func_71040_bB(true);
    }
    if (y) {
      R = a == 0;
    }
  }
  
  p r = new p();
  com.sun.jna.z.a.f.a.a.a.a.i x = new d(a[1], true);
  com.sun.jna.z.a.f.a.a.a.a.i v = new d(a[3], true);
  CopyOnWriteArrayList<j> p = new CopyOnWriteArrayList();
  
  public e()
  {
    a.<init>(a[7], b.Utility, 0);int a = R;
    if (a != 0) {
      y = !y;
    }
  }
  
  t u = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[6], 100.0D, 0.0D, 200.0D, 1);
  com.sun.jna.z.a.f.a.a.a.a.i w = new d(a[0]);
  int o;
  InventoryPlayer q;
  boolean s;
  public static boolean y;
  public static int z;
  public static boolean A;
  public static boolean B;
  public static boolean C;
  public static int D;
  public static boolean E;
  public static boolean F;
  public static int G;
  public static int H;
  public static boolean I;
  public static int J;
  public static boolean K;
  public static int L;
  public static boolean M;
  public static boolean N;
  public static int O;
  public static boolean P;
  public static boolean Q;
  public static boolean R;
  private static final String[] S;
  
  public void e()
  {
    a.q = a.c().field_71071_by;
    
    a.o = a.q.field_70461_c;
  }
  
  /* Error */
  public void a(net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent a)
  {
    // Byte code:
    //   0: getstatic 284	md/e:R	Z
    //   3: istore_2
    //   4: aload_0
    //   5: getfield 56	md/e:t	Lcom/sun/jna/z/a/g/p;
    //   8: invokevirtual 90	com/sun/jna/z/a/g/p:d	()J
    //   11: ldc2_w 91
    //   14: lcmp
    //   15: iload_2
    //   16: ifne +24 -> 40
    //   19: ifle +760 -> 779
    //   22: goto +4 -> 26
    //   25: athrow
    //   26: aload_0
    //   27: getfield 56	md/e:t	Lcom/sun/jna/z/a/g/p;
    //   30: invokevirtual 95	com/sun/jna/z/a/g/p:c	()V
    //   33: aload_0
    //   34: getfield 49	md/e:p	Ljava/util/concurrent/CopyOnWriteArrayList;
    //   37: invokevirtual 99	java/util/concurrent/CopyOnWriteArrayList:isEmpty	()Z
    //   40: iload_2
    //   41: ifne +80 -> 121
    //   44: ifne +73 -> 117
    //   47: goto +4 -> 51
    //   50: athrow
    //   51: aload_0
    //   52: getfield 54	md/e:r	Lcom/sun/jna/z/a/g/p;
    //   55: aload_0
    //   56: getfield 67	md/e:u	Lcom/sun/jna/z/a/f/a/a/a/a/t;
    //   59: invokeinterface 104 1 0
    //   64: d2l
    //   65: invokevirtual 107	com/sun/jna/z/a/g/p:a	(J)Z
    //   68: iload_2
    //   69: ifne +106 -> 175
    //   72: goto +4 -> 76
    //   75: athrow
    //   76: ifeq +98 -> 174
    //   79: goto +4 -> 83
    //   82: athrow
    //   83: aload_0
    //   84: getfield 49	md/e:p	Ljava/util/concurrent/CopyOnWriteArrayList;
    //   87: iconst_0
    //   88: invokevirtual 111	java/util/concurrent/CopyOnWriteArrayList:get	(I)Ljava/lang/Object;
    //   91: checkcast 113	com/sun/jna/z/a/e/j
    //   94: astore_3
    //   95: aload_0
    //   96: aload_3
    //   97: invokevirtual 116	md/e:a	(Lcom/sun/jna/z/a/e/j;)V
    //   100: aload_0
    //   101: getfield 49	md/e:p	Ljava/util/concurrent/CopyOnWriteArrayList;
    //   104: aload_3
    //   105: invokevirtual 120	java/util/concurrent/CopyOnWriteArrayList:remove	(Ljava/lang/Object;)Z
    //   108: pop
    //   109: aload_0
    //   110: getfield 54	md/e:r	Lcom/sun/jna/z/a/g/p;
    //   113: invokevirtual 95	com/sun/jna/z/a/g/p:c	()V
    //   116: return
    //   117: aload_0
    //   118: getfield 122	md/e:s	Z
    //   121: iload_2
    //   122: ifne +53 -> 175
    //   125: ifeq +49 -> 174
    //   128: goto +4 -> 132
    //   131: athrow
    //   132: aload_0
    //   133: getfield 54	md/e:r	Lcom/sun/jna/z/a/g/p;
    //   136: aload_0
    //   137: getfield 67	md/e:u	Lcom/sun/jna/z/a/f/a/a/a/a/t;
    //   140: invokeinterface 104 1 0
    //   145: d2l
    //   146: invokevirtual 107	com/sun/jna/z/a/g/p:a	(J)Z
    //   149: iload_2
    //   150: ifne +25 -> 175
    //   153: goto +4 -> 157
    //   156: athrow
    //   157: ifeq +17 -> 174
    //   160: goto +4 -> 164
    //   163: athrow
    //   164: goto +4 -> 168
    //   167: athrow
    //   168: aload_0
    //   169: iconst_0
    //   170: invokevirtual 125	md/e:a	(Z)V
    //   173: return
    //   174: iconst_0
    //   175: istore_3
    //   176: iload_3
    //   177: bipush 10
    //   179: if_icmpge +564 -> 743
    //   182: iload_3
    //   183: iload_2
    //   184: ifne +574 -> 758
    //   187: bipush 9
    //   189: if_icmpne +42 -> 231
    //   192: goto +4 -> 196
    //   195: athrow
    //   196: goto +4 -> 200
    //   199: athrow
    //   200: aload_0
    //   201: getfield 49	md/e:p	Ljava/util/concurrent/CopyOnWriteArrayList;
    //   204: invokevirtual 99	java/util/concurrent/CopyOnWriteArrayList:isEmpty	()Z
    //   207: iload_2
    //   208: ifne +550 -> 758
    //   211: ifeq +532 -> 743
    //   214: goto +4 -> 218
    //   217: athrow
    //   218: goto +4 -> 222
    //   221: athrow
    //   222: aload_0
    //   223: iconst_0
    //   224: invokevirtual 125	md/e:a	(Z)V
    //   227: goto +516 -> 743
    //   230: athrow
    //   231: aload_0
    //   232: getfield 127	md/e:q	Lnet/minecraft/entity/player/InventoryPlayer;
    //   235: getfield 133	net/minecraft/entity/player/InventoryPlayer:field_70462_a	[Lnet/minecraft/item/ItemStack;
    //   238: iload_3
    //   239: aaload
    //   240: astore 4
    //   242: aload 4
    //   244: iload_2
    //   245: ifne +16 -> 261
    //   248: ifnonnull +11 -> 259
    //   251: goto +4 -> 255
    //   254: athrow
    //   255: goto +481 -> 736
    //   258: athrow
    //   259: aload 4
    //   261: invokevirtual 139	net/minecraft/item/ItemStack:func_77973_b	()Lnet/minecraft/item/Item;
    //   264: astore 5
    //   266: aload 5
    //   268: iload_2
    //   269: ifne +306 -> 575
    //   272: ifnull +293 -> 565
    //   275: goto +4 -> 279
    //   278: athrow
    //   279: aload 5
    //   281: iload_2
    //   282: ifne +293 -> 575
    //   285: instanceof 141
    //   288: ifeq +277 -> 565
    //   291: goto +4 -> 295
    //   294: athrow
    //   295: goto +4 -> 299
    //   298: athrow
    //   299: aload_0
    //   300: getfield 74	md/e:v	Lcom/sun/jna/z/a/f/a/a/a/a/i;
    //   303: invokeinterface 145 1 0
    //   308: ifeq +257 -> 565
    //   311: goto +4 -> 315
    //   314: athrow
    //   315: aload 5
    //   317: checkcast 141	net/minecraft/item/ItemPotion
    //   320: astore 6
    //   322: aload 6
    //   324: aload 4
    //   326: invokevirtual 149	net/minecraft/item/ItemPotion:func_77832_l	(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
    //   329: invokevirtual 155	java/lang/Object:toString	()Ljava/lang/String;
    //   332: getstatic 291	md/e:S	[Ljava/lang/String;
    //   335: astore 8
    //   337: aload 8
    //   339: iconst_4
    //   340: aaload
    //   341: invokevirtual 161	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   344: iload_2
    //   345: ifne +36 -> 381
    //   348: ifeq +213 -> 561
    //   351: goto +4 -> 355
    //   354: athrow
    //   355: aload 6
    //   357: aload 4
    //   359: invokevirtual 149	net/minecraft/item/ItemPotion:func_77832_l	(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
    //   362: invokevirtual 155	java/lang/Object:toString	()Ljava/lang/String;
    //   365: getstatic 291	md/e:S	[Ljava/lang/String;
    //   368: astore 8
    //   370: aload 8
    //   372: iconst_5
    //   373: aaload
    //   374: invokevirtual 161	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   377: goto +4 -> 381
    //   380: athrow
    //   381: ifeq +180 -> 561
    //   384: goto +4 -> 388
    //   387: athrow
    //   388: iconst_0
    //   389: istore 7
    //   391: aload 6
    //   393: aload 4
    //   395: invokevirtual 149	net/minecraft/item/ItemPotion:func_77832_l	(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
    //   398: iconst_0
    //   399: invokeinterface 164 2 0
    //   404: invokevirtual 155	java/lang/Object:toString	()Ljava/lang/String;
    //   407: getstatic 291	md/e:S	[Ljava/lang/String;
    //   410: astore 8
    //   412: aload 8
    //   414: iconst_2
    //   415: aaload
    //   416: invokevirtual 161	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   419: iload_2
    //   420: ifne +55 -> 475
    //   423: ifeq +58 -> 481
    //   426: goto +4 -> 430
    //   429: athrow
    //   430: iload 7
    //   432: iconst_4
    //   433: aload 6
    //   435: aload 4
    //   437: invokevirtual 149	net/minecraft/item/ItemPotion:func_77832_l	(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
    //   440: iconst_0
    //   441: invokeinterface 164 2 0
    //   446: invokevirtual 155	java/lang/Object:toString	()Ljava/lang/String;
    //   449: getstatic 291	md/e:S	[Ljava/lang/String;
    //   452: iconst_2
    //   453: aaload
    //   454: invokevirtual 168	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   457: iconst_1
    //   458: aaload
    //   459: ldc 1
    //   461: invokevirtual 168	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   464: iconst_0
    //   465: aaload
    //   466: invokestatic 175	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   469: imul
    //   470: iadd
    //   471: goto +4 -> 475
    //   474: athrow
    //   475: istore 7
    //   477: iload_2
    //   478: ifeq +10 -> 488
    //   481: iinc 7 4
    //   484: goto +4 -> 488
    //   487: athrow
    //   488: aload_0
    //   489: getfield 43	md/e:n	I
    //   492: iload 7
    //   494: iadd
    //   495: i2d
    //   496: aload_0
    //   497: invokevirtual 180	md/e:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   500: invokevirtual 186	net/minecraft/client/entity/EntityPlayerSP:func_110143_aJ	()F
    //   503: f2d
    //   504: invokestatic 192	java/lang/Math:floor	(D)D
    //   507: dadd
    //   508: ldc2_w 193
    //   511: dcmpl
    //   512: iload_2
    //   513: ifne +42 -> 555
    //   516: ifle +11 -> 527
    //   519: goto +4 -> 523
    //   522: athrow
    //   523: goto +213 -> 736
    //   526: athrow
    //   527: aload_0
    //   528: dup
    //   529: getfield 43	md/e:n	I
    //   532: iload 7
    //   534: iadd
    //   535: putfield 43	md/e:n	I
    //   538: aload_0
    //   539: getfield 49	md/e:p	Ljava/util/concurrent/CopyOnWriteArrayList;
    //   542: new 113	com/sun/jna/z/a/e/j
    //   545: dup
    //   546: iload_3
    //   547: aload 4
    //   549: invokespecial 197	com/sun/jna/z/a/e/j:<init>	(ILnet/minecraft/item/ItemStack;)V
    //   552: invokevirtual 200	java/util/concurrent/CopyOnWriteArrayList:add	(Ljava/lang/Object;)Z
    //   555: pop
    //   556: aload_0
    //   557: iconst_1
    //   558: putfield 122	md/e:s	Z
    //   561: iload_2
    //   562: ifeq +137 -> 699
    //   565: iload_2
    //   566: ifne +133 -> 699
    //   569: aload 5
    //   571: goto +4 -> 575
    //   574: athrow
    //   575: ifnull +124 -> 699
    //   578: aload 5
    //   580: instanceof 202
    //   583: iload_2
    //   584: ifne +124 -> 708
    //   587: ifeq +112 -> 699
    //   590: goto +4 -> 594
    //   593: athrow
    //   594: goto +4 -> 598
    //   597: athrow
    //   598: aload_0
    //   599: getfield 79	md/e:w	Lcom/sun/jna/z/a/f/a/a/a/a/i;
    //   602: invokeinterface 145 1 0
    //   607: iload_2
    //   608: ifne +100 -> 708
    //   611: ifeq +88 -> 699
    //   614: goto +4 -> 618
    //   617: athrow
    //   618: goto +4 -> 622
    //   621: athrow
    //   622: aload_0
    //   623: getfield 43	md/e:n	I
    //   626: bipush 8
    //   628: iadd
    //   629: i2d
    //   630: aload_0
    //   631: invokevirtual 180	md/e:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   634: invokevirtual 186	net/minecraft/client/entity/EntityPlayerSP:func_110143_aJ	()F
    //   637: f2d
    //   638: invokestatic 192	java/lang/Math:floor	(D)D
    //   641: dadd
    //   642: ldc2_w 193
    //   645: dcmpg
    //   646: iload_2
    //   647: ifne +61 -> 708
    //   650: ifgt +49 -> 699
    //   653: goto +4 -> 657
    //   656: athrow
    //   657: goto +4 -> 661
    //   660: athrow
    //   661: aload_0
    //   662: dup
    //   663: getfield 43	md/e:n	I
    //   666: bipush 8
    //   668: iadd
    //   669: putfield 43	md/e:n	I
    //   672: aload_0
    //   673: getfield 49	md/e:p	Ljava/util/concurrent/CopyOnWriteArrayList;
    //   676: new 113	com/sun/jna/z/a/e/j
    //   679: dup
    //   680: iload_3
    //   681: aload 4
    //   683: invokespecial 197	com/sun/jna/z/a/e/j:<init>	(ILnet/minecraft/item/ItemStack;)V
    //   686: invokevirtual 200	java/util/concurrent/CopyOnWriteArrayList:add	(Ljava/lang/Object;)Z
    //   689: pop
    //   690: aload_0
    //   691: iconst_1
    //   692: putfield 122	md/e:s	Z
    //   695: goto +4 -> 699
    //   698: athrow
    //   699: iload_2
    //   700: ifne +39 -> 739
    //   703: iload_3
    //   704: goto +4 -> 708
    //   707: athrow
    //   708: bipush 8
    //   710: if_icmpne +26 -> 736
    //   713: aload_0
    //   714: getfield 49	md/e:p	Ljava/util/concurrent/CopyOnWriteArrayList;
    //   717: invokevirtual 99	java/util/concurrent/CopyOnWriteArrayList:isEmpty	()Z
    //   720: ifeq +16 -> 736
    //   723: goto +4 -> 727
    //   726: athrow
    //   727: aload_0
    //   728: iconst_0
    //   729: invokevirtual 125	md/e:a	(Z)V
    //   732: goto +4 -> 736
    //   735: athrow
    //   736: iinc 3 1
    //   739: iload_2
    //   740: ifeq -564 -> 176
    //   743: aload_0
    //   744: iload_2
    //   745: ifne +17 -> 762
    //   748: getfield 49	md/e:p	Ljava/util/concurrent/CopyOnWriteArrayList;
    //   751: invokevirtual 99	java/util/concurrent/CopyOnWriteArrayList:isEmpty	()Z
    //   754: goto +4 -> 758
    //   757: athrow
    //   758: ifne +12 -> 770
    //   761: aload_0
    //   762: iconst_1
    //   763: putfield 122	md/e:s	Z
    //   766: goto +4 -> 770
    //   769: athrow
    //   770: goto +9 -> 779
    //   773: astore_3
    //   774: aload_0
    //   775: iconst_0
    //   776: invokevirtual 125	md/e:a	(Z)V
    //   779: return
    // Line number table:
    //   Java source line #8	-> byte code offset #4
    //   Java source line #15	-> byte code offset #26
    //   Java source line #27	-> byte code offset #33
    //   Java source line #64	-> byte code offset #51
    //   Java source line #24	-> byte code offset #83
    //   Java source line #54	-> byte code offset #95
    //   Java source line #50	-> byte code offset #100
    //   Java source line #20	-> byte code offset #109
    //   Java source line #69	-> byte code offset #116
    //   Java source line #39	-> byte code offset #117
    //   Java source line #10	-> byte code offset #168
    //   Java source line #62	-> byte code offset #173
    //   Java source line #66	-> byte code offset #174
    //   Java source line #58	-> byte code offset #182
    //   Java source line #7	-> byte code offset #200
    //   Java source line #14	-> byte code offset #222
    //   Java source line #23	-> byte code offset #231
    //   Java source line #11	-> byte code offset #242
    //   Java source line #2	-> byte code offset #255
    //   Java source line #70	-> byte code offset #259
    //   Java source line #21	-> byte code offset #266
    //   Java source line #60	-> byte code offset #315
    //   Java source line #47	-> byte code offset #322
    //   Java source line #68	-> byte code offset #388
    //   Java source line #17	-> byte code offset #391
    //   Java source line #1	-> byte code offset #430
    //   Java source line #57	-> byte code offset #481
    //   Java source line #63	-> byte code offset #488
    //   Java source line #42	-> byte code offset #523
    //   Java source line #56	-> byte code offset #527
    //   Java source line #52	-> byte code offset #538
    //   Java source line #9	-> byte code offset #556
    //   Java source line #61	-> byte code offset #561
    //   Java source line #48	-> byte code offset #622
    //   Java source line #3	-> byte code offset #661
    //   Java source line #37	-> byte code offset #672
    //   Java source line #38	-> byte code offset #690
    //   Java source line #43	-> byte code offset #699
    //   Java source line #22	-> byte code offset #727
    //   Java source line #25	-> byte code offset #736
    //   Java source line #53	-> byte code offset #743
    //   Java source line #5	-> byte code offset #761
    //   Java source line #30	-> byte code offset #770
    //   Java source line #51	-> byte code offset #773
    //   Java source line #49	-> byte code offset #774
    //   Java source line #45	-> byte code offset #779
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	780	0	a	e
    //   0	780	1	a	net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent
    //   3	776	2	a	int
    //   95	22	3	a	j
    //   176	567	3	a	int
    //   774	5	3	a	Exception
    //   242	494	4	a	ItemStack
    //   266	470	5	a	net.minecraft.item.Item
    //   322	239	6	a	net.minecraft.item.ItemPotion
    //   391	170	7	a	int
    //   335	227	8	a	String[]
    // Exception table:
    //   from	to	target	type
    //   4	22	25	java/lang/Exception
    //   40	47	50	java/lang/Exception
    //   44	72	75	java/lang/Exception
    //   51	79	82	java/lang/Exception
    //   121	128	131	java/lang/Exception
    //   125	153	156	java/lang/Exception
    //   132	160	163	java/lang/Exception
    //   117	164	167	java/lang/Exception
    //   182	192	195	java/lang/Exception
    //   176	196	199	java/lang/Exception
    //   200	214	217	java/lang/Exception
    //   182	218	221	java/lang/Exception
    //   200	230	230	java/lang/Exception
    //   242	251	254	java/lang/Exception
    //   242	258	258	java/lang/Exception
    //   266	275	278	java/lang/Exception
    //   279	291	294	java/lang/Exception
    //   266	295	298	java/lang/Exception
    //   279	311	314	java/lang/Exception
    //   322	351	354	java/lang/Exception
    //   348	377	380	java/lang/Exception
    //   322	384	387	java/lang/Exception
    //   391	426	429	java/lang/Exception
    //   423	471	474	java/lang/Exception
    //   477	484	487	java/lang/Exception
    //   488	519	522	java/lang/Exception
    //   488	526	526	java/lang/Exception
    //   565	571	574	java/lang/Exception
    //   578	590	593	java/lang/Exception
    //   565	594	597	java/lang/Exception
    //   598	614	617	java/lang/Exception
    //   578	618	621	java/lang/Exception
    //   622	653	656	java/lang/Exception
    //   598	657	660	java/lang/Exception
    //   622	695	698	java/lang/Exception
    //   699	704	707	java/lang/Exception
    //   699	723	726	java/lang/Exception
    //   713	732	735	java/lang/Exception
    //   743	754	757	java/lang/Exception
    //   743	766	769	java/lang/Exception
    //   33	116	773	java/lang/Exception
    //   117	173	773	java/lang/Exception
    //   174	770	773	java/lang/Exception
  }
}
