package com.sun.jna.z.a.f.a.a.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.*;
import java.util.*;

public class j implements h
{
    private List<g> a;
    
    public j() {
        this.a = new ArrayList<g>();
    }
    
    @Override
    public void a(final g a) {
        try {
            if (a == null) {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        synchronized (this.a) {
            this.a.add(a);
        }
    }
    
    @Override
    public void b(final g a) {
        try {
            if (a == null) {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        synchronized (this.a) {
            this.a.remove(a);
        }
    }
    
    @Override
    public g[] a() {
        synchronized (this.a) {
            return this.a.toArray(new g[this.a.size()]);
        }
    }
}
