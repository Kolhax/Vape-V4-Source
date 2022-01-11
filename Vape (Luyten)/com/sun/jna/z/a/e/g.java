package com.sun.jna.z.a.e;

import java.awt.im.*;
import com.sun.jna.z.a.e.a.*;
import com.sun.jna.z.a.*;
import java.util.*;
import com.sun.jna.z.a.f.a.a.a.a.*;

public class g
{
    public Map<Class, c> a;
    private static final String[] b;
    
    public g() {
        final int m = c.m ? 1 : 0;
        this.a = new HashMap<Class, c>();
        final String a = InputContext.getInstance().getLocale().getLanguage();
        final int a2 = m;
        final String[] a3 = g.b;
        this.a(new a(a3[1], com.sun.jna.z.a.e.b.None, a.equals(a3[2]) ? 41 : 54, 0));
        this.a(new d(g.b[0], com.sun.jna.z.a.e.b.Other, 0));
        if (a2 != 0) {
            j.g = !j.g;
        }
    }
    
    public void a() {
        this.a = this.a(this.a);
    }
    
    private Map<Class, c> a(final Map<Class, c> a) {
        final List<Map.Entry<Class, c>> a2 = new LinkedList<Map.Entry<Class, c>>((Collection<? extends Map.Entry<Class, c>>)a.entrySet());
        Collections.sort(a2, new h(this));
        final int m = c.m ? 1 : 0;
        final Map<Class, c> a3 = new LinkedHashMap<Class, c>();
        final Iterator<Map.Entry<Class, c>> iterator = a2.iterator();
        final int a4 = m;
        Map<Class, c> map = null;
        while (iterator.hasNext()) {
            final Map.Entry<Class, c> a5 = (Map.Entry<Class, c>)(Map.Entry)iterator.next();
            map = a3;
            if (a4 != 0) {
                return map;
            }
            map.put(a5.getKey(), a5.getValue());
            if (a4 != 0) {
                break;
            }
        }
        return map;
    }
    
    public void a(final c a) {
        this.a.put(a.getClass(), a);
    }
    
    public c a(final String a) {
        final int m = c.m ? 1 : 0;
        final Iterator<c> iterator = this.a.values().iterator();
        final int a2 = m;
        while (iterator.hasNext()) {
            final c c;
            final c a3 = c = iterator.next();
            if (a2 != 0 || c.a().toLowerCase().equals(a.toLowerCase())) {
                return c;
            }
            if (a2 != 0) {
                break;
            }
        }
        return null;
    }
    
