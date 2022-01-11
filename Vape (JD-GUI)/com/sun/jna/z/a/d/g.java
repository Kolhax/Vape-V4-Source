package com.sun.jna.z.a.d;

import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.g.n;
import com.sun.jna.z.a.i;
import com.sun.jna.z.a.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.IEventListener;

public class g
  implements IEventListener
{
  public void invoke(Event a)
  {
    RenderHandEvent localRenderHandEvent1 = (RenderHandEvent)a;int a = b.b;
    RenderHandEvent a;
    for (c a : i.d.a.a.values())
    {
      if ((a != 0) || (a.c())) {
        a.a(a.partialTicks);
      }
      if (a != 0) {
        j.g = !j.g;
      }
    }
    Minecraft a = Minecraft.func_71410_x();boolean a = a.field_71474_y.field_74336_f;
    
    a.field_71474_y.field_74336_f = false;i.d.j.a(a.partialTicks, a.renderPass);Iterator localIterator2 = i.d.a.a.values().iterator();
    do
    {
      if (!localIterator2.hasNext()) {
        break;
      }
      c a = (c)localIterator2.next();
      if (a != 0) {
        return;
      }
      if ((a != 0) || (a.c())) {
        a.b(a.partialTicks);
      }
    } while (a == 0);
    a.field_71474_y.field_74336_f = a;
  }
}
