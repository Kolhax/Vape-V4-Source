package com.sun.jna.z.a.a;

import com.sun.jna.z.a.f.a.a.a.e.a.*;
import com.sun.jna.z.a.f.a.a.a.b.*;
import com.sun.jna.z.a.*;
import net.minecraft.util.*;
import net.minecraft.client.gui.*;

public class e extends Gui
{
    private final FontRenderer a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private String f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    i s;
    a t;
    
    public e(final FontRenderer a, final int a, final int a, final int a, final int a) {
        this.f = "";
        final int h = com.sun.jna.z.a.a.a.h ? 1 : 0;
        this.g = 32;
        this.i = true;
        this.j = true;
        final int a2 = h;
        this.k = false;
        this.l = true;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = -1;
        this.q = -1;
        this.r = true;
        this.s = (i)com.sun.jna.z.a.j.e.c.c();
        this.t = (a)this.s.c();
        this.a = a;
        this.b = a;
        this.c = a;
        this.d = a;
        this.e = a;
        if (com.sun.jna.z.a.j.g) {
            com.sun.jna.z.a.a.a.h = (a2 == 0);
        }
    }
    
    public void a() {
        ++this.h;
    }
    
    public void a(final String a) {
        final int a2 = a.h ? 1 : 0;
        Label_0041: {
            Label_0036: {
                if (a2 == 0) {
                    if (a.length() <= this.g) {
                        break Label_0036;
                    }
                    this.f = a.substring(0, this.g);
                }
                if (a2 == 0) {
                    break Label_0041;
                }
            }
            this.f = a;
        }
        this.e();
    }
    
    public String b() {
        return this.f;
    }
    
    public String c() {
        final int a = com.sun.jna.z.a.a.a.h ? 1 : 0;
        e e = this;
        int n = 0;
        Label_0030: {
            if (a == 0) {
                if (this.n < this.o) {
                    n = this.n;
                    break Label_0030;
                }
                e = this;
            }
            n = e.o;
        }
        final int a2 = n;
        e e2 = this;
        int n2 = 0;
        Label_0057: {
            if (a == 0) {
                if (this.n < this.o) {
                    n2 = this.o;
                    break Label_0057;
                }
                e2 = this;
            }
            n2 = e2.n;
        }
        final int a3 = n2;
        return this.f.substring(a2, a3);
    }
    
    public void b(final String a) {
        String a2 = "";
        final int h = a.h ? 1 : 0;
        final String a3 = ChatAllowedCharacters.func_71565_a(a);
        final int a4 = h;
        e e = this;
        int n = 0;
        Label_0039: {
            if (a4 == 0) {
                if (this.n < this.o) {
                    n = this.n;
                    break Label_0039;
                }
                e = this;
            }
            n = e.o;
        }
        final int a5 = n;
        e e2 = this;
        int n2 = 0;
        Label_0067: {
            if (a4 == 0) {
                if (this.n < this.o) {
                    n2 = this.o;
                    break Label_0067;
                }
                e2 = this;
            }
            n2 = e2.n;
        }
        final int a6 = n2;
        final int a7 = this.g - this.f.length() - (a5 - this.o);
        final boolean a8 = false;
        int n4;
        final int n3 = n4 = this.f.length();
        if (a4 == 0) {
            if (n3 > 0) {
                a2 += this.f.substring(0, a5);
            }
            final int n5;
            n4 = (n5 = a7);
        }
        int a9 = 0;
        Label_0225: {
            if (a4 == 0) {
                if (n3 < a3.length()) {
                    a2 += a3.substring(0, a7);
                    a9 = a7;
                    if (a4 == 0) {
                        break Label_0225;
                    }
                    com.sun.jna.z.a.j.g = !com.sun.jna.z.a.j.g;
                }
                a2 += a3;
                n4 = a3.length();
            }
            a9 = n4;
        }
        e e3 = this;
        if (a4 == 0) {
            if (this.f.length() > 0 && a6 < this.f.length()) {
                a2 += this.f.substring(a6);
            }
            this.f = a2;
            e3 = this;
        }
        e3.d(a5 - this.o + a9);
    }
    
