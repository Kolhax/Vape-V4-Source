package md;

import com.sun.jna.z.a.e.*;
import com.sun.jna.z.a.f.a.a.a.a.a.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class j extends c
{
    public t n;
    public static boolean o;
    public static int p;
    public static boolean q;
    public static boolean r;
    public static boolean s;
    public static int t;
    public static boolean u;
    public static boolean v;
    public static int w;
    public static int x;
    public static boolean y;
    public static int z;
    public static boolean A;
    public static int B;
    public static boolean C;
    public static boolean D;
    public static int E;
    public static boolean F;
    public static boolean G;
    public static boolean H;
    private static final String[] I;
    
    public j() {
        final String[] a = j.I;
        super(a[0], com.sun.jna.z.a.e.b.Combat, -16711707);
        final int h = j.H ? 1 : 0;
        this.n = new i(a[1], 0.35, 0.0, 1.0, 0.001, com.sun.jna.z.a.f.a.a.a.a.b.DECIMAL2);
        final int a2 = h;
        if (a2 != 0) {
            j.o = !j.o;
        }
    }
    
    @Override
    public k[] k() {
        final int a = j.H ? 1 : 0;
        final k[] array = { this.n };
        if (j.o) {
            j.H = (a == 0);
        }
        return array;
    }
    
    static {
        final String[] i = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "\u00f7\u00f7§4\u008ady\u00cc\u0006\u00fa\u00e6£\u0017\u008bx").length();
        int char1 = 8;
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
                    Label_0188: {
                        if (n4 > 1) {
                            break Label_0188;
                        }
                        length2 = (n5 = n6);
                        do {
                            final char c = charArray[n5];
                            char c2 = '\0';
                            switch (n6 % 7) {
                                case 0: {
                                    c2 = '¿';
                                    break;
                                }
                                case 1: {
                                    c2 = '\u009e';
                                    break;
                                }
                                case 2: {
                                    c2 = '\u00d3';
                                    break;
                                }
                                case 3: {
                                    c2 = 'v';
                                    break;
                                }
                                case 4: {
                                    c2 = '\u00e5';
                                    break;
                                }
                                case 5: {
                                    c2 = '\u001c';
                                    break;
                                }
                                default: {
                                    c2 = '\u001c';
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
                i[n++] = new String(charArray).intern();
            } while ((n2 += char1) < length);
        }
        I = i;
    }
}
