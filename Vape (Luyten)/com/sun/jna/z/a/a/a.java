package com.sun.jna.z.a.a;

import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import net.minecraft.util.*;
import java.lang.reflect.*;

public abstract class a
{
    static Minecraft a;
    public String b;
    public String c;
    public String[] d;
    public String e;
    public String f;
    public String g;
    public static boolean h;
    private static final String i;
    
    public abstract void a();
    
    public abstract String b();
    
    public void a(final String a) {
        this.b = a;
    }
    
    public void b(final String a) {
        this.c = a;
    }
    
    public void a(final String[] a) {
        this.d = a;
    }
    
    public void c(final String a) {
        this.g = a;
    }
    
    public void d(final String a) {
        this.e = a;
    }
    
    public static void e(final String a) {
        try {
            final Method a2 = GuiNewChat.class.getDeclaredMethod(a.i, IChatComponent.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE);
            a2.setAccessible(true);
            a2.invoke(a.a.field_71456_v.func_146158_b(), new ChatComponentTranslation(a, new Object[0]), 420, a.a.field_71456_v.func_73834_c(), false);
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
    }
    
    static {
        final char[] charArray = "\u001fU\u008bqB\u00dd$O\u0012\u00d6%B\u008d".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0122: {
                if (n > 1) {
                    break Label_0122;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c2 = 'y';
                            break;
                        }
                        case 1: {
                            c2 = ' ';
                            break;
                        }
                        case 2: {
                            c2 = '\u00e5';
                            break;
                        }
                        case 3: {
                            c2 = '\u0012';
                            break;
                        }
                        case 4: {
                            c2 = '\u001d';
                            break;
                        }
                        case 5: {
                            c2 = '\u00ec';
                            break;
                        }
                        default: {
                            c2 = '\u0010';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                i = new String(charArray).intern();
                com.sun.jna.z.a.a.a.a = Minecraft.func_71410_x();
                return;
            }
            continue;
        }
    }
}
