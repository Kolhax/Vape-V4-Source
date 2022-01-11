package com.sun.jna.z.a.f.a.a.a.a;

public enum c
{
    CENTER, 
    LEFT, 
    RIGHT, 
    TOP, 
    BOTTOM;
    
    private static final c[] a;
    
    static {
        final String[] array = new String[5];
        int n = 0;
        String s;
        int n2 = (s = "}Q\u00eb\u00e4\u001a\u00cc\u0005mW\u00f8\u00f8\u0001\u0003kQ\u00ef").length();
        int n3 = 6;
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
                        Label_0248: {
                            if (n7 > 1) {
                                break Label_0248;
                            }
                            length = (n8 = n9);
                            do {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = '?';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u001e';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '¿';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '°';
                                        break;
                                    }
                                    case 4: {
                                        c2 = 'U';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '\u0081';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u00e2';
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
                                continue Label_0023;
                            }
                            n2 = (s = "|[\u00f1\u00e4\u0010\u00d3\u0004s[\u00f9\u00e4").length();
                            n3 = 6;
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
        a = new c[] { c.CENTER, c.LEFT, c.RIGHT, c.TOP, c.BOTTOM };
    }
}
