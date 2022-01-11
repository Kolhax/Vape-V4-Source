package md;

import net.minecraft.entity.player.*;
import com.sun.jna.z.a.e.*;
import net.minecraft.client.settings.*;
import net.minecraft.item.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class n extends c
{
    i n;
    boolean o;
    InventoryPlayer p;
    int q;
    t r;
    public static boolean s;
    public static int t;
    public static boolean u;
    public static boolean v;
    public static boolean w;
    public static int x;
    public static boolean y;
    public static boolean z;
    public static int A;
    public static int B;
    public static boolean C;
    public static int D;
    public static boolean E;
    public static int F;
    public static boolean G;
    public static boolean H;
    public static int I;
    public static boolean J;
    public static boolean K;
    public static boolean L;
    private static final String[] M;
    
    public n() {
        final String[] a = md.n.M;
        super(a[0], com.sun.jna.z.a.e.b.Utility, 0);
        final int l = md.n.L ? 1 : 0;
        this.r = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[1], 100.0, 0.0, 200.0, 1);
        final int a2 = l;
        if (md.n.s) {
            md.n.L = (a2 == 0);
        }
    }
    
    @Override
    public void h() {
        final int a = this.b().field_71474_y.field_74313_G.func_151463_i();
        KeyBinding.func_74510_a(a, true);
        KeyBinding.func_74507_a(a);
        KeyBinding.func_74510_a(a, false);
        try {
            Thread.sleep((long)this.r.a());
        }
        catch (InterruptedException ex) {}
        this.p.field_70461_c = this.q;
    }
    
    @Override
    public void e() {
        this.o = true;
        final int a = md.n.L ? 1 : 0;
        n n = this;
        if (a == 0) {
            if (this.n == null) {
                this.n = new i(this);
            }
            this.p = this.c().field_71071_by;
            n = this;
        }
        n.q = this.p.field_70461_c;
        int a2 = 0;
        while (a2 < 9) {
            final ItemStack a3 = this.p.field_70462_a[a2];
            if (a != 0) {
                return;
            }
            final ItemStack itemStack = a3;
            Label_0142: {
                if (a == 0 && itemStack == null) {
                    if (a != 0) {
                        md.n.s = !md.n.s;
                        goto Label_0102;
                    }
                }
                else {
                    final Item a4 = itemStack.func_77973_b();
                    if (a != 0) {
                        break Label_0142;
                    }
                    if (a4 instanceof ItemEnderPearl) {
                        this.p.field_70461_c = a2;
                        this.n.a();
                        if (a == 0) {
                            break;
                        }
                    }
                }
                ++a2;
            }
            if (a != 0) {
                break;
            }
        }
        this.a(false);
    }
    
    @Override
    public k[] k() {
        return new k[] { this.r };
    }
    
    @Override
    public void g() {
        final int l = md.n.L ? 1 : 0;
        this.o = false;
        final int a = l;
        n n = this;
        if (a == 0) {
            if (this.n != null) {
                this.n.a = null;
            }
            n = this;
        }
        n.n = null;
    }
    
    static {
        final String[] m = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "A\u00e8\u009b©\u001a\u00f0\u00d4c\u00e2\u008d\u0005U\u00e8\u0096º\u000f").length();
        int char1 = 10;
        int n2 = -1;
        Label_0022: {
            break Label_0022;
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
                                    c2 = '\u0011';
                                    break;
                                }
                                case 1: {
                                    c2 = '\u008d';
                                    break;
                                }
                                case 2: {
                                    c2 = '\u00fa';
                                    break;
                                }
                                case 3: {
                                    c2 = '\u00db';
                                    break;
                                }
                                case 4: {
                                    c2 = 'v';
                                    break;
                                }
                                case 5: {
                                    c2 = '¤';
                                    break;
                                }
                                default: {
                                    c2 = '¼';
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
                m[n++] = new String(charArray).intern();
            } while ((n2 += char1) < length);
        }
        M = m;
    }
}
