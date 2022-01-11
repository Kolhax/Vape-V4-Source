package com.sun.jna.z.a.f.a.a.a.e.a;

import java.awt.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class b extends com.sun.jna.z.a.f.a.a.a.e.b<i>
{
    private final com.sun.jna.z.a.f.a.a.a.e.a.i e;
    private static final String f;
    
    b(final com.sun.jna.z.a.f.a.a.a.e.a.i a) {
        super(i.class);
        this.e = a;
        this.b = Color.WHITE;
        this.c = new Color(128, 128, 128, 192);
    }
    
    protected void a(final i a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1         /* a */
        //     2: iconst_0       
        //     3: invokevirtual   com/sun/jna/z/a/f/a/a/a/e/a/b.a:(Lcom/sun/jna/z/a/f/a/a/a/a/k;Z)V
        //     6: aload_1         /* a */
        //     7: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.j:()Ljava/awt/Rectangle;
        //    12: astore_3        /* a */
        //    13: sipush          3042
        //    16: invokestatic    org/lwjgl/opengl/GL11.glEnable:(I)V
        //    19: sipush          2884
        //    22: invokestatic    org/lwjgl/opengl/GL11.glDisable:(I)V
        //    25: sipush          3553
        //    28: invokestatic    org/lwjgl/opengl/GL11.glDisable:(I)V
        //    31: getstatic       com/sun/jna/z/a/f/a/a/a/e/a/i.f:I
        //    34: aload_3         /* a */
        //    35: getfield        java/awt/Rectangle.height:I
        //    38: iconst_4       
        //    39: isub           
        //    40: istore          4
        //    42: istore_2        /* a */
        //    43: ldc             0.5
        //    45: ldc             0.5
        //    47: ldc             0.5
        //    49: ldc             0.25
        //    51: invokestatic    org/lwjgl/opengl/GL11.glColor4f:(FFFF)V
        //    54: bipush          7
        //    56: invokestatic    org/lwjgl/opengl/GL11.glBegin:(I)V
        //    59: ldc2_w          2.0
        //    62: ldc2_w          2.0
        //    65: invokestatic    org/lwjgl/opengl/GL11.glVertex2d:(DD)V
        //    68: iload           a
        //    70: iconst_2       
        //    71: iadd           
        //    72: i2d            
        //    73: ldc2_w          2.0
        //    76: invokestatic    org/lwjgl/opengl/GL11.glVertex2d:(DD)V
        //    79: iload           a
        //    81: iconst_2       
        //    82: iadd           
        //    83: i2d            
        //    84: iload           a
        //    86: iconst_2       
        //    87: iadd           
        //    88: i2d            
        //    89: invokestatic    org/lwjgl/opengl/GL11.glVertex2d:(DD)V
        //    92: ldc2_w          2.0
        //    95: iload           a
        //    97: iconst_2       
        //    98: iadd           
        //    99: i2d            
        //   100: invokestatic    org/lwjgl/opengl/GL11.glVertex2d:(DD)V
        //   103: invokestatic    org/lwjgl/opengl/GL11.glEnd:()V
        //   106: invokestatic    com/sun/jna/z/a/f/a/a/a/f/a.b:()Ljava/awt/Point;
        //   109: astore          a
        //   111: aload_1         /* a */
        //   112: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.k:()Lcom/sun/jna/z/a/f/a/a/a/a/l;
        //   117: astore          a
        //   119: aload           a
        //   121: ifnull          174
        //   124: aload           a
        //   126: aload           a
        //   128: invokevirtual   java/awt/geom/Point2D.getX:()D
        //   131: aload           a
        //   133: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.d:()I
        //   138: i2d            
        //   139: dsub           
        //   140: aload           a
        //   142: invokevirtual   java/awt/geom/Point2D.getY:()D
        //   145: aload           a
        //   147: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.e:()I
        //   152: i2d            
        //   153: dsub           
        //   154: invokevirtual   java/awt/geom/Point2D.setLocation:(DD)V
        //   157: aload           a
        //   159: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.k:()Lcom/sun/jna/z/a/f/a/a/a/a/l;
        //   164: astore          a
        //   166: iload_2         /* a */
        //   167: ifne            257
        //   170: iload_2         /* a */
        //   171: ifeq            119
        //   174: aload_3         /* a */
        //   175: aload           a
        //   177: invokevirtual   java/awt/Rectangle.contains:(Ljava/awt/geom/Point2D;)Z
        //   180: iload_2         /* a */
        //   181: ifne            254
        //   184: ifeq            251
        //   187: fconst_0       
        //   188: fconst_0       
        //   189: fconst_0       
        //   190: iconst_0       
        //   191: invokestatic    org/lwjgl/input/Mouse.isButtonDown:(I)Z
        //   194: ifeq            202
        //   197: ldc             0.5
        //   199: goto            204
        //   202: ldc             0.3
        //   204: invokestatic    org/lwjgl/opengl/GL11.glColor4f:(FFFF)V
        //   207: bipush          7
        //   209: invokestatic    org/lwjgl/opengl/GL11.glBegin:(I)V
        //   212: dconst_0       
        //   213: dconst_0       
        //   214: invokestatic    org/lwjgl/opengl/GL11.glVertex2d:(DD)V
        //   217: aload_3         /* a */
        //   218: getfield        java/awt/Rectangle.width:I
        //   221: i2d            
        //   222: dconst_0       
        //   223: invokestatic    org/lwjgl/opengl/GL11.glVertex2d:(DD)V
        //   226: aload_3         /* a */
        //   227: getfield        java/awt/Rectangle.width:I
        //   230: i2d            
        //   231: aload_3         /* a */
        //   232: getfield        java/awt/Rectangle.height:I
        //   235: i2d            
        //   236: invokestatic    org/lwjgl/opengl/GL11.glVertex2d:(DD)V
        //   239: dconst_0       
        //   240: aload_3         /* a */
        //   241: getfield        java/awt/Rectangle.height:I
        //   244: i2d            
        //   245: invokestatic    org/lwjgl/opengl/GL11.glVertex2d:(DD)V
        //   248: invokestatic    org/lwjgl/opengl/GL11.glEnd:()V
        //   251: sipush          3553
        //   254: invokestatic    org/lwjgl/opengl/GL11.glEnable:(I)V
        //   257: aload_1         /* a */
        //   258: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.b:()Ljava/lang/String;
        //   263: astore          a
        //   265: aload_0         /* a */
        //   266: getfield        com/sun/jna/z/a/f/a/a/a/e/a/b.e:Lcom/sun/jna/z/a/f/a/a/a/e/a/i;
        //   269: invokevirtual   com/sun/jna/z/a/f/a/a/a/e/a/i.d:()Lnet/minecraft/client/gui/FontRenderer;
        //   272: aload           a
        //   274: iload           a
        //   276: iconst_4       
        //   277: iadd           
        //   278: aload_3         /* a */
        //   279: getfield        java/awt/Rectangle.height:I
        //   282: iconst_2       
        //   283: idiv           
        //   284: aload_0         /* a */
        //   285: getfield        com/sun/jna/z/a/f/a/a/a/e/a/b.e:Lcom/sun/jna/z/a/f/a/a/a/e/a/i;
        //   288: invokevirtual   com/sun/jna/z/a/f/a/a/a/e/a/i.b:()Lnet/minecraft/client/gui/FontRenderer;
        //   291: getfield        net/minecraft/client/gui/FontRenderer.field_78288_b:I
        //   294: iconst_2       
        //   295: idiv           
        //   296: isub           
        //   297: iconst_2       
        //   298: iadd           
        //   299: aload_1         /* a */
        //   300: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.m:()Ljava/awt/Color;
        //   305: invokestatic    com/sun/jna/z/a/f/a/a/a/f/a.b:(Ljava/awt/Color;)I
        //   308: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78276_b:(Ljava/lang/String;III)I
        //   311: pop            
        //   312: sipush          2884
        //   315: invokestatic    org/lwjgl/opengl/GL11.glEnable:(I)V
        //   318: sipush          3042
        //   321: invokestatic    org/lwjgl/opengl/GL11.glDisable:(I)V
        //   324: iload_2         /* a */
        //   325: ifne            364
        //   328: aload_1         /* a */
        //   329: invokeinterface com/sun/jna/z/a/f/a/a/a/a/i.a:()Z
        //   334: ifeq            358
        //   337: getstatic       com/sun/jna/z/a/i.d:Lcom/sun/jna/z/a/i;
        //   340: getfield        com/sun/jna/z/a/i.b:Lcom/sun/jna/z/a/g/f;
        //   343: getstatic       com/sun/jna/z/a/f/a/a/a/h.e:Ljava/awt/Color;
        //   346: ldc             10.0
        //   348: ldc             4.0
        //   350: getstatic       com/sun/jna/z/a/f/a/a/a/e/a/b.f:Ljava/lang/String;
        //   353: ldc             0.25
        //   355: invokevirtual   com/sun/jna/z/a/g/f.a:(Ljava/awt/Color;FFLjava/lang/String;F)V
        //   358: aload_0         /* a */
        //   359: aload_1         /* a */
        //   360: iconst_1       
        //   361: invokevirtual   com/sun/jna/z/a/f/a/a/a/e/a/b.a:(Lcom/sun/jna/z/a/f/a/a/a/a/k;Z)V
        //   364: return         
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
    
    protected Dimension b(final i a) {
        return new Dimension(this.e.d().func_78256_a(a.b()) + this.e.d().field_78288_b + 6, this.e.d().field_78288_b + 4);
    }
    
    protected Rectangle[] c(final i a) {
        return new Rectangle[] { new Rectangle(0, 0, a.f(), a.g()) };
    }
    
    protected void a(final i a, final Point a, final int a) {
        final int a2 = com.sun.jna.z.a.f.a.a.a.e.a.i.f;
        final int x = a.x;
        final int f = a.f();
        if (a2 == 0) {
            if (x > f) {
                return;
            }
            final int y = a.y;
            a.g();
        }
        if (x <= f) {
            a.a(a);
        }
    }
    
    static {
        final char[] charArray = "L\u00cd\u00e4¹\u00f5".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0125: {
                if (n > 1) {
                    break Label_0125;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c2 = '/';
                            break;
                        }
                        case 1: {
                            c2 = '¥';
                            break;
                        }
                        case 2: {
                            c2 = '\u0081';
                            break;
                        }
                        case 3: {
                            c2 = '\u00da';
                            break;
                        }
                        case 4: {
                            c2 = '\u009e';
                            break;
                        }
                        case 5: {
                            c2 = '\u00e4';
                            break;
                        }
                        default: {
                            c2 = 'j';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                f = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
