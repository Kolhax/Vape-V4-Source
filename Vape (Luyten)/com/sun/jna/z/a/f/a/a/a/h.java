package com.sun.jna.z.a.f.a.a.a;

import java.util.concurrent.atomic.*;
import com.sun.jna.z.a.f.a.a.a.a.a.*;
import com.sun.jna.z.a.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import com.sun.jna.z.a.e.*;
import com.sun.jna.z.a.f.a.a.a.c.*;
import com.sun.jna.z.a.f.a.a.a.a.*;
import java.util.*;
import java.awt.*;

public final class h extends g
{
    private final AtomicBoolean d;
    public static Color e;
    public static Color f;
    final Color g;
    final Color h;
    n i;
    public i j;
    public i k;
    public i l;
    public i m;
    public n n;
    public n o;
    public n p;
    public static boolean q;
    private static final String[] r;
    
    public h() {
        this.g = new Color(10, 10, 10, 255);
        this.h = new Color(0, 0, 0, 130);
        final String[] a = com.sun.jna.z.a.f.a.a.a.h.r;
        this.i = new a(a[0]);
        final int c = com.sun.jna.z.a.f.a.a.a.g.c;
        this.j = new d(a[1]);
        this.k = new d(a[7]);
        this.l = new d(a[2]);
        this.m = new d(a[13]);
        final int a2 = c;
        this.n = new a(a[11]);
        this.o = new q(this, a[12]);
        this.p = new r(this, a[6]);
        this.d = new AtomicBoolean();
        if (a2 != 0) {
            com.sun.jna.z.a.j.g = !com.sun.jna.z.a.j.g;
        }
    }
    
    public static float a() {
        Minecraft.func_71410_x();
        final int a = g.c;
        final ScaledResolution a2 = new ScaledResolution(Minecraft.func_71410_x(), Minecraft.func_71410_x().field_71443_c, Minecraft.func_71410_x().field_71440_d);
        final int a3 = a2.func_78325_e();
        int n3;
        int n2;
        final int n = n2 = (n3 = a3);
        int n6;
        int n5;
        final int n4 = n5 = (n6 = 4);
        if (a == 0) {
            if (n == n4) {
                final double n7 = 0.5;
                return (float)n7;
            }
            final int n8;
            n2 = (n8 = (n3 = a3));
            final int n9;
            n5 = (n9 = (n6 = 3));
        }
        if (a == 0) {
            if (n == n4) {
                final double n7 = 0.66666;
                return (float)n7;
            }
            n3 = (n2 = a3);
            n6 = (n5 = 2);
        }
        int n10 = 0;
        Label_0095: {
            if (a == 0) {
                if (n2 == n5) {
                    final double n7 = 1.0;
                    return (float)n7;
                }
                n10 = (n3 = a3);
                if (a != 0) {
                    break Label_0095;
                }
                n6 = 1;
            }
            if (n3 == n6) {
                final double n7 = 2.0;
                return (float)n7;
            }
            n10 = a3;
        }
        final double n7 = (n10 == 0) ? 0.5 : 1.0;
        return (float)n7;
    }
    
