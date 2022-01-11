package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.a.*;
import net.minecraft.client.*;
import net.minecraft.util.*;

class z extends g
{
    final com.sun.jna.z.a.f.a.a.a.k o;
    private static final String p;
    
    z(final com.sun.jna.z.a.f.a.a.a.k a, final String a) {
        this.o = a;
        super(a);
    }
    
    @Override
    public void c() {
        final int a = MathHelper.func_76128_c(Minecraft.func_71410_x().field_71439_g.field_70161_v);
        this.b(z.p + String.valueOf(a));
    }
    
    static {
        final char[] charArray = "\u00e9\u00cdl".toCharArray();
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
                            c2 = '³';
                            break;
                        }
                        case 1: {
                            c2 = '\u00f7';
                            break;
                        }
                        case 2: {
                            c2 = 'L';
                            break;
                        }
                        case 3: {
                            c2 = '\u00fa';
                            break;
                        }
                        case 4: {
                            c2 = 'L';
                            break;
                        }
                        case 5: {
                            c2 = 'K';
                            break;
                        }
                        default: {
                            c2 = 'm';
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
