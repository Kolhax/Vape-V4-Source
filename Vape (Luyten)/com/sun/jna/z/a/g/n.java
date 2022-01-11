package com.sun.jna.z.a.g;

import net.minecraft.client.renderer.*;
import java.lang.reflect.*;
import net.minecraft.client.*;

public class n
{
    private EntityRenderer a;
    private Method b;
    private static final String c;
    
    public n() {
        try {
            this.a = Minecraft.func_71410_x().field_71460_t;
            (this.b = EntityRenderer.class.getDeclaredMethod(n.c, Float.TYPE, Integer.TYPE)).setAccessible(true);
        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }
    
    public void a(final float a, final int a) {
        try {
            this.b.invoke(this.a, a, a);
        }
        catch (Exception a2) {
            a2.printStackTrace();
        }
    }
    
    static {
        final char[] charArray = "o\u00cd\u008c\u00c3\u00c3\u00ee¹=\u008f\u00db\u00ff\u00fd".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0126: {
                if (n > 1) {
                    break Label_0126;
                }
                length = (n2 = n3);
                do {
                    final char c2 = charArray[n2];
                    char c3 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c3 = '\t';
                            break;
                        }
                        case 1: {
                            c3 = '¸';
                            break;
                        }
                        case 2: {
                            c3 = '\u00e2';
                            break;
                        }
                        case 3: {
                            c3 = ' ';
                            break;
                        }
                        case 4: {
                            c3 = '\u009c';
                            break;
                        }
                        case 5: {
                            c3 = '\u00d9';
                            break;
                        }
                        default: {
                            c3 = '\u0081';
                            break;
                        }
                    }
                    charArray[length] = (char)(c2 ^ c3);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                c = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
