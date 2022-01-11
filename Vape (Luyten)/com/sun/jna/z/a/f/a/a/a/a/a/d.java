package com.sun.jna.z.a.f.a.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.*;

public class d extends c implements i
{
    private boolean r;
    
    public d() {
        this.r = false;
    }
    
    public d(final String a) {
        this.r = false;
        this.l = a;
    }
    
    public d(final String a, final boolean a) {
        this.r = false;
        this.l = a;
        this.r = a;
    }
    
    @Override
    public void a(final int a) {
        final int a2 = c.q ? 1 : 0;
        final boolean r = this.r;
        if (a2 == 0 && r) {}
        this.r = r;
        super.a(a);
    }
    
    @Override
    public boolean a() {
        return this.r;
    }
    
    @Override
    public void e(final boolean a) {
        this.r = a;
        final com.sun.jna.z.a.f.a.a.a.d.c[] a2 = this.b();
        final int q = c.q ? 1 : 0;
        final int a3 = a2.length;
        final int a4 = q;
        int a5 = 0;
        while (a5 < a3) {
            final com.sun.jna.z.a.f.a.a.a.d.c a6 = a2[a5];
            Label_0074: {
                Label_0071: {
                    try {
                        if (a4 != 0) {
                            break Label_0074;
                        }
                        if (!(a6 instanceof com.sun.jna.z.a.f.a.a.a.d.d)) {
                            break Label_0071;
                        }
                    }
                    catch (Exception ex) {
                        throw ex;
                    }
                    try {
                        ((com.sun.jna.z.a.f.a.a.a.d.d)a6).a(this);
                    }
                    catch (Exception a7) {
                        a7.printStackTrace();
                    }
                }
                ++a5;
            }
            if (a4 != 0) {
                break;
            }
        }
    }
    
    @Override
    public void a(final com.sun.jna.z.a.f.a.a.a.d.d a) {
        this.a(a);
    }
    
    @Override
    public void b(final com.sun.jna.z.a.f.a.a.a.d.d a) {
        this.b(a);
    }
}
