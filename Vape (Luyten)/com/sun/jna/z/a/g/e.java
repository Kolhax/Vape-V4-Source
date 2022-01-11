package com.sun.jna.z.a.g;

import java.util.*;
import java.awt.image.*;
import java.util.function.*;
import org.lwjgl.opengl.*;
import com.sun.jna.z.a.f.a.a.a.f.*;
import java.nio.*;
import java.awt.*;
import java.awt.geom.*;

public class e
{
    private final Map<Integer, String> a;
    private Font b;
    private FontMetrics c;
    private BufferedImage d;
    private int e;
    
    public float a() {
        return (float)this.a.values().stream().mapToDouble(this::d).max().getAsDouble();
    }
    
    public float b() {
        return this.a.keySet().size() * this.c();
    }
    
    public float a(final char a) {
        final String a2 = this.a.values().stream().filter(com.sun.jna.z.a.g.e::a).findFirst().orElse("" + a);
        return (float)this.c.getStringBounds(a2.substring(0, a2.indexOf(a)), null).getWidth();
    }
    
    public float b(final char a) {
        final float a2 = this.a.keySet().stream().filter(this::a).findFirst().orElse(0);
        return this.c() * a2;
    }
    
    public float c(final char a) {
        return this.c.charWidth(a);
    }
    
    public float c() {
        return this.c.getMaxAscent() + this.c.getMaxDescent();
    }
    
