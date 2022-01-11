package com.sun.jna.z.a.f.a.a.a.c;

public enum b implements d
{
    CENTER, 
    TOP, 
    BOTTOM, 
    FILL;
    
    private static final b[] a;
    
    static {
        final String[] array = new String[4];
        int n = 0;
        String s;
        int n2 = (s = "a m¥\u0003s&q").length();
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
                        Label_0246: {
                            if (n7 > 1) {
                                break Label_0246;
                            }
                            length = (n8 = n9);
                            do {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = '\'';
                                        break;
                                    }
                                    case 1: {
                                        c2 = 'i';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '!';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\u00e9';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '8';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '\u0098';
                                        break;
                                    }
                                    default: {
                                        c2 = 'd';
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
                            n2 = (s = "e&u½w\u00d5\u0006d,o½}\u00ca").length();
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
        a = new b[] { b.CENTER, b.TOP, b.BOTTOM, b.FILL };
    }
}
