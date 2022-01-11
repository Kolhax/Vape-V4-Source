package md;

import com.sun.jna.z.a.g.*;
import com.sun.jna.z.a.e.*;
import java.util.concurrent.*;
import org.lwjgl.opengl.*;
import com.sun.jna.z.a.f.a.a.a.f.*;
import com.sun.jna.z.a.*;
import java.awt.*;
import net.minecraft.util.*;
import net.minecraft.block.*;
import java.util.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class i extends c
{
    t n;
    boolean o;
    l p;
    CopyOnWriteArrayList<d> q;
    CopyOnWriteArrayList<m> r;
    Queue<d> s;
    m t;
    m u;
    m v;
    m w;
    m x;
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
    
    public i() {
        final String[] a = i.S;
        super(a[5], com.sun.jna.z.a.e.b.Render, -16737793);
        this.n = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[4], 60.0, 10.0, 100.0, 0.01, com.sun.jna.z.a.f.a.a.a.a.b.INTEGER);
        this.q = new CopyOnWriteArrayList<d>();
        this.r = new CopyOnWriteArrayList<m>();
        this.s = new ConcurrentLinkedDeque<d>();
        this.t = new m(a[3], true, 56, -9379585, this.q);
        this.u = new m(a[6], false, 15, 15773043, this.q);
        this.v = new m(a[2], true, 14, 16772608, this.q);
        final int r = i.R ? 1 : 0;
        this.w = new m(a[0], false, 16, 2368548, this.q);
        final int a2 = r;
        this.x = new m(a[1], false, 11, 16742144, this.q);
        if (i.y) {
            i.R = (a2 == 0);
        }
    }
    
    @Override
    public void a(final float a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        md/i.n:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //     4: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:()D
        //     9: d2i            
        //    10: istore_3       
        //    11: getstatic       md/i.R:Z
        //    14: istore_2        /* a */
        //    15: aload_0         /* a */
        //    16: getfield        md/i.q:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    19: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
        //    22: astore          4
        //    24: aload           4
        //    26: invokeinterface java/util/Iterator.hasNext:()Z
        //    31: ifeq            139
        //    34: aload           4
        //    36: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    41: checkcast       Lcom/sun/jna/z/a/g/d;
        //    44: astore          a
        //    46: aload_0         /* a */
        //    47: iload_2         /* a */
        //    48: ifne            82
        //    51: invokevirtual   md/i.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //    54: aload           a
        //    56: getfield        com/sun/jna/z/a/g/d.a:I
        //    59: i2d            
        //    60: aload           a
        //    62: getfield        com/sun/jna/z/a/g/d.b:I
        //    65: i2d            
        //    66: aload           a
        //    68: getfield        com/sun/jna/z/a/g/d.c:I
        //    71: i2d            
        //    72: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70011_f:(DDD)D
        //    75: iload_3         /* a */
        //    76: i2d            
        //    77: dcmpg          
        //    78: ifgt            135
        //    81: aload_0         /* a */
        //    82: aload           a
        //    84: getfield        com/sun/jna/z/a/g/d.a:I
        //    87: i2d            
        //    88: aload           a
        //    90: getfield        com/sun/jna/z/a/g/d.b:I
        //    93: i2d            
        //    94: aload           a
        //    96: getfield        com/sun/jna/z/a/g/d.c:I
        //    99: i2d            
        //   100: aload           a
        //   102: getfield        com/sun/jna/z/a/g/d.a:I
        //   105: iconst_1       
        //   106: iadd           
        //   107: i2d            
        //   108: aload           a
        //   110: getfield        com/sun/jna/z/a/g/d.b:I
        //   113: iconst_1       
        //   114: iadd           
        //   115: i2d            
        //   116: aload           a
        //   118: getfield        com/sun/jna/z/a/g/d.c:I
        //   121: iconst_1       
        //   122: iadd           
        //   123: i2d            
        //   124: invokestatic    net/minecraft/util/AxisAlignedBB.func_178781_a:(DDDDDD)Lnet/minecraft/util/AxisAlignedBB;
        //   127: aload           a
        //   129: getfield        com/sun/jna/z/a/g/d.e:I
        //   132: invokevirtual   md/i.a:(Lnet/minecraft/util/AxisAlignedBB;I)V
        //   135: iload_2         /* a */
        //   136: ifeq            24
        //   139: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void a(final AxisAlignedBB a, final int a) {
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glLineWidth(1.5f);
        GL11.glDisable(2896);
        GL11.glDisable(3553);
        GL11.glEnable(2848);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        final Color a2 = a.a(a);
        GL11.glColor4d((double)(a2.getBlue() / 255.0f), (double)(a2.getGreen() / 255.0f), (double)(a2.getRed() / 255.0f), 1.0);
        com.sun.jna.z.a.j.e.f.b();
        final int r = i.R ? 1 : 0;
        final double a3 = a.field_72336_d - com.sun.jna.z.a.i.d.i.a();
        final double a4 = a.field_72340_a - com.sun.jna.z.a.i.d.i.a();
        final double a5 = a.field_72337_e - com.sun.jna.z.a.i.d.i.b();
        final double a6 = a.field_72338_b - com.sun.jna.z.a.i.d.i.b();
        final double a7 = a.field_72334_f - com.sun.jna.z.a.i.d.i.c();
        final double a8 = a.field_72339_c - com.sun.jna.z.a.i.d.i.c();
        com.sun.jna.z.a.j.e.f.a(a4, a6, a8);
        com.sun.jna.z.a.j.e.f.a(a3, a6, a8);
        com.sun.jna.z.a.j.e.f.a(a4, a6, a7);
        com.sun.jna.z.a.j.e.f.a(a3, a6, a7);
        com.sun.jna.z.a.j.e.f.a(a4, a6, a8);
        com.sun.jna.z.a.j.e.f.a(a4, a6, a7);
        com.sun.jna.z.a.j.e.f.a(a3, a6, a8);
        com.sun.jna.z.a.j.e.f.a(a3, a6, a7);
        com.sun.jna.z.a.j.e.f.a(a4, a5, a8);
        com.sun.jna.z.a.j.e.f.a(a3, a5, a8);
        com.sun.jna.z.a.j.e.f.a(a4, a5, a7);
        com.sun.jna.z.a.j.e.f.a(a3, a5, a7);
        com.sun.jna.z.a.j.e.f.a(a4, a5, a8);
        com.sun.jna.z.a.j.e.f.a(a4, a5, a7);
        com.sun.jna.z.a.j.e.f.a(a3, a5, a8);
        com.sun.jna.z.a.j.e.f.a(a3, a5, a7);
        com.sun.jna.z.a.j.e.f.a(a4, a6, a8);
        com.sun.jna.z.a.j.e.f.a(a4, a5, a8);
        com.sun.jna.z.a.j.e.f.a(a4, a6, a7);
        com.sun.jna.z.a.j.e.f.a(a4, a5, a7);
        com.sun.jna.z.a.j.e.f.a(a3, a6, a7);
        com.sun.jna.z.a.j.e.f.a(a3, a5, a7);
        com.sun.jna.z.a.j.e.f.a(a3, a6, a8);
        final int a9 = r;
        com.sun.jna.z.a.j.e.f.a(a3, a5, a8);
        com.sun.jna.z.a.j.e.f.c();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3553);
        GL11.glEnable(2896);
        GL11.glDisable(2848);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        if (a9 != 0) {
            i.y = !i.y;
        }
    }
    
    @Override
    public void e() {
        this.o = true;
        final int a = i.R ? 1 : 0;
        i i = this;
        if (a == 0) {
            if (this.p != null) {
                return;
            }
            i = this;
        }
        i.p = new l(this);
        new Thread(this.p).start();
    }
    
    @Override
    public void g() {
        final int r = i.R ? 1 : 0;
        this.o = false;
        final int a = r;
        i i = this;
        if (a == 0) {
            if (this.p != null) {
                this.p.a = null;
            }
            this.q.clear();
            this.r.clear();
            i = this;
        }
        i.p = null;
    }
    
    public void m() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1        /* a */
        //     4: aload_0         /* a */
        //     5: getfield        md/i.o:Z
        //     8: ifeq            416
        //    11: ldc2_w          50
        //    14: invokestatic    java/lang/Thread.sleep:(J)V
        //    17: aload_0         /* a */
        //    18: getfield        md/i.s:Ljava/util/Queue;
        //    21: invokeinterface java/util/Queue.isEmpty:()Z
        //    26: ifne            111
        //    29: aload_0         /* a */
        //    30: getfield        md/i.s:Ljava/util/Queue;
        //    33: invokeinterface java/util/Queue.poll:()Ljava/lang/Object;
        //    38: checkcast       Lcom/sun/jna/z/a/g/d;
        //    41: astore_2        /* a */
        //    42: aload_0         /* a */
        //    43: aload_2         /* a */
        //    44: getfield        com/sun/jna/z/a/g/d.a:I
        //    47: aload_2         /* a */
        //    48: getfield        com/sun/jna/z/a/g/d.b:I
        //    51: aload_2         /* a */
        //    52: getfield        com/sun/jna/z/a/g/d.c:I
        //    55: invokevirtual   md/i.a:(III)Lcom/sun/jna/z/a/g/d;
        //    58: astore_3        /* a */
        //    59: iload_1         /* a */
        //    60: ifne            4
        //    63: aload_3         /* a */
        //    64: ifnonnull       107
        //    67: aload_0         /* a */
        //    68: aload_2         /* a */
        //    69: getfield        com/sun/jna/z/a/g/d.d:I
        //    72: invokevirtual   md/i.d:(I)Lcom/sun/jna/z/a/e/m;
        //    75: astore          a
        //    77: iload_1         /* a */
        //    78: ifne            103
        //    81: aload           a
        //    83: ifnull          107
        //    86: goto            90
        //    89: athrow         
        //    90: aload_0         /* a */
        //    91: getfield        md/i.q:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    94: aload_2         /* a */
        //    95: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.add:(Ljava/lang/Object;)Z
        //    98: pop            
        //    99: goto            103
        //   102: athrow         
        //   103: goto            107
        //   106: athrow         
        //   107: iload_1         /* a */
        //   108: ifeq            17
        //   111: iconst_5       
        //   112: istore_2        /* a */
        //   113: iload_2         /* a */
        //   114: ineg           
        //   115: istore_3        /* a */
        //   116: iload_3         /* a */
        //   117: iload_2         /* a */
        //   118: if_icmpge       404
        //   121: iload_2         /* a */
        //   122: ineg           
        //   123: iload_1         /* a */
        //   124: ifne            8
        //   127: istore          a
        //   129: iload           a
        //   131: iload_2         /* a */
        //   132: if_icmpge       397
        //   135: iload_2         /* a */
        //   136: ineg           
        //   137: iload_1         /* a */
        //   138: ifne            117
        //   141: istore          a
        //   143: iload           a
        //   145: iload_2         /* a */
        //   146: if_icmpge       390
        //   149: aload_0         /* a */
        //   150: invokevirtual   md/i.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   153: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70165_t:D
        //   156: d2i            
        //   157: iload_3         /* a */
        //   158: iadd           
        //   159: istore          a
        //   161: aload_0         /* a */
        //   162: invokevirtual   md/i.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   165: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70163_u:D
        //   168: d2i            
        //   169: iload           a
        //   171: iadd           
        //   172: istore          a
        //   174: aload_0         /* a */
        //   175: invokevirtual   md/i.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   178: getfield        net/minecraft/client/entity/EntityPlayerSP.field_70161_v:D
        //   181: d2i            
        //   182: iload           a
        //   184: iadd           
        //   185: istore          a
        //   187: aload_0         /* a */
        //   188: invokevirtual   md/i.b:()Lnet/minecraft/client/Minecraft;
        //   191: getfield        net/minecraft/client/Minecraft.field_71441_e:Lnet/minecraft/client/multiplayer/WorldClient;
        //   194: new             Lnet/minecraft/util/BlockPos;
        //   197: dup            
        //   198: iload           a
        //   200: iload           a
        //   202: iload           a
        //   204: invokespecial   net/minecraft/util/BlockPos.<init>:(III)V
        //   207: invokevirtual   net/minecraft/client/multiplayer/WorldClient.func_180495_p:(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/block/state/IBlockState;
        //   210: invokeinterface net/minecraft/block/state/IBlockState.func_177230_c:()Lnet/minecraft/block/Block;
        //   215: invokestatic    net/minecraft/block/Block.func_149682_b:(Lnet/minecraft/block/Block;)I
        //   218: istore          a
        //   220: aload_0         /* a */
        //   221: iload           a
        //   223: iload           a
        //   225: iload           a
        //   227: invokevirtual   md/i.a:(III)Lcom/sun/jna/z/a/g/d;
        //   230: astore          a
        //   232: aload           a
        //   234: iload_1         /* a */
        //   235: ifne            41
        //   238: ifnull          247
        //   241: iconst_1       
        //   242: goto            248
        //   245: athrow         
        //   246: athrow         
        //   247: iconst_0       
        //   248: istore          a
        //   250: iload           a
        //   252: iload_1         /* a */
        //   253: ifne            326
        //   256: ifne            324
        //   259: goto            263
        //   262: athrow         
        //   263: aload_0         /* a */
        //   264: iload           a
        //   266: invokevirtual   md/i.d:(I)Lcom/sun/jna/z/a/e/m;
        //   269: astore          a
        //   271: iload_1         /* a */
        //   272: ifne            316
        //   275: aload           a
        //   277: ifnull          320
        //   280: goto            284
        //   283: athrow         
        //   284: aload_0         /* a */
        //   285: getfield        md/i.q:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   288: new             Lcom/sun/jna/z/a/g/d;
        //   291: dup            
        //   292: iload           a
        //   294: iload           a
        //   296: iload           a
        //   298: aload           a
        //   300: getfield        com/sun/jna/z/a/e/m.t:I
        //   303: iload           a
        //   305: invokespecial   com/sun/jna/z/a/g/d.<init>:(IIIII)V
        //   308: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.add:(Ljava/lang/Object;)Z
        //   311: pop            
        //   312: goto            316
        //   315: athrow         
        //   316: goto            320
        //   319: athrow         
        //   320: iload_1         /* a */
        //   321: ifeq            383
        //   324: iload           a
        //   326: iload_1         /* a */
        //   327: ifne            378
        //   330: aload           a
        //   332: getfield        com/sun/jna/z/a/g/d.d:I
        //   335: if_icmpne       369
        //   338: goto            342
        //   341: athrow         
        //   342: aload_0         /* a */
        //   343: invokevirtual   md/i.c:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   346: iload           a
        //   348: i2d            
        //   349: iload           a
        //   351: i2d            
        //   352: iload           a
        //   354: i2d            
        //   355: invokevirtual   net/minecraft/client/entity/EntityPlayerSP.func_70011_f:(DDD)D
        //   358: ldc2_w          200.0
        //   361: dcmpl          
        //   362: ifle            383
        //   365: goto            369
        //   368: athrow         
        //   369: aload_0         /* a */
        //   370: getfield        md/i.q:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   373: aload           a
        //   375: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.remove:(Ljava/lang/Object;)Z
        //   378: pop            
        //   379: goto            383
        //   382: athrow         
        //   383: iinc            a, 1
        //   386: iload_1         /* a */
        //   387: ifeq            143
        //   390: iinc            a, 1
        //   393: iload_1         /* a */
        //   394: ifeq            129
        //   397: iinc            a, 1
        //   400: iload_1         /* a */
        //   401: ifeq            116
        //   404: goto            4
        //   407: astore_2        /* a */
        //   408: aload_2         /* a */
        //   409: invokevirtual   java/lang/InterruptedException.printStackTrace:()V
        //   412: iload_1         /* a */
        //   413: ifeq            4
        //   416: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  81     99     102    103    Ljava/lang/InterruptedException;
        //  77     86     89     90     Ljava/lang/InterruptedException;
        //  342    379    382    383    Ljava/lang/InterruptedException;
        //  326    338    341    342    Ljava/lang/InterruptedException;
        //  324    365    368    369    Ljava/lang/InterruptedException;
        //  275    312    315    316    Ljava/lang/InterruptedException;
        //  271    280    283    284    Ljava/lang/InterruptedException;
        //  271    316    319    320    Ljava/lang/InterruptedException;
        //  238    245    245    246    Ljava/lang/InterruptedException;
        //  232    246    246    247    Ljava/lang/InterruptedException;
        //  77     103    106    107    Ljava/lang/InterruptedException;
        //  250    259    262    263    Ljava/lang/InterruptedException;
        //  11     404    407    416    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0342:
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
    public void h() {
        final int a = i.R ? 1 : 0;
    Label_0004:
        while (true) {
            final boolean o = this.o;
            int i = 0;
        Label_0008:
            while (i != 0) {
                try {
                    final int a2 = (int)this.n.a();
                    Thread.sleep(3L);
                    final int a3 = (int)this.c().field_70165_t;
                    final int a4 = (int)this.c().field_70163_u;
                    final int a5 = (int)this.c().field_70161_v;
                    int a6 = -a2;
                    do {
                        int j = 0;
                    Label_0063:
                        while (j < a2) {
                            i = -a2;
                            if (a != 0) {
                                continue Label_0008;
                            }
                            int a7 = i;
                        Label_0227_Outer:
                            while (a7 < a2) {
                                j = (int)(-(a2 * 1.3));
                                if (a == 0) {
                                    int a8 = j;
                                Label_0227:
                                    while (true) {
                                        while (a8 < a2) {
                                            final int a9 = a3 + a6;
                                            final int a10 = a4 + a8;
                                            final int a11 = a5 + a7;
                                            final int a12 = Block.func_149682_b(this.b().field_71441_e.func_180495_p(new BlockPos(a9, a10, a11)).func_177230_c());
                                            final m a13 = this.d(a12);
                                            Label_0220: {
                                                Label_0217: {
                                                    try {
                                                        Label_0174: {
                                                            try {
                                                                if (a != 0) {
                                                                    break Label_0227;
                                                                }
                                                                final int n = a;
                                                                if (n == 0) {
                                                                    break Label_0174;
                                                                }
                                                                break Label_0220;
                                                            }
                                                            catch (InterruptedException ex) {
                                                                throw ex;
                                                            }
                                                            try {
                                                                final int n = a;
                                                                if (n != 0) {
                                                                    break Label_0220;
                                                                }
                                                                if (a13 == null) {
                                                                    break Label_0217;
                                                                }
                                                            }
                                                            catch (InterruptedException ex2) {
                                                                throw ex2;
                                                            }
                                                        }
                                                        this.s.add(new d(a9, a10, a11, a13.t, a12));
                                                    }
                                                    catch (InterruptedException ex3) {
                                                        throw ex3;
                                                    }
                                                }
                                                ++a8;
                                            }
                                            if (a != 0) {
                                                break;
                                            }
                                            continue Label_0227_Outer;
                                            if (a != 0) {
                                                break Label_0227_Outer;
                                            }
                                            continue Label_0227_Outer;
                                        }
                                        ++a7;
                                        continue Label_0227;
                                    }
                                }
                                continue Label_0063;
                            }
                            ++a6;
                        }
                        break;
                    } while (a == 0);
                    continue Label_0004;
                }
                catch (InterruptedException a14) {
                    a14.printStackTrace();
                    if (a == 0) {
                        continue Label_0004;
                    }
                }
                break;
            }
            break;
        }
    }
    
    public m d(final int a) {
        final int r = i.R ? 1 : 0;
        final Iterator<m> iterator = this.r.iterator();
        final int a2 = r;
        while (iterator.hasNext()) {
            final m a3 = iterator.next();
            int n;
            final boolean b = (n = (a3.a() ? 1 : 0)) != 0;
            Label_0060: {
                final m m;
                if (a2 == 0) {
                    if (!b) {
                        break Label_0060;
                    }
                    m = a3;
                    if (a2 != 0) {
                        return m;
                    }
                    n = m.s;
                }
                if (n == a) {
                    return m;
                }
            }
            if (a2 != 0) {
                break;
            }
        }
        return null;
    }
    
    public d a(final int a, final int a, final int a) {
        final int r = i.R ? 1 : 0;
        final Iterator<d> iterator = this.q.iterator();
        final int a2 = r;
        while (iterator.hasNext()) {
            final d a3 = iterator.next();
            int n2;
            final int n = n2 = a3.a;
            int n3 = a;
            int n4 = a;
            Label_0081: {
                if (a2 == 0) {
                    if (n != a) {
                        break Label_0081;
                    }
                    final int b;
                    n2 = (b = a3.b);
                    n3 = a;
                    n4 = a;
                }
                final d d;
                if (a2 == 0) {
                    if (n != n4) {
                        break Label_0081;
                    }
                    d = a3;
                    if (a2 != 0) {
                        return d;
                    }
                    n2 = d.c;
                    n3 = a;
                }
                if (n2 != n3) {
                    break Label_0081;
                }
                return d;
            }
            if (a2 != 0) {
                break;
            }
        }
        return null;
    }
    
    @Override
    public k[] k() {
        this.r.add(this.t);
        this.r.add(this.u);
        this.r.add(this.v);
        this.r.add(this.w);
        this.r.add(this.x);
        return new k[] { this.x, this.w, this.v, this.u, this.t, this.n };
    }
    
    static {
        final String[] s = new String[7];
        int n = 0;
        String s2;
        int n2 = (s2 = "\u0095\u00e4\u00d9R\u0004\u009a\u00ea\u00ce_\u0004\u0091\u00e4\u00d4Z\u0007\u0092\u00e2\u00d9S%^\u00c1\u0006\u0084\u00ea\u00dcW?C").length();
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
                                        c2 = '\u00d6';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u008b';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '¸';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '>';
                                        break;
                                    }
                                    case 4: {
                                        c2 = 'J';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '0';
                                        break;
                                    }
                                    default: {
                                        c2 = '¥';
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
                            n2 = (s2 = "\u0085\u00ee\u00d9L)X\u0004\u009f\u00f9\u00d7P").length();
                            n3 = 6;
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
