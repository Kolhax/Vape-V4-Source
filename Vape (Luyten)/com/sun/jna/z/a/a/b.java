package com.sun.jna.z.a.a;

import com.sun.jna.z.a.*;
import com.sun.jna.z.a.e.*;
import org.lwjgl.input.*;
import java.util.*;

public class b extends a
{
    private static final String[] j;
    
    @Override
    public void a() {
        final int a = com.sun.jna.z.a.a.a.h ? 1 : 0;
        final String b = this.b;
        String[] a2 = com.sun.jna.z.a.a.b.j;
        if (b.equalsIgnoreCase(a2[5])) {
            for (final c a3 : com.sun.jna.z.a.i.d.a.a.values()) {
                a3.b(-301);
                if (a != 0) {
                    return;
                }
                if (a != 0) {
                    break;
                }
            }
            a2 = com.sun.jna.z.a.a.b.j;
            com.sun.jna.z.a.a.a.e(a2[0]);
            return;
        }
        while (true) {
            for (final c a3 : com.sun.jna.z.a.i.d.a.a.values()) {
                final String lowerCase = a3.a().toLowerCase();
                if (a == 0) {
                    int n2;
                    int keyIndex;
                    final int n = keyIndex = (n2 = (lowerCase.equalsIgnoreCase(this.b) ? 1 : 0));
                    if (a == 0) {
                        if (n != 0) {
                            n2 = (keyIndex = Keyboard.getKeyIndex(this.c.toUpperCase()));
                        }
                        else {
                            if (a != 0) {
                                break;
                            }
                            continue;
                        }
                    }
                    if (a == 0) {
                        if (keyIndex == 0) {
                            a2 = com.sun.jna.z.a.a.b.j;
                            com.sun.jna.z.a.a.a.e(a2[2]);
                            if (a == 0) {
                                return;
                            }
                        }
                        final String c = this.c;
                        a2 = com.sun.jna.z.a.a.b.j;
                        n2 = (c.equalsIgnoreCase(a2[1]) ? 1 : 0);
                    }
                    Label_0231: {
                        if (n2 != 0) {
                            a3.b(-301);
                            if (a == 0) {
                                break Label_0231;
                            }
                        }
                        a3.b(Keyboard.getKeyIndex(this.c.toUpperCase()));
                    }
                    final StringBuilder sb = new StringBuilder();
                    a2 = com.sun.jna.z.a.a.b.j;
                    com.sun.jna.z.a.a.a.e(sb.append(a2[6]).append(this.b).append(a2[7]).append(this.c).toString());
                    return;
                }
                com.sun.jna.z.a.a.a.e(lowerCase);
                return;
            }
            new StringBuilder().append(this.b).append(com.sun.jna.z.a.a.b.j[3]).toString();
            continue;
        }
    }
    
    @Override
    public String b() {
        return b.j[4];
    }
    
    static {
        final String[] i = new String[8];
        int n = 0;
        String s;
        int n2 = (s = "\u00fbu\u009f½\u00f20>\u00c30\u0085³\u00fe?(\u00d5t\u0004\u00de\u007f\u0088º-\u00fbu\u009f\u00ff\u00f51.\u0090v\u0089ª\u00f5:t\u0090D\u0094¦»-*\u00d5|\u008a¶\u00f59z\u00dfe\u0092\u00ff\u00ef6?\u0090{\u0083¦»0;\u00ddu\u00c8\n\u0090~\u0089«»85\u00c5~\u0082\u0004\u00d2y\u0088»\u0005\u00d3|\u0083¾\u00e9").length();
        int n3 = 16;
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
                                        c2 = '°';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u0010';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '\u00e6';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\u00df';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '\u009b';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '^';
                                        break;
                                    }
                                    default: {
                                        c2 = 'Z';
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
                            i[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0023;
                            }
                            n2 = (s = "\u0017q\u000e\u0017v\u00c6½\u00f4+4\u00d40\u0092°»\u00f9;").length();
                            n3 = 2;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            i[n++] = intern;
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
        j = i;
    }
}
