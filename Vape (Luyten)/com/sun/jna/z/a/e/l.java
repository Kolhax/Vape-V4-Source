package com.sun.jna.z.a.e;

import md.*;

public class l implements Runnable
{
    public i a;
    
    public l(final i a) {
        this.a = a;
        new p(this).start();
    }
    
    @Override
    public void run() {
        this.a.h();
    }
}
