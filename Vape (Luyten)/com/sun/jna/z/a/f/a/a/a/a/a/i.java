package com.sun.jna.z.a.f.a.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.*;
import com.sun.jna.z.a.*;
import com.sun.jna.z.a.f.a.a.a.d.*;

public class i extends d implements t
{
    private String l;
    private String m;
    private double n;
    private double o;
    private double p;
    private double q;
    private b r;
    private boolean s;
    private double t;
    
    public i() {
        this("");
    }
    
    public i(final String a) {
        this(a, 0.0);
    }
    
    public i(final String a, final double a) {
        this(a, a, 0.0, 100.0);
    }
    
    public i(final String a, final double a, final double a, final double a) {
        this(a, a, a, a, 1);
    }
    
    public i(final String a, final double a, final double a, final double a, final int a) {
        this(a, a, a, a, a, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);
    }
    
    public i(final String a, double a, final double a, final double a, final double a, final b a) {
        this.s = false;
        final int a2 = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        String l = a;
        if (a2 == 0) {
            if (a != null) {
                l = a;
            }
            else {
                l = "";
            }
        }
        this.l = l;
        this.o = Math.max(0.0, Math.min(a, a));
        this.p = Math.max(0.0, Math.max(a, a));
        a = Math.max(a, Math.min(a, a));
        this.n = a - Math.round(a % a / a) * a;
        this.q = Math.min(a, Math.max(5.0E-4, a));
        b decimal = a;
        if (a2 == 0) {
            if (a != null) {
                decimal = a;
            }
            else {
                decimal = com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL;
            }
        }
        this.r = decimal;
        if (a2 != 0) {
            com.sun.jna.z.a.j.g = !com.sun.jna.z.a.j.g;
        }
    }
    
    @Override
    public String b() {
        return this.l;
    }
    
    @Override
    public void b(final String a) {
        final int a2 = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        String l = a;
        if (a2 == 0) {
            if (a != null) {
                l = a;
            }
            else {
                l = "";
            }
        }
        this.l = l;
    }
    
    @Override
    public double a() {
        return this.n;
    }
    
    @Override
    public double c() {
        return this.o;
    }
    
    @Override
    public double d() {
        return this.p;
    }
    
    @Override
    public double e() {
        return this.q;
    }
    
    @Override
    public b f() {
        return this.r;
    }
    
    @Override
    public boolean b() {
        return this.s;
    }
    
    @Override
    public String a() {
        return this.m;
    }
    
    @Override
    public void a(final double a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/sun/jna/z/a/f/a/a/a/a/a/i.n:D
        //     4: dstore          4
        //     6: getstatic       com/sun/jna/z/a/f/a/a/a/a/a/c.q:Z
        //     9: istore_3        /* a */
        //    10: aload_0         /* a */
        //    11: getfield        com/sun/jna/z/a/f/a/a/a/a/a/i.o:D
        //    14: aload_0         /* a */
        //    15: getfield        com/sun/jna/z/a/f/a/a/a/a/a/i.p:D
        //    18: dload_1         /* a */
        //    19: invokestatic    java/lang/Math.min:(DD)D
        //    22: invokestatic    java/lang/Math.max:(DD)D
        //    25: dstore_1        /* a */
        //    26: aload_0         /* a */
        //    27: iload_3         /* a */
        //    28: ifne            67
        //    31: dload_1         /* a */
        //    32: dload_1         /* a */
        //    33: aload_0         /* a */
        //    34: getfield        com/sun/jna/z/a/f/a/a/a/a/a/i.q:D
        //    37: drem           
        //    38: aload_0         /* a */
        //    39: getfield        com/sun/jna/z/a/f/a/a/a/a/a/i.q:D
        //    42: ddiv           
        //    43: invokestatic    java/lang/Math.round:(D)J
        //    46: l2d            
        //    47: aload_0         /* a */
        //    48: getfield        com/sun/jna/z/a/f/a/a/a/a/a/i.q:D
        //    51: dmul           
        //    52: dsub           
        //    53: putfield        com/sun/jna/z/a/f/a/a/a/a/a/i.n:D
        //    56: dload           a
        //    58: aload_0         /* a */
        //    59: getfield        com/sun/jna/z/a/f/a/a/a/a/a/i.n:D
        //    62: dcmpl          
        //    63: ifeq            70
        //    66: aload_0         /* a */
        //    67: invokespecial   com/sun/jna/z/a/f/a/a/a/a/a/i.a:()V
        //    70: return         
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
    public void b(final double a) {
        this.o = Math.max(0.0, Math.min(this.p, a));
        this.a(this.n);
    }
    
    @Override
    public void c(final double a) {
        this.p = Math.max(a, this.o);
        this.a(this.n);
    }
    
    @Override
    public void d(final double a) {
        this.q = Math.min(this.p, Math.max(5.0E-4, a));
        this.a(this.n);
    }
    
    @Override
    public void a(final b a) {
        final int a2 = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        b decimal = a;
        if (a2 == 0) {
            if (a != null) {
                decimal = a;
            }
            else {
                decimal = com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL;
            }
        }
        this.r = decimal;
    }
    
    @Override
    public void a(final boolean a) {
        final int a2 = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        double n = a ? 1 : 0;
        boolean b = a;
        if (a2 == 0) {
            if (a == this.s) {
                return;
            }
            this.s = a;
            n = (a ? 1 : 0);
            b = a;
        }
        i i = null;
        Label_0058: {
            if (a2 == 0) {
                if (b) {
                    this.t = this.n;
                    if (a2 == 0) {
                        return;
                    }
                }
                i = this;
                if (a2 != 0) {
                    break Label_0058;
                }
                n = dcmpl(this.t, this.n);
            }
            if (n == 0) {
                return;
            }
            i = this;
        }
        i.a();
    }
    
    @Override
    public void a(final String a) {
        this.m = a;
    }
    
    @Override
    public void a(final e a) {
        this.a(a);
    }
    
    @Override
    public void b(final e a) {
        this.b(a);
    }
    
    private void a() {
        final com.sun.jna.z.a.f.a.a.a.d.c[] a = this.b();
        final int q = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        final int a2 = a.length;
        int a3 = 0;
        final int a4 = q;
        while (a3 < a2) {
            final com.sun.jna.z.a.f.a.a.a.d.c a5 = a[a3];
            if (a4 == 0) {
                if (a5 instanceof e) {
                    ((e)a5).a(this);
                }
                ++a3;
            }
            if (a4 != 0) {
                break;
            }
        }
    }
    
    @Override
    public double b() {
        return Long.valueOf(Math.round(this.a()));
    }
}
