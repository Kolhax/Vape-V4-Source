package com.sun.jna.z;

import java.util.concurrent.*;
import java.lang.reflect.*;

public class b implements Runnable
{
    final Main this$0;
    private static final String[] a;
    
    public b(final Main a) {
        this.this$0 = a;
    }
    
    @Override
    public void run() {
        final int a = Main.g ? 1 : 0;
        Main main2 = null;
        Label_0028: {
            Label_0024: {
                Main main;
                try {
                    main = (main2 = this.this$0);
                    if (a != 0) {
                        break Label_0028;
                    }
                    final boolean b = main.d;
                    if (b) {
                        return;
                    }
                    break Label_0024;
                }
                catch (Exception ex) {
                    throw ex;
                }
                try {
                    final boolean b = main.d;
                    if (b) {
                        return;
                    }
                }
                catch (Exception ex2) {
                    throw ex2;
                }
            }
            main2 = this.this$0;
        }
        main2.d = true;
        Label_0281: {
            try {
                Thread.sleep(200L);
                final Class<?>[] declaredClasses = Thread.class.getDeclaredClasses();
                final int a2 = declaredClasses.length;
                int a3 = 0;
                while (a3 < a2) {
                    final Class a4 = declaredClasses[a3];
                    Label_0273: {
                        Label_0141: {
                            Label_0138: {
                                Label_0074: {
                                    try {
                                        if (a != 0) {
                                            break Label_0273;
                                        }
                                        final int n = a;
                                        if (n == 0) {
                                            break Label_0074;
                                        }
                                        break Label_0141;
                                    }
                                    catch (Exception ex3) {
                                        throw ex3;
                                    }
                                    try {
                                        final int n = a;
                                        if (n != 0) {
                                            break Label_0141;
                                        }
                                        final String name = a4.getName();
                                        final String[] a5 = b.a;
                                        if (!name.contains(a5[1])) {
                                            break Label_0138;
                                        }
                                    }
                                    catch (Exception ex4) {
                                        throw ex4;
                                    }
                                }
                                final Class a6 = a4;
                                final Field a7 = a6.getDeclaredField(b.a[0]);
                                a7.setAccessible(true);
                                final ConcurrentMap a8 = (ConcurrentMap)a7.get(null);
                                a8.clear();
                            }
                            ++a3;
                        }
                        if (a != 0) {
                            break;
                        }
                        continue;
                    }
                    break Label_0281;
                }
                this.this$0.f.a();
                this.this$0.k();
                this.this$0.l();
                this.this$0.o();
                this.this$0.h();
                this.this$0.j();
                this.this$0.e.set(false);
                this.this$0.i();
                this.this$0.m();
                this.this$0.n();
                this.this$0.a.close();
                this.this$0.a = null;
                this.this$0.b = null;
                Main.c = null;
                System.gc();
                System.runFinalization();
                System.gc();
                Thread.sleep(100L);
                System.gc();
                System.runFinalization();
            }
            catch (Exception a9) {
                a9.printStackTrace();
            }
        }
        Main.access$000();
    }
    
    static {
        final String[] a2 = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "¾«\u00f7b\u00c0\u0089®¾\u009f\u00e0e\u00c5\u009c®\u0006\u008e¿\u00f6i\u00c9\u009b").length();
        int char1 = 14;
        int n2 = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(n2);
                ++n2;
                final String s2 = s;
                final int n3 = n2;
                final char[] charArray = s2.substring(n3, n3 + char1).toCharArray();
                int length2;
                int n5;
                final int n4 = n5 = (length2 = charArray.length);
                int n6 = 0;
                while (true) {
                    Label_0189: {
                        if (n4 > 1) {
                            break Label_0189;
                        }
                        length2 = (n5 = n6);
                        do {
                            final char c = charArray[n5];
                            char c2 = '\0';
                            switch (n6 % 7) {
                                case 0: {
                                    c2 = '\u00cd';
                                    break;
                                }
                                case 1: {
                                    c2 = '\u00de';
                                    break;
                                }
                                case 2: {
                                    c2 = '\u0095';
                                    break;
                                }
                                case 3: {
                                    c2 = '\u0001';
                                    break;
                                }
                                case 4: {
                                    c2 = '¬';
                                    break;
                                }
                                case 5: {
                                    c2 = '\u00e8';
                                    break;
                                }
                                default: {
                                    c2 = '\u00dd';
                                    break;
                                }
                            }
                            charArray[length2] = (char)(c ^ c2);
                            ++n6;
                        } while (n4 == 0);
                    }
                    if (n4 > n6) {
                        continue;
                    }
                    break;
                }
                a2[n++] = new String(charArray).intern();
            } while ((n2 += char1) < length);
        }
        a = a2;
    }
}
