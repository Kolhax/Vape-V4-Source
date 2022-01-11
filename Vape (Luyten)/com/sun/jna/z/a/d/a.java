package com.sun.jna.z.a.d;

import com.sun.jna.z.a.g.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class a implements IEventListener
{
    h a;
    boolean b;
    private static final String c;
    
    public void invoke(final Event a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_1         /* a */
        //     4: checkcast       Lnet/minecraftforge/client/event/RenderGameOverlayEvent;
        //     7: astore_3       
        //     8: istore_2        /* a */
        //     9: aload_3         /* a */
        //    10: iload_2         /* a */
        //    11: ifne            21
        //    14: invokevirtual   net/minecraftforge/client/event/RenderGameOverlayEvent.isCancelable:()Z
        //    17: ifne            30
        //    20: aload_3         /* a */
        //    21: getfield        net/minecraftforge/client/event/RenderGameOverlayEvent.type:Lnet/minecraftforge/client/event/RenderGameOverlayEvent$ElementType;
        //    24: getstatic       net/minecraftforge/client/event/RenderGameOverlayEvent$ElementType.ALL:Lnet/minecraftforge/client/event/RenderGameOverlayEvent$ElementType;
        //    27: if_acmpeq       31
        //    30: return         
        //    31: bipush          29
        //    33: invokestatic    org/lwjgl/input/Keyboard.isKeyDown:(I)Z
        //    36: iload_2         /* a */
        //    37: ifne            49
        //    40: ifeq            86
        //    43: sipush          199
        //    46: invokestatic    org/lwjgl/input/Keyboard.isKeyDown:(I)Z
        //    49: iload_2         /* a */
        //    50: ifne            64
        //    53: ifeq            86
        //    56: aload_0         /* a */
        //    57: iload_2         /* a */
        //    58: ifne            87
        //    61: getfield        com/sun/jna/z/a/d/a.b:Z
        //    64: ifne            86
        //    67: aload_0         /* a */
        //    68: iconst_1       
        //    69: putfield        com/sun/jna/z/a/d/a.b:Z
        //    72: getstatic       com/sun/jna/z/a/i.d:Lcom/sun/jna/z/a/i;
        //    75: getfield        com/sun/jna/z/a/i.a:Lcom/sun/jna/z/a/e/g;
        //    78: ldc             Lcom/sun/jna/z/a/e/d;.class
        //    80: invokevirtual   com/sun/jna/z/a/e/g.a:(Ljava/lang/Class;)Lcom/sun/jna/z/a/e/c;
        //    83: invokevirtual   com/sun/jna/z/a/e/c.d:()V
        //    86: aload_0         /* a */
        //    87: iload_2         /* a */
        //    88: ifne            98
        //    91: getfield        com/sun/jna/z/a/d/a.a:Lcom/sun/jna/z/a/g/h;
        //    94: ifnonnull       123
        //    97: aload_0         /* a */
        //    98: new             Lcom/sun/jna/z/a/g/h;
        //   101: dup            
        //   102: new             Ljava/awt/Font;
        //   105: dup            
        //   106: getstatic       com/sun/jna/z/a/d/a.c:Ljava/lang/String;
        //   109: iconst_0       
        //   110: bipush          20
        //   112: invokespecial   java/awt/Font.<init>:(Ljava/lang/String;II)V
        //   115: ldc             20.0
        //   117: invokespecial   com/sun/jna/z/a/g/h.<init>:(Ljava/lang/Object;F)V
        //   120: putfield        com/sun/jna/z/a/d/a.a:Lcom/sun/jna/z/a/g/h;
        //   123: getstatic       com/sun/jna/z/a/j.e:Lcom/sun/jna/z/a/j;
        //   126: getfield        com/sun/jna/z/a/j.c:Lcom/sun/jna/z/a/f/a/a/a/h;
        //   129: iload_2         /* a */
        //   130: ifne            196
        //   133: ifnonnull       187
        //   136: getstatic       com/sun/jna/z/a/j.e:Lcom/sun/jna/z/a/j;
        //   139: new             Lcom/sun/jna/z/a/f/a/a/a/h;
        //   142: dup            
        //   143: invokespecial   com/sun/jna/z/a/f/a/a/a/h.<init>:()V
        //   146: putfield        com/sun/jna/z/a/j.c:Lcom/sun/jna/z/a/f/a/a/a/h;
        //   149: getstatic       com/sun/jna/z/a/j.e:Lcom/sun/jna/z/a/j;
        //   152: getfield        com/sun/jna/z/a/j.c:Lcom/sun/jna/z/a/f/a/a/a/h;
        //   155: new             Lcom/sun/jna/z/a/f/a/a/a/e/a/i;
        //   158: dup            
        //   159: invokespecial   com/sun/jna/z/a/f/a/a/a/e/a/i.<init>:()V
        //   162: invokevirtual   com/sun/jna/z/a/f/a/a/a/h.a:(Lcom/sun/jna/z/a/f/a/a/a/e/e;)V
        //   165: getstatic       com/sun/jna/z/a/j.e:Lcom/sun/jna/z/a/j;
        //   168: getfield        com/sun/jna/z/a/j.c:Lcom/sun/jna/z/a/f/a/a/a/h;
        //   171: invokevirtual   com/sun/jna/z/a/f/a/a/a/h.a:()V
        //   174: getstatic       com/sun/jna/z/a/i.d:Lcom/sun/jna/z/a/i;
        //   177: getfield        com/sun/jna/z/a/i.f:Lcom/sun/jna/z/a/b/f;
        //   180: invokevirtual   com/sun/jna/z/a/b/f.g:()V
        //   183: iload_2         /* a */
        //   184: ifeq            236
        //   187: invokestatic    org/lwjgl/opengl/GL11.glPushMatrix:()V
        //   190: getstatic       com/sun/jna/z/a/j.e:Lcom/sun/jna/z/a/j;
        //   193: getfield        com/sun/jna/z/a/j.c:Lcom/sun/jna/z/a/f/a/a/a/h;
        //   196: invokevirtual   com/sun/jna/z/a/f/a/a/a/h.f:()V
        //   199: invokestatic    org/lwjgl/opengl/GL11.glPopMatrix:()V
        //   202: iload_2         /* a */
        //   203: ifne            248
        //   206: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   209: getfield        net/minecraft/client/Minecraft.field_71462_r:Lnet/minecraft/client/gui/GuiScreen;
        //   212: getstatic       com/sun/jna/z/a/j.e:Lcom/sun/jna/z/a/j;
        //   215: invokevirtual   com/sun/jna/z/a/j.d:()Lcom/sun/jna/z/a/f/a/a/a/f/b;
        //   218: if_acmpeq       236
        //   221: invokestatic    org/lwjgl/opengl/GL11.glPushMatrix:()V
        //   224: getstatic       com/sun/jna/z/a/j.e:Lcom/sun/jna/z/a/j;
        //   227: getfield        com/sun/jna/z/a/j.c:Lcom/sun/jna/z/a/f/a/a/a/h;
        //   230: invokevirtual   com/sun/jna/z/a/f/a/a/a/h.e:()V
        //   233: invokestatic    org/lwjgl/opengl/GL11.glPopMatrix:()V
        //   236: aload_0         /* a */
        //   237: getfield        com/sun/jna/z/a/d/a.a:Lcom/sun/jna/z/a/g/h;
        //   240: ldc             " "
        //   242: fconst_0       
        //   243: fconst_0       
        //   244: iconst_0       
        //   245: invokevirtual   com/sun/jna/z/a/g/h.b:(Ljava/lang/String;FFI)V
        //   248: return         
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
        final char[] charArray = "3H\u00e0q#kª".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0122: {
                if (n > 1) {
                    break Label_0122;
                }
                length = (n2 = n3);
                do {
                    final char c2 = charArray[n2];
                    char c3 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c3 = 'p';
                            break;
                        }
                        case 1: {
                            c3 = ')';
                            break;
                        }
                        case 2: {
                            c3 = '\u008c';
                            break;
                        }
                        case 3: {
                            c3 = '\u0018';
                            break;
                        }
                        case 4: {
                            c3 = 'A';
                            break;
                        }
                        case 5: {
                            c3 = '\u0019';
                            break;
                        }
                        default: {
                            c3 = '\u00c3';
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
