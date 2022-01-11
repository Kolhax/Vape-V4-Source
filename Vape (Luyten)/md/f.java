package md;

import com.sun.jna.z.a.e.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.entity.*;
import net.minecraft.entity.*;
import java.util.*;
import com.sun.jna.z.a.*;

public class f extends c
{
    public static boolean n;
    public static int o;
    public static boolean p;
    public static boolean q;
    public static boolean r;
    public static int s;
    public static boolean t;
    public static boolean u;
    public static int v;
    public static int w;
    public static boolean x;
    public static int y;
    public static boolean z;
    public static int A;
    public static boolean B;
    public static boolean C;
    public static int D;
    public static boolean E;
    public static boolean F;
    public static boolean G;
    private static final String H;
    
    public f() {
        super(f.H, com.sun.jna.z.a.e.b.Render, -12274966);
    }
    
    @Override
    public void b(final float a) {
        GL11.glPushMatrix();
        final int g = f.G ? 1 : 0;
        GL11.glDisable(2896);
        final int a2 = g;
        GL11.glDisable(2929);
        this.b().field_71460_t.func_175072_h();
        while (true) {
            for (final Object a3 : this.b().field_71441_e.field_72996_f) {
                Object o2;
                final Object o = o2 = a3;
                Label_0173: {
                    if (a2 == 0) {
                        final int n = (o instanceof EntityOtherPlayerMP) ? 1 : 0;
                        if (a2 != 0) {
                            GL11.glEnable(n);
                            GL11.glPopMatrix();
                            if (f.n) {
                                f.G = (a2 == 0);
                            }
                            return;
                        }
                        if (n == 0) {
                            break Label_0173;
                        }
                        final Object o3;
                        o2 = (o3 = a3);
                    }
                    if (a2 == 0) {
                        if (o == this.b().field_71439_g) {
                            break Label_0173;
                        }
                        o2 = a3;
                    }
                    final EntityOtherPlayerMP a4 = (EntityOtherPlayerMP)o2;
                    final boolean d = this.d((Entity)a4);
                    f f = null;
                    EntityOtherPlayerMP a6 = null;
                    Label_0162: {
                        if (a2 == 0) {
                            if (d) {
                                this.a((Entity)a4, 0.0f, 1.0f, 0.0f, 1.2f, a);
                                if (a2 == 0) {
                                    break Label_0173;
                                }
                            }
                            f = this;
                            final EntityOtherPlayerMP a5 = a6 = a4;
                            if (a2 != 0) {
                                break Label_0162;
                            }
                            this.c((Entity)a5);
                        }
                        if (d) {
                            this.a((Entity)a4, 0.0f, 0.0f, 1.0f, 1.2f, a);
                            if (a2 == 0) {
                                break Label_0173;
                            }
                        }
                        f = this;
                        a6 = a4;
                    }
                    f.a((Entity)a6, 0.27f, 0.7f, 0.92f, 1.0f, a);
                }
                if (a2 != 0) {
                    break;
                }
            }
            GL11.glColor3d(1.0, 1.0, 1.0);
            this.b().field_71460_t.func_180436_i();
            continue;
        }
    }
    
    void a(final Entity a, final float a, final float a, final float a, final float a, final float a) {
        final double a2 = a.field_70142_S + (a.field_70165_t - a.field_70142_S) * a - com.sun.jna.z.a.i.d.i.a();
        final double a3 = a.field_70137_T + (a.field_70163_u - a.field_70137_T) * a - com.sun.jna.z.a.i.d.i.b();
        final double a4 = a.field_70136_U + (a.field_70161_v - a.field_70136_U) * a - com.sun.jna.z.a.i.d.i.c();
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(a, a, a, 1.0f);
        GL11.glDisable(2896);
        final int g = f.G ? 1 : 0;
        GL11.glEnable(2848);
        GL11.glLineWidth(a);
        GL11.glDisable(3553);
        GL11.glBegin(1);
        GL11.glVertex3d(0.0, (double)this.c().func_70047_e(), 0.0);
        GL11.glVertex3d(a2, a3 + a.func_70047_e(), a4);
        GL11.glEnd();
        GL11.glDisable(3042);
        final int a5 = g;
        GL11.glEnable(3553);
        GL11.glDisable(2848);
        GL11.glEnable(2896);
        if (a5 != 0) {
            f.n = !f.n;
        }
    }
    
    static {
        final char[] charArray = ":\u00d0d\u0000\n\u00f1L".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0121: {
                if (n > 1) {
                    break Label_0121;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c2 = 'n';
                            break;
                        }
                        case 1: {
                            c2 = '¢';
                            break;
                        }
                        case 2: {
                            c2 = '\u0005';
                            break;
                        }
                        case 3: {
                            c2 = 'c';
                            break;
                        }
                        case 4: {
                            c2 = 'o';
                            break;
                        }
                        case 5: {
                            c2 = '\u0083';
                            break;
                        }
                        default: {
                            c2 = '?';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                H = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
