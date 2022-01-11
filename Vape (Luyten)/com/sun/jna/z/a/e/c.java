package com.sun.jna.z.a.e;

import com.sun.jna.z.a.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.event.entity.living.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class c extends j
{
    private String h;
    private int i;
    private boolean j;
    private int k;
    private b l;
    public static boolean m;
    
    public c(final String a, final b a, final int a) {
        this.h = a;
        this.l = a;
        this.k = a;
        this.i = -301;
    }
    
    public c(final String a, final b a, final int a, final int a) {
        this.h = a;
        this.l = a;
        this.k = a;
        this.i = a;
    }
    
    public String a() {
        return this.h;
    }
    
    public int b() {
        return this.i;
    }
    
    public boolean c() {
        return this.j;
    }
    
    public void b(final String a) {
        this.h = a;
    }
    
    public void a(final boolean a) {
        final int a2 = c.m ? 1 : 0;
        c c = this;
        if (a2 == 0) {
            this.j = a;
            if (a) {
                this.e();
                if (a2 == 0) {
                    return;
                }
            }
            c = this;
        }
        c.f();
    }
    
    public void a(final MouseEvent a) {
    }
    
    public void a(final int a) {
        if (a == this.i) {
            this.d();
        }
    }
    
    public void d() {
        final int a = c.m ? 1 : 0;
        final boolean j = this.j;
        if (a == 0 && j) {}
        this.j = j;
        c c = this;
        if (a == 0) {
            if (this.j) {
                this.e();
                if (a == 0) {
                    return;
                }
            }
            c = this;
        }
        c.f();
    }
    
    public void e() {
    }
    
    public void f() {
    }
    
    public void a(final TickEvent$PlayerTickEvent a) {
    }
    
    public void a(final LivingEvent$LivingUpdateEvent a) {
    }
    
    public void g() {
    }
    
    public void a(final float a) {
    }
    
    public void b(final float a) {
    }
    
    public void h() {
    }
    
    public b i() {
        return this.l;
    }
    
    public int j() {
        return this.k;
    }
    
    public void b(final int a) {
        this.i = a;
    }
    
    @Override
    public String toString() {
        return this.h;
    }
    
    public k[] k() {
        return null;
    }
}
