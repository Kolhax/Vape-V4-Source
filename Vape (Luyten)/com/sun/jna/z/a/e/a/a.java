package com.sun.jna.z.a.e.a;

import com.sun.jna.z.a.e.*;
import com.sun.jna.z.a.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;

public class a extends c
{
    public static boolean n;
    
    public a(final String a, final b a, final int a, final int a) {
        final int n = a.n ? 1 : 0;
        super(a, a, a, a);
        final int a2 = n;
        if (com.sun.jna.z.a.j.g) {
            a.n = (a2 == 0);
        }
    }
    
    public static void a() {
        a(a.e.d());
    }
    
    public static void a(final GuiScreen a) {
        final int n = a.n ? 1 : 0;
        a.e.a.field_71462_r = a;
        final int a2 = n;
        Label_0088: {
            if (a2 == 0) {
                if (a == null) {
                    break Label_0088;
                }
                a.e.a.func_71364_i();
            }
            final ScaledResolution a3 = new ScaledResolution(Minecraft.func_71410_x(), Minecraft.func_71410_x().field_71443_c, Minecraft.func_71410_x().field_71440_d);
            final int a4 = a3.func_78326_a();
            final int a5 = a3.func_78328_b();
            a.func_146280_a(a.e.a, a4, a5);
            a.e.a.field_71454_w = false;
        }
        if (a2 != 0) {
            j.g = !j.g;
        }
    }
}
