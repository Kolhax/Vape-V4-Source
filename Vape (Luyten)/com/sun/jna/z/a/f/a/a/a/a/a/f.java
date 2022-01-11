package com.sun.jna.z.a.f.a.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.d.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class f extends d implements j
{
    private String[] l;
    private int m;
    private boolean n;
    
    public f() {
        this.l = new String[0];
    }
    
    public f(final String... a) {
        this.l = a;
    }
    
    @Override
    public String[] a() {
        return this.l;
    }
    
    @Override
    public void a(final String... a) {
        this.m = 0;
        this.l = a;
    }
    
    @Override
    public int b() {
        return this.m;
    }
    
    @Override
    public void a(final int a) {
        final int q = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
        this.m = a;
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
                        if (!(a6 instanceof b)) {
                            break Label_0071;
                        }
                    }
                    catch (Exception ex) {
                        throw ex;
                    }
                    try {
                        ((b)a6).a(this);
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
    public String c() {
        return this.l[this.m];
    }
    
    @Override
    public boolean a() {
        return this.n;
    }
    
    @Override
    public void e(final boolean a) {
        this.n = a;
        final int a2 = com.sun.jna.z.a.f.a.a.a.a.a.c.q ? 1 : 0;
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
    public void a(final b a) {
        this.a(a);
    }
    
    @Override
    public void b(final b a) {
        this.b(a);
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
