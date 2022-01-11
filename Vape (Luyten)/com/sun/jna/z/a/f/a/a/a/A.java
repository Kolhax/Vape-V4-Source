package com.sun.jna.z.a.f.a.a.a;

import com.sun.jna.z.a.f.a.a.a.a.*;

class A extends Thread
{
    final g a;
    final l b;
    private static final String[] c;
    
    A(final l a, final g a2) {
        this.b = a;
        this.a = a2;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0         /* a */
        //     4: getfield        com/sun/jna/z/a/f/a/a/a/A.a:Lcom/sun/jna/z/a/f/a/a/a/a/g;
        //     7: getstatic       com/sun/jna/z/a/f/a/a/a/A.c:[Ljava/lang/String;
        //    10: astore          a
        //    12: aload           a
        //    14: iconst_1       
        //    15: aaload         
        //    16: invokeinterface com/sun/jna/z/a/f/a/a/a/a/g.b:(Ljava/lang/String;)V
        //    21: invokestatic    org/lwjgl/input/Keyboard.getEventNanoseconds:()J
        //    24: lstore_2        /* a */
        //    25: istore_1        /* a */
        //    26: invokestatic    org/lwjgl/input/Mouse.getEventNanoseconds:()J
        //    29: lstore          a
        //    31: invokestatic    java/lang/Thread.interrupted:()Z
        //    34: ifeq            47
        //    37: iload_1         /* a */
        //    38: ifne            155
        //    41: goto            45
        //    44: athrow         
        //    45: return         
        //    46: athrow         
        //    47: lload_2         /* a */
        //    48: invokestatic    org/lwjgl/input/Keyboard.getEventNanoseconds:()J
        //    51: lcmp           
        //    52: iload_1         /* a */
        //    53: ifne            160
        //    56: ifeq            147
        //    59: goto            63
        //    62: athrow         
        //    63: invokestatic    org/lwjgl/input/Keyboard.isRepeatEvent:()Z
        //    66: iload_1         /* a */
        //    67: ifne            160
        //    70: goto            74
        //    73: athrow         
        //    74: ifne            147
        //    77: goto            81
        //    80: athrow         
        //    81: invokestatic    org/lwjgl/input/Keyboard.getEventKeyState:()Z
        //    84: iload_1         /* a */
        //    85: ifne            160
        //    88: goto            92
        //    91: athrow         
        //    92: ifeq            147
        //    95: goto            99
        //    98: athrow         
        //    99: invokestatic    org/lwjgl/input/Keyboard.getEventKey:()I
        //   102: istore          a
        //   104: aload_0         /* a */
        //   105: getfield        com/sun/jna/z/a/f/a/a/a/A.a:Lcom/sun/jna/z/a/f/a/a/a/a/g;
        //   108: new             Ljava/lang/StringBuilder;
        //   111: dup            
        //   112: invokespecial   java/lang/StringBuilder.<init>:()V
        //   115: getstatic       com/sun/jna/z/a/f/a/a/a/A.c:[Ljava/lang/String;
        //   118: astore          a
        //   120: aload           a
        //   122: iconst_0       
        //   123: aaload         
        //   124: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   127: iload           a
        //   129: invokestatic    org/lwjgl/input/Keyboard.getKeyName:(I)Ljava/lang/String;
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   135: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   138: invokeinterface com/sun/jna/z/a/f/a/a/a/a/g.b:(Ljava/lang/String;)V
        //   143: iload_1         /* a */
        //   144: ifeq            272
        //   147: invokestatic    org/lwjgl/input/Keyboard.next:()Z
        //   150: pop            
        //   151: goto            155
        //   154: athrow         
        //   155: bipush          42
        //   157: invokestatic    org/lwjgl/input/Keyboard.isKeyDown:(I)Z
        //   160: iload_1         /* a */
        //   161: ifne            185
        //   164: ifeq            179
        //   167: goto            171
        //   170: athrow         
        //   171: iload_1         /* a */
        //   172: ifeq            31
        //   175: goto            179
        //   178: athrow         
        //   179: lload           a
        //   181: invokestatic    org/lwjgl/input/Mouse.getEventNanoseconds:()J
        //   184: lcmp           
        //   185: iload_1         /* a */
        //   186: ifne            268
        //   189: ifeq            261
        //   192: goto            196
        //   195: athrow         
        //   196: invokestatic    org/lwjgl/input/Mouse.getEventButtonState:()Z
        //   199: iload_1         /* a */
        //   200: ifne            268
        //   203: goto            207
        //   206: athrow         
        //   207: ifeq            261
        //   210: goto            214
        //   213: athrow         
        //   214: aload_0         /* a */
        //   215: getfield        com/sun/jna/z/a/f/a/a/a/A.a:Lcom/sun/jna/z/a/f/a/a/a/a/g;
        //   218: new             Ljava/lang/StringBuilder;
        //   221: dup            
        //   222: invokespecial   java/lang/StringBuilder.<init>:()V
        //   225: getstatic       com/sun/jna/z/a/f/a/a/a/A.c:[Ljava/lang/String;
        //   228: iconst_2       
        //   229: aaload         
        //   230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: invokestatic    org/lwjgl/input/Mouse.getEventButton:()I
        //   236: iconst_1       
        //   237: iadd           
        //   238: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   241: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   244: invokeinterface com/sun/jna/z/a/f/a/a/a/a/g.b:(Ljava/lang/String;)V
        //   249: bipush          -100
        //   251: invokestatic    org/lwjgl/input/Mouse.getEventButton:()I
        //   254: iadd           
        //   255: istore          a
        //   257: iload_1         /* a */
        //   258: ifeq            272
        //   261: invokestatic    org/lwjgl/input/Mouse.next:()Z
        //   264: goto            268
        //   267: athrow         
        //   268: pop            
        //   269: goto            31
        //   272: aload_0         /* a */
        //   273: getfield        com/sun/jna/z/a/f/a/a/a/A.b:Lcom/sun/jna/z/a/f/a/a/a/l;
        //   276: getfield        com/sun/jna/z/a/f/a/a/a/l.b:Lcom/sun/jna/z/a/e/c;
        //   279: iload           a
        //   281: invokevirtual   com/sun/jna/z/a/e/c.b:(I)V
        //   284: ldc2_w          1000
        //   287: invokestatic    java/lang/Thread.sleep:(J)V
        //   290: goto            296
        //   293: astore          a
        //   295: return         
        //   296: aload_0         /* a */
        //   297: getfield        com/sun/jna/z/a/f/a/a/a/A.a:Lcom/sun/jna/z/a/f/a/a/a/a/g;
        //   300: aload_0         /* a */
        //   301: getfield        com/sun/jna/z/a/f/a/a/a/A.b:Lcom/sun/jna/z/a/f/a/a/a/l;
        //   304: getfield        com/sun/jna/z/a/f/a/a/a/l.b:Lcom/sun/jna/z/a/e/c;
        //   307: invokevirtual   com/sun/jna/z/a/e/c.a:()Ljava/lang/String;
        //   310: invokeinterface com/sun/jna/z/a/f/a/a/a/a/g.b:(Ljava/lang/String;)V
        //   315: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  257    264    267    268    Ljava/lang/InterruptedException;
        //  196    210    213    214    Ljava/lang/InterruptedException;
        //  189    203    206    207    Ljava/lang/InterruptedException;
        //  185    192    195    196    Ljava/lang/InterruptedException;
        //  164    175    178    179    Ljava/lang/InterruptedException;
        //  160    167    170    171    Ljava/lang/InterruptedException;
        //  104    151    154    155    Ljava/lang/InterruptedException;
        //  81     95     98     99     Ljava/lang/InterruptedException;
        //  74     88     91     92     Ljava/lang/InterruptedException;
        //  63     77     80     81     Ljava/lang/InterruptedException;
        //  56     70     73     74     Ljava/lang/InterruptedException;
        //  47     59     62     63     Ljava/lang/InterruptedException;
        //  37     46     46     47     Ljava/lang/InterruptedException;
        //  31     41     44     45     Ljava/lang/InterruptedException;
        //  284    290    293    296    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0063:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    static {
        final String[] c2 = new String[3];
        int n = 0;
        final String s;
        final int length = (s = "\u0018\u0093\u0016:)µ\u00885\u00dc\u000b\n\u008e\u0006'>µ\u009dz\u0097\u0006-\n\u0018\u0093\u0016:)µ\u00885\u00dc.").length();
        int char1 = 9;
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
                            final char c3 = charArray[n5];
                            char c4 = '\0';
                            switch (n6 % 7) {
                                case 0: {
                                    c4 = 'Z';
                                    break;
                                }
                                case 1: {
                                    c4 = '\u00fc';
                                    break;
                                }
                                case 2: {
                                    c4 = 'c';
                                    break;
                                }
                                case 3: {
                                    c4 = 'T';
                                    break;
                                }
                                case 4: {
                                    c4 = 'M';
                                    break;
                                }
                                case 5: {
                                    c4 = '\u0095';
                                    break;
                                }
                                default: {
                                    c4 = '\u00fc';
                                    break;
                                }
                            }
                            charArray[length2] = (char)(c3 ^ c4);
                            ++n6;
                        } while (n4 == 0);
                    }
                    if (n4 > n6) {
                        continue;
                    }
                    break;
                }
                c2[n++] = new String(charArray).intern();
            } while ((n2 += char1) < length);
        }
        c = c2;
    }
}
