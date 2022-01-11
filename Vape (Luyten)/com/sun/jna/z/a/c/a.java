package com.sun.jna.z.a.c;

import net.minecraft.client.network.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import net.minecraft.network.*;
import com.mojang.authlib.*;
import com.sun.jna.z.a.*;
import net.minecraft.network.play.server.*;

public class a extends NetHandlerPlayClient
{
    public static boolean b;
    private static final String a;
    
    public a(final Minecraft a, final GuiScreen a, final NetworkManager a, final GameProfile a) {
        final int b = com.sun.jna.z.a.c.a.b ? 1 : 0;
        super(a, a, a, a);
        final int a2 = b;
        if (a2 != 0) {
            j.g = !j.g;
        }
    }
    
    public void func_147244_a(final S12PacketEntityVelocity a) {
        System.out.println(a.a);
    }
    
    static {
        final char[] charArray = "\u00ca\u0003\u00c8".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0123: {
                if (n > 1) {
                    break Label_0123;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c2 = '¾';
                            break;
                        }
                        case 1: {
                            c2 = 'j';
                            break;
                        }
                        case 2: {
                            c2 = '¥';
                            break;
                        }
                        case 3: {
                            c2 = '\u0005';
                            break;
                        }
                        case 4: {
                            c2 = '\u00f3';
                            break;
                        }
                        case 5: {
                            c2 = 'º';
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
                a = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
