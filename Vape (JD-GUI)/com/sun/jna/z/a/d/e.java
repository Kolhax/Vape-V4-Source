package com.sun.jna.z.a.d;

import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.e.g;
import com.sun.jna.z.a.i;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.IEventListener;

public class e
  implements IEventListener
{
  private static final String a;
  
  public void invoke(Event a)
  {
    c localc1 = i.d.a.a(a);int a = b.b;
    c a;
    if (((a != 0) || (a != null)) && (a.c())) {
      a.setCanceled(true);
    }
  }
}
