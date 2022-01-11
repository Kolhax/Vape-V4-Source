package com.sun.jna.z.a.d;

import net.minecraftforge.fml.common.eventhandler.*;
import org.lwjgl.input.*;
import com.sun.jna.z.a.*;
import com.sun.jna.z.a.e.a.*;
import net.minecraftforge.client.event.*;
import com.sun.jna.z.a.e.*;
import java.util.*;

public class b implements IEventListener
{
    public static int b;
    
    public void invoke(final Event a) {
        final int a2 = com.sun.jna.z.a.d.b.b;
        if (a2 == 0) {
            if (Keyboard.getEventKey() == i.d.a.a(a.class).b() && !Keyboard.isRepeatEvent()) {
                a.a();
            }
            i.d.k.a(null);
        }
        for (final c a3 : i.d.a.a.values()) {
            boolean b;
            final int n = (b = (a3.b() != 0)) ? 1 : 0;
            Label_0126: {
                if (a2 == 0) {
                    if (n == -301) {
                        break Label_0126;
                    }
                    final boolean repeatEvent;
                    b = (repeatEvent = Keyboard.isRepeatEvent());
                }
                if (a2 == 0) {
                    if (n != 0) {
                        break Label_0126;
                    }
                    b = Keyboard.getEventKeyState();
                }
                if (b) {
                    a3.a(Keyboard.getEventKey());
                }
            }
            if (a2 != 0) {
                break;
            }
        }
    }
}
