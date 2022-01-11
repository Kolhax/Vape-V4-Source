package md;

import com.sun.jna.z.a.e.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.entity.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class m extends c
{
    t n;
    t o;
    c p;
    boolean q;
    i r;
    boolean s;
    public static boolean t;
    public static int u;
    public static boolean v;
    public static boolean w;
    public static boolean x;
    public static int y;
    public static boolean z;
    public static boolean A;
    public static int B;
    public static int C;
    public static boolean D;
    public static int E;
    public static boolean F;
    public static int G;
    public static boolean H;
    public static boolean I;
    public static int J;
    public static boolean K;
    public static boolean L;
    public static boolean M;
    private static final String[] N;
    
    public m() {
        final int m = md.m.M ? 1 : 0;
        final String[] a = md.m.N;
        super(a[1], com.sun.jna.z.a.e.b.Combat, -256);
        final int a2 = m;
        this.n = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[2], 3.3, 0.1, 5.0, 0.01, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);
        this.o = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[0], 0.5, 0.1, 1.0, 0.01, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);
        if (a2 != 0) {
            md.m.t = !md.m.t;
        }
    }
    
    @Override
    public void a(final TickEvent$PlayerTickEvent a) {
        final int a2 = m.M ? 1 : 0;
        m m = this;
        if (a2 == 0) {
            if (!this.q) {
                return;
            }
            this.c().func_70031_b(false);
            m = this;
        }
        m.q = false;
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
        //     5: getfield        md/m.s:Z
        //     8: ifeq            568
        //    11: ldc2_w          10
        //    14: invokestatic    java/lang/Thread.sleep:(J)V
        //    17: aload_0         /* a */
        //    18: iload_1         /* a */
        //    19: ifne            44
        //    22: invokevirtual   md/m.c:()Z
        //    25: ifeq            556
        //    28: goto            32
        //    31: athrow         
        //    32: aload_0         /* a */
        //    33: iload_1         /* a */
        //    34: ifne            93
        //    37: getfield        md/m.p:Lcom/sun/jna/z/a/e/c;
        //    40: goto            44
        //    43: athrow         
        //    44: ifnonnull       92
        //    47: goto            51
        //    50: athrow         
        //    51: aload_0         /* a */
        //    52: getstatic       com/sun/jna/z/a/i.d:Lcom/sun/jna/z/a/i;
        //    55: getfield        com/sun/jna/z/a/i.a:Lcom/sun/jna/z/a/e/g;
        //    58: getstatic       md/m.N:[Ljava/lang/String;
        //    61: iconst_3       
        //    62: aaload         
        //    63: invokevirtual   com/sun/jna/z/a/e/g.a:(Ljava/lang/String;)Lcom/sun/jna/z/a/e/c;
        //    66: putfield        md/m.p:Lcom/sun/jna/z/a/e/c;
        //    69: aload_0         /* a */
        //    70: iload_1         /* a */
        //    71: ifne            93
        //    74: getfield        md/m.p:Lcom/sun/jna/z/a/e/c;
        //    77: ifnonnull       92
        //    80: goto            84
        //    83: athrow         
        //    84: goto            88
        //    87: athrow         
        //    88: iload_1         /* a */
        //    89: ifeq            4
        //    92: aload_0         /* a */
        //    93: invokevirtual   md/m.b:()Lnet/minecraft/client/Minecraft;
        //    96: iload_1         /* a */
        //    97: ifne            126
        //   100: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   103: ifnonnull       141
        //   106: goto            110
        //   109: athrow         
        //   110: aload_0         /* a */
        //   111: iload_1         /* a */
        //   112: ifne            146
        //   115: goto            119
        //   118: athrow         
        //   119: invokevirtual   md/m.b:()Lnet/minecraft/client/Minecraft;
        //   122: goto            126
        //   125: athrow         
        //   126: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   129: getfield        net/minecraft/client/settings/GameSettings.field_74368_y:Lnet/minecraft/client/settings/KeyBinding;
        //   132: invokevirtual   net/minecraft/client/settings/KeyBinding.func_151463_i:()I
        //   135: invokestatic    org/lwjgl/input/Keyboard.isKeyDown:(I)Z
        //   138: ifeq            145
        //   141: iload_1         /* a */
        //   142: ifeq            4
        //   145: aload_0         /* a */
        //   146: getfield        md/m.n:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //   149: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:()D
        //   154: dstore_2        /* a */
        //   155: aload_0         /* a */
        //   156: getfield        md/m.o:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //   159: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:()D
        //   164: ldc2_w          5.0
        //   167: ddiv           
        //   168: dstore          a
        //   170: dload           a
        //   172: ldc2_w          0.1
        //   175: dmul           
        //   176: dstore          a
        //   178: aload_0         /* a */
        //   179: getfield        md/m.p:Lcom/sun/jna/z/a/e/c;
        //   182: checkcast       Lmd/b;
        //   185: astore          a
        //   187: aload_0         /* a */
        //   188: getfield        md/m.p:Lcom/sun/jna/z/a/e/c;
        //   191: invokevirtual   com/sun/jna/z/a/e/c.c:()Z
        //   194: ifeq            214
        //   197: aload           a
        //   199: invokevirtual   md/b.n:()Lnet/minecraft/entity/Entity;
        //   202: ifnull          214
        //   205: goto            209
        //   208: athrow         
        //   209: iconst_1       
        //   210: goto            215
        //   213: athrow         
        //   214: iconst_0       
        //   215: istore          a
        //   217: aload           a
        //   219: invokevirtual   md/b.n:()Lnet/minecraft/entity/Entity;
        //   222: checkcast       Lnet/minecraft/entity/EntityLivingBase;
        //   225: astore          a
        //   227: aload           a
        //   229: ifnonnull       236
        //   232: iload_1         /* a */
        //   233: ifeq            4
        //   236: aload_0         /* a */
        //   237: aload           a
        //   239: invokevirtual   md/m.b:(Lnet/minecraft/entity/EntityLivingBase;)Z
        //   242: istore          a
        //   244: iload           a
        //   246: iload_1         /* a */
        //   247: ifne            259
        //   250: ifeq            556
        //   253: goto            257
        //   256: athrow         
        //   257: iload           a
        //   259: ifeq            556
        //   262: goto            266
        //   265: athrow         
        //   266: aload_0         /* a */
        //   267: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   270: aload           a
        //   272: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70032_d:(Lnet/minecraft/entity/Entity;)F
        //   275: f2d            
        //   276: dstore          a
        //   278: dload           a
        //   280: dload_2         /* a */
        //   281: dcmpg          
        //   282: iload_1         /* a */
        //   283: ifne            300
        //   286: ifge            556
        //   289: goto            293
        //   292: athrow         
        //   293: aload_0         /* a */
        //   294: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   297: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70090_H:()Z
        //   300: ifne            556
        //   303: goto            307
        //   306: athrow         
        //   307: aload_0         /* a */
        //   308: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   311: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70123_F:Z
        //   314: ifne            556
        //   317: goto            321
        //   320: athrow         
        //   321: aload_0         /* a */
        //   322: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   325: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70617_f_:()Z
        //   328: ifne            556
        //   331: goto            335
        //   334: athrow         
        //   335: aload_0         /* a */
        //   336: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   339: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70122_E:Z
        //   342: ifeq            556
        //   345: goto            349
        //   348: athrow         
        //   349: aload_0         /* a */
        //   350: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   353: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70632_aY:()Z
        //   356: ifne            556
        //   359: goto            363
        //   362: athrow         
        //   363: aload           a
        //   365: getfield        net/minecraft/entity/EntityLivingBase.field_70165_t:D
        //   368: dstore          a
        //   370: aload           a
        //   372: getfield        net/minecraft/entity/EntityLivingBase.field_70161_v:D
        //   375: dstore          a
        //   377: aload_0         /* a */
        //   378: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   381: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   384: dload           a
        //   386: dsub           
        //   387: ldc2_w          0.5
        //   390: dcmpl          
        //   391: iload_1         /* a */
        //   392: ifne            434
        //   395: ifle            420
        //   398: goto            402
        //   401: athrow         
        //   402: aload_0         /* a */
        //   403: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   406: dup            
        //   407: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70159_w:D
        //   410: dload           a
        //   412: dadd           
        //   413: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70159_w:D
        //   416: goto            420
        //   419: athrow         
        //   420: aload_0         /* a */
        //   421: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   424: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   427: dload           a
        //   429: dsub           
        //   430: ldc2_w          0.5
        //   433: dcmpg          
        //   434: iload_1         /* a */
        //   435: ifne            478
        //   438: ifge            464
        //   441: goto            445
        //   444: athrow         
        //   445: aload_0         /* a */
        //   446: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   449: dup            
        //   450: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70159_w:D
        //   453: dload           a
        //   455: dneg           
        //   456: dadd           
        //   457: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70159_w:D
        //   460: goto            464
        //   463: athrow         
        //   464: aload_0         /* a */
        //   465: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   468: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   471: dload           a
        //   473: dsub           
        //   474: ldc2_w          0.5
        //   477: dcmpl          
        //   478: iload_1         /* a */
        //   479: ifne            529
        //   482: ifle            507
        //   485: goto            489
        //   488: athrow         
        //   489: aload_0         /* a */
        //   490: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   493: dup            
        //   494: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70179_y:D
        //   497: dload           a
        //   499: dadd           
        //   500: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70179_y:D
        //   503: goto            507
        //   506: athrow         
        //   507: aload_0         /* a */
        //   508: iload_1         /* a */
        //   509: ifne            552
        //   512: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   515: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   518: dload           a
        //   520: dsub           
        //   521: ldc2_w          0.5
        //   524: dcmpg          
        //   525: goto            529
        //   528: athrow         
        //   529: ifge            551
        //   532: aload_0         /* a */
        //   533: invokevirtual   md/m.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   536: dup            
        //   537: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70179_y:D
        //   540: dload           a
        //   542: dneg           
        //   543: dadd           
        //   544: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70179_y:D
        //   547: goto            551
        //   550: athrow         
        //   551: aload_0         /* a */
        //   552: iconst_1       
        //   553: putfield        md/m.q:Z
        //   556: goto            4
        //   559: astore_2        /* a */
        //   560: aload_2         /* a */
        //   561: invokevirtual   java/lang/InterruptedException.printStackTrace:()V
        //   564: iload_1         /* a */
        //   565: ifeq            4
        //   568: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  51     80     83     84     Ljava/lang/InterruptedException;
        //  32     40     43     44     Ljava/lang/InterruptedException;
        //  11     28     31     32     Ljava/lang/InterruptedException;
        //  32     84     87     88     Ljava/lang/InterruptedException;
        //  11     47     50     51     Ljava/lang/InterruptedException;
        //  11     88     559    568    Ljava/lang/InterruptedException;
        //  110    122    125    126    Ljava/lang/InterruptedException;
        //  100    115    118    119    Ljava/lang/InterruptedException;
        //  93     106    109    110    Ljava/lang/InterruptedException;
        //  92     141    559    568    Ljava/lang/InterruptedException;
        //  197    213    213    214    Ljava/lang/InterruptedException;
        //  187    205    208    209    Ljava/lang/InterruptedException;
        //  145    232    559    568    Ljava/lang/InterruptedException;
        //  507    525    528    529    Ljava/lang/InterruptedException;
        //  244    253    256    257    Ljava/lang/InterruptedException;
        //  507    547    550    551    Ljava/lang/InterruptedException;
        //  478    485    488    489    Ljava/lang/InterruptedException;
        //  464    503    506    507    Ljava/lang/InterruptedException;
        //  434    441    444    445    Ljava/lang/InterruptedException;
        //  420    460    463    464    Ljava/lang/InterruptedException;
        //  377    398    401    402    Ljava/lang/InterruptedException;
        //  377    416    419    420    Ljava/lang/InterruptedException;
        //  335    359    362    363    Ljava/lang/InterruptedException;
        //  321    345    348    349    Ljava/lang/InterruptedException;
        //  307    331    334    335    Ljava/lang/InterruptedException;
        //  293    317    320    321    Ljava/lang/InterruptedException;
        //  278    289    292    293    Ljava/lang/InterruptedException;
        //  278    303    306    307    Ljava/lang/InterruptedException;
        //  244    262    265    266    Ljava/lang/InterruptedException;
        //  236    556    559    568    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
    
    public boolean b(final EntityLivingBase a) {
        final int a2 = m.M ? 1 : 0;
        float n;
        final boolean b = (n = (a.field_70128_L ? 1 : 0)) != 0.0f;
        Label_0065: {
            if (a2 == 0) {
                if (!b) {
                    final boolean b2 = (n = (a.func_145748_c_().equals("") ? 1 : 0)) != 0.0f;
                    if (a2 != 0) {
                        break Label_0065;
                    }
                    if (!b2) {
                        final float n2 = n = fcmpl(this.c().func_70032_d((Entity)a), 5.0f);
                        if (a2 != 0) {
                            break Label_0065;
                        }
                        if (n2 <= 0) {
                            final boolean b3 = (n = (this.c().func_70685_l((Entity)a) ? 1 : 0)) != 0.0f;
                            if (a2 != 0) {
                                break Label_0065;
                            }
                            if (b3) {
                                n = (false ? 1 : 0);
                                break Label_0065;
                            }
                        }
                    }
                }
                n = (true ? 1 : 0);
            }
        }
        final boolean a3 = n != 0.0f;
        int a5;
        final boolean b4 = (a5 = (a3 ? 1 : 0)) != 0;
        if (a2 == 0) {
            if (b4) {
                return false;
            }
            a5 = this.a(a, (EntityLivingBase)this.c());
        }
        final int a4 = a5;
        final double n3 = dcmpg((double)a4, 60.0);
        if (a2 == 0 && n3 < 0) {
            return true;
        }
        if (m.t) {
            m.M = (a2 == 0);
        }
        return n3 != 0.0;
    }
    
    @Override
    public void e() {
        final int a = m.M ? 1 : 0;
        final i r = this.r;
        if (a == 0) {
            if (r != null) {
                return;
            }
            this.r = new i(this);
            final i r2 = this.r;
        }
        r.a();
        this.s = true;
    }
    
    @Override
    public void g() {
        this.s = false;
    }
    
    @Override
    public k[] k() {
        return new k[] { this.n, this.o };
    }
    
    static {
        final String[] n = new String[4];
        int n2 = 0;
        String s;
        int n3 = (s = "e].\u00f6\u008b\u0006eY9\u00f2\u0089\u00c7").length();
        int n4 = 5;
        int n5 = -1;
    Label_0021:
        while (true) {
            while (true) {
                ++n5;
                final String s2 = s;
                final int n6 = n5;
                String s3 = s2.substring(n6, n6 + n4);
                int n7 = -1;
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    int length;
                    int n9;
                    final int n8 = n9 = (length = charArray.length);
                    int n10 = 0;
                    while (true) {
                        Label_0244: {
                            if (n8 > 1) {
                                break Label_0244;
                            }
                            length = (n9 = n10);
                            do {
                                final char c = charArray[n9];
                                char c2 = '\0';
                                switch (n10 % 7) {
                                    case 0: {
                                        c2 = '6';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '-';
                                        break;
                                    }
                                    case 2: {
                                        c2 = 'K';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\u0093';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '\u00ef';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '¢';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u00e9';
                                        break;
                                    }
                                }
                                charArray[length] = (char)(c ^ c2);
                                ++n10;
                            } while (n8 == 0);
                        }
                        if (n8 > n10) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n7) {
                        default: {
                            n[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                continue Label_0021;
                            }
                            n3 = (s = "dL%\u00f4\u008a\twD&\u00d2\u009c\u00d1\u0080EY").length();
                            n4 = 5;
                            n5 = -1;
                            break;
                        }
                        case 0: {
                            n[n2++] = intern;
                            if ((n5 += n4) < n3) {
                                n4 = s.charAt(n5);
                                break;
                            }
                            break Label_0021;
                        }
                    }
                    ++n5;
                    final String s4 = s;
                    final int n11 = n5;
                    s3 = s4.substring(n11, n11 + n4);
                    n7 = 0;
                }
            }
            break;
        }
        N = n;
    }
}
