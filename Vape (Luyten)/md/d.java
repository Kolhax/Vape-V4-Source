package md;

import com.sun.jna.z.a.g.*;
import net.minecraft.client.gui.inventory.*;
import com.sun.jna.z.a.e.*;
import java.util.*;
import net.minecraft.client.settings.*;
import net.minecraft.item.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class d extends c
{
    t n;
    i o;
    i p;
    p q;
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
    
    public d() {
        final String[] a = d.S;
        super(a[2], com.sun.jna.z.a.e.b.Utility, 0);
        final int r = d.R ? 1 : 0;
        this.n = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[3], 100.0, 0.0, 200.0, 1);
        this.o = new com.sun.jna.z.a.f.a.a.a.a.a.d(a[1], true);
        this.p = new com.sun.jna.z.a.f.a.a.a.a.a.d(a[0]);
        this.q = new p();
        final int a2 = r;
        this.r = new ArrayList<Integer>();
        this.v = new p();
        if (a2 != 0) {
            d.y = !d.y;
        }
    }
    
    @Override
    public void h() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1        /* a */
        //     4: aload_0         /* a */
        //     5: getfield        md/d.x:Z
        //     8: ifeq            698
        //    11: ldc2_w          10
        //    14: invokestatic    java/lang/Thread.sleep:(J)V
        //    17: goto            25
        //    20: astore_2        /* a */
        //    21: aload_2         /* a */
        //    22: invokevirtual   java/lang/InterruptedException.printStackTrace:()V
        //    25: aload_0         /* a */
        //    26: invokevirtual   md/d.c:()Z
        //    29: iload_1         /* a */
        //    30: ifne            44
        //    33: ifeq            4
        //    36: goto            40
        //    39: athrow         
        //    40: aload_0         /* a */
        //    41: getfield        md/d.u:Z
        //    44: iload_1         /* a */
        //    45: ifne            102
        //    48: ifeq            84
        //    51: goto            55
        //    54: athrow         
        //    55: aload_0         /* a */
        //    56: getfield        md/d.n:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //    59: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:()D
        //    64: d2l            
        //    65: invokestatic    java/lang/Thread.sleep:(J)V
        //    68: goto            76
        //    71: astore_2        /* a */
        //    72: aload_2         /* a */
        //    73: invokevirtual   java/lang/InterruptedException.printStackTrace:()V
        //    76: aload_0         /* a */
        //    77: invokevirtual   md/d.m:()V
        //    80: iload_1         /* a */
        //    81: ifeq            4
        //    84: aload_0         /* a */
        //    85: iload_1         /* a */
        //    86: ifne            125
        //    89: invokevirtual   md/d.b:()Lnet/minecraft/client/Minecraft;
        //    92: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //    95: instanceof      Lnet/minecraft/client/gui/inventory/GuiContainer;
        //    98: goto            102
        //   101: athrow         
        //   102: ifeq            124
        //   105: aload_0         /* a */
        //   106: aload_0         /* a */
        //   107: invokevirtual   md/d.b:()Lnet/minecraft/client/Minecraft;
        //   110: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   113: checkcast       Lnet/minecraft/client/gui/inventory/GuiContainer;
        //   116: putfield        md/d.t:Lnet/minecraft/client/gui/inventory/GuiContainer;
        //   119: goto            133
        //   122: athrow         
        //   123: athrow         
        //   124: aload_0         /* a */
        //   125: iconst_1       
        //   126: putfield        md/d.u:Z
        //   129: iload_1         /* a */
        //   130: ifeq            4
        //   133: aload_0         /* a */
        //   134: getfield        md/d.r:Ljava/util/List;
        //   137: invokeinterface java/util/List.isEmpty:()Z
        //   142: iload_1         /* a */
        //   143: ifne            305
        //   146: ifne            293
        //   149: goto            153
        //   152: athrow         
        //   153: aload_0         /* a */
        //   154: getfield        md/d.s:Z
        //   157: iload_1         /* a */
        //   158: ifne            305
        //   161: ifeq            293
        //   164: goto            168
        //   167: athrow         
        //   168: goto            172
        //   171: athrow         
        //   172: aload_0         /* a */
        //   173: iload_1         /* a */
        //   174: ifne            201
        //   177: getfield        md/d.t:Lnet/minecraft/client/gui/inventory/GuiContainer;
        //   180: ifnonnull       200
        //   183: goto            187
        //   186: athrow         
        //   187: goto            191
        //   190: athrow         
        //   191: aload_0         /* a */
        //   192: iconst_0       
        //   193: invokevirtual   md/d.a:(Z)V
        //   196: goto            4
        //   199: athrow         
        //   200: aload_0         /* a */
        //   201: getfield        md/d.q:Lcom/sun/jna/z/a/g/p;
        //   204: iload_1         /* a */
        //   205: ifne            286
        //   208: aload_0         /* a */
        //   209: getfield        md/d.n:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //   212: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:()D
        //   217: d2l            
        //   218: invokevirtual   com/sun/jna/z/a/g/p.a:(J)Z
        //   221: ifeq            4
        //   224: goto            228
        //   227: athrow         
        //   228: aload_0         /* a */
        //   229: invokevirtual   md/d.b:()Lnet/minecraft/client/Minecraft;
        //   232: getfield        net/minecraft/client/Minecraft.field_71442_b:Lnet/minecraft/client/multiplayer/PlayerControllerMP;
        //   235: aload_0         /* a */
        //   236: getfield        md/d.t:Lnet/minecraft/client/gui/inventory/GuiContainer;
        //   239: getfield        net/minecraft/client/gui/inventory/GuiContainer.field_147002_h:Lnet/minecraft/inventory/Container;
        //   242: getfield        net/minecraft/inventory/Container.field_75152_c:I
        //   245: aload_0         /* a */
        //   246: getfield        md/d.r:Ljava/util/List;
        //   249: iconst_0       
        //   250: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   255: checkcast       Ljava/lang/Integer;
        //   258: invokevirtual   java/lang/Integer.intValue:()I
        //   261: iconst_0       
        //   262: iconst_1       
        //   263: aload_0         /* a */
        //   264: invokevirtual   md/d.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   267: invokevirtual   net/minecraft/client/multiplayer/PlayerControllerMP.func_78753_a:(IIIILnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;
        //   270: pop            
        //   271: aload_0         /* a */
        //   272: getfield        md/d.r:Ljava/util/List;
        //   275: iconst_0       
        //   276: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
        //   281: pop            
        //   282: aload_0         /* a */
        //   283: getfield        md/d.q:Lcom/sun/jna/z/a/g/p;
        //   286: invokevirtual   com/sun/jna/z/a/g/p.c:()V
        //   289: iload_1         /* a */
        //   290: ifeq            4
        //   293: aload_0         /* a */
        //   294: iload_1         /* a */
        //   295: ifne            319
        //   298: getfield        md/d.s:Z
        //   301: goto            305
        //   304: athrow         
        //   305: ifeq            318
        //   308: aload_0         /* a */
        //   309: iconst_1       
        //   310: putfield        md/d.u:Z
        //   313: goto            4
        //   316: athrow         
        //   317: athrow         
        //   318: aload_0         /* a */
        //   319: iload_1         /* a */
        //   320: ifne            662
        //   323: getfield        md/d.t:Lnet/minecraft/client/gui/inventory/GuiContainer;
        //   326: ifnull          657
        //   329: goto            333
        //   332: athrow         
        //   333: aload_0         /* a */
        //   334: invokevirtual   md/d.n:()I
        //   337: istore_2        /* a */
        //   338: iconst_0       
        //   339: istore_3        /* a */
        //   340: bipush          9
        //   342: istore          a
        //   344: iload           a
        //   346: bipush          36
        //   348: if_icmpge       653
        //   351: iload_3         /* a */
        //   352: iload_2         /* a */
        //   353: iload_1         /* a */
        //   354: ifne            348
        //   357: if_icmplt       368
        //   360: goto            364
        //   363: athrow         
        //   364: goto            653
        //   367: athrow         
        //   368: aload_0         /* a */
        //   369: getfield        md/d.t:Lnet/minecraft/client/gui/inventory/GuiContainer;
        //   372: getfield        net/minecraft/client/gui/inventory/GuiContainer.field_147002_h:Lnet/minecraft/inventory/Container;
        //   375: getfield        net/minecraft/inventory/Container.field_75151_b:Ljava/util/List;
        //   378: iload           a
        //   380: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   385: checkcast       Lnet/minecraft/inventory/Slot;
        //   388: astore          a
        //   390: aload           a
        //   392: invokevirtual   net/minecraft/inventory/Slot.func_75211_c:()Lnet/minecraft/item/ItemStack;
        //   395: astore          a
        //   397: aload           a
        //   399: iload_1         /* a */
        //   400: ifne            416
        //   403: ifnonnull       414
        //   406: goto            410
        //   409: athrow         
        //   410: goto            646
        //   413: athrow         
        //   414: aload           a
        //   416: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   419: astore          a
        //   421: aload           a
        //   423: iload_1         /* a */
        //   424: ifne            580
        //   427: ifnull          570
        //   430: goto            434
        //   433: athrow         
        //   434: aload           a
        //   436: iload_1         /* a */
        //   437: ifne            580
        //   440: instanceof      Lnet/minecraft/item/ItemPotion;
        //   443: ifeq            570
        //   446: goto            450
        //   449: athrow         
        //   450: goto            454
        //   453: athrow         
        //   454: aload_0         /* a */
        //   455: getfield        md/d.o:Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //   458: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.a:()Z
        //   463: ifeq            570
        //   466: goto            470
        //   469: athrow         
        //   470: aload           a
        //   472: checkcast       Lnet/minecraft/item/ItemPotion;
        //   475: astore          a
        //   477: aload           a
        //   479: aload           a
        //   481: invokevirtual   net/minecraft/item/ItemPotion.func_77832_l:(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
        //   484: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   487: getstatic       md/d.S:[Ljava/lang/String;
        //   490: astore          a
        //   492: aload           a
        //   494: iconst_4       
        //   495: aaload         
        //   496: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   499: iload_1         /* a */
        //   500: ifne            532
        //   503: ifeq            566
        //   506: goto            510
        //   509: athrow         
        //   510: goto            514
        //   513: athrow         
        //   514: aload           a
        //   516: aload           a
        //   518: invokevirtual   net/minecraft/item/ItemPotion.func_77832_l:(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
        //   521: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   524: getstatic       md/d.S:[Ljava/lang/String;
        //   527: iconst_5       
        //   528: aaload         
        //   529: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   532: ifeq            566
        //   535: goto            539
        //   538: athrow         
        //   539: aload_0         /* a */
        //   540: getfield        md/d.r:Ljava/util/List;
        //   543: iload           a
        //   545: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   548: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   553: pop            
        //   554: iinc            a, 1
        //   557: aload_0         /* a */
        //   558: iconst_1       
        //   559: putfield        md/d.s:Z
        //   562: goto            566
        //   565: athrow         
        //   566: iload_1         /* a */
        //   567: ifeq            646
        //   570: iload_1         /* a */
        //   571: ifne            649
        //   574: aload           a
        //   576: goto            580
        //   579: athrow         
        //   580: ifnull          646
        //   583: aload           a
        //   585: instanceof      Lnet/minecraft/item/ItemSoup;
        //   588: ifeq            646
        //   591: goto            595
        //   594: athrow         
        //   595: iload_1         /* a */
        //   596: ifne            649
        //   599: aload_0         /* a */
        //   600: getfield        md/d.p:Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //   603: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.a:()Z
        //   608: ifeq            646
        //   611: goto            615
        //   614: athrow         
        //   615: goto            619
        //   618: athrow         
        //   619: aload_0         /* a */
        //   620: getfield        md/d.r:Ljava/util/List;
        //   623: iload           a
        //   625: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   628: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   633: pop            
        //   634: iinc            a, 1
        //   637: aload_0         /* a */
        //   638: iconst_1       
        //   639: putfield        md/d.s:Z
        //   642: goto            646
        //   645: athrow         
        //   646: iinc            a, 1
        //   649: iload_1         /* a */
        //   650: ifeq            344
        //   653: iload_1         /* a */
        //   654: ifeq            669
        //   657: aload_0         /* a */
        //   658: goto            662
        //   661: athrow         
        //   662: iconst_1       
        //   663: putfield        md/d.u:Z
        //   666: goto            4
        //   669: aload_0         /* a */
        //   670: iload_1         /* a */
        //   671: ifne            690
        //   674: getfield        md/d.r:Ljava/util/List;
        //   677: invokeinterface java/util/List.isEmpty:()Z
        //   682: ifeq            4
        //   685: goto            689
        //   688: athrow         
        //   689: aload_0         /* a */
        //   690: iconst_1       
        //   691: putfield        md/d.u:Z
        //   694: iload_1         /* a */
        //   695: ifeq            4
        //   698: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  11     17     20     25     Ljava/lang/InterruptedException;
        //  44     51     54     55     Ljava/lang/InterruptedException;
        //  25     36     39     40     Ljava/lang/InterruptedException;
        //  55     68     71     76     Ljava/lang/InterruptedException;
        //  102    122    122    123    Ljava/lang/InterruptedException;
        //  84     98     101    102    Ljava/lang/InterruptedException;
        //  84     123    123    124    Ljava/lang/InterruptedException;
        //  153    164    167    168    Ljava/lang/InterruptedException;
        //  133    149    152    153    Ljava/lang/InterruptedException;
        //  133    168    171    172    Ljava/lang/InterruptedException;
        //  172    183    186    187    Ljava/lang/InterruptedException;
        //  153    187    190    191    Ljava/lang/InterruptedException;
        //  172    199    199    200    Ljava/lang/InterruptedException;
        //  305    316    316    317    Ljava/lang/InterruptedException;
        //  293    301    304    305    Ljava/lang/InterruptedException;
        //  201    224    227    228    Ljava/lang/InterruptedException;
        //  293    317    317    318    Ljava/lang/InterruptedException;
        //  319    329    332    333    Ljava/lang/InterruptedException;
        //  344    360    363    364    Ljava/lang/InterruptedException;
        //  351    367    367    368    Ljava/lang/InterruptedException;
        //  397    406    409    410    Ljava/lang/InterruptedException;
        //  397    413    413    414    Ljava/lang/InterruptedException;
        //  434    446    449    450    Ljava/lang/InterruptedException;
        //  421    430    433    434    Ljava/lang/InterruptedException;
        //  421    450    453    454    Ljava/lang/InterruptedException;
        //  434    466    469    470    Ljava/lang/InterruptedException;
        //  492    506    509    510    Ljava/lang/InterruptedException;
        //  477    510    513    514    Ljava/lang/InterruptedException;
        //  477    535    538    539    Ljava/lang/InterruptedException;
        //  514    562    565    566    Ljava/lang/InterruptedException;
        //  570    576    579    580    Ljava/lang/InterruptedException;
        //  570    591    594    595    Ljava/lang/InterruptedException;
        //  595    611    614    615    Ljava/lang/InterruptedException;
        //  583    615    618    619    Ljava/lang/InterruptedException;
        //  595    642    645    646    Ljava/lang/InterruptedException;
        //  653    658    661    662    Ljava/lang/InterruptedException;
        //  669    685    688    689    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0153:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.FileSaver.doSaveJarDecompiled(FileSaver.java:191)
        //     at us.deathmarine.luyten.FileSaver.access$300(FileSaver.java:46)
        //     at us.deathmarine.luyten.FileSaver$4.run(FileSaver.java:112)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void m() {
        final int a = d.R ? 1 : 0;
        d d = this;
        if (a == 0) {
            if (this.b().field_71462_r != null) {
                this.c().func_71053_j();
            }
            this.s = false;
            this.u = false;
            d = this;
        }
        d.a(false);
    }
    
    int n() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload_0         /* a */
        //     3: invokevirtual   md/d.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //     6: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71071_by:Lnet/minecraft/entity/player/InventoryPlayer;
        //     9: astore_3       
        //    10: getstatic       md/d.R:Z
        //    13: iconst_0       
        //    14: istore          4
        //    16: istore_1        /* a */
        //    17: iload           a
        //    19: bipush          9
        //    21: if_icmpge       52
        //    24: aload_3         /* a */
        //    25: getfield        net/minecraft/entity/player/InventoryPlayer.field_70462_a:[Lnet/minecraft/item/ItemStack;
        //    28: iload           a
        //    30: aaload         
        //    31: astore          a
        //    33: iload_1         /* a */
        //    34: ifne            48
        //    37: aload           a
        //    39: ifnonnull       45
        //    42: iinc            a, 1
        //    45: iinc            a, 1
        //    48: iload_1         /* a */
        //    49: ifeq            17
        //    52: iload_2         /* a */
        //    53: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.FileSaver.doSaveJarDecompiled(FileSaver.java:191)
        //     at us.deathmarine.luyten.FileSaver.access$300(FileSaver.java:46)
        //     at us.deathmarine.luyten.FileSaver$4.run(FileSaver.java:112)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void e() {
        final int r = d.R ? 1 : 0;
        this.x = true;
        final int a = r;
        d d = this;
        if (a == 0) {
            if (this.w == null) {
                (this.w = new com.sun.jna.z.a.e.i(this)).a();
            }
            d = this;
        }
        int n2;
        final int n = n2 = d.n();
        if (a == 0) {
            if (n == 0) {
                this.a(false);
                return;
            }
            n2 = 0;
        }
        boolean a2 = n2 != 0;
        int a3 = 9;
        while (a3 < 36) {
            final ItemStack a4 = this.c().field_71071_by.func_70301_a(a3);
            if (a != 0) {
                return;
            }
            final ItemStack itemStack = a4;
            Label_0242: {
                if (a != 0 || (itemStack != null || a != 0)) {
                    final Item a5 = itemStack.func_77973_b();
                    final Item item2;
                    final Item item = item2 = a5;
                    final Item item3;
                    if (a == 0) {
                        if (item != null) {
                            item3 = a5;
                            if (a == 0) {
                                if (item3 instanceof ItemPotion && this.o.a()) {
                                    final ItemPotion a6 = (ItemPotion)a5;
                                    final String string = a6.func_77832_l(a4).toString();
                                    final String[] a7 = md.d.S;
                                    boolean contains;
                                    final boolean b = contains = string.contains(a7[4]);
                                    Label_0199: {
                                        if (a == 0) {
                                            if (!b) {
                                                break Label_0199;
                                            }
                                            final boolean contains2;
                                            contains = (contains2 = a6.func_77832_l(a4).toString().contains(a7[5]));
                                        }
                                        if (a == 0) {
                                            if (!b) {
                                                break Label_0199;
                                            }
                                            contains = true;
                                        }
                                        a2 = contains;
                                    }
                                    if (a == 0) {
                                        break Label_0242;
                                    }
                                }
                            }
                        }
                    }
                    if (a != 0 || item != null) {
                        boolean b3;
                        final boolean b2 = b3 = (item3 instanceof ItemSoup);
                        if (a == 0) {
                            if (!b2) {
                                break Label_0242;
                            }
                            final boolean a8;
                            b3 = (a8 = this.p.a());
                        }
                        if (a == 0) {
                            if (!b2) {
                                break Label_0242;
                            }
                            b3 = true;
                        }
                        a2 = b3;
                    }
                }
            }
            ++a3;
            if (a != 0) {
                break;
            }
        }
        final int n3 = a2 ? 1 : 0;
        if (a == 0) {
            if (n3 == 0) {
                this.a(false);
                return;
            }
            a3 = this.b().field_71474_y.field_151445_Q.func_151463_i();
            KeyBinding.func_74510_a(a3, true);
            KeyBinding.func_74507_a(a3);
        }
        KeyBinding.func_74510_a(n3, false);
        this.q.c();
        this.r.clear();
        this.s = false;
    }
    
    @Override
    public void g() {
        this.x = false;
        final int a = d.R ? 1 : 0;
        d d = this;
        if (a == 0) {
            if (this.w != null) {
                this.w.a = null;
            }
            d = this;
        }
        d.w = null;
    }
    
    @Override
    public k[] k() {
        final int a = d.R ? 1 : 0;
        final k[] array = { this.n, this.p, this.o };
        if (d.y) {
            d.R = (a == 0);
        }
        return array;
    }
    
    static {
        final String[] s = new String[6];
        int n = 0;
        String s2;
        int n2 = (s2 = "i\u00ad¨½\u0004j\u00ad©¾\u0006h§»¤\u00e9n\u0005~§±¬\u00fc").length();
        int n3 = 4;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                ++n4;
                final String s3 = s2;
                final int n5 = n4;
                String s4 = s3.substring(n5, n5 + n3);
                int n6 = -1;
                while (true) {
                    final char[] charArray = s4.toCharArray();
                    int length;
                    int n8;
                    final int n7 = n8 = (length = charArray.length);
                    int n9 = 0;
                    while (true) {
                        Label_0247: {
                            if (n7 > 1) {
                                break Label_0247;
                            }
                            length = (n8 = n9);
                            do {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = ':';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u00c2';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '\u00dd';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\u00cd';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '\u0085';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '\u0002';
                                        break;
                                    }
                                    default: {
                                        c2 = 'M';
                                        break;
                                    }
                                }
                                charArray[length] = (char)(c ^ c2);
                                ++n9;
                            } while (n7 == 0);
                        }
                        if (n7 > n9) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n6) {
                        default: {
                            s[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s2.charAt(n4);
                                continue Label_0022;
                            }
                            n2 = (s2 = "i²±¬\u00f6jw\u001a¶¯¸\u00e0\u0004R§¼¡").length();
                            n3 = 12;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            s[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s2.charAt(n4);
                                break;
                            }
                            break Label_0022;
                        }
                    }
                    ++n4;
                    final String s5 = s2;
                    final int n10 = n4;
                    s4 = s5.substring(n10, n10 + n3);
                    n6 = 0;
                }
            }
            break;
        }
        S = s;
    }
}
