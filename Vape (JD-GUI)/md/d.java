package md;

import com.sun.jna.z.a.e.b;
import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.f.a.a.a.a.t;
import com.sun.jna.z.a.g.p;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;

public class d
  extends c
{
  int n()
  {
    int a = 0;
    
    InventoryPlayer localInventoryPlayer1 = a.c().field_71071_by;
    InventoryPlayer a;
    int i = 0;int a = 
    
      R;
    do
    {
      int a;
      if (a >= 9) {
        break;
      }
      ItemStack a = a.field_70462_a[a];
      if (a == 0)
      {
        if (a == null) {
          a++;
        }
        a++;
      }
    } while (a == 0);
    return a;
  }
  
  com.sun.jna.z.a.f.a.a.a.a.i o = new com.sun.jna.z.a.f.a.a.a.a.a.d(a[1], true);
  t n = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[3], 100.0D, 0.0D, 200.0D, 1);
  
  public d()
  {
    a.<init>(a[2], b.Utility, 0);int a = R;a.r = new ArrayList();
    
    a.v = new p();
    if (a != 0) {
      y = !y;
    }
  }
  
  p q = new p();
  
  public k[] k()
  {
    int a = R;
    if (y) {
      R = a == 0;
    }
    return new k[] { a.n, a.p, a.o };
  }
  
  com.sun.jna.z.a.f.a.a.a.a.i p = new com.sun.jna.z.a.f.a.a.a.a.a.d(a[0]);
  List<Integer> r;
  boolean s;
  GuiContainer t;
  boolean u;
  p v;
  com.sun.jna.z.a.e.i w;
  boolean x;
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
  
  public void g()
  {
    a.x = false;
    
    int a = R;
    if (a == 0) {
      if (a.w != null) {
        a.w.a = null;
      }
    }
    a.w = null;
  }
  
  public void e()
  {
    a.x = true;int a = R;
    if (a == 0) {
      if (a.w == null)
      {
        a.w = new com.sun.jna.z.a.e.i(a);
        
        a.w.a();
      }
    }
    if (a == 0) {
      if (a.n() == 0)
      {
        a.a(false); return;
      }
    }
    boolean a = false;int a = 9;
    label205:
    label242:
    do
    {
      if (a >= 36) {
        break;
      }
      ItemStack a = a.c().field_71071_by.func_70301_a(a);
      if (a != 0) {
        return;
      }
      if ((a != 0) || ((a != null) || (a != 0)))
      {
        Item a = a.func_77973_b();
        if (a == 0) {
          if (a != null)
          {
            if (a != 0) {
              break label205;
            }
            if (((a instanceof ItemPotion)) && (a.o.a()))
            {
              ItemPotion a = (ItemPotion)a;
              
              String[] a = S;
              if (((a != 0) || (
              
                a.func_77832_l(a).toString().contains(a[4]))) && ((a != 0) || (a.func_77832_l(a).toString().contains(a[5])))) {
                a = true;
              }
              if (a == 0) {
                break label242;
              }
            }
          }
        }
        if (((a != 0) || (a != null)) && ((a != 0) || ((a instanceof ItemSoup)))) {
          if ((a != 0) || (a.p.a())) {
            a = true;
          }
        }
      }
      a++;
    } while (a == 0);
    int a;
    if (a == 0)
    {
      if (!a)
      {
        a.a(false);return;
      }
      a = a.b().field_71474_y.field_151445_Q.func_151463_i();KeyBinding.func_74510_a(a, true);KeyBinding.func_74507_a(a);
    }
    KeyBinding.func_74510_a(a, false);a.q.c();a.r.clear();a.s = false;
  }
  
  void m()
  {
    int a = R;
    if (a == 0)
    {
      if (a.b().field_71462_r != null) {
        a.c().func_71053_j();
      }
      a.s = false;a.u = false;
    }
    a.a(false);
  }
  
  /* Error */
  public void h()
  {
    // Byte code:
    //   0: getstatic 317	md/d:R	Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 80	md/d:x	Z
    //   8: ifeq +690 -> 698
    //   11: ldc2_w 81
    //   14: invokestatic 88	java/lang/Thread:sleep	(J)V
    //   17: goto +8 -> 25
    //   20: astore_2
    //   21: aload_2
    //   22: invokevirtual 91	java/lang/InterruptedException:printStackTrace	()V
    //   25: aload_0
    //   26: invokevirtual 95	md/d:c	()Z
    //   29: iload_1
    //   30: ifne +14 -> 44
    //   33: ifeq -29 -> 4
    //   36: goto +4 -> 40
    //   39: athrow
    //   40: aload_0
    //   41: getfield 97	md/d:u	Z
    //   44: iload_1
    //   45: ifne +57 -> 102
    //   48: ifeq +36 -> 84
    //   51: goto +4 -> 55
    //   54: athrow
    //   55: aload_0
    //   56: getfield 48	md/d:n	Lcom/sun/jna/z/a/f/a/a/a/a/t;
    //   59: invokeinterface 103 1 0
    //   64: d2l
    //   65: invokestatic 88	java/lang/Thread:sleep	(J)V
    //   68: goto +8 -> 76
    //   71: astore_2
    //   72: aload_2
    //   73: invokevirtual 91	java/lang/InterruptedException:printStackTrace	()V
    //   76: aload_0
    //   77: invokevirtual 106	md/d:m	()V
    //   80: iload_1
    //   81: ifeq -77 -> 4
    //   84: aload_0
    //   85: iload_1
    //   86: ifne +39 -> 125
    //   89: invokevirtual 110	md/d:b	()Lnet/minecraft/client/Minecraft;
    //   92: getfield 116	net/minecraft/client/Minecraft:field_71462_r	Lnet/minecraft/client/gui/GuiScreen;
    //   95: instanceof 118
    //   98: goto +4 -> 102
    //   101: athrow
    //   102: ifeq +22 -> 124
    //   105: aload_0
    //   106: aload_0
    //   107: invokevirtual 110	md/d:b	()Lnet/minecraft/client/Minecraft;
    //   110: getfield 116	net/minecraft/client/Minecraft:field_71462_r	Lnet/minecraft/client/gui/GuiScreen;
    //   113: checkcast 118	net/minecraft/client/gui/inventory/GuiContainer
    //   116: putfield 120	md/d:t	Lnet/minecraft/client/gui/inventory/GuiContainer;
    //   119: goto +14 -> 133
    //   122: athrow
    //   123: athrow
    //   124: aload_0
    //   125: iconst_1
    //   126: putfield 97	md/d:u	Z
    //   129: iload_1
    //   130: ifeq -126 -> 4
    //   133: aload_0
    //   134: getfield 71	md/d:r	Ljava/util/List;
    //   137: invokeinterface 125 1 0
    //   142: iload_1
    //   143: ifne +162 -> 305
    //   146: ifne +147 -> 293
    //   149: goto +4 -> 153
    //   152: athrow
    //   153: aload_0
    //   154: getfield 127	md/d:s	Z
    //   157: iload_1
    //   158: ifne +147 -> 305
    //   161: ifeq +132 -> 293
    //   164: goto +4 -> 168
    //   167: athrow
    //   168: goto +4 -> 172
    //   171: athrow
    //   172: aload_0
    //   173: iload_1
    //   174: ifne +27 -> 201
    //   177: getfield 120	md/d:t	Lnet/minecraft/client/gui/inventory/GuiContainer;
    //   180: ifnonnull +20 -> 200
    //   183: goto +4 -> 187
    //   186: athrow
    //   187: goto +4 -> 191
    //   190: athrow
    //   191: aload_0
    //   192: iconst_0
    //   193: invokevirtual 130	md/d:a	(Z)V
    //   196: goto -192 -> 4
    //   199: athrow
    //   200: aload_0
    //   201: getfield 66	md/d:q	Lcom/sun/jna/z/a/g/p;
    //   204: iload_1
    //   205: ifne +81 -> 286
    //   208: aload_0
    //   209: getfield 48	md/d:n	Lcom/sun/jna/z/a/f/a/a/a/a/t;
    //   212: invokeinterface 103 1 0
    //   217: d2l
    //   218: invokevirtual 133	com/sun/jna/z/a/g/p:a	(J)Z
    //   221: ifeq -217 -> 4
    //   224: goto +4 -> 228
    //   227: athrow
    //   228: aload_0
    //   229: invokevirtual 110	md/d:b	()Lnet/minecraft/client/Minecraft;
    //   232: getfield 137	net/minecraft/client/Minecraft:field_71442_b	Lnet/minecraft/client/multiplayer/PlayerControllerMP;
    //   235: aload_0
    //   236: getfield 120	md/d:t	Lnet/minecraft/client/gui/inventory/GuiContainer;
    //   239: getfield 141	net/minecraft/client/gui/inventory/GuiContainer:field_147002_h	Lnet/minecraft/inventory/Container;
    //   242: getfield 147	net/minecraft/inventory/Container:field_75152_c	I
    //   245: aload_0
    //   246: getfield 71	md/d:r	Ljava/util/List;
    //   249: iconst_0
    //   250: invokeinterface 151 2 0
    //   255: checkcast 153	java/lang/Integer
    //   258: invokevirtual 157	java/lang/Integer:intValue	()I
    //   261: iconst_0
    //   262: iconst_1
    //   263: aload_0
    //   264: invokevirtual 160	md/d:c	()Lnet/minecraft/client/entity/EntityPlayerSP;
    //   267: invokevirtual 166	net/minecraft/client/multiplayer/PlayerControllerMP:func_78753_a	(IIIILnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;
    //   270: pop
    //   271: aload_0
    //   272: getfield 71	md/d:r	Ljava/util/List;
    //   275: iconst_0
    //   276: invokeinterface 169 2 0
    //   281: pop
    //   282: aload_0
    //   283: getfield 66	md/d:q	Lcom/sun/jna/z/a/g/p;
    //   286: invokevirtual 171	com/sun/jna/z/a/g/p:c	()V
    //   289: iload_1
    //   290: ifeq -286 -> 4
    //   293: aload_0
    //   294: iload_1
    //   295: ifne +24 -> 319
    //   298: getfield 127	md/d:s	Z
    //   301: goto +4 -> 305
    //   304: athrow
    //   305: ifeq +13 -> 318
    //   308: aload_0
    //   309: iconst_1
    //   310: putfield 97	md/d:u	Z
    //   313: goto -309 -> 4
    //   316: athrow
    //   317: athrow
    //   318: aload_0
    //   319: iload_1
    //   320: ifne +342 -> 662
    //   323: getfield 120	md/d:t	Lnet/minecraft/client/gui/inventory/GuiContainer;
    //   326: ifnull +331 -> 657
    //   329: goto +4 -> 333
    //   332: athrow
    //   333: aload_0
    //   334: invokevirtual 173	md/d:n	()I
    //   337: istore_2
    //   338: iconst_0
    //   339: istore_3
    //   340: bipush 9
    //   342: istore 4
    //   344: iload 4
    //   346: bipush 36
    //   348: if_icmpge +305 -> 653
    //   351: iload_3
    //   352: iload_2
    //   353: iload_1
    //   354: ifne -6 -> 348
    //   357: if_icmplt +11 -> 368
    //   360: goto +4 -> 364
    //   363: athrow
    //   364: goto +289 -> 653
    //   367: athrow
    //   368: aload_0
    //   369: getfield 120	md/d:t	Lnet/minecraft/client/gui/inventory/GuiContainer;
    //   372: getfield 141	net/minecraft/client/gui/inventory/GuiContainer:field_147002_h	Lnet/minecraft/inventory/Container;
    //   375: getfield 176	net/minecraft/inventory/Container:field_75151_b	Ljava/util/List;
    //   378: iload 4
    //   380: invokeinterface 151 2 0
    //   385: checkcast 178	net/minecraft/inventory/Slot
    //   388: astore 5
    //   390: aload 5
    //   392: invokevirtual 182	net/minecraft/inventory/Slot:func_75211_c	()Lnet/minecraft/item/ItemStack;
    //   395: astore 6
    //   397: aload 6
    //   399: iload_1
    //   400: ifne +16 -> 416
    //   403: ifnonnull +11 -> 414
    //   406: goto +4 -> 410
    //   409: athrow
    //   410: goto +236 -> 646
    //   413: athrow
    //   414: aload 6
    //   416: invokevirtual 188	net/minecraft/item/ItemStack:func_77973_b	()Lnet/minecraft/item/Item;
    //   419: astore 7
    //   421: aload 7
    //   423: iload_1
    //   424: ifne +156 -> 580
    //   427: ifnull +143 -> 570
    //   430: goto +4 -> 434
    //   433: athrow
    //   434: aload 7
    //   436: iload_1
    //   437: ifne +143 -> 580
    //   440: instanceof 190
    //   443: ifeq +127 -> 570
    //   446: goto +4 -> 450
    //   449: athrow
    //   450: goto +4 -> 454
    //   453: athrow
    //   454: aload_0
    //   455: getfield 55	md/d:o	Lcom/sun/jna/z/a/f/a/a/a/a/i;
    //   458: invokeinterface 194 1 0
    //   463: ifeq +107 -> 570
    //   466: goto +4 -> 470
    //   469: athrow
    //   470: aload 7
    //   472: checkcast 190	net/minecraft/item/ItemPotion
    //   475: astore 8
    //   477: aload 8
    //   479: aload 6
    //   481: invokevirtual 198	net/minecraft/item/ItemPotion:func_77832_l	(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
    //   484: invokevirtual 204	java/lang/Object:toString	()Ljava/lang/String;
    //   487: getstatic 324	md/d:S	[Ljava/lang/String;
    //   490: astore 9
    //   492: aload 9
    //   494: iconst_4
    //   495: aaload
    //   496: invokevirtual 210	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   499: iload_1
    //   500: ifne +32 -> 532
    //   503: ifeq +63 -> 566
    //   506: goto +4 -> 510
    //   509: athrow
    //   510: goto +4 -> 514
    //   513: athrow
    //   514: aload 8
    //   516: aload 6
    //   518: invokevirtual 198	net/minecraft/item/ItemPotion:func_77832_l	(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
    //   521: invokevirtual 204	java/lang/Object:toString	()Ljava/lang/String;
    //   524: getstatic 324	md/d:S	[Ljava/lang/String;
    //   527: iconst_5
    //   528: aaload
    //   529: invokevirtual 210	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   532: ifeq +34 -> 566
    //   535: goto +4 -> 539
    //   538: athrow
    //   539: aload_0
    //   540: getfield 71	md/d:r	Ljava/util/List;
    //   543: iload 4
    //   545: invokestatic 214	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   548: invokeinterface 218 2 0
    //   553: pop
    //   554: iinc 3 1
    //   557: aload_0
    //   558: iconst_1
    //   559: putfield 127	md/d:s	Z
    //   562: goto +4 -> 566
    //   565: athrow
    //   566: iload_1
    //   567: ifeq +79 -> 646
    //   570: iload_1
    //   571: ifne +78 -> 649
    //   574: aload 7
    //   576: goto +4 -> 580
    //   579: athrow
    //   580: ifnull +66 -> 646
    //   583: aload 7
    //   585: instanceof 222
    //   588: ifeq +58 -> 646
    //   591: goto +4 -> 595
    //   594: athrow
    //   595: iload_1
    //   596: ifne +53 -> 649
    //   599: aload_0
    //   600: getfield 60	md/d:p	Lcom/sun/jna/z/a/f/a/a/a/a/i;
    //   603: invokeinterface 194 1 0
    //   608: ifeq +38 -> 646
    //   611: goto +4 -> 615
    //   614: athrow
    //   615: goto +4 -> 619
    //   618: athrow
    //   619: aload_0
    //   620: getfield 71	md/d:r	Ljava/util/List;
    //   623: iload 4
    //   625: invokestatic 214	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   628: invokeinterface 218 2 0
    //   633: pop
    //   634: iinc 3 1
    //   637: aload_0
    //   638: iconst_1
    //   639: putfield 127	md/d:s	Z
    //   642: goto +4 -> 646
    //   645: athrow
    //   646: iinc 4 1
    //   649: iload_1
    //   650: ifeq -306 -> 344
    //   653: iload_1
    //   654: ifeq +15 -> 669
    //   657: aload_0
    //   658: goto +4 -> 662
    //   661: athrow
    //   662: iconst_1
    //   663: putfield 97	md/d:u	Z
    //   666: goto -662 -> 4
    //   669: aload_0
    //   670: iload_1
    //   671: ifne +19 -> 690
    //   674: getfield 71	md/d:r	Ljava/util/List;
    //   677: invokeinterface 125 1 0
    //   682: ifeq -678 -> 4
    //   685: goto +4 -> 689
    //   688: athrow
    //   689: aload_0
    //   690: iconst_1
    //   691: putfield 97	md/d:u	Z
    //   694: iload_1
    //   695: ifeq -691 -> 4
    //   698: return
    // Line number table:
    //   Java source line #128	-> byte code offset #4
    //   Java source line #110	-> byte code offset #11
    //   Java source line #22	-> byte code offset #17
    //   Java source line #99	-> byte code offset #20
    //   Java source line #56	-> byte code offset #21
    //   Java source line #32	-> byte code offset #25
    //   Java source line #18	-> byte code offset #40
    //   Java source line #62	-> byte code offset #55
    //   Java source line #52	-> byte code offset #68
    //   Java source line #47	-> byte code offset #71
    //   Java source line #96	-> byte code offset #72
    //   Java source line #57	-> byte code offset #76
    //   Java source line #16	-> byte code offset #80
    //   Java source line #82	-> byte code offset #84
    //   Java source line #45	-> byte code offset #105
    //   Java source line #120	-> byte code offset #124
    //   Java source line #93	-> byte code offset #129
    //   Java source line #104	-> byte code offset #133
    //   Java source line #68	-> byte code offset #172
    //   Java source line #17	-> byte code offset #191
    //   Java source line #113	-> byte code offset #196
    //   Java source line #64	-> byte code offset #200
    //   Java source line #89	-> byte code offset #228
    //   Java source line #125	-> byte code offset #250
    //   Java source line #81	-> byte code offset #264
    //   Java source line #116	-> byte code offset #267
    //   Java source line #20	-> byte code offset #271
    //   Java source line #8	-> byte code offset #282
    //   Java source line #37	-> byte code offset #293
    //   Java source line #9	-> byte code offset #308
    //   Java source line #78	-> byte code offset #313
    //   Java source line #119	-> byte code offset #318
    //   Java source line #29	-> byte code offset #333
    //   Java source line #90	-> byte code offset #338
    //   Java source line #58	-> byte code offset #340
    //   Java source line #39	-> byte code offset #351
    //   Java source line #19	-> byte code offset #364
    //   Java source line #72	-> byte code offset #368
    //   Java source line #50	-> byte code offset #390
    //   Java source line #92	-> byte code offset #397
    //   Java source line #44	-> byte code offset #410
    //   Java source line #48	-> byte code offset #414
    //   Java source line #98	-> byte code offset #421
    //   Java source line #109	-> byte code offset #458
    //   Java source line #24	-> byte code offset #470
    //   Java source line #70	-> byte code offset #477
    //   Java source line #114	-> byte code offset #496
    //   Java source line #103	-> byte code offset #518
    //   Java source line #15	-> byte code offset #529
    //   Java source line #66	-> byte code offset #539
    //   Java source line #100	-> byte code offset #554
    //   Java source line #25	-> byte code offset #557
    //   Java source line #5	-> byte code offset #566
    //   Java source line #77	-> byte code offset #603
    //   Java source line #41	-> byte code offset #619
    //   Java source line #14	-> byte code offset #634
    //   Java source line #79	-> byte code offset #637
    //   Java source line #46	-> byte code offset #646
    //   Java source line #87	-> byte code offset #653
    //   Java source line #85	-> byte code offset #657
    //   Java source line #115	-> byte code offset #666
    //   Java source line #12	-> byte code offset #669
    //   Java source line #7	-> byte code offset #689
    //   Java source line #76	-> byte code offset #698
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	699	0	a	d
    //   3	695	1	a	int
    //   21	4	2	a	InterruptedException
    //   72	4	2	a	InterruptedException
    //   338	315	2	a	int
    //   340	313	3	a	int
    //   344	309	4	a	int
    //   390	256	5	a	net.minecraft.inventory.Slot
    //   397	249	6	a	ItemStack
    //   421	225	7	a	Item
    //   477	89	8	a	ItemPotion
    //   490	77	9	a	String[]
    // Exception table:
    //   from	to	target	type
    //   11	17	20	java/lang/InterruptedException
    //   25	36	39	java/lang/InterruptedException
    //   44	51	54	java/lang/InterruptedException
    //   55	68	71	java/lang/InterruptedException
    //   84	98	101	java/lang/InterruptedException
    //   102	122	122	java/lang/InterruptedException
    //   84	123	123	java/lang/InterruptedException
    //   133	149	152	java/lang/InterruptedException
    //   153	164	167	java/lang/InterruptedException
    //   133	168	171	java/lang/InterruptedException
    //   172	183	186	java/lang/InterruptedException
    //   153	187	190	java/lang/InterruptedException
    //   172	199	199	java/lang/InterruptedException
    //   201	224	227	java/lang/InterruptedException
    //   293	301	304	java/lang/InterruptedException
    //   305	316	316	java/lang/InterruptedException
    //   293	317	317	java/lang/InterruptedException
    //   319	329	332	java/lang/InterruptedException
    //   344	360	363	java/lang/InterruptedException
    //   351	367	367	java/lang/InterruptedException
    //   397	406	409	java/lang/InterruptedException
    //   397	413	413	java/lang/InterruptedException
    //   421	430	433	java/lang/InterruptedException
    //   434	446	449	java/lang/InterruptedException
    //   421	450	453	java/lang/InterruptedException
    //   434	466	469	java/lang/InterruptedException
    //   492	506	509	java/lang/InterruptedException
    //   477	510	513	java/lang/InterruptedException
    //   477	535	538	java/lang/InterruptedException
    //   514	562	565	java/lang/InterruptedException
    //   570	576	579	java/lang/InterruptedException
    //   570	591	594	java/lang/InterruptedException
    //   595	611	614	java/lang/InterruptedException
    //   583	615	618	java/lang/InterruptedException
    //   595	642	645	java/lang/InterruptedException
    //   653	658	661	java/lang/InterruptedException
    //   669	685	688	java/lang/InterruptedException
  }
}
