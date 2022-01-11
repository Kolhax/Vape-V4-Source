package com.sun.jna.z.a.f.a.a.a.c;

import com.sun.jna.z.a.*;
import java.awt.*;

public class c implements g
{
    @Override
    public void a(final Rectangle a, final Rectangle[] a, final d[][] a) {
        int a2 = 0;
        final int c = e.c ? 1 : 0;
        final int a3 = a.length;
        int a4 = 0;
        final int a5 = c;
        while (a4 < a3) {
            final Rectangle a6 = a[a4];
            Rectangle rectangle2 = null;
            Label_0067: {
                Label_0047: {
                    Rectangle rectangle;
                    try {
                        rectangle = (rectangle2 = a6);
                        if (a5 != 0) {
                            break Label_0067;
                        }
                        if (rectangle == null) {
                            break Label_0047;
                        }
                        break Label_0047;
                    }
                    catch (NullPointerException ex) {
                        throw ex;
                    }
                    try {
                        if (rectangle == null) {
                            throw new NullPointerException();
                        }
                    }
                    catch (NullPointerException ex2) {
                        throw ex2;
                    }
                }
                a6.x = a.x;
                rectangle2 = a6;
            }
            rectangle2.y = a.y + a2;
            a2 += a6.height;
            ++a4;
            if (a5 != 0) {
                break;
            }
        }
        boolean c2 = false;
        Label_0116: {
            Label_0110: {
                try {
                    if (!j.g) {
                        return;
                    }
                    final int n = a5;
                    if (n != 0) {
                        break Label_0110;
                    }
                    break Label_0110;
                }
                catch (NullPointerException ex3) {
                    throw ex3;
                }
                try {
                    final int n = a5;
                    if (n != 0) {
                        c2 = false;
                        break Label_0116;
                    }
                }
                catch (NullPointerException ex4) {
                    throw ex4;
                }
            }
            c2 = true;
        }
        e.c = c2;
    }
    
    @Override
    public Dimension a(final Rectangle[] a, final d[][] a) {
        final int a2 = e.c ? 1 : 0;
        int a3 = 0;
        final int a4 = a.length;
        int a5 = 0;
        int a7 = 0;
        while (a5 < a4) {
            final Rectangle a6 = a[a5];
            Label_0082: {
                Label_0048: {
                    try {
                        if (a2 != 0) {
                            break Label_0082;
                        }
                        final Rectangle rectangle = a6;
                        if (rectangle == null) {
                            break Label_0048;
                        }
                        break Label_0048;
                    }
                    catch (NullPointerException ex) {
                        throw ex;
                    }
                    try {
                        final Rectangle rectangle = a6;
                        if (rectangle == null) {
                            throw new NullPointerException();
                        }
                    }
                    catch (NullPointerException ex2) {
                        throw ex2;
                    }
                }
                a3 += a6.height;
                a7 = Math.max(a7, a6.width);
                ++a5;
            }
            if (a2 != 0) {
                boolean g = false;
                Label_0098: {
                    try {
                        if (j.g) {
                            g = false;
                            break Label_0098;
                        }
                    }
                    catch (NullPointerException ex3) {
                        throw ex3;
                    }
                    g = true;
                }
                j.g = g;
                break;
            }
        }
        return new Dimension(a7, a3);
    }
}
