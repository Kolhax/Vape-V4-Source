package com.sun.jna.z.a.f.a.a.a.c;

import java.awt.*;

public class e implements g
{
    private int a;
    private int b;
    public static boolean c;
    
    public e(final int a, final int a) {
        this.a = a;
        this.b = a;
    }
    
    @Override
    public void a(final Rectangle a, final Rectangle[] a, final d[][] a) {
        final int a2 = e.c ? 1 : 0;
        int n2;
        int b;
        final int n = b = (n2 = a.length);
        if (a2 == 0) {
            if (n == 0) {
                return;
            }
            final int n3;
            b = (n3 = (n2 = this.a));
        }
        int a4 = 0;
        int a5 = 0;
        Label_0178: {
            if (a2 == 0) {
                if (n == 0) {
                    final int b2 = this.b;
                    if (a2 == 0) {
                        if (b2 == 0) {
                            final double a3 = Math.sqrt(a.length);
                            a4 = (int)a3;
                            a5 = (int)a3;
                            if (a3 - (int)a3 > 0.0) {
                                ++a4;
                            }
                            if (a2 == 0) {
                                break Label_0178;
                            }
                        }
                        final int n4 = a.length / this.b;
                    }
                    a5 = b2;
                    final int n5 = a.length % this.b;
                    if (a2 == 0) {
                        if (n5 > 0) {
                            ++a5;
                        }
                        final int b3 = this.b;
                    }
                    a4 = n5;
                    if (a2 == 0) {
                        break Label_0178;
                    }
                }
                n2 = (b = this.b);
            }
            if (a2 == 0) {
                if (b == 0) {
                    a4 = a.length / this.a;
                    final int n6 = a.length % this.a;
                    if (a2 == 0) {
                        if (n6 > 0) {
                            ++a4;
                        }
                        final int a18 = this.a;
                    }
                    a5 = n6;
                    if (a2 == 0) {
                        break Label_0178;
                    }
                }
                n2 = this.a;
            }
            a5 = n2;
            a4 = this.b;
        }
        final double a3 = a.width / a5;
        final double a6 = a.height / a4;
        int a7 = 0;
    Label_0645:
        do {
            int i = 0;
            int length = 0;
        Label_0207:
            while (i < length) {
                int a8 = 0;
            Label_0362_Outer:
                while (a8 < a5) {
                    final int a9 = i = a7 * a5 + a8;
                    length = a.length;
                    if (a2 != 0) {
                        continue Label_0207;
                    }
                    if (i < length || a2 != 0) {
                        final Rectangle a10 = a[a9];
                        final d[] a11 = a[a9];
                        a a12 = a.LEFT;
                        b a13 = com.sun.jna.z.a.f.a.a.a.c.b.CENTER;
                        final d[] a14 = a11;
                        final int a15 = a14.length;
                        int a16 = 0;
                        while (true) {
                            while (a16 < a15) {
                                final d a17 = a14[a16];
                                int n9;
                                final int n8;
                                final int n7 = n8 = (n9 = ((a17 instanceof a) ? 1 : 0));
                                if (a2 == 0) {
                                    Label_0345: {
                                        final d d;
                                        Label_0340: {
                                            if (a2 == 0) {
                                                if (n7 != 0) {
                                                    a12 = (a)a17;
                                                    if (a2 == 0) {
                                                        break Label_0345;
                                                    }
                                                }
                                                d = a17;
                                                if (a2 != 0) {
                                                    break Label_0340;
                                                }
                                                final boolean b4 = d instanceof b;
                                            }
                                            if (n7 == 0) {
                                                break Label_0345;
                                            }
                                        }
                                        a13 = (b)d;
                                    }
                                    ++a16;
                                    if (a2 != 0) {
                                        break;
                                    }
                                    continue Label_0362_Outer;
                                }
                                else {
                                    if (a2 == 0) {
                                        Label_0459: {
                                            switch (n8) {
                                                case 1: {
                                                    a10.width = (int)a3;
                                                }
                                                case 2: {
                                                    a10.x = (int)(a.x + a8 * a3);
                                                    if (a2 != 0) {
                                                        break Label_0459;
                                                    }
                                                    break;
                                                }
                                                case 3: {
                                                    a10.x = (int)(a.x + (a8 + 1) * a3 - a10.width);
                                                    if (a2 != 0) {
                                                        break Label_0459;
                                                    }
                                                    break;
                                                }
                                                case 4: {
                                                    a10.x = (int)(a.x + a8 * a3 + a3 / 2.0 - a10.width / 2);
                                                    break;
                                                }
                                            }
                                        }
                                        n9 = f.b[a13.ordinal()];
                                    }
                                    Label_0595: {
                                        switch (n9) {
                                            case 1: {
                                                a10.height = (int)a6;
                                            }
                                            case 2: {
                                                a10.y = (int)(a.y + a7 * a6);
                                                if (a2 != 0) {
                                                    break Label_0595;
                                                }
                                                break;
                                            }
                                            case 3: {
                                                a10.y = (int)(a.y + (a7 + 1) * a6 - a10.height);
                                                if (a2 != 0) {
                                                    break Label_0595;
                                                }
                                                break;
                                            }
                                            case 4: {
                                                a10.y = (int)(a.y + a7 * a6 + a6 / 2.0 - a10.height / 2);
                                                break;
                                            }
                                        }
                                    }
                                    ++a8;
                                    if (a2 != 0) {
                                        break Label_0362_Outer;
                                    }
                                    continue Label_0362_Outer;
                                }
                            }
                            int n8;
                            int n9 = n8 = f.a[a12.ordinal()];
                            continue;
                        }
                    }
                    break Label_0645;
                }
                ++a7;
            }
            break;
        } while (a2 == 0);
    }
    
