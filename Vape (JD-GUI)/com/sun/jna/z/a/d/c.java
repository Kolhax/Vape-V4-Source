package com.sun.jna.z.a.d;

import com.sun.jna.z.a.e.g;
import com.sun.jna.z.a.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.IEventListener;

public class c
  implements IEventListener
{
  public void invoke(Event a)
  {
    LivingEvent.LivingUpdateEvent a = (LivingEvent.LivingUpdateEvent)a;
    int a = b.b;Iterator localIterator = i.d.a.a.values().iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      com.sun.jna.z.a.e.c a = (com.sun.jna.z.a.e.c)localIterator.next();
      if ((a != 0) || (a.c())) {
        a.a(a);
      }
    } while (a == 0);
  }
}
