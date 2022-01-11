package md;

import com.sun.jna.z.a.e.*;
import com.sun.jna.z.a.f.a.a.a.a.a.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class a extends c
{
    public t n;
    public i o;
    public static boolean p;
    public static int q;
    public static boolean r;
    public static boolean s;
    public static boolean t;
    public static int u;
    public static boolean v;
    public static boolean w;
    public static int x;
    public static int y;
    public static boolean z;
    public static int A;
    public static boolean B;
    public static int C;
    public static boolean D;
    public static boolean E;
    public static int F;
    public static boolean G;
    public static boolean H;
    public static boolean I;
    private static final String[] J;
    
    public a() {
        final int i = a.I ? 1 : 0;
        final String[] a = md.a.J;
        super(a[0], com.sun.jna.z.a.e.b.Combat, -16711936);
        final int a2 = i;
        this.n = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[2], 4.5, 3.0, 6.0, 0.01, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL);
        this.o = new d(a[1]);
        if (a2 != 0) {
            md.a.p = !md.a.p;
        }
    }
    
    @Override
    public k[] k() {
        final int a = md.a.I ? 1 : 0;
        final k[] array = { this.o, this.n };
        if (md.a.p) {
            md.a.I = (a == 0);
        }
        return array;
    }
    
    static {
        final String[] j = new String[3];
        int n = 0;
        final String s;
        final int length = (s = "+º\n\u00c1¬\n:°\u0006\u00c0«\u00d1\u00d2\u0016»\u000e\u0005+¾\u0005\u00c5¡").length();
        int char1 = 5;
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
                                    c2 = 'y';
                                    break;
                                }
                                case 1: {
                                    c2 = '\u00df';
                                    break;
                                }
                                case 2: {
                                    c2 = 'k';
                                    break;
                                }
                                case 3: {
                                    c2 = '¢';
                                    break;
                                }
                                case 4: {
                                    c2 = '\u00c4';
                                    break;
                                }
                                case 5: {
                                    c2 = '\u00f1';
                                    break;
                                }
                                default: {
                                    c2 = '¿';
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
                j[n++] = new String(charArray).intern();
            } while ((n2 += char1) < length);
        }
        J = j;
    }
}