    @Override
    public Dimension a(final Rectangle[] a, final d[][] a) {
        final int a2 = e.c ? 1 : 0;
        int n2;
        int b;
        final int n = b = (n2 = a.length);
        if (a2 == 0) {
            if (n == 0) {
                return new Dimension(0, 0);
            }
            final int n3;
            b = (n3 = (n2 = this.a));
        }
        int a4 = 0;
        int a5 = 0;
        Label_0177: {
            if (a2 == 0) {
                if (n == 0) {
                    final int b2 = this.b;
                    if (a2 == 0) {
                        if (b2 == 0) {
                            final double a3 = Math.sqrt(a.length);
                            a4 = (int)a3;
                            a5 = (int)a3;
                            if (a3 - (int)a3 > 0.0) {
                                ++a4;
                            }
                            if (a2 == 0) {
                                break Label_0177;
                            }
                        }
                        final int n4 = a.length / this.b;
                    }
                    a5 = b2;
                    final int n5 = a.length % this.b;
                    if (a2 == 0) {
                        if (n5 > 0) {
                            ++a5;
                        }
                        final int b3 = this.b;
                    }
                    a4 = n5;
                    if (a2 == 0) {
                        break Label_0177;
                    }
                }
                n2 = (b = this.b);
            }
            if (a2 == 0) {
                if (b == 0) {
                    a4 = a.length / this.a;
                    final int n6 = a.length % this.a;
                    if (a2 == 0) {
                        if (n6 > 0) {
                            ++a4;
                        }
                        final int a11 = this.a;
                    }
                    a5 = n6;
                    if (a2 == 0) {
                        break Label_0177;
                    }
                }
                n2 = this.a;
            }
            a5 = n2;
            a4 = this.b;
        }
        int a6 = 0;
        int a7 = 0;
        final int a8 = a.length;
        int a9 = 0;
        while (a9 < a8) {
            final Rectangle a10 = a[a9];
            a6 = Math.max(a6, a10.width);
            a7 = Math.max(a7, a10.height);
            ++a9;
            if (a2 != 0) {
                break;
            }
        }
        return new Dimension(a6 * a5, a7 * a4);
    }
    
    public int a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
    
    public void a(final int a) {
        this.a = a;
    }
    
    public void b(final int a) {
        this.b = a;
    }
}
