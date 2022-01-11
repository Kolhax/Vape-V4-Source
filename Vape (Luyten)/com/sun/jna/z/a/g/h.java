package com.sun.jna.z.a.g;

import java.awt.image.*;
import net.minecraft.client.renderer.texture.*;
import java.util.regex.*;
import net.minecraft.util.*;
import java.awt.geom.*;
import net.minecraft.client.renderer.*;
import java.util.*;
import java.awt.*;

public class h
{
    private BufferedImage a;
    private DynamicTexture b;
    private final int c;
    private float d;
    private final float e;
    private final Pattern f;
    private final Pattern g;
    private ResourceLocation h;
    private final int i;
    private Font j;
    private Graphics2D k;
    private FontMetrics l;
    private final float[] m;
    private final float[] n;
    public int o;
    private static final String[] p;
    
    public h(final Object a, final float a) {
        this(a, a, 0.0f);
    }
    
    public h(final Object a, final float a, final float a) {
        this.d = 0.0f;
        final String[] a2 = com.sun.jna.z.a.g.h.p;
        this.f = Pattern.compile(a2[4]);
        this.g = Pattern.compile(a2[2]);
        this.e = a;
        this.i = 32;
        this.c = 255;
        this.d = a;
        this.m = new float[this.c - this.i];
        this.n = new float[this.c - this.i];
        this.c();
        this.a(a, a);
    }
    
