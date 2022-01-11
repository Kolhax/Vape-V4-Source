package com.sun.jna.z.a.f.a.a.a.f;

import com.sun.jna.z.a.a.*;
import net.minecraft.client.*;
import com.sun.jna.z.a.f.a.a.a.b.*;
import net.minecraft.client.gui.*;
import com.sun.jna.z.a.f.a.a.a.*;
import com.sun.jna.z.a.f.a.a.a.a.*;
import org.lwjgl.input.*;
import java.io.*;
import org.lwjgl.opengl.*;
import java.awt.*;
import com.sun.jna.z.a.*;

public class b extends GuiScreen
{
    private final j a;
    public d b;
    public e c;
    private String d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    Minecraft l;
    boolean m;
    int n;
    FontRenderer o;
    int p;
    private static final String[] q;
    
    public b(final j a) {
        this.d = "";
        this.e = false;
        this.f = true;
        this.k = 130;
        this.l = Minecraft.func_71410_x();
        this.m = false;
        this.n = 0;
        this.o = new a(new com.sun.jna.z.a.g.e(com.sun.jna.z.a.f.a.a.a.f.b.q[4], 34.0f));
        this.p = 5;
        this.a = a;
        this.b = new d();
    }
    
    public void func_73866_w_() {
        this.g = 350;
        this.h = 20;
        this.i = 130;
        this.j = 12;
        Keyboard.enableRepeatEvents(true);
        (this.c = new e(this.field_146289_q, this.g + 2, this.h + 2, this.i, this.j)).f(100);
        this.c.a(false);
        this.c.b(false);
        this.c.d(true);
        this.n = 0;
    }
    
    public int a() {
        return this.g;
    }
    
    public void func_146281_b() {
        Keyboard.enableRepeatEvents(false);
        this.l.field_71456_v.func_146158_b().func_146240_d();
        this.f = true;
    }
    
    public void func_73876_c() {
        this.c.a();
    }
    
    protected void func_73869_a(final char a, final int a) {
        this.f = false;
        final int a2 = a.b ? 1 : 0;
        int n = a;
        int n2 = a;
        int n3 = a;
        int n4 = a;
        int n8;
        int n7;
        int n6;
        final int n5 = n6 = (n7 = (n8 = 15));
        if (a2 == 0) {
            if (a == n5) {
                this.m = true;
            }
            n = a;
            n2 = a;
            n3 = a;
            n4 = a;
            final int n9;
            n6 = (n9 = (n7 = (n8 = 14)));
        }
        Label_0051: {
            Label_0049: {
                Label_0044: {
                    if (a2 == 0) {
                        if (n4 == n5) {
                            break Label_0044;
                        }
                        n = a;
                        n2 = a;
                        n3 = a;
                        n7 = (n6 = (n8 = 57));
                    }
                    if (a2 != 0) {
                        break Label_0051;
                    }
                    if (n3 != n6) {
                        break Label_0049;
                    }
                }
                this.n = 0;
            }
            n = a;
            n2 = a;
            n8 = (n7 = 1);
        }
        if (a2 == 0) {
            if (n2 == n7) {
                this.l.func_147108_a((GuiScreen)null);
                if (a2 == 0) {
                    return;
                }
            }
            n = a;
            if (a2 != 0) {
                return;
            }
            n8 = 28;
        }
        if (n == n8) {
            final String a3 = this.c.b().trim();
            Label_0148: {
                if (a2 == 0) {
                    if (a3.length() <= 0) {
                        break Label_0148;
                    }
                    this.b.a("." + a3);
                    this.c.a("");
                }
                this.n = 0;
            }
            if (a2 == 0) {
                return;
            }
        }
        this.c.a(a, a);
    }
    
