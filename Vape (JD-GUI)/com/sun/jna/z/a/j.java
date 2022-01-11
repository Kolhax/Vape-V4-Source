package com.sun.jna.z.a;

import com.sun.jna.z.a.f.a.a.a.f.b;
import com.sun.jna.z.a.f.a.a.a.h;
import com.sun.jna.z.a.g.c;
import com.sun.jna.z.a.g.g;
import com.sun.jna.z.a.g.m;
import javax.swing.JOptionPane;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class j
{
  public boolean a(Entity a)
  {
    int a = i.n;
    if (a == 0) {
      if ((a instanceof EntityLivingBase))
      {
        EntityLivingBase a = (EntityLivingBase)a;
        if (a == 0) {
          if (!a.field_70128_L) {
            if (a != 0) {
              break label45;
            }
          }
        }
        label45:
        return a.func_110143_aJ() <= 0.0F;
      }
    }
    return a.field_70128_L;
  }
  
  public Minecraft b()
  {
    return a.a;
  }
  
  public boolean c(Entity a)
  {
    int a = i.n;
    if ((a != 0) || (e.c.l.a())) {
      if (a != 0) {}
    }
    return e.d.b(a);
  }
  
  public static void a(String a)
  {
    JOptionPane.showMessageDialog(null, a, "", 1);
  }
  
  public int a(EntityLivingBase a, EntityLivingBase a)
  {
    double a = 0.0D;double d1 = a.field_70165_t - a.field_70165_t;int a = i.n;
    double a;
    double a = a.field_70161_v - a.field_70161_v;
    if (a == 0) {
      if (a > 0.0D)
      {
        if (a != 0) {
          break label87;
        }
        if (a > 0.0D)
        {
          a = Math.toDegrees(-Math.atan(a / a));
          if (a == 0) {
            break label205;
          }
          g = !g;
        }
      }
    }
    label87:
    if (a == 0) {
      if (a > 0.0D)
      {
        if (a != 0) {
          break label127;
        }
        if (a < 0.0D)
        {
          a = Math.toDegrees(-Math.atan(a / a));
          if (a == 0) {
            break label205;
          }
        }
      }
    }
    label127:
    if (a == 0)
    {
      if (a < 0.0D)
      {
        if (a != 0) {
          break label174;
        }
        if (a > 0.0D)
        {
          a = -90.0D + Math.toDegrees(Math.atan(a / a));
          if (a == 0) {
            break label205;
          }
        }
      }
      if (a != 0) {
        break label215;
      }
    }
    if (a < 0.0D)
    {
      label174:
      if (a != 0) {
        break label215;
      }
      if (a < 0.0D) {
        a = 90.0D + Math.toDegrees(Math.atan(a / a));
      }
    }
    label205:
    label215:
    double a = Math.sqrt(a * a + a * a);
    int a = (int)(Math.abs(a - a.field_70759_as) % 360.0D);
    
    int a = (a != 0) || (a > 180) ? 360 - a : a;return a;
  }
  
  public j()
  {
    e = a;
    
    a.f = new m();
    
    a.f.a(24, 1, c.THREE_DIMENSIONAL);a.d = new g();
  }
  
  public boolean b(Entity a)
  {
    int a = i.n;
    if (a == 0) {
      if (a == null) {
        return false;
      }
    }
    if (a == 0) {
      if (a.equals(a.c())) {
        return false;
      }
    }
    if (a == 0) {
      if ((a instanceof EntityLivingBase))
      {
        if (a != 0) {
          break label71;
        }
        if (!a.a((EntityLivingBase)a)) {
          break label61;
        }
        return false;
      }
    }
    return false;
    label61:
    label71:
    if (a == 0) {
      if (e.d.a(a)) {
        return false;
      }
    }
    if (a == 0) {
      if (e.c.l.a())
      {
        if (a != 0) {
          break label134;
        }
        if (e.d.b(a)) {
          return false;
        }
      }
    }
    label134:
    if (a == 0) {
      if (!e.c.j.a())
      {
        if (a != 0) {
          break label168;
        }
        if ((a instanceof EntityOtherPlayerMP)) {
          return false;
        }
      }
    }
    label168:
    if (a == 0) {
      if (!e.c.k.a())
      {
        if (a != 0) {
          break label189;
        }
        if ((a instanceof EntityCreature)) {
          return false;
        }
      }
    }
    label189:
    return true;
  }
  
  public boolean a(EntityLivingBase a)
  {
    int a = i.n;
    if (a == 0) {
      if ((a instanceof EntityPlayer))
      {
        EntityPlayer a = (EntityPlayer)a;boolean a = false;ItemStack[] a = a.field_71071_by.field_70460_b;int a = a.length;int a = 0;
        do
        {
          if (a >= a) {
            break;
          }
          ItemStack a = a[a];
          if (a == 0)
          {
            if (a != 0) {
              break label92;
            }
            if (a != null) {
              a = true;
            }
            a++;
          }
        } while (a == 0);
        if (((a != 0) || (a.func_82150_aj())) && (a.func_70694_bm() == null)) {
          label92:
          if (a != 0) {}
        }
        return !a;
      }
    }
    if ((a != 0) || (a.func_82150_aj())) {}
    return a.func_70694_bm() == null;
  }
  
  protected boolean d(Entity a)
  {
    return e.d.a(a);
  }
  
  public b d()
  {
    int a = i.n;
    if (a == 0) {
      if (a.b == null) {
        a.b = new b(a.c);
      }
    }
    return a.b;
  }
  
  public EntityPlayerSP c()
  {
    return a.a.field_71439_g;
  }
  
  public Minecraft a = Minecraft.func_71410_x();
  private b b;
  public h c;
  public g d;
  public static j e;
  public m f;
  public static boolean g;
  
  protected boolean e()
  {
    int a = i.n;
    if (a == 0) {
      if (a.c() == null) {
        return true;
      }
    }
    if (a == 0) {
      if (e.c.m.a())
      {
        if ((a != 0) || (a.c().func_71045_bC() != null))
        {
          if ((a != 0) || (!(a.c().func_71045_bC().func_77973_b() instanceof ItemSword))) {
            if (a != 0) {}
          }
          return !(a.c().func_71045_bC().func_77973_b() instanceof ItemAxe);
        }
        return true;
      }
    }
    return false;
  }
  
  public boolean a()
  {
    return true;
  }
}
