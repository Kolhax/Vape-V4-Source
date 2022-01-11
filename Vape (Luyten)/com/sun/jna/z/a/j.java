package com.sun.jna.z.a;

import net.minecraft.client.*;
import com.sun.jna.z.a.f.a.a.a.f.*;
import com.sun.jna.z.a.f.a.a.a.*;
import com.sun.jna.z.a.g.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.entity.*;
import net.minecraft.entity.*;
import javax.swing.*;
import java.awt.*;
import net.minecraft.item.*;

public class j
{
    public Minecraft a;
    private b b;
    public h c;
    public g d;
    public static j e;
    public m f;
    public static boolean g;
    
    public j() {
        this.a = Minecraft.func_71410_x();
        j.e = this;
        (this.f = new m()).a(24, 1, com.sun.jna.z.a.g.c.THREE_DIMENSIONAL);
        this.d = new g();
    }
    
    public boolean a() {
        return true;
    }
    
    public Minecraft b() {
        return this.a;
    }
    
    public EntityPlayerSP c() {
        return this.a.field_71439_g;
    }
    
    public b d() {
        final int a = i.n ? 1 : 0;
        final b b = this.b;
        if (a == 0) {
            if (b == null) {
                this.b = new b(this.c);
            }
            final b b2 = this.b;
        }
        return b;
    }
    
    public boolean a(final EntityLivingBase a) {
        final int a2 = i.n ? 1 : 0;
        final boolean b = a instanceof EntityPlayer;
        EntityLivingBase entityLivingBase2 = null;
        Label_0122: {
            if (a2 == 0) {
                if (b) {
                    final EntityPlayer a3 = (EntityPlayer)a;
                    boolean a4 = false;
                    final ItemStack[] a5 = a3.field_71071_by.field_70460_b;
                    final int a6 = a5.length;
                    int a7 = 0;
                    while (true) {
                        boolean b2 = false;
                        while (a7 < a6) {
                            final ItemStack a8 = a5[a7];
                            if (a2 == 0) {
                                final ItemStack itemStack = a8;
                                if (a2 != 0) {
                                    if (itemStack == null) {
                                        b2 = a4;
                                        if (a2 == 0 && b2) {}
                                    }
                                    return b2;
                                }
                                if (itemStack != null) {
                                    a4 = true;
                                }
                                ++a7;
                            }
                            if (a2 != 0) {
                                break;
                            }
                        }
                        EntityLivingBase entityLivingBase = a;
                        if (a2 == 0) {
                            if (!a.func_82150_aj()) {
                                return b2;
                            }
                            entityLivingBase = a;
                        }
                        entityLivingBase.func_70694_bm();
                        continue;
                    }
                }
                entityLivingBase2 = a;
                if (a2 != 0) {
                    break Label_0122;
                }
                a.func_82150_aj();
            }
            if (!b) {
                return false;
            }
            entityLivingBase2 = a;
        }
        if (entityLivingBase2.func_70694_bm() == null) {
            return true;
        }
        return false;
    }
    
    public boolean a(final Entity a) {
        final int a2 = i.n ? 1 : 0;
        final boolean b = a instanceof EntityLivingBase;
        if (a2 == 0) {
            if (b) {
                final EntityLivingBase a3 = (EntityLivingBase)a;
                float field_70128_L;
                final boolean b2 = (field_70128_L = (a.field_70128_L ? 1 : 0)) != 0.0f;
                if (a2 == 0) {
                    if (!b2) {
                        final float n = field_70128_L = fcmpg(a3.func_110143_aJ(), 0.0f);
                        if (a2 != 0) {
                            return field_70128_L != 0.0f;
                        }
                        if (n > 0) {
                            field_70128_L = (false ? 1 : 0);
                            return field_70128_L != 0.0f;
                        }
                    }
                    field_70128_L = (true ? 1 : 0);
                }
                return field_70128_L != 0.0f;
            }
            final boolean field_70128_L2 = a.field_70128_L;
        }
        return b;
    }
    