    protected void func_73864_a(final int a, final int a, final int a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          a
        //     5: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //     8: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //    11: ifnonnull       16
        //    14: return         
        //    15: athrow         
        //    16: invokestatic    com/sun/jna/z/a/f/a/a/a/h.a:()F
        //    19: fstore          a
        //    21: iload_1         /* a */
        //    22: i2f            
        //    23: fload           a
        //    25: fdiv           
        //    26: f2i            
        //    27: istore_1        /* a */
        //    28: iload_2         /* a */
        //    29: i2f            
        //    30: fload           a
        //    32: fdiv           
        //    33: f2i            
        //    34: istore_2        /* a */
        //    35: aload_0         /* a */
        //    36: iload_1         /* a */
        //    37: iload_2         /* a */
        //    38: iload_3         /* a */
        //    39: invokespecial   net/minecraft/client/gui/GuiScreen.func_73864_a:(III)V
        //    42: goto            52
        //    45: astore          a
        //    47: aload           a
        //    49: invokevirtual   java/io/IOException.printStackTrace:()V
        //    52: aload_0         /* a */
        //    53: getfield        com/sun/jna/z/a/f/a/a/a/f/b.a:Lcom/sun/jna/z/a/f/a/a/a/j;
        //    56: invokeinterface com/sun/jna/z/a/f/a/a/a/j.b:()[Lcom/sun/jna/z/a/f/a/a/a/a/n;
        //    61: astore          6
        //    63: aload           6
        //    65: arraylength    
        //    66: istore          a
        //    68: iconst_0       
        //    69: istore          a
        //    71: iload           a
        //    73: iload           a
        //    75: if_icmpge       373
        //    78: aload           6
        //    80: iload           a
        //    82: aaload         
        //    83: astore          a
        //    85: aload           a
        //    87: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.p:()Z
        //    92: iload           a
        //    94: ifne            390
        //    97: iload           a
        //    99: ifne            133
        //   102: goto            106
        //   105: athrow         
        //   106: ifne            122
        //   109: goto            113
        //   112: athrow         
        //   113: iload           a
        //   115: ifeq            365
        //   118: goto            122
        //   121: athrow         
        //   122: aload           a
        //   124: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.d:()Z
        //   129: goto            133
        //   132: athrow         
        //   133: iload           a
        //   135: ifne            170
        //   138: ifne            365
        //   141: goto            145
        //   144: athrow         
        //   145: aload           a
        //   147: iload           a
        //   149: ifne            175
        //   152: goto            156
        //   155: athrow         
        //   156: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.j:()Ljava/awt/Rectangle;
        //   161: iload_1         /* a */
        //   162: iload_2         /* a */
        //   163: invokevirtual   java/awt/Rectangle.contains:(II)Z
        //   166: goto            170
        //   169: athrow         
        //   170: ifne            365
        //   173: aload           a
        //   175: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.b:()[Lcom/sun/jna/z/a/f/a/a/a/a/k;
        //   180: astore          a
        //   182: aload           a
        //   184: arraylength    
        //   185: istore          a
        //   187: iconst_0       
        //   188: istore          a
        //   190: iload           a
        //   192: iload           a
        //   194: if_icmpge       365
        //   197: aload           a
        //   199: iload           a
        //   201: aaload         
        //   202: astore          a
        //   204: aload           a
        //   206: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.a:()Lcom/sun/jna/z/a/f/a/a/a/e/e;
        //   211: aload           a
        //   213: invokeinterface com/sun/jna/z/a/f/a/a/a/e/e.a:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //   218: aload           a
        //   220: invokeinterface com/sun/jna/z/a/f/a/a/a/e/d.e:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)[Ljava/awt/Rectangle;
        //   225: astore          a
        //   227: aload           a
        //   229: arraylength    
        //   230: istore          a
        //   232: iconst_0       
        //   233: iload           a
        //   235: ifne            73
        //   238: istore          a
        //   240: iload           a
        //   242: iload           a
        //   244: if_icmpge       357
        //   247: aload           a
        //   249: iload           a
        //   251: aaload         
        //   252: astore          a
        //   254: iload           a
        //   256: ifne            352
        //   259: aload           a
        //   261: iload_1         /* a */
        //   262: aload           a
        //   264: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.d:()I
        //   269: isub           
        //   270: aload           a
        //   272: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.d:()I
        //   277: isub           
        //   278: iload_2         /* a */
        //   279: aload           a
        //   281: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.e:()I
        //   286: isub           
        //   287: aload           a
        //   289: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.e:()I
        //   294: isub           
        //   295: invokevirtual   java/awt/Rectangle.contains:(II)Z
        //   298: iload           a
        //   300: ifne            192
        //   303: goto            307
        //   306: athrow         
        //   307: ifeq            349
        //   310: aload           a
        //   312: iload_1         /* a */
        //   313: aload           a
        //   315: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.d:()I
        //   320: isub           
        //   321: iload_2         /* a */
        //   322: aload           a
        //   324: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.e:()I
        //   329: isub           
        //   330: iload_3         /* a */
        //   331: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.a:(III)V
        //   336: aload_0         /* a */
        //   337: getfield        com/sun/jna/z/a/f/a/a/a/f/b.a:Lcom/sun/jna/z/a/f/a/a/a/j;
        //   340: aload           a
        //   342: invokeinterface com/sun/jna/z/a/f/a/a/a/j.c:(Lcom/sun/jna/z/a/f/a/a/a/a/n;)V
        //   347: return         
        //   348: athrow         
        //   349: iinc            a, 1
        //   352: iload           a
        //   354: ifeq            240
        //   357: iinc            a, 1
        //   360: iload           a
        //   362: ifeq            190
        //   365: iinc            a, 1
        //   368: iload           a
        //   370: ifeq            71
        //   373: aload_0         /* a */
        //   374: getfield        com/sun/jna/z/a/f/a/a/a/f/b.a:Lcom/sun/jna/z/a/f/a/a/a/j;
        //   377: invokeinterface com/sun/jna/z/a/f/a/a/a/j.b:()[Lcom/sun/jna/z/a/f/a/a/a/a/n;
        //   382: astore          6
        //   384: aload           6
        //   386: arraylength    
        //   387: istore          a
        //   389: iconst_0       
        //   390: istore          a
        //   392: iload           a
        //   394: iload           a
        //   396: if_icmpge       694
        //   399: aload           6
        //   401: iload           a
        //   403: aaload         
        //   404: astore          a
        //   406: aload           a
        //   408: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.p:()Z
        //   413: iload           a
        //   415: ifne            445
        //   418: ifne            434
        //   421: goto            425
        //   424: athrow         
        //   425: iload           a
        //   427: ifeq            686
        //   430: goto            434
        //   433: athrow         
        //   434: aload           a
        //   436: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.d:()Z
        //   441: goto            445
        //   444: athrow         
        //   445: iload           a
        //   447: ifne            551
        //   450: ifne            531
        //   453: goto            457
        //   456: athrow         
        //   457: aload           a
        //   459: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.j:()Ljava/awt/Rectangle;
        //   464: iload_1         /* a */
        //   465: iload_2         /* a */
        //   466: invokevirtual   java/awt/Rectangle.contains:(II)Z
        //   469: iload           a
        //   471: ifne            551
        //   474: goto            478
        //   477: athrow         
        //   478: ifeq            531
        //   481: goto            485
        //   484: athrow         
        //   485: aload           a
        //   487: iload_1         /* a */
        //   488: aload           a
        //   490: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.d:()I
        //   495: isub           
        //   496: iload_2         /* a */
        //   497: aload           a
        //   499: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.e:()I
        //   504: isub           
        //   505: iload_3         /* a */
        //   506: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.a:(III)V
        //   511: aload_0         /* a */
        //   512: getfield        com/sun/jna/z/a/f/a/a/a/f/b.a:Lcom/sun/jna/z/a/f/a/a/a/j;
        //   515: aload           a
        //   517: invokeinterface com/sun/jna/z/a/f/a/a/a/j.c:(Lcom/sun/jna/z/a/f/a/a/a/a/n;)V
        //   522: iload           a
        //   524: ifeq            694
        //   527: goto            531
        //   530: athrow         
        //   531: aload           a
        //   533: iload           a
        //   535: ifne            556
        //   538: goto            542
        //   541: athrow         
        //   542: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.d:()Z
        //   547: goto            551
        //   550: athrow         
        //   551: ifeq            686
        //   554: aload           a
        //   556: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.a:()Lcom/sun/jna/z/a/f/a/a/a/e/e;
        //   561: aload           a
        //   563: invokeinterface com/sun/jna/z/a/f/a/a/a/e/e.a:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //   568: aload           a
        //   570: invokeinterface com/sun/jna/z/a/f/a/a/a/e/d.e:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)[Ljava/awt/Rectangle;
        //   575: astore          10
        //   577: aload           10
        //   579: arraylength    
        //   580: istore          a
        //   582: iconst_0       
        //   583: istore          a
        //   585: iload           a
        //   587: iload           a
        //   589: if_icmpge       686
        //   592: aload           10
        //   594: iload           a
        //   596: aaload         
        //   597: astore          a
        //   599: iload           a
        //   601: ifne            681
        //   604: aload           a
        //   606: iload_1         /* a */
        //   607: aload           a
        //   609: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.d:()I
        //   614: isub           
        //   615: iload_2         /* a */
        //   616: aload           a
        //   618: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.e:()I
        //   623: isub           
        //   624: invokevirtual   java/awt/Rectangle.contains:(II)Z
        //   627: iload           a
        //   629: ifne            394
        //   632: goto            636
        //   635: athrow         
        //   636: ifeq            678
        //   639: aload           a
        //   641: iload_1         /* a */
        //   642: aload           a
        //   644: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.d:()I
        //   649: isub           
        //   650: iload_2         /* a */
        //   651: aload           a
        //   653: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.e:()I
        //   658: isub           
        //   659: iload_3         /* a */
        //   660: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.a:(III)V
        //   665: aload_0         /* a */
        //   666: getfield        com/sun/jna/z/a/f/a/a/a/f/b.a:Lcom/sun/jna/z/a/f/a/a/a/j;
        //   669: aload           a
        //   671: invokeinterface com/sun/jna/z/a/f/a/a/a/j.c:(Lcom/sun/jna/z/a/f/a/a/a/a/n;)V
        //   676: return         
        //   677: athrow         
        //   678: iinc            a, 1
        //   681: iload           a
        //   683: ifeq            585
        //   686: iinc            a, 1
        //   689: iload           a
        //   691: ifeq            392
        //   694: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      15     15     16     Ljava/io/IOException;
        //  35     42     45     52     Ljava/io/IOException;
        //  85     102    105    106    Ljava/io/IOException;
        //  97     109    112    113    Ljava/io/IOException;
        //  106    118    121    122    Ljava/io/IOException;
        //  113    129    132    133    Ljava/io/IOException;
        //  133    141    144    145    Ljava/io/IOException;
        //  138    152    155    156    Ljava/io/IOException;
        //  145    166    169    170    Ljava/io/IOException;
        //  254    303    306    307    Ljava/io/IOException;
        //  307    348    348    349    Ljava/io/IOException;
        //  406    421    424    425    Ljava/io/IOException;
        //  418    430    433    434    Ljava/io/IOException;
        //  425    441    444    445    Ljava/io/IOException;
        //  445    453    456    457    Ljava/io/IOException;
        //  450    474    477    478    Ljava/io/IOException;
        //  457    481    484    485    Ljava/io/IOException;
        //  478    527    530    531    Ljava/io/IOException;
        //  485    538    541    542    Ljava/io/IOException;
        //  531    547    550    551    Ljava/io/IOException;
        //  599    632    635    636    Ljava/io/IOException;
        //  636    677    677    678    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0106:
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
    
    public void func_146286_b(int a, int a, final int a) {
        final int a2 = a.b ? 1 : 0;
        final Minecraft func_71410_x = Minecraft.func_71410_x();
        if (a2 == 0) {
            if (func_71410_x.field_71462_r == null) {
                return;
            }
            Minecraft.func_71410_x();
        }
        final Minecraft a3 = func_71410_x;
        final ScaledResolution a4 = new ScaledResolution(Minecraft.func_71410_x(), Minecraft.func_71410_x().field_71443_c, Minecraft.func_71410_x().field_71440_d);
        final int a5 = a4.func_78325_e();
        final float a6 = com.sun.jna.z.a.f.a.a.a.h.a();
        a /= (int)a6;
        a /= (int)a6;
        super.func_146286_b(a, a, a);
        n[] a7 = this.a.b();
        int a8 = a7.length;
        int a9 = 0;
        while (true) {
            do {
                int i = 0;
            Label_0103:
                while (i < a8) {
                    n a10 = a7[a9];
                    final boolean p;
                    boolean contains;
                    final boolean b = contains = (p = a10.p());
                    if (a2 != 0) {
                        a9 = (p ? 1 : 0);
                        do {
                            int j = 0;
                        Label_0391:
                            while (j < a8) {
                                a10 = a7[a9];
                                boolean b4;
                                final boolean b3;
                                final boolean b2 = b3 = (b4 = a10.p());
                                Label_0777: {
                                    if (a2 == 0) {
                                        if (!b2 && a2 == 0) {
                                            break Label_0777;
                                        }
                                        a10.equals(com.sun.jna.z.a.j.e.c.n);
                                    }
                                    boolean b5 = false;
                                    Label_0565: {
                                        if (a2 == 0) {
                                            if (b2) {
                                                final Rectangle[] e = a10.a().a(a10).e(a10);
                                                final int a11 = e.length;
                                                int a12 = 0;
                                                while (a12 < a11) {
                                                    final Rectangle a13 = e[a12];
                                                    Label_0550: {
                                                        Label_0542: {
                                                            if (a2 == 0) {
                                                                b5 = (b4 = a13.contains(a - a10.d(), a - (a10.e() + 12)));
                                                                if (a2 != 0) {
                                                                    break Label_0565;
                                                                }
                                                                if (!b5) {
                                                                    break Label_0542;
                                                                }
                                                                this.c.b(true);
                                                            }
                                                            if (a2 == 0) {
                                                                break Label_0550;
                                                            }
                                                        }
                                                        this.c.b(false);
                                                    }
                                                    ++a12;
                                                    if (a2 != 0) {
                                                        break;
                                                    }
                                                }
                                            }
                                            a10.d();
                                        }
                                    }
                                    final n n;
                                    Label_0652: {
                                        final boolean contains2;
                                        Label_0647: {
                                            if (a2 == 0) {
                                                if (!b5) {
                                                    contains2 = a10.j().contains(a, a);
                                                    if (a2 != 0) {
                                                        break Label_0647;
                                                    }
                                                    if (contains2) {
                                                        a10.b(a - a10.d(), a - a10.e(), a);
                                                        this.a.c(a10);
                                                        if (a2 == 0) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                n = a10;
                                                if (a2 != 0) {
                                                    break Label_0652;
                                                }
                                                n.d();
                                            }
                                        }
                                        if (!contains2) {
                                            break Label_0777;
                                        }
                                    }
                                    final Rectangle[] e2 = n.a().a(a10).e(a10);
                                    final int a11 = e2.length;
                                    int a12 = 0;
                                    while (a12 < a11) {
                                        final Rectangle a13 = e2[a12];
                                        if (a2 == 0) {
                                            j = (a13.contains(a - a10.d(), a - a10.e()) ? 1 : 0);
                                            if (a2 != 0) {
                                                continue Label_0391;
                                            }
                                            if (j != 0) {
                                                a10.b(a - a10.d(), a - a10.e(), a);
                                                this.a.c(a10);
                                                return;
                                            }
                                            ++a12;
                                        }
                                        if (a2 != 0) {
                                            break;
                                        }
                                    }
                                }
                                ++a9;
                            }
                            break;
                        } while (a2 == 0);
                        return;
                    }
                    Label_0362: {
                        if (a2 == 0) {
                            if (!b && a2 == 0) {
                                break Label_0362;
                            }
                            final boolean d;
                            contains = (d = a10.d());
                        }
                        final n n2;
                        Label_0177: {
                            if (a2 == 0) {
                                if (b) {
                                    break Label_0362;
                                }
                                n2 = a10;
                                if (a2 != 0) {
                                    break Label_0177;
                                }
                                contains = n2.j().contains(a, a);
                            }
                            if (contains) {
                                break Label_0362;
                            }
                        }
                        final k[] a14 = n2.b();
                        final int a11 = a14.length;
                        int a12 = 0;
                        do {
                            int k = 0;
                        Label_0194:
                            while (k < a11) {
                                final k a15 = a14[a12];
                                final Rectangle[] a16 = a15.a().a(a15).e(a15);
                                final int a17 = a16.length;
                                i = 0;
                                if (a2 != 0) {
                                    continue Label_0103;
                                }
                                int a18 = i;
                                while (a18 < a17) {
                                    final Rectangle a19 = a16[a18];
                                    if (a2 == 0) {
                                        k = (a19.contains(a - a10.d() - a15.d(), a - a10.e() - a15.e()) ? 1 : 0);
                                        if (a2 != 0) {
                                            continue Label_0194;
                                        }
                                        if (k != 0) {
                                            a10.b(a - a10.d(), a - a10.e(), a);
                                            this.a.c(a10);
                                            return;
                                        }
                                        ++a18;
                                    }
                                    if (a2 != 0) {
                                        break;
                                    }
                                }
                                ++a12;
                            }
                            break;
                        } while (a2 == 0);
                    }
                    ++a9;
                }
                break;
            } while (a2 == 0);
            a7 = this.a.b();
            a8 = a7.length;
            boolean p = false;
            continue;
        }
    }
    
    public void func_146274_d() throws IOException {
        super.func_146274_d();
        final int b = com.sun.jna.z.a.f.a.a.a.f.a.b ? 1 : 0;
        int a = Mouse.getEventDWheel();
        final int a2 = b;
        int n3 = 0;
        int n6 = 0;
        Label_0057: {
            Label_0054: {
                Label_0041: {
                    int n5 = 0;
                    Label_0039: {
                        Label_0025: {
                            int n;
                            try {
                                final int n2;
                                n = (n2 = (n3 = a));
                                if (a2 != 0) {
                                    break Label_0025;
                                }
                                if (n == 0) {
                                    return;
                                }
                            }
                            catch (IOException ex) {
                                throw ex;
                            }
                            final int n4;
                            int n2 = n4 = (n3 = a);
                            try {
                                n5 = (n6 = 1);
                                if (a2 != 0) {
                                    break Label_0041;
                                }
                                if (n <= n5) {
                                    break Label_0039;
                                }
                            }
                            catch (IOException ex2) {
                                throw ex2;
                            }
                        }
                        a = 1;
                    }
                    int n2;
                    n3 = (n2 = a);
                    final int n7;
                    n6 = (n7 = -1);
                    try {
                        if (a2 != 0) {
                            break Label_0057;
                        }
                        if (n2 >= n5) {
                            break Label_0054;
                        }
                    }
                    catch (IOException ex3) {
                        throw ex3;
                    }
                }
                a = -1;
            }
            n3 = a;
            n6 = 7;
        }
        a = n3 * n6;
    }
    
    public void func_73863_a(final int a, final int a, final float a) {
        final Minecraft a2 = Minecraft.func_71410_x();
        final ScaledResolution a3 = new ScaledResolution(Minecraft.func_71410_x(), Minecraft.func_71410_x().field_71443_c, Minecraft.func_71410_x().field_71440_d);
        this.g = com.sun.jna.z.a.j.e.c.n.d();
        final int a4 = a.b ? 1 : 0;
        this.h = com.sun.jna.z.a.j.e.c.n.e() - 4;
        final float a5 = com.sun.jna.z.a.f.a.a.a.h.a();
        GL11.glPushMatrix();
        GL11.glScalef(a5, a5, a5);
        final Color a6 = new Color(com.sun.jna.z.a.f.a.a.a.h.e.getBlue(), com.sun.jna.z.a.f.a.a.a.h.e.getGreen(), com.sun.jna.z.a.f.a.a.a.h.e.getRed());
        final FontRenderer o = this.o;
        final String[] a7 = com.sun.jna.z.a.f.a.a.a.f.b.q;
        o.func_175063_a(a7[0], 5.0f, (float)(a2.field_71440_d / 2 - 25), a.b(a6));
        final FontRenderer o2 = this.o;
        final StringBuilder sb = new StringBuilder();
        final String s = a7[1];
        if (a4 == 0) {
            sb.append(s).append(com.sun.jna.z.a.i.d.g);
            if (com.sun.jna.z.a.i.d.h) {
                final String s2 = a7[3];
            }
        }
        o2.func_78276_b(sb.append(s).toString(), 5 + this.o.func_78256_a(com.sun.jna.z.a.f.a.a.a.f.b.q[2]), a2.field_71440_d / 2 - 25, -1);
        j j;
        final h h = (h)(j = com.sun.jna.z.a.j.e.c);
        if (a4 == 0) {
            if (h.n.p()) {
                GL11.glEnable(3042);
                GL11.glDisable(2884);
                GL11.glDisable(3553);
                a.a(new Color(10, 10, 10, 200));
                GL11.glBegin(7);
                final int a8 = this.h + 19;
                GL11.glVertex2d((double)this.g, (double)a8);
                GL11.glVertex2d((double)(this.g + this.i), (double)a8);
                GL11.glVertex2d((double)(this.g + this.i), (double)(a8 + this.j));
                GL11.glVertex2d((double)this.g, (double)(a8 + this.j));
                GL11.glEnd();
                GL11.glEnable(3553);
                GL11.glEnable(2884);
                GL11.glDisable(3042);
            }
            this.c.f();
            j = this.a;
        }
        j.d();
        GL11.glPopMatrix();
        super.func_73863_a(a, a, a);
        if (com.sun.jna.z.a.j.g) {
            a.b = (a4 == 0);
        }
    }
    
    static {
        final String[] q2 = new String[5];
        int n = 0;
        String s;
        int n2 = (s = "\u00e6\u00ff3%\u0002\u00c6³\u0005\u00e6\u00ff3%\u008d").length();
        int n3 = 4;
        int n4 = -1;
    Label_0021:
        while (true) {
            while (true) {
                ++n4;
                final String s2 = s;
                final int n5 = n4;
                String s3 = s2.substring(n5, n5 + n3);
                int n6 = -1;
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    int length;
                    int n8;
                    final int n7 = n8 = (length = charArray.length);
                    int n9 = 0;
                    while (true) {
                        Label_0244: {
                            if (n7 > 1) {
                                break Label_0244;
                            }
                            length = (n8 = n9);
                            do {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = '°';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u009e';
                                        break;
                                    }
                                    case 2: {
                                        c2 = 'C';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '@';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '\u00ad';
                                        break;
                                    }
                                    case 5: {
                                        c2 = 'T';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u0093';
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
                            q2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0021;
                            }
                            n2 = (s = "\u0090\u00f164\u00c95\u00e7\u00d5\u00fa\r\u00f3\u00f1.)\u00cet\u00c0\u00d1\u00f00`\u00e0\u0007").length();
                            n3 = 9;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            q2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0021;
                        }
                    }
                    ++n4;
                    final String s4 = s;
                    final int n10 = n4;
                    s3 = s4.substring(n10, n10 + n3);
                    n6 = 0;
                }
            }
            break;
        }
        q = q2;
    }
}
