package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.e.*;
import com.sun.jna.z.a.f.a.a.a.a.*;
import org.lwjgl.opengl.*;
import com.sun.jna.z.a.f.a.a.a.f.*;
import java.awt.*;

public class g extends b<q>
{
    private i e;
    private static final String[] f;
    
    public g(final i a) {
        super(q.class);
        this.e = a;
        this.b = Color.LIGHT_GRAY;
        this.c = new Color(128, 128, 128, 192);
    }
    
    protected void a(final q a) {
        final Rectangle a2 = a.j();
        final int a3 = this.e.a().field_78288_b;
        final com.sun.jna.z.a.f.a.a.a.b.a a4 = this.e.a();
        this.a(a, false);
        GL11.glEnable(3042);
        GL11.glDisable(2884);
        GL11.glDisable(3553);
        a.a(a.l());
        GL11.glLineWidth(0.9f);
        GL11.glBegin(2);
        GL11.glVertex2d(0.0, 0.0);
        GL11.glVertex2d((double)a2.width, 0.0);
        GL11.glVertex2d((double)a2.width, (double)a2.height);
        GL11.glVertex2d(0.0, (double)a2.height);
        GL11.glEnd();
        final double a5 = (a.a() - a.c()) / (a.d() - a.c());
        a.a(a.m());
        GL11.glBegin(7);
        GL11.glVertex2d(0.0, 0.0);
        GL11.glVertex2d(a2.width * a5, 0.0);
        GL11.glVertex2d(a2.width * a5, (double)a2.height);
        GL11.glVertex2d(0.0, (double)a2.height);
        GL11.glEnd();
        GL11.glEnable(3553);
        String a6 = null;
        switch (com.sun.jna.z.a.f.a.a.a.e.a.k.a[a.f().ordinal()]) {
            case 1: {
                final String[] a7 = g.f;
                a6 = String.format(a7[1], a.a());
                break;
            }
            case 2: {
                final String[] a7 = g.f;
                a6 = String.format(a7[0], Math.round(a.a()));
                break;
            }
            case 3: {
                final int a8 = (int)Math.round((a.a() - a.c()) / (a.d() - a.c()) * 100.0);
                a6 = String.format(g.f[2], a8);
                break;
            }
        }
        if (a6 != null) {
            GL11.glBlendFunc(775, 769);
            a4.func_78276_b(a6, a.f() / 2 - a4.func_78256_a(a6) / 2, a.g() / 2 - a3 / 2, a.b(a.m()));
            GL11.glBlendFunc(770, 771);
        }
        GL11.glEnable(2884);
        GL11.glDisable(3042);
        this.a(a, true);
    }
    
    protected Dimension b(final q a) {
        return new Dimension(100, 4 + this.e.a().field_78288_b);
    }
    
    protected Rectangle[] c(final q a) {
        return new Rectangle[0];
    }
    
    static {
        final String[] f2 = new String[3];
        int n = 0;
        final String s;
        final int length = (s = "®M\u00fb\u0005®M±¤½\u0004®\u0005º²").length();
        int char1 = 3;
        int n2 = -1;
        Label_0021: {
            break Label_0021;
            do {
                char1 = s.charAt(n2);
                ++n2;
                final String s2 = s;
                final int n3 = n2;
                final char[] charArray = s2.substring(n3, n3 + char1).toCharArray();
                int length2;
                int n5;
                final int n4 = n5 = (length2 = charArray.length);
                int n6 = 0;
                while (true) {
                    Label_0189: {
                        if (n4 > 1) {
                            break Label_0189;
                        }
                        length2 = (n5 = n6);
                        do {
                            final char c = charArray[n5];
                            char c2 = '\0';
                            switch (n6 % 7) {
                                case 0: {
                                    c2 = '\u008b';
                                    break;
                                }
                                case 1: {
                                    c2 = 'a';
                                    break;
                                }
                                case 2: {
                                    c2 = '\u009f';
                                    break;
                                }
                                case 3: {
                                    c2 = '\u0097';
                                    break;
                                }
                                case 4: {
                                    c2 = '\u00db';
                                    break;
                                }
                                case 5: {
                                    c2 = '\u0096';
                                    break;
                                }
                                default: {
                                    c2 = '=';
                                    break;
                                }
                            }
                            charArray[length2] = (char)(c ^ c2);
                            ++n6;
                        } while (n4 == 0);
                    }
                    if (n4 > n6) {
                        continue;
                    }
                    break;
                }
                f2[n++] = new String(charArray).intern();
            } while ((n2 += char1) < length);
        }
        f = f2;
    }
}
