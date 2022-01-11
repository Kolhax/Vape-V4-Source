package com.sun.jna.z.a;

import com.sun.jna.z.a.b.*;
import com.sun.jna.z.a.g.*;
import net.minecraft.client.network.*;
import com.sun.jna.z.a.e.*;
import md.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.gameevent.*;
import com.sun.jna.z.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.lang.reflect.*;
import java.util.*;

public class i
{
    public g a;
    public f b;
    public e c;
    public static i d;
    public boolean e;
    public com.sun.jna.z.a.b.f f;
    public double g;
    public boolean h;
    public l i;
    public n j;
    public h k;
    public NetHandlerPlayClient l;
    Map<IEventListener, Event> m;
    public static boolean n;
    private static final String o;
    
    public i() {
        final int n = com.sun.jna.z.a.i.n ? 1 : 0;
        final int a = n;
        this.g = 2.06;
        this.m = new HashMap<IEventListener, Event>();
        com.sun.jna.z.a.i.d = this;
        this.i = new l();
        this.j = new n();
        this.c = new e();
        boolean d;
        final boolean b = d = this.c.d;
        Label_0545: {
            Label_0529: {
                if (a == 0) {
                    if (!b) {
                        break Label_0529;
                    }
                    d = false;
                }
                final int a2 = d ? 1 : 0;
                if (a == 0) {
                    if (a2 > 0) {
                        this.h = true;
                        com.sun.jna.z.a.j.a(com.sun.jna.z.a.i.o);
                    }
                    this.a = new g();
                }
                com.sun.jna.z.a.i.d.a.a(new m());
                com.sun.jna.z.a.i.d.a.a(new k());
                com.sun.jna.z.a.i.d.a.a(new md.i());
                com.sun.jna.z.a.i.d.a.a(new a());
                com.sun.jna.z.a.i.d.a.a(new md.l());
                com.sun.jna.z.a.i.d.a.a(new md.f());
                com.sun.jna.z.a.i.d.a.a(new md.h());
                com.sun.jna.z.a.i.d.a.a(new md.g());
                com.sun.jna.z.a.i.d.a.a(new b());
                com.sun.jna.z.a.i.d.a.a(new md.j());
                com.sun.jna.z.a.i.d.a.a(new md.n());
                com.sun.jna.z.a.i.d.a.a(new md.e());
                com.sun.jna.z.a.i.d.a.a(new d());
                com.sun.jna.z.a.i.d.a.a(new md.c());
                new com.sun.jna.z.a.f.a.a.a.d(com.sun.jna.z.a.i.d);
                this.a.a();
                this.k = new h();
                new j();
                (this.f = new com.sun.jna.z.a.b.f(this.c)).g();
                this.b = new f();
                this.a(RenderGameOverlayEvent$Post.class, (IEventListener)new com.sun.jna.z.a.d.a(), 1);
                this.a(MouseEvent.class, (IEventListener)new com.sun.jna.z.a.d.d(), 1);
                this.a(RenderHandEvent.class, (IEventListener)new com.sun.jna.z.a.d.g(), 1);
                this.a(LivingEvent$LivingUpdateEvent.class, (IEventListener)new com.sun.jna.z.a.d.c(), 1);
                this.a(RenderLivingEvent$Specials$Pre.class, (IEventListener)new com.sun.jna.z.a.d.e(), 1);
                this.a(InputEvent$KeyInputEvent.class, (IEventListener)new com.sun.jna.z.a.d.b(), 0);
                this.a(TickEvent$PlayerTickEvent.class, (IEventListener)new com.sun.jna.z.a.d.f(), 0);
                if (a == 0) {
                    break Label_0545;
                }
            }
            new Thread(Main.c.b).start();
        }
        if (com.sun.jna.z.a.j.g) {
            com.sun.jna.z.a.i.n = (a == 0);
        }
    }
    
    public void a(final Class a, final IEventListener a, final int a) {
        try {
            final Constructor a2 = a.getConstructor((Class[])new Class[0]);
            a2.setAccessible(true);
            final Event a3 = a2.newInstance(new Object[0]);
            a3.getListenerList().register(a, EventPriority.NORMAL, a);
            this.m.put(a, a3);
        }
        catch (Exception a4) {
            a4.printStackTrace();
        }
    }
    
    public void a() {
        final int n = com.sun.jna.z.a.i.n ? 1 : 0;
        Iterator<IEventListener> iterator = this.m.keySet().iterator();
        final int a = n;
        while (true) {
            while (iterator.hasNext()) {
                IEventListener a2 = iterator.next();
                Event a3 = this.m.get(a2);
                a3.getListenerList().unregister(1, a2);
                if (a == 0) {
                    if (a != 0) {
                        break;
                    }
                    continue;
                }
                else {
                Label_0159_Outer:
                    while (true) {
                        while (true) {
                            while (iterator.hasNext()) {
                                a2 = iterator.next();
                                a3 = this.m.get(a2);
                                a3.getListenerList().unregister(0, a2);
                                if (a != 0) {
                                    i i = this;
                                    final i j = this;
                                    if (a == 0) {
                                        if (j.a != null) {
                                            this.a.a.clear();
                                        }
                                        i = this;
                                    }
                                    final f b = i.b;
                                    Label_0202: {
                                        if (a == 0) {
                                            if (b == null) {
                                                break Label_0202;
                                            }
                                            final f b2 = this.b;
                                        }
                                        b.a.clear();
                                    }
                                    com.sun.jna.z.a.j.e = null;
                                    com.sun.jna.z.a.i.d = null;
                                    return;
                                }
                                if (a != 0) {
                                    break;
                                }
                            }
                            i i = this;
                            final i j = this;
                            if (a != 0) {
                                continue;
                            }
                            break;
                        }
                        if (this.m != null) {
                            this.m.clear();
                        }
                        continue Label_0159_Outer;
                    }
                }
            }
            iterator = this.m.keySet().iterator();
            continue;
        }
    }
    
    static {
        final char[] charArray = "\u0092S'\u0014?\f\u000b°V6\u0005z\u0007".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0125: {
                if (n > 1) {
                    break Label_0125;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 7) {
                        case 0: {
                            c2 = '\u00c4';
                            break;
                        }
                        case 1: {
                            c2 = '2';
                            break;
                        }
                        case 2: {
                            c2 = 'W';
                            break;
                        }
                        case 3: {
                            c2 = 'q';
                            break;
                        }
                        case 4: {
                            c2 = '\u001f';
                            break;
                        }
                        case 5: {
                            c2 = 'c';
                            break;
                        }
                        default: {
                            c2 = '~';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                o = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
