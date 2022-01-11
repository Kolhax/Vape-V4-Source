package md;

import java.util.concurrent.*;
import com.sun.jna.z.a.g.*;
import com.sun.jna.z.a.e.*;
import com.sun.jna.z.a.f.a.a.a.a.a.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.item.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class e extends c
{
    int n;
    int o;
    CopyOnWriteArrayList<com.sun.jna.z.a.e.j> p;
    InventoryPlayer q;
    p r;
    boolean s;
    p t;
    t u;
    i v;
    i w;
    i x;
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
    
    public e() {
        final String[] a = e.S;
        super(a[7], com.sun.jna.z.a.e.b.Utility, 0);
        this.n = 0;
        this.p = new CopyOnWriteArrayList<com.sun.jna.z.a.e.j>();
        this.r = new p();
        this.t = new p();
        this.u = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[6], 100.0, 0.0, 200.0, 1);
        this.v = new d(a[3], true);
        this.w = new d(a[0]);
        final int r = e.R ? 1 : 0;
        this.x = new d(a[1], true);
        final int a2 = r;
        if (a2 != 0) {
            e.y = !e.y;
        }
    }
    
    @Override
    public void a(final TickEvent$PlayerTickEvent a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2        /* a */
        //     4: aload_0         /* a */
        //     5: getfield        md/e.t:Lcom/sun/jna/z/a/g/p;
        //     8: invokevirtual   com/sun/jna/z/a/g/p.d:()J
        //    11: ldc2_w          50
        //    14: lcmp           
        //    15: iload_2         /* a */
        //    16: ifne            40
        //    19: ifle            779
        //    22: goto            26
        //    25: athrow         
        //    26: aload_0         /* a */
        //    27: getfield        md/e.t:Lcom/sun/jna/z/a/g/p;
        //    30: invokevirtual   com/sun/jna/z/a/g/p.c:()V
        //    33: aload_0         /* a */
        //    34: getfield        md/e.p:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    37: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.isEmpty:()Z
        //    40: iload_2         /* a */
        //    41: ifne            121
        //    44: ifne            117
        //    47: goto            51
        //    50: athrow         
        //    51: aload_0         /* a */
        //    52: getfield        md/e.r:Lcom/sun/jna/z/a/g/p;
        //    55: aload_0         /* a */
        //    56: getfield        md/e.u:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //    59: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:()D
        //    64: d2l            
        //    65: invokevirtual   com/sun/jna/z/a/g/p.a:(J)Z
        //    68: iload_2         /* a */
        //    69: ifne            175
        //    72: goto            76
        //    75: athrow         
        //    76: ifeq            174
        //    79: goto            83
        //    82: athrow         
        //    83: aload_0         /* a */
        //    84: getfield        md/e.p:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    87: iconst_0       
        //    88: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.get:(I)Ljava/lang/Object;
        //    91: checkcast       Lcom/sun/jna/z/a/e/j;
        //    94: astore_3        /* a */
        //    95: aload_0         /* a */
        //    96: aload_3         /* a */
        //    97: invokevirtual   md/e.a:(Lcom/sun/jna/z/a/e/j;)V
        //   100: aload_0         /* a */
        //   101: getfield        md/e.p:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   104: aload_3         /* a */
        //   105: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.remove:(Ljava/lang/Object;)Z
        //   108: pop            
        //   109: aload_0         /* a */
        //   110: getfield        md/e.r:Lcom/sun/jna/z/a/g/p;
        //   113: invokevirtual   com/sun/jna/z/a/g/p.c:()V
        //   116: return         
        //   117: aload_0         /* a */
        //   118: getfield        md/e.s:Z
        //   121: iload_2         /* a */
        //   122: ifne            175
        //   125: ifeq            174
        //   128: goto            132
        //   131: athrow         
        //   132: aload_0         /* a */
        //   133: getfield        md/e.r:Lcom/sun/jna/z/a/g/p;
        //   136: aload_0         /* a */
        //   137: getfield        md/e.u:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //   140: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:()D
        //   145: d2l            
        //   146: invokevirtual   com/sun/jna/z/a/g/p.a:(J)Z
        //   149: iload_2         /* a */
        //   150: ifne            175
        //   153: goto            157
        //   156: athrow         
        //   157: ifeq            174
        //   160: goto            164
        //   163: athrow         
        //   164: goto            168
        //   167: athrow         
        //   168: aload_0         /* a */
        //   169: iconst_0       
        //   170: invokevirtual   md/e.a:(Z)V
        //   173: return         
        //   174: iconst_0       
        //   175: istore_3        /* a */
        //   176: iload_3         /* a */
        //   177: bipush          10
        //   179: if_icmpge       743
        //   182: iload_3         /* a */
        //   183: iload_2         /* a */
        //   184: ifne            758
        //   187: bipush          9
        //   189: if_icmpne       231
        //   192: goto            196
        //   195: athrow         
        //   196: goto            200
        //   199: athrow         
        //   200: aload_0         /* a */
        //   201: getfield        md/e.p:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   204: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.isEmpty:()Z
        //   207: iload_2         /* a */
        //   208: ifne            758
        //   211: ifeq            743
        //   214: goto            218
        //   217: athrow         
        //   218: goto            222
        //   221: athrow         
        //   222: aload_0         /* a */
        //   223: iconst_0       
        //   224: invokevirtual   md/e.a:(Z)V
        //   227: goto            743
        //   230: athrow         
        //   231: aload_0         /* a */
        //   232: getfield        md/e.q:Lnet/minecraft/entity/player/InventoryPlayer;
        //   235: getfield        net/minecraft/entity/player/InventoryPlayer.field_70462_a:[Lnet/minecraft/item/ItemStack;
        //   238: iload_3         /* a */
        //   239: aaload         
        //   240: astore          a
        //   242: aload           a
        //   244: iload_2         /* a */
        //   245: ifne            261
        //   248: ifnonnull       259
        //   251: goto            255
        //   254: athrow         
        //   255: goto            736
        //   258: athrow         
        //   259: aload           a
        //   261: invokevirtual   net/minecraft/item/ItemStack.func_77973_b:()Lnet/minecraft/item/Item;
        //   264: astore          a
        //   266: aload           a
        //   268: iload_2         /* a */
        //   269: ifne            575
        //   272: ifnull          565
        //   275: goto            279
        //   278: athrow         
        //   279: aload           a
        //   281: iload_2         /* a */
        //   282: ifne            575
        //   285: instanceof      Lnet/minecraft/item/ItemPotion;
        //   288: ifeq            565
        //   291: goto            295
        //   294: athrow         
        //   295: goto            299
        //   298: athrow         
        //   299: aload_0         /* a */
        //   300: getfield        md/e.v:Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //   303: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.a:()Z
        //   308: ifeq            565
        //   311: goto            315
        //   314: athrow         
        //   315: aload           a
        //   317: checkcast       Lnet/minecraft/item/ItemPotion;
        //   320: astore          a
        //   322: aload           a
        //   324: aload           a
        //   326: invokevirtual   net/minecraft/item/ItemPotion.func_77832_l:(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
        //   329: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   332: getstatic       md/e.S:[Ljava/lang/String;
        //   335: astore          a
        //   337: aload           a
        //   339: iconst_4       
        //   340: aaload         
        //   341: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   344: iload_2         /* a */
        //   345: ifne            381
        //   348: ifeq            561
        //   351: goto            355
        //   354: athrow         
        //   355: aload           a
        //   357: aload           a
        //   359: invokevirtual   net/minecraft/item/ItemPotion.func_77832_l:(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
        //   362: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   365: getstatic       md/e.S:[Ljava/lang/String;
        //   368: astore          a
        //   370: aload           a
        //   372: iconst_5       
        //   373: aaload         
        //   374: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   377: goto            381
        //   380: athrow         
        //   381: ifeq            561
        //   384: goto            388
        //   387: athrow         
        //   388: iconst_0       
        //   389: istore          a
        //   391: aload           a
        //   393: aload           a
        //   395: invokevirtual   net/minecraft/item/ItemPotion.func_77832_l:(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
        //   398: iconst_0       
        //   399: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   404: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   407: getstatic       md/e.S:[Ljava/lang/String;
        //   410: astore          a
        //   412: aload           a
        //   414: iconst_2       
        //   415: aaload         
        //   416: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   419: iload_2         /* a */
        //   420: ifne            475
        //   423: ifeq            481
        //   426: goto            430
        //   429: athrow         
        //   430: iload           a
        //   432: iconst_4       
        //   433: aload           a
        //   435: aload           a
        //   437: invokevirtual   net/minecraft/item/ItemPotion.func_77832_l:(Lnet/minecraft/item/ItemStack;)Ljava/util/List;
        //   440: iconst_0       
        //   441: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   446: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   449: getstatic       md/e.S:[Ljava/lang/String;
        //   452: iconst_2       
        //   453: aaload         
        //   454: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   457: iconst_1       
        //   458: aaload         
        //   459: ldc             ","
        //   461: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   464: iconst_0       
        //   465: aaload         
        //   466: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   469: imul           
        //   470: iadd           
        //   471: goto            475
        //   474: athrow         
        //   475: istore          a
        //   477: iload_2         /* a */
        //   478: ifeq            488
        //   481: iinc            a, 4
        //   484: goto            488
        //   487: athrow         
        //   488: aload_0         /* a */
        //   489: getfield        md/e.n:I
        //   492: iload           a
        //   494: iadd           
        //   495: i2d            
        //   496: aload_0         /* a */
        //   497: invokevirtual   md/e.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   500: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110143_aJ:()F
        //   503: f2d            
        //   504: invokestatic    java/lang/Math.floor:(D)D
        //   507: dadd           
        //   508: ldc2_w          20.0
        //   511: dcmpl          
        //   512: iload_2         /* a */
        //   513: ifne            555
        //   516: ifle            527
        //   519: goto            523
        //   522: athrow         
        //   523: goto            736
        //   526: athrow         
        //   527: aload_0         /* a */
        //   528: dup            
        //   529: getfield        md/e.n:I
        //   532: iload           a
        //   534: iadd           
        //   535: putfield        md/e.n:I
        //   538: aload_0         /* a */
        //   539: getfield        md/e.p:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   542: new             Lcom/sun/jna/z/a/e/j;
        //   545: dup            
        //   546: iload_3         /* a */
        //   547: aload           a
        //   549: invokespecial   com/sun/jna/z/a/e/j.<init>:(ILnet/minecraft/item/ItemStack;)V
        //   552: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.add:(Ljava/lang/Object;)Z
        //   555: pop            
        //   556: aload_0         /* a */
        //   557: iconst_1       
        //   558: putfield        md/e.s:Z
        //   561: iload_2         /* a */
        //   562: ifeq            699
        //   565: iload_2         /* a */
        //   566: ifne            699
        //   569: aload           a
        //   571: goto            575
        //   574: athrow         
        //   575: ifnull          699
        //   578: aload           a
        //   580: instanceof      Lnet/minecraft/item/ItemSoup;
        //   583: iload_2         /* a */
        //   584: ifne            708
        //   587: ifeq            699
        //   590: goto            594
        //   593: athrow         
        //   594: goto            598
        //   597: athrow         
        //   598: aload_0         /* a */
        //   599: getfield        md/e.w:Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //   602: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.a:()Z
        //   607: iload_2         /* a */
        //   608: ifne            708
        //   611: ifeq            699
        //   614: goto            618
        //   617: athrow         
        //   618: goto            622
        //   621: athrow         
        //   622: aload_0         /* a */
        //   623: getfield        md/e.n:I
        //   626: bipush          8
        //   628: iadd           
        //   629: i2d            
        //   630: aload_0         /* a */
        //   631: invokevirtual   md/e.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   634: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_110143_aJ:()F
        //   637: f2d            
        //   638: invokestatic    java/lang/Math.floor:(D)D
        //   641: dadd           
        //   642: ldc2_w          20.0
        //   645: dcmpg          
        //   646: iload_2         /* a */
        //   647: ifne            708
        //   650: ifgt            699
        //   653: goto            657
        //   656: athrow         
        //   657: goto            661
        //   660: athrow         
        //   661: aload_0         /* a */
        //   662: dup            
        //   663: getfield        md/e.n:I
        //   666: bipush          8
        //   668: iadd           
        //   669: putfield        md/e.n:I
        //   672: aload_0         /* a */
        //   673: getfield        md/e.p:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   676: new             Lcom/sun/jna/z/a/e/j;
        //   679: dup            
        //   680: iload_3         /* a */
        //   681: aload           a
        //   683: invokespecial   com/sun/jna/z/a/e/j.<init>:(ILnet/minecraft/item/ItemStack;)V
        //   686: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.add:(Ljava/lang/Object;)Z
        //   689: pop            
        //   690: aload_0         /* a */
        //   691: iconst_1       
        //   692: putfield        md/e.s:Z
        //   695: goto            699
        //   698: athrow         
        //   699: iload_2         /* a */
        //   700: ifne            739
        //   703: iload_3         /* a */
        //   704: goto            708
        //   707: athrow         
        //   708: bipush          8
        //   710: if_icmpne       736
        //   713: aload_0         /* a */
        //   714: getfield        md/e.p:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   717: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.isEmpty:()Z
        //   720: ifeq            736
        //   723: goto            727
        //   726: athrow         
        //   727: aload_0         /* a */
        //   728: iconst_0       
        //   729: invokevirtual   md/e.a:(Z)V
        //   732: goto            736
        //   735: athrow         
        //   736: iinc            a, 1
        //   739: iload_2         /* a */
        //   740: ifeq            176
        //   743: aload_0         /* a */
        //   744: iload_2         /* a */
        //   745: ifne            762
        //   748: getfield        md/e.p:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   751: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.isEmpty:()Z
        //   754: goto            758
        //   757: athrow         
        //   758: ifne            770
        //   761: aload_0         /* a */
        //   762: iconst_1       
        //   763: putfield        md/e.s:Z
        //   766: goto            770
        //   769: athrow         
        //   770: goto            779
        //   773: astore_3        /* a */
        //   774: aload_0         /* a */
        //   775: iconst_0       
        //   776: invokevirtual   md/e.a:(Z)V
        //   779: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  51     79     82     83     Ljava/lang/Exception;
        //  44     72     75     76     Ljava/lang/Exception;
        //  40     47     50     51     Ljava/lang/Exception;
        //  4      22     25     26     Ljava/lang/Exception;
        //  33     116    773    779    Ljava/lang/Exception;
        //  132    160    163    164    Ljava/lang/Exception;
        //  125    153    156    157    Ljava/lang/Exception;
        //  121    128    131    132    Ljava/lang/Exception;
        //  117    164    167    168    Ljava/lang/Exception;
        //  117    173    773    779    Ljava/lang/Exception;
        //  743    754    757    758    Ljava/lang/Exception;
        //  182    192    195    196    Ljava/lang/Exception;
        //  743    766    769    770    Ljava/lang/Exception;
        //  713    732    735    736    Ljava/lang/Exception;
        //  699    704    707    708    Ljava/lang/Exception;
        //  699    723    726    727    Ljava/lang/Exception;
        //  622    653    656    657    Ljava/lang/Exception;
        //  622    695    698    699    Ljava/lang/Exception;
        //  598    614    617    618    Ljava/lang/Exception;
        //  598    657    660    661    Ljava/lang/Exception;
        //  578    590    593    594    Ljava/lang/Exception;
        //  578    618    621    622    Ljava/lang/Exception;
        //  565    571    574    575    Ljava/lang/Exception;
        //  565    594    597    598    Ljava/lang/Exception;
        //  488    519    522    523    Ljava/lang/Exception;
        //  488    526    526    527    Ljava/lang/Exception;
        //  348    377    380    381    Ljava/lang/Exception;
        //  322    351    354    355    Ljava/lang/Exception;
        //  322    384    387    388    Ljava/lang/Exception;
        //  279    291    294    295    Ljava/lang/Exception;
        //  279    311    314    315    Ljava/lang/Exception;
        //  266    275    278    279    Ljava/lang/Exception;
        //  266    295    298    299    Ljava/lang/Exception;
        //  242    251    254    255    Ljava/lang/Exception;
        //  242    258    258    259    Ljava/lang/Exception;
        //  200    214    217    218    Ljava/lang/Exception;
        //  200    230    230    231    Ljava/lang/Exception;
        //  182    218    221    222    Ljava/lang/Exception;
        //  176    196    199    200    Ljava/lang/Exception;
        //  477    484    487    488    Ljava/lang/Exception;
        //  423    471    474    475    Ljava/lang/Exception;
        //  391    426    429    430    Ljava/lang/Exception;
        //  174    770    773    779    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
    
    void a(final com.sun.jna.z.a.e.j a) {
        this.c().field_71071_by.field_70461_c = a.a;
        final int r = e.R ? 1 : 0;
        this.b().field_71442_b.func_78769_a((EntityPlayer)this.c(), (World)this.b().field_71441_e, a.b);
        final int a2 = r;
        final boolean b = a.b.func_77973_b() instanceof ItemSoup;
        Label_0089: {
            e e = null;
            Label_0078: {
                if (a2 == 0) {
                    if (!b) {
                        break Label_0089;
                    }
                    e = this;
                    if (a2 != 0) {
                        break Label_0078;
                    }
                    this.x.a();
                }
                if (!b) {
                    break Label_0089;
                }
                e = this;
            }
            e.b().field_71439_g.func_71040_bB(true);
        }
        if (e.y) {
            e.R = (a2 == 0);
        }
    }
    
    @Override
    public void e() {
        this.q = this.c().field_71071_by;
        this.o = this.q.field_70461_c;
    }
    
    @Override
    public void f() {
        final int a = e.R ? 1 : 0;
        e e = this;
        if (a == 0) {
            if (this.s) {
                this.c().field_71071_by.field_70461_c = this.o;
            }
            this.p.clear();
            this.n = 0;
            e = this;
        }
        e.s = false;
    }
    
    @Override
    public k[] k() {
        return new k[] { this.u, this.v, this.x, this.w };
    }
    
    static {
        final String[] s = new String[8];
        int n = 0;
        String s2;
        int n2 = (s2 = "\u009d§%$\u000b\u009a \";\u0012\u001b\u0001¡¿<'\u0003\u00ee°p\u0004\u009e§$'\f\u009d¸<5\u0016SY\u00ee¼\"!\u0000\u0004¦\u00ad18").length();
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
                        Label_0242: {
                            if (n7 > 1) {
                                break Label_0242;
                            }
                            length = (n8 = n9);
                            do {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = '\u00ce';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u00c8';
                                        break;
                                    }
                                    case 2: {
                                        c2 = 'P';
                                        break;
                                    }
                                    case 3: {
                                        c2 = 'T';
                                        break;
                                    }
                                    case 4: {
                                        c2 = 'e';
                                        break;
                                    }
                                    case 5: {
                                        c2 = ';';
                                        break;
                                    }
                                    default: {
                                        c2 = 'c';
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
                            n2 = (s2 = "\u008a\u00ad<5\u001c\b\u009a \";\u0012K\fº").length();
                            n3 = 5;
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
