package com.sun.jna.z.a.g;

public enum c
{
    THREE_DIMENSIONAL, 
    TWO_DIMENSIONAL;
    
    private static final c[] a;
    
    static {
        final String[] array = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "¨/40m\nkµ*#;{\u001c`²&*\u000f¨0)*l\u001cb¹)5<g\u001bn°").length();
        int char1 = 17;
        int n2 = -1;
        Label_0023: {
            break Label_0023;
            do {
                char1 = s.charAt(n2);
                ++n2;
                final String s2 = s;
                final int n3 = n2;
                final char[] charArray = s2.substring(n3, n3 + char1).toCharArray();
                int length2;
                int n5;
                final int n4 = n5 = (length2 = charArray.length);
                int n6 = 0;
                while (true) {
                    Label_0185: {
                        if (n4 > 1) {
                            break Label_0185;
                        }
                        length2 = (n5 = n6);
                        do {
                            final char c = charArray[n5];
                            char c2 = '\0';
                            switch (n6 % 7) {
                                case 0: {
                                    c2 = '\u00fc';
                                    break;
                                }
                                case 1: {
                                    c2 = 'g';
                                    break;
                                }
                                case 2: {
                                    c2 = 'f';
                                    break;
                                }
                                case 3: {
                                    c2 = 'u';
                                    break;
                                }
                                case 4: {
                                    c2 = '(';
                                    break;
                                }
                                case 5: {
                                    c2 = 'U';
                                    break;
                                }
                                default: {
                                    c2 = '/';
                                    break;
                                }
                            }
                            charArray[length2] = (char)(c ^ c2);
                            ++n6;
                        } while (n4 == 0);
                    }
                    if (n4 > n6) {
                        continue;
                    }
                    break;
                }
                array[n++] = new String(charArray).intern();
            } while ((n2 += char1) < length);
        }
        final String[] array2 = array;
        a = new c[] { c.THREE_DIMENSIONAL, c.TWO_DIMENSIONAL };
    }
}
