package com.sun.jna.z.a.g;

public enum b
{
    ALPHA(1, true), 
    LUMINANCE(1, false), 
    LUMINANCE_ALPHA(2, true), 
    RGB(3, false), 
    RGBA(4, true), 
    BGRA(4, true), 
    ABGR(4, true);
    
    final int a;
    final boolean b;
    private static final b[] c;
    
    private b(final int a, final boolean a) {
        this.a = a;
        this.b = a;
    }
    
    public int a() {
        return this.a;
    }
    
    public boolean b() {
        return this.b;
    }
    
    static {
        final String[] array = new String[7];
        int n = 0;
        String s;
        int n2 = (s = "\u00c6½\u00d56\u0005\u00c6³\u00c2,\u0082\u0003\u00d5¸\u00d0\u000f\u00cbª\u00df-\u008d\u00ea¤\u00c4º\u00cd%\u008f\u00fb¢\u00c6\u0004\u00c5¸\u00c0%").length();
        int n3 = 4;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                ++n4;
                final String s2 = s;
                final int n5 = n4;
                String s3 = s2.substring(n5, n5 + n3);
                int n6 = -1;
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    int length;
                    int n8;
                    final int n7 = n8 = (length = charArray.length);
                    int n9 = 0;
                    while (true) {
                        Label_0250: {
                            if (n7 > 1) {
                                break Label_0250;
                            }
                            length = (n8 = n9);
                            do {
                                final char c2 = charArray[n8];
                                char c3 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c3 = '\u0087';
                                        break;
                                    }
                                    case 1: {
                                        c3 = '\u00ff';
                                        break;
                                    }
                                    case 2: {
                                        c3 = '\u0092';
                                        break;
                                    }
                                    case 3: {
                                        c3 = 'd';
                                        break;
                                    }
                                    case 4: {
                                        c3 = '\u00c3';
                                        break;
                                    }
                                    case 5: {
                                        c3 = '«';
                                        break;
                                    }
                                    default: {
                                        c3 = '\u00ea';
                                        break;
                                    }
                                }
                                charArray[length] = (char)(c2 ^ c3);
                                ++n9;
                            } while (n7 == 0);
                        }
                        if (n7 > n9) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n6) {
                        default: {
                            array[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0023;
                            }
                            n2 = (s = "\u00d5¸\u00d0%\t\u00cbª\u00df-\u008d\u00ea¤\u00c4º").length();
                            n3 = 4;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            array[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0023;
                        }
                    }
                    ++n4;
                    final String s4 = s;
                    final int n10 = n4;
                    s3 = s4.substring(n10, n10 + n3);
                    n6 = 0;
                }
            }
            break;
        }
        final String[] array2 = array;
        c = new b[] { b.ALPHA, b.LUMINANCE, b.LUMINANCE_ALPHA, b.RGB, b.RGBA, b.BGRA, b.ABGR };
    }
}
