package com.sun.jna.z.a.g;

import java.util.*;

class q extends HashMap<Integer, String>
{
    final e a;
    private static final String[] b;
    
    q(final e a) {
        this.a = a;
        final Integer value = 0;
        final String[] a2 = q.b;
        this.put(value, a2[0]);
        this.put(1, a2[4]);
        this.put(2, a2[2]);
        this.put(3, a2[3]);
        this.put(4, a2[1]);
    }
    
    static {
        final String[] b2 = new String[5];
        int n = 0;
        String s;
        int n2 = (s = "\u00fa$©\u009c¶\u00e9\u00ec\u00f3/ \u0093¿\u00e2\u00e5\u00f46»\u008a \u00fb\u00fe\u00ed1²\u0081©!\u009bB\u00c1\u00f5\u00d9\u0080\u0096\u009eD\u00cd\u00fb³\u0089\u00f4\u0093O\u00c6\u00f6\u00c8\u0095\u0094\u009a:\u0096\u00e4\u00cd\u00f4\u00f6y\u00c1\u008a\u0086\u008d\n\u008bW\u00d8\u00eb\u00c7\u009a\u009d\u008c^\u00d3").length();
        int n3 = 26;
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
                        Label_0250: {
                            if (n7 > 1) {
                                break Label_0250;
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
                                        c2 = 'f';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '\u00ea';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\u00d8';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '\u00f3';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '¯';
                                        break;
                                    }
                                    default: {
                                        c2 = '«';
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
                            b2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0022;
                            }
                            n2 = (s = "x\u2078)\u20cb0\u01fch\u001f¥\\\u001bOl\u01d3\u001a\u00da\u0004\u0089¼\u0096\u00c9\u00cc\u00d3\u000f\u0080³\u009f\u00c2\u00c5\u00d4\u0016\u009bª\u0080\u00db\u00de\u00cd\u0011\u0092¡\u0089").length();
                            n3 = 14;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            b2[n++] = intern;
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
        b = b2;
    }
}
