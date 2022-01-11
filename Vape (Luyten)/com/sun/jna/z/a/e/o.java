package com.sun.jna.z.a.e;

import com.sun.jna.z.a.g.*;
import java.util.*;

class o extends Thread
{
    final k a;
    
    o(final k a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final int m = c.m ? 1 : 0;
        final Iterator iterator = this.a.a.iterator();
        final int a = m;
        while (iterator.hasNext()) {
            final d a2 = iterator.next();
            final int d = a2.d;
            if (a == 0) {
                if (d == this.a.b) {
                    this.a.a.remove(a2);
                }
            }
            if (a != 0) {
                break;
            }
        }
    }
}
