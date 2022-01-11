package com.sun.jna.z.a.d;

import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.gameevent.*;
import com.sun.jna.z.a.*;
import com.sun.jna.z.a.e.*;
import java.util.*;

public class f implements IEventListener
{
    public void invoke(final Event a) {
        final int b = com.sun.jna.z.a.d.b.b;
        final TickEvent$PlayerTickEvent a2 = (TickEvent$PlayerTickEvent)a;
        final int a3 = b;
        if (a2.phase != TickEvent$Phase.START) {
            return;
        }
        for (final c c : i.d.a.a.values()) {
            final c a4 = c;
            if (a3 != 0 || c.c()) {
                c.a(a2);
            }
            if (a3 != 0) {
                break;
            }
        }
    }
}