    public List<t> b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore_2       
        //     8: getstatic       com/sun/jna/z/a/e/c.m:Z
        //    11: istore_1        /* a */
        //    12: aload_0         /* a */
        //    13: getfield        com/sun/jna/z/a/e/g.a:Ljava/util/Map;
        //    16: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //    21: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    26: astore_3       
        //    27: aload_3        
        //    28: invokeinterface java/util/Iterator.hasNext:()Z
        //    33: ifeq            127
        //    36: aload_3        
        //    37: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    42: checkcast       Lcom/sun/jna/z/a/e/c;
        //    45: astore          a
        //    47: aload           a
        //    49: invokevirtual   com/sun/jna/z/a/e/c.k:()[Lcom/sun/jna/z/a/f/a/a/a/a/k;
        //    52: iload_1         /* a */
        //    53: ifne            64
        //    56: ifnull          123
        //    59: aload           a
        //    61: invokevirtual   com/sun/jna/z/a/e/c.k:()[Lcom/sun/jna/z/a/f/a/a/a/a/k;
        //    64: astore          a
        //    66: aload           a
        //    68: arraylength    
        //    69: istore          a
        //    71: iconst_0       
        //    72: istore          a
        //    74: iload           a
        //    76: iload           a
        //    78: if_icmpge       123
        //    81: aload           a
        //    83: iload           a
        //    85: aaload         
        //    86: astore          a
        //    88: iload_1         /* a */
        //    89: ifne            119
        //    92: aload           a
        //    94: instanceof      Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //    97: iload_1         /* a */
        //    98: ifne            33
        //   101: ifeq            116
        //   104: aload_2         /* a */
        //   105: aload           a
        //   107: checkcast       Lcom/sun/jna/z/a/f/a/a/a/a/t;
        //   110: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   115: pop            
        //   116: iinc            a, 1
        //   119: iload_1         /* a */
        //   120: ifeq            74
        //   123: iload_1         /* a */
        //   124: ifeq            27
        //   127: aload_2         /* a */
        //   128: areturn        
        //    Signature:
        //  ()Ljava/util/List<Lcom/sun/jna/z/a/f/a/a/a/a/t;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.FileSaver.doSaveJarDecompiled(FileSaver.java:191)
        //     at us.deathmarine.luyten.FileSaver.access$300(FileSaver.java:46)
        //     at us.deathmarine.luyten.FileSaver$4.run(FileSaver.java:112)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public List<i> c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: new             Ljava/util/ArrayList;
        //     6: dup            
        //     7: invokespecial   java/util/ArrayList.<init>:()V
        //    10: astore_2       
        //    11: istore_1        /* a */
        //    12: aload_0         /* a */
        //    13: getfield        com/sun/jna/z/a/e/g.a:Ljava/util/Map;
        //    16: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //    21: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    26: astore_3       
        //    27: aload_3        
        //    28: invokeinterface java/util/Iterator.hasNext:()Z
        //    33: ifeq            127
        //    36: aload_3        
        //    37: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    42: checkcast       Lcom/sun/jna/z/a/e/c;
        //    45: astore          a
        //    47: aload           a
        //    49: invokevirtual   com/sun/jna/z/a/e/c.k:()[Lcom/sun/jna/z/a/f/a/a/a/a/k;
        //    52: iload_1         /* a */
        //    53: ifne            64
        //    56: ifnull          123
        //    59: aload           a
        //    61: invokevirtual   com/sun/jna/z/a/e/c.k:()[Lcom/sun/jna/z/a/f/a/a/a/a/k;
        //    64: astore          a
        //    66: aload           a
        //    68: arraylength    
        //    69: istore          a
        //    71: iconst_0       
        //    72: istore          a
        //    74: iload           a
        //    76: iload           a
        //    78: if_icmpge       123
        //    81: aload           a
        //    83: iload           a
        //    85: aaload         
        //    86: astore          a
        //    88: iload_1         /* a */
        //    89: ifne            119
        //    92: aload           a
        //    94: instanceof      Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //    97: iload_1         /* a */
        //    98: ifne            33
        //   101: ifeq            116
        //   104: aload_2         /* a */
        //   105: aload           a
        //   107: checkcast       Lcom/sun/jna/z/a/f/a/a/a/a/i;
        //   110: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   115: pop            
        //   116: iinc            a, 1
        //   119: iload_1         /* a */
        //   120: ifeq            74
        //   123: iload_1         /* a */
        //   124: ifeq            27
        //   127: aload_2         /* a */
        //   128: areturn        
        //    Signature:
        //  ()Ljava/util/List<Lcom/sun/jna/z/a/f/a/a/a/a/i;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.FileSaver.doSaveJarDecompiled(FileSaver.java:191)
        //     at us.deathmarine.luyten.FileSaver.access$300(FileSaver.java:46)
        //     at us.deathmarine.luyten.FileSaver$4.run(FileSaver.java:112)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public c a(final Class a) {
        return this.a.get(a);
    }
    
    static {
        final String[] b2 = new String[3];
        int n = 0;
        final String s;
        final int length = (s = "½\u00f7D\u0002\u0011\u00e4#\u009a\u00e0]\u0007!\u0003©\u00e7A\u0002\u008b\u00fc").length();
        int char1 = 12;
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
                    Label_0187: {
                        if (n4 > 1) {
                            break Label_0187;
                        }
                        length2 = (n5 = n6);
                        do {
                            final char c = charArray[n5];
                            char c2 = '\0';
                            switch (n6 % 7) {
                                case 0: {
                                    c2 = '\u00ee';
                                    break;
                                }
                                case 1: {
                                    c2 = '\u0092';
                                    break;
                                }
                                case 2: {
                                    c2 = '(';
                                    break;
                                }
                                case 3: {
                                    c2 = 'd';
                                    break;
                                }
                                case 4: {
                                    c2 = 'U';
                                    break;
                                }
                                case 5: {
                                    c2 = '\u0081';
                                    break;
                                }
                                default: {
                                    c2 = 'P';
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
                b2[n++] = new String(charArray).intern();
            } while ((n2 += char1) < length);
        }
        b = b2;
    }
}
