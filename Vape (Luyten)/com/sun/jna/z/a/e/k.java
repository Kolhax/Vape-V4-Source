package com.sun.jna.z.a.e;

import com.sun.jna.z.a.f.a.a.a.d.*;
import java.util.concurrent.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

class k implements a
{
    final CopyOnWriteArrayList a;
    final int b;
    final m c;
    
    k(final m a, final CopyOnWriteArrayList a2, final int b) {
        this.c = a;
        this.a = a2;
        this.b = b;
    }
    
    @Override
    public void a(final g a, final int a) {
        new o(this).start();
    }
}
