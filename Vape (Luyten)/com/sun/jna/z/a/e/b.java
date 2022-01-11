package com.sun.jna.z.a.e;

public enum b
{
    Other, 
    Player, 
    World, 
    Render, 
    Combat, 
    Utility, 
    None;
    
    public static boolean b;
    
    static {
        final String[] array = new String[7];
        int n = 0;
        String s;
        int n2 = (s = "\u0004\\\u00c6|\u00c3\u0006\u001bD\u00cf`\u00d4w\u0004\u0005G\u00c0|\u0007\u001e\\\u00c7u\u00d8q¯\u0006\u0019M\u00c0}\u00d4w").length();
        int n3 = 5;
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
                                        c2 = 'K';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '(';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '®';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\u0019';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '±';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '\u0005';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u00d6';
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
                            n2 = (s = "\u001cG\u00dcu\u00d5\u0006\bG\u00c3{\u00d0q").length();
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
    }
}
