package com.sun.jna.z.a.d;

import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;
import com.sun.jna.z.a.e.*;

public class d implements IEventListener
{
    private static final String[] a;
    
    public void invoke(final Event a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_1         /* a */
        //     4: checkcast       Lnet/minecraftforge/client/event/MouseEvent;
        //     7: astore_3       
        //     8: istore_2        /* a */
        //     9: aload_3         /* a */
        //    10: getfield        net/minecraftforge/client/event/MouseEvent.buttonstate:Z
        //    13: iload_2         /* a */
        //    14: ifne            64
        //    17: ifeq            60
        //    20: getstatic       com/sun/jna/z/a/i.d:Lcom/sun/jna/z/a/i;
        //    23: getfield        com/sun/jna/z/a/i.a:Lcom/sun/jna/z/a/e/g;
        //    26: getfield        com/sun/jna/z/a/e/g.a:Ljava/util/Map;
        //    29: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //    34: invokeinterface java/util/Collection.stream:()Ljava/util/stream/Stream;
        //    39: aload_3         /* a */
        //    40: invokedynamic   BootstrapMethod #0, test:(Lnet/minecraftforge/client/event/MouseEvent;)Ljava/util/function/Predicate;
        //    45: invokeinterface java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        //    50: invokedynamic   BootstrapMethod #1, accept:()Ljava/util/function/Consumer;
        //    55: invokeinterface java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        //    60: aload_3         /* a */
        //    61: getfield        net/minecraftforge/client/event/MouseEvent.button:I
        //    64: iconst_2       
        //    65: iload_2         /* a */
        //    66: ifne            77
        //    69: if_icmpne       231
        //    72: aload_3         /* a */
        //    73: getfield        net/minecraftforge/client/event/MouseEvent.buttonstate:Z
        //    76: iconst_1       
        //    77: if_icmpne       231
        //    80: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    83: getfield        net/minecraft/client/Minecraft.field_71476_x:Lnet/minecraft/util/MovingObjectPosition;
        //    86: getfield        net/minecraft/util/MovingObjectPosition.field_72308_g:Lnet/minecraft/entity/Entity;
        //    89: astore          a
        //    91: iload_2         /* a */
        //    92: ifne            241
        //    95: aload           a
        //    97: instanceof      Lnet/minecraft/client/entity/EntityOtherPlayerMP;
        //   100: ifeq            231
        //   103: aload           a
        //   105: invokevirtual   net/minecraft/entity/Entity.func_70005_c_:()Ljava/lang/String;
        //   108: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   111: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   114: invokestatic    net/minecraft/util/StringUtils.func_76338_a:(Ljava/lang/String;)Ljava/lang/String;
        //   117: astore          a
        //   119: getstatic       com/sun/jna/z/a/j.e:Lcom/sun/jna/z/a/j;
        //   122: getfield        com/sun/jna/z/a/j.d:Lcom/sun/jna/z/a/g/g;
        //   125: aload           a
        //   127: invokevirtual   com/sun/jna/z/a/g/g.a:(Lnet/minecraft/entity/Entity;)Z
        //   130: iload_2         /* a */
        //   131: ifne            204
        //   134: ifeq            188
        //   137: getstatic       com/sun/jna/z/a/j.e:Lcom/sun/jna/z/a/j;
        //   140: getfield        com/sun/jna/z/a/j.d:Lcom/sun/jna/z/a/g/g;
        //   143: getfield        com/sun/jna/z/a/g/g.a:Ljava/util/List;
        //   146: aload           a
        //   148: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //   153: pop            
        //   154: new             Ljava/lang/StringBuilder;
        //   157: dup            
        //   158: invokespecial   java/lang/StringBuilder.<init>:()V
        //   161: aload           a
        //   163: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   166: getstatic       com/sun/jna/z/a/d/d.a:[Ljava/lang/String;
        //   169: astore          a
        //   171: aload           a
        //   173: iconst_0       
        //   174: aaload         
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   181: invokestatic    com/sun/jna/z/a/a/a.e:(Ljava/lang/String;)V
        //   184: iload_2         /* a */
        //   185: ifeq            231
        //   188: getstatic       com/sun/jna/z/a/j.e:Lcom/sun/jna/z/a/j;
        //   191: getfield        com/sun/jna/z/a/j.d:Lcom/sun/jna/z/a/g/g;
        //   194: getfield        com/sun/jna/z/a/g/g.a:Ljava/util/List;
        //   197: aload           a
        //   199: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   204: pop            
        //   205: new             Ljava/lang/StringBuilder;
        //   208: dup            
        //   209: invokespecial   java/lang/StringBuilder.<init>:()V
        //   212: aload           a
        //   214: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   217: getstatic       com/sun/jna/z/a/d/d.a:[Ljava/lang/String;
        //   220: iconst_1       
        //   221: aaload         
        //   222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   225: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   228: invokestatic    com/sun/jna/z/a/a/a.e:(Ljava/lang/String;)V
        //   231: getstatic       com/sun/jna/z/a/i.d:Lcom/sun/jna/z/a/i;
        //   234: getfield        com/sun/jna/z/a/i.k:Lcom/sun/jna/z/a/h;
        //   237: aload_3         /* a */
        //   238: invokevirtual   com/sun/jna/z/a/h.a:(Lnet/minecraftforge/client/event/MouseEvent;)V
        //   241: getstatic       com/sun/jna/z/a/i.d:Lcom/sun/jna/z/a/i;
        //   244: getfield        com/sun/jna/z/a/i.a:Lcom/sun/jna/z/a/e/g;
        //   247: getfield        com/sun/jna/z/a/e/g.a:Ljava/util/Map;
        //   250: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   255: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   260: astore          4
        //   262: aload           4
        //   264: invokeinterface java/util/Iterator.hasNext:()Z
        //   269: ifeq            309
        //   272: aload           4
        //   274: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   279: checkcast       Lcom/sun/jna/z/a/e/c;
        //   282: astore          a
        //   284: aload           a
        //   286: iload_2         /* a */
        //   287: ifne            298
        //   290: invokevirtual   com/sun/jna/z/a/e/c.c:()Z
        //   293: ifeq            305
        //   296: aload           a
        //   298: aload_1         /* a */
        //   299: checkcast       Lnet/minecraftforge/client/event/MouseEvent;
        //   302: invokevirtual   com/sun/jna/z/a/e/c.a:(Lnet/minecraftforge/client/event/MouseEvent;)V
        //   305: iload_2         /* a */
        //   306: ifeq            262
        //   309: getstatic       com/sun/jna/z/a/j.g:Z
        //   312: ifeq            322
        //   315: iinc            a, 1
        //   318: iload_2         /* a */
        //   319: putstatic       com/sun/jna/z/a/d/b.b:I
        //   322: return         
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
    
    private static boolean a(final MouseEvent a, final c a) {
        final int a2 = b.b;
        int b;
        final int n = b = a.b();
        if (a2 == 0) {
            if (n == a.button - 100) {
                b = (true ? 1 : 0);
            }
            else {
                b = (false ? 1 : 0);
            }
        }
        return b != 0;
    }
    
    static {
        final String[] a2 = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "N\u00f4\u0089\u0095)\u00e1功n吒u008a\u008a)\u00fa\u00e0\b\u00f4\u0085\u009d(\u00f3許u0016N\u00e7\u0088\u009c#\u00f3\u00e0\u001a\u00e9\u00cc\u009e4\u00fe功u0000\u00e2\u009f\u00d8*\u00fe許u001a").length();
        int char1 = 21;
        int n2 = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(n2);
                ++n2;
                final String s2 = s;
                final int n3 = n2;
                final char[] charArray = s2.substring(n3, n3 + char1).toCharArray();
                int length2;
                int n5;
                final int n4 = n5 = (length2 = charArray.length);
                int n6 = 0;
                while (true) {
                    Label_0189: {
                        if (n4 > 1) {
                            break Label_0189;
                        }
                        length2 = (n5 = n6);
                        do {
                            final char c = charArray[n5];
                            char c2 = '\0';
                            switch (n6 % 7) {
                                case 0: {
                                    c2 = 'n';
                                    break;
                                }
                                case 1: {
                                    c2 = '\u0086';
                                    break;
                                }
                                case 2: {
                                    c2 = '\u00ec';
                                    break;
                                }
                                case 3: {
                                    c2 = '\u00f8';
                                    break;
                                }
                                case 4: {
                                    c2 = 'F';
                                    break;
                                }
                                case 5: {
                                    c2 = '\u0097';
                                    break;
                                }
                                default: {
                                    c2 = '\u00c0';
                                    break;
                                }
                            }
                            charArray[length2] = (char)(c ^ c2);
                            ++n6;
                        } while (n4 == 0);
                    }
                    if (n4 > n6) {
                        continue;
                    }
                    break;
                }
                a2[n++] = new String(charArray).intern();
            } while ((n2 += char1) < length);
        }
        a = a2;
    }
}
