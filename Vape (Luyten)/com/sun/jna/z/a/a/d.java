package com.sun.jna.z.a.a;

import net.minecraft.client.*;
import java.util.*;

public class d
{
    Minecraft a;
    public List<a> b;
    private static final String c;
    
    public d() {
        this.b = Arrays.asList(new c(), new b());
        this.a = Minecraft.func_71410_x();
    }
    
    public void a(final String a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2        /* a */
        //     4: aload_1         /* a */
        //     5: ldc             "."
        //     7: iload_2         /* a */
        //     8: ifne            33
        //    11: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    14: ifeq            216
        //    17: goto            21
        //    20: athrow         
        //    21: aload_1         /* a */
        //    22: ldc             "."
        //    24: ldc             ""
        //    26: invokevirtual   java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    29: astore_1        /* a */
        //    30: aload_1         /* a */
        //    31: ldc             " "
        //    33: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    36: astore_3        /* a */
        //    37: ldc             ""
        //    39: astore          a
        //    41: ldc             ""
        //    43: astore          a
        //    45: ldc             ""
        //    47: astore          a
        //    49: aload_3         /* a */
        //    50: iconst_0       
        //    51: aaload         
        //    52: astore          a
        //    54: aload_3         /* a */
        //    55: iconst_1       
        //    56: aaload         
        //    57: astore          a
        //    59: aload_3         /* a */
        //    60: iconst_2       
        //    61: aaload         
        //    62: astore          a
        //    64: goto            69
        //    67: astore          7
        //    69: aconst_null    
        //    70: astore          a
        //    72: iconst_0       
        //    73: istore          a
        //    75: aload_0         /* a */
        //    76: getfield        com/sun/jna/z/a/a/d.b:Ljava/util/List;
        //    79: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    84: astore          9
        //    86: aload           9
        //    88: invokeinterface java/util/Iterator.hasNext:()Z
        //    93: ifeq            201
        //    96: aload           9
        //    98: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   103: checkcast       Lcom/sun/jna/z/a/a/a;
        //   106: astore          a
        //   108: aload           a
        //   110: invokevirtual   com/sun/jna/z/a/a/a.b:()Ljava/lang/String;
        //   113: ldc             " "
        //   115: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   118: iconst_0       
        //   119: aaload         
        //   120: aload           a
        //   122: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   125: iload_2         /* a */
        //   126: ifne            203
        //   129: iload_2         /* a */
        //   130: ifne            187
        //   133: goto            137
        //   136: athrow         
        //   137: ifeq            193
        //   140: goto            144
        //   143: athrow         
        //   144: aload           a
        //   146: aload           a
        //   148: invokevirtual   com/sun/jna/z/a/a/a.c:(Ljava/lang/String;)V
        //   151: aload           a
        //   153: aload           a
        //   155: invokevirtual   com/sun/jna/z/a/a/a.a:(Ljava/lang/String;)V
        //   158: aload           a
        //   160: aload           a
        //   162: invokevirtual   com/sun/jna/z/a/a/a.b:(Ljava/lang/String;)V
        //   165: aload           a
        //   167: aload_3         /* a */
        //   168: invokevirtual   com/sun/jna/z/a/a/a.a:([Ljava/lang/String;)V
        //   171: aload           a
        //   173: aload_1         /* a */
        //   174: invokevirtual   com/sun/jna/z/a/a/a.d:(Ljava/lang/String;)V
        //   177: aload           a
        //   179: invokevirtual   com/sun/jna/z/a/a/a.a:()V
        //   182: iconst_1       
        //   183: goto            187
        //   186: athrow         
        //   187: istore          a
        //   189: iload_2         /* a */
        //   190: ifeq            201
        //   193: iload_2         /* a */
        //   194: ifeq            86
        //   197: goto            201
        //   200: athrow         
        //   201: iload           a
        //   203: ifne            216
        //   206: getstatic       com/sun/jna/z/a/a/d.c:Ljava/lang/String;
        //   209: invokestatic    com/sun/jna/z/a/a/a.e:(Ljava/lang/String;)V
        //   212: goto            216
        //   215: athrow         
        //   216: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      17     20     21     Ljava/lang/Exception;
        //  49     64     67     69     Ljava/lang/Exception;
        //  108    133    136    137    Ljava/lang/Exception;
        //  129    140    143    144    Ljava/lang/Exception;
        //  137    183    186    187    Ljava/lang/Exception;
        //  189    197    200    201    Ljava/lang/Exception;
        //  203    212    215    216    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0137:
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
    
    static {
        final char[] charArray = "\u0080\u009c\u00f6¼u7\u001e\u00f5\u0091\u00f2¿w!\u001e±".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0124: {
                if (n > 1) {
                    break Label_0124;
                }
                length = (n2 = n3);
                do {
                    final char c2 = charArray[n2];
                    char c3 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c3 = '\u00d5';
                            break;
                        }
                        case 1: {
                            c3 = '\u00f2';
                            break;
                        }
                        case 2: {
                            c3 = '\u009d';
                            break;
                        }
                        case 3: {
                            c3 = '\u00d2';
                            break;
                        }
                        case 4: {
                            c3 = '\u001a';
                            break;
                        }
                        case 5: {
                            c3 = '@';
                            break;
                        }
                        default: {
                            c3 = 'p';
                            break;
                        }
                    }
                    charArray[length] = (char)(c2 ^ c3);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                c = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
