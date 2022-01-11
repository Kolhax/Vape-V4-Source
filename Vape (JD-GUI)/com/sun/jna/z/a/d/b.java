package com.sun.jna.z.a.d;

import com.sun.jna.z.a.e.a.a;
import com.sun.jna.z.a.e.c;
import com.sun.jna.z.a.e.g;
import com.sun.jna.z.a.h;
import com.sun.jna.z.a.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.IEventListener;
import org.lwjgl.input.Keyboard;

public class b
  implements IEventListener
{
  public static int b;
  
  public void invoke(Event a)
  {
    int a = b;
    if (a == 0)
    {
      if ((Keyboard.getEventKey() == i.d.a.a(a.class).b()) && (!Keyboard.isRepeatEvent())) {
        a.a();
      }
      i.d.k.a(null);
    }
    Iterator localIterator = i.d.a.a.values().iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      c a = (c)localIterator.next();
      if (((a != 0) || (a.b() != 65235)) && ((a != 0) || ((!Keyboard.isRepeatEvent()) && (Keyboard.getEventKeyState())))) {
        a.a(Keyboard.getEventKey());
      }
    } while (a == 0);
  }
}
