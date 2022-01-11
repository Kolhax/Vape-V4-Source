package md;

import com.sun.jna.z.a.e.*;
import com.sun.jna.z.a.f.a.a.a.a.a.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraftforge.client.*;
import net.minecraft.client.resources.model.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import org.lwjgl.opengl.*;
import java.text.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import net.minecraft.enchantment.*;
import net.minecraft.client.*;
import java.util.*;
import net.minecraft.client.gui.*;
import net.minecraft.nbt.*;
import net.minecraft.client.renderer.tileentity.*;
import java.lang.reflect.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraftforge.client.model.pipeline.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.util.*;
import com.sun.jna.z.a.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class h extends c
{
    Method n;
    Method o;
    i p;
    i q;
    public static boolean r;
    public static int s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static int w;
    public static boolean x;
    public static boolean y;
    public static int z;
    public static int A;
    public static boolean B;
    public static int C;
    public static boolean D;
    public static int E;
    public static boolean F;
    public static boolean G;
    public static int H;
    public static boolean I;
    public static boolean J;
    public static boolean K;
    private static final String[] L;
    
    public h() {
        final String[] a = h.L;
        super(a[12], com.sun.jna.z.a.e.b.Render, -16711681);
        this.p = new d(a[1]);
        this.q = new d(a[4]);
        try {
            (this.n = RenderItem.class.getDeclaredMethod(a[5], ItemTransformVec3f.class)).setAccessible(true);
            this.o = ForgeHooksClient.class.getDeclaredMethod(a[3], IBakedModel.class, ItemCameraTransforms$TransformType.class);
        }
        catch (Exception a2) {
            a2.printStackTrace();
        }
    }
    
    @Override
    public void a(final float a) {
        final int k = h.K ? 1 : 0;
        final Iterator<Object> iterator = (Iterator<Object>)this.a.field_71441_e.field_73010_i.iterator();
        final int a2 = k;
        while (iterator.hasNext()) {
            final Object a3 = iterator.next();
            final EntityPlayer a4 = (EntityPlayer)a3;
            if (a2 != 0) {
                return;
            }
            if (!this.e((Entity)a4) && a2 == 0) {
                continue;
            }
            final double a5 = a4.field_70142_S + (a4.field_70165_t - a4.field_70142_S) * a - com.sun.jna.z.a.i.d.i.a();
            final double a6 = a4.field_70137_T + (a4.field_70163_u - a4.field_70137_T) * a - com.sun.jna.z.a.i.d.i.b();
            final double a7 = a4.field_70136_U + (a4.field_70161_v - a4.field_70136_U) * a - com.sun.jna.z.a.i.d.i.c();
            this.a((EntityLivingBase)a4, a5, a6, a7);
            if (a2 != 0) {
                break;
            }
        }
        GL11.glColor3d(1.0, 1.0, 1.0);
    }
    
    private boolean e(final Entity a) {
        final int a2 = h.K ? 1 : 0;
        Entity entity = a;
        Entity entity2 = a;
        final boolean func_70089_S;
        if (a2 == 0) {
            if (a == null) {
                return func_70089_S;
            }
            entity = a;
            entity2 = a;
        }
        if (a2 == 0) {
            if (entity2 == this.a.field_71439_g) {
                return func_70089_S;
            }
            entity = a;
        }
        func_70089_S = entity.func_70089_S();
        if (a2 == 0 && !func_70089_S) {}
        return func_70089_S;
    }
    
    public void a(final EntityLivingBase a, final double a, final double a, final double a) {
        String[] a2 = h.L;
        final DecimalFormat a3 = new DecimalFormat(a2[7]);
        final int k = h.K ? 1 : 0;
        String a4 = a.func_145748_c_().func_150254_d();
        final int a5 = k;
        boolean b;
        final int n = (b = (this.c(a) != 0)) ? 1 : 0;
        if (a5 == 0) {
            if (n != -1) {
                a4 = StringUtils.func_76338_a(a4);
            }
            final boolean b2;
            b = (b2 = (a instanceof EntityPlayer));
        }
        EntityLivingBase entityLivingBase = null;
        Label_0177: {
            Label_0125: {
                if (a5 == 0) {
                    if (n != 0) {
                        final boolean b3 = b = ((EntityPlayer)a).field_71075_bZ.field_75100_b;
                        if (a5 != 0) {
                            break Label_0125;
                        }
                        if (b3) {
                            final StringBuilder sb = new StringBuilder();
                            a2 = h.L;
                            a4 = sb.append(a2[9]).append(a4).toString();
                        }
                    }
                    entityLivingBase = a;
                    if (a5 != 0) {
                        break Label_0177;
                    }
                    b = (a instanceof EntityPlayer);
                }
            }
            if (b) {
                final EntityPlayer entityPlayer = (EntityPlayer)(entityLivingBase = a);
                if (a5 != 0) {
                    break Label_0177;
                }
                if (entityPlayer.field_71075_bZ.field_75098_d) {
                    final StringBuilder sb2 = new StringBuilder();
                    a2 = h.L;
                    a4 = sb2.append(a2[8]).append(a4).toString();
                }
            }
            entityLivingBase = a;
        }
        final double a6 = entityLivingBase.func_110143_aJ() / 2.0f;
        final double a7 = a.func_110138_aP() / 2.0f;
        final double a8 = 100.0 * (a6 / a7);
        double n3;
        final double n2 = n3 = dcmpl(a8, 75.0);
        String a9 = null;
        Label_0287: {
            if (a5 == 0) {
                if (n2 > 0) {
                    a9 = "2";
                    if (a5 == 0) {
                        break Label_0287;
                    }
                    h.r = !h.r;
                }
                final int n4;
                n3 = (n4 = dcmpl(a8, 50.0));
            }
            if (a5 == 0) {
                if (n2 > 0) {
                    a9 = "e";
                    if (a5 == 0) {
                        break Label_0287;
                    }
                }
                n3 = dcmpl(a8, 25.0);
            }
            if (n3 > 0) {
                a9 = "6";
                if (a5 == 0) {
                    break Label_0287;
                }
            }
            a9 = "4";
        }
        final String a10 = a3.format(Math.floor((a6 + 0.25) / 0.5) * 0.5);
        final String a11 = a3.format(Math.floor((a.func_110138_aP() + 0.25) / 0.5) * 0.5);
        h h = this;
        if (a5 == 0) {
            if (this.p.a()) {
                a2 = md.h.L;
                a4 = String.format(a2[10], a4, a9, a10);
            }
            h = this;
        }
        final float a12 = h.a.field_71439_g.func_70032_d((Entity)a);
        final float n5 = a12 / 5.0f;
        final float n6 = 2.0f;
        final float a13 = (a5 == 0 && n5 <= n6) ? 2.0f : (n5 / n6);
        final float a14 = 0.016666668f * a13;
        GlStateManager.func_179094_E();
        RenderHelper.func_74519_b();
        GlStateManager.func_179137_b(a + 0.0, a + a.field_70131_O + 0.5, a);
        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
        final Minecraft a37 = this.a;
        Label_0558: {
            if (a5 == 0) {
                if (a37.field_71474_y.field_74320_O == 2) {
                    GlStateManager.func_179114_b(-this.a.func_175598_ae().field_78735_i, 0.0f, 1.0f, 0.0f);
                    GlStateManager.func_179114_b(this.a.func_175598_ae().field_78732_j, -1.0f, 0.0f, 0.0f);
                    if (a5 == 0) {
                        break Label_0558;
                    }
                }
                GlStateManager.func_179114_b(-this.a.func_175598_ae().field_78735_i, 0.0f, 1.0f, 0.0f);
                final Minecraft a38 = this.a;
            }
            GlStateManager.func_179114_b(a37.func_175598_ae().field_78732_j, 1.0f, 0.0f, 0.0f);
        }
        GlStateManager.func_179152_a(-a14, -a14, a14);
        GlStateManager.func_179140_f();
        GlStateManager.func_179132_a(false);
        GlStateManager.func_179097_i();
        GlStateManager.func_179147_l();
        GlStateManager.func_179120_a(770, 771, 1, 0);
        final Tessellator a15 = Tessellator.func_178181_a();
        final WorldRenderer a16 = a15.func_178180_c();
        int a17 = 0;
        int n8;
        final int n7 = n8 = (a.func_70093_af() ? 1 : 0);
        if (a5 == 0) {
            if (n7 != 0) {
                a17 += 4;
            }
            a17 -= (int)(a12 / 5.0f);
            final int n9;
            n8 = (n9 = a17);
        }
        final int n10 = -8;
        if (a5 == 0) {
            if (n7 < n10) {
                a17 = -8;
            }
            GlStateManager.func_179090_x();
            a16.func_178970_b();
            n8 = this.a.field_71466_p.func_78256_a(a4);
        }
        final int a18 = n8 / n10;
        a16.func_178960_a(0.0f, 0.0f, 0.0f, 0.32f);
        a16.func_178984_b((double)(-a18 - 2), (double)(-2 + a17), 0.0);
        a16.func_178984_b((double)(-a18 - 2), (double)(9 + a17), 0.0);
        a16.func_178984_b((double)(a18 + 2), (double)(9 + a17), 0.0);
        a16.func_178984_b((double)(a18 + 2), (double)(-2 + a17), 0.0);
        a15.func_78381_a();
        GlStateManager.func_179098_w();
        this.a.field_71466_p.func_175065_a(a4, (float)(-a18), (float)a17, this.c(a), true);
        final boolean a39 = this.q.a();
        Label_1611: {
            if (a5 == 0) {
                Label_1607: {
                    if (a39) {
                        final boolean b4 = a instanceof EntityPlayer;
                        if (a5 != 0) {
                            break Label_1611;
                        }
                        if (b4) {
                            final EntityPlayer a19 = (EntityPlayer)a;
                            final List<ItemStack> a20 = new ArrayList<ItemStack>();
                            if (a19.func_71045_bC() != null) {
                                a20.add(a19.func_71045_bC());
                            }
                            int a21 = 3;
                            while (true) {
                                while (a21 >= 0) {
                                    final ItemStack a22 = a19.field_71071_by.field_70460_b[a21];
                                    if (a5 != 0) {
                                        int a23 = 0;
                                        for (ItemStack next : a20) {
                                            Label_1602: {
                                                Label_1593: {
                                                    while (true) {
                                                        final ItemStack a24 = next;
                                                        GlStateManager.func_179094_E();
                                                        RenderHelper.func_74519_b();
                                                        this.a.func_175599_af().field_77023_b = -100.0f;
                                                        this.a(a24, -a18 + a21 + a23, a17 - 20);
                                                        this.a.func_175599_af().func_180453_a(this.a.field_71466_p, a24, -a18 + a21 + a23, a17 - 20, "");
                                                        this.a.func_175599_af().field_77023_b = 0.0f;
                                                        RenderHelper.func_74518_a();
                                                        GlStateManager.func_179141_d();
                                                        GlStateManager.func_179084_k();
                                                        GlStateManager.func_179140_f();
                                                        GlStateManager.func_179121_F();
                                                        GlStateManager.func_179094_E();
                                                        GlStateManager.func_179140_f();
                                                        GlStateManager.func_179132_a(false);
                                                        GlStateManager.func_179097_i();
                                                        GlStateManager.func_179152_a(0.5f, 0.5f, 0.5f);
                                                        if (a5 != 0) {
                                                            return;
                                                        }
                                                        final ItemStack itemStack = a24;
                                                        if (a5 == 0) {
                                                            if (itemStack.func_77973_b() == Items.field_151153_ao) {
                                                                final ItemStack itemStack2 = a24;
                                                                if (a5 == 0) {
                                                                    if (itemStack2.func_77962_s()) {
                                                                        final FontRenderer field_71466_p = this.a.field_71466_p;
                                                                        a2 = md.h.L;
                                                                        field_71466_p.func_175063_a(a2[6], (float)((-a18 + a21 + a23) * 2), (float)((a17 - 20) * 2), -65536);
                                                                        if (a5 == 0) {
                                                                            break Label_1593;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        final NBTTagList a25 = itemStack.func_77986_q();
                                                        if (a5 != 0) {
                                                            break Label_1602;
                                                        }
                                                        if (a25 == null) {
                                                            break Label_1593;
                                                        }
                                                        int a26 = 0;
                                                        final Enchantment[] a27 = { Enchantment.field_180310_c, Enchantment.field_77347_r, Enchantment.field_180314_l, Enchantment.field_77334_n, Enchantment.field_77349_p, Enchantment.field_180309_e, Enchantment.field_77345_t, Enchantment.field_77343_v, Enchantment.field_77344_u, Enchantment.field_77346_s, Enchantment.field_77342_w, Enchantment.field_92091_k };
                                                        final int func_74745_c = a25.func_74745_c();
                                                        if (a5 == 0 && func_74745_c >= 6) {
                                                            break;
                                                        }
                                                        int a28 = func_74745_c;
                                                        while (a28 < a25.func_74745_c()) {
                                                            final NBTTagCompound func_150305_b = a25.func_150305_b(a28);
                                                            a2 = md.h.L;
                                                            final short a29 = func_150305_b.func_74765_d(a2[0]);
                                                            final short a30 = a25.func_150305_b(a28).func_74765_d(a2[2]);
                                                            final Enchantment a31 = Enchantment.func_180306_c((int)a29);
                                                            if (a5 == 0) {
                                                                final Enchantment enchantment = (Enchantment)(next = (ItemStack)a31);
                                                                if (a5 != 0) {
                                                                    continue Label_1602;
                                                                }
                                                                if (enchantment != null) {
                                                                    final Enchantment[] a32 = a27;
                                                                    final int a33 = a32.length;
                                                                    int a34 = 0;
                                                                    while (a34 < a33) {
                                                                        final Enchantment a35 = a32[a34];
                                                                        if (a5 == 0) {
                                                                            final Enchantment enchantment2 = (Enchantment)(next = (ItemStack)a31);
                                                                            if (a5 != 0) {
                                                                                continue Label_1602;
                                                                            }
                                                                            if (enchantment2 == a35) {
                                                                                String a36 = a31.func_77316_c((int)a30).substring(0, 1).toLowerCase();
                                                                                Label_1531: {
                                                                                    Label_1509: {
                                                                                        if (a5 == 0) {
                                                                                            if (a30 <= 99) {
                                                                                                break Label_1509;
                                                                                            }
                                                                                            a36 += md.h.L[11];
                                                                                        }
                                                                                        if (a5 == 0) {
                                                                                            break Label_1531;
                                                                                        }
                                                                                    }
                                                                                    a36 += a30;
                                                                                }
                                                                                this.a.field_71466_p.func_175063_a(a36, (float)((-a18 + a21 + a23) * 2), (float)((a17 - 20 + a26) * 2), -5592406);
                                                                                a26 += 5;
                                                                                if (a5 == 0) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            ++a34;
                                                                        }
                                                                        if (a5 != 0) {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                ++a28;
                                                            }
                                                            if (a5 != 0) {
                                                                break;
                                                            }
                                                        }
                                                        break Label_1593;
                                                    }
                                                    final FontRenderer field_71466_p2 = this.a.field_71466_p;
                                                    a2 = md.h.L;
                                                    field_71466_p2.func_175063_a(a2[6], (float)((-a18 + a21 + a23) * 2), (float)((a17 - 20) * 2), -65536);
                                                    if (a5 != 0) {
                                                        goto Label_1334;
                                                    }
                                                }
                                                GlStateManager.func_179145_e();
                                                GlStateManager.func_179121_F();
                                                a23 += 18;
                                            }
                                            if (a5 != 0) {
                                                break;
                                            }
                                        }
                                        break Label_1607;
                                    }
                                    if (a5 == 0) {
                                        if (a22 != null) {
                                            a20.add(a22);
                                        }
                                        --a21;
                                    }
                                    if (a5 != 0) {
                                        break;
                                    }
                                }
                                a21 = a18 - (a20.size() - 1) * 9 - 9;
                                continue;
                            }
                        }
                    }
                }
                GlStateManager.func_179126_j();
            }
        }
        GlStateManager.func_179132_a(a39);
        GlStateManager.func_179145_e();
        GlStateManager.func_179084_k();
        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
        RenderHelper.func_74518_a();
        GlStateManager.func_179121_F();
    }
    
    public void a(final ItemStack a, final int a, final int a) {
        final int a2 = h.K ? 1 : 0;
        Label_0025: {
            try {
                if (a2 != 0) {
                    break Label_0025;
                }
                if (a == null) {
                    return;
                }
            }
            catch (Throwable t) {
                throw t;
            }
            try {
                this.b(a, a, a);
            }
            catch (Throwable t2) {}
        }
    }
    
    public void b(final ItemStack a, final int a, final int a) throws Exception {
        final RenderItem a2 = this.a.func_175599_af();
        IBakedModel a3 = a2.func_175037_a().func_178089_a(a);
        GlStateManager.func_179094_E();
        this.a.func_110434_K().func_110577_a(TextureMap.field_110575_b);
        this.a.func_110434_K().func_110581_b(TextureMap.field_110575_b).func_174936_b(false, false);
        GlStateManager.func_179091_B();
        GlStateManager.func_179141_d();
        GlStateManager.func_179092_a(516, 0.1f);
        final int k = h.K ? 1 : 0;
        GlStateManager.func_179147_l();
        GlStateManager.func_179112_b(770, 771);
        GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a(a, a, a3.func_177556_c());
        a3 = (IBakedModel)this.o.invoke(null, a3, ItemCameraTransforms$TransformType.GUI);
        this.a(a, a3);
        GlStateManager.func_179118_c();
        GlStateManager.func_179101_C();
        GlStateManager.func_179140_f();
        final int a4 = k;
        boolean i = false;
        Label_0206: {
            Label_0200: {
                try {
                    GlStateManager.func_179121_F();
                    this.a.func_110434_K().func_110577_a(TextureMap.field_110575_b);
                    this.a.func_110434_K().func_110581_b(TextureMap.field_110575_b).func_174935_a();
                    if (!h.r) {
                        return;
                    }
                    final int n = a4;
                    if (n != 0) {
                        break Label_0200;
                    }
                    break Label_0200;
                }
                catch (Exception ex) {
                    throw ex;
                }
                try {
                    final int n = a4;
                    if (n != 0) {
                        i = false;
                        break Label_0206;
                    }
                }
                catch (Exception ex2) {
                    throw ex2;
                }
            }
            i = true;
        }
        h.K = i;
    }
    
    void a(final int a, final int a, final boolean a) {
        GlStateManager.func_179109_b((float)a, (float)a, 100.0f + this.a.func_175599_af().field_77023_b);
        GlStateManager.func_179109_b(8.0f, 8.0f, 0.0f);
        final int k = h.K ? 1 : 0;
        GlStateManager.func_179152_a(1.0f, 1.0f, -1.0f);
        GlStateManager.func_179152_a(0.5f, 0.5f, 0.5f);
        final int a2 = k;
        if (a2 == 0) {
            if (a) {
                GlStateManager.func_179152_a(40.0f, 40.0f, 40.0f);
                GlStateManager.func_179114_b(210.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.func_179114_b(-135.0f, 0.0f, 1.0f, 0.0f);
                GlStateManager.func_179145_e();
                if (a2 == 0) {
                    return;
                }
            }
            GlStateManager.func_179152_a(64.0f, 64.0f, 64.0f);
            GlStateManager.func_179114_b(180.0f, 1.0f, 0.0f, 0.0f);
        }
        GlStateManager.func_179140_f();
    }
    
    public void a(final ItemStack a, final IBakedModel a) throws InvocationTargetException, IllegalAccessException {
        final int k = h.K ? 1 : 0;
        this.a.func_175599_af();
        final int a2 = k;
        Label_0110: {
            Label_0107: {
                Label_0088: {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    Label_0042: {
                                                        try {
                                                            GlStateManager.func_179094_E();
                                                            GlStateManager.func_179152_a(0.5f, 0.5f, 0.5f);
                                                            if (a2 != 0) {
                                                                break Label_0107;
                                                            }
                                                            final IBakedModel bakedModel = a;
                                                            final boolean b = bakedModel.func_177553_d();
                                                            if (b) {
                                                                break Label_0042;
                                                            }
                                                            break Label_0088;
                                                        }
                                                        catch (IllegalAccessException ex) {
                                                            throw ex;
                                                        }
                                                        try {
                                                            final IBakedModel bakedModel = a;
                                                            final boolean b = bakedModel.func_177553_d();
                                                            if (b) {
                                                                GlStateManager.func_179114_b(180.0f, 0.0f, 1.0f, 0.0f);
                                                                GlStateManager.func_179109_b(-0.5f, -0.5f, -0.5f);
                                                                GlStateManager.func_179131_c(1.0f, 1.0f, 1.0f, 1.0f);
                                                                GlStateManager.func_179091_B();
                                                                TileEntityItemStackRenderer.field_147719_a.func_179022_a(a);
                                                                break Label_0110;
                                                            }
                                                        }
                                                        catch (IllegalAccessException ex2) {
                                                            throw ex2;
                                                        }
                                                    }
                                                }
                                                catch (IllegalAccessException ex3) {
                                                    throw ex3;
                                                }
                                            }
                                            catch (InvocationTargetException ex4) {
                                                throw ex4;
                                            }
                                        }
                                        catch (IllegalAccessException ex5) {
                                            throw ex5;
                                        }
                                    }
                                    catch (InvocationTargetException ex6) {
                                        throw ex6;
                                    }
                                }
                                catch (IllegalAccessException ex7) {
                                    throw ex7;
                                }
                            }
                            catch (InvocationTargetException ex8) {
                                throw ex8;
                            }
                        }
                        catch (IllegalAccessException ex9) {
                            throw ex9;
                        }
                    }
                    catch (InvocationTargetException ex10) {
                        throw ex10;
                    }
                }
                GlStateManager.func_179109_b(-0.5f, -0.5f, -0.5f);
                GL11.glPushMatrix();
                this.a(a, -1, a);
            }
            GL11.glPopMatrix();
        }
        GlStateManager.func_179121_F();
    }
    
    private void a(final WorldRenderer a, final List a, final int a, final ItemStack a) {
        final int a2 = h.K ? 1 : 0;
        final boolean a3 = a == -1 && a != null;
        for (final BakedQuad a5 : a) {
            int a6 = a;
            if (a2 == 0) {
                Label_0120: {
                    if (a3) {
                        int func_178212_b;
                        final boolean b = (func_178212_b = (a5.func_178212_b() ? 1 : 0)) != 0;
                        if (a2 == 0) {
                            if (!b) {
                                break Label_0120;
                            }
                            a6 = a.func_77973_b().func_82790_a(a, a5.func_178211_c());
                            final boolean field_78517_a;
                            func_178212_b = ((field_78517_a = EntityRenderer.field_78517_a) ? 1 : 0);
                        }
                        if (a2 == 0) {
                            if (b) {
                                a6 = TextureUtil.func_177054_c(a6);
                            }
                            func_178212_b = (a6 | 0xFF000000);
                        }
                        a6 = func_178212_b;
                    }
                }
                LightUtil.renderQuadColor(a, a5, a6);
            }
            if (a2 != 0) {
                break;
            }
        }
    }
    
    private void a(final IBakedModel a, final int a, final ItemStack a) {
        final int k = h.K ? 1 : 0;
        final Tessellator a2 = Tessellator.func_178181_a();
        final int a3 = k;
        final WorldRenderer a4 = a2.func_178180_c();
        a4.func_178970_b();
        a4.func_178967_a(DefaultVertexFormats.field_176599_b);
        final EnumFacing[] a5 = EnumFacing.values();
        final int a6 = a5.length;
        int a7 = 0;
        while (a7 < a6) {
            final EnumFacing a8 = a5[a7];
            this.a(a4, a.func_177551_a(a8), a, a);
            ++a7;
            if (a3 != 0) {
                return;
            }
            if (a3 != 0) {
                break;
            }
        }
        this.a(a4, a.func_177550_a(), a, a);
        a2.func_78381_a();
    }
    
    public int c(final EntityLivingBase a) {
        final int k = h.K ? 1 : 0;
        int a2 = -1;
        final int a3 = k;
        int n;
        boolean func_70093_af;
        final boolean b = func_70093_af = ((n = ((a instanceof EntityPlayer) ? 1 : 0)) != 0);
        final boolean b2;
        Label_0052: {
            if (a3 == 0) {
                if (b) {
                    b2 = ((n = (com.sun.jna.z.a.j.e.d.a((Entity)a) ? 1 : 0)) != 0);
                    if (a3 != 0) {
                        break Label_0052;
                    }
                    if (b2) {
                        a2 = -16711776;
                        if (a3 == 0) {
                            return a2;
                        }
                    }
                }
                n = (a.func_98034_c((EntityPlayer)this.a.field_71439_g) ? 1 : 0);
            }
        }
        if (a3 == 0) {
            if (b) {
                a2 = -6656;
                if (a3 == 0) {
                    return a2;
                }
            }
            n = ((func_70093_af = a.func_70093_af()) ? 1 : 0);
        }
        if (a3 != 0) {
            return n;
        }
        if (b2) {
            a2 = -65536;
        }
        n = a2;
        return n;
    }
    
    @Override
    public k[] k() {
        return new k[] { this.p, this.q };
    }
    
    static {
        final String[] l = new String[13];
        int n = 0;
        String s;
        int n2 = (s = "\u008bE\u0006ªD\u0093\u00d5\u00ce\u0088\u0003\u008eW\u009e\u0016\u008a@\u009c\u00dd\u00d6\u0085¼\u0083L\u0097\u00cb\u00db´\u008d\u0083O\u0081\u00df\u00d5\u0092\u0092\u0091\t§P\u0087\u00d0\u00ca\u008d\u009a\u008cU\r\u0084T\u009c\u00da\u00e5\u00d1\u00c8\u00d7\u0011\u00c1\u008d\u00e5\u0081\u0003\u0085@\u0082\u0003\u00c1\u000f\u00d1\bE@©\u00fa\u00e7\u00c0X\u0090\bE@©\u00ff\u00e7\u00c0X\u0090\b\u00c7R\u00d2\u001e\u009f\u0093\u00da\u0091").length();
        int n3 = 2;
        int n4 = -1;
    Label_0022:
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
                        Label_0246: {
                            if (n7 > 1) {
                                break Label_0246;
                            }
                            length = (n8 = n9);
                            do {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = '\u00e2';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '!';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '\u00f2';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '¹';
                                        break;
                                    }
                                    case 4: {
                                        c2 = 'º';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '\u00e0';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u00ff';
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
                            l[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0022;
                            }
                            n2 = (s = "\u00db\u0018\u00d9\b¬@\u009f\u00dc\u00ee\u0081\u0098\u0091").length();
                            n3 = 3;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            l[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0022;
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
        L = l;
    }
}
