package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.a.*;
import com.sun.jna.z.a.g.*;
import com.sun.jna.z.a.f.a.a.a.e.a.*;
import net.minecraft.client.*;
import com.sun.jna.z.a.e.*;
import org.lwjgl.opengl.*;
import java.awt.*;
import com.sun.jna.z.a.*;
import java.util.*;

class r extends a
{
    h u;
    final com.sun.jna.z.a.f.a.a.a.h v;
    private static final String w;
    
    r(final com.sun.jna.z.a.f.a.a.a.h a, final String a) {
        this.v = a;
        super(a);
    }
    
    @Override
    public void c() {
        final int c = com.sun.jna.z.a.f.a.a.a.g.c;
        final i a = (i)this.a();
        final int a2 = c;
        final Minecraft a3 = Minecraft.func_71410_x();
        final int n = this.d() * 2;
        if (a2 == 0 && n <= a3.field_71443_c / 2) {}
        final boolean a4 = n != 0;
        int a5 = 18;
        while (true) {
            for (final c a6 : com.sun.jna.z.a.i.d.a.a.values()) {
                final r r = this;
                if (a2 != 0) {
                    r.c(true);
                    return;
                }
                final boolean b = this.b();
                Label_0265: {
                    final c c2;
                    Label_0122: {
                        if (a2 == 0) {
                            if (!b && a2 == 0) {
                                break;
                            }
                            c2 = a6;
                            if (a2 != 0) {
                                break Label_0122;
                            }
                            c2.c();
                        }
                        if (!b) {
                            break Label_0265;
                        }
                    }
                    final b i = c2.i();
                    a6.i();
                    if (i != com.sun.jna.z.a.e.b.None) {
                        final float a7 = com.sun.jna.z.a.f.a.a.a.h.a();
                        GL11.glPushMatrix();
                        GL11.glScalef(a7, a7, a7);
                        if (this.u == null) {
                            final Font a8 = new Font(com.sun.jna.z.a.f.a.a.a.r.w, 0, 22);
                            this.u = new h(a8, 22.0f);
                        }
                        final com.sun.jna.z.a.f.a.a.a.b.a a9 = a.a();
                        final String a10 = a6.a();
                        final int n2 = a4 ? 1 : 0;
                        float a11 = 0.0f;
                        Label_0242: {
                            if (a2 == 0) {
                                if (n2 != 0) {
                                    a11 = this.d() + this.f() - a.a().func_78256_a(a6.a()) - 2;
                                    break Label_0242;
                                }
                                this.d();
                            }
                            a11 = n2;
                        }
                        a9.func_175063_a(a10, a11, this.e() + a5, a6.j());
                        GL11.glPopMatrix();
                        a5 += 10;
                    }
                }
                if (a2 != 0) {
                    break;
                }
            }
            if (Minecraft.func_71410_x().field_71462_r != com.sun.jna.z.a.j.e.d()) {
                this.c(false);
                if (a2 == 0) {
                    return;
                }
            }
            final r r = this;
            continue;
        }
    }
    
    static {
        final char[] charArray = "\u0084³\u00d0^Uin".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0123: {
                if (n > 1) {
                    break Label_0123;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c2 = '\u00c7';
                            break;
                        }
                        case 1: {
                            c2 = '\u00d2';
                            break;
                        }
                        case 2: {
                            c2 = '¼';
                            break;
                        }
                        case 3: {
                            c2 = '7';
                            break;
                        }
                        case 4: {
                            c2 = '7';
                            break;
                        }
                        case 5: {
                            c2 = '\u001b';
                            break;
                        }
                        default: {
                            c2 = '\u0007';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                w = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