    public boolean b(final Entity a) {
        final int a2 = i.n ? 1 : 0;
        Entity entity = a;
        if (a2 == 0) {
            if (a == null) {
                return false;
            }
            entity = a;
        }
        boolean equals;
        final boolean b = equals = entity.equals((Object)this.c());
        if (a2 == 0) {
            if (b) {
                return false;
            }
            final boolean b2;
            equals = (b2 = (a instanceof EntityLivingBase));
        }
        if (a2 == 0) {
            if (b) {
                boolean b7;
                boolean b6;
                boolean b5;
                boolean b4;
                final boolean b3 = b4 = (b5 = (b6 = (b7 = this.a((EntityLivingBase)a))));
                if (a2 == 0) {
                    if (b3) {
                        return false;
                    }
                    final boolean b8;
                    b4 = (b8 = (b5 = (b6 = (b7 = j.e.d.a(a)))));
                }
                if (a2 == 0) {
                    if (b3) {
                        return false;
                    }
                    b4 = (b6 = (b7 = j.e.c.l.a()));
                }
                final boolean b9;
                Label_0134: {
                    if (a2 == 0) {
                        if (b4) {
                            b9 = (b6 = (b7 = j.e.d.b(a)));
                            if (a2 != 0) {
                                break Label_0134;
                            }
                            if (b9) {
                                return false;
                            }
                        }
                        j.e.c.j.a();
                    }
                }
                final boolean b10;
                Label_0168: {
                    if (a2 == 0) {
                        if (!b9) {
                            b10 = (b7 = (a instanceof EntityOtherPlayerMP));
                            if (a2 != 0) {
                                break Label_0168;
                            }
                            if (b10) {
                                return false;
                            }
                        }
                        j.e.c.k.a();
                    }
                }
                final boolean b11;
                if (a2 == 0) {
                    if (!b10) {
                        b11 = (a instanceof EntityCreature);
                        if (a2 == 0) {
                            if (b11) {
                                return false;
                            }
                        }
                    }
                }
                return b11;
            }
            equals = false;
        }
        return equals;
    }
    
    public static void a(final String a) {
        JOptionPane.showMessageDialog(null, a, "", 1);
    }
    
    public boolean c(final Entity a) {
        final int a2 = i.n ? 1 : 0;
        boolean a3;
        final boolean b = a3 = j.e.c.l.a();
        if (a2 == 0) {
            if (!b) {
                return false;
            }
            final boolean b2;
            a3 = (b2 = j.e.d.b(a));
        }
        if (a2 == 0) {
            if (!b) {
                return false;
            }
            a3 = true;
        }
        return a3;
        a3 = false;
        return a3;
    }
    
    protected boolean d(final Entity a) {
        return j.e.d.a(a);
    }
    
    protected boolean e() {
        final int a = i.n ? 1 : 0;
        j e = this;
        if (a == 0) {
            if (this.c() == null) {
                return true;
            }
            e = j.e;
        }
        final boolean a2 = e.c.m.a();
        if (a == 0 && a2) {
            final ItemStack func_71045_bC = this.c().func_71045_bC();
            if (a == 0) {
                if (func_71045_bC == null) {
                    return true;
                }
                this.c().func_71045_bC();
            }
            boolean b2;
            final boolean b = b2 = (func_71045_bC.func_77973_b() instanceof ItemSword);
            if (a == 0) {
                if (b) {
                    return false;
                }
                final boolean b3;
                b2 = (b3 = (this.c().func_71045_bC().func_77973_b() instanceof ItemAxe));
            }
            if (a == 0) {
                if (b) {
                    return false;
                }
                b2 = true;
            }
            return b2;
            b2 = false;
            return b2;
        }
        return a2;
    }
    
