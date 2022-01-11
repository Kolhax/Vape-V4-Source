package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.a.*;
import java.awt.*;

class t extends c
{
    final com.sun.jna.z.a.e.c r;
    final h s;
    
    t(final h a, final com.sun.jna.z.a.e.c r) {
        this.s = a;
        this.r = r;
    }
    
    @Override
    public void c() {
        final int a = g.c;
        this.a(this.r.c() ? com.sun.jna.z.a.f.a.a.a.h.e : com.sun.jna.z.a.f.a.a.a.h.f);
        this.b(this.r.c() ? com.sun.jna.z.a.f.a.a.a.h.e : Color.GRAY);
        t t = this;
        Color a2 = null;
        Label_0078: {
            if (a == 0) {
                if (!this.r.c()) {
                    a2 = com.sun.jna.z.a.f.a.a.a.h.f;
                    break Label_0078;
                }
                t = this;
            }
            a2 = t.s.h;
        }
        this.c(a2);
    }
}
