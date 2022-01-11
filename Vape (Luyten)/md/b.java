package md;

import com.sun.jna.z.a.e.*;
import com.sun.jna.z.a.f.a.a.a.a.a.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import java.util.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class b extends c
{
    i n;
    boolean o;
    EntityLivingBase p;
    t q;
    t r;
    com.sun.jna.z.a.f.a.a.a.a.i s;
    com.sun.jna.z.a.f.a.a.a.a.i t;
    com.sun.jna.z.a.f.a.a.a.a.i u;
    t v;
    private float w;
    private float x;
    private MouseFilter y;
    double z;
    double A;
    double B;
    double C;
    double D;
    double E;
    double F;
    public static boolean G;
    public static int H;
    public static boolean I;
    public static boolean J;
    public static boolean K;
    public static int L;
    public static boolean M;
    public static boolean N;
    public static int O;
    public static int P;
    public static boolean Q;
    public static int R;
    public static boolean S;
    public static int T;
    public static boolean U;
    public static boolean V;
    public static int W;
    public static boolean X;
    public static boolean Y;
    public static boolean Z;
    private static final String[] aa;
    
    public b() {
        final String[] a = b.aa;
        super(a[4], com.sun.jna.z.a.e.b.Combat, -327674);
        this.q = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[6], 3.0, 1.0, 5.0, 0.01, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);
        this.r = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[0], 4.2, 0.0, 8.0, 0.01, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);
        this.s = new d(a[3]);
        this.t = new d(a[5]);
        final int z = b.Z ? 1 : 0;
        this.u = new d(a[2]);
        final int a2 = z;
        this.v = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[1], 180.0, 0.0, 360.0, 1.0, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);
        this.y = new MouseFilter();
        if (b.G) {
            b.Z = (a2 == 0);
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
        //     5: getfield        md/b.o:Z
        //     8: ifeq            462
        //    11: lconst_1       
        //    12: invokestatic    java/lang/Thread.sleep:(J)V
        //    15: aload_0         /* a */
        //    16: invokevirtual   md/b.c:()Z
        //    19: iload_1         /* a */
        //    20: ifne            34
        //    23: ifne            30
        //    26: iload_1         /* a */
        //    27: ifeq            4
        //    30: aload_0         /* a */
        //    31: invokevirtual   md/b.e:()Z
        //    34: iload_1         /* a */
        //    35: ifne            66
        //    38: ifeq            49
        //    41: goto            45
        //    44: athrow         
        //    45: iload_1         /* a */
        //    46: ifeq            4
        //    49: aload_0         /* a */
        //    50: iload_1         /* a */
        //    51: ifne            94
        //    54: getfield        md/b.t:Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //    57: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.a:()Z
        //    62: goto            66
        //    65: athrow         
        //    66: ifeq            93
        //    69: iconst_0       
        //    70: invokestatic    org/lwjgl/input/Mouse.isButtonDown:(I)Z
        //    73: ifne            93
        //    76: goto            80
        //    79: athrow         
        //    80: goto            84
        //    83: athrow         
        //    84: aload_0         /* a */
        //    85: aconst_null    
        //    86: putfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //    89: iload_1         /* a */
        //    90: ifeq            4
        //    93: aload_0         /* a */
        //    94: iload_1         /* a */
        //    95: ifne            178
        //    98: getfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //   101: ifnull          177
        //   104: goto            108
        //   107: athrow         
        //   108: aload_0         /* a */
        //   109: iload_1         /* a */
        //   110: ifne            169
        //   113: aload_0         /* a */
        //   114: getfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //   117: invokevirtual   md/b.a:(Lnet/minecraft/entity/Entity;)Z
        //   120: ifne            168
        //   123: goto            127
        //   126: athrow         
        //   127: goto            131
        //   130: athrow         
        //   131: aload_0         /* a */
        //   132: invokevirtual   md/b.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   135: aload_0         /* a */
        //   136: getfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //   139: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70032_d:(Lnet/minecraft/entity/Entity;)F
        //   142: f2d            
        //   143: aload_0         /* a */
        //   144: getfield        md/b.r:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //   147: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:()D
        //   152: dcmpl          
        //   153: iload_1         /* a */
        //   154: ifne            186
        //   157: ifle            177
        //   160: goto            164
        //   163: athrow         
        //   164: goto            168
        //   167: athrow         
        //   168: aload_0         /* a */
        //   169: aconst_null    
        //   170: putfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //   173: goto            177
        //   176: athrow         
        //   177: aload_0         /* a */
        //   178: getfield        md/b.t:Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //   181: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.a:()Z
        //   186: iload_1         /* a */
        //   187: ifne            252
        //   190: ifeq            235
        //   193: goto            197
        //   196: athrow         
        //   197: iconst_0       
        //   198: invokestatic    org/lwjgl/input/Mouse.isButtonDown:(I)Z
        //   201: iload_1         /* a */
        //   202: ifne            252
        //   205: ifeq            235
        //   208: goto            212
        //   211: athrow         
        //   212: goto            216
        //   215: athrow         
        //   216: aload_0         /* a */
        //   217: iload_1         /* a */
        //   218: ifne            260
        //   221: getfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //   224: ifnull          259
        //   227: goto            231
        //   230: athrow         
        //   231: goto            235
        //   234: athrow         
        //   235: aload_0         /* a */
        //   236: iload_1         /* a */
        //   237: ifne            275
        //   240: getfield        md/b.t:Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //   243: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.a:()Z
        //   248: goto            252
        //   251: athrow         
        //   252: ifne            274
        //   255: goto            259
        //   258: athrow         
        //   259: aload_0         /* a */
        //   260: aload_0         /* a */
        //   261: invokevirtual   md/b.m:()Lnet/minecraft/entity/Entity;
        //   264: checkcast       Lnet/minecraft/entity/EntityLivingBase;
        //   267: putfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //   270: goto            274
        //   273: athrow         
        //   274: aload_0         /* a */
        //   275: iload_1         /* a */
        //   276: ifne            444
        //   279: getfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //   282: ifnull          439
        //   285: goto            289
        //   288: athrow         
        //   289: aload_0         /* a */
        //   290: iload_1         /* a */
        //   291: ifne            444
        //   294: invokevirtual   md/b.b:()Lnet/minecraft/client/Minecraft;
        //   297: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   300: ifnonnull       439
        //   303: goto            307
        //   306: athrow         
        //   307: goto            311
        //   310: athrow         
        //   311: aload_0         /* a */
        //   312: iload_1         /* a */
        //   313: ifne            444
        //   316: aload_0         /* a */
        //   317: getfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //   320: invokevirtual   md/b.a:(Lnet/minecraft/entity/EntityLivingBase;)Z
        //   323: ifne            439
        //   326: goto            330
        //   329: athrow         
        //   330: goto            334
        //   333: athrow         
        //   334: aload_0         /* a */
        //   335: getfield        md/b.q:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //   338: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:()D
        //   343: dstore_2        /* a */
        //   344: aload_0         /* a */
        //   345: iload_1         /* a */
        //   346: ifne            414
        //   349: getfield        md/b.a:Lnet/minecraft/client/Minecraft;
        //   352: getfield        net/minecraft/client/Minecraft.field_71476_x:Lnet/minecraft/util/MovingObjectPosition;
        //   355: ifnull          413
        //   358: goto            362
        //   361: athrow         
        //   362: aload_0         /* a */
        //   363: getfield        md/b.a:Lnet/minecraft/client/Minecraft;
        //   366: getfield        net/minecraft/client/Minecraft.field_71476_x:Lnet/minecraft/util/MovingObjectPosition;
        //   369: getfield        net/minecraft/util/MovingObjectPosition.field_72308_g:Lnet/minecraft/entity/Entity;
        //   372: astore          a
        //   374: iload_1         /* a */
        //   375: ifne            435
        //   378: aload           a
        //   380: ifnull          413
        //   383: goto            387
        //   386: athrow         
        //   387: aload           a
        //   389: aload_0         /* a */
        //   390: getfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //   393: invokevirtual   net/minecraft/entity/Entity.equals:(Ljava/lang/Object;)Z
        //   396: ifeq            413
        //   399: goto            403
        //   402: athrow         
        //   403: goto            407
        //   406: athrow         
        //   407: dload_2         /* a */
        //   408: ldc2_w          0.5
        //   411: dmul           
        //   412: dstore_2        /* a */
        //   413: aload_0         /* a */
        //   414: aload_0         /* a */
        //   415: getfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //   418: dload_2         /* a */
        //   419: ldc2_w          7.0
        //   422: ddiv           
        //   423: aload_0         /* a */
        //   424: getfield        md/b.s:Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //   427: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.a:()Z
        //   432: invokevirtual   md/b.a:(Lnet/minecraft/entity/Entity;DZ)V
        //   435: iload_1         /* a */
        //   436: ifeq            454
        //   439: aload_0         /* a */
        //   440: goto            444
        //   443: athrow         
        //   444: new             Lnet/minecraft/util/MouseFilter;
        //   447: dup            
        //   448: invokespecial   net/minecraft/util/MouseFilter.<init>:()V
        //   451: putfield        md/b.y:Lnet/minecraft/util/MouseFilter;
        //   454: goto            4
        //   457: astore_2       
        //   458: iload_1         /* a */
        //   459: ifeq            4
        //   462: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  11     26     457    462    Ljava/lang/Exception;
        //  34     41     44     45     Ljava/lang/Exception;
        //  30     45     457    462    Ljava/lang/Exception;
        //  66     76     79     80     Ljava/lang/Exception;
        //  49     62     65     66     Ljava/lang/Exception;
        //  49     80     83     84     Ljava/lang/Exception;
        //  49     89     457    462    Ljava/lang/Exception;
        //  378    399    402    403    Ljava/lang/Exception;
        //  374    383    386    387    Ljava/lang/Exception;
        //  108    123    126    127    Ljava/lang/Exception;
        //  94     104    107    108    Ljava/lang/Exception;
        //  374    403    406    407    Ljava/lang/Exception;
        //  311    326    329    330    Ljava/lang/Exception;
        //  289    303    306    307    Ljava/lang/Exception;
        //  289    330    333    334    Ljava/lang/Exception;
        //  275    285    288    289    Ljava/lang/Exception;
        //  274    307    310    311    Ljava/lang/Exception;
        //  235    248    251    252    Ljava/lang/Exception;
        //  235    270    273    274    Ljava/lang/Exception;
        //  216    227    230    231    Ljava/lang/Exception;
        //  216    255    258    259    Ljava/lang/Exception;
        //  197    208    211    212    Ljava/lang/Exception;
        //  197    231    234    235    Ljava/lang/Exception;
        //  186    193    196    197    Ljava/lang/Exception;
        //  177    212    215    216    Ljava/lang/Exception;
        //  131    160    163    164    Ljava/lang/Exception;
        //  131    173    176    177    Ljava/lang/Exception;
        //  108    164    167    168    Ljava/lang/Exception;
        //  93     127    130    131    Ljava/lang/Exception;
        //  435    440    443    444    Ljava/lang/Exception;
        //  344    358    361    362    Ljava/lang/Exception;
        //  93     454    457    462    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0108:
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
    
    public void a(final Entity a, final double a, final boolean a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0         /* a */
        //     2: getfield        md/b.z:D
        //     5: putfield        md/b.B:D
        //     8: aload_0         /* a */
        //     9: aload_0         /* a */
        //    10: getfield        md/b.A:D
        //    13: putfield        md/b.C:D
        //    16: aload_0         /* a */
        //    17: aload_1         /* a */
        //    18: getfield        net/minecraft/entity/Entity.field_70142_S:D
        //    21: putfield        md/b.z:D
        //    24: aload_0         /* a */
        //    25: aload_1         /* a */
        //    26: getfield        net/minecraft/entity/Entity.field_70136_U:D
        //    29: putfield        md/b.A:D
        //    32: aload_1         /* a */
        //    33: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //    36: aload_0         /* a */
        //    37: getfield        md/b.z:D
        //    40: dsub           
        //    41: dstore          a
        //    43: getstatic       md/b.Z:Z
        //    46: aload_1         /* a */
        //    47: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //    50: aload_0         /* a */
        //    51: getfield        md/b.A:D
        //    54: dsub           
        //    55: dstore          8
        //    57: istore          a
        //    59: dload           a
        //    61: dconst_0       
        //    62: iload           a
        //    64: ifne            102
        //    67: dcmpl          
        //    68: ifeq            83
        //    71: dload           a
        //    73: dconst_0       
        //    74: iload           a
        //    76: ifne            126
        //    79: dcmpl          
        //    80: ifne            105
        //    83: aload_1         /* a */
        //    84: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //    87: aload_0         /* a */
        //    88: getfield        md/b.B:D
        //    91: dsub           
        //    92: dstore          a
        //    94: aload_1         /* a */
        //    95: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //    98: aload_0         /* a */
        //    99: getfield        md/b.C:D
        //   102: dsub           
        //   103: dstore          a
        //   105: aload_1         /* a */
        //   106: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //   109: dload           a
        //   111: ldc2_w          2.0
        //   114: dmul           
        //   115: dadd           
        //   116: aload_0         /* a */
        //   117: invokevirtual   md/b.b:()Lnet/minecraft/client/Minecraft;
        //   120: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   123: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   126: dsub           
        //   127: dstore          a
        //   129: aload_1         /* a */
        //   130: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //   133: aload_0         /* a */
        //   134: invokevirtual   md/b.b:()Lnet/minecraft/client/Minecraft;
        //   137: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   140: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   143: dsub           
        //   144: aload_1         /* a */
        //   145: getfield        net/minecraft/entity/Entity.field_70131_O:F
        //   148: fconst_2       
        //   149: fdiv           
        //   150: f2d            
        //   151: dadd           
        //   152: ldc2_w          0.2
        //   155: dadd           
        //   156: dstore          a
        //   158: aload_1         /* a */
        //   159: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   162: dload           a
        //   164: ldc2_w          2.0
        //   167: dmul           
        //   168: dadd           
        //   169: aload_0         /* a */
        //   170: invokevirtual   md/b.b:()Lnet/minecraft/client/Minecraft;
        //   173: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   176: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   179: dsub           
        //   180: dstore          a
        //   182: dload           a
        //   184: dload           a
        //   186: dmul           
        //   187: dload           a
        //   189: dload           a
        //   191: dmul           
        //   192: dadd           
        //   193: invokestatic    net/minecraft/util/MathHelper.func_76133_a:(D)F
        //   196: f2d            
        //   197: dstore          a
        //   199: aload_1         /* a */
        //   200: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //   203: dload           a
        //   205: ldc2_w          2.0
        //   208: dmul           
        //   209: dadd           
        //   210: aload_0         /* a */
        //   211: invokevirtual   md/b.b:()Lnet/minecraft/client/Minecraft;
        //   214: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   217: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   220: dsub           
        //   221: dstore          a
        //   223: aload_1         /* a */
        //   224: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //   227: dload           a
        //   229: ldc2_w          2.0
        //   232: dmul           
        //   233: dadd           
        //   234: aload_0         /* a */
        //   235: invokevirtual   md/b.b:()Lnet/minecraft/client/Minecraft;
        //   238: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   241: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   244: dsub           
        //   245: dstore          a
        //   247: dload           a
        //   249: dload           a
        //   251: invokestatic    java/lang/Math.atan2:(DD)D
        //   254: ldc2_w          180.0
        //   257: dmul           
        //   258: ldc2_w          3.141592653589793
        //   261: ddiv           
        //   262: dneg           
        //   263: d2f            
        //   264: fstore          a
        //   266: aload_0         /* a */
        //   267: aload_0         /* a */
        //   268: getfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //   271: invokespecial   md/b.f:(Lnet/minecraft/entity/Entity;)I
        //   274: istore          a
        //   276: aload_0         /* a */
        //   277: getfield        md/b.t:Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //   280: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.a:()Z
        //   285: iload           a
        //   287: ifne            321
        //   290: ifne            319
        //   293: iload           a
        //   295: i2d            
        //   296: aload_0         /* a */
        //   297: getfield        md/b.v:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //   300: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:()D
        //   305: ldc2_w          2.0
        //   308: ddiv           
        //   309: dcmpl          
        //   310: iload           a
        //   312: ifne            321
        //   315: ifle            319
        //   318: return         
        //   319: iload           a
        //   321: iload           a
        //   323: ifne            418
        //   326: ifeq            395
        //   329: aload_0         /* a */
        //   330: aload_0         /* a */
        //   331: getfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //   334: invokespecial   md/b.g:(Lnet/minecraft/entity/Entity;)I
        //   337: iload           a
        //   339: ifne            418
        //   342: iconst_5       
        //   343: if_icmple       395
        //   346: aload_0         /* a */
        //   347: invokevirtual   md/b.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   350: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   353: fstore          a
        //   355: aload_0         /* a */
        //   356: aload_0         /* a */
        //   357: invokevirtual   md/b.b:()Lnet/minecraft/client/Minecraft;
        //   360: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   363: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   366: fload           a
        //   368: dload_2         /* a */
        //   369: d2f            
        //   370: ldc             15.0
        //   372: fdiv           
        //   373: invokevirtual   md/b.a:(FFF)F
        //   376: fload           a
        //   378: fsub           
        //   379: fstore          a
        //   381: aload_0         /* a */
        //   382: invokevirtual   md/b.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   385: dup            
        //   386: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   389: fload           a
        //   391: fadd           
        //   392: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   395: aload_0         /* a */
        //   396: dup            
        //   397: getfield        md/b.F:D
        //   400: dconst_1       
        //   401: dadd           
        //   402: putfield        md/b.F:D
        //   405: aload_0         /* a */
        //   406: iload           a
        //   408: ifne            503
        //   411: getfield        md/b.F:D
        //   414: ldc2_w          100.0
        //   417: dcmpl          
        //   418: ifle            466
        //   421: aload_0         /* a */
        //   422: dconst_0       
        //   423: putfield        md/b.F:D
        //   426: aload_0         /* a */
        //   427: invokestatic    java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
        //   430: ldc2_w          -5.0
        //   433: ldc2_w          5.0
        //   436: invokevirtual   java/util/concurrent/ThreadLocalRandom.nextDouble:(DD)D
        //   439: ldc2_w          1000.0
        //   442: ddiv           
        //   443: putfield        md/b.D:D
        //   446: aload_0         /* a */
        //   447: invokestatic    java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
        //   450: ldc2_w          -5.0
        //   453: ldc2_w          5.0
        //   456: invokevirtual   java/util/concurrent/ThreadLocalRandom.nextDouble:(DD)D
        //   459: ldc2_w          1000.0
        //   462: ddiv           
        //   463: putfield        md/b.E:D
        //   466: aload_0         /* a */
        //   467: invokevirtual   md/b.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   470: dup            
        //   471: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   474: f2d            
        //   475: aload_0         /* a */
        //   476: getfield        md/b.D:D
        //   479: dadd           
        //   480: d2f            
        //   481: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70125_A:F
        //   484: aload_0         /* a */
        //   485: invokevirtual   md/b.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   488: dup            
        //   489: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   492: f2d            
        //   493: aload_0         /* a */
        //   494: getfield        md/b.E:D
        //   497: dadd           
        //   498: d2f            
        //   499: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   502: aload_0         /* a */
        //   503: invokevirtual   md/b.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   506: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   509: fstore          a
        //   511: dload           a
        //   513: dload           a
        //   515: invokestatic    java/lang/Math.atan2:(DD)D
        //   518: ldc2_w          180.0
        //   521: dmul           
        //   522: ldc2_w          3.141592653589793
        //   525: ddiv           
        //   526: d2f            
        //   527: ldc             90.0
        //   529: fsub           
        //   530: fstore          a
        //   532: dload_2         /* a */
        //   533: iload           a
        //   535: i2d            
        //   536: ldc2_w          100.0
        //   539: ddiv           
        //   540: dadd           
        //   541: dstore_2        /* a */
        //   542: aload_0         /* a */
        //   543: aload_0         /* a */
        //   544: getfield        md/b.p:Lnet/minecraft/entity/EntityLivingBase;
        //   547: invokevirtual   md/b.h:(Lnet/minecraft/entity/Entity;)Z
        //   550: istore          a
        //   552: aload_0         /* a */
        //   553: iload           a
        //   555: ifne            636
        //   558: getfield        md/b.u:Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //   561: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.a:()Z
        //   566: ifeq            635
        //   569: iload           a
        //   571: iload           a
        //   573: ifne            601
        //   576: ifeq            599
        //   579: aload_0         /* a */
        //   580: invokevirtual   md/b.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   583: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71158_b:Lnet/minecraft/util/MovementInput;
        //   586: getfield        net/minecraft/util/MovementInput.field_78902_a:F
        //   589: fconst_0       
        //   590: fcmpl          
        //   591: iload           a
        //   593: ifne            601
        //   596: ifgt            629
        //   599: iload           a
        //   601: iload           a
        //   603: ifne            626
        //   606: ifne            635
        //   609: aload_0         /* a */
        //   610: invokevirtual   md/b.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   613: getfield        net/minecraft/client/entity/EntityPlayerSP.field_71158_b:Lnet/minecraft/util/MovementInput;
        //   616: getfield        net/minecraft/util/MovementInput.field_78902_a:F
        //   619: fconst_0       
        //   620: iload           a
        //   622: ifne            658
        //   625: fcmpg          
        //   626: ifge            635
        //   629: dload_2         /* a */
        //   630: ldc2_w          2.0
        //   633: dmul           
        //   634: dstore_2        /* a */
        //   635: aload_0         /* a */
        //   636: aload_0         /* a */
        //   637: invokevirtual   md/b.b:()Lnet/minecraft/client/Minecraft;
        //   640: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //   643: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   646: fload           a
        //   648: dload_2         /* a */
        //   649: d2f            
        //   650: ldc             10.0
        //   652: fdiv           
        //   653: invokevirtual   md/b.a:(FFF)F
        //   656: fload           a
        //   658: fsub           
        //   659: fstore          a
        //   661: iload           a
        //   663: ifne            710
        //   666: iload           a
        //   668: ifle            724
        //   671: aload_0         /* a */
        //   672: dup            
        //   673: getfield        md/b.w:F
        //   676: fload           a
        //   678: fadd           
        //   679: putfield        md/b.w:F
        //   682: aload_0         /* a */
        //   683: getfield        md/b.x:F
        //   686: fstore          a
        //   688: aload_0         /* a */
        //   689: aload_0         /* a */
        //   690: getfield        md/b.y:Lnet/minecraft/util/MouseFilter;
        //   693: aload_0         /* a */
        //   694: getfield        md/b.w:F
        //   697: ldc             0.05
        //   699: invokevirtual   net/minecraft/util/MouseFilter.func_76333_a:(FF)F
        //   702: putfield        md/b.x:F
        //   705: aload_0         /* a */
        //   706: fconst_0       
        //   707: putfield        md/b.w:F
        //   710: aload_0         /* a */
        //   711: invokevirtual   md/b.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   714: dup            
        //   715: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   718: fload           a
        //   720: fadd           
        //   721: putfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   724: iload           a
        //   726: ifeq            743
        //   729: getstatic       md/b.G:Z
        //   732: ifeq            739
        //   735: iconst_0       
        //   736: goto            740
        //   739: iconst_1       
        //   740: putstatic       md/b.G:Z
        //   743: return         
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
    
    public float a(final float a, final float a, final float a) {
        final int z = b.Z ? 1 : 0;
        float a2 = (float)MathHelper.func_76138_g((double)(a - a));
        final int a3 = z;
        final float n = fcmpl(a2, a);
        final float n2;
        final float n3;
        if (a3 == 0) {
            if (n > 0) {
                a2 = a;
            }
            n2 = a2;
            n3 = -a;
            if (a3 != 0) {
                return n2 + n3;
            }
            final float n4 = fcmpg(n2, n3);
        }
        if (n < 0) {
            a2 = -a;
        }
        return n2 + n3;
    }
    
    private int f(final Entity a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dstore_3        /* a */
        //     2: aload_1         /* a */
        //     3: getfield        net/minecraft/entity/Entity.field_70165_t:D
        //     6: aload_0         /* a */
        //     7: invokevirtual   md/b.b:()Lnet/minecraft/client/Minecraft;
        //    10: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    13: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //    16: dsub           
        //    17: dstore          a
        //    19: aload_1         /* a */
        //    20: getfield        net/minecraft/entity/Entity.field_70161_v:D
        //    23: aload_0         /* a */
        //    24: invokevirtual   md/b.b:()Lnet/minecraft/client/Minecraft;
        //    27: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    30: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //    33: dsub           
        //    34: dstore          a
        //    36: aload_1         /* a */
        //    37: getfield        net/minecraft/entity/Entity.field_70163_u:D
        //    40: aload_0         /* a */
        //    41: invokevirtual   md/b.b:()Lnet/minecraft/client/Minecraft;
        //    44: getfield        net/minecraft/client/Minecraft.field_71439_g:Lnet/minecraft/client/entity/EntityPlayerSP;
        //    47: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //    50: dsub           
        //    51: aload_1         /* a */
        //    52: getfield        net/minecraft/entity/Entity.field_70131_O:F
        //    55: f2d            
        //    56: dadd           
        //    57: dstore          9
        //    59: getstatic       md/b.Z:Z
        //    62: istore_2        /* a */
        //    63: dload           a
        //    65: dconst_0       
        //    66: dcmpl          
        //    67: iload_2         /* a */
        //    68: ifne            106
        //    71: ifle            102
        //    74: dload           a
        //    76: dconst_0       
        //    77: dcmpl          
        //    78: iload_2         /* a */
        //    79: ifne            106
        //    82: ifle            102
        //    85: dload           a
        //    87: dload           a
        //    89: ddiv           
        //    90: invokestatic    java/lang/Math.atan:(D)D
        //    93: dneg           
        //    94: invokestatic    java/lang/Math.toDegrees:(D)D
        //    97: dstore_3        /* a */
        //    98: iload_2         /* a */
        //    99: ifeq            221
        //   102: dload           a
        //   104: dconst_0       
        //   105: dcmpl          
        //   106: iload_2         /* a */
        //   107: ifne            145
        //   110: ifle            141
        //   113: dload           a
        //   115: dconst_0       
        //   116: dcmpg          
        //   117: iload_2         /* a */
        //   118: ifne            145
        //   121: ifge            141
        //   124: dload           a
        //   126: dload           a
        //   128: ddiv           
        //   129: invokestatic    java/lang/Math.atan:(D)D
        //   132: dneg           
        //   133: invokestatic    java/lang/Math.toDegrees:(D)D
        //   136: dstore_3        /* a */
        //   137: iload_2         /* a */
        //   138: ifeq            221
        //   141: dload           a
        //   143: dconst_0       
        //   144: dcmpg          
        //   145: iload_2         /* a */
        //   146: ifne            191
        //   149: ifge            183
        //   152: dload           a
        //   154: dconst_0       
        //   155: dcmpl          
        //   156: iload_2         /* a */
        //   157: ifne            191
        //   160: ifle            183
        //   163: ldc2_w          -90.0
        //   166: dload           a
        //   168: dload           a
        //   170: ddiv           
        //   171: invokestatic    java/lang/Math.atan:(D)D
        //   174: invokestatic    java/lang/Math.toDegrees:(D)D
        //   177: dadd           
        //   178: dstore_3        /* a */
        //   179: iload_2         /* a */
        //   180: ifeq            221
        //   183: dload           a
        //   185: dconst_0       
        //   186: iload_2         /* a */
        //   187: ifne            231
        //   190: dcmpg          
        //   191: ifge            221
        //   194: dload           a
        //   196: dconst_0       
        //   197: iload_2         /* a */
        //   198: ifne            231
        //   201: dcmpg          
        //   202: ifge            221
        //   205: ldc2_w          90.0
        //   208: dload           a
        //   210: dload           a
        //   212: ddiv           
        //   213: invokestatic    java/lang/Math.atan:(D)D
        //   216: invokestatic    java/lang/Math.toDegrees:(D)D
        //   219: dadd           
        //   220: dstore_3        /* a */
        //   221: dload           a
        //   223: dload           a
        //   225: dmul           
        //   226: dload           a
        //   228: dload           a
        //   230: dmul           
        //   231: dadd           
        //   232: invokestatic    java/lang/Math.sqrt:(D)D
        //   235: dstore          a
        //   237: dload           a
        //   239: dload           a
        //   241: ddiv           
        //   242: invokestatic    java/lang/Math.atan:(D)D
        //   245: invokestatic    java/lang/Math.toDegrees:(D)D
        //   248: dneg           
        //   249: dstore          a
        //   251: dload_3         /* a */
        //   252: aload_0         /* a */
        //   253: invokevirtual   md/b.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   256: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70177_z:F
        //   259: f2d            
        //   260: dsub           
        //   261: invokestatic    java/lang/Math.abs:(D)D
        //   264: ldc2_w          360.0
        //   267: drem           
        //   268: d2i            
        //   269: istore          a
        //   271: iload           a
        //   273: sipush          180
        //   276: iload_2         /* a */
        //   277: ifne            288
        //   280: if_icmple       292
        //   283: sipush          360
        //   286: iload           a
        //   288: isub           
        //   289: goto            294
        //   292: iload           a
        //   294: istore          a
        //   296: iload           a
        //   298: ireturn        
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
    
    private int g(final Entity a) {
        final int z = b.Z ? 1 : 0;
        final double a2 = a.field_70165_t - this.b().field_71439_g.field_70165_t;
        final double a3 = a.field_70161_v - this.b().field_71439_g.field_70161_v;
        final double a4 = a.field_70163_u - this.b().field_71439_g.field_70163_u + a.field_70131_O / 2.0f;
        final int a5 = z;
        final double a6 = Math.atan2(Math.sqrt(a3 * a3 + a2 * a2), a4) + 3.141592653589793;
        final int n;
        final int a7 = n = (int)(Math.abs(a6 - this.c().field_70125_A) % 360.0);
        final int n2 = 180;
        final int a8 = (a5 == 0 && n <= n2) ? a7 : (n - n2);
        return a8;
    }
    
    boolean h(final Entity a) {
        final int z = b.Z ? 1 : 0;
        double a2 = 0.0;
        final int a3 = z;
        final double a4 = a.field_70165_t - this.b().field_71439_g.field_70165_t;
        final double a5 = a.field_70161_v - this.b().field_71439_g.field_70161_v;
        double n4;
        double n3;
        final double n2;
        final double n = n2 = (n3 = (n4 = dcmpl(a5, 0.0)));
        final double n8;
        Label_0216: {
            Label_0198: {
                final double n5;
                Label_0083: {
                    if (a3 == 0) {
                        if (n > 0) {
                            n5 = (n3 = (n4 = dcmpl(a4, 0.0)));
                            if (a3 != 0) {
                                break Label_0083;
                            }
                            if (n5 > 0) {
                                a2 = Math.toDegrees(-Math.atan(a4 / a5));
                                if (a3 == 0) {
                                    break Label_0198;
                                }
                            }
                        }
                        final double n6 = dcmpl(a5, 0.0);
                    }
                }
                final double n7;
                Label_0122: {
                    if (a3 == 0) {
                        if (n > 0) {
                            n7 = (n4 = dcmpg(a4, 0.0));
                            if (a3 != 0) {
                                break Label_0122;
                            }
                            if (n7 < 0) {
                                a2 = Math.toDegrees(-Math.atan(a4 / a5));
                                if (a3 == 0) {
                                    break Label_0198;
                                }
                            }
                        }
                        n4 = dcmpg(a5, 0.0);
                    }
                }
                Label_0164: {
                    if (a3 == 0) {
                        if (n5 < 0) {
                            n8 = dcmpl(a4, 0.0);
                            if (a3 != 0) {
                                break Label_0164;
                            }
                            if (n8 > 0) {
                                a2 = -90.0 + Math.toDegrees(Math.atan(a5 / a4));
                                if (a3 == 0) {
                                    break Label_0198;
                                }
                            }
                        }
                        n3 = dcmpg(a5, 0.0);
                    }
                }
                if (a3 != 0) {
                    break Label_0216;
                }
                if (n7 < 0) {
                    final double n9 = dcmpg(a4, 0.0);
                    if (a3 != 0) {
                        break Label_0216;
                    }
                    if (n9 < 0) {
                        a2 = 90.0 + Math.toDegrees(Math.atan(a5 / a4));
                    }
                }
            }
            n4 = (int)(Math.abs(a2 - this.c().field_70177_z) % 360.0);
        }
        final int a6 = (int)n8;
        boolean b;
        final int n10 = (b = (a6 != 0)) ? 1 : 0;
        if (a3 == 0) {
            if (n10 < 180) {
                b = true;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public Entity m() {
        Entity a = null;
        double a2 = 360.0;
        final int z = b.Z ? 1 : 0;
        final Iterator iterator = this.b().field_71441_e.field_72996_f.iterator();
        final int a3 = z;
        Entity entity = null;
        while (iterator.hasNext()) {
            final Object a4 = iterator.next();
            entity = (Entity)a4;
            if (a3 != 0) {
                return entity;
            }
            final Entity a5 = entity;
            double n2;
            final int n = (int)(n2 = (this.b(a5) ? 1 : 0));
            if (a3 == 0) {
                if (n == 0 && a3 == 0) {
                    continue;
                }
                final int n3;
                n2 = (n3 = dcmpl((double)this.c().func_70032_d(a5), this.r.a()));
            }
            if (a3 == 0) {
                if (n > 0 && a3 == 0) {
                    continue;
                }
                n2 = this.f(a5);
            }
            final double a6 = n2;
            final double n4 = dcmpg(a6, a2);
            Label_0154: {
                final double n5;
                Label_0150: {
                    if (a3 == 0) {
                        if (n4 >= 0) {
                            break Label_0154;
                        }
                        n5 = a6;
                        if (a3 != 0) {
                            break Label_0150;
                        }
                        final double n6 = dcmpg(n5, this.v.a() / 2.0);
                    }
                    if (n4 > 0) {
                        break Label_0154;
                    }
                }
                a2 = n5;
                a = a5;
            }
            if (a3 != 0) {
                break;
            }
        }
        return entity;
    }
    
    public Entity n() {
        return (Entity)this.p;
    }
    
    @Override
    public void e() {
        this.o = true;
        final int a = b.Z ? 1 : 0;
        final i n = this.n;
        if (a == 0) {
            if (n != null) {
                return;
            }
            this.n = new i(this);
            final i n2 = this.n;
        }
        n.a();
    }
    
    @Override
    public void g() {
        final int z = b.Z ? 1 : 0;
        this.o = false;
        final int a = z;
        b b = this;
        if (a == 0) {
            if (this.n != null) {
                this.n.a = null;
            }
            b = this;
        }
        b.n = null;
    }
    
    @Override
    public k[] k() {
        return new k[] { this.v, this.q, this.r, this.u, this.s, this.t };
    }
    
    static {
        final String[] aa2 = new String[7];
        int n = 0;
        String s;
        int n2 = (s = "\u0086v\u0096\u001d\u00d9\t\u0099v\u0080Z\u00ddf©¸r\u000f\u0087c\u008a\u001b\u00dam\u00ee½y\u009b\b\u00d9i½±\b\u0082r\u008a\u000e\u00d5k¯¸\t\u0095~\u0095;\u00cf{§§c").length();
        int n3 = 5;
        int n4 = -1;
    Label_0022:
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
                                        c2 = '\u00d4';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u0017';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '\u00f8';
                                        break;
                                    }
                                    case 3: {
                                        c2 = 'z';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '¼';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '\b';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u00ce';
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
                            aa2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0022;
                            }
                            n2 = (s = "\u0097{\u0091\u0019\u00d7%\u008f½z\u0004\u0086v\u008c\u001f").length();
                            n3 = 9;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            aa2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0022;
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
        aa = aa2;
    }
}
