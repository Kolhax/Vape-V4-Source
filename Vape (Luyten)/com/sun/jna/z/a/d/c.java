package com.sun.jna.z.a.d;

import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.event.entity.living.*;
import com.sun.jna.z.a.*;
import java.util.*;

public class c implements IEventListener
{
    public void invoke(final Event a) {
        final int b = com.sun.jna.z.a.d.b.b;
        final LivingEvent$LivingUpdateEvent a2 = (LivingEvent$LivingUpdateEvent)a;
        final int a3 = b;
        for (final com.sun.jna.z.a.e.c c : i.d.a.a.values()) {
            final com.sun.jna.z.a.e.c a4 = c;
            if (a3 != 0 || c.c()) {
                c.a(a2);
            }
            if (a3 != 0) {
                break;
            }
        }
    }
}
