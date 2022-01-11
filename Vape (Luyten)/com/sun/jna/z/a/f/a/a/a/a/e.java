package com.sun.jna.z.a.f.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.c.*;
import java.util.*;
import java.awt.*;

public abstract class e extends d implements l
{
    private Map<k, com.sun.jna.z.a.f.a.a.a.c.d[]> l;
    private g m;
    
    public e() {
        this.l = new LinkedHashMap<k, com.sun.jna.z.a.f.a.a.a.c.d[]>();
        this.m = new c();
    }
    
    @Override
    public void b() {
        final int k = com.sun.jna.z.a.f.a.a.a.a.d.k;
        super.b();
        final int a = k;
        synchronized (this.l) {
            for (final k a2 : this.l.keySet()) {
                try {
                    a2.b();
                    if (a == 0) {
                        if (a == 0) {
                            continue;
                        }
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
        }
    }
    
    @Override
    public void a(final k a, final k a, final com.sun.jna.z.a.f.a.a.a.c.d... a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: new             Ljava/util/LinkedHashMap;
        //     6: dup            
        //     7: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    10: astore          a
        //    12: istore          a
        //    14: aload_0         /* a */
        //    15: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //    18: dup            
        //    19: astore          6
        //    21: monitorenter   
        //    22: aload_0         /* a */
        //    23: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //    26: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    31: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    36: astore          7
        //    38: aload           7
        //    40: invokeinterface java/util/Iterator.hasNext:()Z
        //    45: ifeq            131
        //    48: aload           7
        //    50: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    55: checkcast       Lcom/sun/jna/z/a/f/a/a/a/a/k;
        //    58: astore          a
        //    60: aload           a
        //    62: aload           a
        //    64: aload_0         /* a */
        //    65: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //    68: aload           a
        //    70: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    75: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    80: pop            
        //    81: iload           a
        //    83: ifne            134
        //    86: aload           a
        //    88: iload           a
        //    90: ifne            121
        //    93: goto            97
        //    96: athrow         
        //    97: aload_1         /* a */
        //    98: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   101: ifeq            126
        //   104: goto            108
        //   107: athrow         
        //   108: aload           a
        //   110: aload_2         /* a */
        //   111: aload_3         /* a */
        //   112: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   117: goto            121
        //   120: athrow         
        //   121: pop            
        //   122: aload_0         /* a */
        //   123: invokevirtual   com/sun/jna/z/a/f/a/a/a/a/e.d:()V
        //   126: iload           a
        //   128: ifeq            38
        //   131: aload           6
        //   133: monitorexit    
        //   134: goto            145
        //   137: astore          9
        //   139: aload           6
        //   141: monitorexit    
        //   142: aload           9
        //   144: athrow         
        //   145: aload_0         /* a */
        //   146: aload           a
        //   148: putfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //   151: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  97     117    120    121    Ljava/lang/NullPointerException;
        //  86     104    107    108    Ljava/lang/NullPointerException;
        //  60     93     96     97     Ljava/lang/NullPointerException;
        //  22     134    137    145    Any
        //  137    142    137    145    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0097:
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
    public g a() {
        return this.m;
    }
    
    @Override
    public void a(g a) {
        final int a2 = com.sun.jna.z.a.f.a.a.a.a.d.k;
        Label_0024: {
            try {
                if (a2 != 0) {
                    return;
                }
                if (a != null) {
                    break Label_0024;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            a = new c();
        }
        this.m = a;
        this.d();
    }
    
    @Override
    public k[] b() {
        synchronized (this.l) {
            return this.l.keySet().toArray(new k[this.l.size()]);
        }
    }
    
    @Override
    public void a(final k a, final com.sun.jna.z.a.f.a.a.a.c.d... a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0         /* a */
        //     4: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //     7: dup            
        //     8: astore          4
        //    10: monitorenter   
        //    11: istore_3        /* a */
        //    12: aload_1         /* a */
        //    13: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.k:()Lcom/sun/jna/z/a/f/a/a/a/a/l;
        //    18: astore          a
        //    20: aload           a
        //    22: iload_3         /* a */
        //    23: ifne            80
        //    26: ifnull          69
        //    29: goto            33
        //    32: athrow         
        //    33: aload           a
        //    35: aload_1         /* a */
        //    36: invokeinterface com/sun/jna/z/a/f/a/a/a/a/l.b:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Z
        //    41: iload_3         /* a */
        //    42: ifne            85
        //    45: goto            49
        //    48: athrow         
        //    49: ifeq            69
        //    52: goto            56
        //    55: athrow         
        //    56: aload           a
        //    58: aload_1         /* a */
        //    59: invokeinterface com/sun/jna/z/a/f/a/a/a/a/l.c:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Z
        //    64: pop            
        //    65: goto            69
        //    68: athrow         
        //    69: aload_0         /* a */
        //    70: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //    73: aload_1         /* a */
        //    74: aload_2         /* a */
        //    75: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    80: pop            
        //    81: aload_0         /* a */
        //    82: getfield        com/sun/jna/z/a/f/a/a/a/a/e.h:Z
        //    85: iload_3         /* a */
        //    86: ifne            119
        //    89: ifne            107
        //    92: goto            96
        //    95: athrow         
        //    96: aload_1         /* a */
        //    97: iconst_0       
        //    98: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.d:(Z)V
        //   103: goto            107
        //   106: athrow         
        //   107: aload_0         /* a */
        //   108: iload_3         /* a */
        //   109: ifne            151
        //   112: getfield        com/sun/jna/z/a/f/a/a/a/a/e.i:Z
        //   115: goto            119
        //   118: athrow         
        //   119: ifne            133
        //   122: aload_1         /* a */
        //   123: iconst_0       
        //   124: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.c:(Z)V
        //   129: goto            133
        //   132: athrow         
        //   133: aload_1         /* a */
        //   134: aload_0         /* a */
        //   135: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.a:(Lcom/sun/jna/z/a/f/a/a/a/a/l;)V
        //   140: aload_1         /* a */
        //   141: aload_0         /* a */
        //   142: invokevirtual   com/sun/jna/z/a/f/a/a/a/a/e.a:()Lcom/sun/jna/z/a/f/a/a/a/e/e;
        //   145: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.a:(Lcom/sun/jna/z/a/f/a/a/a/e/e;)V
        //   150: aload_0         /* a */
        //   151: invokevirtual   com/sun/jna/z/a/f/a/a/a/a/e.d:()V
        //   154: aload           4
        //   156: monitorexit    
        //   157: goto            168
        //   160: astore          6
        //   162: aload           4
        //   164: monitorexit    
        //   165: aload           6
        //   167: athrow         
        //   168: getstatic       com/sun/jna/z/a/j.g:Z
        //   171: ifeq            185
        //   174: iinc            a, 1
        //   177: iload_3         /* a */
        //   178: putstatic       com/sun/jna/z/a/f/a/a/a/a/d.k:I
        //   181: goto            185
        //   184: athrow         
        //   185: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  119    129    132    133    Ljava/lang/NullPointerException;
        //  107    115    118    119    Ljava/lang/NullPointerException;
        //  89     103    106    107    Ljava/lang/NullPointerException;
        //  85     92     95     96     Ljava/lang/NullPointerException;
        //  49     65     68     69     Ljava/lang/NullPointerException;
        //  33     52     55     56     Ljava/lang/NullPointerException;
        //  26     45     48     49     Ljava/lang/NullPointerException;
        //  20     29     32     33     Ljava/lang/NullPointerException;
        //  12     157    160    168    Any
        //  160    165    160    168    Any
        //  168    181    184    185    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
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
    public com.sun.jna.z.a.f.a.a.a.c.d[] a(final k a) {
        final int a2 = com.sun.jna.z.a.f.a.a.a.a.d.k;
        try {
            if (a == null) {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        synchronized (this.l) {
            final com.sun.jna.z.a.f.a.a.a.c.d[] a3 = this.l.get(a);
            com.sun.jna.z.a.f.a.a.a.c.d[] array = null;
            Label_0057: {
                try {
                    array = a3;
                    if (a2 != 0) {
                        return array;
                    }
                    if (array == null) {
                        break Label_0057;
                    }
                }
                catch (NullPointerException ex2) {
                    throw ex2;
                }
                return array;
            }
            final com.sun.jna.z.a.f.a.a.a.c.d[] array2 = new com.sun.jna.z.a.f.a.a.a.c.d[0];
            return array;
        }
    }
    
    @Override
    public k a(final int a, final int a) {
        final int k = com.sun.jna.z.a.f.a.a.a.a.d.k;
        // monitorenter(l = this.l)
        final int a2 = k;
        try {
            for (final k a3 : this.l.keySet()) {
                Label_0083: {
                    k j = null;
                    Label_0073: {
                        k i;
                        try {
                            i = (j = a3);
                            if (a2 != 0) {
                                return j;
                            }
                            final Rectangle rectangle = i.j();
                            final int n = a;
                            final int n2 = a;
                            final boolean b = rectangle.contains(n, n2);
                            if (b) {
                                break Label_0073;
                            }
                            break Label_0083;
                        }
                        catch (NullPointerException ex) {
                            throw ex;
                        }
                        try {
                            final Rectangle rectangle = i.j();
                            final int n = a;
                            final int n2 = a;
                            final boolean b = rectangle.contains(n, n2);
                            if (!b) {
                                break Label_0083;
                            }
                            j = a3;
                        }
                        // monitorexit(l)
                        catch (NullPointerException ex2) {
                            throw ex2;
                        }
                    }
                    return j;
                }
                if (a2 != 0) {
                    break;
                }
            }
            return null;
        }
        finally {
        }
        // monitorexit(l)
    }
    
    @Override
    public boolean c(final k a) {
        final int k = com.sun.jna.z.a.f.a.a.a.a.d.k;
        // monitorenter(l = this.l)
        final int a2 = k;
        try {
            e e = null;
            Label_0032: {
                try {
                    e = this;
                    if (a2 != 0) {
                        break Label_0032;
                    }
                    final Map<k, com.sun.jna.z.a.f.a.a.a.c.d[]> map = this.l;
                    final k i = a;
                    final com.sun.jna.z.a.f.a.a.a.c.d[] array = map.remove(i);
                    if (array != null) {
                        break Label_0032;
                    }
                    return false;
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                try {
                    final Map<k, com.sun.jna.z.a.f.a.a.a.c.d[]> map = this.l;
                    final k i = a;
                    final com.sun.jna.z.a.f.a.a.a.c.d[] array = map.remove(i);
                    if (array == null) {
                        return false;
                    }
                    e = this;
                }
                catch (NullPointerException ex2) {
                    throw ex2;
                }
            }
            e.d();
            return true;
        }
        finally {
        }
        // monitorexit(l)
    }
    
    @Override
    public boolean b(final k a) {
        synchronized (this.l) {
            return this.l.get(a) != null;
        }
    }
    
    @Override
    public void a(final com.sun.jna.z.a.f.a.a.a.e.e a) {
        final int k = com.sun.jna.z.a.f.a.a.a.a.d.k;
        super.a(a);
        final int a2 = k;
        synchronized (this.l) {
            for (final k a3 : this.l.keySet()) {
                try {
                    a3.a(a);
                    if (a2 == 0) {
                        if (a2 == 0) {
                            continue;
                        }
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
        }
    }
    
    @Override
    public void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0         /* a */
        //     4: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //     7: dup            
        //     8: astore_2       
        //     9: monitorenter   
        //    10: istore_1        /* a */
        //    11: aload_0         /* a */
        //    12: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //    15: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    20: aload_0         /* a */
        //    21: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //    24: invokeinterface java/util/Map.size:()I
        //    29: anewarray       Lcom/sun/jna/z/a/f/a/a/a/a/k;
        //    32: invokeinterface java/util/Set.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //    37: checkcast       [Lcom/sun/jna/z/a/f/a/a/a/a/k;
        //    40: astore_3        /* a */
        //    41: aload_3         /* a */
        //    42: arraylength    
        //    43: anewarray       Ljava/awt/Rectangle;
        //    46: astore          a
        //    48: iconst_0       
        //    49: istore          a
        //    51: iload           a
        //    53: aload_3         /* a */
        //    54: arraylength    
        //    55: if_icmpge       102
        //    58: aload           a
        //    60: iload_1         /* a */
        //    61: ifne            128
        //    64: iload           a
        //    66: aload_3         /* a */
        //    67: iload           a
        //    69: aaload         
        //    70: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.j:()Ljava/awt/Rectangle;
        //    75: aastore        
        //    76: iinc            a, 1
        //    79: iload_1         /* a */
        //    80: ifeq            51
        //    83: goto            87
        //    86: athrow         
        //    87: getstatic       com/sun/jna/z/a/j.g:Z
        //    90: ifeq            98
        //    93: iconst_0       
        //    94: goto            99
        //    97: athrow         
        //    98: iconst_1       
        //    99: putstatic       com/sun/jna/z/a/j.g:Z
        //   102: aload_0         /* a */
        //   103: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //   106: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   111: aload_0         /* a */
        //   112: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //   115: invokeinterface java/util/Map.size:()I
        //   120: anewarray       [Lcom/sun/jna/z/a/f/a/a/a/c/d;
        //   123: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   128: checkcast       [[Lcom/sun/jna/z/a/f/a/a/a/c/d;
        //   131: astore          a
        //   133: aload_0         /* a */
        //   134: iload_1         /* a */
        //   135: ifne            153
        //   138: invokevirtual   com/sun/jna/z/a/f/a/a/a/a/e.a:()Lcom/sun/jna/z/a/f/a/a/a/e/e;
        //   141: ifnull          175
        //   144: goto            148
        //   147: athrow         
        //   148: aload_0         /* a */
        //   149: goto            153
        //   152: athrow         
        //   153: getfield        com/sun/jna/z/a/f/a/a/a/a/e.m:Lcom/sun/jna/z/a/f/a/a/a/c/g;
        //   156: aload_0         /* a */
        //   157: getfield        com/sun/jna/z/a/f/a/a/a/a/e.d:Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //   160: aload_0         /* a */
        //   161: invokeinterface com/sun/jna/z/a/f/a/a/a/e/d.a:(Lcom/sun/jna/z/a/f/a/a/a/a/l;)Ljava/awt/Rectangle;
        //   166: aload           a
        //   168: aload           a
        //   170: invokeinterface com/sun/jna/z/a/f/a/a/a/c/g.a:(Ljava/awt/Rectangle;[Ljava/awt/Rectangle;[[Lcom/sun/jna/z/a/f/a/a/a/c/d;)V
        //   175: aload_3         /* a */
        //   176: astore          a
        //   178: aload           a
        //   180: arraylength    
        //   181: istore          a
        //   183: iconst_0       
        //   184: istore          a
        //   186: iload           a
        //   188: iload           a
        //   190: if_icmpge       245
        //   193: aload           a
        //   195: iload           a
        //   197: aaload         
        //   198: astore          a
        //   200: iload_1         /* a */
        //   201: ifne            247
        //   204: iload_1         /* a */
        //   205: ifne            241
        //   208: goto            212
        //   211: athrow         
        //   212: aload           a
        //   214: instanceof      Lcom/sun/jna/z/a/f/a/a/a/a/l;
        //   217: ifeq            238
        //   220: goto            224
        //   223: athrow         
        //   224: aload           a
        //   226: checkcast       Lcom/sun/jna/z/a/f/a/a/a/a/l;
        //   229: invokeinterface com/sun/jna/z/a/f/a/a/a/a/l.d:()V
        //   234: goto            238
        //   237: athrow         
        //   238: iinc            a, 1
        //   241: iload_1         /* a */
        //   242: ifeq            186
        //   245: aload_2        
        //   246: monitorexit    
        //   247: goto            257
        //   250: astore          10
        //   252: aload_2        
        //   253: monitorexit    
        //   254: aload           10
        //   256: athrow         
        //   257: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  212    234    237    238    Ljava/lang/NullPointerException;
        //  204    220    223    224    Ljava/lang/NullPointerException;
        //  200    208    211    212    Ljava/lang/NullPointerException;
        //  138    149    152    153    Ljava/lang/NullPointerException;
        //  133    144    147    148    Ljava/lang/NullPointerException;
        //  87     97     97     98     Ljava/lang/NullPointerException;
        //  58     83     86     87     Ljava/lang/NullPointerException;
        //  11     247    250    257    Any
        //  250    254    250    257    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0212:
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
    public void a(final int a, final int a, final int a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0         /* a */
        //     4: iload_1         /* a */
        //     5: iload_2         /* a */
        //     6: iload_3         /* a */
        //     7: invokespecial   com/sun/jna/z/a/f/a/a/a/a/d.a:(III)V
        //    10: aload_0         /* a */
        //    11: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //    14: dup            
        //    15: astore          5
        //    17: monitorenter   
        //    18: istore          a
        //    20: aload_0         /* a */
        //    21: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //    24: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    29: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    34: astore          6
        //    36: aload           6
        //    38: invokeinterface java/util/Iterator.hasNext:()Z
        //    43: ifeq            247
        //    46: aload           6
        //    48: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    53: checkcast       Lcom/sun/jna/z/a/f/a/a/a/a/k;
        //    56: astore          a
        //    58: aload           a
        //    60: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.p:()Z
        //    65: iload           a
        //    67: ifne            270
        //    70: iload           a
        //    72: ifne            116
        //    75: goto            79
        //    78: athrow         
        //    79: ifne            95
        //    82: goto            86
        //    85: athrow         
        //    86: iload           a
        //    88: ifeq            36
        //    91: goto            95
        //    94: athrow         
        //    95: aload           a
        //    97: iload           a
        //    99: ifne            121
        //   102: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.j:()Ljava/awt/Rectangle;
        //   107: iload_1         /* a */
        //   108: iload_2         /* a */
        //   109: invokevirtual   java/awt/Rectangle.contains:(II)Z
        //   112: goto            116
        //   115: athrow         
        //   116: ifne            242
        //   119: aload           a
        //   121: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.a:()Lcom/sun/jna/z/a/f/a/a/a/e/e;
        //   126: aload           a
        //   128: invokeinterface com/sun/jna/z/a/f/a/a/a/e/e.a:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //   133: aload           a
        //   135: invokeinterface com/sun/jna/z/a/f/a/a/a/e/d.e:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)[Ljava/awt/Rectangle;
        //   140: astore          a
        //   142: aload           a
        //   144: arraylength    
        //   145: istore          a
        //   147: iconst_0       
        //   148: istore          a
        //   150: iload           a
        //   152: iload           a
        //   154: if_icmpge       242
        //   157: aload           a
        //   159: iload           a
        //   161: aaload         
        //   162: astore          a
        //   164: iload           a
        //   166: ifne            237
        //   169: aload           a
        //   171: iload_1         /* a */
        //   172: aload           a
        //   174: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.d:()I
        //   179: isub           
        //   180: iload_2         /* a */
        //   181: aload           a
        //   183: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.e:()I
        //   188: isub           
        //   189: invokevirtual   java/awt/Rectangle.contains:(II)Z
        //   192: iload           a
        //   194: ifne            43
        //   197: goto            201
        //   200: athrow         
        //   201: ifeq            234
        //   204: aload           a
        //   206: iload_1         /* a */
        //   207: aload           a
        //   209: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.d:()I
        //   214: isub           
        //   215: iload_2         /* a */
        //   216: aload           a
        //   218: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.e:()I
        //   223: isub           
        //   224: iload_3         /* a */
        //   225: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.a:(III)V
        //   230: aload           5
        //   232: monitorexit    
        //   233: return         
        //   234: iinc            a, 1
        //   237: iload           a
        //   239: ifeq            150
        //   242: iload           a
        //   244: ifeq            36
        //   247: aload_0         /* a */
        //   248: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //   251: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   256: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   261: astore          6
        //   263: aload           6
        //   265: invokeinterface java/util/Iterator.hasNext:()Z
        //   270: ifeq            381
        //   273: aload           6
        //   275: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   280: checkcast       Lcom/sun/jna/z/a/f/a/a/a/a/k;
        //   283: astore          a
        //   285: iload           a
        //   287: ifne            384
        //   290: aload           a
        //   292: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.p:()Z
        //   297: iload           a
        //   299: ifne            343
        //   302: goto            306
        //   305: athrow         
        //   306: ifne            322
        //   309: goto            313
        //   312: athrow         
        //   313: iload           a
        //   315: ifeq            263
        //   318: goto            322
        //   321: athrow         
        //   322: aload           a
        //   324: iload           a
        //   326: ifne            348
        //   329: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.j:()Ljava/awt/Rectangle;
        //   334: iload_1         /* a */
        //   335: iload_2         /* a */
        //   336: invokevirtual   java/awt/Rectangle.contains:(II)Z
        //   339: goto            343
        //   342: athrow         
        //   343: ifeq            376
        //   346: aload           a
        //   348: iload_1         /* a */
        //   349: aload           a
        //   351: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.d:()I
        //   356: isub           
        //   357: iload_2         /* a */
        //   358: aload           a
        //   360: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.e:()I
        //   365: isub           
        //   366: iload_3         /* a */
        //   367: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.a:(III)V
        //   372: aload           5
        //   374: monitorexit    
        //   375: return         
        //   376: iload           a
        //   378: ifeq            263
        //   381: aload           5
        //   383: monitorexit    
        //   384: goto            395
        //   387: astore          12
        //   389: aload           5
        //   391: monitorexit    
        //   392: aload           12
        //   394: athrow         
        //   395: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  164    197    200    201    Ljava/lang/NullPointerException;
        //  95     112    115    116    Ljava/lang/NullPointerException;
        //  79     91     94     95     Ljava/lang/NullPointerException;
        //  70     82     85     86     Ljava/lang/NullPointerException;
        //  58     75     78     79     Ljava/lang/NullPointerException;
        //  20     233    387    395    Any
        //  322    339    342    343    Ljava/lang/NullPointerException;
        //  306    318    321    322    Ljava/lang/NullPointerException;
        //  290    309    312    313    Ljava/lang/NullPointerException;
        //  285    302    305    306    Ljava/lang/NullPointerException;
        //  234    375    387    395    Any
        //  376    384    387    395    Any
        //  387    392    387    395    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0079:
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
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0         /* a */
        //     4: iload_1         /* a */
        //     5: iload_2         /* a */
        //     6: iload_3         /* a */
        //     7: invokespecial   com/sun/jna/z/a/f/a/a/a/a/d.b:(III)V
        //    10: istore          a
        //    12: aload_0         /* a */
        //    13: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //    16: dup            
        //    17: astore          5
        //    19: monitorenter   
        //    20: aload_0         /* a */
        //    21: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //    24: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    29: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    34: astore          6
        //    36: aload           6
        //    38: invokeinterface java/util/Iterator.hasNext:()Z
        //    43: ifeq            247
        //    46: aload           6
        //    48: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    53: checkcast       Lcom/sun/jna/z/a/f/a/a/a/a/k;
        //    56: astore          a
        //    58: aload           a
        //    60: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.p:()Z
        //    65: iload           a
        //    67: ifne            270
        //    70: iload           a
        //    72: ifne            116
        //    75: goto            79
        //    78: athrow         
        //    79: ifne            95
        //    82: goto            86
        //    85: athrow         
        //    86: iload           a
        //    88: ifeq            36
        //    91: goto            95
        //    94: athrow         
        //    95: aload           a
        //    97: iload           a
        //    99: ifne            121
        //   102: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.j:()Ljava/awt/Rectangle;
        //   107: iload_1         /* a */
        //   108: iload_2         /* a */
        //   109: invokevirtual   java/awt/Rectangle.contains:(II)Z
        //   112: goto            116
        //   115: athrow         
        //   116: ifne            242
        //   119: aload           a
        //   121: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.a:()Lcom/sun/jna/z/a/f/a/a/a/e/e;
        //   126: aload           a
        //   128: invokeinterface com/sun/jna/z/a/f/a/a/a/e/e.a:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //   133: aload           a
        //   135: invokeinterface com/sun/jna/z/a/f/a/a/a/e/d.e:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)[Ljava/awt/Rectangle;
        //   140: astore          a
        //   142: aload           a
        //   144: arraylength    
        //   145: istore          a
        //   147: iconst_0       
        //   148: istore          a
        //   150: iload           a
        //   152: iload           a
        //   154: if_icmpge       242
        //   157: aload           a
        //   159: iload           a
        //   161: aaload         
        //   162: astore          a
        //   164: iload           a
        //   166: ifne            237
        //   169: aload           a
        //   171: iload_1         /* a */
        //   172: aload           a
        //   174: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.d:()I
        //   179: isub           
        //   180: iload_2         /* a */
        //   181: aload           a
        //   183: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.e:()I
        //   188: isub           
        //   189: invokevirtual   java/awt/Rectangle.contains:(II)Z
        //   192: iload           a
        //   194: ifne            43
        //   197: goto            201
        //   200: athrow         
        //   201: ifeq            234
        //   204: aload           a
        //   206: iload_1         /* a */
        //   207: aload           a
        //   209: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.d:()I
        //   214: isub           
        //   215: iload_2         /* a */
        //   216: aload           a
        //   218: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.e:()I
        //   223: isub           
        //   224: iload_3         /* a */
        //   225: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.b:(III)V
        //   230: aload           5
        //   232: monitorexit    
        //   233: return         
        //   234: iinc            a, 1
        //   237: iload           a
        //   239: ifeq            150
        //   242: iload           a
        //   244: ifeq            36
        //   247: aload_0         /* a */
        //   248: getfield        com/sun/jna/z/a/f/a/a/a/a/e.l:Ljava/util/Map;
        //   251: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   256: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   261: astore          6
        //   263: aload           6
        //   265: invokeinterface java/util/Iterator.hasNext:()Z
        //   270: ifeq            381
        //   273: aload           6
        //   275: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   280: checkcast       Lcom/sun/jna/z/a/f/a/a/a/a/k;
        //   283: astore          a
        //   285: iload           a
        //   287: ifne            384
        //   290: aload           a
        //   292: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.p:()Z
        //   297: iload           a
        //   299: ifne            343
        //   302: goto            306
        //   305: athrow         
        //   306: ifne            322
        //   309: goto            313
        //   312: athrow         
        //   313: iload           a
        //   315: ifeq            263
        //   318: goto            322
        //   321: athrow         
        //   322: aload           a
        //   324: iload           a
        //   326: ifne            348
        //   329: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.j:()Ljava/awt/Rectangle;
        //   334: iload_1         /* a */
        //   335: iload_2         /* a */
        //   336: invokevirtual   java/awt/Rectangle.contains:(II)Z
        //   339: goto            343
        //   342: athrow         
        //   343: ifeq            376
        //   346: aload           a
        //   348: iload_1         /* a */
        //   349: aload           a
        //   351: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.d:()I
        //   356: isub           
        //   357: iload_2         /* a */
        //   358: aload           a
        //   360: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.e:()I
        //   365: isub           
        //   366: iload_3         /* a */
        //   367: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.b:(III)V
        //   372: aload           5
        //   374: monitorexit    
        //   375: return         
        //   376: iload           a
        //   378: ifeq            263
        //   381: aload           5
        //   383: monitorexit    
        //   384: goto            395
        //   387: astore          12
        //   389: aload           5
        //   391: monitorexit    
        //   392: aload           12
        //   394: athrow         
        //   395: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  164    197    200    201    Ljava/lang/NullPointerException;
        //  95     112    115    116    Ljava/lang/NullPointerException;
        //  79     91     94     95     Ljava/lang/NullPointerException;
        //  70     82     85     86     Ljava/lang/NullPointerException;
        //  58     75     78     79     Ljava/lang/NullPointerException;
        //  20     233    387    395    Any
        //  322    339    342    343    Ljava/lang/NullPointerException;
        //  306    318    321    322    Ljava/lang/NullPointerException;
        //  290    309    312    313    Ljava/lang/NullPointerException;
        //  285    302    305    306    Ljava/lang/NullPointerException;
        //  234    375    387    395    Any
        //  376    384    387    395    Any
        //  387    392    387    395    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0079:
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
    public void d(boolean a) {
        super.d(a);
        final int k = com.sun.jna.z.a.f.a.a.a.a.d.k;
        a = this.q();
        final int a2 = k;
        synchronized (this.l) {
            for (final k a3 : this.l.keySet()) {
                try {
                    a3.d(a);
                    if (a2 == 0) {
                        if (a2 == 0) {
                            continue;
                        }
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
        }
    }
    
    @Override
    public void c(boolean a) {
        super.c(a);
        final int k = com.sun.jna.z.a.f.a.a.a.a.d.k;
        a = this.p();
        final int a2 = k;
        synchronized (this.l) {
            for (final k a3 : this.l.keySet()) {
                try {
                    a3.c(a);
                    if (a2 == 0) {
                        if (a2 == 0) {
                            continue;
                        }
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
        }
    }
    
    @Override
    public void c() {
        final k[] a = this.b();
        final int k = com.sun.jna.z.a.f.a.a.a.a.d.k;
        final int a2 = a.length;
        final int a3 = k;
        int a4 = 0;
        while (a4 < a2) {
            final k a5 = a[a4];
            a5.c();
            ++a4;
            if (a3 != 0) {
                break;
            }
        }
    }
}
