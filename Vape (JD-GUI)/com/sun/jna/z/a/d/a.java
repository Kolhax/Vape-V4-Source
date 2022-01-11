package com.sun.jna.z.a.d;

import com.sun.jna.z.a.b.f;
import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.e.d;
import com.sun.jna.z.a.e.g;
import com.sun.jna.z.a.j;
import java.awt.Font;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.IEventListener;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class a
  implements IEventListener
{
  com.sun.jna.z.a.g.h a;
  boolean b;
  private static final String c;
  
  public void invoke(Event a)
  {
    RenderGameOverlayEvent localRenderGameOverlayEvent1 = (RenderGameOverlayEvent)a;int a = b.b;
    RenderGameOverlayEvent a;
    if (((a == 0) && (a.isCancelable())) || (a.type != RenderGameOverlayEvent.ElementType.ALL)) {
      return;
    }
    if ((a != 0) || (Keyboard.isKeyDown(29))) {
      if (a == 0)
      {
        if (Keyboard.isKeyDown(199)) {
          if (a != 0) {
            break label87;
          }
        }
      }
      else if (!a.b)
      {
        a.b = true;
        
        com.sun.jna.z.a.i.d.a.a(d.class).d();
      }
    }
    label87:
    if ((a != 0) || (a.a == null)) {
      a.a = new com.sun.jna.z.a.g.h(new Font(c, 0, 20), 20.0F);
    }
    if (a == 0)
    {
      if (j.e.c == null)
      {
        j.e.c = new com.sun.jna.z.a.f.a.a.a.h();
        
        j.e.c.a(new com.sun.jna.z.a.f.a.a.a.e.a.i());j.e.c.a();com.sun.jna.z.a.i.d.f.g();
        if (a == 0) {}
      }
      else
      {
        GL11.glPushMatrix();
      }
    }
    else
    {
      j.e.c.f();
      
      GL11.glPopMatrix();
      if (a != 0) {
        return;
      }
      if (Minecraft.func_71410_x().field_71462_r != j.e.d())
      {
        GL11.glPushMatrix();j.e.c.e();
        
        GL11.glPopMatrix();
      }
    }
    a.a.b(" ", 0.0F, 0.0F, 0);
  }
}
