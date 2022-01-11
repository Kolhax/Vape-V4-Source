package com.sun.jna.z.a.a;

public class c extends a
{
    private static final String[] j;
    
    @Override
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0         /* a */
        //     2: getfield        com/sun/jna/z/a/a/c.c:Ljava/lang/String;
        //     5: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //     8: putfield        com/sun/jna/z/a/a/c.c:Ljava/lang/String;
        //    11: getstatic       com/sun/jna/z/a/j.e:Lcom/sun/jna/z/a/j;
        //    14: getfield        com/sun/jna/z/a/j.d:Lcom/sun/jna/z/a/g/g;
        //    17: astore_2       
        //    18: getstatic       com/sun/jna/z/a/a/a.h:Z
        //    21: istore_1        /* a */
        //    22: aload_0         /* a */
        //    23: getfield        com/sun/jna/z/a/a/c.b:Ljava/lang/String;
        //    26: getstatic       com/sun/jna/z/a/a/c.j:[Ljava/lang/String;
        //    29: astore_3        /* a */
        //    30: aload_3         /* a */
        //    31: iconst_5       
        //    32: aaload         
        //    33: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    36: iload_1         /* a */
        //    37: ifne            127
        //    40: ifeq            113
        //    43: aload_2         /* a */
        //    44: getfield        com/sun/jna/z/a/g/g.a:Ljava/util/List;
        //    47: aload_0         /* a */
        //    48: getfield        com/sun/jna/z/a/a/c.c:Ljava/lang/String;
        //    51: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //    56: iload_1         /* a */
        //    57: ifne            127
        //    60: ifne            113
        //    63: aload_2         /* a */
        //    64: getfield        com/sun/jna/z/a/g/g.a:Ljava/util/List;
        //    67: aload_0         /* a */
        //    68: getfield        com/sun/jna/z/a/a/c.c:Ljava/lang/String;
        //    71: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    76: pop            
        //    77: new             Ljava/lang/StringBuilder;
        //    80: dup            
        //    81: invokespecial   java/lang/StringBuilder.<init>:()V
        //    84: aload_3         /* a */
        //    85: iconst_1       
        //    86: aaload         
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: aload_0         /* a */
        //    91: getfield        com/sun/jna/z/a/a/c.c:Ljava/lang/String;
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: aload_3         /* a */
        //    98: iconst_2       
        //    99: aaload         
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   106: invokestatic    com/sun/jna/z/a/a/c.e:(Ljava/lang/String;)V
        //   109: iload_1         /* a */
        //   110: ifeq            196
        //   113: aload_0         /* a */
        //   114: getfield        com/sun/jna/z/a/a/c.b:Ljava/lang/String;
        //   117: getstatic       com/sun/jna/z/a/a/c.j:[Ljava/lang/String;
        //   120: astore_3        /* a */
        //   121: aload_3         /* a */
        //   122: iconst_0       
        //   123: aaload         
        //   124: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   127: iload_1         /* a */
        //   128: ifne            147
        //   131: ifeq            196
        //   134: aload_2         /* a */
        //   135: getfield        com/sun/jna/z/a/g/g.a:Ljava/util/List;
        //   138: aload_0         /* a */
        //   139: getfield        com/sun/jna/z/a/a/c.c:Ljava/lang/String;
        //   142: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   147: iload_1         /* a */
        //   148: ifne            167
        //   151: ifeq            196
        //   154: aload_2         /* a */
        //   155: getfield        com/sun/jna/z/a/g/g.a:Ljava/util/List;
        //   158: aload_0         /* a */
        //   159: getfield        com/sun/jna/z/a/a/c.c:Ljava/lang/String;
        //   162: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //   167: pop            
        //   168: new             Ljava/lang/StringBuilder;
        //   171: dup            
        //   172: invokespecial   java/lang/StringBuilder.<init>:()V
        //   175: aload_0         /* a */
        //   176: getfield        com/sun/jna/z/a/a/c.c:Ljava/lang/String;
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: getstatic       com/sun/jna/z/a/a/c.j:[Ljava/lang/String;
        //   185: iconst_3       
        //   186: aaload         
        //   187: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   190: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   193: invokestatic    com/sun/jna/z/a/a/c.e:(Ljava/lang/String;)V
        //   196: return         
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
    
    @Override
    public String b() {
        return c.j[4];
    }
    
    static {
        final String[] i = new String[6];
        int n = 0;
        String s;
        int n2 = (s = "\u0096\u00f8!\u0002U\u00fc\u0018U\u00fbmZF\u0096s\u0096½9t\u0002\u0094d\u009b\u00f8#\u007fQ\u00d2z\u009b\u00ee9\u001a\u00d2\u00cf(vM\u0084s\u0096½+iM\u009f6\u0094\u00ef$~L\u0096e\u00d2\u00f1$hV").length();
        int n3 = 3;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                ++n4;
                final String s2 = s;
                final int n5 = n4;
                String s3 = s2.substring(n5, n5 + n3);
                int n6 = -1;
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    int length;
                    int n8;
                    final int n7 = n8 = (length = charArray.length);
                    int n9 = 0;
                    while (true) {
                        Label_0247: {
                            if (n7 > 1) {
                                break Label_0247;
                            }
                            length = (n8 = n9);
                            do {
                                final char c = charArray[n8];
                                char c2 = '\0';
                                switch (n9 % 7) {
                                    case 0: {
                                        c2 = '\u00f2';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u009d';
                                        break;
                                    }
                                    case 2: {
                                        c2 = 'M';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\u001b';
                                        break;
                                    }
                                    case 4: {
                                        c2 = '\"';
                                        break;
                                    }
                                    case 5: {
                                        c2 = '\u00f2';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u0016';
                                        break;
                                    }
                                }
                                charArray[length] = (char)(c ^ c2);
                                ++n9;
                            } while (n7 == 0);
                        }
                        if (n7 > n9) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n6) {
                        default: {
                            i[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0022;
                            }
                            n2 = (s = "\u0094\u00ef$~L\u0096\u0003\u0093\u00f9)").length();
                            n3 = 6;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            i[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0022;
                        }
                    }
                    ++n4;
                    final String s4 = s;
                    final int n10 = n4;
                    s3 = s4.substring(n10, n10 + n3);
                    n6 = 0;
                }
            }
            break;
        }
        j = i;
    }
}
