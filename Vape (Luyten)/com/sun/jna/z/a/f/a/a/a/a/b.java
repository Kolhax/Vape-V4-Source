package com.sun.jna.z.a.f.a.a.a.a;

public enum b
{
    DECIMAL, 
    DECIMAL2, 
    INTEGER, 
    PERCENTAGE, 
    NONE;
    
    private static final b[] a;
    
    static {
        final String[] array = new String[5];
        int n = 0;
        String s;
        int n2 = (s = "\u001a\u00c1¬\u0018\u0007\u001d\u00c0¶\u0018\u00e2±\u00fe\n\u0004\u00cb°\u001e\u00e0º\u00f8\u0015\u00c9§").length();
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
                        Label_0249: {
                            if (n7 > 1) {
                                break Label_0249;
                            }
                            length = (n8 = n9);
                            do {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = 'T';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u008e';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '\u00e2';
                                        break;
                                    }
                                    case 3: {
                                        c2 = ']';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '¥';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '\u00f4';
                                        break;
                                    }
                                    default: {
                                        c2 = '¬';
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
                            n2 = (s = "\u0010\u00cb¡\u0014\u00e8µ\u00e0\b\u0010\u00cb¡\u0014\u00e8µ\u00e0f").length();
                            n3 = 7;
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
        a = new b[] { b.DECIMAL, b.DECIMAL2, b.INTEGER, b.PERCENTAGE, b.NONE };
    }
}
