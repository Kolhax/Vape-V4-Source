package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.*;

class C extends Thread
{
    final n a;
    private static final String b;
    
    C(final n a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final int a = g.c;
        try {
            Thread.sleep(2000L);
            this.a.b.b(C.b);
            int a2 = 0;
            while (!i.d.e) {
                try {
                    if (a2 < 240) {
                        ++a2;
                        Thread.sleep(250L);
                        if (a == 0) {
                            continue;
                        }
                    }
                }
                catch (InterruptedException ex) {
                    throw ex;
                }
                break;
            }
            this.a.b.b(C.b);
        }
        catch (InterruptedException a3) {
            a3.printStackTrace();
        }
    }
    
    static {
        final char[] charArray = "c²¼\u0080\u00de]\u00cfD¿»\u008d\u0099}".toCharArray();
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
                            c2 = '0';
                            break;
                        }
                        case 1: {
                            c2 = '\u00cb';
                            break;
                        }
                        case 2: {
                            c2 = '\u00d2';
                            break;
                        }
                        case 3: {
                            c2 = '\u00e3';
                            break;
                        }
                        case 4: {
                            c2 = '\u00fe';
                            break;
                        }
                        case 5: {
                            c2 = '\u000e';
                            break;
                        }
                        default: {
                            c2 = 'ª';
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
