package com.sun.jna.z.a.f.a.a.a.a.a;

import java.awt.*;
import org.lwjgl.input.*;
import com.sun.jna.z.a.f.a.a.a.a.*;
import com.sun.jna.z.a.f.a.a.a.e.*;

public class a extends e implements n
{
    private String n;
    private Point o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    
    @Override
    public void b() {
        final int a = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        final boolean a3 = this.a();
        a a4 = null;
        Label_0104: {
            if (a == 0) {
                Label_0067: {
                    if (a3) {
                        if (Mouse.isButtonDown(0)) {
                            final Point a2 = com.sun.jna.z.a.f.a.a.a.f.a.b();
                            this.b(a2.x - this.o.x);
                            this.c(a2.y - this.o.y);
                            if (a == 0) {
                                break Label_0067;
                            }
                        }
                        this.a(false);
                    }
                }
                a4 = this;
                if (a != 0) {
                    break Label_0104;
                }
                final boolean r = this.r;
            }
            if (a3) {
                final com.sun.jna.z.a.f.a.a.a.e.d d = this.d;
                if (a == 0) {
                    if (d == null) {
                        return;
                    }
                    final com.sun.jna.z.a.f.a.a.a.e.d d2 = this.d;
                }
                d.a((k)this);
                if (a == 0) {
                    return;
                }
            }
            a4 = this;
        }
        a4.b();
    }
    
    public a() {
        this("");
    }
    
    public a(final String a) {
        this.q = true;
        this.s = true;
        this.t = true;
        this.c(false);
        this.n = a;
    }
    
    @Override
    public String a() {
        return this.n;
    }
    
    @Override
    public void a(final String a) {
        this.n = a;
    }
    
    @Override
    public boolean a() {
        return this.o != null;
    }
    
    @Override
    public void a(final boolean a) {
        final int a2 = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        if (a) {
            final Point a3 = a.b();
            this.o = new Point(a3.x - this.d(), a3.y - this.e());
            if (a2 == 0) {
                return;
            }
        }
        this.o = null;
    }
    
    @Override
    public boolean b() {
        return this.p;
    }
    
    @Override
    public void b(boolean a) {
        final int a2 = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        a a3 = this;
        if (a2 == 0) {
            if (!this.q) {
                a = false;
            }
            a3 = this;
        }
        a3.p = a;
    }
    
    @Override
    public boolean c() {
        return this.q;
    }
    
    @Override
    public void e(final boolean a) {
        final int a2 = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        if (a2 == 0) {
            if (!a) {
                this.p = false;
            }
            this.q = a;
        }
    }
    
    @Override
    public boolean d() {
        return this.r;
    }
    
    @Override
    public void f(final boolean a) {
        this.r = a;
    }
    
    @Override
    public boolean e() {
        return this.s;
    }
    
    @Override
    public void g(final boolean a) {
        final int a2 = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        if (a2 == 0) {
            if (!a) {
                this.r = true;
            }
            this.s = a;
        }
    }
    
    @Override
    public void f() {
        final int a = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        a a2 = this;
        if (a == 0) {
            if (!this.t) {
                return;
            }
            a2 = this;
        }
        a2.c(false);
    }
    
    @Override
    public boolean g() {
        return this.t;
    }
    
    @Override
    public void h(final boolean a) {
        this.t = a;
    }
}
