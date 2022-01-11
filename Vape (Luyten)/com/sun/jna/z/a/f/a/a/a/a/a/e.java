package com.sun.jna.z.a.f.a.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.d.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class e extends c implements r
{
    private boolean r;
    
    public e() {
        this.r = false;
    }
    
    public e(final String a) {
        this.r = false;
        this.l = a;
    }
    
    @Override
    public void a(final int a) {
        final int q = c.q ? 1 : 0;
        this.r = true;
        final g[] a2 = this.a().a();
        final int a3 = a2.length;
        int a4 = 0;
        final int a5 = q;
        while (true) {
            while (a4 < a3) {
                final g a6 = a2[a4];
                if (a5 == 0) {
                    final e e = this;
                    if (a5 != 0) {
                        e.a(a);
                        return;
                    }
                    if (!this.equals(a6)) {
                        final g g = a6;
                        if (a5 != 0 || (g instanceof r || a5 != 0)) {
                            ((r)g).e(false);
                        }
                    }
                    ++a4;
                }
                if (a5 != 0) {
                    break;
                }
            }
            final e e = this;
            continue;
        }
    }
    
    @Override
    public boolean a() {
        return this.r;
    }
    
    @Override
    public void e(final boolean a) {
        final int q = c.q ? 1 : 0;
        this.r = a;
        final int a2 = q;
        final com.sun.jna.z.a.f.a.a.a.d.c[] a3 = this.b();
        final int a4 = a3.length;
        int a5 = 0;
        while (a5 < a4) {
            final com.sun.jna.z.a.f.a.a.a.d.c a6 = a3[a5];
            Label_0074: {
                Label_0071: {
                    try {
                        if (a2 != 0) {
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
            if (a2 != 0) {
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
