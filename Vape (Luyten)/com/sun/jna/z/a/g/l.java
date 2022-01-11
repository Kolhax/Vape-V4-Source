package com.sun.jna.z.a.g;

import java.lang.reflect.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.*;

public class l
{
    private Field a;
    private Field b;
    private Field c;
    private static final String[] d;
    
    public l() {
        try {
            final Class<RenderManager> clazz = RenderManager.class;
            final String[] a = l.d;
            this.a = clazz.getDeclaredField(a[1]);
            this.b = RenderManager.class.getDeclaredField(a[2]);
            this.c = RenderManager.class.getDeclaredField(a[0]);
            this.a.setAccessible(true);
            this.b.setAccessible(true);
            this.c.setAccessible(true);
        }
        catch (Exception a2) {
            a2.printStackTrace();
        }
    }
    
    public double a() {
        try {
            return this.a.getDouble(Minecraft.func_71410_x().func_175598_ae());
        }
        catch (Exception a) {
            a.printStackTrace();
            return 0.0;
        }
    }
    
    public double b() {
        try {
            return this.b.getDouble(Minecraft.func_71410_x().func_175598_ae());
        }
        catch (Exception a) {
            a.printStackTrace();
            return 0.0;
        }
    }
    
    public double c() {
        try {
            return this.c.getDouble(Minecraft.func_71410_x().func_175598_ae());
        }
        catch (Exception a) {
            a.printStackTrace();
            return 0.0;
        }
    }
    
    static {
        final String[] d2 = new String[3];
        int n = 0;
        final String s;
        final int length = (s = "\u00fa\u00dcP\u00da\u009b.\u00d2¤\u0082\u0007\u008e \u001f\r\u00fa\u00dcP\u00da\u009b.\u00d2¤\u0082\u0007\u0083 \u0013\r\u00fa\u00dcP\u00da\u009b.\u00d2¤\u0082\u0007\u0080 \u0012").length();
        int char1 = 13;
        int n2 = -1;
        Label_0022: {
            break Label_0022;
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
                    Label_0189: {
                        if (n4 > 1) {
                            break Label_0189;
                        }
                        length2 = (n5 = n6);
                        do {
                            final char c = charArray[n5];
                            char c2 = '\0';
                            switch (n6 % 7) {
                                case 0: {
                                    c2 = '\u009c';
                                    break;
                                }
                                case 1: {
                                    c2 = 'µ';
                                    break;
                                }
                                case 2: {
                                    c2 = '5';
                                    break;
                                }
                                case 3: {
                                    c2 = '¶';
                                    break;
                                }
                                case 4: {
                                    c2 = '\u00ff';
                                    break;
                                }
                                case 5: {
                                    c2 = 'q';
                                    break;
                                }
                                default: {
                                    c2 = '\u00e5';
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
                d2[n++] = new String(charArray).intern();
            } while ((n2 += char1) < length);
        }
        d = d2;
    }
}
