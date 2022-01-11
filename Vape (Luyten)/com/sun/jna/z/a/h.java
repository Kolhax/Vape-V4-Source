package com.sun.jna.z.a;

import com.sun.jna.z.a.g.*;
import com.sun.jna.z.a.e.*;
import net.minecraftforge.client.event.*;
import md.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraft.client.entity.*;

public class h
{
    Entity a;
    c b;
    c c;
    boolean d;
    double e;
    Entity f;
    boolean g;
    p h;
    private static final String[] i;
    
    public h() {
        this.e = 3.0;
        this.h = new p();
        final g a2 = com.sun.jna.z.a.i.d.a;
        final String[] a = com.sun.jna.z.a.h.i;
        this.b = a2.a(a[0]);
        this.c = com.sun.jna.z.a.i.d.a.a(a[1]);
    }
    
    public void a(final MouseEvent a) {
        boolean a2 = false;
        boolean a3 = false;
        final int a4 = com.sun.jna.z.a.i.n ? 1 : 0;
        double a5 = 0.0;
        c c2;
        final c c = c2 = this.b;
        final double a7;
        Label_0067: {
            if (a4 == 0) {
                if (c != null) {
                    final a a6 = (a)this.b;
                    final a c3;
                    final j j = (j)(c3 = (a)(c2 = a6));
                    if (a4 != 0) {
                        break Label_0067;
                    }
                    if (j.c()) {
                        a2 = true;
                        a7 = a6.n.a();
                    }
                }
                a c3;
                c2 = (c3 = (a)this.c);
            }
        }
        boolean c4 = false;
        final boolean b;
        Label_0111: {
            Label_0110: {
                if (a4 == 0) {
                    if (c == null) {
                        break Label_0110;
                    }
                    c2 = this.c;
                }
                final j a8 = (j)c2;
                b = (c4 = a8.c());
                if (a4 != 0) {
                    break Label_0111;
                }
                if (b) {
                    a3 = true;
                    a5 = a8.n.a();
                }
            }
            final boolean b2;
            c4 = (b2 = a2);
        }
        Label_0124: {
            if (a4 == 0) {
                if (b) {
                    break Label_0124;
                }
                c4 = a3;
            }
            if (!c4) {
                return;
            }
        }
        final Minecraft a9 = Minecraft.func_71410_x();
        final Entity a10 = a9.func_175606_aa();
        if (a10 != null) {
            final Minecraft minecraft = a9;
            if (a4 == 0) {
                if (minecraft.field_71441_e == null) {
                    return;
                }
                a9.field_147125_j = null;
            }
            double a11 = minecraft.field_71442_b.func_78757_d();
            a9.field_71476_x = a10.func_174822_a(a11, 0.0f);
            double a12 = a11;
            final Vec3 a13 = a10.func_174824_e(0.0f);
            boolean a14 = false;
            final int a15 = 3;
            double func_78749_i;
            int n2;
            final int n = n2 = (int)(func_78749_i = (a9.field_71442_b.func_78749_i() ? 1 : 0));
            Label_0246: {
                if (a4 == 0) {
                    if (n != 0) {
                        a11 = 6.0;
                        a12 = 6.0;
                        if (a4 == 0) {
                            break Label_0246;
                        }
                    }
                    func_78749_i = (n2 = dcmpl(a11, 3.0));
                }
                if (a4 == 0) {
                    if (n2 <= 0) {
                        break Label_0246;
                    }
                    func_78749_i = 1;
                }
                a14 = (func_78749_i != 0.0);
            }
            final MovingObjectPosition field_71476_x = a9.field_71476_x;
            Label_0273: {
                if (a4 == 0) {
                    if (field_71476_x == null) {
                        break Label_0273;
                    }
                    final MovingObjectPosition field_71476_x2 = a9.field_71476_x;
                }
                a12 = field_71476_x.field_72307_f.func_72438_d(a13);
            }
            final boolean b3 = a2;
            Label_0462: {
                h h = null;
                Label_0456: {
                    if (a4 == 0) {
                        if (!b3) {
                            break Label_0462;
                        }
                        a12 = a7;
                        a11 = a7;
                        h = this;
                        if (a4 != 0) {
                            break Label_0456;
                        }
                        final boolean d = this.d;
                    }
                    if (b3) {
                        h = this;
                        if (a4 != 0) {
                            break Label_0456;
                        }
                        if (((a)this.b).o.a()) {
                            h h2 = this;
                            final double e;
                            Label_0449: {
                                Label_0446: {
                                    if (a4 == 0) {
                                        if (this.f != null) {
                                            double field_70172_ad;
                                            final int n3 = (int)(field_70172_ad = this.f.field_70172_ad);
                                            if (a4 == 0) {
                                                if (n3 > 18) {
                                                    this.g = true;
                                                }
                                                e = this.e;
                                                if (a4 != 0) {
                                                    break Label_0449;
                                                }
                                                field_70172_ad = dcmpg(e, a7);
                                            }
                                            if (field_70172_ad < 0) {
                                                h2 = this;
                                                if (a4 != 0) {
                                                    break Label_0446;
                                                }
                                                if (this.g) {
                                                    h2 = this;
                                                    if (a4 != 0) {
                                                        break Label_0446;
                                                    }
                                                    if (this.f.field_70172_ad <= 18) {
                                                        this.g = false;
                                                        this.e += 0.5;
                                                        h h3 = this;
                                                        if (a4 == 0) {
                                                            if (this.e > a7) {
                                                                this.e = a7;
                                                            }
                                                            h3 = this;
                                                        }
                                                        h3.h.c();
                                                    }
                                                }
                                            }
                                        }
                                        a12 = this.e;
                                        h2 = this;
                                    }
                                }
                                final double e2 = h2.e;
                            }
                            a11 = e;
                            if (a4 == 0) {
                                break Label_0462;
                            }
                        }
                    }
                    h = this;
                }
                h.e = 3.0;
            }
            final Vec3 a16 = a10.func_70676_i(0.0f);
            final Vec3 a17 = a13.func_72441_c(a16.field_72450_a * a11, a16.field_72448_b * a11, a16.field_72449_c * a11);
            this.a = null;
            Vec3 a18 = null;
            final float a19 = 1.0f;
            final List<Entity> a20 = (List<Entity>)a9.field_71441_e.func_72839_b(a10, a10.func_174813_aQ().func_72321_a(a16.field_72450_a * a11, a16.field_72448_b * a11, a16.field_72449_c * a11).func_72314_b((double)a19, (double)a19, (double)a19));
            double a21 = a12;
            int a22 = 0;
        Label_1112:
            while (true) {
            Label_1111_Outer:
                while (true) {
                    h h5 = null;
                    Label_1083: {
                        while (true) {
                            while (a22 < a20.size()) {
                                final Entity entity;
                                final Entity a23 = entity = a20.get(a22);
                                Label_0790: {
                                    if (a4 == 0) {
                                        final boolean func_70067_L = entity.func_70067_L();
                                        if (a4 != 0) {
                                            if (func_70067_L) {
                                                this.d = false;
                                                this.h.c();
                                            }
                                            final h h4 = this;
                                            h4.f = this.a;
                                            return;
                                        }
                                        if (!func_70067_L && a4 == 0) {
                                            break Label_0790;
                                        }
                                    }
                                    final float a24 = (float)(entity.func_70111_Y() + (a3 ? a5 : 0.0));
                                    final AxisAlignedBB a25 = a23.func_174813_aQ().func_72314_b((double)a24, (double)a24, (double)a24);
                                    final MovingObjectPosition a26 = a25.func_72327_a(a13, a17);
                                    double func_72318_a;
                                    final int n4 = (int)(func_72318_a = (a25.func_72318_a(a13) ? 1 : 0));
                                    Label_0727: {
                                        if (a4 == 0) {
                                            if (n4 == 0) {
                                                break Label_0727;
                                            }
                                            func_72318_a = dcmpl(a21, 0.0);
                                        }
                                        if (func_72318_a < 0) {
                                            break Label_0790;
                                        }
                                        this.a = a23;
                                        final MovingObjectPosition movingObjectPosition = a26;
                                        a18 = ((a4 == 0 && movingObjectPosition == null) ? a13 : movingObjectPosition.field_72307_f);
                                        a21 = 0.0;
                                        if (a4 == 0) {
                                            break Label_0790;
                                        }
                                    }
                                    if (a26 != null) {
                                        final double a27 = a13.func_72438_d(a26.field_72307_f);
                                        final double n5 = dcmpg(a27, a21);
                                        Label_0763: {
                                            if (a4 == 0) {
                                                if (n5 < 0) {
                                                    break Label_0763;
                                                }
                                                final double n6 = dcmpl(a21, 0.0);
                                            }
                                            if (n5 != 0) {
                                                break Label_0790;
                                            }
                                        }
                                        if (a23 == a10.field_70154_o) {}
                                        this.a = a23;
                                        a18 = a26.field_72307_f;
                                        a21 = a27;
                                    }
                                }
                                ++a22;
                                if (a4 != 0) {
                                    break;
                                }
                            }
                            Entity entity3;
                            Object a29;
                            final Entity entity2 = (Entity)(a29 = (entity3 = this.a));
                            Label_0892: {
                                if (a4 == 0) {
                                    Label_0888: {
                                        if (entity2 != null) {
                                            double func_70685_l;
                                            int n8;
                                            final int n7 = n8 = (int)(func_70685_l = (a14 ? 1 : 0));
                                            if (a4 == 0) {
                                                if (n7 == 0) {
                                                    break Label_0888;
                                                }
                                                func_70685_l = (n8 = dcmpl(a13.func_72438_d(a18), a7));
                                            }
                                            if (a4 == 0) {
                                                if (n8 <= 0) {
                                                    break Label_0888;
                                                }
                                                final Object o = a29 = (entity3 = (Entity)a9.field_71439_g);
                                                if (a4 != 0) {
                                                    break Label_0892;
                                                }
                                                func_70685_l = (((EntityPlayerSP)o).func_70685_l(this.a) ? 1 : 0);
                                            }
                                            if (func_70685_l != 0) {
                                                this.a = null;
                                                a9.field_71476_x = new MovingObjectPosition(MovingObjectPosition$MovingObjectType.MISS, a18, (EnumFacing)null, new BlockPos(a18));
                                            }
                                        }
                                    }
                                    entity3 = (Entity)(a29 = this.a);
                                }
                            }
                            Label_1012: {
                                if (a4 == 0) {
                                    Label_1004: {
                                        if (a29 != null) {
                                            final double n9 = dcmpg(a21, a12);
                                            if (a4 == 0) {
                                                if (n9 < 0) {
                                                    goto Label_0923;
                                                }
                                                final Minecraft minecraft2 = a9;
                                                if (a4 == 0 && minecraft2.field_71476_x != null) {
                                                    break Label_1004;
                                                }
                                                final EntityPlayerSP entityPlayerSP = (EntityPlayerSP)(entity3 = (Entity)minecraft2.field_71439_g);
                                                if (a4 != 0) {
                                                    break Label_1012;
                                                }
                                                entityPlayerSP.func_70685_l(this.a);
                                            }
                                            if (n9 != 0) {
                                                a9.field_71476_x = new MovingObjectPosition(this.a, a18);
                                                final Entity entity4 = entity3 = this.a;
                                                if (a4 != 0) {
                                                    break Label_1012;
                                                }
                                                if (entity4 instanceof EntityLivingBase) {
                                                    final EntityLivingBase a28 = (EntityLivingBase)this.a;
                                                    final EntityLivingBase entityLivingBase = (EntityLivingBase)(entity3 = (Entity)a28);
                                                    if (a4 != 0) {
                                                        break Label_1012;
                                                    }
                                                    if (!entityLivingBase.field_70128_L) {
                                                        a9.field_147125_j = this.a;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    final h h4 = this;
                                    h5 = this;
                                    if (a4 != 0) {
                                        break Label_1083;
                                    }
                                    entity3 = this.f;
                                }
                            }
                            if (entity3 != null) {
                                final boolean equals = this.f.equals((Object)this.a);
                                if (a4 == 0) {
                                    if (equals) {
                                        this.d = true;
                                        this.h.c();
                                        if (a4 == 0) {
                                            continue;
                                        }
                                    }
                                    final h h4 = this;
                                    if (a4 != 0) {
                                        continue Label_1112;
                                    }
                                    this.h.a(100L);
                                }
                                if (!equals) {
                                    continue;
                                }
                                this.d = false;
                                this.h.c();
                                if (a4 == 0) {
                                    continue;
                                }
                            }
                            break;
                        }
                        final h h4 = this;
                        h5 = this;
                    }
                    if (a4 == 0) {
                        h5.h.a(100L);
                        continue Label_1111_Outer;
                    }
                    break;
                }
                continue Label_1112;
            }
        }
    }
    
    static {
        final String[] j = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "\u00d5\u008e\u00e0f\u0002\b\u00cf\u0082\u00f5G\u0005\u00c8[\u00f4").length();
        int char1 = 5;
        int n2 = -1;
        Label_0021: {
            break Label_0021;
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
                    Label_0187: {
                        if (n4 > 1) {
                            break Label_0187;
                        }
                        length2 = (n5 = n6);
                        do {
                            final char c = charArray[n5];
                            char c2 = '\0';
                            switch (n6 % 7) {
                                case 0: {
                                    c2 = '\u0087';
                                    break;
                                }
                                case 1: {
                                    c2 = '\u00eb';
                                    break;
                                }
                                case 2: {
                                    c2 = '\u0081';
                                    break;
                                }
                                case 3: {
                                    c2 = '\u0005';
                                    break;
                                }
                                case 4: {
                                    c2 = 'j';
                                    break;
                                }
                                case 5: {
                                    c2 = '°';
                                    break;
                                }
                                default: {
                                    c2 = '>';
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
                j[n++] = new String(charArray).intern();
            } while ((n2 += char1) < length);
        }
        i = j;
    }
}
