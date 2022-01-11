package com.sun.jna.z.a.f.a.a.a.f;

import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;
import com.sun.jna.z.a.*;
import java.awt.*;

public class a
{
    public static boolean b;
    
    public static void a(final int a, final int a, final int a, final int a) {
        final int a2 = a - a;
        final int a3 = a - a;
        final ScaledResolution a4 = new ScaledResolution(Minecraft.func_71410_x(), Minecraft.func_71410_x().field_71443_c, Minecraft.func_71410_x().field_71440_d);
        final int a5 = a4.func_78325_e();
        final int a6 = Minecraft.func_71410_x().field_71462_r.field_146295_m - a;
        GL11.glScissor(a * a5, a6 * a5, a2 * a5, a3 * a5);
    }
    
    public static void a() {
        GL11.glEnable(3042);
        GL11.glDisable(2896);
        GL11.glDisable(2929);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glHint(3154, 4354);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(32925);
        GL11.glEnable(32926);
        GL11.glShadeModel(7425);
    }
    
    public static void a(final double a, final double a, final double a, final double a, final double a, final double a, final float a) {
        GL11.glPushMatrix();
        a();
        GL11.glLineWidth(a);
        GL11.glBegin(1);
        GL11.glVertex3d(a, a, a);
        GL11.glVertex3d(a, a, a);
        GL11.glEnd();
        GL11.glDisable(3042);
        GL11.glEnable(3553);
        GL11.glDisable(2848);
        GL11.glEnable(2896);
        GL11.glEnable(2929);
        GL11.glDisable(32925);
        GL11.glDisable(32926);
        GL11.glPopMatrix();
    }
    
    public static void a(final int a, final int a, final int a, final int a, final int a) {
        final double a2 = a / 2;
        final double a3 = a / 2;
        GL11.glDisable(2884);
        GL11.glBindTexture(3553, a);
        GL11.glPushMatrix();
        GL11.glTranslated(a + a3, a + a2, 0.0);
        GL11.glScalef((float)a, (float)a, 0.0f);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glBegin(4);
        GL11.glNormal3f(0.0f, 0.0f, 1.0f);
        GL11.glTexCoord2f(1.0f, 1.0f);
        GL11.glVertex2d(1.0, 1.0);
        GL11.glTexCoord2f(0.0f, 1.0f);
        GL11.glVertex2d(-1.0, 1.0);
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex2d(-1.0, -1.0);
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex2d(-1.0, -1.0);
        GL11.glTexCoord2f(1.0f, 0.0f);
        GL11.glVertex2d(1.0, -1.0);
        GL11.glTexCoord2f(1.0f, 1.0f);
        GL11.glVertex2d(1.0, 1.0);
        GL11.glEnd();
        GL11.glDisable(3042);
        GL11.glBindTexture(3553, 0);
        GL11.glPopMatrix();
    }
    
    public static void a(final double a, final double a, final double a, final double a, final int a, final int a) {
    }
    
    public static int a(final int a, final int a, final float a) {
        final int a2 = a & 0xFF;
        final int a3 = a >> 8 & 0xFF;
        final int a4 = a >> 16 & 0xFF;
        final int a5 = a >> 24 & 0xFF;
        final int b = a.b ? 1 : 0;
        final int a6 = a & 0xFF;
        final int a7 = b;
        final int a8 = a >> 8 & 0xFF;
        final int a9 = a >> 16 & 0xFF;
        final int a10 = a >> 24 & 0xFF;
        final int n = a2;
        final int a11 = (int)((a7 == 0 && n < a6) ? (a2 + (a6 - a2) * a) : (n + (a2 - a6) * a));
        final int n2 = a3;
        final int a12 = (int)((a7 == 0 && n2 < a8) ? (a3 + (a8 - a3) * a) : (n2 + (a3 - a8) * a));
        final int n3 = a4;
        final int a13 = (int)((a7 == 0 && n3 < a9) ? (a4 + (a9 - a4) * a) : (n3 + (a4 - a9) * a));
        final int n4 = a5;
        final int a14 = (int)((a7 == 0 && n4 < a10) ? (a5 + (a10 - a5) * a) : (n4 + (a5 - a10) * a));
        final int n5 = a11 | a12 << 8 | a13 << 16 | a14 << 24;
        if (a7 != 0) {
            j.g = !j.g;
        }
        return n5;
    }
    
    public static void a(final Color a) {
        GL11.glColor4f(a.getRed() / 255.0f, a.getGreen() / 255.0f, a.getBlue() / 255.0f, a.getAlpha() / 255.0f);
    }
    
