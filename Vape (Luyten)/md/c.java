package md;

import java.lang.reflect.*;
import com.sun.jna.z.a.e.*;
import com.sun.jna.z.a.f.a.a.a.a.a.*;
import net.minecraft.client.*;
import net.minecraftforge.client.event.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class c extends com.sun.jna.z.a.e.c
{
    Method n;
    Field o;
    boolean p;
    boolean q;
    i r;
    t s;
    t t;
    com.sun.jna.z.a.f.a.a.a.a.i u;
    public static boolean v;
    public static int w;
    public static boolean x;
    public static boolean y;
    public static boolean z;
    public static int A;
    public static boolean B;
    public static boolean C;
    public static int D;
    public static int E;
    public static boolean F;
    public static int G;
    public static boolean H;
    public static int I;
    public static boolean J;
    public static boolean K;
    public static int L;
    public static boolean M;
    public static boolean N;
    public static boolean O;
    private static final String[] P;
    
    public c() {
        final String[] a = c.P;
        super(a[5], com.sun.jna.z.a.e.b.Combat, -62703);
        this.s = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[1], 6.0, 1.0, 20.0, 0.01, com.sun.jna.z.a.f.a.a.a.a.b.INTEGER);
        this.t = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[0], 12.0, 1.0, 20.0, 0.01, com.sun.jna.z.a.f.a.a.a.a.b.INTEGER);
        this.u = new d(a[4]);
        try {
            (this.n = Minecraft.class.getDeclaredMethod(a[2], (Class<?>[])new Class[0])).setAccessible(true);
            (this.o = MouseEvent.class.getDeclaredField(a[3])).setAccessible(true);
        }
        catch (Exception a2) {
            a2.printStackTrace();
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
        //     5: getfield        md/c.p:Z
        //     8: ifeq            459
        //    11: ldc2_w          5
        //    14: invokestatic    java/lang/Thread.sleep:(J)V
        //    17: aload_0         /* a */
        //    18: invokevirtual   md/c.c:()Z
        //    21: iload_1         /* a */
        //    22: ifne            36
        //    25: ifne            32
        //    28: iload_1         /* a */
        //    29: ifeq            4
        //    32: aload_0         /* a */
        //    33: invokevirtual   md/c.e:()Z
        //    36: ifeq            43
        //    39: iload_1         /* a */
        //    40: ifeq            4
        //    43: new             Ljava/util/Random;
        //    46: dup            
        //    47: invokespecial   java/util/Random.<init>:()V
        //    50: astore_2        /* a */
        //    51: aload_0         /* a */
        //    52: getfield        md/c.t:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //    55: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:()D
        //    60: d2i            
        //    61: istore_3        /* a */
        //    62: aload_0         /* a */
        //    63: getfield        md/c.s:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //    66: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:()D
        //    71: d2i            
        //    72: istore          a
        //    74: iload_3         /* a */
        //    75: iload           a
        //    77: iload_1         /* a */
        //    78: ifne            106
        //    81: if_icmpge       103
        //    84: goto            88
        //    87: athrow         
        //    88: aload_0         /* a */
        //    89: getfield        md/c.s:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //    92: iload_3         /* a */
        //    93: i2d            
        //    94: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:(D)V
        //    99: iload_1         /* a */
        //   100: ifeq            4
        //   103: iload_3         /* a */
        //   104: iload           a
        //   106: isub           
        //   107: istore          a
        //   109: iload           a
        //   111: iload_1         /* a */
        //   112: ifne            138
        //   115: ifgt            129
        //   118: goto            122
        //   121: athrow         
        //   122: iload           a
        //   124: goto            140
        //   127: athrow         
        //   128: athrow         
        //   129: aload_2         /* a */
        //   130: iload           a
        //   132: invokevirtual   java/util/Random.nextInt:(I)I
        //   135: iload           a
        //   137: iadd           
        //   138: iconst_1       
        //   139: iadd           
        //   140: istore          a
        //   142: aload_0         /* a */
        //   143: iload_1         /* a */
        //   144: ifne            443
        //   147: getfield        md/c.a:Lnet/minecraft/client/Minecraft;
        //   150: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   153: ifnonnull       438
        //   156: goto            160
        //   159: athrow         
        //   160: sipush          1000
        //   163: iload           a
        //   165: idiv           
        //   166: aload_2         /* a */
        //   167: bipush          20
        //   169: invokevirtual   java/util/Random.nextInt:(I)I
        //   172: iadd           
        //   173: bipush          30
        //   175: isub           
        //   176: i2l            
        //   177: invokestatic    java/lang/Thread.sleep:(J)V
        //   180: iconst_0       
        //   181: invokestatic    org/lwjgl/input/Mouse.isButtonDown:(I)Z
        //   184: iload_1         /* a */
        //   185: ifne            224
        //   188: goto            192
        //   191: athrow         
        //   192: ifne            212
        //   195: goto            199
        //   198: athrow         
        //   199: goto            203
        //   202: athrow         
        //   203: aload_0         /* a */
        //   204: iconst_1       
        //   205: putfield        md/c.q:Z
        //   208: iload_1         /* a */
        //   209: ifeq            4
        //   212: aload_0         /* a */
        //   213: iload_1         /* a */
        //   214: ifne            237
        //   217: getfield        md/c.q:Z
        //   220: goto            224
        //   223: athrow         
        //   224: ifeq            236
        //   227: aload_0         /* a */
        //   228: iconst_0       
        //   229: putfield        md/c.q:Z
        //   232: iload_1         /* a */
        //   233: ifeq            4
        //   236: aload_0         /* a */
        //   237: getfield        md/c.a:Lnet/minecraft/client/Minecraft;
        //   240: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   243: getfield        net/minecraft/client/settings/GameSettings.field_74312_F:Lnet/minecraft/client/settings/KeyBinding;
        //   246: astore          a
        //   248: aload_0         /* a */
        //   249: invokevirtual   md/c.b:()Lnet/minecraft/client/Minecraft;
        //   252: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //   255: getfield        net/minecraft/client/settings/GameSettings.field_74313_G:Lnet/minecraft/client/settings/KeyBinding;
        //   258: astore          a
        //   260: aload           a
        //   262: pop            
        //   263: aload           a
        //   265: invokevirtual   net/minecraft/client/settings/KeyBinding.func_151463_i:()I
        //   268: iconst_1       
        //   269: invokestatic    net/minecraft/client/settings/KeyBinding.func_74510_a:(IZ)V
        //   272: aload           a
        //   274: pop            
        //   275: aload           a
        //   277: invokevirtual   net/minecraft/client/settings/KeyBinding.func_151463_i:()I
        //   280: invokestatic    net/minecraft/client/settings/KeyBinding.func_74507_a:(I)V
        //   283: iconst_1       
        //   284: invokestatic    org/lwjgl/input/Mouse.isButtonDown:(I)Z
        //   287: iload_1         /* a */
        //   288: ifne            365
        //   291: ifeq            349
        //   294: goto            298
        //   297: athrow         
        //   298: aload_0         /* a */
        //   299: getfield        md/c.u:Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //   302: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.a:()Z
        //   307: iload_1         /* a */
        //   308: ifne            365
        //   311: ifeq            349
        //   314: goto            318
        //   317: athrow         
        //   318: goto            322
        //   321: athrow         
        //   322: aload           a
        //   324: pop            
        //   325: aload           a
        //   327: invokevirtual   net/minecraft/client/settings/KeyBinding.func_151463_i:()I
        //   330: iconst_1       
        //   331: invokestatic    net/minecraft/client/settings/KeyBinding.func_74510_a:(IZ)V
        //   334: aload           a
        //   336: pop            
        //   337: aload           a
        //   339: invokevirtual   net/minecraft/client/settings/KeyBinding.func_151463_i:()I
        //   342: invokestatic    net/minecraft/client/settings/KeyBinding.func_74507_a:(I)V
        //   345: goto            349
        //   348: athrow         
        //   349: ldc2_w          10
        //   352: invokestatic    java/lang/Thread.sleep:(J)V
        //   355: aload_0         /* a */
        //   356: invokevirtual   md/c.b:()Lnet/minecraft/client/Minecraft;
        //   359: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   362: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70632_aY:()Z
        //   365: iload_1         /* a */
        //   366: ifne            430
        //   369: ifeq            416
        //   372: goto            376
        //   375: athrow         
        //   376: aload_0         /* a */
        //   377: getfield        md/c.u:Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //   380: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.a:()Z
        //   385: iload_1         /* a */
        //   386: ifne            430
        //   389: ifeq            416
        //   392: goto            396
        //   395: athrow         
        //   396: goto            400
        //   399: athrow         
        //   400: aload           a
        //   402: pop            
        //   403: aload           a
        //   405: invokevirtual   net/minecraft/client/settings/KeyBinding.func_151463_i:()I
        //   408: iconst_0       
        //   409: invokestatic    net/minecraft/client/settings/KeyBinding.func_74510_a:(IZ)V
        //   412: goto            416
        //   415: athrow         
        //   416: ldc2_w          20
        //   419: invokestatic    java/lang/Thread.sleep:(J)V
        //   422: aload           a
        //   424: pop            
        //   425: aload           a
        //   427: invokevirtual   net/minecraft/client/settings/KeyBinding.func_151463_i:()I
        //   430: iconst_0       
        //   431: invokestatic    net/minecraft/client/settings/KeyBinding.func_74510_a:(IZ)V
        //   434: iload_1         /* a */
        //   435: ifeq            447
        //   438: aload_0         /* a */
        //   439: goto            443
        //   442: athrow         
        //   443: iconst_1       
        //   444: putfield        md/c.q:Z
        //   447: goto            4
        //   450: astore_2        /* a */
        //   451: aload_2         /* a */
        //   452: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   455: iload_1         /* a */
        //   456: ifeq            4
        //   459: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  11     28     450    459    Ljava/lang/Exception;
        //  32     39     450    459    Ljava/lang/Exception;
        //  74     84     87     88     Ljava/lang/Exception;
        //  43     99     450    459    Ljava/lang/Exception;
        //  160    195    198    199    Ljava/lang/Exception;
        //  147    188    191    192    Ljava/lang/Exception;
        //  142    156    159    160    Ljava/lang/Exception;
        //  115    127    127    128    Ljava/lang/Exception;
        //  109    118    121    122    Ljava/lang/Exception;
        //  142    199    202    203    Ljava/lang/Exception;
        //  109    128    128    129    Ljava/lang/Exception;
        //  103    208    450    459    Ljava/lang/Exception;
        //  212    220    223    224    Ljava/lang/Exception;
        //  212    232    450    459    Ljava/lang/Exception;
        //  376    392    395    396    Ljava/lang/Exception;
        //  298    314    317    318    Ljava/lang/Exception;
        //  260    294    297    298    Ljava/lang/Exception;
        //  376    412    415    416    Ljava/lang/Exception;
        //  365    372    375    376    Ljava/lang/Exception;
        //  349    396    399    400    Ljava/lang/Exception;
        //  298    345    348    349    Ljava/lang/Exception;
        //  260    318    321    322    Ljava/lang/Exception;
        //  430    439    442    443    Ljava/lang/Exception;
        //  236    447    450    459    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0160:
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
    
    @Override
    public void e() {
        final int o = c.O ? 1 : 0;
        this.p = true;
        final int a = o;
        final i r = this.r;
        if (a == 0) {
            if (r != null) {
                return;
            }
            this.r = new i(this);
            final i r2 = this.r;
        }
        r.a();
    }
    
    @Override
    public void f() {
    }
    
    @Override
    public void g() {
        this.p = false;
        final int a = c.O ? 1 : 0;
        c c = this;
        if (a == 0) {
            if (this.r != null) {
                this.r.a = null;
            }
            c = this;
        }
        c.r = null;
        if (md.c.v) {
            md.c.O = (a == 0);
        }
    }
    
    @Override
    public k[] k() {
        final int a = c.O ? 1 : 0;
        final k[] array = { this.u, this.t, this.s };
        if (a != 0) {
            c.v = !c.v;
        }
        return array;
    }
    
    static {
        final String[] p = new String[6];
        int n = 0;
        String s;
        int n2 = (s = "T\u00cb\u001ac\u00ec\u00e4\u00d4\u0007T\u00cb\u001ac\u00ec\u00ec\u00c2\u000eq\u00ee' \u00fe´\u0098 ªxu\u00fe\u00e4\u00ca\u0006u\u00ee=7\u00ce\u00eb").length();
        int n3 = 7;
        int n4 = -1;
    Label_0023:
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
                        Label_0248: {
                            if (n7 > 1) {
                                break Label_0248;
                            }
                            length = (n8 = n9);
                            do {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = '\u0017';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u009b';
                                        break;
                                    }
                                    case 2: {
                                        c2 = 'I';
                                        break;
                                    }
                                    case 3: {
                                        c2 = 'C';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '¡';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '\u0085';
                                        break;
                                    }
                                    default: {
                                        c2 = '¬';
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
                            p[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0023;
                            }
                            n2 = (s = "U\u00f7& \u00ca\u00ed\u00c5c\u000bV\u00ee=,\u00e2\u00e9\u00c5t\u00f0,1").length();
                            n3 = 8;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            p[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0023;
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
        P = p;
    }
}
