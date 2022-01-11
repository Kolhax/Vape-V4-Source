package com.sun.jna.z.a.g;

import java.nio.*;
import java.util.zip.*;
import java.io.*;

public class j
{
    private final byte[] a;
    private final int b = 1229472850;
    private final int c = 1347179589;
    private final int d = 1951551059;
    private final int e = 1229209940;
    private final int f = 1229278788;
    private final byte g = 0;
    private final byte h = 2;
    private final byte i = 3;
    private final byte j = 4;
    private final byte k = 6;
    private final InputStream l;
    private final CRC32 m;
    private final byte[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private byte[] w;
    private byte[] x;
    private byte[] y;
    static final boolean z;
    private static final String[] A;
    
    public j(final InputStream a) throws IOException {
        final int b = com.sun.jna.z.a.g.g.b;
        this.a = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
        final int a2 = b;
        j j = null;
        Label_0199: {
            Label_0172: {
                try {
                    this.l = a;
                    this.m = new CRC32();
                    this.b(this.n = new byte[4096], 0, this.a.length);
                    j = this;
                    if (a2 != 0) {
                        break Label_0199;
                    }
                    final j i = this;
                    final byte[] array = i.n;
                    final boolean b2 = this.b(array);
                    if (!b2) {
                        break Label_0172;
                    }
                    break Label_0172;
                }
                catch (IOException ex) {
                    throw ex;
                }
                try {
                    final j i = this;
                    final byte[] array = i.n;
                    final boolean b2 = this.b(array);
                    if (!b2) {
                        final String[] a3 = com.sun.jna.z.a.g.j.A;
                        throw new IOException(a3[2]);
                    }
                }
                catch (IOException ex2) {
                    throw ex2;
                }
            }
            this.a(1229472850);
            this.f();
            j = this;
        }
        j.i();
        Label_0326: {
            j k = null;
            Label_0321: {
                Label_0305: {
                    do {
                        this.j();
                        Label_0264: {
                            while (true) {
                                switch (this.p) {
                                    case 1229209940: {
                                        Label_0258: {
                                            try {
                                                if (a2 == 0) {
                                                    break Label_0305;
                                                }
                                                final boolean b3 = com.sun.jna.z.a.j.g;
                                                if (b3) {
                                                    break Label_0258;
                                                }
                                                break Label_0258;
                                            }
                                            catch (IOException ex3) {
                                                throw ex3;
                                            }
                                            try {
                                                final boolean b3 = com.sun.jna.z.a.j.g;
                                                if (b3) {
                                                    final boolean g = false;
                                                    break Label_0264;
                                                }
                                            }
                                            catch (IOException ex4) {
                                                throw ex4;
                                            }
                                        }
                                        final boolean g = true;
                                        break Label_0264;
                                    }
                                    case 1347179589: {
                                        Label_0267: {
                                            break Label_0267;
                                            final boolean g;
                                            com.sun.jna.z.a.j.g = g;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        this.g();
                                                                                                        if (a2 != 0) {
                                                                                                            this.h();
                                                                                                            break;
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                    catch (IllegalArgumentException ex5) {
                                                                                                        throw ex5;
                                                                                                    }
                                                                                                }
                                                                                                catch (UnsupportedOperationException ex6) {
                                                                                                    throw ex6;
                                                                                                }
                                                                                            }
                                                                                            catch (IllegalArgumentException ex7) {
                                                                                                throw ex7;
                                                                                            }
                                                                                        }
                                                                                        catch (UnsupportedOperationException ex8) {
                                                                                            throw ex8;
                                                                                        }
                                                                                    }
                                                                                    catch (IllegalArgumentException ex9) {
                                                                                        throw ex9;
                                                                                    }
                                                                                }
                                                                                catch (UnsupportedOperationException ex10) {
                                                                                    throw ex10;
                                                                                }
                                                                            }
                                                                            catch (IllegalArgumentException ex11) {
                                                                                throw ex11;
                                                                            }
                                                                        }
                                                                        catch (UnsupportedOperationException ex12) {
                                                                            throw ex12;
                                                                        }
                                                                    }
                                                                    catch (IllegalArgumentException ex13) {
                                                                        throw ex13;
                                                                    }
                                                                }
                                                                catch (UnsupportedOperationException ex14) {
                                                                    throw ex14;
                                                                }
                                                            }
                                                            catch (IllegalArgumentException ex15) {
                                                                throw ex15;
                                                            }
                                                        }
                                                        catch (UnsupportedOperationException ex16) {
                                                            throw ex16;
                                                        }
                                                    }
                                                    catch (IllegalArgumentException ex17) {
                                                        throw ex17;
                                                    }
                                                }
                                                catch (UnsupportedOperationException ex18) {
                                                    throw ex18;
                                                }
                                            }
                                            catch (IOException ex19) {
                                                throw ex19;
                                            }
                                        }
                                        break;
                                    }
                                    case 1951551059: {
                                        continue;
                                    }
                                }
                                break;
                            }
                        }
                        this.i();
                    } while (a2 == 0);
                    try {
                        k = this;
                        if (a2 != 0) {
                            break Label_0326;
                        }
                        final int n = this.u;
                        final int n2 = 3;
                        if (n == n2) {
                            break Label_0321;
                        }
                        return;
                    }
                    catch (IOException ex20) {
                        throw ex20;
                    }
                }
                try {
                    final int n = this.u;
                    final int n2 = 3;
                    if (n != n2) {
                        return;
                    }
                    k = this;
                }
                catch (IOException ex21) {
                    throw ex21;
                }
            }
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (k.w == null) {
                                                                            throw new IOException(com.sun.jna.z.a.g.j.A[5]);
                                                                        }
                                                                    }
                                                                    catch (IOException ex22) {
                                                                        throw ex22;
                                                                    }
                                                                }
                                                                catch (IllegalArgumentException ex23) {
                                                                    throw ex23;
                                                                }
                                                            }
                                                            catch (IOException ex24) {
                                                                throw ex24;
                                                            }
                                                        }
                                                        catch (IllegalArgumentException ex25) {
                                                            throw ex25;
                                                        }
                                                    }
                                                    catch (IOException ex26) {
                                                        throw ex26;
                                                    }
                                                }
                                                catch (IllegalArgumentException ex27) {
                                                    throw ex27;
                                                }
                                            }
                                            catch (IOException ex28) {
                                                throw ex28;
                                            }
                                        }
                                        catch (IllegalArgumentException ex29) {
                                            throw ex29;
                                        }
                                    }
                                    catch (IOException ex30) {
                                        throw ex30;
                                    }
                                }
                                catch (IllegalArgumentException ex31) {
                                    throw ex31;
                                }
                            }
                            catch (IOException ex32) {
                                throw ex32;
                            }
                        }
                        catch (IllegalArgumentException ex33) {
                            throw ex33;
                        }
                    }
                    catch (IOException ex34) {
                        throw ex34;
                    }
                }
                catch (UnsupportedOperationException ex35) {
                    throw ex35;
                }
            }
            catch (IOException ex36) {
                throw ex36;
            }
        }
    }
    
    public int a() {
        return this.s;
    }
    
    public int b() {
        return this.r;
    }
    
    public boolean c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1        /* a */
        //     4: aload_0         /* a */
        //     5: getfield        com/sun/jna/z/a/g/j.u:I
        //     8: iload_1         /* a */
        //     9: ifne            46
        //    12: bipush          6
        //    14: if_icmpeq       41
        //    17: goto            21
        //    20: athrow         
        //    21: aload_0         /* a */
        //    22: getfield        com/sun/jna/z/a/g/j.u:I
        //    25: iload_1         /* a */
        //    26: ifne            46
        //    29: goto            33
        //    32: athrow         
        //    33: iconst_4       
        //    34: if_icmpne       49
        //    37: goto            41
        //    40: athrow         
        //    41: iconst_1       
        //    42: goto            46
        //    45: athrow         
        //    46: goto            50
        //    49: iconst_0       
        //    50: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  4      17     20     21     Ljava/lang/UnsupportedOperationException;
        //  12     29     32     33     Ljava/lang/UnsupportedOperationException;
        //  21     37     40     41     Ljava/lang/UnsupportedOperationException;
        //  33     42     45     46     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0021:
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
    
    public boolean d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1        /* a */
        //     4: aload_0         /* a */
        //     5: invokevirtual   com/sun/jna/z/a/g/j.c:()Z
        //     8: iload_1         /* a */
        //     9: ifne            50
        //    12: ifne            49
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0         /* a */
        //    20: getfield        com/sun/jna/z/a/g/j.x:[B
        //    23: iload_1         /* a */
        //    24: ifne            46
        //    27: goto            31
        //    30: athrow         
        //    31: ifnonnull       49
        //    34: goto            38
        //    37: athrow         
        //    38: aload_0         /* a */
        //    39: getfield        com/sun/jna/z/a/g/j.y:[B
        //    42: goto            46
        //    45: athrow         
        //    46: ifnull          53
        //    49: iconst_1       
        //    50: goto            54
        //    53: iconst_0       
        //    54: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  4      15     18     19     Ljava/lang/UnsupportedOperationException;
        //  12     27     30     31     Ljava/lang/UnsupportedOperationException;
        //  19     34     37     38     Ljava/lang/UnsupportedOperationException;
        //  31     42     45     46     Ljava/lang/UnsupportedOperationException;
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
    
    public boolean e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1        /* a */
        //     4: aload_0         /* a */
        //     5: getfield        com/sun/jna/z/a/g/j.u:I
        //     8: iload_1         /* a */
        //     9: ifne            66
        //    12: bipush          6
        //    14: if_icmpeq       61
        //    17: goto            21
        //    20: athrow         
        //    21: aload_0         /* a */
        //    22: getfield        com/sun/jna/z/a/g/j.u:I
        //    25: iload_1         /* a */
        //    26: ifne            66
        //    29: goto            33
        //    32: athrow         
        //    33: iconst_2       
        //    34: if_icmpeq       61
        //    37: goto            41
        //    40: athrow         
        //    41: aload_0         /* a */
        //    42: getfield        com/sun/jna/z/a/g/j.u:I
        //    45: iload_1         /* a */
        //    46: ifne            66
        //    49: goto            53
        //    52: athrow         
        //    53: iconst_3       
        //    54: if_icmpne       69
        //    57: goto            61
        //    60: athrow         
        //    61: iconst_1       
        //    62: goto            66
        //    65: athrow         
        //    66: goto            70
        //    69: iconst_0       
        //    70: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  4      17     20     21     Ljava/lang/UnsupportedOperationException;
        //  12     29     32     33     Ljava/lang/UnsupportedOperationException;
        //  21     37     40     41     Ljava/lang/UnsupportedOperationException;
        //  33     49     52     53     Ljava/lang/UnsupportedOperationException;
        //  41     57     60     61     Ljava/lang/UnsupportedOperationException;
        //  53     62     65     66     Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0021:
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
    
    public void a(final byte a, final byte a, final byte a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          a
        //     5: aload_0         /* a */
        //     6: iload           a
        //     8: ifne            37
        //    11: invokevirtual   com/sun/jna/z/a/g/j.c:()Z
        //    14: ifeq            36
        //    17: goto            21
        //    20: athrow         
        //    21: new             Ljava/lang/UnsupportedOperationException;
        //    24: dup            
        //    25: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //    28: bipush          10
        //    30: aaload         
        //    31: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //    34: athrow         
        //    35: athrow         
        //    36: aload_0         /* a */
        //    37: getfield        com/sun/jna/z/a/g/j.w:[B
        //    40: astore          a
        //    42: iload           a
        //    44: ifne            112
        //    47: aload           a
        //    49: ifnonnull       97
        //    52: goto            56
        //    55: athrow         
        //    56: aload_0         /* a */
        //    57: bipush          6
        //    59: newarray        B
        //    61: dup            
        //    62: iconst_0       
        //    63: iconst_0       
        //    64: bastore        
        //    65: dup            
        //    66: iconst_1       
        //    67: iload_1         /* a */
        //    68: bastore        
        //    69: dup            
        //    70: iconst_2       
        //    71: iconst_0       
        //    72: bastore        
        //    73: dup            
        //    74: iconst_3       
        //    75: iload_2         /* a */
        //    76: bastore        
        //    77: dup            
        //    78: iconst_4       
        //    79: iconst_0       
        //    80: bastore        
        //    81: dup            
        //    82: iconst_5       
        //    83: iload_3         /* a */
        //    84: bastore        
        //    85: putfield        com/sun/jna/z/a/g/j.y:[B
        //    88: iload           a
        //    90: ifeq            215
        //    93: goto            97
        //    96: athrow         
        //    97: aload_0         /* a */
        //    98: aload           a
        //   100: arraylength    
        //   101: iconst_3       
        //   102: idiv           
        //   103: newarray        B
        //   105: putfield        com/sun/jna/z/a/g/j.x:[B
        //   108: goto            112
        //   111: athrow         
        //   112: iconst_0       
        //   113: istore          a
        //   115: iconst_0       
        //   116: istore          a
        //   118: iload           a
        //   120: aload           a
        //   122: arraylength    
        //   123: if_icmpge       215
        //   126: aload           a
        //   128: iload           a
        //   130: iload           a
        //   132: ifne            202
        //   135: baload         
        //   136: iload_1         /* a */
        //   137: if_icmpne       192
        //   140: goto            144
        //   143: athrow         
        //   144: aload           a
        //   146: iload           a
        //   148: iconst_1       
        //   149: iadd           
        //   150: iload           a
        //   152: ifne            202
        //   155: goto            159
        //   158: athrow         
        //   159: baload         
        //   160: iload_2         /* a */
        //   161: if_icmpne       192
        //   164: goto            168
        //   167: athrow         
        //   168: aload           a
        //   170: iload           a
        //   172: iconst_2       
        //   173: iadd           
        //   174: iload           a
        //   176: ifne            202
        //   179: goto            183
        //   182: athrow         
        //   183: baload         
        //   184: iload_3         /* a */
        //   185: if_icmpeq       204
        //   188: goto            192
        //   191: athrow         
        //   192: aload_0         /* a */
        //   193: getfield        com/sun/jna/z/a/g/j.x:[B
        //   196: iload           a
        //   198: goto            202
        //   201: athrow         
        //   202: iconst_m1      
        //   203: bastore        
        //   204: iinc            a, 3
        //   207: iinc            a, 1
        //   210: iload           a
        //   212: ifeq            118
        //   215: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  5      17     20     21     Ljava/lang/UnsupportedOperationException;
        //  11     35     35     36     Ljava/lang/UnsupportedOperationException;
        //  42     52     55     56     Ljava/lang/UnsupportedOperationException;
        //  47     93     96     97     Ljava/lang/UnsupportedOperationException;
        //  56     108    111    112    Ljava/lang/UnsupportedOperationException;
        //  126    140    143    144    Ljava/lang/UnsupportedOperationException;
        //  135    155    158    159    Ljava/lang/UnsupportedOperationException;
        //  144    164    167    168    Ljava/lang/UnsupportedOperationException;
        //  159    179    182    183    Ljava/lang/UnsupportedOperationException;
        //  168    188    191    192    Ljava/lang/UnsupportedOperationException;
        //  183    198    201    202    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0056:
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
    
    public b a(final b a) {
        final int a2 = com.sun.jna.z.a.g.g.b;
        Label_0241: {
            Label_0181: {
                Label_0121: {
                    Label_0069: {
                        int u = 0;
                        Label_0057: {
                            int n;
                            try {
                                n = (u = this.u);
                                if (a2 != 0) {
                                    break Label_0069;
                                }
                                switch (n) {
                                    case 2: {
                                        break Label_0057;
                                        break Label_0057;
                                    }
                                    case 6: {
                                        break Label_0121;
                                    }
                                    case 0: {
                                        break Label_0181;
                                    }
                                    case 4: {
                                        return com.sun.jna.z.a.g.b.LUMINANCE_ALPHA;
                                    }
                                    case 3: {
                                        break Label_0241;
                                    }
                                    default: {
                                        throw new UnsupportedOperationException(com.sun.jna.z.a.g.j.A[3]);
                                    }
                                }
                            }
                            catch (UnsupportedOperationException ex) {
                                throw ex;
                            }
                            try {
                                switch (n) {
                                    case 2: {
                                        u = com.sun.jna.z.a.g.k.a[a.ordinal()];
                                        break;
                                    }
                                    case 6: {
                                        break Label_0121;
                                    }
                                    case 0: {
                                        break Label_0181;
                                    }
                                    case 4: {
                                        return com.sun.jna.z.a.g.b.LUMINANCE_ALPHA;
                                    }
                                    case 3: {
                                        break Label_0241;
                                    }
                                    default: {
                                        throw new UnsupportedOperationException(com.sun.jna.z.a.g.j.A[3]);
                                    }
                                }
                            }
                            catch (UnsupportedOperationException ex2) {
                                throw ex2;
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    switch (u) {
                                                                                        case 1:
                                                                                        case 2:
                                                                                        case 3:
                                                                                        case 4: {
                                                                                            return a;
                                                                                        }
                                                                                        default: {
                                                                                            return com.sun.jna.z.a.g.b.RGB;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                catch (UnsupportedOperationException ex3) {
                                                                                    throw ex3;
                                                                                }
                                                                            }
                                                                            catch (IllegalArgumentException ex4) {
                                                                                throw ex4;
                                                                            }
                                                                        }
                                                                        catch (UnsupportedOperationException ex5) {
                                                                            throw ex5;
                                                                        }
                                                                    }
                                                                    catch (IllegalArgumentException ex6) {
                                                                        throw ex6;
                                                                    }
                                                                }
                                                                catch (UnsupportedOperationException ex7) {
                                                                    throw ex7;
                                                                }
                                                            }
                                                            catch (IllegalArgumentException ex8) {
                                                                throw ex8;
                                                            }
                                                        }
                                                        catch (UnsupportedOperationException ex9) {
                                                            throw ex9;
                                                        }
                                                    }
                                                    catch (IllegalArgumentException ex10) {
                                                        throw ex10;
                                                    }
                                                }
                                                catch (UnsupportedOperationException ex11) {
                                                    throw ex11;
                                                }
                                            }
                                            catch (IllegalArgumentException ex12) {
                                                throw ex12;
                                            }
                                        }
                                        catch (UnsupportedOperationException ex13) {
                                            throw ex13;
                                        }
                                    }
                                    catch (IllegalArgumentException ex14) {
                                        throw ex14;
                                    }
                                }
                                catch (UnsupportedOperationException ex15) {
                                    throw ex15;
                                }
                            }
                            catch (IllegalArgumentException ex16) {
                                throw ex16;
                            }
                        }
                        catch (UnsupportedOperationException ex17) {
                            throw ex17;
                        }
                    }
                    return com.sun.jna.z.a.g.b.RGB;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                switch (com.sun.jna.z.a.g.k.a[a.ordinal()]) {
                                                                                    case 1:
                                                                                    case 2:
                                                                                    case 3:
                                                                                    case 4: {
                                                                                        return a;
                                                                                    }
                                                                                    default: {
                                                                                        return com.sun.jna.z.a.g.b.RGBA;
                                                                                    }
                                                                                }
                                                                            }
                                                                            catch (UnsupportedOperationException ex18) {
                                                                                throw ex18;
                                                                            }
                                                                        }
                                                                        catch (IllegalArgumentException ex19) {
                                                                            throw ex19;
                                                                        }
                                                                    }
                                                                    catch (UnsupportedOperationException ex20) {
                                                                        throw ex20;
                                                                    }
                                                                }
                                                                catch (IllegalArgumentException ex21) {
                                                                    throw ex21;
                                                                }
                                                            }
                                                            catch (UnsupportedOperationException ex22) {
                                                                throw ex22;
                                                            }
                                                        }
                                                        catch (IllegalArgumentException ex23) {
                                                            throw ex23;
                                                        }
                                                    }
                                                    catch (UnsupportedOperationException ex24) {
                                                        throw ex24;
                                                    }
                                                }
                                                catch (IllegalArgumentException ex25) {
                                                    throw ex25;
                                                }
                                            }
                                            catch (UnsupportedOperationException ex26) {
                                                throw ex26;
                                            }
                                        }
                                        catch (IllegalArgumentException ex27) {
                                            throw ex27;
                                        }
                                    }
                                    catch (UnsupportedOperationException ex28) {
                                        throw ex28;
                                    }
                                }
                                catch (IllegalArgumentException ex29) {
                                    throw ex29;
                                }
                            }
                            catch (UnsupportedOperationException ex30) {
                                throw ex30;
                            }
                        }
                        catch (IllegalArgumentException ex31) {
                            throw ex31;
                        }
                    }
                    catch (UnsupportedOperationException ex32) {
                        throw ex32;
                    }
                }
                return com.sun.jna.z.a.g.b.RGBA;
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            switch (com.sun.jna.z.a.g.k.a[a.ordinal()]) {
                                                                                case 5:
                                                                                case 6: {
                                                                                    return a;
                                                                                }
                                                                                default: {
                                                                                    return com.sun.jna.z.a.g.b.LUMINANCE;
                                                                                }
                                                                            }
                                                                        }
                                                                        catch (UnsupportedOperationException ex33) {
                                                                            throw ex33;
                                                                        }
                                                                    }
                                                                    catch (IllegalArgumentException ex34) {
                                                                        throw ex34;
                                                                    }
                                                                }
                                                                catch (UnsupportedOperationException ex35) {
                                                                    throw ex35;
                                                                }
                                                            }
                                                            catch (IllegalArgumentException ex36) {
                                                                throw ex36;
                                                            }
                                                        }
                                                        catch (UnsupportedOperationException ex37) {
                                                            throw ex37;
                                                        }
                                                    }
                                                    catch (IllegalArgumentException ex38) {
                                                        throw ex38;
                                                    }
                                                }
                                                catch (UnsupportedOperationException ex39) {
                                                    throw ex39;
                                                }
                                            }
                                            catch (IllegalArgumentException ex40) {
                                                throw ex40;
                                            }
                                        }
                                        catch (UnsupportedOperationException ex41) {
                                            throw ex41;
                                        }
                                    }
                                    catch (IllegalArgumentException ex42) {
                                        throw ex42;
                                    }
                                }
                                catch (UnsupportedOperationException ex43) {
                                    throw ex43;
                                }
                            }
                            catch (IllegalArgumentException ex44) {
                                throw ex44;
                            }
                        }
                        catch (UnsupportedOperationException ex45) {
                            throw ex45;
                        }
                    }
                    catch (IllegalArgumentException ex46) {
                        throw ex46;
                    }
                }
                catch (UnsupportedOperationException ex47) {
                    throw ex47;
                }
            }
            return com.sun.jna.z.a.g.b.LUMINANCE;
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        switch (com.sun.jna.z.a.g.k.a[a.ordinal()]) {
                                                                            case 1:
                                                                            case 2:
                                                                            case 3: {
                                                                                return a;
                                                                            }
                                                                            default: {
                                                                                return com.sun.jna.z.a.g.b.RGBA;
                                                                            }
                                                                        }
                                                                    }
                                                                    catch (UnsupportedOperationException ex48) {
                                                                        throw ex48;
                                                                    }
                                                                }
                                                                catch (IllegalArgumentException ex49) {
                                                                    throw ex49;
                                                                }
                                                            }
                                                            catch (UnsupportedOperationException ex50) {
                                                                throw ex50;
                                                            }
                                                        }
                                                        catch (IllegalArgumentException ex51) {
                                                            throw ex51;
                                                        }
                                                    }
                                                    catch (UnsupportedOperationException ex52) {
                                                        throw ex52;
                                                    }
                                                }
                                                catch (IllegalArgumentException ex53) {
                                                    throw ex53;
                                                }
                                            }
                                            catch (UnsupportedOperationException ex54) {
                                                throw ex54;
                                            }
                                        }
                                        catch (IllegalArgumentException ex55) {
                                            throw ex55;
                                        }
                                    }
                                    catch (UnsupportedOperationException ex56) {
                                        throw ex56;
                                    }
                                }
                                catch (IllegalArgumentException ex57) {
                                    throw ex57;
                                }
                            }
                            catch (UnsupportedOperationException ex58) {
                                throw ex58;
                            }
                        }
                        catch (IllegalArgumentException ex59) {
                            throw ex59;
                        }
                    }
                    catch (UnsupportedOperationException ex60) {
                        throw ex60;
                    }
                }
                catch (IllegalArgumentException ex61) {
                    throw ex61;
                }
            }
            catch (UnsupportedOperationException ex62) {
                throw ex62;
            }
        }
        return com.sun.jna.z.a.g.b.RGBA;
    }
    
    public void a(final ByteBuffer a, final int a, final b a) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_1         /* a */
        //     4: invokevirtual   java/nio/ByteBuffer.position:()I
        //     7: istore          a
        //     9: aload_0         /* a */
        //    10: getfield        com/sun/jna/z/a/g/j.r:I
        //    13: aload_0         /* a */
        //    14: getfield        com/sun/jna/z/a/g/j.t:I
        //    17: imul           
        //    18: bipush          7
        //    20: iadd           
        //    21: bipush          8
        //    23: idiv           
        //    24: aload_0         /* a */
        //    25: getfield        com/sun/jna/z/a/g/j.v:I
        //    28: imul           
        //    29: istore          6
        //    31: istore          a
        //    33: iload           a
        //    35: iconst_1       
        //    36: iadd           
        //    37: newarray        B
        //    39: astore          a
        //    41: iload           a
        //    43: iconst_1       
        //    44: iadd           
        //    45: newarray        B
        //    47: astore          a
        //    49: aload_0         /* a */
        //    50: getfield        com/sun/jna/z/a/g/j.t:I
        //    53: bipush          8
        //    55: iload           a
        //    57: ifne            76
        //    60: if_icmpge       82
        //    63: goto            67
        //    66: athrow         
        //    67: aload_0         /* a */
        //    68: getfield        com/sun/jna/z/a/g/j.r:I
        //    71: iconst_1       
        //    72: goto            76
        //    75: athrow         
        //    76: iadd           
        //    77: newarray        B
        //    79: goto            83
        //    82: aconst_null    
        //    83: astore          a
        //    85: new             Ljava/util/zip/Inflater;
        //    88: dup            
        //    89: invokespecial   java/util/zip/Inflater.<init>:()V
        //    92: astore          a
        //    94: iconst_0       
        //    95: istore          a
        //    97: iload           a
        //    99: aload_0         /* a */
        //   100: getfield        com/sun/jna/z/a/g/j.s:I
        //   103: if_icmpge       835
        //   106: aload_0         /* a */
        //   107: aload           a
        //   109: aload           a
        //   111: iconst_0       
        //   112: aload           a
        //   114: arraylength    
        //   115: invokespecial   com/sun/jna/z/a/g/j.a:(Ljava/util/zip/Inflater;[BII)V
        //   118: aload_0         /* a */
        //   119: aload           a
        //   121: aload           a
        //   123: invokespecial   com/sun/jna/z/a/g/j.d:([B[B)V
        //   126: aload_1         /* a */
        //   127: iload           a
        //   129: iload           a
        //   131: iload_2         /* a */
        //   132: imul           
        //   133: iadd           
        //   134: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   137: pop            
        //   138: iload           a
        //   140: ifne            840
        //   143: aload_0         /* a */
        //   144: getfield        com/sun/jna/z/a/g/j.u:I
        //   147: iload           a
        //   149: ifne            213
        //   152: goto            156
        //   155: athrow         
        //   156: tableswitch {
        //                0: 446
        //                1: 802
        //                2: 201
        //                3: 574
        //                4: 514
        //                5: 802
        //                6: 326
        //          default: 802
        //        }
        //   200: athrow         
        //   201: getstatic       com/sun/jna/z/a/g/k.a:[I
        //   204: aload_3         /* a */
        //   205: invokevirtual   com/sun/jna/z/a/g/b.ordinal:()I
        //   208: iaload         
        //   209: goto            213
        //   212: athrow         
        //   213: tableswitch {
        //                2: 244
        //                3: 260
        //                4: 276
        //                5: 292
        //          default: 308
        //        }
        //   244: aload_0         /* a */
        //   245: aload_1         /* a */
        //   246: aload           a
        //   248: invokespecial   com/sun/jna/z/a/g/j.b:(Ljava/nio/ByteBuffer;[B)V
        //   251: iload           a
        //   253: ifeq            815
        //   256: goto            260
        //   259: athrow         
        //   260: aload_0         /* a */
        //   261: aload_1         /* a */
        //   262: aload           a
        //   264: invokespecial   com/sun/jna/z/a/g/j.c:(Ljava/nio/ByteBuffer;[B)V
        //   267: iload           a
        //   269: ifeq            815
        //   272: goto            276
        //   275: athrow         
        //   276: aload_0         /* a */
        //   277: aload_1         /* a */
        //   278: aload           a
        //   280: invokespecial   com/sun/jna/z/a/g/j.d:(Ljava/nio/ByteBuffer;[B)V
        //   283: iload           a
        //   285: ifeq            815
        //   288: goto            292
        //   291: athrow         
        //   292: aload_0         /* a */
        //   293: aload_1         /* a */
        //   294: aload           a
        //   296: invokespecial   com/sun/jna/z/a/g/j.a:(Ljava/nio/ByteBuffer;[B)V
        //   299: iload           a
        //   301: ifeq            815
        //   304: goto            308
        //   307: athrow         
        //   308: new             Ljava/lang/UnsupportedOperationException;
        //   311: dup            
        //   312: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   315: astore          a
        //   317: aload           a
        //   319: iconst_0       
        //   320: aaload         
        //   321: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //   324: athrow         
        //   325: athrow         
        //   326: getstatic       com/sun/jna/z/a/g/k.a:[I
        //   329: aload_3         /* a */
        //   330: invokevirtual   com/sun/jna/z/a/g/b.ordinal:()I
        //   333: iaload         
        //   334: tableswitch {
        //                2: 364
        //                3: 380
        //                4: 396
        //                5: 412
        //          default: 428
        //        }
        //   364: aload_0         /* a */
        //   365: aload_1         /* a */
        //   366: aload           a
        //   368: invokespecial   com/sun/jna/z/a/g/j.e:(Ljava/nio/ByteBuffer;[B)V
        //   371: iload           a
        //   373: ifeq            815
        //   376: goto            380
        //   379: athrow         
        //   380: aload_0         /* a */
        //   381: aload_1         /* a */
        //   382: aload           a
        //   384: invokespecial   com/sun/jna/z/a/g/j.a:(Ljava/nio/ByteBuffer;[B)V
        //   387: iload           a
        //   389: ifeq            815
        //   392: goto            396
        //   395: athrow         
        //   396: aload_0         /* a */
        //   397: aload_1         /* a */
        //   398: aload           a
        //   400: invokespecial   com/sun/jna/z/a/g/j.f:(Ljava/nio/ByteBuffer;[B)V
        //   403: iload           a
        //   405: ifeq            815
        //   408: goto            412
        //   411: athrow         
        //   412: aload_0         /* a */
        //   413: aload_1         /* a */
        //   414: aload           a
        //   416: invokespecial   com/sun/jna/z/a/g/j.g:(Ljava/nio/ByteBuffer;[B)V
        //   419: iload           a
        //   421: ifeq            815
        //   424: goto            428
        //   427: athrow         
        //   428: new             Ljava/lang/UnsupportedOperationException;
        //   431: dup            
        //   432: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   435: astore          a
        //   437: aload           a
        //   439: iconst_0       
        //   440: aaload         
        //   441: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //   444: athrow         
        //   445: athrow         
        //   446: getstatic       com/sun/jna/z/a/g/k.a:[I
        //   449: aload_3         /* a */
        //   450: invokevirtual   com/sun/jna/z/a/g/b.ordinal:()I
        //   453: iaload         
        //   454: lookupswitch {
        //                5: 480
        //                6: 480
        //          default: 496
        //        }
        //   480: aload_0         /* a */
        //   481: aload_1         /* a */
        //   482: aload           a
        //   484: invokespecial   com/sun/jna/z/a/g/j.a:(Ljava/nio/ByteBuffer;[B)V
        //   487: iload           a
        //   489: ifeq            815
        //   492: goto            496
        //   495: athrow         
        //   496: new             Ljava/lang/UnsupportedOperationException;
        //   499: dup            
        //   500: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   503: astore          a
        //   505: aload           a
        //   507: iconst_0       
        //   508: aaload         
        //   509: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //   512: athrow         
        //   513: athrow         
        //   514: getstatic       com/sun/jna/z/a/g/k.a:[I
        //   517: aload_3         /* a */
        //   518: invokevirtual   com/sun/jna/z/a/g/b.ordinal:()I
        //   521: iaload         
        //   522: lookupswitch {
        //                7: 540
        //          default: 556
        //        }
        //   540: aload_0         /* a */
        //   541: aload_1         /* a */
        //   542: aload           a
        //   544: invokespecial   com/sun/jna/z/a/g/j.a:(Ljava/nio/ByteBuffer;[B)V
        //   547: iload           a
        //   549: ifeq            815
        //   552: goto            556
        //   555: athrow         
        //   556: new             Ljava/lang/UnsupportedOperationException;
        //   559: dup            
        //   560: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   563: astore          a
        //   565: aload           a
        //   567: iconst_0       
        //   568: aaload         
        //   569: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //   572: athrow         
        //   573: athrow         
        //   574: aload_0         /* a */
        //   575: getfield        com/sun/jna/z/a/g/j.t:I
        //   578: tableswitch {
        //                2: 667
        //                3: 650
        //                4: 684
        //                5: 633
        //                6: 684
        //                7: 684
        //                8: 684
        //                9: 624
        //          default: 684
        //        }
        //   624: aload           a
        //   626: astore          a
        //   628: iload           a
        //   630: ifeq            703
        //   633: aload_0         /* a */
        //   634: aload           a
        //   636: aload           a
        //   638: invokespecial   com/sun/jna/z/a/g/j.a:([B[B)V
        //   641: iload           a
        //   643: ifeq            703
        //   646: goto            650
        //   649: athrow         
        //   650: aload_0         /* a */
        //   651: aload           a
        //   653: aload           a
        //   655: invokespecial   com/sun/jna/z/a/g/j.b:([B[B)V
        //   658: iload           a
        //   660: ifeq            703
        //   663: goto            667
        //   666: athrow         
        //   667: aload_0         /* a */
        //   668: aload           a
        //   670: aload           a
        //   672: invokespecial   com/sun/jna/z/a/g/j.c:([B[B)V
        //   675: iload           a
        //   677: ifeq            703
        //   680: goto            684
        //   683: athrow         
        //   684: new             Ljava/lang/UnsupportedOperationException;
        //   687: dup            
        //   688: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   691: astore          a
        //   693: aload           a
        //   695: bipush          6
        //   697: aaload         
        //   698: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //   701: athrow         
        //   702: athrow         
        //   703: getstatic       com/sun/jna/z/a/g/k.a:[I
        //   706: aload_3         /* a */
        //   707: invokevirtual   com/sun/jna/z/a/g/b.ordinal:()I
        //   710: iaload         
        //   711: tableswitch {
        //                2: 736
        //                3: 752
        //                4: 768
        //          default: 784
        //        }
        //   736: aload_0         /* a */
        //   737: aload_1         /* a */
        //   738: aload           a
        //   740: invokespecial   com/sun/jna/z/a/g/j.h:(Ljava/nio/ByteBuffer;[B)V
        //   743: iload           a
        //   745: ifeq            815
        //   748: goto            752
        //   751: athrow         
        //   752: aload_0         /* a */
        //   753: aload_1         /* a */
        //   754: aload           a
        //   756: invokespecial   com/sun/jna/z/a/g/j.i:(Ljava/nio/ByteBuffer;[B)V
        //   759: iload           a
        //   761: ifeq            815
        //   764: goto            768
        //   767: athrow         
        //   768: aload_0         /* a */
        //   769: aload_1         /* a */
        //   770: aload           a
        //   772: invokespecial   com/sun/jna/z/a/g/j.j:(Ljava/nio/ByteBuffer;[B)V
        //   775: iload           a
        //   777: ifeq            815
        //   780: goto            784
        //   783: athrow         
        //   784: new             Ljava/lang/UnsupportedOperationException;
        //   787: dup            
        //   788: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   791: astore          a
        //   793: aload           a
        //   795: iconst_0       
        //   796: aaload         
        //   797: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //   800: athrow         
        //   801: athrow         
        //   802: new             Ljava/lang/UnsupportedOperationException;
        //   805: dup            
        //   806: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   809: iconst_3       
        //   810: aaload         
        //   811: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //   814: athrow         
        //   815: aload           a
        //   817: astore          a
        //   819: aload           a
        //   821: astore          a
        //   823: aload           a
        //   825: astore          a
        //   827: iinc            a, 1
        //   830: iload           a
        //   832: ifeq            97
        //   835: aload           a
        //   837: invokevirtual   java/util/zip/Inflater.end:()V
        //   840: goto            853
        //   843: astore          13
        //   845: aload           a
        //   847: invokevirtual   java/util/zip/Inflater.end:()V
        //   850: aload           13
        //   852: athrow         
        //   853: return         
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  768    801    801    802    Ljava/io/IOException;
        //  752    780    783    784    Ljava/io/IOException;
        //  736    764    767    768    Ljava/io/IOException;
        //  703    748    751    752    Ljava/io/IOException;
        //  667    702    702    703    Ljava/io/IOException;
        //  650    680    683    684    Ljava/io/IOException;
        //  633    663    666    667    Ljava/io/IOException;
        //  628    646    649    650    Ljava/io/IOException;
        //  540    573    573    574    Ljava/io/IOException;
        //  514    552    555    556    Ljava/io/IOException;
        //  480    513    513    514    Ljava/io/IOException;
        //  446    492    495    496    Ljava/io/IOException;
        //  412    445    445    446    Ljava/io/IOException;
        //  396    424    427    428    Ljava/io/IOException;
        //  380    408    411    412    Ljava/io/IOException;
        //  364    392    395    396    Ljava/io/IOException;
        //  326    376    379    380    Ljava/io/IOException;
        //  292    325    325    326    Ljava/io/IOException;
        //  276    304    307    308    Ljava/io/IOException;
        //  260    288    291    292    Ljava/io/IOException;
        //  244    272    275    276    Ljava/io/IOException;
        //  213    256    259    260    Ljava/io/IOException;
        //  156    209    212    213    Ljava/io/IOException;
        //  143    200    200    201    Ljava/io/IOException;
        //  106    152    155    156    Ljava/io/IOException;
        //  60     72     75     76     Ljava/io/IOException;
        //  49     63     66     67     Ljava/io/IOException;
        //  94     835    843    853    Any
        //  843    845    843    853    Any
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
    
    public void b(final ByteBuffer a, final int a, final b a) throws IOException {
        final int a2 = com.sun.jna.z.a.g.g.b;
        int position = 0;
        Label_0037: {
            Label_0018: {
                try {
                    position = a;
                    if (a2 != 0) {
                        break Label_0037;
                    }
                    if (a <= 0) {
                        break Label_0018;
                    }
                    break Label_0018;
                }
                catch (IOException ex) {
                    throw ex;
                }
                try {
                    if (a <= 0) {
                        throw new IllegalArgumentException(com.sun.jna.z.a.g.j.A[17]);
                    }
                }
                catch (IOException ex2) {
                    throw ex2;
                }
            }
            position = a.position();
        }
        final int a3 = position;
        final int a4 = (this.s - 1) * a;
        a.position(a3 + a4);
        this.a(a, -a, a);
        a.position(a.position() + a4);
    }
    
    private void a(final ByteBuffer a, final byte[] a) {
        a.put(a, 1, a.length - 1);
    }
    
    private void b(final ByteBuffer a, final byte[] a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3        /* a */
        //     4: aload_0         /* a */
        //     5: getfield        com/sun/jna/z/a/g/j.y:[B
        //     8: iload_3         /* a */
        //     9: ifne            27
        //    12: ifnull          183
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0         /* a */
        //    20: getfield        com/sun/jna/z/a/g/j.y:[B
        //    23: goto            27
        //    26: athrow         
        //    27: iconst_1       
        //    28: baload         
        //    29: istore          a
        //    31: aload_0         /* a */
        //    32: getfield        com/sun/jna/z/a/g/j.y:[B
        //    35: iconst_3       
        //    36: baload         
        //    37: istore          a
        //    39: aload_0         /* a */
        //    40: getfield        com/sun/jna/z/a/g/j.y:[B
        //    43: iconst_5       
        //    44: baload         
        //    45: istore          a
        //    47: iconst_1       
        //    48: istore          a
        //    50: aload_2         /* a */
        //    51: arraylength    
        //    52: istore          a
        //    54: iload           a
        //    56: iload           a
        //    58: if_icmpge       179
        //    61: aload_2         /* a */
        //    62: iload           a
        //    64: baload         
        //    65: istore          a
        //    67: aload_2         /* a */
        //    68: iload           a
        //    70: iconst_1       
        //    71: iadd           
        //    72: baload         
        //    73: istore          a
        //    75: aload_2         /* a */
        //    76: iload           a
        //    78: iconst_2       
        //    79: iadd           
        //    80: baload         
        //    81: istore          a
        //    83: iconst_m1      
        //    84: istore          a
        //    86: iload_3         /* a */
        //    87: ifne            235
        //    90: iload_3         /* a */
        //    91: ifne            175
        //    94: goto            98
        //    97: athrow         
        //    98: iload           a
        //   100: iload           a
        //   102: if_icmpne       150
        //   105: goto            109
        //   108: athrow         
        //   109: iload           a
        //   111: iload           a
        //   113: iload_3         /* a */
        //   114: ifne            144
        //   117: goto            121
        //   120: athrow         
        //   121: if_icmpne       150
        //   124: goto            128
        //   127: athrow         
        //   128: iload           a
        //   130: iload_3         /* a */
        //   131: ifne            148
        //   134: goto            138
        //   137: athrow         
        //   138: iload           a
        //   140: goto            144
        //   143: athrow         
        //   144: if_icmpne       150
        //   147: iconst_0       
        //   148: istore          a
        //   150: aload_1         /* a */
        //   151: iload           a
        //   153: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   156: iload           a
        //   158: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   161: iload           a
        //   163: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   166: iload           a
        //   168: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   171: pop            
        //   172: iinc            a, 3
        //   175: iload_3         /* a */
        //   176: ifeq            54
        //   179: iload_3         /* a */
        //   180: ifeq            235
        //   183: iconst_1       
        //   184: istore          a
        //   186: aload_2         /* a */
        //   187: arraylength    
        //   188: istore          a
        //   190: iload           a
        //   192: iload           a
        //   194: if_icmpge       235
        //   197: aload_1         /* a */
        //   198: iconst_m1      
        //   199: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   202: aload_2         /* a */
        //   203: iload           a
        //   205: iconst_2       
        //   206: iadd           
        //   207: baload         
        //   208: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   211: aload_2         /* a */
        //   212: iload           a
        //   214: iconst_1       
        //   215: iadd           
        //   216: baload         
        //   217: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   220: aload_2         /* a */
        //   221: iload           a
        //   223: baload         
        //   224: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   227: pop            
        //   228: iinc            a, 3
        //   231: iload_3         /* a */
        //   232: ifeq            190
        //   235: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  4      15     18     19     Ljava/lang/UnsupportedOperationException;
        //  12     23     26     27     Ljava/lang/UnsupportedOperationException;
        //  86     94     97     98     Ljava/lang/UnsupportedOperationException;
        //  90     105    108    109    Ljava/lang/UnsupportedOperationException;
        //  98     117    120    121    Ljava/lang/UnsupportedOperationException;
        //  109    124    127    128    Ljava/lang/UnsupportedOperationException;
        //  121    134    137    138    Ljava/lang/UnsupportedOperationException;
        //  128    140    143    144    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0098:
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
    
    private void c(final ByteBuffer a, final byte[] a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3        /* a */
        //     4: aload_0         /* a */
        //     5: getfield        com/sun/jna/z/a/g/j.y:[B
        //     8: iload_3         /* a */
        //     9: ifne            27
        //    12: ifnull          183
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0         /* a */
        //    20: getfield        com/sun/jna/z/a/g/j.y:[B
        //    23: goto            27
        //    26: athrow         
        //    27: iconst_1       
        //    28: baload         
        //    29: istore          a
        //    31: aload_0         /* a */
        //    32: getfield        com/sun/jna/z/a/g/j.y:[B
        //    35: iconst_3       
        //    36: baload         
        //    37: istore          a
        //    39: aload_0         /* a */
        //    40: getfield        com/sun/jna/z/a/g/j.y:[B
        //    43: iconst_5       
        //    44: baload         
        //    45: istore          a
        //    47: iconst_1       
        //    48: istore          a
        //    50: aload_2         /* a */
        //    51: arraylength    
        //    52: istore          a
        //    54: iload           a
        //    56: iload           a
        //    58: if_icmpge       179
        //    61: aload_2         /* a */
        //    62: iload           a
        //    64: baload         
        //    65: istore          a
        //    67: aload_2         /* a */
        //    68: iload           a
        //    70: iconst_1       
        //    71: iadd           
        //    72: baload         
        //    73: istore          a
        //    75: aload_2         /* a */
        //    76: iload           a
        //    78: iconst_2       
        //    79: iadd           
        //    80: baload         
        //    81: istore          a
        //    83: iconst_m1      
        //    84: istore          a
        //    86: iload_3         /* a */
        //    87: ifne            235
        //    90: iload_3         /* a */
        //    91: ifne            175
        //    94: goto            98
        //    97: athrow         
        //    98: iload           a
        //   100: iload           a
        //   102: if_icmpne       150
        //   105: goto            109
        //   108: athrow         
        //   109: iload           a
        //   111: iload           a
        //   113: iload_3         /* a */
        //   114: ifne            144
        //   117: goto            121
        //   120: athrow         
        //   121: if_icmpne       150
        //   124: goto            128
        //   127: athrow         
        //   128: iload           a
        //   130: iload_3         /* a */
        //   131: ifne            148
        //   134: goto            138
        //   137: athrow         
        //   138: iload           a
        //   140: goto            144
        //   143: athrow         
        //   144: if_icmpne       150
        //   147: iconst_0       
        //   148: istore          a
        //   150: aload_1         /* a */
        //   151: iload           a
        //   153: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   156: iload           a
        //   158: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   161: iload           a
        //   163: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   166: iload           a
        //   168: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   171: pop            
        //   172: iinc            a, 3
        //   175: iload_3         /* a */
        //   176: ifeq            54
        //   179: iload_3         /* a */
        //   180: ifeq            235
        //   183: iconst_1       
        //   184: istore          a
        //   186: aload_2         /* a */
        //   187: arraylength    
        //   188: istore          a
        //   190: iload           a
        //   192: iload           a
        //   194: if_icmpge       235
        //   197: aload_1         /* a */
        //   198: aload_2         /* a */
        //   199: iload           a
        //   201: baload         
        //   202: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   205: aload_2         /* a */
        //   206: iload           a
        //   208: iconst_1       
        //   209: iadd           
        //   210: baload         
        //   211: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   214: aload_2         /* a */
        //   215: iload           a
        //   217: iconst_2       
        //   218: iadd           
        //   219: baload         
        //   220: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   223: iconst_m1      
        //   224: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   227: pop            
        //   228: iinc            a, 3
        //   231: iload_3         /* a */
        //   232: ifeq            190
        //   235: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  4      15     18     19     Ljava/lang/UnsupportedOperationException;
        //  12     23     26     27     Ljava/lang/UnsupportedOperationException;
        //  86     94     97     98     Ljava/lang/UnsupportedOperationException;
        //  90     105    108    109    Ljava/lang/UnsupportedOperationException;
        //  98     117    120    121    Ljava/lang/UnsupportedOperationException;
        //  109    124    127    128    Ljava/lang/UnsupportedOperationException;
        //  121    134    137    138    Ljava/lang/UnsupportedOperationException;
        //  128    140    143    144    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0098:
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
    
    private void d(final ByteBuffer a, final byte[] a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3        /* a */
        //     4: aload_0         /* a */
        //     5: getfield        com/sun/jna/z/a/g/j.y:[B
        //     8: iload_3         /* a */
        //     9: ifne            27
        //    12: ifnull          183
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0         /* a */
        //    20: getfield        com/sun/jna/z/a/g/j.y:[B
        //    23: goto            27
        //    26: athrow         
        //    27: iconst_1       
        //    28: baload         
        //    29: istore          a
        //    31: aload_0         /* a */
        //    32: getfield        com/sun/jna/z/a/g/j.y:[B
        //    35: iconst_3       
        //    36: baload         
        //    37: istore          a
        //    39: aload_0         /* a */
        //    40: getfield        com/sun/jna/z/a/g/j.y:[B
        //    43: iconst_5       
        //    44: baload         
        //    45: istore          a
        //    47: iconst_1       
        //    48: istore          a
        //    50: aload_2         /* a */
        //    51: arraylength    
        //    52: istore          a
        //    54: iload           a
        //    56: iload           a
        //    58: if_icmpge       179
        //    61: aload_2         /* a */
        //    62: iload           a
        //    64: baload         
        //    65: istore          a
        //    67: aload_2         /* a */
        //    68: iload           a
        //    70: iconst_1       
        //    71: iadd           
        //    72: baload         
        //    73: istore          a
        //    75: aload_2         /* a */
        //    76: iload           a
        //    78: iconst_2       
        //    79: iadd           
        //    80: baload         
        //    81: istore          a
        //    83: iconst_m1      
        //    84: istore          a
        //    86: iload_3         /* a */
        //    87: ifne            235
        //    90: iload_3         /* a */
        //    91: ifne            175
        //    94: goto            98
        //    97: athrow         
        //    98: iload           a
        //   100: iload           a
        //   102: if_icmpne       150
        //   105: goto            109
        //   108: athrow         
        //   109: iload           a
        //   111: iload           a
        //   113: iload_3         /* a */
        //   114: ifne            144
        //   117: goto            121
        //   120: athrow         
        //   121: if_icmpne       150
        //   124: goto            128
        //   127: athrow         
        //   128: iload           a
        //   130: iload_3         /* a */
        //   131: ifne            148
        //   134: goto            138
        //   137: athrow         
        //   138: iload           a
        //   140: goto            144
        //   143: athrow         
        //   144: if_icmpne       150
        //   147: iconst_0       
        //   148: istore          a
        //   150: aload_1         /* a */
        //   151: iload           a
        //   153: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   156: iload           a
        //   158: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   161: iload           a
        //   163: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   166: iload           a
        //   168: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   171: pop            
        //   172: iinc            a, 3
        //   175: iload_3         /* a */
        //   176: ifeq            54
        //   179: iload_3         /* a */
        //   180: ifeq            235
        //   183: iconst_1       
        //   184: istore          a
        //   186: aload_2         /* a */
        //   187: arraylength    
        //   188: istore          a
        //   190: iload           a
        //   192: iload           a
        //   194: if_icmpge       235
        //   197: aload_1         /* a */
        //   198: aload_2         /* a */
        //   199: iload           a
        //   201: iconst_2       
        //   202: iadd           
        //   203: baload         
        //   204: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   207: aload_2         /* a */
        //   208: iload           a
        //   210: iconst_1       
        //   211: iadd           
        //   212: baload         
        //   213: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   216: aload_2         /* a */
        //   217: iload           a
        //   219: baload         
        //   220: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   223: iconst_m1      
        //   224: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //   227: pop            
        //   228: iinc            a, 3
        //   231: iload_3         /* a */
        //   232: ifeq            190
        //   235: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  4      15     18     19     Ljava/lang/UnsupportedOperationException;
        //  12     23     26     27     Ljava/lang/UnsupportedOperationException;
        //  86     94     97     98     Ljava/lang/UnsupportedOperationException;
        //  90     105    108    109    Ljava/lang/UnsupportedOperationException;
        //  98     117    120    121    Ljava/lang/UnsupportedOperationException;
        //  109    124    127    128    Ljava/lang/UnsupportedOperationException;
        //  121    134    137    138    Ljava/lang/UnsupportedOperationException;
        //  128    140    143    144    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0098:
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
    
    private void e(final ByteBuffer a, final byte[] a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          4
        //     3: getstatic       com/sun/jna/z/a/g/g.b:I
        //     6: istore_3        /* a */
        //     7: aload_2         /* a */
        //     8: arraylength    
        //     9: istore          a
        //    11: iload           a
        //    13: iload           a
        //    15: if_icmpge       61
        //    18: aload_1         /* a */
        //    19: aload_2         /* a */
        //    20: iload           a
        //    22: iconst_3       
        //    23: iadd           
        //    24: baload         
        //    25: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //    28: aload_2         /* a */
        //    29: iload           a
        //    31: iconst_2       
        //    32: iadd           
        //    33: baload         
        //    34: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //    37: aload_2         /* a */
        //    38: iload           a
        //    40: iconst_1       
        //    41: iadd           
        //    42: baload         
        //    43: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //    46: aload_2         /* a */
        //    47: iload           a
        //    49: baload         
        //    50: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //    53: pop            
        //    54: iinc            a, 4
        //    57: iload_3         /* a */
        //    58: ifeq            11
        //    61: return         
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
    
    private void f(final ByteBuffer a, final byte[] a) {
        final int b = com.sun.jna.z.a.g.g.b;
        int a2 = 1;
        final int a3 = b;
        final int a4 = a.length;
        while (a2 < a4) {
            a.put(a[a2 + 2]).put(a[a2 + 1]).put(a[a2]).put(a[a2 + 3]);
            a2 += 4;
            if (a3 != 0) {
                break;
            }
        }
    }
    
    private void g(final ByteBuffer a, final byte[] a) {
        final int b = com.sun.jna.z.a.g.g.b;
        int a2 = 1;
        final int a3 = b;
        final int a4 = a.length;
        while (a2 < a4) {
            a.put(a[a2]).put(a[a2 + 1]).put(a[a2 + 2]);
            a2 += 4;
            if (a3 != 0) {
                break;
            }
        }
    }
    
    private void h(final ByteBuffer a, final byte[] a) {
        final int a2 = com.sun.jna.z.a.g.g.b;
        if (this.x != null) {
            int a3 = 1;
            final int a4 = a.length;
            while (a3 < a4) {
                final int a5 = a[a3] & 0xFF;
                final byte a6 = this.w[a5 * 3 + 0];
                final byte a7 = this.w[a5 * 3 + 1];
                final byte a8 = this.w[a5 * 3 + 2];
                final byte a9 = this.x[a5];
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            a.put(a9).put(a8).put(a7).put(a6);
                                                                            ++a3;
                                                                            if (a2 != 0) {
                                                                                return;
                                                                            }
                                                                            if (a2 == 0) {
                                                                                continue;
                                                                            }
                                                                        }
                                                                        catch (UnsupportedOperationException ex) {
                                                                            throw ex;
                                                                        }
                                                                    }
                                                                    catch (IllegalArgumentException ex2) {
                                                                        throw ex2;
                                                                    }
                                                                }
                                                                catch (UnsupportedOperationException ex3) {
                                                                    throw ex3;
                                                                }
                                                            }
                                                            catch (IllegalArgumentException ex4) {
                                                                throw ex4;
                                                            }
                                                        }
                                                        catch (UnsupportedOperationException ex5) {
                                                            throw ex5;
                                                        }
                                                    }
                                                    catch (IllegalArgumentException ex6) {
                                                        throw ex6;
                                                    }
                                                }
                                                catch (UnsupportedOperationException ex7) {
                                                    throw ex7;
                                                }
                                            }
                                            catch (IllegalArgumentException ex8) {
                                                throw ex8;
                                            }
                                        }
                                        catch (UnsupportedOperationException ex9) {
                                            throw ex9;
                                        }
                                    }
                                    catch (IllegalArgumentException ex10) {
                                        throw ex10;
                                    }
                                }
                                catch (UnsupportedOperationException ex11) {
                                    throw ex11;
                                }
                            }
                            catch (IllegalArgumentException ex12) {
                                throw ex12;
                            }
                        }
                        catch (UnsupportedOperationException ex13) {
                            throw ex13;
                        }
                    }
                    catch (IllegalArgumentException ex14) {
                        throw ex14;
                    }
                }
                catch (UnsupportedOperationException ex15) {
                    throw ex15;
                }
                break;
            }
            if (a2 == 0) {
                return;
            }
        }
        int a3 = 1;
        final int a4 = a.length;
        while (a3 < a4) {
            final int a5 = a[a3] & 0xFF;
            final byte a6 = this.w[a5 * 3 + 0];
            final byte a7 = this.w[a5 * 3 + 1];
            final byte a8 = this.w[a5 * 3 + 2];
            final byte a9 = -1;
            a.put(a9).put(a8).put(a7).put(a6);
            ++a3;
            if (a2 != 0) {
                break;
            }
        }
    }
    
    private void i(final ByteBuffer a, final byte[] a) {
        final int a2 = com.sun.jna.z.a.g.g.b;
        if (this.x != null) {
            int a3 = 1;
            final int a4 = a.length;
            while (a3 < a4) {
                final int a5 = a[a3] & 0xFF;
                final byte a6 = this.w[a5 * 3 + 0];
                final byte a7 = this.w[a5 * 3 + 1];
                final byte a8 = this.w[a5 * 3 + 2];
                final byte a9 = this.x[a5];
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            a.put(a6).put(a7).put(a8).put(a9);
                                                                            ++a3;
                                                                            if (a2 != 0) {
                                                                                return;
                                                                            }
                                                                            if (a2 == 0) {
                                                                                continue;
                                                                            }
                                                                        }
                                                                        catch (UnsupportedOperationException ex) {
                                                                            throw ex;
                                                                        }
                                                                    }
                                                                    catch (IllegalArgumentException ex2) {
                                                                        throw ex2;
                                                                    }
                                                                }
                                                                catch (UnsupportedOperationException ex3) {
                                                                    throw ex3;
                                                                }
                                                            }
                                                            catch (IllegalArgumentException ex4) {
                                                                throw ex4;
                                                            }
                                                        }
                                                        catch (UnsupportedOperationException ex5) {
                                                            throw ex5;
                                                        }
                                                    }
                                                    catch (IllegalArgumentException ex6) {
                                                        throw ex6;
                                                    }
                                                }
                                                catch (UnsupportedOperationException ex7) {
                                                    throw ex7;
                                                }
                                            }
                                            catch (IllegalArgumentException ex8) {
                                                throw ex8;
                                            }
                                        }
                                        catch (UnsupportedOperationException ex9) {
                                            throw ex9;
                                        }
                                    }
                                    catch (IllegalArgumentException ex10) {
                                        throw ex10;
                                    }
                                }
                                catch (UnsupportedOperationException ex11) {
                                    throw ex11;
                                }
                            }
                            catch (IllegalArgumentException ex12) {
                                throw ex12;
                            }
                        }
                        catch (UnsupportedOperationException ex13) {
                            throw ex13;
                        }
                    }
                    catch (IllegalArgumentException ex14) {
                        throw ex14;
                    }
                }
                catch (UnsupportedOperationException ex15) {
                    throw ex15;
                }
                break;
            }
            if (a2 == 0) {
                return;
            }
        }
        int a3 = 1;
        final int a4 = a.length;
        while (a3 < a4) {
            final int a5 = a[a3] & 0xFF;
            final byte a6 = this.w[a5 * 3 + 0];
            final byte a7 = this.w[a5 * 3 + 1];
            final byte a8 = this.w[a5 * 3 + 2];
            final byte a9 = -1;
            a.put(a6).put(a7).put(a8).put(a9);
            ++a3;
            if (a2 != 0) {
                break;
            }
        }
    }
    
    private void j(final ByteBuffer a, final byte[] a) {
        final int a2 = com.sun.jna.z.a.g.g.b;
        if (this.x != null) {
            int a3 = 1;
            final int a4 = a.length;
            while (a3 < a4) {
                final int a5 = a[a3] & 0xFF;
                final byte a6 = this.w[a5 * 3 + 0];
                final byte a7 = this.w[a5 * 3 + 1];
                final byte a8 = this.w[a5 * 3 + 2];
                final byte a9 = this.x[a5];
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            a.put(a8).put(a7).put(a6).put(a9);
                                                                            ++a3;
                                                                            if (a2 != 0) {
                                                                                return;
                                                                            }
                                                                            if (a2 == 0) {
                                                                                continue;
                                                                            }
                                                                        }
                                                                        catch (UnsupportedOperationException ex) {
                                                                            throw ex;
                                                                        }
                                                                    }
                                                                    catch (IllegalArgumentException ex2) {
                                                                        throw ex2;
                                                                    }
                                                                }
                                                                catch (UnsupportedOperationException ex3) {
                                                                    throw ex3;
                                                                }
                                                            }
                                                            catch (IllegalArgumentException ex4) {
                                                                throw ex4;
                                                            }
                                                        }
                                                        catch (UnsupportedOperationException ex5) {
                                                            throw ex5;
                                                        }
                                                    }
                                                    catch (IllegalArgumentException ex6) {
                                                        throw ex6;
                                                    }
                                                }
                                                catch (UnsupportedOperationException ex7) {
                                                    throw ex7;
                                                }
                                            }
                                            catch (IllegalArgumentException ex8) {
                                                throw ex8;
                                            }
                                        }
                                        catch (UnsupportedOperationException ex9) {
                                            throw ex9;
                                        }
                                    }
                                    catch (IllegalArgumentException ex10) {
                                        throw ex10;
                                    }
                                }
                                catch (UnsupportedOperationException ex11) {
                                    throw ex11;
                                }
                            }
                            catch (IllegalArgumentException ex12) {
                                throw ex12;
                            }
                        }
                        catch (UnsupportedOperationException ex13) {
                            throw ex13;
                        }
                    }
                    catch (IllegalArgumentException ex14) {
                        throw ex14;
                    }
                }
                catch (UnsupportedOperationException ex15) {
                    throw ex15;
                }
                break;
            }
            if (a2 == 0) {
                return;
            }
        }
        int a3 = 1;
        final int a4 = a.length;
        while (a3 < a4) {
            final int a5 = a[a3] & 0xFF;
            final byte a6 = this.w[a5 * 3 + 0];
            final byte a7 = this.w[a5 * 3 + 1];
            final byte a8 = this.w[a5 * 3 + 2];
            final byte a9 = -1;
            a.put(a8).put(a7).put(a6).put(a9);
            ++a3;
            if (a2 != 0) {
                break;
            }
        }
    }
    
    private void a(final byte[] a, final byte[] a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: iconst_1       
        //     4: istore          a
        //     6: aload_2         /* a */
        //     7: arraylength    
        //     8: istore          5
        //    10: istore_3        /* a */
        //    11: iload           a
        //    13: iload           a
        //    15: if_icmpge       93
        //    18: aload_1         /* a */
        //    19: iconst_1       
        //    20: iload           a
        //    22: iconst_1       
        //    23: ishr           
        //    24: iadd           
        //    25: baload         
        //    26: sipush          255
        //    29: iand           
        //    30: istore          a
        //    32: iload_3         /* a */
        //    33: ifne            89
        //    36: iload           a
        //    38: iload           a
        //    40: isub           
        //    41: lookupswitch {
        //                1: 77
        //          default: 61
        //        }
        //    60: athrow         
        //    61: aload_2         /* a */
        //    62: iload           a
        //    64: iconst_1       
        //    65: iadd           
        //    66: iload           a
        //    68: bipush          15
        //    70: iand           
        //    71: i2b            
        //    72: bastore        
        //    73: goto            77
        //    76: athrow         
        //    77: aload_2         /* a */
        //    78: iload           a
        //    80: iload           a
        //    82: iconst_4       
        //    83: ishr           
        //    84: i2b            
        //    85: bastore        
        //    86: iinc            a, 2
        //    89: iload_3         /* a */
        //    90: ifeq            11
        //    93: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  32     60     60     61     Ljava/lang/UnsupportedOperationException;
        //  36     73     76     77     Ljava/lang/UnsupportedOperationException;
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
    
    private void b(final byte[] a, final byte[] a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          a
        //     3: getstatic       com/sun/jna/z/a/g/g.b:I
        //     6: aload_2         /* a */
        //     7: arraylength    
        //     8: istore          5
        //    10: istore_3        /* a */
        //    11: iload           a
        //    13: iload           a
        //    15: if_icmpge       127
        //    18: aload_1         /* a */
        //    19: iconst_1       
        //    20: iload           a
        //    22: iconst_2       
        //    23: ishr           
        //    24: iadd           
        //    25: baload         
        //    26: sipush          255
        //    29: iand           
        //    30: istore          a
        //    32: iload_3         /* a */
        //    33: ifne            123
        //    36: iload           a
        //    38: iload           a
        //    40: isub           
        //    41: tableswitch {
        //                2: 110
        //                3: 97
        //                4: 84
        //          default: 69
        //        }
        //    68: athrow         
        //    69: aload_2         /* a */
        //    70: iload           a
        //    72: iconst_3       
        //    73: iadd           
        //    74: iload           a
        //    76: iconst_3       
        //    77: iand           
        //    78: i2b            
        //    79: bastore        
        //    80: goto            84
        //    83: athrow         
        //    84: aload_2         /* a */
        //    85: iload           a
        //    87: iconst_2       
        //    88: iadd           
        //    89: iload           a
        //    91: iconst_2       
        //    92: ishr           
        //    93: iconst_3       
        //    94: iand           
        //    95: i2b            
        //    96: bastore        
        //    97: aload_2         /* a */
        //    98: iload           a
        //   100: iconst_1       
        //   101: iadd           
        //   102: iload           a
        //   104: iconst_4       
        //   105: ishr           
        //   106: iconst_3       
        //   107: iand           
        //   108: i2b            
        //   109: bastore        
        //   110: aload_2         /* a */
        //   111: iload           a
        //   113: iload           a
        //   115: bipush          6
        //   117: ishr           
        //   118: i2b            
        //   119: bastore        
        //   120: iinc            a, 4
        //   123: iload_3         /* a */
        //   124: ifeq            11
        //   127: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  32     68     68     69     Ljava/lang/UnsupportedOperationException;
        //  36     80     83     84     Ljava/lang/UnsupportedOperationException;
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
    
    private void c(final byte[] a, final byte[] a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: iconst_1       
        //     4: istore          4
        //     6: istore_3        /* a */
        //     7: aload_2         /* a */
        //     8: arraylength    
        //     9: istore          a
        //    11: iload           a
        //    13: iload           a
        //    15: if_icmpge       198
        //    18: aload_1         /* a */
        //    19: iconst_1       
        //    20: iload           a
        //    22: iconst_3       
        //    23: ishr           
        //    24: iadd           
        //    25: baload         
        //    26: sipush          255
        //    29: iand           
        //    30: istore          a
        //    32: iload_3         /* a */
        //    33: ifne            194
        //    36: iload           a
        //    38: iload           a
        //    40: isub           
        //    41: tableswitch {
        //                2: 181
        //                3: 167
        //                4: 154
        //                5: 141
        //                6: 128
        //                7: 115
        //                8: 101
        //          default: 85
        //        }
        //    84: athrow         
        //    85: aload_2         /* a */
        //    86: iload           a
        //    88: bipush          7
        //    90: iadd           
        //    91: iload           a
        //    93: iconst_1       
        //    94: iand           
        //    95: i2b            
        //    96: bastore        
        //    97: goto            101
        //   100: athrow         
        //   101: aload_2         /* a */
        //   102: iload           a
        //   104: bipush          6
        //   106: iadd           
        //   107: iload           a
        //   109: iconst_1       
        //   110: ishr           
        //   111: iconst_1       
        //   112: iand           
        //   113: i2b            
        //   114: bastore        
        //   115: aload_2         /* a */
        //   116: iload           a
        //   118: iconst_5       
        //   119: iadd           
        //   120: iload           a
        //   122: iconst_2       
        //   123: ishr           
        //   124: iconst_1       
        //   125: iand           
        //   126: i2b            
        //   127: bastore        
        //   128: aload_2         /* a */
        //   129: iload           a
        //   131: iconst_4       
        //   132: iadd           
        //   133: iload           a
        //   135: iconst_3       
        //   136: ishr           
        //   137: iconst_1       
        //   138: iand           
        //   139: i2b            
        //   140: bastore        
        //   141: aload_2         /* a */
        //   142: iload           a
        //   144: iconst_3       
        //   145: iadd           
        //   146: iload           a
        //   148: iconst_4       
        //   149: ishr           
        //   150: iconst_1       
        //   151: iand           
        //   152: i2b            
        //   153: bastore        
        //   154: aload_2         /* a */
        //   155: iload           a
        //   157: iconst_2       
        //   158: iadd           
        //   159: iload           a
        //   161: iconst_5       
        //   162: ishr           
        //   163: iconst_1       
        //   164: iand           
        //   165: i2b            
        //   166: bastore        
        //   167: aload_2         /* a */
        //   168: iload           a
        //   170: iconst_1       
        //   171: iadd           
        //   172: iload           a
        //   174: bipush          6
        //   176: ishr           
        //   177: iconst_1       
        //   178: iand           
        //   179: i2b            
        //   180: bastore        
        //   181: aload_2         /* a */
        //   182: iload           a
        //   184: iload           a
        //   186: bipush          7
        //   188: ishr           
        //   189: i2b            
        //   190: bastore        
        //   191: iinc            a, 8
        //   194: iload_3         /* a */
        //   195: ifeq            11
        //   198: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  32     84     84     85     Ljava/lang/UnsupportedOperationException;
        //  36     97     100    101    Ljava/lang/UnsupportedOperationException;
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
    
    private void d(final byte[] a, final byte[] a) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3        /* a */
        //     4: aload_1         /* a */
        //     5: iconst_0       
        //     6: baload         
        //     7: tableswitch {
        //                0: 40
        //                1: 48
        //                2: 61
        //                3: 75
        //                4: 89
        //          default: 103
        //        }
        //    40: iload_3         /* a */
        //    41: ifeq            137
        //    44: goto            48
        //    47: athrow         
        //    48: aload_0         /* a */
        //    49: aload_1         /* a */
        //    50: invokespecial   com/sun/jna/z/a/g/j.a:([B)V
        //    53: iload_3         /* a */
        //    54: ifeq            137
        //    57: goto            61
        //    60: athrow         
        //    61: aload_0         /* a */
        //    62: aload_1         /* a */
        //    63: aload_2         /* a */
        //    64: invokespecial   com/sun/jna/z/a/g/j.e:([B[B)V
        //    67: iload_3         /* a */
        //    68: ifeq            137
        //    71: goto            75
        //    74: athrow         
        //    75: aload_0         /* a */
        //    76: aload_1         /* a */
        //    77: aload_2         /* a */
        //    78: invokespecial   com/sun/jna/z/a/g/j.f:([B[B)V
        //    81: iload_3         /* a */
        //    82: ifeq            137
        //    85: goto            89
        //    88: athrow         
        //    89: aload_0         /* a */
        //    90: aload_1         /* a */
        //    91: aload_2         /* a */
        //    92: invokespecial   com/sun/jna/z/a/g/j.g:([B[B)V
        //    95: iload_3         /* a */
        //    96: ifeq            137
        //    99: goto            103
        //   102: athrow         
        //   103: new             Ljava/io/IOException;
        //   106: dup            
        //   107: new             Ljava/lang/StringBuilder;
        //   110: dup            
        //   111: invokespecial   java/lang/StringBuilder.<init>:()V
        //   114: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   117: bipush          12
        //   119: aaload         
        //   120: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   123: aload_1         /* a */
        //   124: iconst_0       
        //   125: baload         
        //   126: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   129: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   132: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   135: athrow         
        //   136: athrow         
        //   137: return         
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      44     47     48     Ljava/io/IOException;
        //  40     57     60     61     Ljava/io/IOException;
        //  48     71     74     75     Ljava/io/IOException;
        //  61     85     88     89     Ljava/io/IOException;
        //  75     99     102    103    Ljava/io/IOException;
        //  89     136    136    137    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
    
    private void a(final byte[] a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/sun/jna/z/a/g/j.v:I
        //     4: istore_3        /* a */
        //     5: getstatic       com/sun/jna/z/a/g/g.b:I
        //     8: iload_3         /* a */
        //     9: iconst_1       
        //    10: iadd           
        //    11: istore          4
        //    13: istore_2        /* a */
        //    14: aload_1         /* a */
        //    15: arraylength    
        //    16: istore          a
        //    18: iload           a
        //    20: iload           a
        //    22: if_icmpge       46
        //    25: aload_1         /* a */
        //    26: iload           a
        //    28: dup2           
        //    29: baload         
        //    30: aload_1         /* a */
        //    31: iload           a
        //    33: iload_3         /* a */
        //    34: isub           
        //    35: baload         
        //    36: iadd           
        //    37: i2b            
        //    38: bastore        
        //    39: iinc            a, 1
        //    42: iload_2         /* a */
        //    43: ifeq            18
        //    46: return         
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
    
    private void e(final byte[] a, final byte[] a) {
        final int b = com.sun.jna.z.a.g.g.b;
        final int a2 = this.v;
        final int a3 = b;
        int a4 = 1;
        final int a5 = a.length;
        while (a4 < a5) {
            final int n = a4;
            a[n] += a[a4];
            ++a4;
            if (a3 != 0) {
                break;
            }
        }
    }
    
    private void f(final byte[] a, final byte[] a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/sun/jna/z/a/g/j.v:I
        //     4: istore          4
        //     6: getstatic       com/sun/jna/z/a/g/g.b:I
        //     9: iconst_1       
        //    10: istore          5
        //    12: istore_3        /* a */
        //    13: iload           a
        //    15: iload           a
        //    17: if_icmpgt       110
        //    20: aload_1         /* a */
        //    21: iload_3         /* a */
        //    22: ifne            111
        //    25: iload           a
        //    27: dup2           
        //    28: baload         
        //    29: aload_2         /* a */
        //    30: iload           a
        //    32: baload         
        //    33: sipush          255
        //    36: iand           
        //    37: iconst_1       
        //    38: iushr          
        //    39: i2b            
        //    40: iadd           
        //    41: i2b            
        //    42: bastore        
        //    43: iinc            a, 1
        //    46: iload_3         /* a */
        //    47: ifeq            13
        //    50: goto            54
        //    53: athrow         
        //    54: goto            58
        //    57: athrow         
        //    58: goto            62
        //    61: athrow         
        //    62: goto            66
        //    65: athrow         
        //    66: goto            70
        //    69: athrow         
        //    70: goto            74
        //    73: athrow         
        //    74: goto            78
        //    77: athrow         
        //    78: goto            82
        //    81: athrow         
        //    82: goto            86
        //    85: athrow         
        //    86: goto            90
        //    89: athrow         
        //    90: goto            94
        //    93: athrow         
        //    94: goto            98
        //    97: athrow         
        //    98: goto            102
        //   101: athrow         
        //   102: goto            106
        //   105: athrow         
        //   106: goto            110
        //   109: athrow         
        //   110: aload_1         /* a */
        //   111: arraylength    
        //   112: istore          a
        //   114: iload           a
        //   116: iload           a
        //   118: if_icmpge       159
        //   121: aload_1         /* a */
        //   122: iload           a
        //   124: dup2           
        //   125: baload         
        //   126: aload_2         /* a */
        //   127: iload           a
        //   129: baload         
        //   130: sipush          255
        //   133: iand           
        //   134: aload_1         /* a */
        //   135: iload           a
        //   137: iload           a
        //   139: isub           
        //   140: baload         
        //   141: sipush          255
        //   144: iand           
        //   145: iadd           
        //   146: iconst_1       
        //   147: iushr          
        //   148: i2b            
        //   149: iadd           
        //   150: i2b            
        //   151: bastore        
        //   152: iinc            a, 1
        //   155: iload_3         /* a */
        //   156: ifeq            114
        //   159: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  20     50     53     54     Ljava/lang/UnsupportedOperationException;
        //  20     54     57     58     Ljava/lang/IllegalArgumentException;
        //  20     58     61     62     Ljava/lang/UnsupportedOperationException;
        //  20     62     65     66     Ljava/lang/IllegalArgumentException;
        //  20     66     69     70     Ljava/lang/UnsupportedOperationException;
        //  20     70     73     74     Ljava/lang/IllegalArgumentException;
        //  20     74     77     78     Ljava/lang/UnsupportedOperationException;
        //  20     78     81     82     Ljava/lang/IllegalArgumentException;
        //  20     82     85     86     Ljava/lang/UnsupportedOperationException;
        //  20     86     89     90     Ljava/lang/IllegalArgumentException;
        //  20     90     93     94     Ljava/lang/UnsupportedOperationException;
        //  20     94     97     98     Ljava/lang/IllegalArgumentException;
        //  20     98     101    102    Ljava/lang/UnsupportedOperationException;
        //  20     102    105    106    Ljava/lang/IllegalArgumentException;
        //  20     106    109    110    Ljava/lang/UnsupportedOperationException;
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
    
    private void g(final byte[] a, final byte[] a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0         /* a */
        //     4: getfield        com/sun/jna/z/a/g/j.v:I
        //     7: istore          a
        //     9: iconst_1       
        //    10: istore          5
        //    12: istore_3        /* a */
        //    13: iload           a
        //    15: iload           a
        //    17: if_icmpgt       103
        //    20: aload_1         /* a */
        //    21: iload_3         /* a */
        //    22: ifne            104
        //    25: iload           a
        //    27: dup2           
        //    28: baload         
        //    29: aload_2         /* a */
        //    30: iload           a
        //    32: baload         
        //    33: iadd           
        //    34: i2b            
        //    35: bastore        
        //    36: iinc            a, 1
        //    39: iload_3         /* a */
        //    40: ifeq            13
        //    43: goto            47
        //    46: athrow         
        //    47: goto            51
        //    50: athrow         
        //    51: goto            55
        //    54: athrow         
        //    55: goto            59
        //    58: athrow         
        //    59: goto            63
        //    62: athrow         
        //    63: goto            67
        //    66: athrow         
        //    67: goto            71
        //    70: athrow         
        //    71: goto            75
        //    74: athrow         
        //    75: goto            79
        //    78: athrow         
        //    79: goto            83
        //    82: athrow         
        //    83: goto            87
        //    86: athrow         
        //    87: goto            91
        //    90: athrow         
        //    91: goto            95
        //    94: athrow         
        //    95: goto            99
        //    98: athrow         
        //    99: goto            103
        //   102: athrow         
        //   103: aload_1         /* a */
        //   104: arraylength    
        //   105: istore          a
        //   107: iload           a
        //   109: iload           a
        //   111: if_icmpge       486
        //   114: aload_1         /* a */
        //   115: iload           a
        //   117: iload           a
        //   119: isub           
        //   120: baload         
        //   121: sipush          255
        //   124: iand           
        //   125: istore          a
        //   127: aload_2         /* a */
        //   128: iload           a
        //   130: baload         
        //   131: sipush          255
        //   134: iand           
        //   135: istore          a
        //   137: aload_2         /* a */
        //   138: iload           a
        //   140: iload           a
        //   142: isub           
        //   143: baload         
        //   144: sipush          255
        //   147: iand           
        //   148: istore          a
        //   150: iload           a
        //   152: iload           a
        //   154: iadd           
        //   155: iload           a
        //   157: isub           
        //   158: istore          a
        //   160: iload           a
        //   162: iload           a
        //   164: isub           
        //   165: istore          a
        //   167: iload           a
        //   169: iload_3         /* a */
        //   170: ifne            246
        //   173: ifge            241
        //   176: goto            180
        //   179: athrow         
        //   180: goto            184
        //   183: athrow         
        //   184: goto            188
        //   187: athrow         
        //   188: goto            192
        //   191: athrow         
        //   192: goto            196
        //   195: athrow         
        //   196: goto            200
        //   199: athrow         
        //   200: goto            204
        //   203: athrow         
        //   204: goto            208
        //   207: athrow         
        //   208: goto            212
        //   211: athrow         
        //   212: goto            216
        //   215: athrow         
        //   216: goto            220
        //   219: athrow         
        //   220: goto            224
        //   223: athrow         
        //   224: goto            228
        //   227: athrow         
        //   228: goto            232
        //   231: athrow         
        //   232: goto            236
        //   235: athrow         
        //   236: iload           a
        //   238: ineg           
        //   239: istore          a
        //   241: iload           a
        //   243: iload           a
        //   245: isub           
        //   246: istore          a
        //   248: iload           a
        //   250: iload_3         /* a */
        //   251: ifne            327
        //   254: ifge            322
        //   257: goto            261
        //   260: athrow         
        //   261: goto            265
        //   264: athrow         
        //   265: goto            269
        //   268: athrow         
        //   269: goto            273
        //   272: athrow         
        //   273: goto            277
        //   276: athrow         
        //   277: goto            281
        //   280: athrow         
        //   281: goto            285
        //   284: athrow         
        //   285: goto            289
        //   288: athrow         
        //   289: goto            293
        //   292: athrow         
        //   293: goto            297
        //   296: athrow         
        //   297: goto            301
        //   300: athrow         
        //   301: goto            305
        //   304: athrow         
        //   305: goto            309
        //   308: athrow         
        //   309: goto            313
        //   312: athrow         
        //   313: goto            317
        //   316: athrow         
        //   317: iload           a
        //   319: ineg           
        //   320: istore          a
        //   322: iload           a
        //   324: iload           a
        //   326: isub           
        //   327: istore          a
        //   329: iload           a
        //   331: iload_3         /* a */
        //   332: ifne            405
        //   335: ifge            403
        //   338: goto            342
        //   341: athrow         
        //   342: goto            346
        //   345: athrow         
        //   346: goto            350
        //   349: athrow         
        //   350: goto            354
        //   353: athrow         
        //   354: goto            358
        //   357: athrow         
        //   358: goto            362
        //   361: athrow         
        //   362: goto            366
        //   365: athrow         
        //   366: goto            370
        //   369: athrow         
        //   370: goto            374
        //   373: athrow         
        //   374: goto            378
        //   377: athrow         
        //   378: goto            382
        //   381: athrow         
        //   382: goto            386
        //   385: athrow         
        //   386: goto            390
        //   389: athrow         
        //   390: goto            394
        //   393: athrow         
        //   394: goto            398
        //   397: athrow         
        //   398: iload           a
        //   400: ineg           
        //   401: istore          a
        //   403: iload           a
        //   405: iload           a
        //   407: iload_3         /* a */
        //   408: ifne            461
        //   411: if_icmpgt       445
        //   414: goto            418
        //   417: athrow         
        //   418: iload           a
        //   420: iload           a
        //   422: iload_3         /* a */
        //   423: ifne            461
        //   426: goto            430
        //   429: athrow         
        //   430: if_icmpgt       445
        //   433: goto            437
        //   436: athrow         
        //   437: iload           a
        //   439: istore          a
        //   441: iload_3         /* a */
        //   442: ifeq            468
        //   445: iload           a
        //   447: iload_3         /* a */
        //   448: ifne            466
        //   451: goto            455
        //   454: athrow         
        //   455: iload           a
        //   457: goto            461
        //   460: athrow         
        //   461: if_icmpgt       468
        //   464: iload           a
        //   466: istore          a
        //   468: aload_1         /* a */
        //   469: iload           a
        //   471: dup2           
        //   472: baload         
        //   473: iload           a
        //   475: i2b            
        //   476: iadd           
        //   477: i2b            
        //   478: bastore        
        //   479: iinc            a, 1
        //   482: iload_3         /* a */
        //   483: ifeq            107
        //   486: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  20     43     46     47     Ljava/lang/UnsupportedOperationException;
        //  20     47     50     51     Ljava/lang/IllegalArgumentException;
        //  20     51     54     55     Ljava/lang/UnsupportedOperationException;
        //  20     55     58     59     Ljava/lang/IllegalArgumentException;
        //  20     59     62     63     Ljava/lang/UnsupportedOperationException;
        //  20     63     66     67     Ljava/lang/IllegalArgumentException;
        //  20     67     70     71     Ljava/lang/UnsupportedOperationException;
        //  20     71     74     75     Ljava/lang/IllegalArgumentException;
        //  20     75     78     79     Ljava/lang/UnsupportedOperationException;
        //  20     79     82     83     Ljava/lang/IllegalArgumentException;
        //  20     83     86     87     Ljava/lang/UnsupportedOperationException;
        //  20     87     90     91     Ljava/lang/IllegalArgumentException;
        //  20     91     94     95     Ljava/lang/UnsupportedOperationException;
        //  20     95     98     99     Ljava/lang/IllegalArgumentException;
        //  20     99     102    103    Ljava/lang/UnsupportedOperationException;
        //  167    176    179    180    Ljava/lang/UnsupportedOperationException;
        //  167    180    183    184    Ljava/lang/IllegalArgumentException;
        //  167    184    187    188    Ljava/lang/UnsupportedOperationException;
        //  167    188    191    192    Ljava/lang/IllegalArgumentException;
        //  167    192    195    196    Ljava/lang/UnsupportedOperationException;
        //  167    196    199    200    Ljava/lang/IllegalArgumentException;
        //  167    200    203    204    Ljava/lang/UnsupportedOperationException;
        //  167    204    207    208    Ljava/lang/IllegalArgumentException;
        //  167    208    211    212    Ljava/lang/UnsupportedOperationException;
        //  167    212    215    216    Ljava/lang/IllegalArgumentException;
        //  167    216    219    220    Ljava/lang/UnsupportedOperationException;
        //  167    220    223    224    Ljava/lang/IllegalArgumentException;
        //  167    224    227    228    Ljava/lang/UnsupportedOperationException;
        //  167    228    231    232    Ljava/lang/IllegalArgumentException;
        //  167    232    235    236    Ljava/lang/UnsupportedOperationException;
        //  248    257    260    261    Ljava/lang/UnsupportedOperationException;
        //  248    261    264    265    Ljava/lang/IllegalArgumentException;
        //  248    265    268    269    Ljava/lang/UnsupportedOperationException;
        //  248    269    272    273    Ljava/lang/IllegalArgumentException;
        //  248    273    276    277    Ljava/lang/UnsupportedOperationException;
        //  248    277    280    281    Ljava/lang/IllegalArgumentException;
        //  248    281    284    285    Ljava/lang/UnsupportedOperationException;
        //  248    285    288    289    Ljava/lang/IllegalArgumentException;
        //  248    289    292    293    Ljava/lang/UnsupportedOperationException;
        //  248    293    296    297    Ljava/lang/IllegalArgumentException;
        //  248    297    300    301    Ljava/lang/UnsupportedOperationException;
        //  248    301    304    305    Ljava/lang/IllegalArgumentException;
        //  248    305    308    309    Ljava/lang/UnsupportedOperationException;
        //  248    309    312    313    Ljava/lang/IllegalArgumentException;
        //  248    313    316    317    Ljava/lang/UnsupportedOperationException;
        //  329    338    341    342    Ljava/lang/UnsupportedOperationException;
        //  329    342    345    346    Ljava/lang/IllegalArgumentException;
        //  329    346    349    350    Ljava/lang/UnsupportedOperationException;
        //  329    350    353    354    Ljava/lang/IllegalArgumentException;
        //  329    354    357    358    Ljava/lang/UnsupportedOperationException;
        //  329    358    361    362    Ljava/lang/IllegalArgumentException;
        //  329    362    365    366    Ljava/lang/UnsupportedOperationException;
        //  329    366    369    370    Ljava/lang/IllegalArgumentException;
        //  329    370    373    374    Ljava/lang/UnsupportedOperationException;
        //  329    374    377    378    Ljava/lang/IllegalArgumentException;
        //  329    378    381    382    Ljava/lang/UnsupportedOperationException;
        //  329    382    385    386    Ljava/lang/IllegalArgumentException;
        //  329    386    389    390    Ljava/lang/UnsupportedOperationException;
        //  329    390    393    394    Ljava/lang/IllegalArgumentException;
        //  329    394    397    398    Ljava/lang/UnsupportedOperationException;
        //  405    414    417    418    Ljava/lang/UnsupportedOperationException;
        //  411    426    429    430    Ljava/lang/UnsupportedOperationException;
        //  418    433    436    437    Ljava/lang/UnsupportedOperationException;
        //  441    451    454    455    Ljava/lang/UnsupportedOperationException;
        //  445    457    460    461    Ljava/lang/UnsupportedOperationException;
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
    
    private void f() throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: bipush          13
        //     3: invokespecial   com/sun/jna/z/a/g/j.b:(I)V
        //     6: aload_0         /* a */
        //     7: aload_0         /* a */
        //     8: getfield        com/sun/jna/z/a/g/j.n:[B
        //    11: iconst_0       
        //    12: bipush          13
        //    14: invokespecial   com/sun/jna/z/a/g/j.a:([BII)I
        //    17: pop            
        //    18: aload_0         /* a */
        //    19: aload_0         /* a */
        //    20: aload_0         /* a */
        //    21: getfield        com/sun/jna/z/a/g/j.n:[B
        //    24: iconst_0       
        //    25: invokespecial   com/sun/jna/z/a/g/j.a:([BI)I
        //    28: putfield        com/sun/jna/z/a/g/j.r:I
        //    31: aload_0         /* a */
        //    32: aload_0         /* a */
        //    33: aload_0         /* a */
        //    34: getfield        com/sun/jna/z/a/g/j.n:[B
        //    37: iconst_4       
        //    38: invokespecial   com/sun/jna/z/a/g/j.a:([BI)I
        //    41: putfield        com/sun/jna/z/a/g/j.s:I
        //    44: getstatic       com/sun/jna/z/a/g/g.b:I
        //    47: istore_1        /* a */
        //    48: aload_0         /* a */
        //    49: aload_0         /* a */
        //    50: getfield        com/sun/jna/z/a/g/j.n:[B
        //    53: bipush          8
        //    55: baload         
        //    56: sipush          255
        //    59: iand           
        //    60: putfield        com/sun/jna/z/a/g/j.t:I
        //    63: aload_0         /* a */
        //    64: aload_0         /* a */
        //    65: getfield        com/sun/jna/z/a/g/j.n:[B
        //    68: bipush          9
        //    70: baload         
        //    71: sipush          255
        //    74: iand           
        //    75: putfield        com/sun/jna/z/a/g/j.u:I
        //    78: aload_0         /* a */
        //    79: getfield        com/sun/jna/z/a/g/j.u:I
        //    82: iload_1         /* a */
        //    83: ifne            145
        //    86: tableswitch {
        //                0: 129
        //                1: 507
        //                2: 263
        //                3: 397
        //                4: 196
        //                5: 507
        //                6: 330
        //          default: 507
        //        }
        //   128: athrow         
        //   129: aload_0         /* a */
        //   130: iload_1         /* a */
        //   131: ifne            188
        //   134: goto            138
        //   137: athrow         
        //   138: getfield        com/sun/jna/z/a/g/j.t:I
        //   141: goto            145
        //   144: athrow         
        //   145: bipush          8
        //   147: if_icmpeq       187
        //   150: new             Ljava/io/IOException;
        //   153: dup            
        //   154: new             Ljava/lang/StringBuilder;
        //   157: dup            
        //   158: invokespecial   java/lang/StringBuilder.<init>:()V
        //   161: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   164: astore_2        /* a */
        //   165: aload_2         /* a */
        //   166: bipush          16
        //   168: aaload         
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: aload_0         /* a */
        //   173: getfield        com/sun/jna/z/a/g/j.t:I
        //   176: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   179: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   182: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   185: athrow         
        //   186: athrow         
        //   187: aload_0         /* a */
        //   188: iconst_1       
        //   189: putfield        com/sun/jna/z/a/g/j.v:I
        //   192: iload_1         /* a */
        //   193: ifeq            543
        //   196: aload_0         /* a */
        //   197: iload_1         /* a */
        //   198: ifne            255
        //   201: goto            205
        //   204: athrow         
        //   205: getfield        com/sun/jna/z/a/g/j.t:I
        //   208: bipush          8
        //   210: if_icmpeq       254
        //   213: goto            217
        //   216: athrow         
        //   217: new             Ljava/io/IOException;
        //   220: dup            
        //   221: new             Ljava/lang/StringBuilder;
        //   224: dup            
        //   225: invokespecial   java/lang/StringBuilder.<init>:()V
        //   228: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   231: astore_2        /* a */
        //   232: aload_2         /* a */
        //   233: bipush          16
        //   235: aaload         
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: aload_0         /* a */
        //   240: getfield        com/sun/jna/z/a/g/j.t:I
        //   243: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   246: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   249: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   252: athrow         
        //   253: athrow         
        //   254: aload_0         /* a */
        //   255: iconst_2       
        //   256: putfield        com/sun/jna/z/a/g/j.v:I
        //   259: iload_1         /* a */
        //   260: ifeq            543
        //   263: aload_0         /* a */
        //   264: iload_1         /* a */
        //   265: ifne            322
        //   268: goto            272
        //   271: athrow         
        //   272: getfield        com/sun/jna/z/a/g/j.t:I
        //   275: bipush          8
        //   277: if_icmpeq       321
        //   280: goto            284
        //   283: athrow         
        //   284: new             Ljava/io/IOException;
        //   287: dup            
        //   288: new             Ljava/lang/StringBuilder;
        //   291: dup            
        //   292: invokespecial   java/lang/StringBuilder.<init>:()V
        //   295: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   298: astore_2        /* a */
        //   299: aload_2         /* a */
        //   300: bipush          16
        //   302: aaload         
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   306: aload_0         /* a */
        //   307: getfield        com/sun/jna/z/a/g/j.t:I
        //   310: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   313: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   316: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   319: athrow         
        //   320: athrow         
        //   321: aload_0         /* a */
        //   322: iconst_3       
        //   323: putfield        com/sun/jna/z/a/g/j.v:I
        //   326: iload_1         /* a */
        //   327: ifeq            543
        //   330: aload_0         /* a */
        //   331: iload_1         /* a */
        //   332: ifne            389
        //   335: goto            339
        //   338: athrow         
        //   339: getfield        com/sun/jna/z/a/g/j.t:I
        //   342: bipush          8
        //   344: if_icmpeq       388
        //   347: goto            351
        //   350: athrow         
        //   351: new             Ljava/io/IOException;
        //   354: dup            
        //   355: new             Ljava/lang/StringBuilder;
        //   358: dup            
        //   359: invokespecial   java/lang/StringBuilder.<init>:()V
        //   362: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   365: astore_2        /* a */
        //   366: aload_2         /* a */
        //   367: bipush          16
        //   369: aaload         
        //   370: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   373: aload_0         /* a */
        //   374: getfield        com/sun/jna/z/a/g/j.t:I
        //   377: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   380: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   383: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   386: athrow         
        //   387: athrow         
        //   388: aload_0         /* a */
        //   389: iconst_4       
        //   390: putfield        com/sun/jna/z/a/g/j.v:I
        //   393: iload_1         /* a */
        //   394: ifeq            543
        //   397: aload_0         /* a */
        //   398: iload_1         /* a */
        //   399: ifne            462
        //   402: goto            406
        //   405: athrow         
        //   406: getfield        com/sun/jna/z/a/g/j.t:I
        //   409: tableswitch {
        //                2: 457
        //                3: 457
        //                4: 470
        //                5: 457
        //                6: 470
        //                7: 470
        //                8: 470
        //                9: 457
        //          default: 470
        //        }
        //   456: athrow         
        //   457: aload_0         /* a */
        //   458: goto            462
        //   461: athrow         
        //   462: iconst_1       
        //   463: putfield        com/sun/jna/z/a/g/j.v:I
        //   466: iload_1         /* a */
        //   467: ifeq            543
        //   470: new             Ljava/io/IOException;
        //   473: dup            
        //   474: new             Ljava/lang/StringBuilder;
        //   477: dup            
        //   478: invokespecial   java/lang/StringBuilder.<init>:()V
        //   481: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   484: astore_2        /* a */
        //   485: aload_2         /* a */
        //   486: bipush          16
        //   488: aaload         
        //   489: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   492: aload_0         /* a */
        //   493: getfield        com/sun/jna/z/a/g/j.t:I
        //   496: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   499: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   502: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   505: athrow         
        //   506: athrow         
        //   507: new             Ljava/io/IOException;
        //   510: dup            
        //   511: new             Ljava/lang/StringBuilder;
        //   514: dup            
        //   515: invokespecial   java/lang/StringBuilder.<init>:()V
        //   518: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   521: astore_2        /* a */
        //   522: aload_2         /* a */
        //   523: bipush          14
        //   525: aaload         
        //   526: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   529: aload_0         /* a */
        //   530: getfield        com/sun/jna/z/a/g/j.u:I
        //   533: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   536: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   539: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   542: athrow         
        //   543: aload_0         /* a */
        //   544: getfield        com/sun/jna/z/a/g/j.n:[B
        //   547: bipush          10
        //   549: baload         
        //   550: iload_1         /* a */
        //   551: ifne            584
        //   554: ifeq            577
        //   557: goto            561
        //   560: athrow         
        //   561: new             Ljava/io/IOException;
        //   564: dup            
        //   565: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   568: astore_2        /* a */
        //   569: aload_2         /* a */
        //   570: iconst_4       
        //   571: aaload         
        //   572: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   575: athrow         
        //   576: athrow         
        //   577: aload_0         /* a */
        //   578: getfield        com/sun/jna/z/a/g/j.n:[B
        //   581: bipush          11
        //   583: baload         
        //   584: iload_1         /* a */
        //   585: ifne            619
        //   588: ifeq            612
        //   591: goto            595
        //   594: athrow         
        //   595: new             Ljava/io/IOException;
        //   598: dup            
        //   599: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   602: astore_2        /* a */
        //   603: aload_2         /* a */
        //   604: bipush          9
        //   606: aaload         
        //   607: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   610: athrow         
        //   611: athrow         
        //   612: aload_0         /* a */
        //   613: getfield        com/sun/jna/z/a/g/j.n:[B
        //   616: bipush          12
        //   618: baload         
        //   619: ifeq            650
        //   622: new             Ljava/io/IOException;
        //   625: dup            
        //   626: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   629: iconst_1       
        //   630: aaload         
        //   631: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   634: athrow         
        //   635: athrow         
        //   636: athrow         
        //   637: athrow         
        //   638: athrow         
        //   639: athrow         
        //   640: athrow         
        //   641: athrow         
        //   642: athrow         
        //   643: athrow         
        //   644: athrow         
        //   645: athrow         
        //   646: athrow         
        //   647: athrow         
        //   648: athrow         
        //   649: athrow         
        //   650: return         
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  48     128    128    129    Ljava/io/IOException;
        //  86     134    137    138    Ljava/io/IOException;
        //  129    141    144    145    Ljava/io/IOException;
        //  145    186    186    187    Ljava/io/IOException;
        //  188    201    204    205    Ljava/io/IOException;
        //  196    213    216    217    Ljava/io/IOException;
        //  205    253    253    254    Ljava/io/IOException;
        //  255    268    271    272    Ljava/io/IOException;
        //  263    280    283    284    Ljava/io/IOException;
        //  272    320    320    321    Ljava/io/IOException;
        //  322    335    338    339    Ljava/io/IOException;
        //  330    347    350    351    Ljava/io/IOException;
        //  339    387    387    388    Ljava/io/IOException;
        //  389    402    405    406    Ljava/io/IOException;
        //  397    456    456    457    Ljava/io/IOException;
        //  406    458    461    462    Ljava/io/IOException;
        //  462    506    506    507    Ljava/io/IOException;
        //  543    557    560    561    Ljava/io/IOException;
        //  554    576    576    577    Ljava/io/IOException;
        //  584    591    594    595    Ljava/io/IOException;
        //  588    611    611    612    Ljava/io/IOException;
        //  619    635    635    636    Ljava/io/IOException;
        //  619    636    636    637    Ljava/lang/UnsupportedOperationException;
        //  619    637    637    638    Ljava/io/IOException;
        //  619    638    638    639    Ljava/lang/UnsupportedOperationException;
        //  619    639    639    640    Ljava/io/IOException;
        //  619    640    640    641    Ljava/lang/UnsupportedOperationException;
        //  619    641    641    642    Ljava/io/IOException;
        //  619    642    642    643    Ljava/lang/UnsupportedOperationException;
        //  619    643    643    644    Ljava/io/IOException;
        //  619    644    644    645    Ljava/lang/UnsupportedOperationException;
        //  619    645    645    646    Ljava/io/IOException;
        //  619    646    646    647    Ljava/lang/UnsupportedOperationException;
        //  619    647    647    648    Ljava/io/IOException;
        //  619    648    648    649    Ljava/lang/UnsupportedOperationException;
        //  619    649    649    650    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0129:
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
    
    private void g() throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0         /* a */
        //     4: getfield        com/sun/jna/z/a/g/j.o:I
        //     7: iconst_3       
        //     8: idiv           
        //     9: istore_2       
        //    10: istore_1        /* a */
        //    11: iload_2         /* a */
        //    12: iconst_1       
        //    13: iload_1         /* a */
        //    14: ifne            32
        //    17: if_icmplt       64
        //    20: goto            24
        //    23: athrow         
        //    24: iload_2         /* a */
        //    25: sipush          256
        //    28: goto            32
        //    31: athrow         
        //    32: iload_1         /* a */
        //    33: ifne            52
        //    36: if_icmpgt       64
        //    39: goto            43
        //    42: athrow         
        //    43: aload_0         /* a */
        //    44: getfield        com/sun/jna/z/a/g/j.o:I
        //    47: iconst_3       
        //    48: goto            52
        //    51: athrow         
        //    52: irem           
        //    53: iload_1         /* a */
        //    54: ifne            102
        //    57: ifeq            79
        //    60: goto            64
        //    63: athrow         
        //    64: new             Ljava/io/IOException;
        //    67: dup            
        //    68: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //    71: bipush          8
        //    73: aaload         
        //    74: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    77: athrow         
        //    78: athrow         
        //    79: aload_0         /* a */
        //    80: iload_2         /* a */
        //    81: iconst_3       
        //    82: imul           
        //    83: newarray        B
        //    85: putfield        com/sun/jna/z/a/g/j.w:[B
        //    88: aload_0         /* a */
        //    89: aload_0         /* a */
        //    90: getfield        com/sun/jna/z/a/g/j.w:[B
        //    93: iconst_0       
        //    94: aload_0         /* a */
        //    95: getfield        com/sun/jna/z/a/g/j.w:[B
        //    98: arraylength    
        //    99: invokespecial   com/sun/jna/z/a/g/j.a:([BII)I
        //   102: pop            
        //   103: return         
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  11     20     23     24     Ljava/io/IOException;
        //  17     28     31     32     Ljava/io/IOException;
        //  32     39     42     43     Ljava/io/IOException;
        //  36     48     51     52     Ljava/io/IOException;
        //  52     60     63     64     Ljava/io/IOException;
        //  57     78     78     79     Ljava/io/IOException;
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
    
    private void h() throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1        /* a */
        //     4: aload_0         /* a */
        //     5: getfield        com/sun/jna/z/a/g/j.u:I
        //     8: iload_1         /* a */
        //     9: ifne            71
        //    12: tableswitch {
        //                0: 45
        //                1: 183
        //                2: 76
        //                3: 110
        //          default: 183
        //        }
        //    44: athrow         
        //    45: aload_0         /* a */
        //    46: iconst_2       
        //    47: invokespecial   com/sun/jna/z/a/g/j.b:(I)V
        //    50: aload_0         /* a */
        //    51: iconst_2       
        //    52: newarray        B
        //    54: putfield        com/sun/jna/z/a/g/j.y:[B
        //    57: aload_0         /* a */
        //    58: aload_0         /* a */
        //    59: getfield        com/sun/jna/z/a/g/j.y:[B
        //    62: iconst_0       
        //    63: iconst_2       
        //    64: invokespecial   com/sun/jna/z/a/g/j.a:([BII)I
        //    67: goto            71
        //    70: athrow         
        //    71: pop            
        //    72: iload_1         /* a */
        //    73: ifeq            183
        //    76: aload_0         /* a */
        //    77: bipush          6
        //    79: invokespecial   com/sun/jna/z/a/g/j.b:(I)V
        //    82: aload_0         /* a */
        //    83: bipush          6
        //    85: newarray        B
        //    87: putfield        com/sun/jna/z/a/g/j.y:[B
        //    90: aload_0         /* a */
        //    91: aload_0         /* a */
        //    92: getfield        com/sun/jna/z/a/g/j.y:[B
        //    95: iconst_0       
        //    96: bipush          6
        //    98: invokespecial   com/sun/jna/z/a/g/j.a:([BII)I
        //   101: pop            
        //   102: iload_1         /* a */
        //   103: ifeq            183
        //   106: goto            110
        //   109: athrow         
        //   110: aload_0         /* a */
        //   111: getfield        com/sun/jna/z/a/g/j.w:[B
        //   114: iload_1         /* a */
        //   115: ifne            161
        //   118: goto            122
        //   121: athrow         
        //   122: ifnonnull       144
        //   125: goto            129
        //   128: athrow         
        //   129: new             Ljava/io/IOException;
        //   132: dup            
        //   133: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   136: bipush          20
        //   138: aaload         
        //   139: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   142: athrow         
        //   143: athrow         
        //   144: aload_0         /* a */
        //   145: aload_0         /* a */
        //   146: getfield        com/sun/jna/z/a/g/j.w:[B
        //   149: arraylength    
        //   150: iconst_3       
        //   151: idiv           
        //   152: newarray        B
        //   154: putfield        com/sun/jna/z/a/g/j.x:[B
        //   157: aload_0         /* a */
        //   158: getfield        com/sun/jna/z/a/g/j.x:[B
        //   161: iconst_m1      
        //   162: invokestatic    java/util/Arrays.fill:([BB)V
        //   165: aload_0         /* a */
        //   166: aload_0         /* a */
        //   167: getfield        com/sun/jna/z/a/g/j.x:[B
        //   170: iconst_0       
        //   171: aload_0         /* a */
        //   172: getfield        com/sun/jna/z/a/g/j.x:[B
        //   175: arraylength    
        //   176: invokespecial   com/sun/jna/z/a/g/j.a:([BII)I
        //   179: pop            
        //   180: goto            183
        //   183: return         
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      44     44     45     Ljava/io/IOException;
        //  12     67     70     71     Ljava/io/IOException;
        //  71     106    109    110    Ljava/io/IOException;
        //  76     118    121    122    Ljava/io/IOException;
        //  110    125    128    129    Ljava/io/IOException;
        //  122    143    143    144    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0076:
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
    
    private void i() throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1        /* a */
        //     4: aload_0         /* a */
        //     5: getfield        com/sun/jna/z/a/g/j.q:I
        //     8: iload_1         /* a */
        //     9: ifne            61
        //    12: ifle            38
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0         /* a */
        //    20: aload_0         /* a */
        //    21: getfield        com/sun/jna/z/a/g/j.q:I
        //    24: iconst_4       
        //    25: iadd           
        //    26: i2l            
        //    27: invokespecial   com/sun/jna/z/a/g/j.a:(J)V
        //    30: iload_1         /* a */
        //    31: ifeq            99
        //    34: goto            38
        //    37: athrow         
        //    38: aload_0         /* a */
        //    39: aload_0         /* a */
        //    40: getfield        com/sun/jna/z/a/g/j.n:[B
        //    43: iconst_0       
        //    44: iconst_4       
        //    45: invokespecial   com/sun/jna/z/a/g/j.b:([BII)V
        //    48: aload_0         /* a */
        //    49: aload_0         /* a */
        //    50: getfield        com/sun/jna/z/a/g/j.n:[B
        //    53: iconst_0       
        //    54: invokespecial   com/sun/jna/z/a/g/j.a:([BI)I
        //    57: goto            61
        //    60: athrow         
        //    61: istore_2        /* a */
        //    62: aload_0         /* a */
        //    63: getfield        com/sun/jna/z/a/g/j.m:Ljava/util/zip/CRC32;
        //    66: invokevirtual   java/util/zip/CRC32.getValue:()J
        //    69: l2i            
        //    70: istore_3        /* a */
        //    71: iload_1         /* a */
        //    72: ifne            114
        //    75: iload_3         /* a */
        //    76: iload_2         /* a */
        //    77: if_icmpeq       99
        //    80: goto            84
        //    83: athrow         
        //    84: new             Ljava/io/IOException;
        //    87: dup            
        //    88: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //    91: bipush          19
        //    93: aaload         
        //    94: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    97: athrow         
        //    98: athrow         
        //    99: aload_0         /* a */
        //   100: iconst_0       
        //   101: putfield        com/sun/jna/z/a/g/j.q:I
        //   104: aload_0         /* a */
        //   105: iconst_0       
        //   106: putfield        com/sun/jna/z/a/g/j.o:I
        //   109: aload_0         /* a */
        //   110: iconst_0       
        //   111: putfield        com/sun/jna/z/a/g/j.p:I
        //   114: return         
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      15     18     19     Ljava/io/IOException;
        //  12     34     37     38     Ljava/io/IOException;
        //  19     57     60     61     Ljava/io/IOException;
        //  71     80     83     84     Ljava/io/IOException;
        //  75     98     98     99     Ljava/io/IOException;
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
    
    private void j() throws IOException {
        this.b(this.n, 0, 8);
        this.o = this.a(this.n, 0);
        this.p = this.a(this.n, 4);
        this.q = this.o;
        this.m.reset();
        this.m.update(this.n, 4, 4);
    }
    
    private void a(final int a) throws IOException {
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    this.j();
                                                                    if (this.p != a) {
                                                                        throw new IOException(com.sun.jna.z.a.g.j.A[11] + Integer.toHexString(a));
                                                                    }
                                                                }
                                                                catch (IOException ex) {
                                                                    throw ex;
                                                                }
                                                            }
                                                            catch (UnsupportedOperationException ex2) {
                                                                throw ex2;
                                                            }
                                                        }
                                                        catch (IOException ex3) {
                                                            throw ex3;
                                                        }
                                                    }
                                                    catch (UnsupportedOperationException ex4) {
                                                        throw ex4;
                                                    }
                                                }
                                                catch (IOException ex5) {
                                                    throw ex5;
                                                }
                                            }
                                            catch (UnsupportedOperationException ex6) {
                                                throw ex6;
                                            }
                                        }
                                        catch (IOException ex7) {
                                            throw ex7;
                                        }
                                    }
                                    catch (UnsupportedOperationException ex8) {
                                        throw ex8;
                                    }
                                }
                                catch (IOException ex9) {
                                    throw ex9;
                                }
                            }
                            catch (UnsupportedOperationException ex10) {
                                throw ex10;
                            }
                        }
                        catch (IOException ex11) {
                            throw ex11;
                        }
                    }
                    catch (UnsupportedOperationException ex12) {
                        throw ex12;
                    }
                }
                catch (IOException ex13) {
                    throw ex13;
                }
            }
            catch (UnsupportedOperationException ex14) {
                throw ex14;
            }
        }
        catch (IOException ex15) {
            throw ex15;
        }
    }
    
    private void b(final int a) throws IOException {
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (this.o != a) {
                                                                        throw new IOException(com.sun.jna.z.a.g.j.A[7]);
                                                                    }
                                                                }
                                                                catch (IOException ex) {
                                                                    throw ex;
                                                                }
                                                            }
                                                            catch (UnsupportedOperationException ex2) {
                                                                throw ex2;
                                                            }
                                                        }
                                                        catch (IOException ex3) {
                                                            throw ex3;
                                                        }
                                                    }
                                                    catch (UnsupportedOperationException ex4) {
                                                        throw ex4;
                                                    }
                                                }
                                                catch (IOException ex5) {
                                                    throw ex5;
                                                }
                                            }
                                            catch (UnsupportedOperationException ex6) {
                                                throw ex6;
                                            }
                                        }
                                        catch (IOException ex7) {
                                            throw ex7;
                                        }
                                    }
                                    catch (UnsupportedOperationException ex8) {
                                        throw ex8;
                                    }
                                }
                                catch (IOException ex9) {
                                    throw ex9;
                                }
                            }
                            catch (UnsupportedOperationException ex10) {
                                throw ex10;
                            }
                        }
                        catch (IOException ex11) {
                            throw ex11;
                        }
                    }
                    catch (UnsupportedOperationException ex12) {
                        throw ex12;
                    }
                }
                catch (IOException ex13) {
                    throw ex13;
                }
            }
            catch (UnsupportedOperationException ex14) {
                throw ex14;
            }
        }
        catch (IOException ex15) {
            throw ex15;
        }
    }
    
    private int a(final byte[] a, final int a, int a) throws IOException {
        final int a2 = com.sun.jna.z.a.g.g.b;
        int n = 0;
        Label_0083: {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        n = a;
                                                                        if (a2 != 0) {
                                                                            return n;
                                                                        }
                                                                        if (n <= this.q) {
                                                                            break Label_0083;
                                                                        }
                                                                    }
                                                                    catch (IOException ex) {
                                                                        throw ex;
                                                                    }
                                                                }
                                                                catch (UnsupportedOperationException ex2) {
                                                                    throw ex2;
                                                                }
                                                            }
                                                            catch (IOException ex3) {
                                                                throw ex3;
                                                            }
                                                        }
                                                        catch (UnsupportedOperationException ex4) {
                                                            throw ex4;
                                                        }
                                                    }
                                                    catch (IOException ex5) {
                                                        throw ex5;
                                                    }
                                                }
                                                catch (UnsupportedOperationException ex6) {
                                                    throw ex6;
                                                }
                                            }
                                            catch (IOException ex7) {
                                                throw ex7;
                                            }
                                        }
                                        catch (UnsupportedOperationException ex8) {
                                            throw ex8;
                                        }
                                    }
                                    catch (IOException ex9) {
                                        throw ex9;
                                    }
                                }
                                catch (UnsupportedOperationException ex10) {
                                    throw ex10;
                                }
                            }
                            catch (IOException ex11) {
                                throw ex11;
                            }
                        }
                        catch (UnsupportedOperationException ex12) {
                            throw ex12;
                        }
                    }
                    catch (IOException ex13) {
                        throw ex13;
                    }
                }
                catch (UnsupportedOperationException ex14) {
                    throw ex14;
                }
            }
            catch (IOException ex15) {
                throw ex15;
            }
            a = this.q;
        }
        this.b(a, a, a);
        this.m.update(a, a, a);
        this.q -= a;
        return n;
    }
    
    private void a(final Inflater a) throws IOException {
        final int a2 = com.sun.jna.z.a.g.g.b;
    Label_0090:
        while (true) {
            while (this.q == 0) {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            this.i();
                                                                            final j j = this;
                                                                            if (a2 != 0) {
                                                                                break Label_0090;
                                                                            }
                                                                            this.a(1229209940);
                                                                            if (a2 == 0) {
                                                                                continue;
                                                                            }
                                                                        }
                                                                        catch (IOException ex) {
                                                                            throw ex;
                                                                        }
                                                                    }
                                                                    catch (UnsupportedOperationException ex2) {
                                                                        throw ex2;
                                                                    }
                                                                }
                                                                catch (IOException ex3) {
                                                                    throw ex3;
                                                                }
                                                            }
                                                            catch (UnsupportedOperationException ex4) {
                                                                throw ex4;
                                                            }
                                                        }
                                                        catch (IOException ex5) {
                                                            throw ex5;
                                                        }
                                                    }
                                                    catch (UnsupportedOperationException ex6) {
                                                        throw ex6;
                                                    }
                                                }
                                                catch (IOException ex7) {
                                                    throw ex7;
                                                }
                                            }
                                            catch (UnsupportedOperationException ex8) {
                                                throw ex8;
                                            }
                                        }
                                        catch (IOException ex9) {
                                            throw ex9;
                                        }
                                    }
                                    catch (UnsupportedOperationException ex10) {
                                        throw ex10;
                                    }
                                }
                                catch (IOException ex11) {
                                    throw ex11;
                                }
                            }
                            catch (UnsupportedOperationException ex12) {
                                throw ex12;
                            }
                        }
                        catch (IOException ex13) {
                            throw ex13;
                        }
                    }
                    catch (UnsupportedOperationException ex14) {
                        throw ex14;
                    }
                }
                catch (IOException ex15) {
                    throw ex15;
                }
                break;
                j j = null;
                final int a3 = j.a(this.n, 0, this.n.length);
                a.setInput(this.n, 0, a3);
                return;
            }
            final j j = this;
            continue Label_0090;
        }
    }
    
    private void a(final Inflater a, final byte[] a, final int a, final int a) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          a
        //     5: getstatic       com/sun/jna/z/a/g/j.z:Z
        //     8: iload           a
        //    10: ifne            49
        //    13: ifne            41
        //    16: goto            20
        //    19: athrow         
        //    20: aload_2         /* a */
        //    21: aload_0         /* a */
        //    22: getfield        com/sun/jna/z/a/g/j.n:[B
        //    25: if_acmpne       41
        //    28: goto            32
        //    31: athrow         
        //    32: new             Ljava/lang/AssertionError;
        //    35: dup            
        //    36: invokespecial   java/lang/AssertionError.<init>:()V
        //    39: athrow         
        //    40: athrow         
        //    41: aload_1         /* a */
        //    42: aload_2         /* a */
        //    43: iload_3         /* a */
        //    44: iload           a
        //    46: invokevirtual   java/util/zip/Inflater.inflate:([BII)I
        //    49: istore          a
        //    51: iload           a
        //    53: ifgt            151
        //    56: aload_1         /* a */
        //    57: invokevirtual   java/util/zip/Inflater.finished:()Z
        //    60: iload           a
        //    62: ifne            89
        //    65: goto            69
        //    68: athrow         
        //    69: ifeq            85
        //    72: goto            76
        //    75: athrow         
        //    76: new             Ljava/io/EOFException;
        //    79: dup            
        //    80: invokespecial   java/io/EOFException.<init>:()V
        //    83: athrow         
        //    84: athrow         
        //    85: aload_1         /* a */
        //    86: invokevirtual   java/util/zip/Inflater.needsInput:()Z
        //    89: ifeq            106
        //    92: aload_0         /* a */
        //    93: aload_1         /* a */
        //    94: invokespecial   com/sun/jna/z/a/g/j.a:(Ljava/util/zip/Inflater;)V
        //    97: iload           a
        //    99: ifeq            163
        //   102: goto            106
        //   105: athrow         
        //   106: new             Ljava/io/IOException;
        //   109: dup            
        //   110: new             Ljava/lang/StringBuilder;
        //   113: dup            
        //   114: invokespecial   java/lang/StringBuilder.<init>:()V
        //   117: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   120: astore          a
        //   122: aload           a
        //   124: bipush          13
        //   126: aaload         
        //   127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   130: iload           a
        //   132: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   135: aload           a
        //   137: bipush          18
        //   139: aaload         
        //   140: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   143: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   146: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   149: athrow         
        //   150: athrow         
        //   151: iload_3         /* a */
        //   152: iload           a
        //   154: iadd           
        //   155: istore_3        /* a */
        //   156: iload           a
        //   158: iload           a
        //   160: isub           
        //   161: istore          a
        //   163: iload           a
        //   165: ifgt            41
        //   168: iload           a
        //   170: ifne            85
        //   173: goto            203
        //   176: astore          a
        //   178: new             Ljava/io/IOException;
        //   181: dup            
        //   182: getstatic       com/sun/jna/z/a/g/j.A:[Ljava/lang/String;
        //   185: bipush          15
        //   187: aaload         
        //   188: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   191: aload           a
        //   193: invokevirtual   java/io/IOException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   196: checkcast       Ljava/io/IOException;
        //   199: checkcast       Ljava/io/IOException;
        //   202: athrow         
        //   203: return         
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                               
        //  -----  -----  -----  -----  -----------------------------------
        //  92     150    150    151    Ljava/util/zip/DataFormatException;
        //  89     102    105    106    Ljava/util/zip/DataFormatException;
        //  69     84     84     85     Ljava/util/zip/DataFormatException;
        //  56     72     75     76     Ljava/util/zip/DataFormatException;
        //  51     65     68     69     Ljava/util/zip/DataFormatException;
        //  20     40     40     41     Ljava/util/zip/DataFormatException;
        //  13     28     31     32     Ljava/util/zip/DataFormatException;
        //  5      16     19     20     Ljava/util/zip/DataFormatException;
        //  41     168    176    203    Ljava/util/zip/DataFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0020:
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
    
    private void b(final byte[] a, int a, int a) throws IOException {
        do {
            final int a2 = this.l.read(a, a, a);
            if (a2 < 0) {
                throw new EOFException();
            }
            a += a2;
            a -= a2;
        } while (a > 0);
    }
    
    private int a(final byte[] a, final int a) {
        return a[a] << 24 | (a[a + 1] & 0xFF) << 16 | (a[a + 2] & 0xFF) << 8 | (a[a + 3] & 0xFF);
    }
    
    private void a(long a) throws IOException {
        final int a2 = com.sun.jna.z.a.g.g.b;
        while (a > 0L) {
            final long a3 = this.l.skip(a);
            long n2 = 0L;
            long n4 = 0L;
            Label_0047: {
                Label_0035: {
                    long n;
                    long n3;
                    try {
                        n = (n2 = a3);
                        n3 = (n4 = 0L);
                        if (a2 != 0) {
                            break Label_0047;
                        }
                        final long n5 = lcmp(n, n3);
                        if (n5 < 0) {
                            break Label_0035;
                        }
                        break Label_0035;
                    }
                    catch (IOException ex) {
                        throw ex;
                    }
                    try {
                        final long n5 = lcmp(n, n3);
                        if (n5 < 0) {
                            throw new EOFException();
                        }
                    }
                    catch (IOException ex2) {
                        throw ex2;
                    }
                }
                n2 = a;
                n4 = a3;
            }
            a = n2 - n4;
            if (a2 != 0) {
                break;
            }
        }
    }
    
    private boolean b(final byte[] a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: iconst_0       
        //     4: istore_3       
        //     5: istore_2        /* a */
        //     6: iload_3         /* a */
        //     7: aload_0         /* a */
        //     8: getfield        com/sun/jna/z/a/g/j.a:[B
        //    11: arraylength    
        //    12: if_icmpge       56
        //    15: aload_1         /* a */
        //    16: iload_3         /* a */
        //    17: baload         
        //    18: iload_2         /* a */
        //    19: ifne            57
        //    22: iload_2         /* a */
        //    23: ifne            48
        //    26: goto            30
        //    29: athrow         
        //    30: aload_0         /* a */
        //    31: getfield        com/sun/jna/z/a/g/j.a:[B
        //    34: iload_3         /* a */
        //    35: baload         
        //    36: if_icmpeq       49
        //    39: goto            43
        //    42: athrow         
        //    43: iconst_0       
        //    44: goto            48
        //    47: athrow         
        //    48: ireturn        
        //    49: iinc            a, 1
        //    52: iload_2         /* a */
        //    53: ifeq            6
        //    56: iconst_1       
        //    57: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  15     26     29     30     Ljava/lang/UnsupportedOperationException;
        //  22     39     42     43     Ljava/lang/UnsupportedOperationException;
        //  30     44     47     48     Ljava/lang/UnsupportedOperationException;
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
    
    static {
        final String[] a = new String[21];
        int n = 0;
        String s;
        int n2 = (s = "\u0081½\u00d9X\u000b{\u00dd¦§\u00cfI[m\u00dd¦¾\u00cbY[m\u00dd¦\u00f3\u00deE\u0012x\u0092½¾\u00cbJ\u001e\u001c¡½\u00d9X\u000b{\u00dd¦§\u00cfI[b\u00dc ¶\u00d8A\u001ah\u00d7\u00f4¾\u00cfY\u0013d\u00d6\u0014\u009a¼\u00de\r\u001a+\u00c4µ¿\u00c3I[[\u00fc\u0093\u00f3\u00ccD\u0017n\u0013\u009a¼\u00de\r\u0002n\u00c6\u00f4º\u00c7]\u0017n\u00df±½\u00deH\u001f\u001e¡½\u00d9X\u000b{\u00dd¦§\u00cfI[h\u00dd¹£\u00d8H\bx\u00db»½\u008a@\u001e\u007f\u00da»·\u0012\u0099º\u00d9^\u0012e\u00d5\u00f4\u0083\u00e6y>+\u00d1¼¦\u00c4F#\u0081½\u00d9X\u000b{\u00dd¦§\u00cfI[i\u00db ·\u00cf]\u000fc\u0092²¼\u00d8\r\u000fc\u00db§\u00f3\u00c3@\u001al\u00d7\u0014\u0097»\u00dfC\u0010+\u00daµ \u008aZ\td\u00dc³\u00f3\u00d9D\u0001n\u001b\u0084\u009f\u00feh[h\u00da¡½\u00c1\r\u0013j\u00c1\u00f4¤\u00d8B\u0015l\u0092¸¶\u00c4J\u000fc\u001c¡½\u00d9X\u000b{\u00dd¦§\u00cfI[m\u00db¸§\u00cf_\u0012e\u00d5\u00f4¾\u00cfY\u0013d\u00d6\u001a½¾\u00cbJ\u001e+\u00daµ \u008aL\u0015+\u00d3¸£\u00c2L[h\u00daµ½\u00c4H\u0017\u0010\u0091«\u00daH\u0018\u007f\u00d7°\u00f3\u00c9E\u000ee\u00d9\u00ee\u00f3\"½½\u00dcL\u0017b\u00d6±\u00f3\u00ccD\u0017\u007f\u00d7¦\u00f3\u00deT\u000bn\u0092½½\u008a^\u0018j\u00dc¸º\u00c4HA+\u000e\u0097²\u00c4\n\u000f+\u00dbºµ\u00c6L\u000fn\u0092\u001a¡½\u00d9X\u000b{\u00dd¦§\u00cfI[h\u00dd¸¼\u00d8\r\u001dd\u00c0¹²\u00de\u0017[\r½½\u00ccA\u001a\u007f\u00d7\u00f4¶\u00d8_\u0014y\u0017\u0081½\u00d9X\u000b{\u00dd¦§\u00cfI[i\u00db \u00f3\u00ceH\u000b\u007f\u00da\u00ee\u00f3\u0006§§\u00d8D\u001fn\u0006\u00f4±\u00d3Y\u001ex").length();
        int n3 = 33;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                ++n4;
                final String s2 = s;
                final int n5 = n4;
                String s3 = s2.substring(n5, n5 + n3);
                int n6 = -1;
            Label_0147_Outer:
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    int length;
                    int n8;
                    final int n7 = n8 = (length = charArray.length);
                    int n9 = 0;
                    while (true) {
                        Label_0266: {
                            Label_0155: {
                                try {
                                    try {
                                        if (n7 <= 1) {
                                            length = (n8 = n9);
                                            break Label_0155;
                                        }
                                        break Label_0266;
                                    }
                                    catch (IllegalArgumentException ex) {
                                        throw ex;
                                    }
                                }
                                catch (UnsupportedOperationException ex2) {
                                    throw ex2;
                                }
                            }
                            while (true) {
                                final char c = charArray[n8];
                                Label_0236: {
                                    switch (n9 % 7) {
                                        case 0: {
                                            final char c2 = '\u00d4';
                                            break Label_0236;
                                        }
                                        case 1: {
                                            final char c2 = '\u00d3';
                                            break Label_0236;
                                        }
                                        case 2: {
                                            final char c2 = 'ª';
                                            break Label_0236;
                                        }
                                        case 3: {
                                            final char c2 = '-';
                                            break Label_0236;
                                        }
                                        case 4: {
                                            final char c2 = '{';
                                            break Label_0236;
                                        }
                                        case 5: {
                                            final char c2 = '\u000b';
                                            break Label_0236;
                                        }
                                    }
                                    final char c2 = '²';
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            charArray[length] = (char)(c ^ c2);
                                                                                            ++n9;
                                                                                            if (n7 == 0) {
                                                                                                continue Label_0147_Outer;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        catch (IllegalArgumentException ex3) {
                                                                                            throw ex3;
                                                                                        }
                                                                                    }
                                                                                    catch (UnsupportedOperationException ex4) {
                                                                                        throw ex4;
                                                                                    }
                                                                                }
                                                                                catch (IllegalArgumentException ex5) {
                                                                                    throw ex5;
                                                                                }
                                                                            }
                                                                            catch (UnsupportedOperationException ex6) {
                                                                                throw ex6;
                                                                            }
                                                                        }
                                                                        catch (IllegalArgumentException ex7) {
                                                                            throw ex7;
                                                                        }
                                                                    }
                                                                    catch (UnsupportedOperationException ex8) {
                                                                        throw ex8;
                                                                    }
                                                                }
                                                                catch (IllegalArgumentException ex9) {
                                                                    throw ex9;
                                                                }
                                                            }
                                                            catch (UnsupportedOperationException ex10) {
                                                                throw ex10;
                                                            }
                                                        }
                                                        catch (IllegalArgumentException ex11) {
                                                            throw ex11;
                                                        }
                                                    }
                                                    catch (UnsupportedOperationException ex12) {
                                                        throw ex12;
                                                    }
                                                }
                                                catch (IllegalArgumentException ex13) {
                                                    throw ex13;
                                                }
                                            }
                                            catch (UnsupportedOperationException ex14) {
                                                throw ex14;
                                            }
                                        }
                                        catch (IllegalArgumentException ex15) {
                                            throw ex15;
                                        }
                                    }
                                    catch (UnsupportedOperationException ex16) {
                                        throw ex16;
                                    }
                                }
                                break;
                            }
                        }
                        if (n7 > n9) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n6) {
                        default: {
                            a[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0023;
                            }
                            n2 = (s = "\u009d½\u00dcL\u0017b\u00d6\u00f4\u0090\u00f8n\u001d \u0081\u00e4~[h\u00da¡½\u00c1\r\fb\u00c6¼¼\u00dfY[[\u00fe\u0080\u0096\u008aN\u0013~\u00dc¿").length();
                            n3 = 11;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            a[n++] = intern;
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
        A = a;
        boolean z2 = false;
        Label_0332: {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (!j.class.desiredAssertionStatus()) {
                                                                            z2 = true;
                                                                            break Label_0332;
                                                                        }
                                                                    }
                                                                    catch (UnsupportedOperationException ex17) {
                                                                        throw ex17;
                                                                    }
                                                                }
                                                                catch (IllegalArgumentException ex18) {
                                                                    throw ex18;
                                                                }
                                                            }
                                                            catch (UnsupportedOperationException ex19) {
                                                                throw ex19;
                                                            }
                                                        }
                                                        catch (IllegalArgumentException ex20) {
                                                            throw ex20;
                                                        }
                                                    }
                                                    catch (UnsupportedOperationException ex21) {
                                                        throw ex21;
                                                    }
                                                }
                                                catch (IllegalArgumentException ex22) {
                                                    throw ex22;
                                                }
                                            }
                                            catch (UnsupportedOperationException ex23) {
                                                throw ex23;
                                            }
                                        }
                                        catch (IllegalArgumentException ex24) {
                                            throw ex24;
                                        }
                                    }
                                    catch (UnsupportedOperationException ex25) {
                                        throw ex25;
                                    }
                                }
                                catch (IllegalArgumentException ex26) {
                                    throw ex26;
                                }
                            }
                            catch (UnsupportedOperationException ex27) {
                                throw ex27;
                            }
                        }
                        catch (IllegalArgumentException ex28) {
                            throw ex28;
                        }
                    }
                    catch (UnsupportedOperationException ex29) {
                        throw ex29;
                    }
                }
                catch (IllegalArgumentException ex30) {
                    throw ex30;
                }
            }
            catch (UnsupportedOperationException ex31) {
                throw ex31;
            }
            z2 = false;
        }
        z = z2;
    }
}
