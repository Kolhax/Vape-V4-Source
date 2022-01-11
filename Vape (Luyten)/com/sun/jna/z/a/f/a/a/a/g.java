package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.*;
import com.sun.jna.z.a.f.a.a.a.e.*;
import java.util.concurrent.*;
import java.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;

public abstract class g implements j
{
    public final List<n> a;
    private e b;
    public static int c;
    
    public g() {
        this.a = new CopyOnWriteArrayList<n>();
    }
    
    @Override
    public abstract void a();
    
    @Override
    public void a(final n a) {
        a.a(this.b);
        this.a.add(0, a);
    }
    
    @Override
    public void b(final n a) {
        this.a.remove(a);
    }
    
    @Override
    public n[] b() {
        return this.a.toArray(new n[this.a.size()]);
    }
    
    @Override
    public void c(final n a) {
        final int a2 = g.c;
        final List<n> a3 = this.a;
        if (a2 == 0) {
            if (!a3.remove(a)) {
                return;
            }
            final List<n> a4 = this.a;
        }
        a3.add(0, a);
    }
    
    @Override
    public e c() {
        return this.b;
    }
    
    @Override
    public void a(final e a) {
        final int c = g.c;
        this.b = a;
        final int a2 = c;
        for (final n a3 : this.a) {
            a3.a(a);
            if (a2 != 0) {
                return;
            }
            if (a2 != 0) {
                break;
            }
        }
        this.b();
    }
    
    protected abstract void b();
    
    @Override
    public void d() {
        final int c = g.c;
        final n[] a = this.b();
        final int a2 = c;
        int a3 = a.length - 1;
        while (a3 >= 0) {
            final n a4 = a[a3];
            final int a5 = 2;
            GL11.glEnable(3089);
            GL11.glScissor(a4.d() * a5, Minecraft.func_71410_x().field_71440_d - a4.e() * a5 - a4.g() * a5, a4.f() * a5, a4.g() * a5);
            a[a3].b();
            GL11.glDisable(3089);
            --a3;
            if (a2 != 0) {
                break;
            }
        }
    }
    
    @Override
    public void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0         /* a */
        //     4: invokevirtual   com/sun/jna/z/a/f/a/a/a/g.b:()[Lcom/sun/jna/z/a/f/a/a/a/a/n;
        //     7: astore_2       
        //     8: istore_1        /* a */
        //     9: aload_2         /* a */
        //    10: arraylength    
        //    11: iconst_1       
        //    12: isub           
        //    13: istore_3        /* a */
        //    14: iload_3         /* a */
        //    15: iflt            100
        //    18: aload_2         /* a */
        //    19: iload_3         /* a */
        //    20: aaload         
        //    21: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.b:()Z
        //    26: ifeq            93
        //    29: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    32: astore          a
        //    34: new             Lnet/minecraft/client/gui/ScaledResolution;
        //    37: dup            
        //    38: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    41: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    44: getfield        net/minecraft/client/Minecraft.field_71443_c:I
        //    47: invokestatic    net/minecraft/client/Minecraft.func_71410_x:()Lnet/minecraft/client/Minecraft;
        //    50: getfield        net/minecraft/client/Minecraft.field_71440_d:I
        //    53: invokespecial   net/minecraft/client/gui/ScaledResolution.<init>:(Lnet/minecraft/client/Minecraft;II)V
        //    56: astore          a
        //    58: aload           a
        //    60: invokevirtual   net/minecraft/client/gui/ScaledResolution.func_78325_e:()I
        //    63: istore          a
        //    65: invokestatic    com/sun/jna/z/a/f/a/a/a/h.a:()F
        //    68: fstore          a
        //    70: invokestatic    org/lwjgl/opengl/GL11.glPushMatrix:()V
        //    73: fload           a
        //    75: fload           a
        //    77: fload           a
        //    79: invokestatic    org/lwjgl/opengl/GL11.glScalef:(FFF)V
        //    82: aload_2         /* a */
        //    83: iload_3         /* a */
        //    84: aaload         
        //    85: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.b:()V
        //    90: invokestatic    org/lwjgl/opengl/GL11.glPopMatrix:()V
        //    93: iinc            a, -1
        //    96: iload_1         /* a */
        //    97: ifeq            14
        //   100: return         
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
    
    @Override
    public void f() {
        final int c = g.c;
        final n[] a = this.b();
        final int a2 = c;
        int a3 = a.length - 1;
        while (a3 >= 0) {
            a[a3].c();
            --a3;
            if (a2 != 0) {
                break;
            }
        }
    }
}
