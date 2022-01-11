package com.sun.jna.z.a.b;

import java.net.*;
import java.io.*;

public class e
{
    public Socket a;
    public PrintWriter b;
    public BufferedReader c;
    public boolean d;
    public static int e;
    private static final String[] f;
    
    public e() {
        this.d = true;
    }
    
    public String a() throws IOException {
        final String a = com.sun.jna.z.a.b.c.a(this.c.readLine(), 10);
        return a;
    }
    
    public void a(final String a) {
        this.b.println(com.sun.jna.z.a.b.c.a(a, 10));
        this.b.flush();
    }
    
    public void b(final String a) {
        this.b.println(a.a(a));
        this.b.flush();
    }
    
    public void a(final int a) {
        this.b.write(a);
        this.b.flush();
    }
    
    public void c(final String a) {
        this.b.println(a);
        this.b.flush();
    }
    
    public String b() {
        try {
            return this.c.readLine();
        }
        catch (IOException ex) {
            return "";
        }
    }
    
    public String c() {
        try {
            return com.sun.jna.z.a.b.a.b(this.c.readLine());
        }
        catch (IOException ex) {
            return "";
        }
    }
    
    public void d() {
        this.b.write(2);
        this.b.close();
        try {
            this.c.close();
            this.a.close();
        }
        catch (IOException a) {
            a.printStackTrace();
        }
    }
    
    static {
        final String[] f2 = new String[6];
        int n = 0;
        String s;
        int n2 = (s = "p\u00fek\u0000\u00fb\u00e7\u00c0p\u00e2i\nS\u00ffq\u0010\u00e4\u00eb\u009co\u00f4c\r1¥)L§¬\u00cb4¤)D¯¶\u00027¡").length();
        int n3 = 10;
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
                                        c2 = '\u0006';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u0091';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '\u0007';
                                        break;
                                    }
                                    case 3: {
                                        c2 = 'u';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '\u0096';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '\u0082';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u00fa';
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
                            f2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0023;
                            }
                            n2 = (s = "i\u00fa\u00047¿?X").length();
                            n3 = 2;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            f2[n++] = intern;
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
        f = f2;
    }
}