    public static Color a(final int a) {
        final int a2 = a & 0xFF;
        final int a3 = a >> 8 & 0xFF;
        final int a4 = a >> 16 & 0xFF;
        final int a5 = a >> 24 & 0xFF;
        return new Color(a2, a3, a4, a5);
    }
    
    public static int b(final Color a) {
        return a.getRed() | a.getGreen() << 8 | a.getBlue() << 16 | a.getAlpha() << 24;
    }
    
    public static void b(final int a) {
        final int a2 = a & 0xFF;
        final int a3 = a >> 8 & 0xFF;
        final int a4 = a >> 16 & 0xFF;
        final int a5 = a >> 24 & 0xFF;
        GL11.glColor4b((byte)a2, (byte)a3, (byte)a4, (byte)a5);
    }
    
    public static Point b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //     6: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //     9: getfield        net/minecraft/client/settings/GameSettings.field_74335_Z:I
        //    12: istore_1       
        //    13: istore_0        /* a */
        //    14: iload_1         /* a */
        //    15: iload_0         /* a */
        //    16: ifne            30
        //    19: iconst_3       
        //    20: if_icmpne       29
        //    23: ldc2_w          1.2
        //    26: goto            55
        //    29: iload_1         /* a */
        //    30: iload_0         /* a */
        //    31: ifne            44
        //    34: ifne            43
        //    37: ldc2_w          0.0025
        //    40: goto            55
        //    43: iload_1         /* a */
        //    44: iconst_1       
        //    45: if_icmpne       54
        //    48: ldc2_w          2.0
        //    51: goto            55
        //    54: dconst_1       
        //    55: d2f            
        //    56: fstore_2        /* a */
        //    57: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    60: astore_3        /* a */
        //    61: aload_3         /* a */
        //    62: getfield        net/minecraft/client/Minecraft.field_71474_y:Lnet/minecraft/client/settings/GameSettings;
        //    65: getfield        net/minecraft/client/settings/GameSettings.field_74335_Z:I
        //    68: istore          a
        //    70: iload           a
        //    72: iload_0         /* a */
        //    73: ifne            92
        //    76: ifne            90
        //    79: ldc             1000.0
        //    81: fload_2         /* a */
        //    82: fmul           
        //    83: f2i            
        //    84: istore          a
        //    86: iload_0         /* a */
        //    87: ifeq            120
        //    90: iload           a
        //    92: iload_0         /* a */
        //    93: ifne            118
        //    96: iconst_3       
        //    97: if_icmpne       112
        //   100: iload           a
        //   102: i2f            
        //   103: fload_2         /* a */
        //   104: fdiv           
        //   105: f2i            
        //   106: istore          a
        //   108: iload_0         /* a */
        //   109: ifeq            120
        //   112: iload           a
        //   114: i2f            
        //   115: fload_2         /* a */
        //   116: fmul           
        //   117: f2i            
        //   118: istore          a
        //   120: iconst_0       
        //   121: istore          a
        //   123: iload           a
        //   125: iload           a
        //   127: if_icmpge       171
        //   130: aload_3         /* a */
        //   131: getfield        net/minecraft/client/Minecraft.field_71443_c:I
        //   134: iload           a
        //   136: iconst_1       
        //   137: iadd           
        //   138: idiv           
        //   139: sipush          320
        //   142: iload_0         /* a */
        //   143: ifne            161
        //   146: if_icmplt       171
        //   149: aload_3         /* a */
        //   150: getfield        net/minecraft/client/Minecraft.field_71440_d:I
        //   153: iload           a
        //   155: iconst_1       
        //   156: iadd           
        //   157: idiv           
        //   158: sipush          240
        //   161: if_icmplt       171
        //   164: iinc            a, 1
        //   167: iload_0         /* a */
        //   168: ifeq            123
        //   171: new             Ljava/awt/Point;
        //   174: dup            
        //   175: invokestatic    org/lwjgl/input/Mouse.getX:()I
        //   178: iload           a
        //   180: idiv           
        //   181: aload_3         /* a */
        //   182: getfield        net/minecraft/client/Minecraft.field_71440_d:I
        //   185: iload           a
        //   187: idiv           
        //   188: invokestatic    org/lwjgl/input/Mouse.getY:()I
        //   191: iload           a
        //   193: idiv           
        //   194: isub           
        //   195: iconst_1       
        //   196: isub           
        //   197: invokespecial   java/awt/Point.<init>:(II)V
        //   200: areturn        
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
}
