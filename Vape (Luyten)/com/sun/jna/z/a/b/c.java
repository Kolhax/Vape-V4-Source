package com.sun.jna.z.a.b;

public class c
{
    public static String a(final String a, final int a) {
        final int a2 = e.e;
        try {
            String a3 = "";
            int a4 = 0;
            String string = null;
            while (a4 < a.length()) {
                final StringBuilder append = new StringBuilder().append(a3);
                final char[] charArray = a.toCharArray();
                final int n = a4;
                final char c = (char)(charArray[n] ^ a);
                charArray[n] = c;
                string = append.append(c).toString();
                if (a2 != 0) {
                    return string;
                }
                a3 = string;
                ++a4;
                if (a2 != 0) {
                    break;
                }
            }
            return string;
        }
        catch (Exception a5) {
            a5.printStackTrace();
            return "";
        }
    }
}
