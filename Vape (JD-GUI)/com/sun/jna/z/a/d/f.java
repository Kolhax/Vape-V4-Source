package com.sun.jna.z.a.d;

import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.e.g;
import com.sun.jna.z.a.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.IEventListener;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class f
  implements IEventListener
{
  public void invoke(Event a)
  {
    TickEvent.PlayerTickEvent a = (TickEvent.PlayerTickEvent)a;
    
    int a = b.b;
    if (a.phase != TickEvent.Phase.START) {
      return;
    }
    Iterator localIterator = i.d.a.a.values().iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      c a = (c)localIterator.next();
      if ((a != 0) || (a.c())) {
        a.a(a);
      }
    } while (a == 0);
  }
}
