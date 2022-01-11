package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.a.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

class w extends g
{
    final com.sun.jna.z.a.f.a.a.a.k o;
    private static final String p;
    
    w(final com.sun.jna.z.a.f.a.a.a.k a, final String a) {
        this.o = a;
        super(a);
    }
    
    @Override
    public void c() {
        final Entity a = Minecraft.func_71410_x().func_175606_aa();
        final EnumFacing a2 = a.func_174811_aO();
        this.b(String.format(w.p, a2).toUpperCase());
    }
    
    static {
        final char[] charArray = ".?".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0122: {
                if (n > 1) {
                    break Label_0122;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c2 = '\u000b';
                            break;
                        }
                        case 1: {
                            c2 = 'L';
                            break;
                        }
                        case 2: {
                            c2 = '*';
                            break;
                        }
                        case 3: {
                            c2 = '^';
                            break;
                        }
                        case 4: {
                            c2 = '\b';
                            break;
                        }
                        case 5: {
                            c2 = '\u00f4';
                            break;
                        }
                        default: {
                            c2 = '\u00ea';
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
