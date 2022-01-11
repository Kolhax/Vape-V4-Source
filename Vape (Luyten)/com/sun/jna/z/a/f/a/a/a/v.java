package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.a.*;
import net.minecraft.client.*;

class v extends g
{
    final com.sun.jna.z.a.f.a.a.a.k o;
    private static final String p;
    
    v(final com.sun.jna.z.a.f.a.a.a.k a, final String a) {
        this.o = a;
        super(a);
    }
    
    @Override
    public void c() {
        this.b(Minecraft.func_71410_x().field_71426_K.split(" ")[0].toUpperCase() + v.p);
    }
    
    static {
        final char[] charArray = "\u0094¡\nr".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0124: {
                if (n > 1) {
                    break Label_0124;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c2 = '´';
                            break;
                        }
                        case 1: {
                            c2 = '\u00e7';
                            break;
                        }
                        case 2: {
                            c2 = 'Z';
                            break;
                        }
                        case 3: {
                            c2 = '!';
                            break;
                        }
                        case 4: {
                            c2 = '\u00e6';
                            break;
                        }
                        case 5: {
                            c2 = '\u009d';
                            break;
                        }
                        default: {
                            c2 = 'S';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                p = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
