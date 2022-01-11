package md;

import com.sun.jna.z.a.e.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.potion.*;

public class k extends c
{
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
    private static final String I;
    
    public k() {
        super(k.I, com.sun.jna.z.a.e.b.Render, -256);
    }
    
    @Override
    public void a(final TickEvent$PlayerTickEvent a) {
        final int h = k.H ? 1 : 0;
        this.a.field_71439_g.func_70690_d(new PotionEffect(16, 5200, 0));
        final int a2 = h;
        if (a2 != 0) {
            k.o = !k.o;
        }
    }
    
    @Override
    public void f() {
        this.a.field_71439_g.func_82170_o(16);
    }
    
    static {
        final char[] charArray = "¢\u00ebn\u0087\u0012\u00ecg\u0083\u00f6v".toCharArray();
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
                            c2 = '\u00e4';
                            break;
                        }
                        case 1: {
                            c2 = '\u009e';
                            break;
                        }
                        case 2: {
                            c2 = '\u0002';
                            break;
                        }
                        case 3: {
                            c2 = '\u00eb';
                            break;
                        }
                        case 4: {
                            c2 = 'p';
                            break;
                        }
                        case 5: {
                            c2 = '\u009e';
                            break;
                        }
                        default: {
                            c2 = '\u000e';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                I = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
