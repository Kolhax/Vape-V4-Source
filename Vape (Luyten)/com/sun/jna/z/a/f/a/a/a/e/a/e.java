package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.e.*;
import org.lwjgl.opengl.*;
import com.sun.jna.z.a.f.a.a.a.a.*;
import com.sun.jna.z.a.f.a.a.a.f.*;
import java.awt.*;

public class e extends b<o>
{
    private final i e;
    final Color f;
    
    e(final i a) {
        super(o.class);
        this.f = Color.lightGray;
        this.e = a;
        this.b = Color.WHITE;
        this.c = new Color(128, 128, 128, 128);
    }
    
    protected void a(final o a) {
        GL11.glPushMatrix();
        final int f = i.f;
        this.a(a, false);
        int a2 = 0;
        int a3 = 0;
        final int a4 = f;
        final int n = j.a[a.a().ordinal()];
        Label_0129: {
            Label_0094: {
                if (a4 == 0) {
                    switch (n) {
                        case 1: {
                            final int n2 = a2 + (a.f() / 2 - this.e.a().func_78256_a(a.b()) / 2);
                            break;
                        }
                        case 2: {
                            break Label_0094;
                        }
                    }
                }
                a2 = n;
                if (a4 == 0) {
                    break Label_0129;
                }
            }
            a2 += a.f() - this.e.a().func_78256_a(a.b()) - 2;
            if (a4 == 0) {
                break Label_0129;
            }
            a2 += 2;
        }
        final int n3 = j.a[a.b().ordinal()];
        Label_0233: {
            if (a4 == 0) {
                Label_0179: {
                    switch (n3) {
                        case 3: {
                            a3 += 2;
                            if (a4 != 0) {
                                break Label_0179;
                            }
                            break Label_0233;
                        }
                        case 4: {
                            a3 += a.g() - this.e.a().field_78288_b - 2;
                            if (a4 != 0) {
                                break;
                            }
                            break Label_0233;
                        }
                    }
                }
                final int n4 = a3 + (a.g() / 2 - this.e.a().field_78288_b / 2);
            }
            a3 = n3;
        }
        this.e.c().func_78276_b(a.b(), a2, a3, a.b(this.f));
        this.a(a, true);
        GL11.glPopMatrix();
    }
    
    protected Dimension b(final o a) {
        return new Dimension(this.e.a().func_78256_a(a.b()) + 4, this.e.a().field_78288_b + 4);
    }
}
