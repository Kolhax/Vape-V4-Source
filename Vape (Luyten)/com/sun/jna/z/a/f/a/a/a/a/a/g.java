package com.sun.jna.z.a.f.a.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.*;

public class g extends d implements o
{
    protected String l;
    protected c m;
    protected c n;
    
    public g() {
        this.m = com.sun.jna.z.a.f.a.a.a.a.c.LEFT;
        this.n = com.sun.jna.z.a.f.a.a.a.a.c.CENTER;
    }
    
    public g(final String a) {
        this.m = com.sun.jna.z.a.f.a.a.a.a.c.LEFT;
        this.n = com.sun.jna.z.a.f.a.a.a.a.c.CENTER;
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
    public c a() {
        return this.m;
    }
    
    @Override
    public c b() {
        return this.n;
    }
    
    @Override
    public void a(final c a) {
        this.m = a;
    }
    
    @Override
    public void b(final c a) {
        this.n = a;
    }
}
