package com.sun.jna.z.a.c;

import com.mojang.authlib.GameProfile;
import com.sun.jna.z.a.j;
import java.io.PrintStream;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S12PacketEntityVelocity;

public class a
  extends NetHandlerPlayClient
{
  public static boolean b;
  private static final String a;
  
  public a(Minecraft a, GuiScreen a, NetworkManager a, GameProfile a)
  {
    a.<init>(a, a, a, a);int a = b;
    if (a != 0) {
      j.g = !j.g;
    }
  }
  
  public void func_147244_a(S12PacketEntityVelocity a)
  {
    System.out.println(a);
  }
}
