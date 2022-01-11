package com.sun.jna.z.a.f.a.a.a.c;

public enum a implements d
{
    CENTER, 
    LEFT, 
    RIGHT, 
    FILL;
    
    private static final a[] a;
    
    static {
        final String[] array = new String[4];
        int n = 0;
        String s;
        int n2 = (s = "\u00f7\u009d\u00e8P\u0006\u00f8\u009d\u00e0P\u0004\u00d3").length();
        int n3 = 4;
        int n4 = -1;
    Label_0022:
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
                        Label_0243: {
                            if (n7 > 1) {
                                break Label_0243;
                            }
                            length = (n8 = n9);
                            do {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = '»';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u00d8';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '®';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\u0004';
                                        break;
                                    }
                                    case 4: {
                                        c2 = 'A';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '\u0081';
                                        break;
                                    }
                                    default: {
                                        c2 = 'M';
                                        break;
                                    }
                                }
                                charArray[length] = (char)(c ^ c2);
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
                                continue Label_0022;
                            }
                            n2 = (s = "\u00e9\u0091\u00e9L\u0015\u0004\u00fd\u0091\u00e2H").length();
                            n3 = 5;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            array[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0022;
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
        a = new a[] { com.sun.jna.z.a.f.a.a.a.c.a.CENTER, com.sun.jna.z.a.f.a.a.a.c.a.LEFT, com.sun.jna.z.a.f.a.a.a.c.a.RIGHT, com.sun.jna.z.a.f.a.a.a.c.a.FILL };
    }
}
