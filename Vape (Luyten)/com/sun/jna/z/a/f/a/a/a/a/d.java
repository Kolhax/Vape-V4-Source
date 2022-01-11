package com.sun.jna.z.a.f.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.e.*;
import java.util.*;
import com.sun.jna.z.a.f.a.a.a.d.*;
import java.util.concurrent.*;
import java.awt.*;

public abstract class d implements k
{
    private l a;
    private e b;
    protected Rectangle c;
    protected com.sun.jna.z.a.f.a.a.a.e.d d;
    protected Color e;
    protected Color f;
    protected Color g;
    protected boolean h;
    protected boolean i;
    private List<c> j;
    public static int k;
    
    public d() {
        this.a = null;
        this.c = new Rectangle(0, 0, 0, 0);
        this.h = true;
        this.i = true;
        this.j = new CopyOnWriteArrayList<c>();
    }
    
    @Override
    public void b() {
        final int a = com.sun.jna.z.a.f.a.a.a.a.d.k;
        com.sun.jna.z.a.f.a.a.a.e.d d = null;
        Label_0024: {
            Label_0020: {
                try {
                    d = this.d;
                    if (a != 0) {
                        break Label_0024;
                    }
                    if (d != null) {
                        break Label_0020;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                return;
            }
            final com.sun.jna.z.a.f.a.a.a.e.d d2 = this.d;
        }
        d.a(this);
    }
    
    @Override
    public void c() {
        final int a = com.sun.jna.z.a.f.a.a.a.a.d.k;
        com.sun.jna.z.a.f.a.a.a.e.d d = null;
        Label_0024: {
            Label_0020: {
                try {
                    d = this.d;
                    if (a != 0) {
                        break Label_0024;
                    }
                    if (d != null) {
                        break Label_0020;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                return;
            }
            final com.sun.jna.z.a.f.a.a.a.e.d d2 = this.d;
        }
        d.f(this);
    }
    
    protected com.sun.jna.z.a.f.a.a.a.e.d a() {
        return this.b.a(this);
    }
    
    @Override
    public void a(final int a, final int a, final int a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          a
        //     5: aload_0         /* a */
        //     6: getfield        com/sun/jna/z/a/f/a/a/a/a/d.d:Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //     9: iload           a
        //    11: ifne            29
        //    14: ifnull          119
        //    17: goto            21
        //    20: athrow         
        //    21: aload_0         /* a */
        //    22: getfield        com/sun/jna/z/a/f/a/a/a/a/d.d:Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //    25: goto            29
        //    28: athrow         
        //    29: aload_0         /* a */
        //    30: invokeinterface com/sun/jna/z/a/f/a/a/a/e/d.e:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)[Ljava/awt/Rectangle;
        //    35: astore          a
        //    37: aload           a
        //    39: arraylength    
        //    40: istore          a
        //    42: iconst_0       
        //    43: istore          a
        //    45: iload           a
        //    47: iload           a
        //    49: if_icmpge       119
        //    52: aload           a
        //    54: iload           a
        //    56: aaload         
        //    57: astore          a
        //    59: iload           a
        //    61: ifne            114
        //    64: aload           a
        //    66: iload_1         /* a */
        //    67: iload_2         /* a */
        //    68: invokevirtual   java/awt/Rectangle.contains:(II)Z
        //    71: ifeq            107
        //    74: goto            78
        //    77: athrow         
        //    78: aload_0         /* a */
        //    79: getfield        com/sun/jna/z/a/f/a/a/a/a/d.d:Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //    82: aload_0         /* a */
        //    83: new             Ljava/awt/Point;
        //    86: dup            
        //    87: iload_1         /* a */
        //    88: iload_2         /* a */
        //    89: invokespecial   java/awt/Point.<init>:(II)V
        //    92: iload_3         /* a */
        //    93: invokeinterface com/sun/jna/z/a/f/a/a/a/e/d.a:(Lcom/sun/jna/z/a/f/a/a/a/a/k;Ljava/awt/Point;I)V
        //    98: iload           a
        //   100: ifeq            119
        //   103: goto            107
        //   106: athrow         
        //   107: iinc            a, 1
        //   110: goto            114
        //   113: athrow         
        //   114: iload           a
        //   116: ifeq            45
        //   119: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  5      17     20     21     Ljava/lang/IllegalArgumentException;
        //  14     25     28     29     Ljava/lang/IllegalArgumentException;
        //  59     74     77     78     Ljava/lang/IllegalArgumentException;
        //  64     103    106    107    Ljava/lang/IllegalArgumentException;
        //  78     110    113    114    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0078:
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
    public void b(final int a, final int a, final int a) {
    }
    
    @Override
    public e a() {
        return this.b;
    }
    
    @Override
    public void a(final e a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/sun/jna/z/a/f/a/a/a/a/d.b:Lcom/sun/jna/z/a/f/a/a/a/e/e;
        //     4: astore_3       
        //     5: getstatic       com/sun/jna/z/a/f/a/a/a/a/d.k:I
        //     8: aload_0         /* a */
        //     9: aload_1         /* a */
        //    10: putfield        com/sun/jna/z/a/f/a/a/a/a/d.b:Lcom/sun/jna/z/a/f/a/a/a/e/e;
        //    13: istore_2        /* a */
        //    14: aload_1         /* a */
        //    15: iload_2         /* a */
        //    16: ifne            60
        //    19: ifnonnull       43
        //    22: goto            26
        //    25: athrow         
        //    26: aload_0         /* a */
        //    27: aconst_null    
        //    28: putfield        com/sun/jna/z/a/f/a/a/a/a/d.d:Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //    31: aload_0         /* a */
        //    32: aconst_null    
        //    33: putfield        com/sun/jna/z/a/f/a/a/a/a/d.e:Ljava/awt/Color;
        //    36: aload_0         /* a */
        //    37: aconst_null    
        //    38: putfield        com/sun/jna/z/a/f/a/a/a/a/d.f:Ljava/awt/Color;
        //    41: return         
        //    42: athrow         
        //    43: aload_0         /* a */
        //    44: iload_2         /* a */
        //    45: ifne            144
        //    48: aload_0         /* a */
        //    49: invokevirtual   com/sun/jna/z/a/f/a/a/a/a/d.a:()Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //    52: putfield        com/sun/jna/z/a/f/a/a/a/a/d.d:Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //    55: aload_3         /* a */
        //    56: goto            60
        //    59: athrow         
        //    60: ifnull          139
        //    63: aload_3         /* a */
        //    64: aload_0         /* a */
        //    65: invokeinterface com/sun/jna/z/a/f/a/a/a/e/e.a:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //    70: aload_0         /* a */
        //    71: invokeinterface com/sun/jna/z/a/f/a/a/a/e/d.b:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Ljava/awt/Dimension;
        //    76: astore          a
        //    78: aload_0         /* a */
        //    79: getfield        com/sun/jna/z/a/f/a/a/a/a/d.c:Ljava/awt/Rectangle;
        //    82: getfield        java/awt/Rectangle.width:I
        //    85: aload           a
        //    87: getfield        java/awt/Dimension.width:I
        //    90: iload_2         /* a */
        //    91: ifne            125
        //    94: if_icmpne       132
        //    97: goto            101
        //   100: athrow         
        //   101: aload_0         /* a */
        //   102: getfield        com/sun/jna/z/a/f/a/a/a/a/d.c:Ljava/awt/Rectangle;
        //   105: getfield        java/awt/Rectangle.height:I
        //   108: iload_2         /* a */
        //   109: ifne            129
        //   112: goto            116
        //   115: athrow         
        //   116: aload           a
        //   118: getfield        java/awt/Dimension.height:I
        //   121: goto            125
        //   124: athrow         
        //   125: if_icmpne       132
        //   128: iconst_1       
        //   129: goto            133
        //   132: iconst_0       
        //   133: istore          a
        //   135: iload_2         /* a */
        //   136: ifeq            163
        //   139: aload_0         /* a */
        //   140: goto            144
        //   143: athrow         
        //   144: getfield        com/sun/jna/z/a/f/a/a/a/a/d.c:Ljava/awt/Rectangle;
        //   147: new             Ljava/awt/Rectangle;
        //   150: dup            
        //   151: iconst_0       
        //   152: iconst_0       
        //   153: iconst_0       
        //   154: iconst_0       
        //   155: invokespecial   java/awt/Rectangle.<init>:(IIII)V
        //   158: invokevirtual   java/awt/Rectangle.equals:(Ljava/lang/Object;)Z
        //   161: istore          a
        //   163: iload           a
        //   165: ifeq            215
        //   168: aload_0         /* a */
        //   169: getfield        com/sun/jna/z/a/f/a/a/a/a/d.d:Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //   172: aload_0         /* a */
        //   173: invokeinterface com/sun/jna/z/a/f/a/a/a/e/d.b:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Ljava/awt/Dimension;
        //   178: astore          a
        //   180: aload_0         /* a */
        //   181: new             Ljava/awt/Rectangle;
        //   184: dup            
        //   185: aload_0         /* a */
        //   186: getfield        com/sun/jna/z/a/f/a/a/a/a/d.c:Ljava/awt/Rectangle;
        //   189: getfield        java/awt/Rectangle.x:I
        //   192: aload_0         /* a */
        //   193: getfield        com/sun/jna/z/a/f/a/a/a/a/d.c:Ljava/awt/Rectangle;
        //   196: getfield        java/awt/Rectangle.y:I
        //   199: aload           a
        //   201: getfield        java/awt/Dimension.width:I
        //   204: aload           a
        //   206: getfield        java/awt/Dimension.height:I
        //   209: invokespecial   java/awt/Rectangle.<init>:(IIII)V
        //   212: putfield        com/sun/jna/z/a/f/a/a/a/a/d.c:Ljava/awt/Rectangle;
        //   215: aload_0         /* a */
        //   216: aload_0         /* a */
        //   217: getfield        com/sun/jna/z/a/f/a/a/a/a/d.d:Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //   220: aload_0         /* a */
        //   221: invokeinterface com/sun/jna/z/a/f/a/a/a/e/d.d:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Ljava/awt/Color;
        //   226: putfield        com/sun/jna/z/a/f/a/a/a/a/d.e:Ljava/awt/Color;
        //   229: aload_0         /* a */
        //   230: aload_0         /* a */
        //   231: getfield        com/sun/jna/z/a/f/a/a/a/a/d.d:Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //   234: aload_0         /* a */
        //   235: invokeinterface com/sun/jna/z/a/f/a/a/a/e/d.c:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Ljava/awt/Color;
        //   240: putfield        com/sun/jna/z/a/f/a/a/a/a/d.f:Ljava/awt/Color;
        //   243: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  14     22     25     26     Ljava/lang/IllegalArgumentException;
        //  19     42     42     43     Ljava/lang/IllegalArgumentException;
        //  43     56     59     60     Ljava/lang/IllegalArgumentException;
        //  78     97     100    101    Ljava/lang/IllegalArgumentException;
        //  94     112    115    116    Ljava/lang/IllegalArgumentException;
        //  101    121    124    125    Ljava/lang/IllegalArgumentException;
        //  135    140    143    144    Ljava/lang/IllegalArgumentException;
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
    public int d() {
        return this.c.x;
    }
    
    @Override
    public int e() {
        return this.c.y;
    }
    
    @Override
    public int f() {
        return this.c.width;
    }
    
    @Override
    public int g() {
        return this.c.height;
    }
    
    @Override
    public void b(final int a) {
        this.c.x = a;
    }
    
    @Override
    public void c(final int a) {
        this.c.y = a;
    }
    
    @Override
    public void d(final int a) {
        this.c.width = a;
    }
    
    @Override
    public void e(final int a) {
        this.c.height = a;
    }
    
    @Override
    public Color l() {
        return this.f;
    }
    
    @Override
    public Color m() {
        return this.e;
    }
    
    @Override
    public Color n() {
        return this.g;
    }
    
    @Override
    public void a(final Color a) {
        this.f = a;
    }
    
    @Override
    public void b(final Color a) {
        this.e = a;
    }
    
    @Override
    public void c(final Color a) {
        this.g = a;
    }
    
    @Override
    public Point h() {
        return this.c.getLocation();
    }
    
    @Override
    public Dimension i() {
        return this.c.getSize();
    }
    
    @Override
    public Rectangle j() {
        return this.c;
    }
    
    @Override
    public l k() {
        return this.a;
    }
    
    @Override
    public void a(final l a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2        /* a */
        //     4: aload_1         /* a */
        //     5: iload_2         /* a */
        //     6: ifne            38
        //     9: aload_0         /* a */
        //    10: invokeinterface com/sun/jna/z/a/f/a/a/a/a/l.b:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Z
        //    15: ifeq            66
        //    18: goto            22
        //    21: athrow         
        //    22: aload_0         /* a */
        //    23: iload_2         /* a */
        //    24: ifne            76
        //    27: goto            31
        //    30: athrow         
        //    31: getfield        com/sun/jna/z/a/f/a/a/a/a/d.a:Lcom/sun/jna/z/a/f/a/a/a/a/l;
        //    34: goto            38
        //    37: athrow         
        //    38: ifnull          75
        //    41: aload_0         /* a */
        //    42: iload_2         /* a */
        //    43: ifne            76
        //    46: goto            50
        //    49: athrow         
        //    50: getfield        com/sun/jna/z/a/f/a/a/a/a/d.a:Lcom/sun/jna/z/a/f/a/a/a/a/l;
        //    53: aload_0         /* a */
        //    54: invokeinterface com/sun/jna/z/a/f/a/a/a/a/l.b:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Z
        //    59: ifeq            75
        //    62: goto            66
        //    65: athrow         
        //    66: new             Ljava/lang/IllegalArgumentException;
        //    69: dup            
        //    70: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //    73: athrow         
        //    74: athrow         
        //    75: aload_0         /* a */
        //    76: aload_1         /* a */
        //    77: putfield        com/sun/jna/z/a/f/a/a/a/a/d.a:Lcom/sun/jna/z/a/f/a/a/a/a/l;
        //    80: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      18     21     22     Ljava/lang/IllegalArgumentException;
        //  9      27     30     31     Ljava/lang/IllegalArgumentException;
        //  22     34     37     38     Ljava/lang/IllegalArgumentException;
        //  38     46     49     50     Ljava/lang/IllegalArgumentException;
        //  41     62     65     66     Ljava/lang/IllegalArgumentException;
        //  50     74     74     75     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
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
    public void o() {
        final Dimension a = this.d.b(this);
        this.d(a.width);
        this.e(a.height);
    }
    
    @Override
    public boolean q() {
        return this.h;
    }
    
    @Override
    public void d(final boolean a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2        /* a */
        //     4: aload_0         /* a */
        //     5: iload_2         /* a */
        //     6: ifne            61
        //     9: getfield        com/sun/jna/z/a/f/a/a/a/a/d.a:Lcom/sun/jna/z/a/f/a/a/a/a/l;
        //    12: ifnull          56
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0         /* a */
        //    20: iload_2         /* a */
        //    21: ifne            61
        //    24: goto            28
        //    27: athrow         
        //    28: getfield        com/sun/jna/z/a/f/a/a/a/a/d.a:Lcom/sun/jna/z/a/f/a/a/a/a/l;
        //    31: invokeinterface com/sun/jna/z/a/f/a/a/a/a/l.q:()Z
        //    36: ifne            56
        //    39: goto            43
        //    42: athrow         
        //    43: aload_0         /* a */
        //    44: iconst_0       
        //    45: putfield        com/sun/jna/z/a/f/a/a/a/a/d.h:Z
        //    48: iload_2         /* a */
        //    49: ifeq            65
        //    52: goto            56
        //    55: athrow         
        //    56: aload_0         /* a */
        //    57: goto            61
        //    60: athrow         
        //    61: iload_1         /* a */
        //    62: putfield        com/sun/jna/z/a/f/a/a/a/a/d.h:Z
        //    65: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      15     18     19     Ljava/lang/IllegalArgumentException;
        //  9      24     27     28     Ljava/lang/IllegalArgumentException;
        //  19     39     42     43     Ljava/lang/IllegalArgumentException;
        //  28     52     55     56     Ljava/lang/IllegalArgumentException;
        //  43     57     60     61     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
    public boolean p() {
        return this.i;
    }
    
    @Override
    public void c(final boolean a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2        /* a */
        //     4: aload_0         /* a */
        //     5: iload_2         /* a */
        //     6: ifne            61
        //     9: getfield        com/sun/jna/z/a/f/a/a/a/a/d.a:Lcom/sun/jna/z/a/f/a/a/a/a/l;
        //    12: ifnull          56
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0         /* a */
        //    20: iload_2         /* a */
        //    21: ifne            61
        //    24: goto            28
        //    27: athrow         
        //    28: getfield        com/sun/jna/z/a/f/a/a/a/a/d.a:Lcom/sun/jna/z/a/f/a/a/a/a/l;
        //    31: invokeinterface com/sun/jna/z/a/f/a/a/a/a/l.p:()Z
        //    36: ifne            56
        //    39: goto            43
        //    42: athrow         
        //    43: aload_0         /* a */
        //    44: iconst_0       
        //    45: putfield        com/sun/jna/z/a/f/a/a/a/a/d.i:Z
        //    48: iload_2         /* a */
        //    49: ifeq            65
        //    52: goto            56
        //    55: athrow         
        //    56: aload_0         /* a */
        //    57: goto            61
        //    60: athrow         
        //    61: iload_1         /* a */
        //    62: putfield        com/sun/jna/z/a/f/a/a/a/a/d.i:Z
        //    65: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      15     18     19     Ljava/lang/IllegalArgumentException;
        //  9      24     27     28     Ljava/lang/IllegalArgumentException;
        //  19     39     42     43     Ljava/lang/IllegalArgumentException;
        //  28     52     55     56     Ljava/lang/IllegalArgumentException;
        //  43     57     60     61     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
    
    protected void a(final c a) {
        synchronized (this.j) {
            this.j.add(a);
        }
    }
    
    protected void b(final c a) {
        synchronized (this.j) {
            this.j.remove(a);
        }
    }
    
    protected c[] b() {
        synchronized (this.j) {
            return this.j.toArray(new c[this.j.size()]);
        }
    }
}