    private void a(final Object a, final float a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3        /* a */
        //     4: aload_1         /* a */
        //     5: instanceof      Ljava/awt/Font;
        //     8: iload_3         /* a */
        //     9: ifne            43
        //    12: ifeq            35
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0         /* a */
        //    20: aload_1         /* a */
        //    21: checkcast       Ljava/awt/Font;
        //    24: putfield        com/sun/jna/z/a/g/h.j:Ljava/awt/Font;
        //    27: iload_3         /* a */
        //    28: ifeq            189
        //    31: goto            35
        //    34: athrow         
        //    35: aload_1         /* a */
        //    36: instanceof      Ljava/io/File;
        //    39: goto            43
        //    42: athrow         
        //    43: iload_3         /* a */
        //    44: ifne            86
        //    47: ifeq            78
        //    50: goto            54
        //    53: athrow         
        //    54: aload_0         /* a */
        //    55: iconst_0       
        //    56: aload_1         /* a */
        //    57: checkcast       Ljava/io/File;
        //    60: invokestatic    java/awt/Font.createFont:(ILjava/io/File;)Ljava/awt/Font;
        //    63: fload_2         /* a */
        //    64: invokevirtual   java/awt/Font.deriveFont:(F)Ljava/awt/Font;
        //    67: putfield        com/sun/jna/z/a/g/h.j:Ljava/awt/Font;
        //    70: iload_3         /* a */
        //    71: ifeq            189
        //    74: goto            78
        //    77: athrow         
        //    78: aload_1         /* a */
        //    79: instanceof      Ljava/io/InputStream;
        //    82: goto            86
        //    85: athrow         
        //    86: iload_3         /* a */
        //    87: ifne            129
        //    90: ifeq            121
        //    93: goto            97
        //    96: athrow         
        //    97: aload_0         /* a */
        //    98: iconst_0       
        //    99: aload_1         /* a */
        //   100: checkcast       Ljava/io/InputStream;
        //   103: invokestatic    java/awt/Font.createFont:(ILjava/io/InputStream;)Ljava/awt/Font;
        //   106: fload_2         /* a */
        //   107: invokevirtual   java/awt/Font.deriveFont:(F)Ljava/awt/Font;
        //   110: putfield        com/sun/jna/z/a/g/h.j:Ljava/awt/Font;
        //   113: iload_3         /* a */
        //   114: ifeq            189
        //   117: goto            121
        //   120: athrow         
        //   121: aload_1         /* a */
        //   122: instanceof      Ljava/lang/String;
        //   125: goto            129
        //   128: athrow         
        //   129: ifeq            160
        //   132: aload_0         /* a */
        //   133: new             Ljava/awt/Font;
        //   136: dup            
        //   137: aload_1         /* a */
        //   138: checkcast       Ljava/lang/String;
        //   141: iconst_0       
        //   142: fload_2         /* a */
        //   143: invokestatic    java/lang/Math.round:(F)I
        //   146: invokespecial   java/awt/Font.<init>:(Ljava/lang/String;II)V
        //   149: putfield        com/sun/jna/z/a/g/h.j:Ljava/awt/Font;
        //   152: iload_3         /* a */
        //   153: ifeq            189
        //   156: goto            160
        //   159: athrow         
        //   160: aload_0         /* a */
        //   161: new             Ljava/awt/Font;
        //   164: dup            
        //   165: getstatic       com/sun/jna/z/a/g/h.p:[Ljava/lang/String;
        //   168: astore          a
        //   170: aload           a
        //   172: iconst_0       
        //   173: aaload         
        //   174: iconst_0       
        //   175: fload_2         /* a */
        //   176: invokestatic    java/lang/Math.round:(F)I
        //   179: invokespecial   java/awt/Font.<init>:(Ljava/lang/String;II)V
        //   182: putfield        com/sun/jna/z/a/g/h.j:Ljava/awt/Font;
        //   185: goto            189
        //   188: athrow         
        //   189: aload_0         /* a */
        //   190: getfield        com/sun/jna/z/a/g/h.k:Ljava/awt/Graphics2D;
        //   193: aload_0         /* a */
        //   194: getfield        com/sun/jna/z/a/g/h.j:Ljava/awt/Font;
        //   197: invokevirtual   java/awt/Graphics2D.setFont:(Ljava/awt/Font;)V
        //   200: goto            235
        //   203: astore          a
        //   205: aload           a
        //   207: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   210: aload_0         /* a */
        //   211: new             Ljava/awt/Font;
        //   214: dup            
        //   215: getstatic       com/sun/jna/z/a/g/h.p:[Ljava/lang/String;
        //   218: astore          a
        //   220: aload           a
        //   222: iconst_0       
        //   223: aaload         
        //   224: iconst_0       
        //   225: fload_2         /* a */
        //   226: invokestatic    java/lang/Math.round:(F)I
        //   229: invokespecial   java/awt/Font.<init>:(Ljava/lang/String;II)V
        //   232: putfield        com/sun/jna/z/a/g/h.j:Ljava/awt/Font;
        //   235: aload_0         /* a */
        //   236: getfield        com/sun/jna/z/a/g/h.k:Ljava/awt/Graphics2D;
        //   239: aload_0         /* a */
        //   240: getfield        com/sun/jna/z/a/g/h.j:Ljava/awt/Font;
        //   243: invokevirtual   java/awt/Graphics2D.setFont:(Ljava/awt/Font;)V
        //   246: aload_0         /* a */
        //   247: getfield        com/sun/jna/z/a/g/h.k:Ljava/awt/Graphics2D;
        //   250: new             Ljava/awt/Color;
        //   253: dup            
        //   254: sipush          255
        //   257: sipush          255
        //   260: sipush          255
        //   263: iconst_0       
        //   264: invokespecial   java/awt/Color.<init>:(IIII)V
        //   267: invokevirtual   java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        //   270: aload_0         /* a */
        //   271: getfield        com/sun/jna/z/a/g/h.k:Ljava/awt/Graphics2D;
        //   274: iconst_0       
        //   275: iconst_0       
        //   276: sipush          256
        //   279: sipush          256
        //   282: invokevirtual   java/awt/Graphics2D.fillRect:(IIII)V
        //   285: aload_0         /* a */
        //   286: getfield        com/sun/jna/z/a/g/h.k:Ljava/awt/Graphics2D;
        //   289: getstatic       java/awt/Color.white:Ljava/awt/Color;
        //   292: invokevirtual   java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        //   295: aload_0         /* a */
        //   296: aload_0         /* a */
        //   297: getfield        com/sun/jna/z/a/g/h.k:Ljava/awt/Graphics2D;
        //   300: invokevirtual   java/awt/Graphics2D.getFontMetrics:()Ljava/awt/FontMetrics;
        //   303: putfield        com/sun/jna/z/a/g/h.l:Ljava/awt/FontMetrics;
        //   306: ldc             5.0
        //   308: fstore          a
        //   310: ldc             5.0
        //   312: fstore          a
        //   314: aload_0         /* a */
        //   315: getfield        com/sun/jna/z/a/g/h.i:I
        //   318: istore          a
        //   320: iload           a
        //   322: aload_0         /* a */
        //   323: getfield        com/sun/jna/z/a/g/h.c:I
        //   326: if_icmpge       486
        //   329: aload_0         /* a */
        //   330: getfield        com/sun/jna/z/a/g/h.k:Ljava/awt/Graphics2D;
        //   333: iload           a
        //   335: i2c            
        //   336: invokestatic    java/lang/Character.toString:(C)Ljava/lang/String;
        //   339: fload           a
        //   341: fload           a
        //   343: aload_0         /* a */
        //   344: getfield        com/sun/jna/z/a/g/h.l:Ljava/awt/FontMetrics;
        //   347: invokevirtual   java/awt/FontMetrics.getAscent:()I
        //   350: i2f            
        //   351: fadd           
        //   352: invokevirtual   java/awt/Graphics2D.drawString:(Ljava/lang/String;FF)V
        //   355: aload_0         /* a */
        //   356: getfield        com/sun/jna/z/a/g/h.m:[F
        //   359: iload           a
        //   361: aload_0         /* a */
        //   362: getfield        com/sun/jna/z/a/g/h.i:I
        //   365: isub           
        //   366: fload           a
        //   368: fastore        
        //   369: aload_0         /* a */
        //   370: getfield        com/sun/jna/z/a/g/h.n:[F
        //   373: iload           a
        //   375: aload_0         /* a */
        //   376: getfield        com/sun/jna/z/a/g/h.i:I
        //   379: isub           
        //   380: fload           a
        //   382: aload_0         /* a */
        //   383: getfield        com/sun/jna/z/a/g/h.l:Ljava/awt/FontMetrics;
        //   386: invokevirtual   java/awt/FontMetrics.getMaxDescent:()I
        //   389: i2f            
        //   390: fsub           
        //   391: fastore        
        //   392: fload           a
        //   394: aload_0         /* a */
        //   395: getfield        com/sun/jna/z/a/g/h.l:Ljava/awt/FontMetrics;
        //   398: iload           a
        //   400: i2c            
        //   401: invokestatic    java/lang/Character.toString:(C)Ljava/lang/String;
        //   404: invokevirtual   java/awt/FontMetrics.stringWidth:(Ljava/lang/String;)I
        //   407: i2f            
        //   408: fconst_2       
        //   409: fadd           
        //   410: fadd           
        //   411: fstore          a
        //   413: iload_3         /* a */
        //   414: ifne            555
        //   417: iload_3         /* a */
        //   418: ifne            482
        //   421: goto            425
        //   424: athrow         
        //   425: fload           a
        //   427: sipush          250
        //   430: aload_0         /* a */
        //   431: getfield        com/sun/jna/z/a/g/h.l:Ljava/awt/FontMetrics;
        //   434: invokevirtual   java/awt/FontMetrics.getMaxAdvance:()I
        //   437: isub           
        //   438: i2f            
        //   439: fcmpl          
        //   440: iflt            479
        //   443: goto            447
        //   446: athrow         
        //   447: ldc             5.0
        //   449: fstore          a
        //   451: fload           a
        //   453: aload_0         /* a */
        //   454: getfield        com/sun/jna/z/a/g/h.l:Ljava/awt/FontMetrics;
        //   457: invokevirtual   java/awt/FontMetrics.getMaxAscent:()I
        //   460: aload_0         /* a */
        //   461: getfield        com/sun/jna/z/a/g/h.l:Ljava/awt/FontMetrics;
        //   464: invokevirtual   java/awt/FontMetrics.getMaxDescent:()I
        //   467: iadd           
        //   468: i2f            
        //   469: aload_0         /* a */
        //   470: getfield        com/sun/jna/z/a/g/h.e:F
        //   473: fconst_2       
        //   474: fdiv           
        //   475: fadd           
        //   476: fadd           
        //   477: fstore          a
        //   479: iinc            a, 1
        //   482: iload_3         /* a */
        //   483: ifeq            320
        //   486: aload_0         /* a */
        //   487: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   490: invokevirtual   net/minecraft/client/Minecraft.func_110434_K:()Lnet/minecraft/client/renderer/texture/TextureManager;
        //   493: new             Ljava/lang/StringBuilder;
        //   496: dup            
        //   497: invokespecial   java/lang/StringBuilder.<init>:()V
        //   500: getstatic       com/sun/jna/z/a/g/h.p:[Ljava/lang/String;
        //   503: iconst_1       
        //   504: aaload         
        //   505: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   508: aload_1         /* a */
        //   509: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   512: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   515: fload_2         /* a */
        //   516: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //   519: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   522: aload_0         /* a */
        //   523: new             Lnet/minecraft/client/renderer/texture/DynamicTexture;
        //   526: dup            
        //   527: aload_0         /* a */
        //   528: getfield        com/sun/jna/z/a/g/h.a:Ljava/awt/image/BufferedImage;
        //   531: invokespecial   net/minecraft/client/renderer/texture/DynamicTexture.<init>:(Ljava/awt/image/BufferedImage;)V
        //   534: dup_x1         
        //   535: putfield        com/sun/jna/z/a/g/h.b:Lnet/minecraft/client/renderer/texture/DynamicTexture;
        //   538: invokevirtual   net/minecraft/client/renderer/texture/TextureManager.func_110578_a:(Ljava/lang/String;Lnet/minecraft/client/renderer/texture/DynamicTexture;)Lnet/minecraft/util/ResourceLocation;
        //   541: putfield        com/sun/jna/z/a/g/h.h:Lnet/minecraft/util/ResourceLocation;
        //   544: aload_0         /* a */
        //   545: aload_0         /* a */
        //   546: ldc             "I"
        //   548: invokevirtual   com/sun/jna/z/a/g/h.c:(Ljava/lang/String;)F
        //   551: f2i            
        //   552: putfield        com/sun/jna/z/a/g/h.o:I
        //   555: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  132    185    188    189    Ljava/lang/Exception;
        //  129    156    159    160    Ljava/lang/Exception;
        //  97     125    128    129    Ljava/lang/Exception;
        //  90     117    120    121    Ljava/lang/Exception;
        //  86     93     96     97     Ljava/lang/Exception;
        //  54     82     85     86     Ljava/lang/Exception;
        //  47     74     77     78     Ljava/lang/Exception;
        //  43     50     53     54     Ljava/lang/Exception;
        //  19     39     42     43     Ljava/lang/Exception;
        //  12     31     34     35     Ljava/lang/Exception;
        //  4      15     18     19     Ljava/lang/Exception;
        //  4      200    203    235    Ljava/lang/Exception;
        //  413    421    424    425    Ljava/lang/Exception;
        //  417    443    446    447    Ljava/lang/Exception;
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
    
    private void a(final char a, final float a, final float a) {
        final Rectangle2D a2 = this.l.getStringBounds(Character.toString(a), this.k);
        this.a(a, a, this.m[a - this.i], this.n[a - this.i], (float)a2.getWidth(), (float)a2.getHeight() + this.l.getMaxDescent() + 1.0f);
    }
    
    private void a(final String a, final float a, final float a, final int a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: fconst_2       
        //     2: fmul           
        //     3: fstore_2        /* a */
        //     4: fload_3         /* a */
        //     5: fconst_2       
        //     6: fmul           
        //     7: fstore_3        /* a */
        //     8: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179098_w:()V
        //    11: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    14: invokevirtual   net/minecraft/client/Minecraft.func_110434_K:()Lnet/minecraft/client/renderer/texture/TextureManager;
        //    17: aload_0         /* a */
        //    18: getfield        com/sun/jna/z/a/g/h.h:Lnet/minecraft/util/ResourceLocation;
        //    21: invokevirtual   net/minecraft/client/renderer/texture/TextureManager.func_110577_a:(Lnet/minecraft/util/ResourceLocation;)V
        //    24: iload           a
        //    26: bipush          24
        //    28: ishr           
        //    29: sipush          255
        //    32: iand           
        //    33: i2f            
        //    34: ldc             255.0
        //    36: fdiv           
        //    37: fstore          a
        //    39: iload           a
        //    41: bipush          16
        //    43: ishr           
        //    44: sipush          255
        //    47: iand           
        //    48: i2f            
        //    49: ldc             255.0
        //    51: fdiv           
        //    52: fstore          a
        //    54: getstatic       com/sun/jna/z/a/g/g.b:I
        //    57: iload           a
        //    59: bipush          8
        //    61: ishr           
        //    62: sipush          255
        //    65: iand           
        //    66: i2f            
        //    67: ldc             255.0
        //    69: fdiv           
        //    70: fstore          a
        //    72: iload           a
        //    74: sipush          255
        //    77: iand           
        //    78: i2f            
        //    79: ldc             255.0
        //    81: fdiv           
        //    82: fstore          a
        //    84: fload           a
        //    86: fload           a
        //    88: fload           a
        //    90: fload           a
        //    92: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //    95: fload_2         /* a */
        //    96: fstore          10
        //    98: istore          a
        //   100: iconst_0       
        //   101: istore          a
        //   103: iload           a
        //   105: aload_1         /* a */
        //   106: invokevirtual   java/lang/String.length:()I
        //   109: if_icmpge       418
        //   112: iload           a
        //   114: ifne            425
        //   117: aload_1         /* a */
        //   118: iload           a
        //   120: invokevirtual   java/lang/String.charAt:(I)C
        //   123: iload           a
        //   125: ifne            369
        //   128: goto            132
        //   131: athrow         
        //   132: sipush          167
        //   135: if_icmpne       359
        //   138: goto            142
        //   141: athrow         
        //   142: iload           a
        //   144: iconst_1       
        //   145: iadd           
        //   146: iload           a
        //   148: ifne            369
        //   151: goto            155
        //   154: athrow         
        //   155: aload_1         /* a */
        //   156: invokevirtual   java/lang/String.length:()I
        //   159: if_icmpge       359
        //   162: goto            166
        //   165: athrow         
        //   166: aload_1         /* a */
        //   167: iload           a
        //   169: iconst_1       
        //   170: iadd           
        //   171: invokevirtual   java/lang/String.charAt:(I)C
        //   174: invokestatic    java/lang/Character.toLowerCase:(C)C
        //   177: istore          a
        //   179: iload           a
        //   181: iload           a
        //   183: ifne            222
        //   186: bipush          110
        //   188: if_icmpne       211
        //   191: goto            195
        //   194: athrow         
        //   195: fload_3         /* a */
        //   196: aload_0         /* a */
        //   197: getfield        com/sun/jna/z/a/g/h.l:Ljava/awt/FontMetrics;
        //   200: invokevirtual   java/awt/FontMetrics.getAscent:()I
        //   203: iconst_2       
        //   204: iadd           
        //   205: i2f            
        //   206: fadd           
        //   207: fstore_3        /* a */
        //   208: fload           a
        //   210: fstore_2        /* a */
        //   211: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //   214: getfield        net/minecraft/client/Minecraft.field_71466_p:Lnet/minecraft/client/gui/FontRenderer;
        //   217: iload           a
        //   219: invokevirtual   net/minecraft/client/gui/FontRenderer.func_175064_b:(C)I
        //   222: istore          a
        //   224: iload           a
        //   226: ldc             16777215
        //   228: iload           a
        //   230: ifne            294
        //   233: if_icmpeq       286
        //   236: goto            240
        //   239: athrow         
        //   240: iload           a
        //   242: bipush          16
        //   244: ishr           
        //   245: i2f            
        //   246: ldc             255.0
        //   248: fdiv           
        //   249: iload           a
        //   251: bipush          8
        //   253: ishr           
        //   254: sipush          255
        //   257: iand           
        //   258: i2f            
        //   259: ldc             255.0
        //   261: fdiv           
        //   262: iload           a
        //   264: sipush          255
        //   267: iand           
        //   268: i2f            
        //   269: ldc             255.0
        //   271: fdiv           
        //   272: fload           a
        //   274: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //   277: iload           a
        //   279: ifeq            351
        //   282: goto            286
        //   285: athrow         
        //   286: iload           a
        //   288: bipush          114
        //   290: goto            294
        //   293: athrow         
        //   294: iload           a
        //   296: ifne            334
        //   299: if_icmpne       326
        //   302: goto            306
        //   305: athrow         
        //   306: fload           a
        //   308: fload           a
        //   310: fload           a
        //   312: fload           a
        //   314: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //   317: iload           a
        //   319: ifeq            351
        //   322: goto            326
        //   325: athrow         
        //   326: iload           a
        //   328: bipush          103
        //   330: goto            334
        //   333: athrow         
        //   334: if_icmpne       351
        //   337: ldc             0.3
        //   339: ldc             0.7
        //   341: fconst_1       
        //   342: fload           a
        //   344: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //   347: goto            351
        //   350: athrow         
        //   351: iinc            a, 1
        //   354: iload           a
        //   356: ifeq            410
        //   359: aload_1         /* a */
        //   360: iload           a
        //   362: invokevirtual   java/lang/String.charAt:(I)C
        //   365: goto            369
        //   368: athrow         
        //   369: istore          a
        //   371: aload_0         /* a */
        //   372: iload           a
        //   374: fload_2         /* a */
        //   375: fload_3         /* a */
        //   376: invokespecial   com/sun/jna/z/a/g/h.a:(CFF)V
        //   379: goto            396
        //   382: astore          a
        //   384: bipush          63
        //   386: istore          a
        //   388: aload_0         /* a */
        //   389: iload           a
        //   391: fload_2         /* a */
        //   392: fload_3         /* a */
        //   393: invokespecial   com/sun/jna/z/a/g/h.a:(CFF)V
        //   396: fload_2         /* a */
        //   397: aload_0         /* a */
        //   398: iload           a
        //   400: invokestatic    java/lang/Character.toString:(C)Ljava/lang/String;
        //   403: invokevirtual   com/sun/jna/z/a/g/h.d:(Ljava/lang/String;)F
        //   406: fconst_2       
        //   407: fmul           
        //   408: fadd           
        //   409: fstore_2        /* a */
        //   410: iinc            a, 1
        //   413: iload           a
        //   415: ifeq            103
        //   418: fconst_1       
        //   419: fconst_1       
        //   420: fconst_1       
        //   421: fconst_1       
        //   422: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179131_c:(FFFF)V
        //   425: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  351    365    368    369    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  334    347    350    351    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  306    330    333    334    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  299    322    325    326    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  294    302    305    306    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  240    290    293    294    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  233    282    285    286    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  224    236    239    240    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  179    191    194    195    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  142    162    165    166    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  132    151    154    155    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  117    138    141    142    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  112    128    131    132    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  371    379    382    396    Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    public void a(final String a, final float a, final float a, final int a, final int a) {
        this.a(a, a, a, a.SHADOW_THICK, a, a);
    }
    
    public void b(final String a, final float a, final float a, final int a, final int a) {
        this.a(a, a + 0.5f, a + 0.5f, a.NORMAL, a, (a & 0xFCFCFC) >> 2 | (a & 0xFF000000));
        this.a(a, a, a, a.NORMAL, a, (a & 0xFCFCFC) >> 2 | (a & 0xFF000000));
    }
    
    public void b(final String a, final float a, final float a, final int a) {
        this.a(a, a + 0.5f, a + 0.5f, a.NORMAL, -16777216, -16777216);
        this.a(a, a, a, a.NORMAL, a, (a & 0xFCFCFC) >> 2 | (a & 0xFF000000));
    }
    
    public void c(final String a, final float a, final float a, final int a) {
        this.a(a, a, a, a.NORMAL, a, (a & 0xFCFCFC) >> 2 | (a & 0xFF000000));
    }
    
    public void a(final String a, final float a, final float a, final a a, final int a) {
        this.a(a, a, a, a, a, (a & 0xFCFCFC) >> 2 | (a & 0xFF000000));
    }
    
    public void a(final String a, final float a, final float a, final a a, final int a, final int a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1         /* a */
        //     2: invokevirtual   com/sun/jna/z/a/g/h.f:(Ljava/lang/String;)Ljava/lang/String;
        //     5: astore_1        /* a */
        //     6: getstatic       com/sun/jna/z/a/g/g.b:I
        //     9: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179094_E:()V
        //    12: istore          a
        //    14: sipush          3042
        //    17: invokestatic    org/lwjgl/opengl/GL11.glIsEnabled:(I)Z
        //    20: istore          a
        //    22: sipush          2896
        //    25: invokestatic    org/lwjgl/opengl/GL11.glIsEnabled:(I)Z
        //    28: istore          a
        //    30: sipush          3553
        //    33: invokestatic    org/lwjgl/opengl/GL11.glIsEnabled:(I)Z
        //    36: istore          a
        //    38: iload           a
        //    40: iload           a
        //    42: ifne            57
        //    45: ifne            55
        //    48: goto            52
        //    51: athrow         
        //    52: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179147_l:()V
        //    55: iload           a
        //    57: iload           a
        //    59: ifne            74
        //    62: ifeq            72
        //    65: goto            69
        //    68: athrow         
        //    69: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179140_f:()V
        //    72: iload           a
        //    74: ifeq            80
        //    77: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179090_x:()V
        //    80: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179147_l:()V
        //    83: ldc             0.5
        //    85: ldc             0.5
        //    87: ldc             0.5
        //    89: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179152_a:(FFF)V
        //    92: aload_0         /* a */
        //    93: aload_1         /* a */
        //    94: invokevirtual   com/sun/jna/z/a/g/h.e:(Ljava/lang/String;)Ljava/lang/String;
        //    97: astore          a
        //    99: getstatic       com/sun/jna/z/a/g/i.a:[I
        //   102: aload           a
        //   104: invokevirtual   com/sun/jna/z/a/g/a.ordinal:()I
        //   107: iaload         
        //   108: iload           a
        //   110: ifne            318
        //   113: tableswitch {
        //                2: 153
        //                3: 176
        //                4: 201
        //                5: 262
        //                6: 284
        //                7: 301
        //          default: 301
        //        }
        //   152: athrow         
        //   153: aload_0         /* a */
        //   154: aload           a
        //   156: fload_2         /* a */
        //   157: fconst_1       
        //   158: fadd           
        //   159: fload_3         /* a */
        //   160: fconst_1       
        //   161: fadd           
        //   162: iload           a
        //   164: invokespecial   com/sun/jna/z/a/g/h.a:(Ljava/lang/String;FFI)V
        //   167: iload           a
        //   169: ifeq            301
        //   172: goto            176
        //   175: athrow         
        //   176: aload_0         /* a */
        //   177: aload           a
        //   179: fload_2         /* a */
        //   180: ldc             0.5
        //   182: fadd           
        //   183: fload_3         /* a */
        //   184: ldc             0.5
        //   186: fadd           
        //   187: iload           a
        //   189: invokespecial   com/sun/jna/z/a/g/h.a:(Ljava/lang/String;FFI)V
        //   192: iload           a
        //   194: ifeq            301
        //   197: goto            201
        //   200: athrow         
        //   201: aload_0         /* a */
        //   202: aload           a
        //   204: fload_2         /* a */
        //   205: ldc             0.5
        //   207: fadd           
        //   208: fload_3         /* a */
        //   209: iload           a
        //   211: invokespecial   com/sun/jna/z/a/g/h.a:(Ljava/lang/String;FFI)V
        //   214: aload_0         /* a */
        //   215: aload           a
        //   217: fload_2         /* a */
        //   218: ldc             0.5
        //   220: fsub           
        //   221: fload_3         /* a */
        //   222: iload           a
        //   224: invokespecial   com/sun/jna/z/a/g/h.a:(Ljava/lang/String;FFI)V
        //   227: aload_0         /* a */
        //   228: aload           a
        //   230: fload_2         /* a */
        //   231: fload_3         /* a */
        //   232: ldc             0.5
        //   234: fadd           
        //   235: iload           a
        //   237: invokespecial   com/sun/jna/z/a/g/h.a:(Ljava/lang/String;FFI)V
        //   240: aload_0         /* a */
        //   241: aload           a
        //   243: fload_2         /* a */
        //   244: fload_3         /* a */
        //   245: ldc             0.5
        //   247: fsub           
        //   248: iload           a
        //   250: invokespecial   com/sun/jna/z/a/g/h.a:(Ljava/lang/String;FFI)V
        //   253: iload           a
        //   255: ifeq            301
        //   258: goto            262
        //   261: athrow         
        //   262: aload_0         /* a */
        //   263: aload           a
        //   265: fload_2         /* a */
        //   266: fload_3         /* a */
        //   267: ldc             0.5
        //   269: fadd           
        //   270: iload           a
        //   272: invokespecial   com/sun/jna/z/a/g/h.a:(Ljava/lang/String;FFI)V
        //   275: iload           a
        //   277: ifeq            301
        //   280: goto            284
        //   283: athrow         
        //   284: aload_0         /* a */
        //   285: aload           a
        //   287: fload_2         /* a */
        //   288: fload_3         /* a */
        //   289: ldc             0.5
        //   291: fsub           
        //   292: iload           a
        //   294: invokespecial   com/sun/jna/z/a/g/h.a:(Ljava/lang/String;FFI)V
        //   297: goto            301
        //   300: athrow         
        //   301: aload_0         /* a */
        //   302: aload_1         /* a */
        //   303: fload_2         /* a */
        //   304: fload_3         /* a */
        //   305: iload           a
        //   307: invokespecial   com/sun/jna/z/a/g/h.a:(Ljava/lang/String;FFI)V
        //   310: fconst_2       
        //   311: fconst_2       
        //   312: fconst_2       
        //   313: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179152_a:(FFF)V
        //   316: iload           a
        //   318: iload           a
        //   320: ifne            335
        //   323: ifeq            333
        //   326: goto            330
        //   329: athrow         
        //   330: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179098_w:()V
        //   333: iload           a
        //   335: iload           a
        //   337: ifne            352
        //   340: ifeq            350
        //   343: goto            347
        //   346: athrow         
        //   347: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179145_e:()V
        //   350: iload           a
        //   352: ifne            358
        //   355: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179084_k:()V
        //   358: invokestatic    net/minecraft/client/renderer/GlStateManager.func_179121_F:()V
        //   361: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  38     48     51     52     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  57     65     68     69     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  99     152    152    153    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  113    172    175    176    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  153    197    200    201    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  176    258    261    262    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  201    280    283    284    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  262    300    300    301    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  318    326    329    330    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  335    343    346    347    Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0153:
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
    
    private void a(final float a, final float a, final float a, final float a, final float a, final float a) {
        final float a2 = 0.0039063f;
        final WorldRenderer a3 = Tessellator.func_178181_a().func_178180_c();
        final Tessellator a4 = Tessellator.func_178181_a();
        a3.func_178970_b();
        a3.func_178985_a((double)(a + 0.0f), (double)(a + a), 0.0, (double)((a + 0.0f) * 0.0039063f), (double)((a + a) * 0.0039063f));
        a3.func_178985_a((double)(a + a), (double)(a + a), 0.0, (double)((a + a) * 0.0039063f), (double)((a + a) * 0.0039063f));
        a3.func_178985_a((double)(a + a), (double)(a + 0.0f), 0.0, (double)((a + a) * 0.0039063f), (double)((a + 0.0f) * 0.0039063f));
        a3.func_178985_a((double)(a + 0.0f), (double)(a + 0.0f), 0.0, (double)((a + 0.0f) * 0.0039063f), (double)((a + 0.0f) * 0.0039063f));
        a4.func_78381_a();
    }
    
    private Rectangle2D a(final String a) {
        return this.l.getStringBounds(a, this.k);
    }
    
    public Font a() {
        return this.j;
    }
    
    private String b(final String a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore_3       
        //     3: getstatic       com/sun/jna/z/a/g/g.b:I
        //     6: iconst_m1      
        //     7: istore          a
        //     9: aload_1         /* a */
        //    10: invokevirtual   java/lang/String.length:()I
        //    13: istore          5
        //    15: istore_2        /* a */
        //    16: aload_1         /* a */
        //    17: sipush          167
        //    20: iload           a
        //    22: iconst_1       
        //    23: iadd           
        //    24: invokevirtual   java/lang/String.indexOf:(II)I
        //    27: dup            
        //    28: istore          a
        //    30: iconst_m1      
        //    31: if_icmpeq       145
        //    34: iload           a
        //    36: iload_2         /* a */
        //    37: ifne            59
        //    40: iload           a
        //    42: iconst_1       
        //    43: isub           
        //    44: if_icmpge       16
        //    47: goto            51
        //    50: athrow         
        //    51: aload_1         /* a */
        //    52: iload           a
        //    54: iconst_1       
        //    55: iadd           
        //    56: invokevirtual   java/lang/String.charAt:(I)C
        //    59: istore          a
        //    61: aload_0         /* a */
        //    62: iload           a
        //    64: invokespecial   com/sun/jna/z/a/g/h.a:(C)Z
        //    67: iload_2         /* a */
        //    68: ifne            113
        //    71: ifeq            103
        //    74: goto            78
        //    77: athrow         
        //    78: new             Ljava/lang/StringBuilder;
        //    81: dup            
        //    82: invokespecial   java/lang/StringBuilder.<init>:()V
        //    85: ldc             "§"
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: iload           a
        //    92: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    95: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    98: astore_3        /* a */
        //    99: iload_2         /* a */
        //   100: ifeq            141
        //   103: aload_0         /* a */
        //   104: iload           a
        //   106: invokespecial   com/sun/jna/z/a/g/h.b:(C)Z
        //   109: goto            113
        //   112: athrow         
        //   113: ifeq            141
        //   116: new             Ljava/lang/StringBuilder;
        //   119: dup            
        //   120: invokespecial   java/lang/StringBuilder.<init>:()V
        //   123: aload_3         /* a */
        //   124: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   127: ldc             "§"
        //   129: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   132: iload           a
        //   134: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   137: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   140: astore_3        /* a */
        //   141: iload_2         /* a */
        //   142: ifeq            16
        //   145: aload_3         /* a */
        //   146: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  34     47     50     51     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  61     74     77     78     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  99     109    112    113    Ljava/lang/ArrayIndexOutOfBoundsException;
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
    
    public Graphics2D b() {
        return this.k;
    }
    
    public float c(final String a) {
        return (float)this.a(a).getHeight() / 2.0f;
    }
    
    public float d(final String a) {
        return (float)(this.a(a).getWidth() + this.d) / 2.0f;
    }
    
    private boolean a(final char a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2        /* a */
        //     4: iload_1         /* a */
        //     5: bipush          48
        //     7: iload_2         /* a */
        //     8: ifne            43
        //    11: if_icmplt       36
        //    14: goto            18
        //    17: athrow         
        //    18: iload_1         /* a */
        //    19: iload_2         /* a */
        //    20: ifne            109
        //    23: goto            27
        //    26: athrow         
        //    27: bipush          57
        //    29: if_icmple       108
        //    32: goto            36
        //    35: athrow         
        //    36: iload_1         /* a */
        //    37: bipush          97
        //    39: goto            43
        //    42: athrow         
        //    43: iload_2         /* a */
        //    44: ifne            79
        //    47: if_icmplt       72
        //    50: goto            54
        //    53: athrow         
        //    54: iload_1         /* a */
        //    55: iload_2         /* a */
        //    56: ifne            109
        //    59: goto            63
        //    62: athrow         
        //    63: bipush          102
        //    65: if_icmple       108
        //    68: goto            72
        //    71: athrow         
        //    72: iload_1         /* a */
        //    73: bipush          65
        //    75: goto            79
        //    78: athrow         
        //    79: iload_2         /* a */
        //    80: ifne            105
        //    83: if_icmplt       112
        //    86: goto            90
        //    89: athrow         
        //    90: iload_1         /* a */
        //    91: iload_2         /* a */
        //    92: ifne            109
        //    95: goto            99
        //    98: athrow         
        //    99: bipush          70
        //   101: goto            105
        //   104: athrow         
        //   105: if_icmpgt       112
        //   108: iconst_1       
        //   109: goto            113
        //   112: iconst_0       
        //   113: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  4      14     17     18     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  11     23     26     27     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  18     32     35     36     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  27     39     42     43     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  43     50     53     54     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  47     59     62     63     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  54     68     71     72     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  63     75     78     79     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  79     86     89     90     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  83     95     98     99     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  90     101    104    105    Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0018:
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
    
    private boolean b(final char a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2        /* a */
        //     4: iload_1         /* a */
        //     5: bipush          107
        //     7: iload_2         /* a */
        //     8: ifne            43
        //    11: if_icmplt       36
        //    14: goto            18
        //    17: athrow         
        //    18: iload_1         /* a */
        //    19: iload_2         /* a */
        //    20: ifne            113
        //    23: goto            27
        //    26: athrow         
        //    27: bipush          111
        //    29: if_icmple       108
        //    32: goto            36
        //    35: athrow         
        //    36: iload_1         /* a */
        //    37: bipush          75
        //    39: goto            43
        //    42: athrow         
        //    43: iload_2         /* a */
        //    44: ifne            87
        //    47: if_icmplt       72
        //    50: goto            54
        //    53: athrow         
        //    54: iload_1         /* a */
        //    55: iload_2         /* a */
        //    56: ifne            113
        //    59: goto            63
        //    62: athrow         
        //    63: bipush          79
        //    65: if_icmple       108
        //    68: goto            72
        //    71: athrow         
        //    72: iload_1         /* a */
        //    73: iload_2         /* a */
        //    74: ifne            113
        //    77: goto            81
        //    80: athrow         
        //    81: bipush          114
        //    83: goto            87
        //    86: athrow         
        //    87: if_icmpeq       108
        //    90: iload_1         /* a */
        //    91: iload_2         /* a */
        //    92: ifne            113
        //    95: goto            99
        //    98: athrow         
        //    99: bipush          82
        //   101: if_icmpne       116
        //   104: goto            108
        //   107: athrow         
        //   108: iconst_1       
        //   109: goto            113
        //   112: athrow         
        //   113: goto            117
        //   116: iconst_0       
        //   117: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  4      14     17     18     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  11     23     26     27     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  18     32     35     36     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  27     39     42     43     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  43     50     53     54     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  47     59     62     63     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  54     68     71     72     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  63     77     80     81     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  72     83     86     87     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  87     95     98     99     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  90     104    107    108    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  99     109    112    113    Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0018:
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
    
    public List a(final String a, final int a) {
        return Arrays.asList(this.b(a, a).split("\n"));
    }
    
    private void c() {
        this.a = new BufferedImage(256, 256, 2);
        (this.k = (Graphics2D)this.a.getGraphics()).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    }
    
    private int a(final String a, final float a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/String.length:()I
        //     4: istore          a
        //     6: getstatic       com/sun/jna/z/a/g/g.b:I
        //     9: fconst_0       
        //    10: fstore          a
        //    12: iconst_0       
        //    13: istore          a
        //    15: istore_3        /* a */
        //    16: iconst_m1      
        //    17: istore          a
        //    19: iconst_0       
        //    20: istore          a
        //    22: iload           a
        //    24: iload           a
        //    26: if_icmpge       360
        //    29: aload_1         /* a */
        //    30: iload           a
        //    32: invokevirtual   java/lang/String.charAt:(I)C
        //    35: istore          a
        //    37: iload           a
        //    39: iload_3         /* a */
        //    40: ifne            362
        //    43: iload_3         /* a */
        //    44: ifne            269
        //    47: goto            51
        //    50: athrow         
        //    51: lookupswitch {
        //               10: 109
        //               32: 263
        //               45: 263
        //               58: 263
        //               95: 263
        //              167: 120
        //          default: 267
        //        }
        //   108: athrow         
        //   109: iinc            a, -1
        //   112: iload_3         /* a */
        //   113: ifeq            304
        //   116: goto            120
        //   119: athrow         
        //   120: iload           a
        //   122: iload           a
        //   124: iconst_1       
        //   125: isub           
        //   126: iload_3         /* a */
        //   127: ifne            316
        //   130: goto            134
        //   133: athrow         
        //   134: if_icmpge       304
        //   137: goto            141
        //   140: athrow         
        //   141: iinc            a, 1
        //   144: aload_1         /* a */
        //   145: iload           a
        //   147: invokevirtual   java/lang/String.charAt:(I)C
        //   150: istore          a
        //   152: iload           a
        //   154: iload_3         /* a */
        //   155: ifne            257
        //   158: bipush          108
        //   160: if_icmpeq       252
        //   163: goto            167
        //   166: athrow         
        //   167: iload           a
        //   169: iload_3         /* a */
        //   170: ifne            257
        //   173: goto            177
        //   176: athrow         
        //   177: bipush          76
        //   179: if_icmpeq       252
        //   182: goto            186
        //   185: athrow         
        //   186: iload           a
        //   188: iload_3         /* a */
        //   189: ifne            246
        //   192: goto            196
        //   195: athrow         
        //   196: bipush          114
        //   198: if_icmpeq       245
        //   201: goto            205
        //   204: athrow         
        //   205: iload           a
        //   207: iload_3         /* a */
        //   208: ifne            246
        //   211: goto            215
        //   214: athrow         
        //   215: bipush          82
        //   217: if_icmpeq       245
        //   220: goto            224
        //   223: athrow         
        //   224: aload_0         /* a */
        //   225: iload           a
        //   227: invokespecial   com/sun/jna/z/a/g/h.a:(C)Z
        //   230: iload_3         /* a */
        //   231: ifne            246
        //   234: goto            238
        //   237: athrow         
        //   238: ifeq            259
        //   241: goto            245
        //   244: athrow         
        //   245: iconst_0       
        //   246: istore          a
        //   248: iload_3         /* a */
        //   249: ifeq            259
        //   252: iconst_1       
        //   253: goto            257
        //   256: athrow         
        //   257: istore          a
        //   259: iload_3         /* a */
        //   260: ifeq            304
        //   263: iload           a
        //   265: istore          a
        //   267: iload           a
        //   269: invokestatic    java/lang/String.valueOf:(C)Ljava/lang/String;
        //   272: astore          a
        //   274: fload           a
        //   276: aload_0         /* a */
        //   277: aload           a
        //   279: invokevirtual   com/sun/jna/z/a/g/h.d:(Ljava/lang/String;)F
        //   282: fadd           
        //   283: fstore          a
        //   285: iload           a
        //   287: iload_3         /* a */
        //   288: ifne            306
        //   291: ifeq            304
        //   294: goto            298
        //   297: athrow         
        //   298: fload           a
        //   300: fconst_1       
        //   301: fadd           
        //   302: fstore          a
        //   304: iload           a
        //   306: iload_3         /* a */
        //   307: ifne            338
        //   310: bipush          10
        //   312: goto            316
        //   315: athrow         
        //   316: if_icmpne       330
        //   319: iinc            a, 1
        //   322: iload           a
        //   324: istore          a
        //   326: iload_3         /* a */
        //   327: ifeq            349
        //   330: fload           a
        //   332: fload_2         /* a */
        //   333: fcmpl          
        //   334: goto            338
        //   337: athrow         
        //   338: ifle            349
        //   341: iload_3         /* a */
        //   342: ifeq            360
        //   345: goto            349
        //   348: athrow         
        //   349: iinc            a, 1
        //   352: iload_3         /* a */
        //   353: ifeq            22
        //   356: goto            360
        //   359: athrow         
        //   360: iload           a
        //   362: iload           a
        //   364: iload_3         /* a */
        //   365: ifne            382
        //   368: if_icmpeq       417
        //   371: goto            375
        //   374: athrow         
        //   375: iload           a
        //   377: iconst_m1      
        //   378: goto            382
        //   381: athrow         
        //   382: iload_3         /* a */
        //   383: ifne            409
        //   386: if_icmpeq       417
        //   389: goto            393
        //   392: athrow         
        //   393: iload           a
        //   395: iload_3         /* a */
        //   396: ifne            414
        //   399: goto            403
        //   402: athrow         
        //   403: iload           a
        //   405: goto            409
        //   408: athrow         
        //   409: if_icmpge       417
        //   412: iload           a
        //   414: goto            419
        //   417: iload           a
        //   419: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  37     47     50     51     Ljava/lang/ArrayIndexOutOfBoundsException;
        //  43     108    108    109    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  51     116    119    120    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  109    130    133    134    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  120    137    140    141    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  152    163    166    167    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  158    173    176    177    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  167    182    185    186    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  177    192    195    196    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  186    201    204    205    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  196    211    214    215    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  205    220    223    224    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  215    234    237    238    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  224    241    244    245    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  248    253    256    257    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  285    294    297    298    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  306    312    315    316    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  326    334    337    338    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  338    345    348    349    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  341    356    359    360    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  362    371    374    375    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  368    378    381    382    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  382    389    392    393    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  386    399    402    403    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  393    405    408    409    Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
    
    public String e(final String a) {
        return this.f.matcher(a).replaceAll("");
    }
    
    public String f(final String a) {
        return this.g.matcher(a).replaceAll("");
    }
    
    public String b(final String a, final float a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1         /* a */
        //     2: fload_2         /* a */
        //     3: invokespecial   com/sun/jna/z/a/g/h.a:(Ljava/lang/String;F)I
        //     6: istore          4
        //     8: getstatic       com/sun/jna/z/a/g/g.b:I
        //    11: istore_3        /* a */
        //    12: aload_1         /* a */
        //    13: iload_3         /* a */
        //    14: ifne            39
        //    17: invokevirtual   java/lang/String.length:()I
        //    20: iload           a
        //    22: if_icmpgt       32
        //    25: goto            29
        //    28: athrow         
        //    29: aload_1         /* a */
        //    30: areturn        
        //    31: athrow         
        //    32: aload_1         /* a */
        //    33: iconst_0       
        //    34: iload           a
        //    36: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    39: astore          a
        //    41: new             Ljava/lang/StringBuilder;
        //    44: dup            
        //    45: invokespecial   java/lang/StringBuilder.<init>:()V
        //    48: aload_0         /* a */
        //    49: aload           a
        //    51: invokespecial   com/sun/jna/z/a/g/h.b:(Ljava/lang/String;)Ljava/lang/String;
        //    54: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    57: aload_1         /* a */
        //    58: iload           a
        //    60: aload_1         /* a */
        //    61: iload           a
        //    63: invokevirtual   java/lang/String.charAt:(I)C
        //    66: iload_3         /* a */
        //    67: ifne            107
        //    70: bipush          32
        //    72: if_icmpeq       102
        //    75: goto            79
        //    78: athrow         
        //    79: aload_1         /* a */
        //    80: iload           a
        //    82: invokevirtual   java/lang/String.charAt:(I)C
        //    85: iload_3         /* a */
        //    86: ifne            107
        //    89: goto            93
        //    92: athrow         
        //    93: bipush          10
        //    95: if_icmpne       110
        //    98: goto            102
        //   101: athrow         
        //   102: iconst_1       
        //   103: goto            107
        //   106: athrow         
        //   107: goto            111
        //   110: iconst_0       
        //   111: iadd           
        //   112: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   115: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   118: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   121: astore          a
        //   123: new             Ljava/lang/StringBuilder;
        //   126: dup            
        //   127: invokespecial   java/lang/StringBuilder.<init>:()V
        //   130: aload           a
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   135: ldc             "\n"
        //   137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   140: aload_0         /* a */
        //   141: aload           a
        //   143: fload_2         /* a */
        //   144: invokevirtual   com/sun/jna/z/a/g/h.b:(Ljava/lang/String;F)Ljava/lang/String;
        //   147: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   150: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   153: areturn        
        //   154: astore          a
        //   156: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   159: getstatic       com/sun/jna/z/a/g/h.p:[Ljava/lang/String;
        //   162: iconst_3       
        //   163: aaload         
        //   164: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   167: ldc             ""
        //   169: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  93     103    106    107    Ljava/lang/Exception;
        //  79     98     101    102    Ljava/lang/Exception;
        //  70     89     92     93     Ljava/lang/Exception;
        //  41     75     78     79     Ljava/lang/Exception;
        //  17     31     31     32     Ljava/lang/Exception;
        //  12     25     28     29     Ljava/lang/Exception;
        //  123    153    154    170    Ljava/lang/Exception;
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
        final String[] p2 = new String[5];
        int n = 0;
        String s;
        int n2 = (s = "S\u00fb\u000b;Eb`\u0004c\u00f1\u0017+\u000f-¡\u0010vxy15\u00dfN\u0004o!NX").length();
        int n3 = 7;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                ++n4;
                final String s2 = s;
                final int n5 = n4;
                String s3 = s2.substring(n5, n5 + n3);
                int n6 = -1;
            Label_0146_Outer:
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    int length;
                    int n8;
                    final int n7 = n8 = (length = charArray.length);
                    int n9 = 0;
                    while (true) {
                        Label_0248: {
                            try {
                                if (n7 > 1) {
                                    break Label_0248;
                                }
                                length = (n8 = n9);
                            }
                            catch (ArrayIndexOutOfBoundsException ex) {
                                throw ex;
                            }
                            while (true) {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = '\u0005';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u009e';
                                        break;
                                    }
                                    case 2: {
                                        c2 = 'y';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '_';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '$';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '\f';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u0001';
                                        break;
                                    }
                                }
                                try {
                                    charArray[length] = (char)(c ^ c2);
                                    ++n9;
                                    if (n7 == 0) {
                                        continue Label_0146_Outer;
                                    }
                                }
                                catch (ArrayIndexOutOfBoundsException ex2) {
                                    throw ex2;
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
                            p2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0022;
                            }
                            n2 = (s = "F\u00ff\u00171Kx!r\u00ec\u0018/\u0004\u007fuw\u00f7\u00178\u0004xn%\u00e9\u0010;Pd/\u0016-¡\u0010vxy15\u00dfN\u0004\u0014!8D³?\u0014\tCFX").length();
                            n3 = 28;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            p2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0022;
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
        p = p2;
    }
}
