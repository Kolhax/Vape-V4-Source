package com.sun.jna.z.a.g;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.StringUtils;

public class g
{
  public boolean a(Entity a)
  {
    int a = b;
    if (a == 0) {
      if ((a instanceof EntityOtherPlayerMP))
      {
        EntityOtherPlayerMP a = (EntityOtherPlayerMP)a;
        if (a == 0) {
          break label26;
        }
      }
    }
    return false;
    label26:
    EntityOtherPlayerMP a;
    String a = StringUtils.func_76338_a(a.func_70005_c_().toLowerCase().trim());
    if (a == 0) {
      if (!a.a.contains(a))
      {
        if (a != 0) {
          break label77;
        }
        if (!a.contains(c)) {
          break label76;
        }
      }
    }
    return true;
    label76:
    label77:
    return false;
  }
  
  public boolean b(Entity a)
  {
    int a = b;
    if (a == 0) {
      if ((a instanceof EntityOtherPlayerMP))
      {
        EntityOtherPlayerMP a = (EntityOtherPlayerMP)a;
        if (a == 0) {
          break label26;
        }
      }
    }
    return false;
    label26:
    EntityOtherPlayerMP a;
    if ((a != 0) || (a.func_96124_cp() != null))
    {
      if (a != 0) {
        break label64;
      }
      if (Minecraft.func_71410_x().field_71439_g.func_96124_cp() != null) {}
    }
    else
    {
      return false;
    }
    label64:
    return Minecraft.func_71410_x().field_71439_g.func_96124_cp().func_142054_a(a.func_96124_cp());
  }
  
  public List<String> a = new ArrayList();
  public static int b;
  private static final String c;
}
