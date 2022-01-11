package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.e.*;
import com.sun.jna.z.a.f.a.a.a.a.*;
import org.lwjgl.opengl.*;
import com.sun.jna.z.a.f.a.a.a.f.*;
import java.text.*;
import net.minecraft.client.gui.*;
import java.awt.*;
import org.lwjgl.input.*;

public class h extends b<t>
{
    private i e;
    final Color f;
    private static final String[] g;
    
    public h(final i a) {
        super(t.class);
        this.f = Color.lightGray;
        this.e = a;
        this.c = new Color(128, 128, 128, 192);
    }
    
    public h() {
        super(t.class);
        this.f = Color.lightGray;
    }
    
    protected void a(final t a) {
        final int f = i.f;
        this.a(a, false);
        GL11.glEnable(3042);
        final int a2 = f;
        GL11.glDisable(2884);
        GL11.glDisable(3553);
        final Rectangle a3 = a.j();
        double a4 = (a.a() - a.c()) / (a.d() - a.c());
        final double n = dcmpg(a4, 0.0);
        if (a2 == 0 && n < 0) {
            a4 = 0.0;
            goto Label_0078;
        }
        final int a5 = (int)n;
        a.a(com.sun.jna.z.a.f.a.a.a.h.e);
        GL11.glBegin(7);
        GL11.glVertex2d(0.0, (double)a5);
        GL11.glVertex2d(a3.width * a4, (double)a5);
        GL11.glVertex2d(a3.width * a4, (double)(a3.height + a5));
        GL11.glVertex2d(0.0, (double)(a3.height + a5));
        GL11.glEnd();
        final FontRenderer a6 = this.e.c();
        a6.func_78276_b(a.b(), 1, -4, -1);
        String a7 = null;
        String[] a8 = h.g;
        final DecimalFormat a9 = new DecimalFormat(a8[2]);
        final DecimalFormat a10 = new DecimalFormat(a8[1]);
        switch (l.a[a.f().ordinal()]) {
            case 1: {
                a7 = a9.format(a.a());
                break;
            }
            case 2: {
                a7 = a10.format(a.a());
                break;
            }
            case 3: {
                a8 = h.g;
                a7 = String.format(a8[0], Math.round(a.a()));
                break;
            }
            case 4: {
                final int a11 = (int)Math.round((a.a() - a.c()) / (a.d() - a.c()) * 100.0);
                a7 = String.format(h.g[3], a11);
                break;
            }
        }
        final String s = a7;
        Label_0456: {
            if (a2 == 0) {
                if (s == null) {
                    break Label_0456;
                }
                a.a();
            }
            final String s2;
            final String a12 = s2 = s;
            Label_0430: {
                if (a2 == 0) {
                    if (s2 == null) {
                        break Label_0430;
                    }
                    a12.trim();
                }
                final boolean empty = s2.isEmpty();
                if (a2 != 0) {
                    break Label_0456;
                }
                if (!empty) {
                    a7 = a7.concat(" ").concat(a12);
                }
            }
            a6.func_78276_b(a7, a.f() - a6.func_78256_a(a7) - 4, -4, -1);
        }
        GL11.glEnable(3553);
        GL11.glEnable(2884);
        GL11.glDisable(3042);
        this.a(a, true);
    }
    
    protected Dimension b(final t a) {
        return new Dimension(75, 6);
    }
    
    protected Rectangle[] c(final t a) {
        return new Rectangle[] { new Rectangle(-2, 4, a.f() + 2, a.g()) };
    }
    
    protected void a(final t a, final Point a, final int a) {
        final int a2 = i.f;
        int n4;
        int buttonDown;
        int n3;
        int n2;
        final int n = n2 = (n3 = (buttonDown = (n4 = (this.c(a)[0].contains(a) ? 1 : 0))));
        if (a2 == 0) {
            if (n == 0) {
                return;
            }
            n4 = a;
            buttonDown = a;
            n3 = a;
            n2 = a;
        }
        if (a2 == 0) {
            if (n2 != 0) {
                return;
            }
            buttonDown = (n3 = (n4 = (Mouse.isButtonDown(a) ? 1 : 0)));
        }
        Label_0075: {
            if (a2 == 0) {
                if (n3 != 0) {
                    final int n5 = buttonDown = (n4 = (a.b() ? 1 : 0));
                    if (a2 != 0) {
                        break Label_0075;
                    }
                    if (n5 == 0) {
                        a.a(true);
                        if (a2 == 0) {
                            return;
                        }
                    }
                }
                n4 = (buttonDown = (Mouse.isButtonDown(a) ? 1 : 0));
            }
        }
        t t = null;
        Label_0098: {
            if (a2 == 0) {
                if (buttonDown != 0) {
                    return;
                }
                t = a;
                if (a2 != 0) {
                    break Label_0098;
                }
                n4 = (a.b() ? 1 : 0);
            }
            if (n4 == 0) {
                return;
            }
            t = a;
        }
        t.a(false);
    }
    
    protected void d(final t a) {
        final int a2 = i.f;
        final boolean b = a.b();
        if (a2 == 0) {
            if (!b) {
                return;
            }
            Mouse.isButtonDown(0);
        }
        if (!b) {
            a.a(false);
            return;
        }
        final Point a3 = a.b();
        final com.sun.jna.z.a.f.a.a.a.a.l a4 = a.k();
        if (a4 != null) {
            a3.translate(-a4.d(), -a4.e());
        }
        final double a5 = (a3.x - 4) / a.f();
        final double a6 = a.c() + a5 * (a.d() - a.c());
        a.a(a6);
    }
    
    static {
        final String[] g2 = new String[4];
        int n = 0;
        String s;
        int n2 = (s = "\u0093³+\u0004\u0086±l/").length();
        int n3 = 3;
        int n4 = -1;
    Label_0021:
        while (true) {
            while (true) {
                ++n4;
                final String s2 = s;
                final int n5 = n4;
                String s3 = s2.substring(n5, n5 + n3);
                int n6 = -1;
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    int length;
                    int n8;
                    final int n7 = n8 = (length = charArray.length);
                    int n9 = 0;
                    while (true) {
                        Label_0244: {
                            if (n7 > 1) {
                                break Label_0244;
                            }
                            length = (n8 = n9);
                            do {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = '¶';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u009f';
                                        break;
                                    }
                                    case 2: {
                                        c2 = 'O';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\f';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '\u009c';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '(';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u0087';
                                        break;
                                    }
                                }
                                charArray[length] = (char)(c ^ c2);
                                ++n9;
                            } while (n7 == 0);
                        }
                        if (n7 > n9) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n6) {
                        default: {
                            g2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0021;
                            }
                            n2 = (s = "\u0086±l\u0004\u0093\u00fbj)").length();
                            n3 = 3;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            g2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0021;
                        }
                    }
                    ++n4;
                    final String s4 = s;
                    final int n10 = n4;
                    s3 = s4.substring(n10, n10 + n3);
                    n6 = 0;
                }
            }
            break;
        }
        g = g2;
    }
}
