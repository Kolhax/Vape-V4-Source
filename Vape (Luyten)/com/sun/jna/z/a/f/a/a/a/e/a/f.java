package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.e.*;
import com.sun.jna.z.a.f.a.a.a.a.*;
import org.lwjgl.opengl.*;
import com.sun.jna.z.a.f.a.a.a.f.*;
import java.awt.*;
import com.sun.jna.z.a.f.a.a.a.c.*;

public class f extends b<p>
{
    private final i e;
    
    f(final i a) {
        super(p.class);
        this.e = a;
        this.b = Color.WHITE;
        this.c = new Color(128, 128, 128, 128);
    }
    
    protected void a(final p a) {
        final int a2 = i.f;
        p p = a;
        if (a2 == 0) {
            if (a.k() != null) {
                return;
            }
            p = a;
        }
        final Rectangle a3 = p.j();
        this.a(a, false);
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glDisable(2884);
        GL11.glBlendFunc(770, 771);
        a.a(a.l());
        GL11.glBegin(7);
        GL11.glVertex2d(0.0, 0.0);
        GL11.glVertex2d((double)a3.width, 0.0);
        GL11.glVertex2d((double)a3.width, (double)a3.height);
        GL11.glVertex2d(0.0, (double)a3.height);
        GL11.glEnd();
        GL11.glEnable(2884);
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        this.a(a, true);
    }
    
    protected Dimension b(final p a) {
        final int f = i.f;
        final k[] a2 = a.b();
        final Rectangle[] a3 = new Rectangle[a2.length];
        final int a4 = f;
        final com.sun.jna.z.a.f.a.a.a.c.d[][] a5 = new com.sun.jna.z.a.f.a.a.a.c.d[a2.length][];
        int a6 = 0;
        Dimension b = null;
        while (a6 < a2.length) {
            final k a7 = a2[a6];
            b = a7.a().a(a7).b(a7);
            if (a4 != 0) {
                return b;
            }
            final Dimension a8 = b;
            a3[a6] = new Rectangle(0, 0, a8.width, a8.height);
            a5[a6] = a.a(a7);
            ++a6;
            if (a4 != 0) {
                break;
            }
        }
        a.a().a(a3, a5);
        return b;
    }
}
