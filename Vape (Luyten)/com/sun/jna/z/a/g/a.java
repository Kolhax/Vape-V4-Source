package com.sun.jna.z.a.g;

public enum a
{
    NORMAL, 
    EMBOSS_TOP, 
    EMBOSS_BOTTOM, 
    OUTLINE_THIN, 
    SHADOW_THICK, 
    SHADOW_THIN;
    
    private static final a[] a;
    
    static {
        final String[] array = new String[6];
        int n = 0;
        String s;
        int n2 = (s = ":\u001e\u00d8\u00f3F\u00d5\n1\u001c\u00c8\u00f1T\u00ca] \u001e\u00da\r1\u001c\u00c8\u00f1T\u00ca]6\u001e\u00de\u00eaH\u00d4\f'\u0019\u00cb\u00faH\u00ce] \u0019\u00c3\u00fdL").length();
        int n3 = 6;
        int n4 = -1;
    Label_0024:
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
                                        c2 = 't';
                                        break;
                                    }
                                    case 1: {
                                        c2 = 'Q';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '\u008a';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '¾';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '\u0007';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '\u0099';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u0002';
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
                                continue Label_0024;
                            }
                            n2 = (s = "'\u0019\u00cb\u00faH\u00ce] \u0019\u00c3\u00f0\f;\u0004\u00de\u00f2N\u00d7G+\u0005\u00c2\u00f7I").length();
                            n3 = 11;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            array[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0024;
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
        a = new a[] { com.sun.jna.z.a.g.a.NORMAL, com.sun.jna.z.a.g.a.EMBOSS_TOP, com.sun.jna.z.a.g.a.EMBOSS_BOTTOM, com.sun.jna.z.a.g.a.OUTLINE_THIN, com.sun.jna.z.a.g.a.SHADOW_THICK, com.sun.jna.z.a.g.a.SHADOW_THIN };
    }
}
