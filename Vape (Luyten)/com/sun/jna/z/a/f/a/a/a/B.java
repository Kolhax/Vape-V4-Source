package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.*;

class B extends Thread
{
    final g a;
    final l b;
    private static final String c;
    
    B(final l a, final g a2) {
        this.b = a;
        this.a = a2;
    }
    
    @Override
    public void run() {
        this.b.b.b(-301);
        this.a.b(B.c);
        this.b.a.interrupt();
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException a) {
            return;
        }
        this.a.b(this.b.b.a());
    }
    
    static {
        final char[] charArray = "\u0012\u00f3\u008e\u00faW}V".toCharArray();
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
                    final char c2 = charArray[n2];
                    char c3 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c3 = 'G';
                            break;
                        }
                        case 1: {
                            c3 = '\u009d';
                            break;
                        }
                        case 2: {
                            c3 = '\u00ec';
                            break;
                        }
                        case 3: {
                            c3 = '\u0095';
                            break;
                        }
                        case 4: {
                            c3 = '\"';
                            break;
                        }
                        case 5: {
                            c3 = '\u0013';
                            break;
                        }
                        default: {
                            c3 = '2';
                            break;
                        }
                    }
                    charArray[length] = (char)(c2 ^ c3);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                c = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
