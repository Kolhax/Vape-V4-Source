package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.f.a.a.a.d.*;
import com.sun.jna.z.a.e.*;
import org.lwjgl.input.*;
import com.sun.jna.z.a.f.a.a.a.c.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

class l implements a
{
    Thread a;
    final com.sun.jna.z.a.e.c b;
    final h c;
    
    l(final h a, final com.sun.jna.z.a.e.c b) {
        this.c = a;
        this.b = b;
        this.a = new Thread();
    }
    
    @Override
    public void a(final g a, final int a) {
        final int a2 = com.sun.jna.z.a.f.a.a.a.g.c;
        int n = a;
        int c = a;
        int n2 = a;
        int n3 = a;
        Label_0036: {
            if (a2 == 0) {
                if (a == 0) {
                    final int n4 = n3 = (n2 = (c = (n = (Keyboard.isKeyDown(42) ? 1 : 0))));
                    if (a2 != 0) {
                        break Label_0036;
                    }
                    if (n4 == 0) {
                        this.b.d();
                        if (a2 == 0) {
                            return;
                        }
                    }
                }
                n = a;
                c = a;
                n2 = a;
                n3 = a;
            }
        }
        Label_0110: {
            if (a2 == 0) {
                if (n3 == 0) {
                    final int n5 = n2 = (c = (n = (Keyboard.isKeyDown(42) ? 1 : 0)));
                    if (a2 != 0) {
                        break Label_0110;
                    }
                    if (n5 != 0) {
                        final Thread a7 = this.a;
                        Label_0093: {
                            if (a2 == 0) {
                                if (a7.isAlive()) {
                                    break Label_0093;
                                }
                                this.a = new A(this, a);
                                final Thread a8 = this.a;
                            }
                            a7.start();
                            if (a2 == 0) {
                                return;
                            }
                        }
                        new B(this, a).start();
                        if (a2 == 0) {
                            return;
                        }
                    }
                }
                n = a;
                c = a;
                n2 = a;
            }
        }
        if (a2 == 0) {
            if (n2 != 1) {
                return;
            }
            n = (c = (a.c() ? 1 : 0));
        }
        g g = null;
        Label_0219: {
            if (a2 == 0) {
                if (c == 0) {
                    return;
                }
                g = a;
                if (a2 != 0) {
                    break Label_0219;
                }
                n = (a.b() ? 1 : 0);
            }
            if (n != 0) {
                a.a(false);
                final k[] a3 = this.b.k();
                final int a4 = a3.length;
                int a5 = 0;
                while (a5 < a4) {
                    final k a6 = a3[a5];
                    a.k().c(a6);
                    this.c.b();
                    ++a5;
                    if (a2 != 0) {
                        return;
                    }
                    if (a2 != 0) {
                        break;
                    }
                }
                if (a2 == 0) {
                    return;
                }
            }
            g = a;
        }
        g.a(true);
        final k[] a3 = this.b.k();
        final int a4 = a3.length;
        int a5 = 0;
        while (a5 < a4) {
            final k a6 = a3[a5];
            a.k().a(a, a6, com.sun.jna.z.a.f.a.a.a.c.a.CENTER);
            a6.k().d();
            this.c.b();
            ++a5;
            if (a2 != 0) {
                break;
            }
        }
    }
}
