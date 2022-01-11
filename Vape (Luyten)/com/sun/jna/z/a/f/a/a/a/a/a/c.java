package com.sun.jna.z.a.f.a.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.*;
import com.sun.jna.z.a.f.a.a.a.d.*;

public class c extends d implements g
{
    protected String l;
    protected h m;
    protected boolean n;
    protected boolean o;
    protected k[] p;
    public static boolean q;
    
    public c() {
        this.l = "";
    }
    
    @Override
    public void a(final boolean a) {
        this.n = a;
    }
    
    @Override
    public boolean b() {
        return this.n;
    }
    
    public c(final String a) {
        this.l = "";
        this.l = a;
    }
    
    @Override
    public String b() {
        return this.l;
    }
    
    @Override
    public void b(final String a) {
        this.l = a;
    }
    
    @Override
    public void a(final int a) {
        final int q = c.q ? 1 : 0;
        final com.sun.jna.z.a.f.a.a.a.d.c[] a2 = this.b();
        final int a3 = a2.length;
        final int a4 = q;
        int a5 = 0;
        while (a5 < a3) {
            final com.sun.jna.z.a.f.a.a.a.d.c a6 = a2[a5];
            ((a)a6).a(this, a);
            ++a5;
            if (a4 != 0) {
                break;
            }
        }
    }
    
    @Override
    public void a(final a a) {
        this.a(a);
    }
    
    @Override
    public void b(final a a) {
        this.b(a);
    }
    
    @Override
    public h a() {
        return this.m;
    }
    
    @Override
    public void a(final h a) {
        this.m = a;
    }
    
    @Override
    public boolean c() {
        return this.o;
    }
    
    @Override
    public void b(final boolean a) {
        this.o = a;
    }
    
    @Override
    public k[] d() {
        return this.p;
    }
    
    @Override
    public void a(final k[] a) {
        this.p = a;
    }
}
