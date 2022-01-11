package com.sun.jna.z.a;

import com.sun.jna.z.Main;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import md.k;
import md.m;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Post;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderLivingEvent.Specials.Pre;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.IEventListener;
import net.minecraftforge.fml.common.eventhandler.ListenerList;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class i
{
  public com.sun.jna.z.a.e.g a;
  public com.sun.jna.z.a.g.f b;
  public com.sun.jna.z.a.b.e c;
  public static i d;
  public boolean e;
  public com.sun.jna.z.a.b.f f;
  public double g;
  public boolean h;
  public com.sun.jna.z.a.g.l i;
  public com.sun.jna.z.a.g.n j;
  public h k;
  public NetHandlerPlayClient l;
  Map<IEventListener, Event> m;
  public static boolean n;
  private static final String o;
  
  public i()
  {
    int a = n;a.g = 2.06D;
    
    a.m = new HashMap();d = a;a.i = new com.sun.jna.z.a.g.l();
    
    a.j = new com.sun.jna.z.a.g.n();a.c = new com.sun.jna.z.a.b.e();
    if ((a != 0) || (a.c.d))
    {
      int a = 0;
      if (a == 0)
      {
        if (a > 0)
        {
          a.h = true;j.a(o);
        }
        a.a = new com.sun.jna.z.a.e.g();
      }
      d.a.a(new m());d.a.a(new k());d.a.a(new md.i());d.a.a(new md.a());d.a.a(new md.l());d.a.a(new md.f());d.a.a(new md.h());d.a.a(new md.g());d.a.a(new md.b());d.a.a(new md.j());d.a.a(new md.n());d.a.a(new md.e());d.a.a(new md.d());d.a.a(new md.c());new com.sun.jna.z.a.f.a.a.a.d(d);a.a.a();
      
      a.k = new h();
      
      new j();a.f = new com.sun.jna.z.a.b.f(a.c);a.f.g();
      
      a.b = new com.sun.jna.z.a.g.f();a.a(RenderGameOverlayEvent.Post.class, new com.sun.jna.z.a.d.a(), 1);a.a(MouseEvent.class, new com.sun.jna.z.a.d.d(), 1);a.a(RenderHandEvent.class, new com.sun.jna.z.a.d.g(), 1);a.a(LivingEvent.LivingUpdateEvent.class, new com.sun.jna.z.a.d.c(), 1);a.a(RenderLivingEvent.Specials.Pre.class, new com.sun.jna.z.a.d.e(), 1);a.a(InputEvent.KeyInputEvent.class, new com.sun.jna.z.a.d.b(), 0);a.a(TickEvent.PlayerTickEvent.class, new com.sun.jna.z.a.d.f(), 0);
      if (a == 0) {}
    }
    else
    {
      new Thread(Main.c.b).start();
    }
    if (j.g) {
      n = a == 0;
    }
  }
  
  public void a()
  {
    Iterator localIterator = a.m.keySet().iterator();int a = n;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      IEventListener a = (IEventListener)localIterator.next();Event a = (Event)a.m.get(a);
      
      a.getListenerList().unregister(1, a);
      if (a != 0) {
        break label86;
      }
    } while (a == 0);
    localIterator = a.m.keySet().iterator();
    label86:
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      IEventListener a = (IEventListener)localIterator.next();Event a = (Event)a.m.get(a);a.getListenerList().unregister(0, a);
      if (a != 0) {
        break label158;
      }
    } while (a == 0);
    if (a == 0) {
      if (a.m != null) {
        a.m.clear();
      }
    }
    label158:
    if (a == 0) {
      if (a.a != null) {
        a.a.a.clear();
      }
    }
    if ((a != 0) || (a.b != null)) {
      a.b.a.clear();
    }
    j.e = null;
    
    d = null;
  }
  
  public void a(Class a, IEventListener a, int a)
  {
    try
    {
      Class a = a;Constructor a = a.getConstructor(new Class[0]);
      
      a.setAccessible(true);Event a = (Event)a.newInstance(new Object[0]);a.getListenerList().register(a, EventPriority.NORMAL, a);a.m.put(a, a);
    }
    catch (Exception a)
    {
      a.printStackTrace();
    }
  }
}
