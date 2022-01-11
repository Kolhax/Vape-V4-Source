package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.e.*;
import com.sun.jna.z.a.f.a.a.a.a.*;
import org.lwjgl.opengl.*;
import com.sun.jna.z.a.f.a.a.a.f.*;
import org.lwjgl.input.*;
import java.awt.geom.*;
import java.awt.*;

public class c extends b<j>
{
    private final i e;
    
    c(final i a) {
        super(j.class);
        this.e = a;
        this.b = Color.WHITE;
        this.c = new Color(128, 128, 128, 192);
    }
    
    protected void a(final j a) {
        this.a(a, false);
        final int f = i.f;
        final Rectangle a2 = a.j();
        GL11.glEnable(3042);
        final int a3 = f;
        GL11.glDisable(2884);
        GL11.glDisable(3553);
        int a4 = 0;
        final String[] a18 = a.a();
        final int length = a18.length;
        int i = 0;
        while (true) {
            while (i < length) {
                final String a5 = a18[i];
                final int max = Math.max(a4, this.e.a().func_78256_a(a5));
                if (a3 != 0) {
                    int a6 = max;
                    int n;
                    final boolean b = (n = (a.a() ? 1 : 0)) != 0;
                    Label_0239: {
                        if (a3 == 0) {
                            if (b) {
                                final String[] a7 = a.a();
                                int a8 = 0;
                                while (a8 < a7.length - 1) {
                                    a6 += this.e.a().field_78288_b + 2;
                                    ++a8;
                                    if (a3 != 0) {
                                        break Label_0239;
                                    }
                                    if (a3 != 0) {
                                        break;
                                    }
                                }
                                a6 += 2;
                            }
                            a.a(a.l());
                            GL11.glBegin(7);
                            GL11.glVertex2d(0.0, 0.0);
                            GL11.glVertex2d((double)a2.width, 0.0);
                            n = a2.width;
                        }
                        GL11.glVertex2d((double)n, (double)(a2.height + a6));
                        GL11.glVertex2d(0.0, (double)(a2.height + a6));
                        GL11.glEnd();
                    }
                    final Point2D a9 = a.b();
                    k a10 = a.k();
                    while (true) {
                        while (a10 != null) {
                            a9.setLocation(a9.getX() - a10.d(), a9.getY() - a10.e());
                            a10 = a10.k();
                            if (a3 != 0) {
                                final boolean contains;
                                final boolean b2 = contains = a2.contains(a9);
                                final double n2;
                                Label_0717: {
                                    Label_0706: {
                                        if (a3 == 0) {
                                            if (b2) {
                                                GL11.glBegin(7);
                                                GL11.glVertex2d(0.0, 0.0);
                                                GL11.glVertex2d((double)a2.width, 0.0);
                                                GL11.glVertex2d((double)a2.width, (double)a2.height);
                                                GL11.glVertex2d(0.0, (double)a2.height);
                                                GL11.glEnd();
                                                if (a3 == 0) {
                                                    break Label_0706;
                                                }
                                            }
                                            a.a();
                                        }
                                        if (a3 != 0) {
                                            break Label_0717;
                                        }
                                        if (b2) {
                                            n2 = dcmpl(a9.getX(), (double)a2.x);
                                            if (a3 != 0) {
                                                break Label_0717;
                                            }
                                            if (n2 >= 0) {
                                                final double n3 = dcmpg(a9.getX(), (double)(a2.x + a2.width));
                                                if (a3 != 0) {
                                                    break Label_0717;
                                                }
                                                if (n3 <= 0) {
                                                    int a11 = a.g();
                                                    final String[] a12 = a.a();
                                                    int a13 = 0;
                                                    while (a13 < a12.length) {
                                                        final int field_78288_b;
                                                        final int n4 = field_78288_b = a13;
                                                        final int b3;
                                                        final int n5 = b3 = a.b();
                                                        if (a3 != 0) {
                                                            break Label_0717;
                                                        }
                                                        Label_0699: {
                                                            if (a3 == 0) {
                                                                if (n4 == n5 && a3 == 0) {
                                                                    break Label_0699;
                                                                }
                                                                final int field_78288_b2 = this.e.a().field_78288_b;
                                                            }
                                                            int a14 = n4 + n5;
                                                            int b5;
                                                            int b4;
                                                            final int n6 = b4 = (b5 = a.b());
                                                            double n13 = 0.0;
                                                            Label_0607: {
                                                                Label_0593: {
                                                                    Label_0590: {
                                                                        int n10 = 0;
                                                                        int n9 = 0;
                                                                        Label_0552: {
                                                                            Label_0547: {
                                                                                Label_0541: {
                                                                                    if (a3 == 0) {
                                                                                        if (n6 == 0) {
                                                                                            final int n7 = b4 = (b5 = a13);
                                                                                            final int n8 = n9 = (n10 = 1);
                                                                                            if (a3 != 0) {
                                                                                                break Label_0552;
                                                                                            }
                                                                                            if (n7 == n8) {
                                                                                                break Label_0590;
                                                                                            }
                                                                                            break Label_0541;
                                                                                        }
                                                                                        else {
                                                                                            final int n11;
                                                                                            b4 = (n11 = (b5 = a13));
                                                                                        }
                                                                                    }
                                                                                    if (a3 != 0) {
                                                                                        break Label_0547;
                                                                                    }
                                                                                    if (n6 == 0) {
                                                                                        break Label_0590;
                                                                                    }
                                                                                }
                                                                                b5 = (b4 = a.b());
                                                                            }
                                                                            n10 = (n9 = a12.length - 1);
                                                                        }
                                                                        if (a3 == 0) {
                                                                            if (b4 == n9) {
                                                                                final int n14;
                                                                                final int n12 = (int)(n13 = (n14 = a13));
                                                                                if (a3 != 0) {
                                                                                    break Label_0607;
                                                                                }
                                                                                if (n12 == a12.length - 2) {
                                                                                    break Label_0590;
                                                                                }
                                                                                break Label_0593;
                                                                            }
                                                                            else {
                                                                                final int n14;
                                                                                n13 = (b5 = (n14 = a13));
                                                                                if (a3 != 0) {
                                                                                    break Label_0607;
                                                                                }
                                                                                n10 = a12.length - 1;
                                                                            }
                                                                        }
                                                                        if (b5 != n10) {
                                                                            break Label_0593;
                                                                        }
                                                                    }
                                                                    ++a14;
                                                                }
                                                                n13 = dcmpl(a9.getY(), (double)(a2.y + a11));
                                                            }
                                                            final double n15;
                                                            if (a3 == 0) {
                                                                if (n13 >= 0) {
                                                                    n15 = dcmpg(a9.getY(), (double)(a2.y + a11 + a14));
                                                                    if (a3 == 0) {
                                                                        if (n15 <= 0) {
                                                                            GL11.glBegin(7);
                                                                            GL11.glVertex2d(0.0, (double)a11);
                                                                            GL11.glVertex2d(0.0, (double)(a11 + a14));
                                                                            GL11.glVertex2d((double)a2.width, (double)(a11 + a14));
                                                                            GL11.glVertex2d((double)a2.width, (double)a11);
                                                                            GL11.glEnd();
                                                                            if (a3 == 0) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            a11 = (int)n15;
                                                        }
                                                        ++a13;
                                                        if (a3 != 0) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    int field_78288_b = this.e.a().field_78288_b;
                                }
                                int a11 = (int)n2;
                                GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.3f);
                                GL11.glBegin(4);
                                int a19;
                                final boolean b6 = (a19 = (a.a() ? 1 : 0)) != 0;
                                Label_0907: {
                                    if (a3 == 0) {
                                        if (b6) {
                                            GL11.glVertex2d(a4 + 4 + a11 / 2.0, a11 / 3.0);
                                            GL11.glVertex2d(a4 + 4 + a11 / 3.0, 2.0 * a11 / 3.0);
                                            GL11.glVertex2d(a4 + 4 + 2.0 * a11 / 3.0, 2.0 * a11 / 3.0);
                                            if (a3 == 0) {
                                                break Label_0907;
                                            }
                                        }
                                        GL11.glVertex2d(a4 + 4 + a11 / 3.0, a11 / 3.0);
                                        GL11.glVertex2d(a4 + 4 + 2.0 * a11 / 3.0, a11 / 3.0);
                                        a19 = a4 + 4;
                                    }
                                    GL11.glVertex2d(a19 + a11 / 2.0, 2.0 * a11 / 3.0);
                                }
                                GL11.glEnd();
                                GL11.glLineWidth(1.0f);
                                GL11.glColor4f(0.0f, 0.0f, 0.0f, 1.0f);
                                int a20;
                                final boolean b7 = (a20 = (a.a() ? 1 : 0)) != 0;
                                if (a3 == 0) {
                                    if (b7) {
                                        GL11.glBegin(1);
                                        GL11.glVertex2d(2.0, (double)a2.height);
                                        GL11.glVertex2d((double)(a2.width - 2), (double)a2.height);
                                        GL11.glEnd();
                                    }
                                    GL11.glBegin(1);
                                    GL11.glVertex2d((double)(a4 + 4), 2.0);
                                    GL11.glVertex2d((double)(a4 + 4), (double)(a2.height - 2));
                                    GL11.glEnd();
                                    GL11.glBegin(2);
                                    final boolean a21;
                                    a20 = ((a21 = a.a()) ? 1 : 0);
                                }
                                Label_1179: {
                                    if (a3 == 0) {
                                        if (b7) {
                                            GL11.glVertex2d(a4 + 4 + a11 / 2.0, a11 / 3.0);
                                            GL11.glVertex2d(a4 + 4 + a11 / 3.0, 2.0 * a11 / 3.0);
                                            GL11.glVertex2d(a4 + 4 + 2.0 * a11 / 3.0, 2.0 * a11 / 3.0);
                                            if (a3 == 0) {
                                                break Label_1179;
                                            }
                                        }
                                        GL11.glVertex2d(a4 + 4 + a11 / 3.0, a11 / 3.0);
                                        GL11.glVertex2d(a4 + 4 + 2.0 * a11 / 3.0, a11 / 3.0);
                                        a20 = a4 + 4;
                                    }
                                    GL11.glVertex2d(a20 + a11 / 2.0, 2.0 * a11 / 3.0);
                                }
                                GL11.glEnd();
                                GL11.glEnable(3553);
                                final String a15 = a.c();
                                this.e.a().func_78276_b(a15, 2, a2.height / 2 - this.e.a().field_78288_b / 2, a.b(a.m()));
                                final int a22 = a.a() ? 1 : 0;
                                Label_1362: {
                                    if (a3 == 0) {
                                        if (a22 != 0) {
                                            int a13 = a2.height + 2;
                                            final String[] a16 = a.a();
                                            int a17 = 0;
                                            while (a17 < a16.length) {
                                                final int n17;
                                                final int n16 = n17 = a17;
                                                if (a3 != 0) {
                                                    break Label_1362;
                                                }
                                                final int b8 = a.b();
                                                Label_1346: {
                                                    if (a3 == 0) {
                                                        if (n16 == b8 && a3 == 0) {
                                                            break Label_1346;
                                                        }
                                                        this.e.a().func_78276_b(a16[a17], 2, a13, a.b(a.m()));
                                                        final int n18 = this.e.a().field_78288_b + 2;
                                                    }
                                                    a13 = n16 + b8;
                                                }
                                                ++a17;
                                                if (a3 != 0) {
                                                    break;
                                                }
                                            }
                                        }
                                        GL11.glEnable(2884);
                                    }
                                }
                                GL11.glDisable(a22);
                                this.a(a, true);
                                return;
                            }
                            if (a3 != 0) {
                                break;
                            }
                        }
                        GL11.glColor4f(0.0f, 0.0f, 0.0f, Mouse.isButtonDown(0) ? 0.5f : 0.3f);
                        continue;
                    }
                }
                a4 = max;
                ++i;
                if (a3 != 0) {
                    com.sun.jna.z.a.j.g = !com.sun.jna.z.a.j.g;
                    break;
                }
            }
            continue;
        }
    }
    
    protected Dimension b(final j a) {
        int a2 = 0;
        final int f = i.f;
        final String[] a3 = a.a();
        final int a4 = a3.length;
        int a5 = 0;
        final int a6 = f;
        while (a5 < a4) {
            final String a7 = a3[a5];
            a2 = Math.max(a2, this.e.a().func_78256_a(a7));
            ++a5;
            if (a6 != 0) {
                break;
            }
        }
        return new Dimension(a2 + 8 + this.e.a().field_78288_b, this.e.a().field_78288_b + 4);
    }
    
    protected Rectangle[] c(final j a) {
        a.g();
        final int a2 = i.f;
        final int a6 = a.a() ? 1 : 0;
        int a5 = 0;
        if (a2 == 0 && a6 != 0) {
            final String[] a3 = a.a();
            int a4 = 0;
            while (a4 < a3.length) {
                a5 += this.e.a().field_78288_b + 2;
                ++a4;
                if (a2 != 0) {
                    goto Label_0072;
                }
                if (a2 != 0) {
                    break;
                }
            }
            a5 += 2;
            goto Label_0072;
        }
        final Rectangle[] array = new Rectangle[a6];
        array[0] = new Rectangle(0, 0, a.f(), a5);
        return array;
    }
    
    protected void a(final j a, final Point a, final int a) {
        final int a2 = i.f;
        int x = a;
        if (a2 == 0) {
            if (a != 0) {
                return;
            }
            x = a.x;
        }
        final int f = a.f();
        int x2 = 0;
        int a7 = 0;
        Label_0105: {
            final int y;
            Label_0096: {
                if (a2 == 0) {
                    if (x <= f) {
                        y = a.y;
                        final int g = a.g();
                        if (a2 != 0) {
                            break Label_0096;
                        }
                        if (y <= g) {
                            final boolean a6 = a.a();
                            if (a2 == 0 && a6) {}
                            a.e(a6);
                            if (a2 == 0) {
                                return;
                            }
                        }
                    }
                    final int n;
                    a7 = (n = (x2 = a.x));
                    if (a2 != 0) {
                        break Label_0105;
                    }
                    a.f();
                }
            }
            if (y > f) {
                return;
            }
            x2 = (a7 = (a.a() ? 1 : 0));
        }
        if (a2 == 0) {
            if (a7 == 0) {
                return;
            }
            x2 = a.g() + 2;
        }
        int a3 = x2;
        final String[] a4 = a.a();
        int a5 = 0;
        while (a5 < a4.length) {
            final int n3;
            final int n2 = n3 = a5;
            int b;
            final int n4 = b = a.b();
            Label_0239: {
                if (a2 == 0) {
                    if (n2 == n4 && a2 == 0) {
                        break Label_0239;
                    }
                    final int y2 = a.y;
                }
                final int y3;
                final int n5;
                Label_0236: {
                    if (a2 == 0) {
                        if (n2 >= n4) {
                            y3 = a.y;
                            n5 = a3 + this.e.a().field_78288_b;
                            if (a2 != 0) {
                                break Label_0236;
                            }
                            if (y3 <= n5) {
                                a.a(a5);
                                a.e(false);
                                if (a2 == 0) {
                                    break;
                                }
                            }
                        }
                        b = this.e.a().field_78288_b + 2;
                    }
                }
                a3 = y3 + n5;
            }
            ++a5;
            if (a2 != 0) {
                break;
            }
        }
    }
}
