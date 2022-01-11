package md;

import com.sun.jna.z.a.e.b;
import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.f.a.a.a.a.a.d;
import com.sun.jna.z.a.f.a.a.a.a.k;
import com.sun.jna.z.a.g.g;
import com.sun.jna.z.a.g.l;
import com.sun.jna.z.a.j;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.block.model.ItemTransformVec3f;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.StringUtils;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.model.pipeline.LightUtil;
import org.lwjgl.opengl.GL11;

public class h
  extends c
{
  private static final String[] L;
  public static boolean K;
  public static boolean J;
  public static boolean I;
  public static int H;
  public static boolean G;
  public static boolean F;
  public static int E;
  public static boolean D;
  public static int C;
  public static boolean B;
  public static int A;
  public static int z;
  public static boolean y;
  public static boolean x;
  public static int w;
  public static boolean v;
  public static boolean u;
  public static boolean t;
  public static int s;
  public static boolean r;
  
  public void a(float a)
  {
    Iterator localIterator = a.a.field_71441_e.field_73010_i.iterator();int a = K;
    do
    {
      EntityPlayer a;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        Object a = localIterator.next();
        
        a = (EntityPlayer)a;
        if (a != 0) {
          return;
        }
      } while ((!a.e(a)) && 
      
        (a == 0));
      double a = a.field_70142_S + (a.field_70165_t - a.field_70142_S) * a - com.sun.jna.z.a.i.d.i.a();double a = a.field_70137_T + (a.field_70163_u - a.field_70137_T) * a - com.sun.jna.z.a.i.d.i.b();double a = a.field_70136_U + (a.field_70161_v - a.field_70136_U) * a - com.sun.jna.z.a.i.d.i.c();a.a(a, a, a, a);
    } while (a == 0);
    GL11.glColor3d(1.0D, 1.0D, 1.0D);
  }
  
  com.sun.jna.z.a.f.a.a.a.a.i q = new d(a[4]);
  
  public int c(EntityLivingBase a)
  {
    int a = -1;
    
    int a = K;
    if (a == 0) {
      if ((a instanceof EntityPlayer))
      {
        if (a != 0) {
          break label52;
        }
        if (j.e.d.a(a))
        {
          a = -16711776;
          if (a == 0) {
            return a;
          }
        }
      }
    }
    label52:
    if (a == 0) {
      if (a.func_98034_c(a.a.field_71439_g))
      {
        a = 58880;
        if (a == 0) {
          return a;
        }
      }
    }
    if (a == 0) {
      if (a.func_70093_af()) {
        a = -65536;
      }
    }
    return a;
  }
  
  public void a(EntityLivingBase a, double a, double a, double a)
  {
    String[] a = L;DecimalFormat a = new DecimalFormat(a[7]);
    
    String a = a.func_145748_c_().func_150254_d();int a = K;
    if (a == 0) {
      if (a.c(a) != -1) {
        a = StringUtils.func_76338_a(a);
      }
    }
    if (a == 0)
    {
      if ((a instanceof EntityPlayer))
      {
        if (a != 0) {
          break label125;
        }
        if (((EntityPlayer)a).field_71075_bZ.field_75100_b)
        {
          a = L;a = a[9] + a;
        }
      }
      if (a != 0) {
        break label177;
      }
    }
    if ((a instanceof EntityPlayer))
    {
      label125:
      if (a != 0) {
        break label177;
      }
      if (((EntityPlayer)a).field_71075_bZ.field_75098_d)
      {
        a = L;a = a[8] + a;
      }
    }
    label177:
    double a = a.func_110143_aJ() / 2.0F;
    double a = a.func_110138_aP() / 2.0F;
    
    double a = 100.0D * (a / a);
    if (a == 0) {
      if (a > 75.0D)
      {
        String a = "2";
        if (a == 0) {
          break label287;
        }
        r = !r;
      }
    }
    if (a == 0) {
      if (a > 50.0D)
      {
        String a = "e";
        if (a == 0) {
          break label287;
        }
      }
    }
    String a;
    if (a > 25.0D)
    {
      String a = "6";
      if (a == 0) {}
    }
    else
    {
      a = "4";
    }
    label287:
    String a = a.format(Math.floor((a + 0.25D) / 0.5D) * 0.5D);
    String a = a.format(Math.floor((a.func_110138_aP() + 0.25D) / 0.5D) * 0.5D);
    if (a == 0) {
      if (a.p.a())
      {
        a = L;a = String.format(a[10], new Object[] { a, a, a });
      }
    }
    float a = a.a.field_71439_g.func_70032_d(a);
    if (a == 0) {}
    float a = a / 5.0F <= 2.0F ? 2.0F : a / 5.0F;float a = 0.016666668F * a;GlStateManager.func_179094_E();RenderHelper.func_74519_b();GlStateManager.func_179137_b(a + 0.0D, a + a.field_70131_O + 0.5D, a);GL11.glNormal3f(0.0F, 1.0F, 0.0F);
    if (a == 0)
    {
      if (a.a.field_71474_y.field_74320_O == 2)
      {
        GlStateManager.func_179114_b(-a.a.func_175598_ae().field_78735_i, 0.0F, 1.0F, 0.0F);GlStateManager.func_179114_b(a.a.func_175598_ae().field_78732_j, -1.0F, 0.0F, 0.0F);
        if (a == 0) {}
      }
      else
      {
        GlStateManager.func_179114_b(-a.a.func_175598_ae().field_78735_i, 0.0F, 1.0F, 0.0F);
      }
    }
    else {
      GlStateManager.func_179114_b(a.a.func_175598_ae().field_78732_j, 1.0F, 0.0F, 0.0F);
    }
    GlStateManager.func_179152_a(-a, -a, a);GlStateManager.func_179140_f();GlStateManager.func_179132_a(false);GlStateManager.func_179097_i();
    
    GlStateManager.func_179147_l();GlStateManager.func_179120_a(770, 771, 1, 0);Tessellator a = Tessellator.func_178181_a();WorldRenderer a = a.func_178180_c();int a = 0;
    if (a == 0)
    {
      if (a.func_70093_af()) {
        a += 4;
      }
      a = (int)(a - a / 5.0F);
    }
    if (a == 0)
    {
      if (a < -8) {
        a = -8;
      }
      GlStateManager.func_179090_x();
      
      a.func_178970_b();
    }
    int a = a.a.field_71466_p.func_78256_a(a) / 2;
    
    a.func_178960_a(0.0F, 0.0F, 0.0F, 0.32F);
    
    a.func_178984_b(-a - 2, -2 + a, 0.0D);a.func_178984_b(-a - 2, 9 + a, 0.0D);a.func_178984_b(a + 2, 9 + a, 0.0D);a.func_178984_b(a + 2, -2 + a, 0.0D);a.func_78381_a();GlStateManager.func_179098_w();
    
    a.a.field_71466_p.func_175065_a(a, -a, a, a.c(a), true);
    if (a == 0)
    {
      if (a.q.a())
      {
        if (a != 0) {
          break label1611;
        }
        if ((a instanceof EntityPlayer))
        {
          EntityPlayer a = (EntityPlayer)a;
          
          List<ItemStack> a = new ArrayList();
          if (a.func_71045_bC() != null) {
            a.add(a.func_71045_bC());
          }
          int a = 3;
          do
          {
            if (a < 0) {
              break;
            }
            ItemStack a = a.field_71071_by.field_70460_b[a];
            if (a != 0) {
              break label929;
            }
            if (a == 0)
            {
              if (a != null) {
                a.add(a);
              }
              a--;
            }
          } while (a == 0);
          int a = a - (a.size() - 1) * 9 - 9;
          label929:
          int a = 0;
          Iterator localIterator = a.iterator();
          label1168:
          label1531:
          label1585:
          label1593:
          do
          {
            if (!localIterator.hasNext()) {
              break;
            }
            ItemStack a = (ItemStack)localIterator.next();
            
            GlStateManager.func_179094_E();
            
            RenderHelper.func_74519_b();a.a.func_175599_af().field_77023_b = -100.0F;a.a(a, -a + a + a, a - 20);
            
            a.a.func_175599_af().func_180453_a(a.a.field_71466_p, a, -a + a + a, a - 20, "");a.a.func_175599_af().field_77023_b = 0.0F;RenderHelper.func_74518_a();GlStateManager.func_179141_d();GlStateManager.func_179084_k();GlStateManager.func_179140_f();
            
            GlStateManager.func_179121_F();
            
            GlStateManager.func_179094_E();GlStateManager.func_179140_f();GlStateManager.func_179132_a(false);GlStateManager.func_179097_i();GlStateManager.func_179152_a(0.5F, 0.5F, 0.5F);
            if (a != 0) {
              return;
            }
            if (a == 0) {
              if (a.func_77973_b() == Items.field_151153_ao)
              {
                if (a != 0) {
                  break label1168;
                }
                if (a.func_77962_s())
                {
                  a = L;a.a.field_71466_p.func_175063_a(a[6], (-a + a + a) * 2, (a - 20) * 2, -65536);
                  if (a == 0) {
                    break label1593;
                  }
                }
              }
            }
            NBTTagList a = a.func_77986_q();
            if (a == 0)
            {
              if (a != null)
              {
                int a = 0;Enchantment[] a = { Enchantment.field_180310_c, Enchantment.field_77347_r, Enchantment.field_180314_l, Enchantment.field_77334_n, Enchantment.field_77349_p, Enchantment.field_180309_e, Enchantment.field_77345_t, Enchantment.field_77343_v, Enchantment.field_77344_u, Enchantment.field_77346_s, Enchantment.field_77342_w, Enchantment.field_92091_k };
                if (a == 0) {
                  if (a.func_74745_c() >= 6)
                  {
                    a = L;a.a.field_71466_p.func_175063_a(a[6], (-a + a + a) * 2, (a - 20) * 2, -65536);
                    if (a == 0) {
                      break label1593;
                    }
                  }
                }
                int a = 0;
                do
                {
                  if (a >= a.func_74745_c()) {
                    break label1593;
                  }
                  a = L;short a = a.func_150305_b(a).func_74765_d(a[0]);
                  
                  short a = a.func_150305_b(a).func_74765_d(a[2]);Enchantment a = Enchantment.func_180306_c(a);
                  if (a == 0)
                  {
                    if (a != 0) {
                      break;
                    }
                    if (a != null)
                    {
                      Enchantment[] a = a;int a = a.length;int a = 0;
                      do
                      {
                        if (a >= a) {
                          break label1585;
                        }
                        Enchantment a = a[a];
                        if (a == 0)
                        {
                          if (a != 0) {
                            break;
                          }
                          if (a == a)
                          {
                            String a = a.func_77316_c(a).substring(0, 1).toLowerCase();
                            if (a == 0)
                            {
                              if (a > 99) {
                                a = a + L[11];
                              }
                            }
                            else {
                              if (a == 0) {
                                break label1531;
                              }
                            }
                            a = a + a;a.a.field_71466_p.func_175063_a(a, (-a + a + a) * 2, (a - 20 + a) * 2, -5592406);
                            
                            a += 5;
                            if (a == 0) {
                              break label1585;
                            }
                          }
                          a++;
                        }
                      } while (a == 0);
                    }
                    a++;
                  }
                } while (a == 0);
              }
              GlStateManager.func_179145_e();
              
              GlStateManager.func_179121_F();
              
              a += 18;
            }
          } while (a == 0);
        }
      }
      GlStateManager.func_179126_j();
    }
    label1611:
    GlStateManager.func_179132_a(true);
    GlStateManager.func_179145_e();
    
    GlStateManager.func_179084_k();
    
    GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
    
    RenderHelper.func_74518_a();GlStateManager.func_179121_F();
  }
  
  com.sun.jna.z.a.f.a.a.a.a.i p = new d(a[1]);
  Method o;
  Method n;
  
  public k[] k()
  {
    return new k[] { a.p, a.q };
  }
  
  void a(int a, int a, boolean a)
  {
    GlStateManager.func_179109_b(a, a, 100.0F + a.a.func_175599_af().field_77023_b);
    
    GlStateManager.func_179109_b(8.0F, 8.0F, 0.0F);GlStateManager.func_179152_a(1.0F, 1.0F, -1.0F);GlStateManager.func_179152_a(0.5F, 0.5F, 0.5F);int a = K;
    if (a == 0)
    {
      if (a)
      {
        GlStateManager.func_179152_a(40.0F, 40.0F, 40.0F);GlStateManager.func_179114_b(210.0F, 1.0F, 0.0F, 0.0F);GlStateManager.func_179114_b(-135.0F, 0.0F, 1.0F, 0.0F);GlStateManager.func_179145_e();
        if (a == 0) {}
      }
      else
      {
        GlStateManager.func_179152_a(64.0F, 64.0F, 64.0F);GlStateManager.func_179114_b(180.0F, 1.0F, 0.0F, 0.0F);
      }
    }
    else {
      GlStateManager.func_179140_f();
    }
  }
  
  private boolean e(Entity a)
  {
    int a = K;
    if (((a != 0) || (a != null)) && ((a != 0) || (a != a.a.field_71439_g))) {
      if (a != 0) {}
    }
    return a.func_70089_S();
  }
  
  private void a(IBakedModel a, int a, ItemStack a)
  {
    Tessellator a = Tessellator.func_178181_a();
    
    int a = K;WorldRenderer a = a.func_178180_c();a.func_178970_b();a.func_178967_a(DefaultVertexFormats.field_176599_b);EnumFacing[] a = EnumFacing.values();int a = a.length;int a = 0;
    do
    {
      if (a >= a) {
        break;
      }
      EnumFacing a = a[a];
      
      a.a(a, a.func_177551_a(a), a, a);a++;
      if (a != 0) {
        return;
      }
    } while (a == 0);
    a.a(a, a.func_177550_a(), a, a);
    
    a.func_78381_a();
  }
  
  private void a(WorldRenderer a, List a, int a, ItemStack a)
  {
    int a = K;boolean a = (a == -1) && (a != null);Iterator a = a.iterator();
    do
    {
      if (!a.hasNext()) {
        break;
      }
      BakedQuad a = (BakedQuad)a.next();int a = a;
      if (a == 0)
      {
        if (a) {
          if (a == 0)
          {
            if (a.func_178212_b()) {
              a = a.func_77973_b().func_82790_a(a, a.func_178211_c());
            }
          }
          else
          {
            if (a == 0) {
              if (EntityRenderer.field_78517_a) {
                a = TextureUtil.func_177054_c(a);
              }
            }
            a |= 0xFF000000;
          }
        }
        LightUtil.renderQuadColor(a, a, a);
      }
    } while (a == 0);
  }
  
  public void a(ItemStack a, int a, int a)
  {
    int a = K;
    try
    {
      if (a == 0) {
        if (a == null) {
          return;
        }
      }
    }
    catch (Throwable localThrowable1)
    {
      throw localThrowable1;
    }
    try
    {
      a.b(a, a, a);
    }
    catch (Throwable localThrowable) {}
  }
  
  public h()
  {
    a.<init>(a[12], b.Render, -16711681);
    try
    {
      a.n = RenderItem.class.getDeclaredMethod(a[5], new Class[] { ItemTransformVec3f.class });
      
      a.n.setAccessible(true);a.o = ForgeHooksClient.class.getDeclaredMethod(a[3], new Class[] { IBakedModel.class, ItemCameraTransforms.TransformType.class });
    }
    catch (Exception a)
    {
      a.printStackTrace();
    }
  }
  
  /* Error */
  public void b(ItemStack a, int a, int a)
    throws Exception
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 97	md/h:a	Lnet/minecraft/client/Minecraft;
    //   4: invokevirtual 433	net/minecraft/client/Minecraft:func_175599_af	()Lnet/minecraft/client/renderer/entity/RenderItem;
    //   7: astore 5
    //   9: aload 5
    //   11: invokevirtual 577	net/minecraft/client/renderer/entity/RenderItem:func_175037_a	()Lnet/minecraft/client/renderer/ItemModelMesher;
    //   14: aload_1
    //   15: invokevirtual 583	net/minecraft/client/renderer/ItemModelMesher:func_178089_a	(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/client/resources/model/IBakedModel;
    //   18: astore 6
    //   20: invokestatic 295	net/minecraft/client/renderer/GlStateManager:func_179094_E	()V
    //   23: aload_0
    //   24: getfield 97	md/h:a	Lnet/minecraft/client/Minecraft;
    //   27: invokevirtual 587	net/minecraft/client/Minecraft:func_110434_K	()Lnet/minecraft/client/renderer/texture/TextureManager;
    //   30: getstatic 593	net/minecraft/client/renderer/texture/TextureMap:field_110575_b	Lnet/minecraft/util/ResourceLocation;
    //   33: invokevirtual 599	net/minecraft/client/renderer/texture/TextureManager:func_110577_a	(Lnet/minecraft/util/ResourceLocation;)V
    //   36: aload_0
    //   37: getfield 97	md/h:a	Lnet/minecraft/client/Minecraft;
    //   40: invokevirtual 587	net/minecraft/client/Minecraft:func_110434_K	()Lnet/minecraft/client/renderer/texture/TextureManager;
    //   43: getstatic 593	net/minecraft/client/renderer/texture/TextureMap:field_110575_b	Lnet/minecraft/util/ResourceLocation;
    //   46: invokevirtual 603	net/minecraft/client/renderer/texture/TextureManager:func_110581_b	(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/renderer/texture/ITextureObject;
    //   49: iconst_0
    //   50: iconst_0
    //   51: invokeinterface 609 3 0
    //   56: invokestatic 612	net/minecraft/client/renderer/GlStateManager:func_179091_B	()V
    //   59: invokestatic 450	net/minecraft/client/renderer/GlStateManager:func_179141_d	()V
    //   62: sipush 516
    //   65: ldc 20
    //   67: invokestatic 616	net/minecraft/client/renderer/GlStateManager:func_179092_a	(IF)V
    //   70: getstatic 786	md/h:K	Z
    //   73: invokestatic 351	net/minecraft/client/renderer/GlStateManager:func_179147_l	()V
    //   76: sipush 770
    //   79: sipush 771
    //   82: invokestatic 620	net/minecraft/client/renderer/GlStateManager:func_179112_b	(II)V
    //   85: fconst_1
    //   86: fconst_1
    //   87: fconst_1
    //   88: fconst_1
    //   89: invokestatic 560	net/minecraft/client/renderer/GlStateManager:func_179131_c	(FFFF)V
    //   92: aload_0
    //   93: iload_2
    //   94: iload_3
    //   95: aload 6
    //   97: invokeinterface 623 1 0
    //   102: invokevirtual 626	md/h:a	(IIZ)V
    //   105: aload_0
    //   106: getfield 87	md/h:o	Ljava/lang/reflect/Method;
    //   109: aconst_null
    //   110: iconst_2
    //   111: anewarray 133	java/lang/Object
    //   114: dup
    //   115: iconst_0
    //   116: aload 6
    //   118: aastore
    //   119: dup
    //   120: iconst_1
    //   121: getstatic 630	net/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType:GUI	Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;
    //   124: aastore
    //   125: invokevirtual 634	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   128: checkcast 6	net/minecraft/client/resources/model/IBakedModel
    //   131: astore 6
    //   133: aload_0
    //   134: aload_1
    //   135: aload 6
    //   137: invokevirtual 637	md/h:a	(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/resources/model/IBakedModel;)V
    //   140: invokestatic 640	net/minecraft/client/renderer/GlStateManager:func_179118_c	()V
    //   143: invokestatic 643	net/minecraft/client/renderer/GlStateManager:func_179101_C	()V
    //   146: invokestatic 342	net/minecraft/client/renderer/GlStateManager:func_179140_f	()V
    //   149: istore 4
    //   151: invokestatic 456	net/minecraft/client/renderer/GlStateManager:func_179121_F	()V
    //   154: aload_0
    //   155: getfield 97	md/h:a	Lnet/minecraft/client/Minecraft;
    //   158: invokevirtual 587	net/minecraft/client/Minecraft:func_110434_K	()Lnet/minecraft/client/renderer/texture/TextureManager;
    //   161: getstatic 593	net/minecraft/client/renderer/texture/TextureMap:field_110575_b	Lnet/minecraft/util/ResourceLocation;
    //   164: invokevirtual 599	net/minecraft/client/renderer/texture/TextureManager:func_110577_a	(Lnet/minecraft/util/ResourceLocation;)V
    //   167: aload_0
    //   168: getfield 97	md/h:a	Lnet/minecraft/client/Minecraft;
    //   171: invokevirtual 587	net/minecraft/client/Minecraft:func_110434_K	()Lnet/minecraft/client/renderer/texture/TextureManager;
    //   174: getstatic 593	net/minecraft/client/renderer/texture/TextureMap:field_110575_b	Lnet/minecraft/util/ResourceLocation;
    //   177: invokevirtual 603	net/minecraft/client/renderer/texture/TextureManager:func_110581_b	(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/renderer/texture/ITextureObject;
    //   180: invokeinterface 646 1 0
    //   185: getstatic 788	md/h:r	Z
    //   188: ifeq +21 -> 209
    //   191: iload 4
    //   193: ifeq +12 -> 205
    //   196: goto +4 -> 200
    //   199: athrow
    //   200: iconst_0
    //   201: goto +5 -> 206
    //   204: athrow
    //   205: iconst_1
    //   206: putstatic 786	md/h:K	Z
    //   209: return
    // Line number table:
    //   Java source line #34	-> byte code offset #0
    //   Java source line #43	-> byte code offset #9
    //   Java source line #106	-> byte code offset #20
    //   Java source line #158	-> byte code offset #23
    //   Java source line #217	-> byte code offset #36
    //   Java source line #193	-> byte code offset #56
    //   Java source line #155	-> byte code offset #59
    //   Java source line #116	-> byte code offset #62
    //   Java source line #212	-> byte code offset #73
    //   Java source line #220	-> byte code offset #76
    //   Java source line #8	-> byte code offset #85
    //   Java source line #95	-> byte code offset #92
    //   Java source line #6	-> byte code offset #105
    //   Java source line #78	-> byte code offset #133
    //   Java source line #44	-> byte code offset #140
    //   Java source line #19	-> byte code offset #143
    //   Java source line #68	-> byte code offset #146
    //   Java source line #28	-> byte code offset #151
    //   Java source line #147	-> byte code offset #154
    //   Java source line #3	-> byte code offset #167
    //   Java source line #125	-> byte code offset #185
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	210	0	a	h
    //   0	210	1	a	ItemStack
    //   0	210	2	a	int
    //   0	210	3	a	int
    //   149	43	4	a	int
    //   7	3	5	a	RenderItem
    //   18	118	6	a	IBakedModel
    //   199	1	7	localException1	Exception
    //   204	1	8	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   151	196	199	java/lang/Exception
    //   191	204	204	java/lang/Exception
  }
  
  /* Error */
  public void a(ItemStack a, IBakedModel a)
    throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException
  {
    // Byte code:
    //   0: getstatic 786	md/h:K	Z
    //   3: aload_0
    //   4: getfield 97	md/h:a	Lnet/minecraft/client/Minecraft;
    //   7: invokevirtual 433	net/minecraft/client/Minecraft:func_175599_af	()Lnet/minecraft/client/renderer/entity/RenderItem;
    //   10: astore 4
    //   12: istore_3
    //   13: invokestatic 295	net/minecraft/client/renderer/GlStateManager:func_179094_E	()V
    //   16: ldc 17
    //   18: ldc 17
    //   20: ldc 17
    //   22: invokestatic 339	net/minecraft/client/renderer/GlStateManager:func_179152_a	(FFF)V
    //   25: iload_3
    //   26: ifne +81 -> 107
    //   29: aload_2
    //   30: invokeinterface 658 1 0
    //   35: ifeq +53 -> 88
    //   38: goto +4 -> 42
    //   41: athrow
    //   42: ldc 27
    //   44: fconst_0
    //   45: fconst_1
    //   46: fconst_0
    //   47: invokestatic 333	net/minecraft/client/renderer/GlStateManager:func_179114_b	(FFFF)V
    //   50: ldc 28
    //   52: ldc 28
    //   54: ldc 28
    //   56: invokestatic 651	net/minecraft/client/renderer/GlStateManager:func_179109_b	(FFF)V
    //   59: fconst_1
    //   60: fconst_1
    //   61: fconst_1
    //   62: fconst_1
    //   63: invokestatic 560	net/minecraft/client/renderer/GlStateManager:func_179131_c	(FFFF)V
    //   66: invokestatic 612	net/minecraft/client/renderer/GlStateManager:func_179091_B	()V
    //   69: getstatic 664	net/minecraft/client/renderer/tileentity/TileEntityItemStackRenderer:field_147719_a	Lnet/minecraft/client/renderer/tileentity/TileEntityItemStackRenderer;
    //   72: aload_1
    //   73: invokevirtual 668	net/minecraft/client/renderer/tileentity/TileEntityItemStackRenderer:func_179022_a	(Lnet/minecraft/item/ItemStack;)V
    //   76: goto +34 -> 110
    //   79: athrow
    //   80: athrow
    //   81: athrow
    //   82: athrow
    //   83: athrow
    //   84: athrow
    //   85: athrow
    //   86: athrow
    //   87: athrow
    //   88: ldc 28
    //   90: ldc 28
    //   92: ldc 28
    //   94: invokestatic 651	net/minecraft/client/renderer/GlStateManager:func_179109_b	(FFF)V
    //   97: invokestatic 671	org/lwjgl/opengl/GL11:glPushMatrix	()V
    //   100: aload_0
    //   101: aload_2
    //   102: iconst_m1
    //   103: aload_1
    //   104: invokespecial 674	md/h:a	(Lnet/minecraft/client/resources/model/IBakedModel;ILnet/minecraft/item/ItemStack;)V
    //   107: invokestatic 677	org/lwjgl/opengl/GL11:glPopMatrix	()V
    //   110: invokestatic 456	net/minecraft/client/renderer/GlStateManager:func_179121_F	()V
    //   113: return
    // Line number table:
    //   Java source line #185	-> byte code offset #3
    //   Java source line #85	-> byte code offset #13
    //   Java source line #146	-> byte code offset #16
    //   Java source line #189	-> byte code offset #25
    //   Java source line #47	-> byte code offset #42
    //   Java source line #88	-> byte code offset #50
    //   Java source line #56	-> byte code offset #59
    //   Java source line #142	-> byte code offset #66
    //   Java source line #199	-> byte code offset #69
    //   Java source line #149	-> byte code offset #88
    //   Java source line #221	-> byte code offset #97
    //   Java source line #90	-> byte code offset #100
    //   Java source line #89	-> byte code offset #107
    //   Java source line #208	-> byte code offset #110
    //   Java source line #115	-> byte code offset #113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	a	h
    //   0	114	1	a	ItemStack
    //   0	114	2	a	IBakedModel
    //   12	14	3	a	int
    //   10	1	4	localRenderItem1	RenderItem
    //   13	1	4	a	RenderItem
    //   41	1	6	localIllegalAccessException1	IllegalAccessException
    //   79	1	7	localIllegalAccessException2	IllegalAccessException
    //   80	1	8	localIllegalAccessException3	IllegalAccessException
    //   81	1	9	localInvocationTargetException1	java.lang.reflect.InvocationTargetException
    //   82	1	10	localIllegalAccessException4	IllegalAccessException
    //   83	1	11	localInvocationTargetException2	java.lang.reflect.InvocationTargetException
    //   84	1	12	localIllegalAccessException5	IllegalAccessException
    //   85	1	13	localInvocationTargetException3	java.lang.reflect.InvocationTargetException
    //   86	1	14	localIllegalAccessException6	IllegalAccessException
    //   87	1	15	localInvocationTargetException4	java.lang.reflect.InvocationTargetException
    // Exception table:
    //   from	to	target	type
    //   13	38	41	java/lang/IllegalAccessException
    //   29	79	79	java/lang/IllegalAccessException
    //   13	80	80	java/lang/IllegalAccessException
    //   13	81	81	java/lang/reflect/InvocationTargetException
    //   13	82	82	java/lang/IllegalAccessException
    //   13	83	83	java/lang/reflect/InvocationTargetException
    //   13	84	84	java/lang/IllegalAccessException
    //   13	85	85	java/lang/reflect/InvocationTargetException
    //   13	86	86	java/lang/IllegalAccessException
    //   13	87	87	java/lang/reflect/InvocationTargetException
  }
}
