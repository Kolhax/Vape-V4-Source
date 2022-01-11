package com.sun.jna.z.a.e;

import com.sun.jna.z.a.*;
import com.sun.jna.z.*;
import java.util.*;

public class d extends c
{
    public d(final String a, final b a, final int a) {
        super(a, a, a);
    }
    
    @Override
    public void e() {
        this.a.field_71462_r = null;
        final int m = c.m ? 1 : 0;
        this.a.func_71381_h();
        final int a = m;
        Iterator<c> iterator = com.sun.jna.z.a.i.d.a.a.values().iterator();
    Label_0147:
        while (true) {
        Label_0153_Outer:
            while (iterator.hasNext()) {
                c a2 = iterator.next();
                Label_0188: {
                Block_7:
                    while (true) {
                        Label_0086: {
                            c c2 = null;
                            Label_0082: {
                                Label_0074: {
                                    c c;
                                    try {
                                        c = (c2 = a2);
                                        if (a != 0) {
                                            break Label_0082;
                                        }
                                        final boolean b;
                                        final boolean hasNext = b = c.c();
                                        final int n = a;
                                        if (n == 0) {
                                            break Label_0074;
                                        }
                                        break Label_0153;
                                    }
                                    catch (InterruptedException ex) {
                                        throw ex;
                                    }
                                    try {
                                        final boolean b;
                                        final boolean hasNext = b = c.c();
                                        final int n = a;
                                        if (n != 0) {
                                            break Label_0153;
                                        }
                                        if (!b) {
                                            break Label_0086;
                                        }
                                    }
                                    catch (InterruptedException ex2) {
                                        throw ex2;
                                    }
                                }
                                c2 = a2;
                            }
                            c2.a(false);
                        }
                        if (a != 0) {
                            break;
                        }
                        continue Label_0153_Outer;
                        boolean hasNext = false;
                        if (hasNext) {
                            a2 = iterator.next();
                            try {
                                a2.g();
                                if (a != 0) {
                                    break Label_0188;
                                }
                                if (a == 0) {
                                    break Label_0147;
                                }
                            }
                            catch (InterruptedException ex3) {
                                throw ex3;
                            }
                            break Block_7;
                            hasNext = iterator.hasNext();
                            continue;
                        }
                        break;
                    }
                    try {
                        Thread.sleep(100L);
                    }
                    catch (InterruptedException a3) {
                        a3.printStackTrace();
                    }
                }
                this.a.field_71438_f.func_72712_a();
                com.sun.jna.z.a.j.e.c.a.clear();
                new Thread(Main.c.b).start();
                return;
            }
            this.b().field_71456_v.func_146158_b().func_146242_c(420);
            com.sun.jna.z.a.i.d.e = true;
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException a3) {
                a3.printStackTrace();
            }
            iterator = com.sun.jna.z.a.i.d.a.a.values().iterator();
            continue Label_0147;
        }
    }
}
