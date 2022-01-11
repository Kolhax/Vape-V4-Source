package com.sun.jna.z.a;

import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.e.g;
import com.sun.jna.z.a.f.a.a.a.a.t;
import com.sun.jna.z.a.g.p;
import java.util.List;
import md.a;
import md.j;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.event.MouseEvent;

public class h
{
  private static final String[] i;
  
  public h()
  {
    String[] a = i;a.b = i.d.a.a(a[0]);
    
    a.c = i.d.a.a(a[1]);
  }
  
  p h = new p();
  boolean g;
  Entity f;
  double e = 3.0D;
  boolean d;
  c c;
  c b;
  Entity a;
  
  public void a(MouseEvent a)
  {
    boolean a = false;
    
    boolean a = false;double d1 = 3.0D;
    double a;
    int a = i.n;double a = 0.0D;
    if (a == 0) {
      if (a.b != null)
      {
        a a = (a)a.b;
        if (a != 0) {
          break label67;
        }
        if (a.c())
        {
          a = true;a = a.n.a();
        }
      }
    }
    label67:
    if ((a != 0) || (a.c != null))
    {
      j a = (j)a.c;
      if (a != 0) {
        break label111;
      }
      if (a.c())
      {
        a = true;
        
        a = a.n.a();
      }
    }
    label111:
    if ((a != 0) || ((!a) && (!a))) {
      return;
    }
    Minecraft a = Minecraft.func_71410_x();Entity a = a.func_175606_aa();
    if (a != null) {
      if (a == 0)
      {
        if (a.field_71441_e != null) {
          a.field_147125_j = null;
        }
      }
      else
      {
        double a = a.field_71442_b.func_78757_d();
        
        a.field_71476_x = a.func_174822_a(a, 0.0F);double a = a;Vec3 a = a.func_174824_e(0.0F);boolean a = false;int a = 3;
        if (a == 0) {
          if (a.field_71442_b.func_78749_i())
          {
            a = 6.0D;
            
            a = 6.0D;
            if (a == 0) {
              break label246;
            }
          }
        }
        if ((a != 0) || (a > 3.0D)) {
          a = true;
        }
        label246:
        if ((a != 0) || (a.field_71476_x != null)) {
          a = a.field_71476_x.field_72307_f.func_72438_d(a);
        }
        if (a == 0)
        {
          if (!a) {
            break label462;
          }
          a = a;a = a;
          if (a != 0) {}
        }
        else if (a.d)
        {
          if (a != 0) {
            break label456;
          }
          if (((a)a.b).o.a())
          {
            if (a == 0)
            {
              if (a.f != null)
              {
                if (a == 0)
                {
                  if (a.f.field_70172_ad > 18) {
                    a.g = true;
                  }
                  if (a != 0) {
                    break label449;
                  }
                }
                if (a.e < a)
                {
                  if (a != 0) {
                    break label446;
                  }
                  if (a.g)
                  {
                    if (a != 0) {
                      break label446;
                    }
                    if (a.f.field_70172_ad <= 18)
                    {
                      a.g = false;
                      
                      a.e += 0.5D;
                      if (a == 0) {
                        if (a.e > a) {
                          a.e = a;
                        }
                      }
                      a.h.c();
                    }
                  }
                }
              }
              a = a.e;
            }
            label446:
            label449:
            a = a.e;
            if (a == 0) {
              break label462;
            }
          }
        }
        label456:
        a.e = 3.0D;
        label462:
        Vec3 a = a.func_70676_i(0.0F);
        Vec3 a = a.func_72441_c(a.field_72450_a * a, a.field_72448_b * a, a.field_72449_c * a);
        
        a.a = null;Vec3 a = null;float a = 1.0F;List<Entity> a = a.field_71441_e.func_72839_b(a, a.func_174813_aQ().func_72321_a(a.field_72450_a * a, a.field_72448_b * a, a.field_72449_c * a).func_72314_b(a, a, a));double a = a;int a = 0;
        do
        {
          if (a >= a.size()) {
            break;
          }
          Entity a = (Entity)a.get(a);
          if (a == 0)
          {
            if (a != 0) {
              break label1096;
            }
            if ((!a.func_70067_L()) && (a == 0)) {}
          }
          else
          {
            float a = (float)(a.func_70111_Y() + (a ? a : 0.0D));AxisAlignedBB a = a.func_174813_aQ().func_72314_b(a, a, a);MovingObjectPosition a = a.func_72327_a(a, a);
            if ((a != 0) || (a.func_72318_a(a)))
            {
              if (a >= 0.0D)
              {
                a.a = a;
                if (a == 0) {}
                a = a == null ? a : a.field_72307_f;a = 0.0D;
                if (a == 0) {}
              }
            }
            else if (a != null)
            {
              double a = a.func_72438_d(a.field_72307_f);
              if ((a != 0) || ((a < a) || (a == 0.0D)))
              {
                if (a == a.field_70154_o) {}
                a.a = a;
                
                a = a.field_72307_f;a = a;
              }
            }
          }
          a++;
        } while (a == 0);
        if (a == 0) {
          if ((a.a != null) && ((a != 0) || (a))) {
            if (a == 0)
            {
              if (a.func_72438_d(a) > a) {
                if (a != 0) {
                  break label892;
                }
              }
            }
            else if (a.field_71439_g.func_70685_l(a.a))
            {
              a.a = null;a.field_71476_x = new MovingObjectPosition(MovingObjectPosition.MovingObjectType.MISS, a, (EnumFacing)null, new BlockPos(a));
            }
          }
        }
        label892:
        if (a == 0)
        {
          if (a.a != null) {
            if (a == 0)
            {
              if ((a < a) || ((a != 0) || (a.field_71476_x == null))) {
                if (a != 0) {
                  break label1012;
                }
              }
            }
            else if (a.field_71439_g.func_70685_l(a.a))
            {
              a.field_71476_x = new MovingObjectPosition(a.a, a);
              if (a != 0) {
                break label1012;
              }
              if ((a.a instanceof EntityLivingBase))
              {
                EntityLivingBase a = (EntityLivingBase)a.a;
                if (a != 0) {
                  break label1012;
                }
                if (!a.field_70128_L) {
                  a.field_147125_j = a.a;
                }
              }
            }
          }
          if (a != 0) {
            break label1083;
          }
        }
        if (a.f != null)
        {
          label1012:
          if (a == 0)
          {
            if (a.f.equals(a.a))
            {
              a.d = true;a.h.c();
              if (a == 0) {}
            }
            else
            {
              if (a != 0) {
                break label1112;
              }
            }
          }
          else if (a.h.a(100L))
          {
            a.d = false;
            
            a.h.c();
            if (a == 0) {}
          }
        }
        else
        {
          label1083:
          if (a != 0) {
            break label1112;
          }
          if (a.h.a(100L))
          {
            label1096:
            a.d = false;
            a.h.c();
          }
        }
        label1112:
        a.f = a.a;
      }
    }
  }
}