    public e(final String a, final float a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0         /* a */
        //     5: new             Lcom/sun/jna/z/a/g/q;
        //     8: dup            
        //     9: aload_0         /* a */
        //    10: invokespecial   com/sun/jna/z/a/g/q.<init>:(Lcom/sun/jna/z/a/g/e;)V
        //    13: putfield        com/sun/jna/z/a/g/e.a:Ljava/util/Map;
        //    16: aload_0         /* a */
        //    17: new             Ljava/awt/Font;
        //    20: dup            
        //    21: aload_1         /* a */
        //    22: iconst_0       
        //    23: fload_2         /* a */
        //    24: f2i            
        //    25: invokespecial   java/awt/Font.<init>:(Ljava/lang/String;II)V
        //    28: putfield        com/sun/jna/z/a/g/e.b:Ljava/awt/Font;
        //    31: getstatic       com/sun/jna/z/a/g/g.b:I
        //    34: invokestatic    java/awt/GraphicsEnvironment.getLocalGraphicsEnvironment:()Ljava/awt/GraphicsEnvironment;
        //    37: invokevirtual   java/awt/GraphicsEnvironment.getDefaultScreenDevice:()Ljava/awt/GraphicsDevice;
        //    40: invokevirtual   java/awt/GraphicsDevice.getDefaultConfiguration:()Ljava/awt/GraphicsConfiguration;
        //    43: astore          4
        //    45: istore_3        /* a */
        //    46: aload           a
        //    48: iconst_1       
        //    49: iconst_1       
        //    50: iconst_3       
        //    51: invokevirtual   java/awt/GraphicsConfiguration.createCompatibleImage:(III)Ljava/awt/image/BufferedImage;
        //    54: invokevirtual   java/awt/image/BufferedImage.createGraphics:()Ljava/awt/Graphics2D;
        //    57: astore          a
        //    59: aload           a
        //    61: aload_0         /* a */
        //    62: getfield        com/sun/jna/z/a/g/e.b:Ljava/awt/Font;
        //    65: invokevirtual   java/awt/Graphics2D.setFont:(Ljava/awt/Font;)V
        //    68: aload_0         /* a */
        //    69: aload           a
        //    71: invokevirtual   java/awt/Graphics2D.getFontMetrics:()Ljava/awt/FontMetrics;
        //    74: putfield        com/sun/jna/z/a/g/e.c:Ljava/awt/FontMetrics;
        //    77: aload_0         /* a */
        //    78: aload           a
        //    80: invokevirtual   java/awt/Graphics2D.getDeviceConfiguration:()Ljava/awt/GraphicsConfiguration;
        //    83: aload_0         /* a */
        //    84: invokevirtual   com/sun/jna/z/a/g/e.a:()F
        //    87: f2i            
        //    88: aload_0         /* a */
        //    89: invokevirtual   com/sun/jna/z/a/g/e.b:()F
        //    92: f2i            
        //    93: iconst_3       
        //    94: invokevirtual   java/awt/GraphicsConfiguration.createCompatibleImage:(III)Ljava/awt/image/BufferedImage;
        //    97: putfield        com/sun/jna/z/a/g/e.d:Ljava/awt/image/BufferedImage;
        //   100: aload_0         /* a */
        //   101: invokestatic    org/lwjgl/opengl/GL11.glGenTextures:()I
        //   104: putfield        com/sun/jna/z/a/g/e.e:I
        //   107: sipush          3553
        //   110: invokestatic    org/lwjgl/opengl/GL11.glEnable:(I)V
        //   113: sipush          3553
        //   116: aload_0         /* a */
        //   117: getfield        com/sun/jna/z/a/g/e.e:I
        //   120: invokestatic    org/lwjgl/opengl/GL11.glBindTexture:(II)V
        //   123: sipush          3553
        //   126: iconst_0       
        //   127: sipush          6408
        //   130: aload_0         /* a */
        //   131: invokevirtual   com/sun/jna/z/a/g/e.a:()F
        //   134: f2i            
        //   135: aload_0         /* a */
        //   136: invokevirtual   com/sun/jna/z/a/g/e.b:()F
        //   139: f2i            
        //   140: iconst_0       
        //   141: sipush          6408
        //   144: sipush          5121
        //   147: aload_0         /* a */
        //   148: invokevirtual   com/sun/jna/z/a/g/e.d:()Ljava/nio/ByteBuffer;
        //   151: invokestatic    org/lwjgl/opengl/GL11.glTexImage2D:(IIIIIIIILjava/nio/ByteBuffer;)V
        //   154: sipush          3553
        //   157: sipush          10241
        //   160: sipush          9729
        //   163: invokestatic    org/lwjgl/opengl/GL11.glTexParameteri:(III)V
        //   166: sipush          3553
        //   169: sipush          10240
        //   172: sipush          9729
        //   175: invokestatic    org/lwjgl/opengl/GL11.glTexParameteri:(III)V
        //   178: getstatic       com/sun/jna/z/a/j.g:Z
        //   181: ifeq            191
        //   184: iinc            a, 1
        //   187: iload_3         /* a */
        //   188: putstatic       com/sun/jna/z/a/g/g.b:I
        //   191: return         
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    public void a(final String a, final float a, final float a, final int a) {
        GL11.glBindTexture(3553, this.e);
        GL11.glBegin(7);
        final Color a2 = a.a(a);
        GL11.glColor4f(a2.getRed() / 255.0f, a2.getGreen() / 255.0f, a2.getBlue() / 255.0f, a2.getAlpha() / 255.0f);
        final int b = g.b;
        float a3 = a;
        final char[] a4 = a.toCharArray();
        final int a5 = a4.length;
        int a6 = 0;
        final int a7 = b;
        while (a6 < a5) {
            final char a8 = a4[a6];
            final float a9 = this.c(a8);
            final float a10 = this.c();
            final float a11 = 1.0f / this.a() * a9;
            final float a12 = 1.0f / this.b() * a10;
            final float a13 = 1.0f / this.a() * this.a(a8);
            final float a14 = 1.0f / this.b() * this.b(a8);
            GL11.glTexCoord2f(a13, a14);
            GL11.glVertex3f(a3, a, 0.0f);
            GL11.glTexCoord2f(a13 + a11, a14);
            GL11.glVertex3f(a3 + a9, a, 0.0f);
            GL11.glTexCoord2f(a13 + a11, a14 + a12);
            GL11.glVertex3f(a3 + a9, a + a10, 0.0f);
            GL11.glTexCoord2f(a13, a14 + a12);
            GL11.glVertex3f(a3, a + a10, 0.0f);
            a3 += a9;
            ++a6;
            if (a7 != 0) {
                return;
            }
            if (a7 != 0) {
                break;
            }
        }
        GL11.glEnd();
    }
    
    public ByteBuffer d() {
        final int b = g.b;
        final Graphics2D a = (Graphics2D)this.d.getGraphics();
        a.setFont(this.b);
        final int a2 = b;
        a.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        a.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        a.setColor(Color.WHITE);
        this.a.keySet().stream().forEach(this::a);
        final int[] a3 = new int[this.d.getWidth() * this.d.getHeight()];
        this.d.getRGB(0, 0, this.d.getWidth(), this.d.getHeight(), a3, 0, this.d.getWidth());
        final ByteBuffer a4 = ByteBuffer.allocateDirect(this.d.getWidth() * this.d.getHeight() * 4);
        int a5 = 0;
    Label_0273_Outer:
        while (a5 < this.d.getHeight()) {
            if (a2 == 0) {
                int a6 = 0;
                while (true) {
                    while (a6 < this.d.getWidth()) {
                        final int a7 = a3[a5 * this.d.getWidth() + a6];
                        a4.put((byte)(a7 >> 16 & 0xFF));
                        a4.put((byte)(a7 >> 8 & 0xFF));
                        a4.put((byte)(a7 & 0xFF));
                        a4.put((byte)(a7 >> 24 & 0xFF));
                        ++a6;
                        if (a2 == 0) {
                            if (a2 != 0) {
                                break;
                            }
                            continue Label_0273_Outer;
                        }
                        else {
                            if (a2 != 0) {
                                break Label_0273_Outer;
                            }
                            continue Label_0273_Outer;
                        }
                    }
                    ++a5;
                    continue;
                }
            }
            return a4;
        }
        a4.flip();
        return a4;
    }
    
    public float a(final String a) {
        final int b = g.b;
        float a2 = 0.0f;
        final char[] a3 = a.toCharArray();
        final int a4 = a3.length;
        final int a5 = b;
        int a6 = 0;
        float n = 0.0f;
        while (a6 < a4) {
            final char a7 = a3[a6];
            n = a2 + this.c(a7);
            if (a5 != 0) {
                return n;
            }
            a2 = n;
            ++a6;
            if (a5 != 0) {
                break;
            }
        }
        return n;
    }
    
    public float b(final String a) {
        return (float)this.c(a).getHeight() / 2.0f;
    }
    
    private Rectangle2D c(final String a) {
        return this.c.getStringBounds(a, this.d.getGraphics());
    }
    
    private void a(final Graphics2D a, final Integer a) {
        a.drawString(this.a.get(a), 0.0f, this.c.getMaxAscent() + this.c() * a);
    }
    
    private boolean a(final char a, final Integer a) {
        return this.a.get(a).contains("" + a);
    }
    
    private static boolean a(final char a, final String a) {
        return a.contains("" + a);
    }
    
    private double d(final String a) {
        return this.c.getStringBounds(a, null).getWidth();
    }
}
