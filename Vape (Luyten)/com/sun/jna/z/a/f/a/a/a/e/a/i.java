package com.sun.jna.z.a.f.a.a.a.e.a;

import com.sun.jna.z.a.f.a.a.a.b.*;
import com.sun.jna.z.a.g.*;
import com.sun.jna.z.a.f.a.a.a.e.*;
import net.minecraft.client.gui.*;

public class i extends c
{
    private final a b;
    private final a c;
    private final a d;
    private final a e;
    public static int f;
    private static final String g;
    
    public i() {
        this.b = new a(new com.sun.jna.z.a.g.e(i.g, 22.0f));
        this.c = new a(new com.sun.jna.z.a.g.e(i.g, 16.0f));
        this.d = new a(new com.sun.jna.z.a.g.e(i.g, 15.0f));
        this.e = new a(new com.sun.jna.z.a.g.e(i.g, 14.0f));
        this.a(new d(this));
        this.a(new f(this));
        this.a(new com.sun.jna.z.a.f.a.a.a.e.a.e(this));
        this.a(new com.sun.jna.z.a.f.a.a.a.e.a.a(this));
        this.a(new com.sun.jna.z.a.f.a.a.a.e.a.b(this));
        this.a(new com.sun.jna.z.a.f.a.a.a.e.a.c(this));
        this.a(new h(this));
        this.a(new g(this));
    }
    
    public a a() {
        return this.b;
    }
    
    public FontRenderer b() {
        return this.c;
    }
    
    public FontRenderer c() {
        return this.d;
    }
    
    public FontRenderer d() {
        return this.e;
    }
    
    static {
        final char[] charArray = "\u0083\u0017\u0088¦J¬ª".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0125: {
                if (n > 1) {
                    break Label_0125;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c2 = '\u00c0';
                            break;
                        }
                        case 1: {
                            c2 = 'v';
                            break;
                        }
                        case 2: {
                            c2 = '\u00e4';
                            break;
                        }
                        case 3: {
                            c2 = '\u00cf';
                            break;
                        }
                        case 4: {
                            c2 = '(';
                            break;
                        }
                        case 5: {
                            c2 = '\u00de';
                            break;
                        }
                        default: {
                            c2 = '\u00c3';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                g = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