    public void a(final int a) {
        final int a2 = a.h ? 1 : 0;
        final int length = this.f.length();
        e e = null;
        Label_0044: {
            if (a2 == 0) {
                if (length == 0) {
                    return;
                }
                e = this;
                if (a2 != 0) {
                    break Label_0044;
                }
                final int o = this.o;
            }
            if (length != this.n) {
                this.b("");
                if (a2 == 0) {
                    return;
                }
            }
            e = this;
        }
        e.b(this.c(a) - this.n);
    }
    
    public void b(final int a) {
        final int a2 = a.h ? 1 : 0;
        int n3;
        int n2;
        final int n = n2 = (n3 = this.f.length());
        if (a2 == 0) {
            if (n == 0) {
                return;
            }
            final int n4;
            n2 = (n4 = (n3 = this.o));
        }
        if (a2 == 0) {
            if (n != this.n) {
                this.b("");
                if (a2 == 0) {
                    return;
                }
            }
            n3 = a;
            n2 = a;
        }
        if (a2 == 0) {
            if (n2 < 0) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
        }
        final boolean a3 = n3 != 0;
        int n6;
        final int n5 = n6 = (a3 ? 1 : 0);
        if (a2 == 0) {
            if (n5 != 0) {
                n6 = this.n + a;
            }
            else {
                n6 = this.n;
            }
        }
        final int a4 = n6;
        final int n7 = a3 ? 1 : 0;
        int n8 = 0;
        Label_0101: {
            if (a2 == 0) {
                if (n7 != 0) {
                    n8 = this.n;
                    break Label_0101;
                }
                final int n9 = this.n;
            }
            n8 = n7 + a;
        }
        final int a5 = n8;
        String a6 = "";
        int n11;
        final int n10 = n11 = a4;
        if (a2 == 0) {
            if (n10 >= 0) {
                a6 = this.f.substring(0, a4);
            }
            final int n12;
            n11 = (n12 = a5);
        }
        e e = null;
        Label_0188: {
            if (a2 == 0) {
                if (n10 < this.f.length()) {
                    a6 += this.f.substring(a5);
                }
                e = this;
                if (a2 != 0) {
                    break Label_0188;
                }
                this.f = a6;
                n11 = (a3 ? 1 : 0);
            }
            if (n11 == 0) {
                return;
            }
            e = this;
        }
        e.d(a);
    }
    
    public int c(final int a) {
        return this.a(a, this.h());
    }
    
    public int a(final int a, final int a) {
        return this.a(a, this.h(), true);
    }
    