    @Override
    public void a() {
        final int a = com.sun.jna.z.a.f.a.a.a.g.c;
        h h = this;
        if (a == 0) {
            if (!this.d.compareAndSet(false, true)) {
                return;
            }
            h = this;
        }
        h.h();
        final Map<b, s> a2 = new HashMap<b, s>();
        while (true) {
            for (final c a3 : com.sun.jna.z.a.i.d.a.a.values()) {
                s a4 = a2.get(a3.i());
                final n n;
                final s s = (s)(n = a4);
                if (a == 0) {
                    if (s == null) {
                        String a5 = a3.i().name().toLowerCase();
                        a5 = Character.toUpperCase(a5.charAt(0)) + a5.substring(1);
                        a4 = new s(this, a5, null);
                        a4.a(this.c());
                        a4.a(new e(1, 0));
                        a4.c(true);
                        a4.h(false);
                        a4.f(true);
                        a4.e(false);
                        final String a21 = a4.a();
                        if (a == 0) {
                            final String[] a6 = com.sun.jna.z.a.f.a.a.a.h.r;
                            if (!a21.equals(a6[9])) {
                                this.a(a4);
                            }
                            a2.put(a3.i(), a4);
                        }
                    }
                    final c a7 = a3;
                    final com.sun.jna.z.a.f.a.a.a.a.g a8 = new t(this, a7);
                    a8.a(a7.k());
                    a8.a(new l(this, a7));
                    final Color a9 = new Color(0, 255, 255, 255);
                    a8.b(a7.toString());
                    a4.a(a8, com.sun.jna.z.a.f.a.a.a.c.a.FILL);
                    final k[] k = a7.k();
                    Label_0475: {
                        if (a == 0) {
                            if (k == null) {
                                break Label_0475;
                            }
                            a7.k();
                        }
                        final k[] a10 = k;
                        final int a11 = a10.length;
                        int a12 = 0;
                        while (true) {
                            while (a12 < a11) {
                                final k a13 = a10[a12];
                                a8.k().a(a13, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
                                a8.k().c(a13);
                                ++a12;
                                if (a != 0) {
                                    a8.b(a8.b() + " ");
                                    break Label_0475;
                                }
                                if (a != 0) {
                                    break;
                                }
                            }
                            a8.b(true);
                            a8.a(false);
                            continue;
                        }
                    }
                    if (a != 0) {
                        break;
                    }
                    continue;
                }
                else {
                    n.d(130);
                    this.b();
                    final Minecraft a14 = Minecraft.func_71410_x();
                    final Dimension a15 = this.l();
                    int a16 = a15.width + 10;
                    int a17 = 5;
                    final int field_74335_Z;
                    int a18 = field_74335_Z = a14.field_71474_y.field_74335_Z;
                    if (a == 0 && field_74335_Z == 0) {
                        a18 = 1000;
                        goto Label_0557;
                    }
                    int a19 = field_74335_Z;
                    while (a19 < a18) {
                        final int n2 = a14.field_71443_c / (a19 + 1);
                        final int n3 = 320;
                        if (a == 0) {
                            if (n2 < n3) {
                                break;
                            }
                            final int n4 = a14.field_71440_d / (a19 + 1);
                        }
                        if (n2 < n3) {
                            break;
                        }
                        ++a19;
                        if (a != 0) {
                            break;
                        }
                    }
                    final n[] b = this.b();
                    final int a11 = b.length;
                    int a12 = 0;
                    while (true) {
                        while (a12 < a11) {
                            final n a20 = b[a12];
                            Label_0777: {
                                if (a == 0) {
                                    final n n5 = a20;
                                    if (a != 0) {
                                        n5.d(100);
                                        return;
                                    }
                                    final String a22 = n5.a();
                                    final String[] a6 = com.sun.jna.z.a.f.a.a.a.h.r;
                                    Label_0774: {
                                        if (a22 != a6[0]) {
                                            final n n6 = a20;
                                            if (a == 0) {
                                                if (n6.a() == a6[6]) {
                                                    break Label_0774;
                                                }
                                                a20.b(a16);
                                            }
                                            n6.c(a17);
                                            a16 += a20.f() + 10;
                                            a16 += a15.width + 10;
                                            if (a != 0) {
                                                break Label_0777;
                                            }
                                            if (a16 + a15.width + 5 > a14.field_71443_c / a19) {
                                                a16 = a15.width + 10;
                                                a17 += a15.height + 5;
                                            }
                                        }
                                    }
                                    ++a12;
                                }
                            }
                            if (a != 0) {
                                break;
                            }
                        }
                        this.i.b(5);
                        this.i.c(40);
                        this.i.f(false);
                        this.p.b(5);
                        this.p.c(5);
                        final n o = this.o;
                        continue;
                    }
                }
            }
            this.g();
            this.k();
            this.c();
            this.j();
            n n = this.n;
            continue;
        }
    }
    
    private void c() {
        final com.sun.jna.z.a.f.a.a.a.e.e a = this.c();
        this.i.a(a);
        this.i.h(false);
        final int c = com.sun.jna.z.a.f.a.a.a.g.c;
        final n[] a2 = this.b();
        final int a3 = c;
        final int a4 = a2.length;
        int a5 = 0;
        while (a5 < a4) {
            final n a6 = a2[a5];
            final com.sun.jna.z.a.f.a.a.a.a.g a7 = new u(this, a6);
            a7.a(new m(this, a6));
            a7.d(a6.p());
            this.i.a(a7, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
            ++a5;
            if (a3 != 0) {
                return;
            }
            if (a3 != 0) {
                break;
            }
        }
        this.i.d();
        this.i.c(true);
        this.i.f(true);
        this.i.e(false);
        this.a(this.i);
    }
    
    private void g() {
        final com.sun.jna.z.a.f.a.a.a.e.e a = this.c();
        final String[] a2 = com.sun.jna.z.a.f.a.a.a.h.r;
        final n a3 = new a(a2[10]);
        a3.a(a);
        a3.h(false);
        a3.a(this.j, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
        a3.a(this.k, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
        a3.a(this.l, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
        a3.a(this.m, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
        final com.sun.jna.z.a.f.a.a.a.a.g a4 = new com.sun.jna.z.a.f.a.a.a.a.a.c(a2[3]);
        a4.a(new com.sun.jna.z.a.f.a.a.a.n(this, a4));
        a4.a(this.c());
        a3.a(a4, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
        this.k.e(true);
        this.j.e(true);
        a3.d();
        a3.c(true);
        a3.f(true);
        a3.e(false);
        this.a(a3);
    }
    
    private void h() {
        final com.sun.jna.z.a.f.a.a.a.e.e a = this.c();
        this.n.a(a);
        this.n.h(false);
        final Dimension a2 = a.a(this.n).b(this.n);
        this.n.d(a2.width);
        this.n.e(a2.height);
        this.n.d();
        this.n.c(true);
        this.n.g(false);
        this.n.f(false);
        this.n.e(false);
        this.n.b(false);
        this.a.add(this.n);
    }
    
    private void i() {
        final com.sun.jna.z.a.f.a.a.a.e.e a = this.c();
        this.o.a(a);
        this.o.h(false);
        final Dimension a2 = a.a(this.o).b(this.o);
        this.o.d(a2.width);
        this.o.e(a2.height);
        this.o.d();
        this.o.c(true);
        this.o.g(false);
        this.o.e(true);
        this.o.b(false);
        this.a.add(this.o);
    }
    
    public void j() {
        final com.sun.jna.z.a.f.a.a.a.e.a.i a = (com.sun.jna.z.a.f.a.a.a.e.a.i)this.c();
        this.p.a(a);
        this.p.h(false);
        final Dimension a2 = a.a(this.p).b(this.p);
        this.p.d(a2.width);
        this.p.e(a2.height);
        this.p.d();
        this.p.c(true);
        final int c = com.sun.jna.z.a.f.a.a.a.g.c;
        this.p.g(false);
        this.p.e(true);
        this.p.b(true);
        int a3 = c;
        this.a(this.p);
        if (com.sun.jna.z.a.j.g) {
            com.sun.jna.z.a.f.a.a.a.g.c = ++a3;
        }
    }
    
    private void k() {
        final com.sun.jna.z.a.f.a.a.a.e.e a = this.c();
        final n a2 = new a(com.sun.jna.z.a.f.a.a.a.h.r[4]);
        a2.a(a);
        a2.h(false);
        final com.sun.jna.z.a.f.a.a.a.k a3 = new com.sun.jna.z.a.f.a.a.a.k();
        a2.a(a3.a, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
        a2.a(a3.b, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
        a2.a(a3.c, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
        a2.a(a3.d, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
        a2.a(a3.e, new com.sun.jna.z.a.f.a.a.a.c.d[0]);
        a2.c(50);
        final Dimension a4 = a.a(a2).b(a2);
        a2.d();
        a2.c(true);
        a2.f(true);
        this.a(a2);
    }
    
    @Override
    protected void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/sun/jna/z/a/f/a/a/a/h.c:()Lcom/sun/jna/z/a/f/a/a/a/e/e;
        //     4: astore_2        /* a */
        //     5: aload_0         /* a */
        //     6: invokevirtual   com/sun/jna/z/a/f/a/a/a/h.b:()[Lcom/sun/jna/z/a/f/a/a/a/a/n;
        //     9: astore_3        /* a */
        //    10: new             Lcom/sun/jna/z/a/f/a/a/a/a/a/c;
        //    13: dup            
        //    14: getstatic       com/sun/jna/z/a/f/a/a/a/h.r:[Ljava/lang/String;
        //    17: astore          a
        //    19: aload           a
        //    21: iconst_5       
        //    22: aaload         
        //    23: invokespecial   com/sun/jna/z/a/f/a/a/a/a/a/c.<init>:(Ljava/lang/String;)V
        //    26: astore          a
        //    28: new             Lcom/sun/jna/z/a/f/a/a/a/a/a/c;
        //    31: dup            
        //    32: aload           a
        //    34: bipush          8
        //    36: aaload         
        //    37: invokespecial   com/sun/jna/z/a/f/a/a/a/a/a/c.<init>:(Ljava/lang/String;)V
        //    40: astore          a
        //    42: aload_2         /* a */
        //    43: aload           a
        //    45: invokeinterface com/sun/jna/z/a/f/a/a/a/e/e.a:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //    50: aload           a
        //    52: invokeinterface com/sun/jna/z/a/f/a/a/a/e/d.b:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Ljava/awt/Dimension;
        //    57: astore          a
        //    59: aload_2         /* a */
        //    60: aload           a
        //    62: invokeinterface com/sun/jna/z/a/f/a/a/a/e/e.a:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Lcom/sun/jna/z/a/f/a/a/a/e/d;
        //    67: aload           a
        //    69: invokeinterface com/sun/jna/z/a/f/a/a/a/e/d.b:(Lcom/sun/jna/z/a/f/a/a/a/a/k;)Ljava/awt/Dimension;
        //    74: astore          7
        //    76: getstatic       com/sun/jna/z/a/f/a/a/a/g.c:I
        //    79: istore_1        /* a */
        //    80: aload           a
        //    82: getfield        java/awt/Dimension.width:I
        //    85: aload           a
        //    87: getfield        java/awt/Dimension.width:I
        //    90: invokestatic    java/lang/Math.max:(II)I
        //    93: istore          a
        //    95: aload           a
        //    97: getfield        java/awt/Dimension.height:I
        //   100: aload           a
        //   102: getfield        java/awt/Dimension.height:I
        //   105: invokestatic    java/lang/Math.max:(II)I
        //   108: istore          a
        //   110: aload_3         /* a */
        //   111: astore          a
        //   113: aload           a
        //   115: arraylength    
        //   116: istore          a
        //   118: iconst_0       
        //   119: istore          a
        //   121: iload           a
        //   123: iload           a
        //   125: if_icmpge       242
        //   128: aload           a
        //   130: iload           a
        //   132: aaload         
        //   133: astore          a
        //   135: iload_1         /* a */
        //   136: ifne            247
        //   139: iload_1         /* a */
        //   140: ifne            238
        //   143: aload           a
        //   145: instanceof      Lcom/sun/jna/z/a/f/a/a/a/s;
        //   148: ifeq            235
        //   151: aload           a
        //   153: invokeinterface com/sun/jna/z/a/f/a/a/a/a/n.b:()[Lcom/sun/jna/z/a/f/a/a/a/a/k;
        //   158: astore          a
        //   160: aload           a
        //   162: arraylength    
        //   163: istore          a
        //   165: iconst_0       
        //   166: istore          a
        //   168: iload           a
        //   170: iload           a
        //   172: if_icmpge       235
        //   175: aload           a
        //   177: iload           a
        //   179: aaload         
        //   180: astore          a
        //   182: iload_1         /* a */
        //   183: ifne            231
        //   186: aload           a
        //   188: instanceof      Lcom/sun/jna/z/a/f/a/a/a/a/g;
        //   191: iload_1         /* a */
        //   192: ifne            123
        //   195: ifeq            228
        //   198: aload           a
        //   200: iload_1         /* a */
        //   201: ifne            221
        //   204: instanceof      Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //   207: ifne            228
        //   210: aload           a
        //   212: iload           a
        //   214: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.d:(I)V
        //   219: aload           a
        //   221: iload           a
        //   223: invokeinterface com/sun/jna/z/a/f/a/a/a/a/k.e:(I)V
        //   228: iinc            a, 1
        //   231: iload_1         /* a */
        //   232: ifeq            168
        //   235: iinc            a, 1
        //   238: iload_1         /* a */
        //   239: ifeq            121
        //   242: aload_0         /* a */
        //   243: invokespecial   com/sun/jna/z/a/f/a/a/a/h.l:()Ljava/awt/Dimension;
        //   246: pop            
        //   247: return         
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
    
    private Dimension l() {
        final n[] a = this.b();
        final int a2 = com.sun.jna.z.a.f.a.a.a.g.c;
        n[] a3 = a;
        int a4 = a3.length;
        int a5 = 0;
        while (true) {
            while (a5 < a4) {
                n a6 = a3[a5];
                final Dimension a7 = a6.a().a(a6).b(a6);
                final int a8 = Math.max(a8, a6.f());
                a6.e(a7.height);
                final boolean d;
                int max;
                final boolean b = (max = ((d = a6.d()) ? 1 : 0)) != 0;
                int a10 = 0;
                if (a2 != 0) {
                    a5 = (d ? 1 : 0);
                    while (a5 < a4) {
                        a6 = a3[a5];
                        if (a2 == 0) {
                            final String a15 = a6.a();
                            final String[] a9 = com.sun.jna.z.a.f.a.a.a.h.r;
                            Label_0289: {
                                if (!a15.equalsIgnoreCase(a9[11])) {
                                    final n n = a6;
                                    if (a2 == 0) {
                                        if (n.a().equalsIgnoreCase(a9[12]) && a2 == 0) {
                                            break Label_0289;
                                        }
                                        a6.d(85);
                                    }
                                    n.d();
                                }
                            }
                            ++a5;
                        }
                        if (a2 != 0) {
                            break;
                        }
                    }
                    return new Dimension(85, a10);
                }
                Label_0191: {
                    Label_0188: {
                        if (a2 == 0) {
                            if (b) {
                                final Rectangle[] a11 = a6.a().a(a6).e(a6);
                                final int a12 = a11.length;
                                int a13 = 0;
                                while (a13 < a12) {
                                    final Rectangle a14 = a11[a13];
                                    a10 = Math.max(a10, a14.height);
                                    ++a13;
                                    if (a2 != 0) {
                                        break Label_0191;
                                    }
                                    if (a2 != 0) {
                                        break;
                                    }
                                }
                                if (a2 == 0) {
                                    break Label_0188;
                                }
                            }
                            max = Math.max(a10, a7.height);
                        }
                        a10 = max;
                    }
                    ++a5;
                }
                if (a2 != 0) {
                    break;
                }
            }
            a3 = a;
            a4 = a3.length;
            boolean d = false;
            continue;
        }
    }
    
    static {
        final String[] r2 = new String[14];
        int n = 0;
        String s;
        int n2 = (s = "\u0014¶¦\u0007\u0003¯®a\u00dd\u00c5\u008a\u0005\u0007¦®u\u00cb\r\u0000º¡{\u0098\u00c4\u009c'·¦v\u00df\u00c4\u0004\u001a\u00ad©w\u0006\u0016\u00ad®z\u00d4\u00d2\b\u0007¦·l\u0098\u00f0\u008c:\u0004\u001e¬\u00adk\u0007\u0017ª¼y\u00da\u00db\u009c\u0004\u001d¬¡}\u0006\u0005¢£m\u00dd\u00c4\b\u0010¬¢u\u00d9\u00d9\u009d ").length();
        int n3 = 3;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                ++n4;
                final String s2 = s;
                final int n5 = n4;
                String s3 = s2.substring(n5, n5 + n3);
                int n6 = -1;
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    int length;
                    int n8;
                    final int n7 = n8 = (length = charArray.length);
                    int n9 = 0;
                    while (true) {
                        Label_0249: {
                            if (n7 > 1) {
                                break Label_0249;
                            }
                            length = (n8 = n9);
                            do {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = 'S';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u00c3';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '\u00cf';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\u0018';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '¸';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '·';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u00f9';
                                        break;
                                    }
                                }
                                charArray[length] = (char)(c ^ c2);
                                ++n9;
                            } while (n7 == 0);
                        }
                        if (n7 > n9) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n6) {
                        default: {
                            r2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0022;
                            }
                            n2 = (s = "\u0007¦·l\u0098\u00e5\u00987¢½\u000f\u001c\u00ad£a\u0098\u00e4\u008e<±«7\u00f9\u00cf\u009c ").length();
                            n3 = 10;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            r2[n++] = intern;
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
        r = r2;
        h.e = new Color(0, 240, 152);
        h.f = new Color(90, 90, 90, 70);
    }
}