    public int a(final EntityLivingBase a, final EntityLivingBase a) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dconst_0       
        //     4: dstore          a
        //     6: aload_2         /* a */
        //     7: getfield        net/minecraft/entity/EntityLivingBase.field_70165_t:D
        //    10: aload_1         /* a */
        //    11: getfield        net/minecraft/entity/EntityLivingBase.field_70165_t:D
        //    14: dsub           
        //    15: dstore          6
        //    17: istore_3        /* a */
        //    18: aload_2         /* a */
        //    19: getfield        net/minecraft/entity/EntityLivingBase.field_70161_v:D
        //    22: aload_1         /* a */
        //    23: getfield        net/minecraft/entity/EntityLivingBase.field_70161_v:D
        //    26: dsub           
        //    27: dstore          a
        //    29: dload           a
        //    31: dconst_0       
        //    32: dcmpl          
        //    33: iload_3         /* a */
        //    34: ifne            87
        //    37: ifle            83
        //    40: dload           a
        //    42: dconst_0       
        //    43: dcmpl          
        //    44: iload_3         /* a */
        //    45: ifne            87
        //    48: ifle            83
        //    51: dload           a
        //    53: dload           a
        //    55: ddiv           
        //    56: invokestatic    java/lang/Math.atan:(D)D
        //    59: dneg           
        //    60: invokestatic    java/lang/Math.toDegrees:(D)D
        //    63: dstore          a
        //    65: iload_3         /* a */
        //    66: ifeq            205
        //    69: getstatic       com/sun/jna/z/a/j.g:Z
        //    72: ifeq            79
        //    75: iconst_0       
        //    76: goto            80
        //    79: iconst_1       
        //    80: putstatic       com/sun/jna/z/a/j.g:Z
        //    83: dload           a
        //    85: dconst_0       
        //    86: dcmpl          
        //    87: iload_3         /* a */
        //    88: ifne            127
        //    91: ifle            123
        //    94: dload           a
        //    96: dconst_0       
        //    97: dcmpg          
        //    98: iload_3         /* a */
        //    99: ifne            127
        //   102: ifge            123
        //   105: dload           a
        //   107: dload           a
        //   109: ddiv           
        //   110: invokestatic    java/lang/Math.atan:(D)D
        //   113: dneg           
        //   114: invokestatic    java/lang/Math.toDegrees:(D)D
        //   117: dstore          a
        //   119: iload_3         /* a */
        //   120: ifeq            205
        //   123: dload           a
        //   125: dconst_0       
        //   126: dcmpg          
        //   127: iload_3         /* a */
        //   128: ifne            174
        //   131: ifge            166
        //   134: dload           a
        //   136: dconst_0       
        //   137: dcmpl          
        //   138: iload_3         /* a */
        //   139: ifne            174
        //   142: ifle            166
        //   145: ldc2_w          -90.0
        //   148: dload           a
        //   150: dload           a
        //   152: ddiv           
        //   153: invokestatic    java/lang/Math.atan:(D)D
        //   156: invokestatic    java/lang/Math.toDegrees:(D)D
        //   159: dadd           
        //   160: dstore          a
        //   162: iload_3         /* a */
        //   163: ifeq            205
        //   166: dload           a
        //   168: dconst_0       
        //   169: iload_3         /* a */
        //   170: ifne            215
        //   173: dcmpg          
        //   174: ifge            205
        //   177: dload           a
        //   179: dconst_0       
        //   180: iload_3         /* a */
        //   181: ifne            215
        //   184: dcmpg          
        //   185: ifge            205
        //   188: ldc2_w          90.0
        //   191: dload           a
        //   193: dload           a
        //   195: ddiv           
        //   196: invokestatic    java/lang/Math.atan:(D)D
        //   199: invokestatic    java/lang/Math.toDegrees:(D)D
        //   202: dadd           
        //   203: dstore          a
        //   205: dload           a
        //   207: dload           a
        //   209: dmul           
        //   210: dload           a
        //   212: dload           a
        //   214: dmul           
        //   215: dadd           
        //   216: invokestatic    java/lang/Math.sqrt:(D)D
        //   219: dstore          a
        //   221: dload           a
        //   223: aload_1         /* a */
        //   224: getfield        net/minecraft/entity/EntityLivingBase.field_70759_as:F
        //   227: f2d            
        //   228: dsub           
        //   229: invokestatic    java/lang/Math.abs:(D)D
        //   232: ldc2_w          360.0
        //   235: drem           
        //   236: d2i            
        //   237: istore          a
        //   239: iload           a
        //   241: sipush          180
        //   244: iload_3         /* a */
        //   245: ifne            256
        //   248: if_icmple       260
        //   251: sipush          360
        //   254: iload           a
        //   256: isub           
        //   257: goto            262
        //   260: iload           a
        //   262: istore          a
        //   264: iload           a
        //   266: ireturn        
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
}
