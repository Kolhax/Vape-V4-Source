package com.sun.jna.z.a.f.a.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.*;
import com.sun.jna.z.a.*;

public class h extends d implements q
{
    private double l;
    private double m;
    private double n;
    private double o;
    private b p;
    private boolean q;
    
    public h() {
        this(0.0);
    }
    
    public h(final double a) {
        this(a, 0.0, 100.0);
    }
    
    public h(final double a, final double a, final double a) {
        this(a, a, a, 1);
    }
    
    public h(final double a, final double a, final double a, final int a) {
        this(a, a, a, a, com.sun.jna.z.a.f.a.a.a.a.b.NONE);
    }
    
    public h(double a, final double a, final double a, final double a, final b a) {
        final int q = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        this.m = Math.max(0.0, Math.min(a, a));
        final int a2 = q;
        this.n = Math.max(0.0, Math.max(a, a));
        a = Math.max(a, Math.min(a, a));
        this.l = a - Math.round(a % a / a) * a;
        this.o = Math.min(a, Math.max(5.0E-4, a));
        b none = a;
        if (a2 == 0) {
            if (a != null) {
                none = a;
            }
            else {
                none = com.sun.jna.z.a.f.a.a.a.a.b.NONE;
            }
        }
        this.p = none;
        if (com.sun.jna.z.a.j.g) {
            com.sun.jna.z.a.f.a.a.a.a.a.c.q = (a2 == 0);
        }
    }
    
    @Override
    public double a() {
        return this.l;
    }
    
    @Override
    public double c() {
        return this.m;
    }
    
    @Override
    public double d() {
        return this.n;
    }
    
    @Override
    public double e() {
        return this.o;
    }
    
    @Override
    public b f() {
        return this.p;
    }
    
    @Override
    public boolean a() {
        return this.q;
    }
    
    @Override
    public void a(double a) {
        a = Math.max(this.m, Math.min(this.n, a));
        this.l = a - Math.round(a % this.o / this.o) * this.o;
    }
    
    @Override
    public void b(final double a) {
        this.m = Math.max(0.0, Math.min(this.n, a));
        this.a(this.l);
    }
    
    @Override
    public void c(final double a) {
        this.n = Math.max(a, this.m);
        this.a(this.l);
    }
    
    @Override
    public void d(final double a) {
        this.o = Math.min(this.n, Math.max(5.0E-4, a));
        this.a(this.l);
    }
    
    @Override
    public void a(final b a) {
        final int a2 = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        b none = a;
        if (a2 == 0) {
            if (a != null) {
                none = a;
            }
            else {
                none = com.sun.jna.z.a.f.a.a.a.a.b.NONE;
            }
        }
        this.p = none;
    }
    
    @Override
    public void a(final boolean a) {
        this.q = a;
    }
    
    @Override
    public double b() {
        return Math.floor(this.l);
    }
}
