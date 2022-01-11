package com.sun.jna.z.a.d;

import net.minecraftforge.fml.common.eventhandler.*;

public class e implements IEventListener
{
    private static final String a;
    
    public void invoke(final Event a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: getstatic       com/sun/jna/z/a/i.d:Lcom/sun/jna/z/a/i;
        //     6: getfield        com/sun/jna/z/a/i.a:Lcom/sun/jna/z/a/e/g;
        //     9: getstatic       com/sun/jna/z/a/d/e.a:Ljava/lang/String;
        //    12: invokevirtual   com/sun/jna/z/a/e/g.a:(Ljava/lang/String;)Lcom/sun/jna/z/a/e/c;
        //    15: astore_3       
        //    16: istore_2        /* a */
        //    17: aload_3         /* a */
        //    18: iload_2         /* a */
        //    19: ifne            26
        //    22: ifnull          37
        //    25: aload_3         /* a */
        //    26: invokevirtual   com/sun/jna/z/a/e/c.c:()Z
        //    29: ifeq            37
        //    32: aload_1         /* a */
        //    33: iconst_1       
        //    34: invokevirtual   net/minecraftforge/fml/common/eventhandler/Event.setCanceled:(Z)V
        //    37: return         
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
        final char[] charArray = "\b\u008e\u00d0u(J¿5".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0123: {
                if (n > 1) {
                    break Label_0123;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c2 = 'F';
                            break;
                        }
                        case 1: {
                            c2 = '\u00ef';
                            break;
                        }
                        case 2: {
                            c2 = '½';
                            break;
                        }
                        case 3: {
                            c2 = '\u0010';
                            break;
                        }
                        case 4: {
                            c2 = '|';
                            break;
                        }
                        case 5: {
                            c2 = '+';
                            break;
                        }
                        default: {
                            c2 = '\u00d8';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                a = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
