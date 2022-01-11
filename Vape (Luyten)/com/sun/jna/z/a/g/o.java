package com.sun.jna.z.a.g;

import java.io.*;
import org.lwjgl.*;
import org.lwjgl.opengl.*;
import java.nio.*;

public class o
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final int i = 10497;
    
    public o(final InputStream a) throws IOException {
        this(a, 9729);
    }
    
    public o(final InputStream a, final int a) throws IOException {
        this(a, a, 33071);
    }
    
    public o(final InputStream a, final int a, final int a) throws IOException {
        this.a = 3553;
        this.e = 9729;
        this.f = 9728;
        this.g = 10496;
        final int b = com.sun.jna.z.a.g.g.b;
        this.h = 33071;
        final int a2 = b;
        try {
            final j a3 = new j(a);
            this.c = a3.b();
            this.d = a3.a();
            final int a4 = 4;
            final ByteBuffer a5 = BufferUtils.createByteBuffer(4 * this.c * this.d);
            a3.a(a5, this.c * 4, com.sun.jna.z.a.g.b.RGBA);
            a5.flip();
            GL11.glEnable(this.a);
            this.b = GL11.glGenTextures();
            this.a();
            GL11.glPixelStorei(3317, 1);
            GL11.glTexParameteri(this.a, 10241, a);
            GL11.glTexParameteri(this.a, 10240, a);
            GL11.glTexParameteri(this.a, 10242, a);
            GL11.glTexParameteri(this.a, 10243, a);
            GL11.glTexImage2D(this.a, 0, 6408, this.c, this.d, 0, 6408, 5121, a5);
            InputStream inputStream = a;
            Label_0226: {
                if (a2 != 0) {
                    break Label_0226;
                }
                if (a == null) {
                    return;
                }
                try {
                    inputStream = a;
                    inputStream.close();
                }
                catch (IOException ex2) {}
            }
        }
        finally {
            Label_0253: {
                try {
                    final InputStream inputStream2 = a;
                    if (a2 != 0) {
                        break Label_0253;
                    }
                    if (a == null) {
                        break Label_0253;
                    }
                }
                catch (IOException ex) {
                    throw ex;
                }
                try {
                    final InputStream inputStream2 = a;
                    inputStream2.close();
                }
                catch (IOException ex3) {}
            }
        }
    }
    
    public void a() {
        GL11.glBindTexture(this.a, this.b);
    }
    
    public static void a(final o a, final float a, final float a, final float a, final float a) {
        a.a();
        final float a2 = 0.0f;
        final float a3 = 0.0f;
        final float a4 = 1.0f;
        final float a5 = 1.0f;
        GL11.glBegin(7);
        GL11.glTexCoord2f(a2, a3);
        GL11.glVertex2f(a, a);
        GL11.glTexCoord2f(a2, a5);
        GL11.glVertex2f(a, a + a);
        GL11.glTexCoord2f(a4, a5);
        GL11.glVertex2f(a + a, a + a);
        GL11.glTexCoord2f(a4, a3);
        GL11.glVertex2f(a + a, a);
        GL11.glEnd();
    }
}
