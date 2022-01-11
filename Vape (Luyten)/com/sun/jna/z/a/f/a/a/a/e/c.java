package com.sun.jna.z.a.f.a.a.a.e;

import com.sun.jna.z.a.f.a.a.a.a.*;
import java.util.*;

public abstract class c implements e
{
    protected final Map<Class<? extends k>, d> a;
    
    public c() {
        this.a = new HashMap<Class<? extends k>, d>();
    }
    
    protected void a(final b<?> a) {
        this.a.put((Class<? extends k>)a.a, a);
    }
    
    @Override
    public d a(final k a) {
        final int a2 = b.d ? 1 : 0;
        Label_0023: {
            try {
                final k k = a;
                if (a2 != 0) {
                    break Label_0023;
                }
                if (a == null) {
                    break Label_0023;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            final k k = a;
            try {
                if (!(k instanceof k)) {
                    throw new IllegalArgumentException();
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        return this.a(a.getClass());
    }
    
    public d a(final Class<? extends k> a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_1         /* a */
        //     4: invokevirtual   java/lang/Class.getInterfaces:()[Ljava/lang/Class;
        //     7: astore_3        /* a */
        //     8: istore_2        /* a */
        //     9: aload_3         /* a */
        //    10: arraylength    
        //    11: istore          a
        //    13: iconst_0       
        //    14: istore          a
        //    16: iload           a
        //    18: iload           a
        //    20: if_icmpge       77
        //    23: aload_3         /* a */
        //    24: iload           a
        //    26: aaload         
        //    27: astore          a
        //    29: aload_0         /* a */
        //    30: getfield        com/sun/jna/z/a/f/a/a/a/e/c.a:Ljava/util/Map;
        //    33: aload           a
        //    35: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    40: checkcast       Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //    43: astore          a
        //    45: iload_2         /* a */
        //    46: ifne            73
        //    49: aload           a
        //    51: iload_2         /* a */
        //    52: ifne            135
        //    55: goto            59
        //    58: athrow         
        //    59: ifnull          70
        //    62: goto            66
        //    65: athrow         
        //    66: aload           a
        //    68: areturn        
        //    69: athrow         
        //    70: iinc            a, 1
        //    73: iload_2         /* a */
        //    74: ifeq            16
        //    77: aload_1         /* a */
        //    78: invokevirtual   java/lang/Class.getSuperclass:()Ljava/lang/Class;
        //    81: ldc             Lcom/sun/jna/z/a/f/a/a/a/a/k;.class
        //    83: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    86: iload_2         /* a */
        //    87: ifne            121
        //    90: ifeq            112
        //    93: goto            97
        //    96: athrow         
        //    97: aload_0         /* a */
        //    98: getfield        com/sun/jna/z/a/f/a/a/a/e/c.a:Ljava/util/Map;
        //   101: aload_1         /* a */
        //   102: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   107: checkcast       Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //   110: areturn        
        //   111: athrow         
        //   112: ldc             Lcom/sun/jna/z/a/f/a/a/a/a/k;.class
        //   114: aload_1         /* a */
        //   115: invokevirtual   java/lang/Class.getSuperclass:()Ljava/lang/Class;
        //   118: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   121: ifne            127
        //   124: aconst_null    
        //   125: areturn        
        //   126: athrow         
        //   127: aload_0         /* a */
        //   128: aload_1         /* a */
        //   129: invokevirtual   java/lang/Class.getSuperclass:()Ljava/lang/Class;
        //   132: invokevirtual   com/sun/jna/z/a/f/a/a/a/e/c.a:(Ljava/lang/Class;)Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //   135: getstatic       com/sun/jna/z/a/j.g:Z
        //   138: ifeq            158
        //   141: iload_2         /* a */
        //   142: ifeq            154
        //   145: goto            149
        //   148: athrow         
        //   149: iconst_0       
        //   150: goto            155
        //   153: athrow         
        //   154: iconst_1       
        //   155: putstatic       com/sun/jna/z/a/f/a/a/a/e/b.d:Z
        //   158: areturn        
        //    Signature:
        //  (Ljava/lang/Class<+Lcom/sun/jna/z/a/f/a/a/a/a/k;>;)Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  45     55     58     59     Ljava/lang/IllegalArgumentException;
        //  49     62     65     66     Ljava/lang/IllegalArgumentException;
        //  59     69     69     70     Ljava/lang/IllegalArgumentException;
        //  77     93     96     97     Ljava/lang/IllegalArgumentException;
        //  90     111    111    112    Ljava/lang/IllegalArgumentException;
        //  121    126    126    127    Ljava/lang/IllegalArgumentException;
        //  135    145    148    149    Ljava/lang/IllegalArgumentException;
        //  141    153    153    154    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
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
}
