package md;

import net.minecraft.entity.projectile.*;
import com.sun.jna.z.a.g.*;
import com.sun.jna.z.a.e.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class l extends c
{
    int n;
    ItemStack o;
    boolean p;
    EntityFishHook q;
    p r;
    t s;
    boolean t;
    i u;
    public static boolean v;
    public static int w;
    public static boolean x;
    public static boolean y;
    public static boolean z;
    public static int A;
    public static boolean B;
    public static boolean C;
    public static int D;
    public static int E;
    public static boolean F;
    public static int G;
    public static boolean H;
    public static int I;
    public static boolean J;
    public static boolean K;
    public static int L;
    public static boolean M;
    public static boolean N;
    public static boolean O;
    private static final String[] P;
    
    public l() {
        final int o = l.O ? 1 : 0;
        final String[] a = l.P;
        super(a[0], com.sun.jna.z.a.e.b.Utility, -16777216);
        final int a2 = o;
        this.r = new p();
        this.s = new com.sun.jna.z.a.f.a.a.a.a.a.i(a[1], 500.0, 100.0, 1000.0, 1.0, com.sun.jna.z.a.f.a.a.a.a.b.INTEGER);
        if (a2 != 0) {
            l.v = !l.v;
        }
    }
    
    @Override
    public void a(final TickEvent$PlayerTickEvent a) {
        final int a2 = l.O ? 1 : 0;
        l l = this;
        if (a2 == 0) {
            if (this.o != null) {
                l i = this;
                if (a2 == 0) {
                    if (!this.p) {
                        this.b().field_71442_b.func_78769_a((EntityPlayer)this.c(), (World)this.b().field_71441_e, this.o);
                        this.p = true;
                    }
                    i = this;
                }
                i.q = this.c().field_71104_cf;
                return;
            }
            l = this;
        }
        final InventoryPlayer a3 = l.c().field_71071_by;
        int a4 = 0;
        while (a4 < 9) {
            this.o = a3.field_70462_a[a4];
            final ItemStack o = this.o;
            Label_0165: {
                Label_0162: {
                    if (a2 == 0) {
                        if (o == null && a2 == 0) {
                            break Label_0162;
                        }
                        final ItemStack o2 = this.o;
                    }
                    final Item a5 = o.func_77973_b();
                    if (a2 != 0) {
                        break Label_0165;
                    }
                    if (a5 != null && a5 instanceof ItemFishingRod) {
                        this.c().field_71071_by.field_70461_c = a4;
                        this.r.c();
                        if (a2 == 0) {
                            break;
                        }
                    }
                }
                ++a4;
            }
            if (a2 != 0) {
                break;
            }
        }
    }
    
    @Override
    public void h() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1        /* a */
        //     4: aload_0         /* a */
        //     5: getfield        md/l.t:Z
        //     8: ifeq            127
        //    11: ldc2_w          5
        //    14: invokestatic    java/lang/Thread.sleep:(J)V
        //    17: aload_0         /* a */
        //    18: invokevirtual   md/l.c:()Z
        //    21: iload_1         /* a */
        //    22: ifne            33
        //    25: ifne            32
        //    28: iload_1         /* a */
        //    29: ifeq            4
        //    32: iconst_0       
        //    33: istore_2        /* a */
        //    34: aload_0         /* a */
        //    35: iload_1         /* a */
        //    36: ifne            71
        //    39: getfield        md/l.q:Lnet/minecraft/entity/projectile/EntityFishHook;
        //    42: ifnull          70
        //    45: goto            49
        //    48: athrow         
        //    49: aload_0         /* a */
        //    50: getfield        md/l.q:Lnet/minecraft/entity/projectile/EntityFishHook;
        //    53: getfield        net/minecraft/entity/projectile/EntityFishHook.field_146043_c:Lnet/minecraft/entity/Entity;
        //    56: ifnull          68
        //    59: goto            63
        //    62: athrow         
        //    63: iconst_1       
        //    64: goto            69
        //    67: athrow         
        //    68: iconst_0       
        //    69: istore_2        /* a */
        //    70: aload_0         /* a */
        //    71: iload_1         /* a */
        //    72: ifne            107
        //    75: getfield        md/l.r:Lcom/sun/jna/z/a/g/p;
        //    78: aload_0         /* a */
        //    79: getfield        md/l.s:Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //    82: invokeinterface com/sun/jna/z/a/f/a/a/a/a/t.a:()D
        //    87: d2l            
        //    88: invokevirtual   com/sun/jna/z/a/g/p.a:(J)Z
        //    91: ifne            106
        //    94: goto            98
        //    97: athrow         
        //    98: iload_2         /* a */
        //    99: ifeq            115
        //   102: goto            106
        //   105: athrow         
        //   106: aload_0         /* a */
        //   107: iconst_0       
        //   108: invokevirtual   md/l.a:(Z)V
        //   111: goto            115
        //   114: athrow         
        //   115: goto            4
        //   118: astore_2        /* a */
        //   119: aload_2         /* a */
        //   120: invokevirtual   java/lang/InterruptedException.printStackTrace:()V
        //   123: iload_1         /* a */
        //   124: ifeq            4
        //   127: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  11     28     118    127    Ljava/lang/InterruptedException;
        //  34     45     48     49     Ljava/lang/InterruptedException;
        //  98     111    114    115    Ljava/lang/InterruptedException;
        //  71     94     97     98     Ljava/lang/InterruptedException;
        //  70     102    105    106    Ljava/lang/InterruptedException;
        //  49     67     67     68     Ljava/lang/InterruptedException;
        //  34     59     62     63     Ljava/lang/InterruptedException;
        //  32     115    118    127    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    @Override
    public void g() {
        this.t = false;
        final int a = l.O ? 1 : 0;
        l l = this;
        if (a == 0) {
            if (this.u != null) {
                this.u.a = null;
            }
            l = this;
        }
        l.u = null;
    }
    
    @Override
    public void e() {
        final int o = l.O ? 1 : 0;
        this.t = true;
        final int a = o;
        l l = this;
        if (a == 0) {
            if (this.u == null) {
                (this.u = new i(this)).a();
            }
            l = this;
        }
        l.n = this.c().field_71071_by.field_70461_c;
    }
    
    @Override
    public void f() {
        this.c().field_71071_by.field_70461_c = this.n;
        final int o = l.O ? 1 : 0;
        this.n = 0;
        this.o = null;
        final int a = o;
        this.p = false;
        this.q = null;
        if (l.v) {
            l.O = (a == 0);
        }
    }
    
    @Override
    public k[] k() {
        return new k[] { this.s };
    }
    
    static {
        final String[] p = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "\u009c\u00de\u0080~\"\u000e\u0014¥\u0005\u008a\u00d4\u0088K)").length();
        int char1 = 8;
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
                                    c2 = '\u00ce';
                                    break;
                                }
                                case 1: {
                                    c2 = '±';
                                    break;
                                }
                                case 2: {
                                    c2 = '\u00e4';
                                    break;
                                }
                                case 3: {
                                    c2 = '*';
                                    break;
                                }
                                case 4: {
                                    c2 = 'P';
                                    break;
                                }
                                case 5: {
                                    c2 = 'g';
                                    break;
                                }
                                default: {
                                    c2 = 'w';
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
                p[n++] = new String(charArray).intern();
            } while ((n2 += char1) < length);
        }
        P = p;
    }
}