    public int a(final int a, final int a, final boolean a) {
        final int a2 = a.h ? 1 : 0;
        boolean b = a != 0;
        if (a2 == 0) {
            if (a < 0) {
                b = true;
            }
            else {
                b = false;
            }
        }
        final boolean a3 = b;
        final int a4 = Math.abs(a);
        int a5 = 0;
        int a6 = 0;
        do {
            int i = 0;
            int n = 0;
        Label_0105_Outer:
            while (i < n) {
                final int n3;
                int length;
                final int n2 = length = (n3 = (a3 ? 1 : 0));
                if (a2 != 0) {
                    return n3;
                }
                Label_0222: {
                    if (a2 == 0) {
                        Label_0137: {
                            if (n2 != 0) {
                                while (true) {
                                    while (a) {
                                        final int n4 = a6;
                                        if (a2 == 0 && a2 == 0) {
                                            if (n4 > 0) {
                                                final char char1;
                                                final char c = char1 = this.f.charAt(a6 - 1);
                                                if (a2 == 0) {
                                                    if (c == ' ') {
                                                        --a6;
                                                        if (a2 == 0) {
                                                            continue Label_0105_Outer;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (n4 <= 0) {
                                            break Label_0222;
                                        }
                                        final char char2;
                                        final char c2 = char2 = this.f.charAt(a6 - 1);
                                        final int n6;
                                        final int n5 = n6 = 32;
                                        if (a2 != 0) {
                                            continue Label_0105_Outer;
                                        }
                                        if (c2 == n5) {
                                            break Label_0222;
                                        }
                                        --a6;
                                        if (a2 != 0) {
                                            break Label_0137;
                                        }
                                        break;
                                    }
                                    continue;
                                }
                            }
                        }
                        length = this.f.length();
                    }
                    final int a7 = length;
                    final int index;
                    a6 = (index = this.f.indexOf(32, a6));
                    if (a2 == 0 && index == -1) {
                        a6 = a7;
                        if (a2 != 0) {
                            goto Label_0179;
                        }
                    }
                    else if (index != 0) {
                        char char3;
                        i = (char3 = (char)a6);
                        char c3;
                        n = (c3 = (char)a7);
                        if (a2 != 0) {
                            continue;
                        }
                        if (a2 == 0) {
                            if (i >= n) {
                                break Label_0222;
                            }
                            char3 = this.f.charAt(a6);
                            c3 = ' ';
                        }
                        if (char3 == c3) {
                            ++a6;
                            if (a2 == 0) {
                                goto Label_0179;
                            }
                        }
                    }
                }
                ++a5;
            }
            break;
        } while (a2 == 0);
        return a6;
    }
    
    public void d(final int a) {
        this.e(this.o + a);
    }
    
    public void e(final int a) {
        final int h = a.h ? 1 : 0;
        this.n = a;
        final int a2 = this.f.length();
        final int a3 = h;
        final int n = this.n;
        e e = null;
        Label_0051: {
            if (a3 == 0) {
                if (n < 0) {
                    this.n = 0;
                }
                e = this;
                if (a3 != 0) {
                    break Label_0051;
                }
                final int n2 = this.n;
            }
            if (n > a2) {
                this.n = a2;
            }
            e = this;
        }
        e.i(this.n);
    }
    
    public void d() {
        this.e(0);
    }
    
    public void e() {
        this.e(this.f.length());
    }
    
    public boolean a(final char a, final int a) {
        final int a2 = a.h ? 1 : 0;
        final boolean l = this.l;
        if (a2 == 0) {
            if (l) {
                final boolean k = this.k;
                if (a2 == 0) {
                    if (k) {
                        char c = a;
                        int func_71566_a = a;
                        int n = a;
                        if (a2 == 0) {
                            switch (a) {
                                case '\u0001': {
                                    this.e();
                                    this.i(0);
                                    return true;
                                }
                                case '\u0003': {
                                    GuiScreen.func_146275_d(this.c());
                                    return true;
                                }
                                case '\u0016': {
                                    this.b(GuiScreen.func_146277_j());
                                    return true;
                                }
                                case '\u0018': {
                                    GuiScreen.func_146275_d(this.c());
                                    this.b("");
                                    return true;
                                }
                                default: {
                                    c = (char)a;
                                    func_71566_a = a;
                                    n = a;
                                    break;
                                }
                            }
                        }
                        if (a2 == 0) {
                            switch (n) {
                                case 14: {
                                    if (GuiScreen.func_146271_m()) {
                                        this.a(-1);
                                        if (a2 == 0) {
                                            return true;
                                        }
                                    }
                                    this.b(-1);
                                    return true;
                                }
                                case 199: {
                                    if (GuiScreen.func_146272_n()) {
                                        this.i(0);
                                        if (a2 == 0) {
                                            return true;
                                        }
                                    }
                                    this.d();
                                    return true;
                                }
                                case 207: {
                                    if (GuiScreen.func_146272_n()) {
                                        this.i(this.f.length());
                                        if (a2 == 0) {
                                            return true;
                                        }
                                    }
                                    this.e();
                                    return true;
                                }
                                case 211: {
                                    if (GuiScreen.func_146271_m()) {
                                        this.a(1);
                                        if (a2 == 0) {
                                            return true;
                                        }
                                    }
                                    this.b(1);
                                    return true;
                                }
                                default: {
                                    c = (char)(func_71566_a = (ChatAllowedCharacters.func_71566_a(a) ? 1 : 0));
                                    break;
                                }
                            }
                        }
                        if (a2 == 0) {
                            if (func_71566_a != 0) {
                                this.b(Character.toString(a));
                                return true;
                            }
                            c = '\0';
                        }
                        return c != '\0';
                    }
                }
            }
        }
        return l;
    }
    
    public void a(final int a, final int a, final int a) {
        final int a2 = a.h ? 1 : 0;
        int n = a;
        int n2 = a;
        int n3 = a;
        int b;
        int c;
        final int n4 = c = (b = this.b);
        boolean b2 = false;
        Label_0072: {
            Label_0071: {
                if (a2 == 0) {
                    if (a < n4) {
                        break Label_0071;
                    }
                    n = a;
                    n2 = a;
                    n3 = a;
                    final int n5;
                    c = (n5 = (b = this.b + this.d));
                }
                if (a2 == 0) {
                    if (n3 >= n4) {
                        break Label_0071;
                    }
                    n = a;
                    n2 = a;
                    b = (c = this.c);
                }
                Label_0068: {
                    if (a2 == 0) {
                        if (n2 < c) {
                            break Label_0071;
                        }
                        b2 = (a != 0);
                        n = a;
                        if (a2 != 0) {
                            break Label_0068;
                        }
                        b = this.c + this.e;
                    }
                    if (n >= b) {
                        break Label_0071;
                    }
                    b2 = true;
                }
                break Label_0072;
            }
            b2 = false;
        }
        final boolean a3 = b2;
        int n8;
        int n7;
        final int n6 = n7 = (n8 = (this.j ? 1 : 0));
        if (a2 == 0) {
            if (n6 != 0) {
                boolean l;
                final boolean b3 = l = this.l;
                Label_0114: {
                    Label_0113: {
                        if (a2 == 0) {
                            if (!b3) {
                                break Label_0113;
                            }
                            final boolean b4;
                            l = (b4 = a3);
                        }
                        if (a2 == 0) {
                            if (!b3) {
                                break Label_0113;
                            }
                            l = true;
                        }
                        break Label_0114;
                    }
                    l = false;
                }
                this.b(l);
            }
            final boolean b5;
            n7 = ((b5 = ((n8 = (this.k ? 1 : 0)) != 0)) ? 1 : 0);
        }
        if (a2 == 0) {
            if (n6 == 0) {
                return;
            }
            n8 = a;
            n7 = a;
        }
        if (a2 == 0) {
            if (n7 != 0) {
                return;
            }
            n8 = a - this.b;
        }
        int a4 = n8;
        e e = this;
        if (a2 == 0) {
            if (this.i) {
                a4 -= 4;
            }
            e = this;
        }
        final String a5 = e.a.func_78269_a(this.f.substring(this.m), this.l());
        this.e(this.a.func_78269_a(a5, a4).length() + this.m);
    }
    
    public void f() {
        final int a = com.sun.jna.z.a.a.a.h ? 1 : 0;
        boolean b2;
        final boolean b = b2 = this.m();
        if (a == 0) {
            if (!b) {
                return;
            }
            final boolean i;
            b2 = (i = this.i());
        }
        int n = 0;
        Label_0118: {
            e e = null;
            Label_0115: {
                if (a == 0) {
                    if (b) {
                        func_73734_a(this.b - 1, this.c - 1, this.b + this.d + 1, this.c + this.e + 1, -6250336);
                        func_73734_a(this.b, this.c, this.b + this.d, this.c + this.e, -16777216);
                    }
                    e = this;
                    if (a != 0) {
                        break Label_0115;
                    }
                    b2 = this.l;
                }
                if (b2) {
                    n = this.p;
                    break Label_0118;
                }
                e = this;
            }
            n = e.q;
        }
        final int a2 = n;
        final int a3 = this.n - this.m;
        int a4 = this.o - this.m;
        final String a5 = this.t.func_78269_a(this.f.substring(this.m), this.l());
        int n3;
        final int n2 = n3 = a3;
        Label_0190: {
            Label_0189: {
                if (a == 0) {
                    if (n2 < 0) {
                        break Label_0189;
                    }
                    final int n4;
                    n3 = (n4 = a3);
                }
                if (a == 0) {
                    if (n2 > a5.length()) {
                        break Label_0189;
                    }
                    n3 = 1;
                }
                break Label_0190;
            }
            n3 = 0;
        }
        final boolean a6 = n3 != 0;
        boolean k;
        boolean b4;
        int n5;
        final boolean b3 = (n5 = ((b4 = (k = this.k)) ? 1 : 0)) != 0;
        Label_0233: {
            Label_0232: {
                if (a == 0) {
                    if (!b3) {
                        break Label_0232;
                    }
                    b4 = ((n5 = ((k = (this.h / 6 % 2 != 0)) ? 1 : 0)) != 0);
                }
                if (a == 0) {
                    if (n5 != 0) {
                        break Label_0232;
                    }
                    k = (b4 = a6);
                }
                if (a == 0) {
                    if (!b4) {
                        break Label_0232;
                    }
                    k = true;
                }
                break Label_0233;
            }
            k = false;
        }
        final boolean a7 = k;
        e e2 = this;
        int b5 = 0;
        Label_0259: {
            if (a == 0) {
                if (this.i) {
                    b5 = this.b + 4;
                    break Label_0259;
                }
                e2 = this;
            }
            b5 = e2.b;
        }
        final int a8 = b5;
        e e3 = this;
        int c = 0;
        Label_0293: {
            if (a == 0) {
                if (this.i) {
                    c = this.c + (this.e - 8) / 2;
                    break Label_0293;
                }
                e3 = this;
            }
            c = e3.c;
        }
        final int a9 = c;
        int a10 = a8;
        int length;
        int n7;
        final int n6 = n7 = (length = a4);
        if (a == 0) {
            if (n6 > a5.length()) {
                a4 = a5.length();
            }
            final int n8;
            n7 = (n8 = (length = a5.length()));
        }
        if (a == 0) {
            if (n6 > 0) {
                final String a11 = a6 ? a5.substring(0, a3) : a5;
                this.t.func_78276_b(a11, com.sun.jna.z.a.j.e.c.n.d() + 1, com.sun.jna.z.a.j.e.c.n.e() + 16, a2);
            }
            n7 = this.n;
        }
        final int length2;
        if (a == 0) {
            if (n7 >= this.f.length()) {
                length2 = this.f.length();
                if (a == 0) {
                    if (length2 >= this.g()) {}
                }
            }
        }
        final boolean a12 = length2 != 0;
        int a13 = a10;
        int length3;
        int n12;
        int n11;
        int n10;
        final int n9 = n10 = (n11 = (n12 = (length3 = (a6 ? 1 : 0))));
        Label_0500: {
            Label_0495: {
                if (a == 0) {
                    if (n9 == 0) {
                        final int n13 = a3;
                        if (a == 0) {
                            if (n13 > 0) {
                                final int n14 = a8 + this.d;
                            }
                        }
                        a13 = n13;
                        if (a == 0) {
                            break Label_0495;
                        }
                    }
                    final int n15;
                    n10 = (n15 = (n11 = (n12 = (length3 = (a12 ? 1 : 0)))));
                }
                if (a != 0) {
                    break Label_0500;
                }
                if (n9 != 0) {
                    a13 = a10 - 1;
                    --a10;
                }
            }
            n10 = (n12 = (length3 = a5.length()));
        }
        final int n16;
        final int n17;
        if (a == 0) {
            if (n10 > 0) {
                n16 = (n12 = (length3 = (a6 ? 1 : 0)));
                if (a == 0) {
                    if (n16 != 0) {
                        n17 = (length3 = a3);
                        if (a == 0) {
                            if (n17 < a5.length()) {
                                this.t.func_78276_b(a5.substring(a3), a10, a9, a2);
                            }
                        }
                    }
                }
            }
        }
        if (a == 0 && n16 != 0) {
            final boolean b6 = a12;
            Label_0650: {
                if (a == 0) {
                    if (b6) {
                        Gui.func_73734_a(a13, a9 - 1, a13 + 1, a9 + 1 + this.t.field_78288_b, -3092272);
                        if (a == 0) {
                            goto Label_0651;
                        }
                    }
                    this.t.func_78276_b("_", com.sun.jna.z.a.j.e.c.n.d() + 2 + this.t.func_78256_a(a5), com.sun.jna.z.a.j.e.c.n.e() + 15, a2);
                    break Label_0650;
                }
                break Label_0650;
            }
            goto Label_0651;
        }
        final int n18 = a3;
        if (a == 0) {
            if (n17 != n18) {
                this.a.func_78256_a(a5.substring(0, a4));
            }
        }
    }
    
    public void f(final int a) {
        final int h = a.h ? 1 : 0;
        this.g = a;
        final int a2 = h;
        e e = this;
        if (a2 == 0) {
            if (this.f.length() <= a) {
                return;
            }
            e = this;
        }
        e.f = this.f.substring(0, a);
    }
    
    public int g() {
        return this.g;
    }
    
    public int h() {
        return this.n;
    }
    
    public boolean i() {
        return this.i;
    }
    
    public void a(final boolean a) {
        this.i = a;
    }
    
    public void g(final int a) {
        this.p = a;
    }
    
    public void h(final int a) {
        this.q = a;
    }
    
    public void b(final boolean a) {
        final int a2 = a.h ? 1 : 0;
        if (a2 == 0) {
            e e = null;
            Label_0029: {
                if (a) {
                    e = this;
                    if (a2 != 0) {
                        break Label_0029;
                    }
                    if (!this.k) {
                        this.h = 0;
                    }
                }
                e = this;
            }
            e.k = a;
        }
    }
    
    public boolean j() {
        return this.k;
    }
    
    public void c(final boolean a) {
        this.l = a;
    }
    
    public int k() {
        return this.o;
    }
    
    public int l() {
        final int a = com.sun.jna.z.a.a.a.h ? 1 : 0;
        e e = this;
        if (a == 0) {
            if (this.i()) {
                return this.d - 8;
            }
            e = this;
        }
        return e.d;
    }
    
    public void i(final int a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0         /* a */
        //     4: getfield        com/sun/jna/z/a/a/e.f:Ljava/lang/String;
        //     7: invokevirtual   java/lang/String.length:()I
        //    10: istore_3       
        //    11: istore_2        /* a */
        //    12: iload_1         /* a */
        //    13: iload_2         /* a */
        //    14: ifne            24
        //    17: iload_3         /* a */
        //    18: if_icmple       23
        //    21: iload_3         /* a */
        //    22: istore_1        /* a */
        //    23: iload_1         /* a */
        //    24: iload_2         /* a */
        //    25: ifne            32
        //    28: ifge            33
        //    31: iconst_0       
        //    32: istore_1        /* a */
        //    33: aload_0         /* a */
        //    34: iload_1         /* a */
        //    35: putfield        com/sun/jna/z/a/a/e.o:I
        //    38: aload_0         /* a */
        //    39: iload_2         /* a */
        //    40: ifne            50
        //    43: getfield        com/sun/jna/z/a/a/e.a:Lnet/minecraft/client/gui/FontRenderer;
        //    46: ifnull          231
        //    49: aload_0         /* a */
        //    50: getfield        com/sun/jna/z/a/a/e.m:I
        //    53: iload_2         /* a */
        //    54: ifne            70
        //    57: iload_3         /* a */
        //    58: if_icmple       66
        //    61: aload_0         /* a */
        //    62: iload_3         /* a */
        //    63: putfield        com/sun/jna/z/a/a/e.m:I
        //    66: aload_0         /* a */
        //    67: invokevirtual   com/sun/jna/z/a/a/e.l:()I
        //    70: istore          a
        //    72: aload_0         /* a */
        //    73: getfield        com/sun/jna/z/a/a/e.a:Lnet/minecraft/client/gui/FontRenderer;
        //    76: aload_0         /* a */
        //    77: getfield        com/sun/jna/z/a/a/e.f:Ljava/lang/String;
        //    80: aload_0         /* a */
        //    81: getfield        com/sun/jna/z/a/a/e.m:I
        //    84: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    87: iload           a
        //    89: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78269_a:(Ljava/lang/String;I)Ljava/lang/String;
        //    92: astore          a
        //    94: aload           a
        //    96: invokevirtual   java/lang/String.length:()I
        //    99: aload_0         /* a */
        //   100: getfield        com/sun/jna/z/a/a/e.m:I
        //   103: iadd           
        //   104: istore          a
        //   106: iload_1         /* a */
        //   107: aload_0         /* a */
        //   108: getfield        com/sun/jna/z/a/a/e.m:I
        //   111: iload_2         /* a */
        //   112: ifne            147
        //   115: if_icmpne       144
        //   118: aload_0         /* a */
        //   119: dup            
        //   120: getfield        com/sun/jna/z/a/a/e.m:I
        //   123: aload_0         /* a */
        //   124: getfield        com/sun/jna/z/a/a/e.a:Lnet/minecraft/client/gui/FontRenderer;
        //   127: aload_0         /* a */
        //   128: getfield        com/sun/jna/z/a/a/e.f:Ljava/lang/String;
        //   131: iload           a
        //   133: iconst_1       
        //   134: invokevirtual   net/minecraft/client/gui/FontRenderer.func_78262_a:(Ljava/lang/String;IZ)Ljava/lang/String;
        //   137: invokevirtual   java/lang/String.length:()I
        //   140: isub           
        //   141: putfield        com/sun/jna/z/a/a/e.m:I
        //   144: iload_1         /* a */
        //   145: iload           a
        //   147: iload_2         /* a */
        //   148: ifne            180
        //   151: if_icmple       171
        //   154: aload_0         /* a */
        //   155: dup            
        //   156: getfield        com/sun/jna/z/a/a/e.m:I
        //   159: iload_1         /* a */
        //   160: iload           a
        //   162: isub           
        //   163: iadd           
        //   164: putfield        com/sun/jna/z/a/a/e.m:I
        //   167: iload_2         /* a */
        //   168: ifeq            198
        //   171: iload_1         /* a */
        //   172: iload_2         /* a */
        //   173: ifne            202
        //   176: aload_0         /* a */
        //   177: getfield        com/sun/jna/z/a/a/e.m:I
        //   180: if_icmpgt       198
        //   183: aload_0         /* a */
        //   184: dup            
        //   185: getfield        com/sun/jna/z/a/a/e.m:I
        //   188: aload_0         /* a */
        //   189: getfield        com/sun/jna/z/a/a/e.m:I
        //   192: iload_1         /* a */
        //   193: isub           
        //   194: isub           
        //   195: putfield        com/sun/jna/z/a/a/e.m:I
        //   198: aload_0         /* a */
        //   199: getfield        com/sun/jna/z/a/a/e.m:I
        //   202: iload_2         /* a */
        //   203: ifne            222
        //   206: ifge            214
        //   209: aload_0         /* a */
        //   210: iconst_0       
        //   211: putfield        com/sun/jna/z/a/a/e.m:I
        //   214: aload_0         /* a */
        //   215: iload_2         /* a */
        //   216: ifne            227
        //   219: getfield        com/sun/jna/z/a/a/e.m:I
        //   222: iload_3         /* a */
        //   223: if_icmple       231
        //   226: aload_0         /* a */
        //   227: iload_3         /* a */
        //   228: putfield        com/sun/jna/z/a/a/e.m:I
        //   231: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.FileSaver.doSaveJarDecompiled(FileSaver.java:191)
        //     at us.deathmarine.luyten.FileSaver.access$300(FileSaver.java:46)
        //     at us.deathmarine.luyten.FileSaver$4.run(FileSaver.java:112)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void d(final boolean a) {
        this.j = a;
    }
    
    public boolean m() {
        return this.r;
    }
    
    public void e(final boolean a) {
        this.r = a;
    }
}
