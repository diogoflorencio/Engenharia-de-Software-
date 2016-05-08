package randoop;

import junit.framework.*;

public class RandoopTest7 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test1");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var7 = var2.getNome();
    int var8 = var2.getCor();
    var2.setCor((-1));
    java.lang.String var11 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test2");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.Disciplina var14 = var1.getDisciplina("Metodo de estudo avancado");
    java.util.List var15 = var1.getDisciplinas();
    Stude.Usuario var16 = var1.getUsuario();
    java.util.HashMap var17 = var1.desempenho();
    int var18 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 30);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test3");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    var2.setCor((-1));
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var11 = var10.toString();
    var10.setCor(15);
    java.lang.String var14 = var10.getNome();
    Stude.Cronograma var15 = new Stude.Cronograma();
    Stude.Disciplina var17 = var15.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var19 = var15.getDisciplina("");
    java.util.List var20 = var15.getDisciplinas();
    boolean var21 = var10.equals((java.lang.Object)var15);
    Stude.Disciplina var24 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var25 = var24.toString();
    Stude.Stude var27 = new Stude.Stude("hi!");
    var27.setMetodoAvancado();
    Stude.MetodoDeEstudo var29 = var27.getMetodoDeEstudo();
    java.util.HashMap var30 = var27.desempenho();
    var27.setMetodoRegular();
    Stude.MetodoDeEstudo var32 = var27.getMetodoDeEstudo();
    var27.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var35 = var27.desempenho();
    boolean var36 = var24.equals((java.lang.Object)var35);
    var15.addDisciplina(var24);
    boolean var38 = var2.equals((java.lang.Object)var15);
    Stude.Avancado var39 = new Stude.Avancado();
    java.lang.String var40 = var39.toString();
    java.lang.String var41 = var39.toString();
    int var42 = var39.getIntervalo();
    int var43 = var39.getIntervalo();
    boolean var44 = var2.equals((java.lang.Object)var43);
    var2.setNome("hi!");
    Stude.Disciplina var49 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var50 = var49.toString();
    var49.setCor(15);
    java.lang.String var53 = var49.getNome();
    Stude.Cronograma var54 = new Stude.Cronograma();
    Stude.Disciplina var56 = var54.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var58 = var54.getDisciplina("");
    java.util.List var59 = var54.getDisciplinas();
    boolean var60 = var49.equals((java.lang.Object)var54);
    java.util.List var61 = var54.getDisciplinas();
    java.util.HashMap var62 = Stude.Desempenho.tempoDeEstudo(var61);
    boolean var63 = var2.equals((java.lang.Object)var62);
    double var64 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo avancado"+ "'", var25.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo avancado"+ "'", var40.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo avancado"+ "'", var41.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Metodo de estudo avancado"+ "'", var50.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "Metodo de estudo avancado"+ "'", var53.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test4");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    int var7 = var1.tempoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    var1.setMetodoRegular();
    Stude.Usuario var10 = var1.getUsuario();
    var10.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test5");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var3 = new Stude.Cronograma();
    java.util.List var4 = var3.getDisciplinas();
    Stude.Disciplina var6 = var3.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var8 = var3.getDisciplina("hi!");
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var3.addDisciplina(var11);
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var3.addDisciplina(var15);
    int var17 = var3.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var21 = var20.toString();
    var20.setCor(15);
    var20.setNome("Metodo de estudo regular");
    int var26 = var20.getCor();
    var3.addDisciplina(var20);
    var0.addDisciplina(var20);
    java.util.List var29 = var0.getDisciplinas();
    java.util.List var30 = var0.getDisciplinas();
    int var31 = var0.tamanhoDisciplinas();
    Stude.Disciplina var34 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var35 = new Stude.Cronograma();
    java.util.List var36 = var35.getDisciplinas();
    java.util.HashMap var37 = Stude.Desempenho.tempoDeEstudo(var36);
    boolean var38 = var34.equals((java.lang.Object)var37);
    java.lang.String var39 = var34.getNome();
    var34.setCor(2);
    var0.addDisciplina(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo avancado"+ "'", var39.equals("Metodo de estudo avancado"));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test6");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    int var9 = var1.tempoDeEstudo();
    Stude.Disciplina var11 = var1.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test7");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    int var6 = var1.tempoDeEstudo();
    Stude.Usuario var7 = var1.getUsuario();
    java.util.HashMap var8 = var1.desempenho();
    var1.setMetodoAvancado();
    Stude.Cronograma var10 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test8");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    int var6 = var1.tempoDeEstudo();
    java.util.HashMap var7 = var1.desempenho();
    java.util.List var8 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test9");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    int var11 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test10");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test11");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var7 = var2.getNome();
    int var8 = var2.getCor();
    var2.setCor((-1));
    var2.setCor(10);
    var2.setCor(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test12");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.List var10 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.Disciplina var13 = var1.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test13");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var6 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var6.setCor((-1));
    int var9 = var6.getCor();
    var6.addHorasDeEstudo(1.0d);
    java.lang.String var12 = var6.getNome();
    Stude.Disciplina var15 = new Stude.Disciplina("hi!", 30);
    boolean var16 = var6.equals((java.lang.Object)var15);
    java.lang.String var17 = var15.getNome();
    var15.setNome("hi!");
    var3.addDisciplina(var15);
    Stude.Disciplina var23 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var23.setCor((-1));
    int var26 = var23.getCor();
    var23.addHorasDeEstudo(1.0d);
    java.lang.String var29 = var23.getNome();
    Stude.Disciplina var32 = new Stude.Disciplina("hi!", 30);
    boolean var33 = var23.equals((java.lang.Object)var32);
    java.lang.String var34 = var23.toString();
    var3.addDisciplina(var23);
    java.util.List var36 = var3.getDisciplinas();
    Stude.Disciplina var38 = var3.getDisciplina("Metodo de estudo avancado");
    int var39 = var3.tamanhoDisciplinas();
    boolean var41 = var3.removeDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test14");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var12 = var1.getDisciplina("");
    java.util.HashMap var13 = var1.desempenho();
    Stude.Usuario var14 = var1.getUsuario();
    int var15 = var1.tempoDeEstudo();
    int var16 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test15");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 15);
    int var3 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    var2.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test16");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var4.setCor((-1));
    int var7 = var4.getCor();
    var4.setNome("Metodo de estudo regular");
    double var10 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    var4.addHorasDeEstudo(3.0d);
    int var14 = var4.getCor();
    double var15 = var4.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 3.0d);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test17");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var5.getMetodoDeEstudo();
    var5.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var13 = var5.getCronograma();
    Stude.Disciplina var15 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var16 = var5.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getNome();
    int var25 = var20.getCor();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    java.lang.String var28 = var20.toString();
    int var29 = var20.getCor();
    var20.setCor(100);
    var20.setCor((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 5);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test18");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    java.util.List var18 = var0.getDisciplinas();
    java.util.List var19 = var0.getDisciplinas();
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var23 = var22.toString();
    var22.setCor(15);
    java.lang.String var26 = var22.getNome();
    boolean var28 = var22.equals((java.lang.Object)(byte)100);
    var0.addDisciplina(var22);
    int var30 = var0.tamanhoDisciplinas();
    int var31 = var0.tamanhoDisciplinas();
    Stude.Disciplina var34 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var35 = var34.toString();
    var34.setCor(15);
    var34.setCor(15);
    java.lang.String var40 = var34.toString();
    java.lang.String var41 = var34.toString();
    java.lang.String var42 = var34.getNome();
    Stude.Disciplina var45 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var46 = var45.toString();
    var45.setCor(15);
    var45.setNome("Metodo de estudo regular");
    int var51 = var45.getCor();
    var45.setCor(30);
    boolean var54 = var34.equals((java.lang.Object)var45);
    Stude.Disciplina var57 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var58 = var57.toString();
    java.lang.String var59 = var57.toString();
    boolean var60 = var34.equals((java.lang.Object)var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDisciplina(var34);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Metodo de estudo avancado"+ "'", var35.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo avancado"+ "'", var40.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo avancado"+ "'", var41.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Metodo de estudo avancado"+ "'", var42.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Metodo de estudo avancado"+ "'", var46.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "Metodo de estudo avancado"+ "'", var58.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "Metodo de estudo avancado"+ "'", var59.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test19");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 5);
    Stude.Stude var4 = new Stude.Stude("hi!");
    int var5 = var4.intervalo();
    Stude.MetodoDeEstudo var6 = var4.getMetodoDeEstudo();
    Stude.Disciplina var8 = var4.getDisciplina("Metodo de estudo avancado");
    var4.setMetodoAvancado();
    Stude.Usuario var10 = var4.getUsuario();
    Stude.MetodoDeEstudo var11 = var4.getMetodoDeEstudo();
    java.util.List var12 = var4.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var4);
    var4.addDisciplina("Metodo de estudo avancado", 4);
    Stude.Disciplina var18 = var4.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test20");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test21");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var17 = var16.toString();
    var16.setCor(15);
    var16.setCor(10);
    var0.addDisciplina(var16);
    Stude.Disciplina var25 = new Stude.Disciplina("hi!", 5);
    double var26 = var25.getHorasEstudadas();
    var25.addHorasDeEstudo(10.0d);
    double var29 = var25.getHorasEstudadas();
    var25.setCor(3);
    Stude.Stude var33 = new Stude.Stude("hi!");
    int var34 = var33.intervalo();
    Stude.Usuario var35 = var33.getUsuario();
    Stude.Cronograma var36 = var33.getCronograma();
    Stude.Disciplina var39 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var39.addHorasDeEstudo(10.0d);
    java.lang.String var42 = var39.toString();
    java.lang.String var43 = var39.getNome();
    java.lang.String var44 = var39.getNome();
    var36.addDisciplina(var39);
    Stude.Stude var47 = new Stude.Stude("hi!");
    var47.addDisciplina("hi!", 0);
    Stude.Disciplina var52 = var47.getDisciplina("Metodo de estudo regular");
    var47.setMetodoRegular();
    var47.setMetodoAvancado();
    boolean var55 = var39.equals((java.lang.Object)var47);
    var39.setCor(15);
    java.lang.String var58 = var39.toString();
    Stude.Disciplina var61 = new Stude.Disciplina("hi!", 5);
    double var62 = var61.getHorasEstudadas();
    var61.addHorasDeEstudo(10.0d);
    java.lang.String var65 = var61.toString();
    boolean var66 = var39.equals((java.lang.Object)var61);
    boolean var67 = var25.equals((java.lang.Object)var61);
    var0.addDisciplina(var25);
    Stude.Disciplina var71 = new Stude.Disciplina("hi!", 30);
    var71.setCor(2);
    double var74 = var71.getHorasEstudadas();
    Stude.Stude var76 = new Stude.Stude("hi!");
    Stude.Usuario var77 = var76.getUsuario();
    java.lang.String var78 = var77.getNome();
    boolean var79 = var71.equals((java.lang.Object)var77);
    double var80 = var71.getHorasEstudadas();
    var0.addDisciplina(var71);
    Stude.Disciplina var83 = var0.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Metodo de estudo regular"+ "'", var42.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Metodo de estudo regular"+ "'", var43.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo regular"+ "'", var44.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "Metodo de estudo regular"+ "'", var58.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi!"+ "'", var78.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test22");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.List var8 = var1.getDisciplinas();
    int var9 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    java.util.HashMap var11 = var1.desempenho();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    java.util.List var13 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test23");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test24");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test25");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    java.util.HashMap var11 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test26");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var12 = var1.getDisciplina("");
    Stude.Usuario var13 = var1.getUsuario();
    var13.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test27");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.MetodoDeEstudo var13 = var1.getMetodoDeEstudo();
    Stude.Cronograma var14 = var1.getCronograma();
    Stude.MetodoDeEstudo var15 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test28");


    Stude.Usuario var1 = new Stude.Usuario("Metodo de estudo avancado");
    var1.setNome("Metodo de estudo regular");
    java.lang.String var4 = var1.getNome();
    var1.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test29");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    int var20 = var17.getCor();
    var17.addHorasDeEstudo(1.0d);
    java.lang.String var23 = var17.getNome();
    Stude.Disciplina var26 = new Stude.Disciplina("hi!", 30);
    boolean var27 = var17.equals((java.lang.Object)var26);
    java.lang.String var28 = var26.getNome();
    var7.addDisciplina(var26);
    int var30 = var7.tamanhoDisciplinas();
    int var31 = var7.tamanhoDisciplinas();
    Stude.Disciplina var34 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var34.setCor((-1));
    var34.addHorasDeEstudo(10.0d);
    Stude.Cronograma var39 = new Stude.Cronograma();
    java.util.List var40 = var39.getDisciplinas();
    Stude.Disciplina var42 = var39.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var44 = var39.getDisciplina("hi!");
    Stude.Disciplina var46 = var39.getDisciplina("");
    java.util.List var47 = var39.getDisciplinas();
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var50 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var51 = Stude.Desempenho.tempoDeEstudo(var47);
    boolean var52 = var34.equals((java.lang.Object)var51);
    var34.setNome("Metodo de estudo regular");
    java.lang.String var55 = var34.toString();
    var7.addDisciplina(var34);
    Stude.Disciplina var58 = var7.getDisciplina("hi!");
    java.util.List var59 = var7.getDisciplinas();
    Stude.Cronograma var60 = new Stude.Cronograma();
    java.util.List var61 = var60.getDisciplinas();
    Stude.Disciplina var63 = var60.getDisciplina("Metodo de estudo regular");
    Stude.Stude var65 = new Stude.Stude("hi!");
    var65.setMetodoAvancado();
    Stude.MetodoDeEstudo var67 = var65.getMetodoDeEstudo();
    java.util.HashMap var68 = var65.desempenho();
    var65.setMetodoRegular();
    Stude.MetodoDeEstudo var70 = var65.getMetodoDeEstudo();
    var65.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var73 = var65.getCronograma();
    Stude.Disciplina var75 = var65.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var76 = var65.getCronograma();
    int var77 = var76.tamanhoDisciplinas();
    Stude.Disciplina var80 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var80.addHorasDeEstudo(10.0d);
    java.lang.String var83 = var80.toString();
    java.lang.String var84 = var80.getNome();
    int var85 = var80.getCor();
    var76.addDisciplina(var80);
    var60.addDisciplina(var80);
    java.lang.String var88 = var80.toString();
    int var89 = var80.getCor();
    Stude.Disciplina var92 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    java.lang.String var93 = var92.toString();
    boolean var94 = var80.equals((java.lang.Object)var92);
    var92.setNome("hi!");
    var7.addDisciplina(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Metodo de estudo regular"+ "'", var55.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "Metodo de estudo regular"+ "'", var83.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "Metodo de estudo regular"+ "'", var84.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "Metodo de estudo regular"+ "'", var88.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "Metodo de estudo avancado"+ "'", var93.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test30");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    boolean var10 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    var2.addHorasDeEstudo(10.0d);
    var2.setNome("Metodo de estudo regular");
    double var15 = var2.getHorasEstudadas();
    var2.setCor(5);
    java.lang.String var18 = var2.getNome();
    java.lang.String var19 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test31");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Usuario var13 = var1.getUsuario();
    Stude.Cronograma var14 = var1.getCronograma();
    java.util.List var15 = var14.getDisciplinas();
    Stude.Disciplina var18 = new Stude.Disciplina("hi!", 30);
    var18.setCor(2);
    var14.addDisciplina(var18);
    Stude.Regular var22 = new Stude.Regular();
    int var23 = var22.getTempo();
    java.lang.String var24 = var22.toString();
    int var25 = var22.getIntervalo();
    java.lang.String var26 = var22.toString();
    int var27 = var22.getIntervalo();
    int var28 = var22.getTempo();
    int var29 = var22.getIntervalo();
    java.lang.String var30 = var22.toString();
    java.lang.String var31 = var22.toString();
    java.lang.String var32 = var22.toString();
    java.lang.String var33 = var22.toString();
    boolean var34 = var18.equals((java.lang.Object)var22);
    java.lang.String var35 = var18.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Metodo de estudo regular"+ "'", var30.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo regular"+ "'", var31.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo regular"+ "'", var32.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo regular"+ "'", var33.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test32");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    var2.setCor((-1));
    var2.setCor(0);
    java.lang.String var10 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test33");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Cronograma var2 = new Stude.Cronograma();
    Stude.Disciplina var4 = var2.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var6 = var2.getDisciplina("");
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    int var17 = var15.getCor();
    var2.addDisciplina(var15);
    var0.addDisciplina(var15);
    int var20 = var0.tamanhoDisciplinas();
    Stude.Disciplina var22 = var0.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var24 = var0.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test34");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    int var10 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test35");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    var1.setMetodoAvancado();
    int var11 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test36");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var6 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var6.setCor((-1));
    int var9 = var6.getCor();
    var6.addHorasDeEstudo(1.0d);
    java.lang.String var12 = var6.getNome();
    Stude.Disciplina var15 = new Stude.Disciplina("hi!", 30);
    boolean var16 = var6.equals((java.lang.Object)var15);
    java.lang.String var17 = var15.getNome();
    var15.setNome("hi!");
    var3.addDisciplina(var15);
    Stude.Disciplina var23 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var23.setCor((-1));
    int var26 = var23.getCor();
    var23.addHorasDeEstudo(1.0d);
    java.lang.String var29 = var23.getNome();
    Stude.Disciplina var32 = new Stude.Disciplina("hi!", 30);
    boolean var33 = var23.equals((java.lang.Object)var32);
    java.lang.String var34 = var23.toString();
    var3.addDisciplina(var23);
    java.util.List var36 = var3.getDisciplinas();
    java.util.List var37 = var3.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test37");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var6 = var4.getDisciplina("hi!");
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    double var17 = var15.getHorasEstudadas();
    var15.setCor(2);
    var4.addDisciplina(var15);
    Stude.Stude var22 = new Stude.Stude("hi!");
    var22.addDisciplina("hi!", 0);
    Stude.Cronograma var26 = var22.getCronograma();
    boolean var27 = var15.equals((java.lang.Object)var22);
    Stude.Stude var29 = new Stude.Stude("hi!");
    var29.setMetodoAvancado();
    Stude.MetodoDeEstudo var31 = var29.getMetodoDeEstudo();
    java.util.HashMap var32 = var29.desempenho();
    var29.setMetodoRegular();
    Stude.MetodoDeEstudo var34 = var29.getMetodoDeEstudo();
    var29.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var37 = var29.getCronograma();
    java.util.List var38 = var29.getDisciplinas();
    java.util.HashMap var39 = var29.desempenho();
    boolean var40 = var15.equals((java.lang.Object)var29);
    var15.setNome("hi!");
    java.lang.String var43 = var15.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test38");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var4 = var0.getDisciplinas();
    int var5 = var0.tamanhoDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    Stude.Disciplina var9 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    java.lang.String var12 = var9.toString();
    var0.addDisciplina(var9);
    Stude.Disciplina var15 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var16 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test39");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Disciplina var6 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var8 = var0.getDisciplina("hi!");
    Stude.Disciplina var10 = var0.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test40");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Disciplina var9 = var1.getDisciplina("");
    int var10 = var1.tempoDeEstudo();
    int var11 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test41");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.intervalo();
    var1.addDisciplina("Metodo de estudo avancado", 2);
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test42");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Cronograma var8 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var8.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test43");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.setCor((-1));
    var7.addHorasDeEstudo(10.0d);
    java.lang.String var12 = var7.getNome();
    var7.setNome("Metodo de estudo regular");
    var4.addDisciplina(var7);
    java.lang.String var16 = var7.toString();
    java.lang.String var17 = var7.getNome();
    double var18 = var7.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10.0d);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test44");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Usuario var7 = var1.getUsuario();
    java.util.List var8 = var1.getDisciplinas();
    java.util.HashMap var9 = Stude.Desempenho.tempoDeEstudo(var8);
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test45");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    int var9 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test46");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Usuario var2 = var1.getUsuario();
    java.lang.String var3 = var2.getNome();
    var2.setNome("Metodo de estudo regular");
    var2.setNome("Metodo de estudo avancado");
    var2.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test47");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.lang.String var14 = var2.toString();
    Stude.Stude var16 = new Stude.Stude("hi!");
    int var17 = var16.intervalo();
    Stude.Usuario var18 = var16.getUsuario();
    Stude.Cronograma var19 = var16.getCronograma();
    var16.setMetodoAvancado();
    Stude.Cronograma var21 = var16.getCronograma();
    java.util.List var22 = var21.getDisciplinas();
    boolean var23 = var2.equals((java.lang.Object)var21);
    Stude.Disciplina var26 = new Stude.Disciplina("Metodo de estudo avancado", 2);
    java.lang.String var27 = var26.getNome();
    var21.addDisciplina(var26);
    double var29 = var26.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test48");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    java.util.List var7 = var1.getDisciplinas();
    var1.setNomeUsuario("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test49");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var5.getMetodoDeEstudo();
    var5.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var13 = var5.getCronograma();
    Stude.Disciplina var15 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var16 = var5.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getNome();
    int var25 = var20.getCor();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    Stude.Disciplina var30 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var31 = var30.toString();
    java.lang.String var32 = var30.toString();
    java.lang.String var33 = var30.toString();
    var30.addHorasDeEstudo(10.0d);
    var0.addDisciplina(var30);
    Stude.Disciplina var39 = new Stude.Disciplina("hi!", 30);
    var39.setCor(2);
    var39.setNome("Metodo de estudo avancado");
    double var44 = var39.getHorasEstudadas();
    var0.addDisciplina(var39);
    java.util.List var46 = var0.getDisciplinas();
    Stude.Disciplina var48 = var0.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo avancado"+ "'", var32.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo avancado"+ "'", var33.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test50");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var13 = var1.desempenho();
    Stude.Usuario var14 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test51");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    java.util.List var5 = var1.getDisciplinas();
    java.util.HashMap var6 = var1.desempenho();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test52");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    java.util.List var18 = var0.getDisciplinas();
    boolean var20 = var0.removeDisciplina("Metodo de estudo regular");
    java.util.List var21 = var0.getDisciplinas();
    Stude.Disciplina var23 = var0.getDisciplina("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var25 = var0.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test53");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    java.util.List var7 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test54");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 2);
    Stude.Stude var4 = new Stude.Stude("hi!");
    var4.addDisciplina("hi!", 0);
    Stude.Usuario var8 = var4.getUsuario();
    Stude.Usuario var9 = var4.getUsuario();
    java.util.HashMap var10 = var4.desempenho();
    int var11 = var4.intervalo();
    boolean var12 = var2.equals((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test55");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    Stude.Disciplina var9 = var0.getDisciplina("hi!");
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var12.setCor((-1));
    java.lang.String var15 = var12.getNome();
    var0.addDisciplina(var12);
    int var17 = var0.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test56");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    int var14 = var0.tamanhoDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var18 = var17.toString();
    var17.setCor(15);
    var17.setNome("Metodo de estudo regular");
    int var23 = var17.getCor();
    var0.addDisciplina(var17);
    Stude.Disciplina var26 = var0.getDisciplina("Metodo de estudo regular");
    java.lang.String var27 = var26.toString();
    var26.addHorasDeEstudo(100.0d);
    double var30 = var26.getHorasEstudadas();
    var26.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo regular"+ "'", var27.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 100.0d);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test57");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var5 = var3.getDisciplina("");
    int var6 = var3.tamanhoDisciplinas();
    int var7 = var3.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test58");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    var2.addHorasDeEstudo(10.0d);
    var2.setNome("Metodo de estudo regular");
    Stude.Stude var10 = new Stude.Stude("hi!");
    int var11 = var10.intervalo();
    Stude.Usuario var12 = var10.getUsuario();
    var10.addDisciplina("hi!", 0);
    java.util.HashMap var16 = var10.desempenho();
    Stude.MetodoDeEstudo var17 = var10.getMetodoDeEstudo();
    boolean var18 = var2.equals((java.lang.Object)var10);
    boolean var20 = var10.removeDisciplina("hi!");
    java.util.HashMap var21 = var10.desempenho();
    Stude.Usuario var22 = var10.getUsuario();
    java.lang.String var23 = var22.getNome();
    var22.setNome("hi!");
    java.lang.String var26 = var22.getNome();
    var22.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test59");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var12 = var1.getDisciplina("");
    int var13 = var1.intervalo();
    Stude.MetodoDeEstudo var14 = var1.getMetodoDeEstudo();
    var1.setMetodoRegular();
    var1.addDisciplina("hi!", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test60");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    int var6 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test61");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("");
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test62");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getIntervalo();
    int var13 = var0.getTempo();
    java.lang.String var14 = var0.toString();
    int var15 = var0.getIntervalo();
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test63");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    Stude.Disciplina var18 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var20 = var0.getDisciplina("hi!");
    Stude.Disciplina var22 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var27 = new Stude.Disciplina("hi!", 15);
    var27.setCor(15);
    var27.setNome("Metodo de estudo avancado");
    var0.addDisciplina(var27);
    int var33 = var0.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test64");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    int var9 = var1.tempoDeEstudo();
    Stude.Usuario var10 = var1.getUsuario();
    var10.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test65");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var11 = var10.toString();
    var10.setCor(15);
    java.lang.String var14 = var10.getNome();
    Stude.Cronograma var15 = new Stude.Cronograma();
    Stude.Disciplina var17 = var15.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var19 = var15.getDisciplina("");
    java.util.List var20 = var15.getDisciplinas();
    boolean var21 = var10.equals((java.lang.Object)var15);
    Stude.Stude var23 = new Stude.Stude("hi!");
    Stude.Cronograma var24 = var23.getCronograma();
    Stude.Usuario var25 = var23.getUsuario();
    java.lang.String var26 = var25.getNome();
    java.lang.String var27 = var25.getNome();
    boolean var28 = var10.equals((java.lang.Object)var25);
    var7.addDisciplina(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test66");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var16 = var15.toString();
    var15.setCor(15);
    java.lang.String var19 = var15.getNome();
    boolean var21 = var15.equals((java.lang.Object)(byte)100);
    java.lang.String var22 = var15.toString();
    var12.addDisciplina(var15);
    Stude.Disciplina var26 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var26.addHorasDeEstudo(10.0d);
    java.lang.String var29 = var26.toString();
    var12.addDisciplina(var26);
    Stude.Disciplina var32 = var12.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test67");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Usuario var13 = var1.getUsuario();
    Stude.Cronograma var14 = var1.getCronograma();
    int var15 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Usuario var18 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test68");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Cronograma var11 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test69");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getIntervalo();
    int var11 = var0.getTempo();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test70");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    Stude.Disciplina var18 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var20 = var0.getDisciplina("hi!");
    Stude.Disciplina var22 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var27 = new Stude.Disciplina("hi!", 15);
    var27.setCor(15);
    var27.setNome("Metodo de estudo avancado");
    var0.addDisciplina(var27);
    Stude.Disciplina var34 = var0.getDisciplina("Metodo de estudo regular");
    java.lang.String var35 = var34.getNome();
    java.lang.String var36 = var34.getNome();
    var34.addHorasDeEstudo(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Metodo de estudo regular"+ "'", var35.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo regular"+ "'", var36.equals("Metodo de estudo regular"));

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test71");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var3 = var2.getCor();
    int var4 = var2.getCor();
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test72");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    int var3 = var1.intervalo();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.tempoDeEstudo();
    int var6 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test73");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    java.util.List var2 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test74");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var14 = var13.toString();
    java.lang.String var15 = var13.toString();
    java.lang.String var16 = var13.toString();
    var9.addDisciplina(var13);
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.setCor((-1));
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var25 = var20.getNome();
    var20.setNome("Metodo de estudo regular");
    var9.addDisciplina(var20);
    Stude.Stude var30 = new Stude.Stude("hi!");
    Stude.Cronograma var31 = var30.getCronograma();
    int var32 = var30.tempoDeEstudo();
    int var33 = var30.tempoDeEstudo();
    int var34 = var30.intervalo();
    var30.setMetodoAvancado();
    Stude.Cronograma var36 = var30.getCronograma();
    Stude.Disciplina var39 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var40 = var39.getHorasEstudadas();
    var39.setNome("hi!");
    var39.setNome("hi!");
    var36.addDisciplina(var39);
    var39.setCor(30);
    var9.addDisciplina(var39);
    var39.setCor((-1));
    int var51 = var39.getCor();
    double var52 = var39.getHorasEstudadas();
    int var53 = var39.getCor();
    Stude.Stude var55 = new Stude.Stude("hi!");
    int var56 = var55.intervalo();
    Stude.Usuario var57 = var55.getUsuario();
    Stude.Cronograma var58 = var55.getCronograma();
    java.util.HashMap var59 = var55.desempenho();
    Stude.Usuario var60 = var55.getUsuario();
    Stude.Disciplina var62 = var55.getDisciplina("");
    Stude.Disciplina var64 = var55.getDisciplina("Metodo de estudo avancado");
    boolean var65 = var39.equals((java.lang.Object)"Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test75");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    int var6 = var1.intervalo();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    java.util.HashMap var9 = var1.desempenho();
    Stude.Usuario var10 = var1.getUsuario();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test76");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    int var6 = var1.intervalo();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test77");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    int var7 = var2.getCor();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var11 = var10.getHorasEstudadas();
    double var12 = var10.getHorasEstudadas();
    java.lang.String var13 = var10.toString();
    java.lang.String var14 = var10.getNome();
    var10.addHorasDeEstudo(20.0d);
    boolean var17 = var2.equals((java.lang.Object)var10);
    java.lang.String var18 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test78");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    java.util.HashMap var6 = var1.desempenho();
    java.util.HashMap var7 = var1.desempenho();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    java.util.List var9 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test79");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    Stude.MetodoDeEstudo var5 = var1.getMetodoDeEstudo();
    int var6 = var1.intervalo();
    int var7 = var1.tempoDeEstudo();
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test80");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    java.util.List var8 = var1.getDisciplinas();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var12 = var1.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test81");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getIntervalo();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getTempo();
    int var13 = var0.getIntervalo();
    java.lang.String var14 = var0.toString();
    int var15 = var0.getTempo();
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test82");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 5);
    Stude.Stude var4 = new Stude.Stude("hi!");
    int var5 = var4.intervalo();
    Stude.MetodoDeEstudo var6 = var4.getMetodoDeEstudo();
    Stude.Disciplina var8 = var4.getDisciplina("Metodo de estudo avancado");
    var4.setMetodoAvancado();
    Stude.Usuario var10 = var4.getUsuario();
    Stude.MetodoDeEstudo var11 = var4.getMetodoDeEstudo();
    java.util.List var12 = var4.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var4);
    int var14 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test83");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo regular", 1);
    boolean var13 = var1.removeDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test84");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test85");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    Stude.Disciplina var9 = var0.getDisciplina("hi!");
    Stude.Disciplina var11 = var0.getDisciplina("");
    Stude.Disciplina var13 = var0.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test86");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    int var3 = var0.tamanhoDisciplinas();
    Stude.Cronograma var4 = new Stude.Cronograma();
    Stude.Disciplina var6 = var4.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var8 = var4.getDisciplina("");
    int var9 = var4.tamanhoDisciplinas();
    Stude.Disciplina var11 = var4.getDisciplina("hi!");
    java.util.List var12 = var4.getDisciplinas();
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var15.setCor((-1));
    int var18 = var15.getCor();
    var15.addHorasDeEstudo(1.0d);
    java.lang.String var21 = var15.getNome();
    Stude.Disciplina var24 = new Stude.Disciplina("hi!", 30);
    boolean var25 = var15.equals((java.lang.Object)var24);
    var4.addDisciplina(var15);
    var0.addDisciplina(var15);
    Stude.Stude var29 = new Stude.Stude("hi!");
    Stude.Cronograma var30 = var29.getCronograma();
    int var31 = var29.tempoDeEstudo();
    var29.addDisciplina("Metodo de estudo avancado", (-1));
    var29.setMetodoRegular();
    int var36 = var29.tempoDeEstudo();
    Stude.Usuario var37 = var29.getUsuario();
    Stude.MetodoDeEstudo var38 = var29.getMetodoDeEstudo();
    boolean var39 = var15.equals((java.lang.Object)var29);
    Stude.Disciplina var41 = var29.getDisciplina("Metodo de estudo regular");
    var29.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo regular"+ "'", var21.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test87");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 30);
    var2.addHorasDeEstudo(11.0d);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test88");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("");
    java.util.List var9 = var1.getDisciplinas();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var12 = var10.getDisciplina("");
    Stude.Disciplina var14 = var10.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test89");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var12 = var1.getDisciplina("");
    java.util.HashMap var13 = var1.desempenho();
    Stude.Cronograma var14 = var1.getCronograma();
    Stude.Disciplina var16 = var14.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var17 = new Stude.Cronograma();
    Stude.Disciplina var19 = var17.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var20 = new Stude.Cronograma();
    java.util.List var21 = var20.getDisciplinas();
    Stude.Disciplina var23 = var20.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var25 = var20.getDisciplina("hi!");
    Stude.Disciplina var28 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addDisciplina(var28);
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var20.addDisciplina(var32);
    int var34 = var20.tamanhoDisciplinas();
    Stude.Disciplina var37 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var38 = var37.toString();
    var37.setCor(15);
    var37.setNome("Metodo de estudo regular");
    int var43 = var37.getCor();
    var20.addDisciplina(var37);
    var17.addDisciplina(var37);
    java.lang.String var46 = var37.toString();
    java.lang.String var47 = var37.getNome();
    var14.addDisciplina(var37);
    java.util.List var49 = var14.getDisciplinas();
    java.util.HashMap var50 = Stude.Desempenho.tempoDeEstudo(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo avancado"+ "'", var38.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Metodo de estudo regular"+ "'", var46.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Metodo de estudo regular"+ "'", var47.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test90");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    Stude.Disciplina var18 = var0.getDisciplina("Metodo de estudo avancado");
    int var19 = var0.tamanhoDisciplinas();
    java.util.List var20 = var0.getDisciplinas();
    java.util.List var21 = var0.getDisciplinas();
    java.util.HashMap var22 = Stude.Desempenho.tempoDeEstudo(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test91");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    java.util.HashMap var8 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test92");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test93");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    boolean var10 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    var2.addHorasDeEstudo(10.0d);
    var2.setNome("Metodo de estudo regular");
    double var15 = var2.getHorasEstudadas();
    int var16 = var2.getCor();
    java.lang.String var17 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test94");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    int var9 = var1.intervalo();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Usuario var11 = var1.getUsuario();
    Stude.Disciplina var13 = var1.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test95");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var8.setCor((-1));
    int var11 = var8.getCor();
    var8.addHorasDeEstudo(1.0d);
    java.lang.String var14 = var8.getNome();
    Stude.Disciplina var17 = new Stude.Disciplina("hi!", 30);
    boolean var18 = var8.equals((java.lang.Object)var17);
    var17.setNome("Metodo de estudo regular");
    Stude.Stude var22 = new Stude.Stude("hi!");
    var22.setMetodoAvancado();
    Stude.MetodoDeEstudo var24 = var22.getMetodoDeEstudo();
    java.util.HashMap var25 = var22.desempenho();
    var22.setMetodoRegular();
    Stude.MetodoDeEstudo var27 = var22.getMetodoDeEstudo();
    var22.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var30 = var22.getCronograma();
    Stude.Disciplina var32 = var22.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var33 = var22.getCronograma();
    Stude.Cronograma var34 = var22.getCronograma();
    java.util.List var35 = var34.getDisciplinas();
    Stude.Disciplina var38 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var38.setCor((-1));
    var38.addHorasDeEstudo(10.0d);
    Stude.Cronograma var43 = new Stude.Cronograma();
    java.util.List var44 = var43.getDisciplinas();
    Stude.Disciplina var46 = var43.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var48 = var43.getDisciplina("hi!");
    Stude.Disciplina var50 = var43.getDisciplina("");
    java.util.List var51 = var43.getDisciplinas();
    java.util.HashMap var52 = Stude.Desempenho.tempoDeEstudo(var51);
    java.util.HashMap var53 = Stude.Desempenho.tempoDeEstudo(var51);
    java.util.HashMap var54 = Stude.Desempenho.tempoDeEstudo(var51);
    java.util.HashMap var55 = Stude.Desempenho.tempoDeEstudo(var51);
    boolean var56 = var38.equals((java.lang.Object)var55);
    var34.addDisciplina(var38);
    boolean var58 = var17.equals((java.lang.Object)var34);
    Stude.Cronograma var59 = new Stude.Cronograma();
    java.util.List var60 = var59.getDisciplinas();
    Stude.Disciplina var62 = var59.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var64 = var59.getDisciplina("hi!");
    Stude.Disciplina var67 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var59.addDisciplina(var67);
    Stude.Disciplina var71 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var59.addDisciplina(var71);
    Stude.Disciplina var75 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var76 = var75.toString();
    var75.setCor(15);
    var75.setCor(10);
    var59.addDisciplina(var75);
    int var82 = var75.getCor();
    var34.addDisciplina(var75);
    Stude.Stude var85 = new Stude.Stude("hi!");
    int var86 = var85.intervalo();
    Stude.Usuario var87 = var85.getUsuario();
    int var88 = var85.tempoDeEstudo();
    java.util.HashMap var89 = var85.desempenho();
    Stude.MetodoDeEstudo var90 = var85.getMetodoDeEstudo();
    java.util.List var91 = var85.getDisciplinas();
    boolean var92 = var75.equals((java.lang.Object)var85);
    int var93 = var75.getCor();
    java.lang.String var94 = var75.toString();
    var75.addHorasDeEstudo(20.0d);
    var0.addDisciplina(var75);
    Stude.Disciplina var99 = var0.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "Metodo de estudo avancado"+ "'", var76.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var94 + "' != '" + "Metodo de estudo avancado"+ "'", var94.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test96");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.List var8 = var1.getDisciplinas();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo regular");
    java.util.HashMap var11 = var1.desempenho();
    Stude.Usuario var12 = var1.getUsuario();
    int var13 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test97");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test98");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo avancado");
    int var8 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test99");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test100");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    int var8 = var1.intervalo();
    int var9 = var1.intervalo();
    var1.setNomeUsuario("hi!");
    int var12 = var1.tempoDeEstudo();
    int var13 = var1.intervalo();
    java.util.List var14 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test101");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    Stude.Cronograma var5 = var1.getCronograma();
    Stude.Stude var7 = new Stude.Stude("hi!");
    int var8 = var7.intervalo();
    Stude.Usuario var9 = var7.getUsuario();
    Stude.Cronograma var10 = var7.getCronograma();
    var7.setMetodoAvancado();
    Stude.Cronograma var12 = var7.getCronograma();
    Stude.Cronograma var13 = new Stude.Cronograma();
    int var14 = var13.tamanhoDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var18 = var17.getHorasEstudadas();
    double var19 = var17.getHorasEstudadas();
    var13.addDisciplina(var17);
    var17.setCor(15);
    var12.addDisciplina(var17);
    var17.setCor(0);
    var5.addDisciplina(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test102");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    java.util.List var10 = var0.getDisciplinas();
    Stude.Disciplina var12 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var13 = var0.getDisciplinas();
    Stude.Cronograma var14 = new Stude.Cronograma();
    Stude.Disciplina var16 = var14.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var18 = var14.getDisciplina("");
    java.util.List var19 = var14.getDisciplinas();
    Stude.Stude var21 = new Stude.Stude("hi!");
    var21.setMetodoAvancado();
    Stude.MetodoDeEstudo var23 = var21.getMetodoDeEstudo();
    var21.setMetodoAvancado();
    var21.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var29 = var21.getDisciplina("Metodo de estudo regular");
    var14.addDisciplina(var29);
    double var31 = var29.getHorasEstudadas();
    var29.setNome("Metodo de estudo regular");
    int var34 = var29.getCor();
    var0.addDisciplina(var29);
    var29.addHorasDeEstudo(10.0d);
    Stude.Avancado var38 = new Stude.Avancado();
    int var39 = var38.getIntervalo();
    java.lang.String var40 = var38.toString();
    java.lang.String var41 = var38.toString();
    java.lang.String var42 = var38.toString();
    int var43 = var38.getIntervalo();
    int var44 = var38.getTempo();
    int var45 = var38.getIntervalo();
    boolean var46 = var29.equals((java.lang.Object)var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var29.addHorasDeEstudo((-1.0d));
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo avancado"+ "'", var40.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo avancado"+ "'", var41.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Metodo de estudo avancado"+ "'", var42.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test103");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(2);
    int var5 = var2.getCor();
    java.lang.String var6 = var2.toString();
    var2.addHorasDeEstudo(10.0d);
    int var9 = var2.getCor();
    java.lang.String var10 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test104");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test105");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    var2.setCor(2);
    var2.setNome("Metodo de estudo regular");
    int var11 = var2.getCor();
    Stude.Stude var13 = new Stude.Stude("hi!");
    Stude.MetodoDeEstudo var14 = var13.getMetodoDeEstudo();
    java.util.HashMap var15 = var13.desempenho();
    boolean var16 = var2.equals((java.lang.Object)var13);
    java.util.HashMap var17 = var13.desempenho();
    var13.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test106");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var12 = var1.getDisciplina("");
    int var13 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var14 = var1.getMetodoDeEstudo();
    java.util.HashMap var15 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test107");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var5.getMetodoDeEstudo();
    var5.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var13 = var5.getCronograma();
    Stude.Disciplina var15 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var16 = var5.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getNome();
    int var25 = var20.getCor();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    Stude.Disciplina var29 = var0.getDisciplina("");
    Stude.Stude var31 = new Stude.Stude("hi!");
    var31.setMetodoAvancado();
    Stude.MetodoDeEstudo var33 = var31.getMetodoDeEstudo();
    java.util.HashMap var34 = var31.desempenho();
    var31.setMetodoRegular();
    java.util.List var36 = var31.getDisciplinas();
    java.util.HashMap var37 = var31.desempenho();
    int var38 = var31.intervalo();
    Stude.Cronograma var39 = var31.getCronograma();
    var31.setMetodoAvancado();
    Stude.Cronograma var41 = var31.getCronograma();
    Stude.Disciplina var44 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var45 = var44.getCor();
    double var46 = var44.getHorasEstudadas();
    java.lang.String var47 = var44.toString();
    var41.addDisciplina(var44);
    Stude.Disciplina var51 = new Stude.Disciplina("hi!", 5);
    double var52 = var51.getHorasEstudadas();
    var51.addHorasDeEstudo(10.0d);
    var51.addHorasDeEstudo(10.0d);
    var41.addDisciplina(var51);
    double var58 = var51.getHorasEstudadas();
    var0.addDisciplina(var51);
    Stude.Disciplina var61 = var0.getDisciplina("");
    Stude.Cronograma var62 = new Stude.Cronograma();
    java.util.List var63 = var62.getDisciplinas();
    Stude.Disciplina var65 = var62.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var67 = var62.getDisciplina("hi!");
    Stude.Disciplina var70 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var62.addDisciplina(var70);
    Stude.Disciplina var74 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var62.addDisciplina(var74);
    int var76 = var62.tamanhoDisciplinas();
    Stude.Disciplina var79 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var80 = var79.toString();
    var79.setCor(15);
    var79.setNome("Metodo de estudo regular");
    int var85 = var79.getCor();
    var62.addDisciplina(var79);
    Stude.Disciplina var88 = var62.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var90 = var62.getDisciplina("Metodo de estudo avancado");
    var0.addDisciplina(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Metodo de estudo regular"+ "'", var47.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "Metodo de estudo avancado"+ "'", var80.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test108");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addHorasDeEstudo(10.0d);
    java.lang.String var10 = var7.toString();
    java.lang.String var11 = var7.getNome();
    java.lang.String var12 = var7.getNome();
    var4.addDisciplina(var7);
    Stude.Stude var15 = new Stude.Stude("hi!");
    var15.addDisciplina("hi!", 0);
    Stude.Disciplina var20 = var15.getDisciplina("Metodo de estudo regular");
    var15.setMetodoRegular();
    var15.setMetodoAvancado();
    boolean var23 = var7.equals((java.lang.Object)var15);
    java.util.HashMap var24 = var15.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test109");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var7 = var0.getDisciplina("");
    java.util.List var8 = var0.getDisciplinas();
    Stude.Stude var10 = new Stude.Stude("hi!");
    var10.setMetodoAvancado();
    Stude.MetodoDeEstudo var12 = var10.getMetodoDeEstudo();
    var10.setMetodoAvancado();
    var10.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var18 = var10.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var18);
    var18.addHorasDeEstudo(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test110");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 5);
    java.lang.String var3 = var2.getNome();
    var2.setCor(15);
    Stude.Stude var7 = new Stude.Stude("hi!");
    Stude.Cronograma var8 = var7.getCronograma();
    Stude.Cronograma var9 = var7.getCronograma();
    Stude.Cronograma var10 = var7.getCronograma();
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var13.setCor((-1));
    var13.addHorasDeEstudo(10.0d);
    java.lang.String var18 = var13.getNome();
    var13.setNome("Metodo de estudo regular");
    var10.addDisciplina(var13);
    java.util.List var22 = var10.getDisciplinas();
    boolean var23 = var2.equals((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test111");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var12 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test112");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    java.lang.String var6 = var2.getNome();
    Stude.Stude var8 = new Stude.Stude("hi!");
    int var9 = var8.intervalo();
    Stude.Usuario var10 = var8.getUsuario();
    Stude.Cronograma var11 = var8.getCronograma();
    java.util.HashMap var12 = var8.desempenho();
    Stude.Usuario var13 = var8.getUsuario();
    Stude.Usuario var14 = var8.getUsuario();
    java.util.List var15 = var8.getDisciplinas();
    java.util.HashMap var16 = Stude.Desempenho.tempoDeEstudo(var15);
    boolean var17 = var2.equals((java.lang.Object)var16);
    Stude.Stude var19 = new Stude.Stude("hi!");
    var19.setMetodoAvancado();
    Stude.MetodoDeEstudo var21 = var19.getMetodoDeEstudo();
    int var22 = var19.tempoDeEstudo();
    java.util.List var23 = var19.getDisciplinas();
    var19.setMetodoAvancado();
    int var25 = var19.intervalo();
    Stude.MetodoDeEstudo var26 = var19.getMetodoDeEstudo();
    boolean var27 = var2.equals((java.lang.Object)var26);
    Stude.Stude var29 = new Stude.Stude("hi!");
    int var30 = var29.intervalo();
    var29.setNomeUsuario("Metodo de estudo regular");
    var29.setNomeUsuario("Metodo de estudo regular");
    int var35 = var29.tempoDeEstudo();
    Stude.Cronograma var36 = var29.getCronograma();
    var29.setMetodoRegular();
    boolean var38 = var2.equals((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test113");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.intervalo();
    var1.setMetodoAvancado();
    java.util.HashMap var8 = var1.desempenho();
    java.util.HashMap var9 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test114");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var6 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var6.setCor((-1));
    int var9 = var6.getCor();
    var6.addHorasDeEstudo(1.0d);
    java.lang.String var12 = var6.getNome();
    Stude.Disciplina var15 = new Stude.Disciplina("hi!", 30);
    boolean var16 = var6.equals((java.lang.Object)var15);
    java.lang.String var17 = var15.getNome();
    var15.setNome("hi!");
    var3.addDisciplina(var15);
    Stude.Disciplina var22 = var3.getDisciplina("hi!");
    Stude.Disciplina var24 = var3.getDisciplina("hi!");
    var24.setCor(1);
    Stude.Stude var28 = new Stude.Stude("hi!");
    Stude.Cronograma var29 = var28.getCronograma();
    int var30 = var28.tempoDeEstudo();
    var28.setMetodoAvancado();
    var28.addDisciplina("hi!", (-1));
    Stude.Disciplina var36 = var28.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var37 = var28.getCronograma();
    boolean var38 = var24.equals((java.lang.Object)var28);
    java.util.List var39 = var28.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test115");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo regular");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    int var4 = var3.tamanhoDisciplinas();
    int var5 = var3.tamanhoDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    java.util.HashMap var10 = var7.desempenho();
    var7.setMetodoRegular();
    java.util.List var12 = var7.getDisciplinas();
    java.util.HashMap var13 = var7.desempenho();
    int var14 = var7.intervalo();
    Stude.Cronograma var15 = var7.getCronograma();
    Stude.Cronograma var16 = var7.getCronograma();
    Stude.Disciplina var18 = var7.getDisciplina("");
    java.util.HashMap var19 = var7.desempenho();
    Stude.Cronograma var20 = var7.getCronograma();
    Stude.Disciplina var22 = var20.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var23 = new Stude.Cronograma();
    Stude.Disciplina var25 = var23.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var26 = new Stude.Cronograma();
    java.util.List var27 = var26.getDisciplinas();
    Stude.Disciplina var29 = var26.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var31 = var26.getDisciplina("hi!");
    Stude.Disciplina var34 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var26.addDisciplina(var34);
    Stude.Disciplina var38 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var26.addDisciplina(var38);
    int var40 = var26.tamanhoDisciplinas();
    Stude.Disciplina var43 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var44 = var43.toString();
    var43.setCor(15);
    var43.setNome("Metodo de estudo regular");
    int var49 = var43.getCor();
    var26.addDisciplina(var43);
    var23.addDisciplina(var43);
    java.lang.String var52 = var43.toString();
    java.lang.String var53 = var43.getNome();
    var20.addDisciplina(var43);
    var43.setCor(30);
    double var57 = var43.getHorasEstudadas();
    var3.addDisciplina(var43);
    java.lang.String var59 = var43.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo avancado"+ "'", var44.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Metodo de estudo regular"+ "'", var52.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "Metodo de estudo regular"+ "'", var53.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "Metodo de estudo regular"+ "'", var59.equals("Metodo de estudo regular"));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test116");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getTempo();
    int var13 = var0.getIntervalo();
    int var14 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test117");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var11.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    var16.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var24 = var16.getCronograma();
    Stude.Disciplina var26 = var16.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var27 = var16.getCronograma();
    Stude.Cronograma var28 = var16.getCronograma();
    java.util.List var29 = var28.getDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.setCor((-1));
    var32.addHorasDeEstudo(10.0d);
    Stude.Cronograma var37 = new Stude.Cronograma();
    java.util.List var38 = var37.getDisciplinas();
    Stude.Disciplina var40 = var37.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var42 = var37.getDisciplina("hi!");
    Stude.Disciplina var44 = var37.getDisciplina("");
    java.util.List var45 = var37.getDisciplinas();
    java.util.HashMap var46 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var47 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var45);
    boolean var50 = var32.equals((java.lang.Object)var49);
    var28.addDisciplina(var32);
    boolean var52 = var11.equals((java.lang.Object)var28);
    Stude.Cronograma var53 = new Stude.Cronograma();
    java.util.List var54 = var53.getDisciplinas();
    Stude.Disciplina var56 = var53.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var58 = var53.getDisciplina("hi!");
    Stude.Disciplina var61 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var53.addDisciplina(var61);
    Stude.Disciplina var65 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var53.addDisciplina(var65);
    Stude.Disciplina var69 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var70 = var69.toString();
    var69.setCor(15);
    var69.setCor(10);
    var53.addDisciplina(var69);
    int var76 = var69.getCor();
    var28.addDisciplina(var69);
    double var78 = var69.getHorasEstudadas();
    int var79 = var69.getCor();
    var69.setCor(10);
    int var82 = var69.getCor();
    Stude.Stude var84 = new Stude.Stude("hi!");
    var84.setMetodoAvancado();
    Stude.MetodoDeEstudo var86 = var84.getMetodoDeEstudo();
    java.util.HashMap var87 = var84.desempenho();
    int var88 = var84.tempoDeEstudo();
    java.util.List var89 = var84.getDisciplinas();
    var84.setMetodoRegular();
    java.util.List var91 = var84.getDisciplinas();
    java.util.List var92 = var84.getDisciplinas();
    java.util.HashMap var93 = Stude.Desempenho.tempoDeEstudo(var92);
    boolean var94 = var69.equals((java.lang.Object)var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Metodo de estudo avancado"+ "'", var70.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test118");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test119");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    Stude.Cronograma var5 = var1.getCronograma();
    int var6 = var5.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test120");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test121");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getIntervalo();
    int var11 = var0.getTempo();
    java.lang.String var12 = var0.toString();
    int var13 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test122");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var13 = var1.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test123");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test124");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Disciplina var13 = var11.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test125");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Usuario var13 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test126");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    var13.setNome("hi!");
    var13.setCor(10);
    var13.setNome("Metodo de estudo regular");
    var13.addHorasDeEstudo(20.0d);
    var13.setNome("Metodo de estudo regular");
    var13.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test127");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    var2.addHorasDeEstudo(10.0d);
    var2.setNome("Metodo de estudo regular");
    Stude.Stude var10 = new Stude.Stude("hi!");
    int var11 = var10.intervalo();
    Stude.Usuario var12 = var10.getUsuario();
    var10.addDisciplina("hi!", 0);
    java.util.HashMap var16 = var10.desempenho();
    Stude.MetodoDeEstudo var17 = var10.getMetodoDeEstudo();
    boolean var18 = var2.equals((java.lang.Object)var10);
    Stude.Cronograma var19 = var10.getCronograma();
    Stude.MetodoDeEstudo var20 = var10.getMetodoDeEstudo();
    Stude.Cronograma var21 = var10.getCronograma();
    Stude.Stude var23 = new Stude.Stude("hi!");
    int var24 = var23.intervalo();
    Stude.MetodoDeEstudo var25 = var23.getMetodoDeEstudo();
    var23.addDisciplina("hi!", 2);
    Stude.Disciplina var30 = var23.getDisciplina("hi!");
    var21.addDisciplina(var30);
    var30.setCor(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test128");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    var2.addHorasDeEstudo(10.0d);
    var2.setNome("Metodo de estudo regular");
    Stude.Stude var10 = new Stude.Stude("hi!");
    int var11 = var10.intervalo();
    Stude.Usuario var12 = var10.getUsuario();
    var10.addDisciplina("hi!", 0);
    java.util.HashMap var16 = var10.desempenho();
    Stude.MetodoDeEstudo var17 = var10.getMetodoDeEstudo();
    boolean var18 = var2.equals((java.lang.Object)var10);
    var10.setMetodoRegular();
    int var20 = var10.tempoDeEstudo();
    java.util.List var21 = var10.getDisciplinas();
    java.util.List var22 = var10.getDisciplinas();
    Stude.Usuario var23 = var10.getUsuario();
    Stude.Cronograma var24 = var10.getCronograma();
    boolean var26 = var24.removeDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test129");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    java.lang.String var7 = var6.getNome();
    java.lang.String var8 = var6.getNome();
    var6.setNome("Metodo de estudo regular");
    java.lang.String var11 = var6.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test130");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("Metodo de estudo regular");
    int var8 = var2.getCor();
    var2.setCor(30);
    var2.addHorasDeEstudo(11.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test131");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.List var4 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test132");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test133");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(2);
    Stude.Stude var6 = new Stude.Stude("hi!");
    int var7 = var6.intervalo();
    Stude.Usuario var8 = var6.getUsuario();
    Stude.Cronograma var9 = var6.getCronograma();
    var6.setMetodoAvancado();
    Stude.Cronograma var11 = var6.getCronograma();
    java.util.List var12 = var11.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var12);
    java.lang.String var14 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test134");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var6 = var1.desempenho();
    java.util.HashMap var7 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo avancado", 30);
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Cronograma var14 = var1.getCronograma();
    java.util.List var15 = var14.getDisciplinas();
    java.util.List var16 = var14.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test135");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test136");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    var2.setCor((-1));
    Stude.Stude var9 = new Stude.Stude("hi!");
    var9.setMetodoRegular();
    Stude.MetodoDeEstudo var11 = var9.getMetodoDeEstudo();
    var9.setMetodoAvancado();
    var9.setMetodoAvancado();
    boolean var14 = var2.equals((java.lang.Object)var9);
    var2.addHorasDeEstudo(20.0d);
    var2.setCor(100);
    java.lang.String var19 = var2.getNome();
    Stude.Stude var21 = new Stude.Stude("hi!");
    var21.setMetodoAvancado();
    Stude.MetodoDeEstudo var23 = var21.getMetodoDeEstudo();
    java.util.HashMap var24 = var21.desempenho();
    var21.setMetodoRegular();
    Stude.MetodoDeEstudo var26 = var21.getMetodoDeEstudo();
    var21.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var29 = var21.getCronograma();
    Stude.Disciplina var31 = var21.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var32 = var21.getCronograma();
    Stude.Usuario var33 = var21.getUsuario();
    Stude.Cronograma var34 = var21.getCronograma();
    java.util.List var35 = var34.getDisciplinas();
    Stude.Disciplina var38 = new Stude.Disciplina("hi!", 30);
    var38.setCor(2);
    var34.addDisciplina(var38);
    double var42 = var38.getHorasEstudadas();
    boolean var43 = var2.equals((java.lang.Object)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test137");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    Stude.Stude var14 = new Stude.Stude("hi!");
    int var15 = var14.intervalo();
    java.util.HashMap var16 = var14.desempenho();
    var14.setMetodoAvancado();
    boolean var18 = var11.equals((java.lang.Object)var14);
    int var19 = var14.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test138");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var4.tamanhoDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    Stude.Cronograma var8 = var7.getCronograma();
    Stude.Cronograma var9 = var7.getCronograma();
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var12.setCor((-1));
    int var15 = var12.getCor();
    var12.addHorasDeEstudo(1.0d);
    java.lang.String var18 = var12.getNome();
    Stude.Disciplina var21 = new Stude.Disciplina("hi!", 30);
    boolean var22 = var12.equals((java.lang.Object)var21);
    java.lang.String var23 = var21.getNome();
    var21.setNome("hi!");
    var9.addDisciplina(var21);
    var4.addDisciplina(var21);
    var21.setCor(3);
    var21.setCor(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test139");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    java.util.List var8 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test140");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Usuario var13 = var1.getUsuario();
    Stude.Usuario var14 = var1.getUsuario();
    var14.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test141");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var5.getMetodoDeEstudo();
    var5.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var13 = var5.getCronograma();
    Stude.Disciplina var15 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var16 = var5.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getNome();
    int var25 = var20.getCor();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    Stude.Disciplina var30 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var31 = var30.toString();
    java.lang.String var32 = var30.toString();
    java.lang.String var33 = var30.toString();
    var30.addHorasDeEstudo(10.0d);
    var0.addDisciplina(var30);
    Stude.Disciplina var39 = new Stude.Disciplina("hi!", 30);
    var39.setCor(2);
    var39.setNome("Metodo de estudo avancado");
    double var44 = var39.getHorasEstudadas();
    var0.addDisciplina(var39);
    java.util.List var46 = var0.getDisciplinas();
    Stude.Disciplina var49 = new Stude.Disciplina("hi!", 30);
    var49.setCor(2);
    double var52 = var49.getHorasEstudadas();
    var49.setCor(2);
    var0.addDisciplina(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo avancado"+ "'", var32.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo avancado"+ "'", var33.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test142");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Usuario var6 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.List var9 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test143");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    var2.setCor(100);
    var2.setNome("hi!");
    var2.setCor(15);
    int var12 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test144");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    java.util.List var9 = var1.getDisciplinas();
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test145");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    double var5 = var2.getHorasEstudadas();
    double var6 = var2.getHorasEstudadas();
    java.lang.String var7 = var2.getNome();
    var2.setCor(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test146");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test147");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    java.util.List var9 = var1.getDisciplinas();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var13 = var1.getDisciplina("");
    java.util.List var14 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test148");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    var2.setNome("hi!");
    int var8 = var2.getCor();
    java.lang.String var9 = var2.toString();
    Stude.Disciplina var12 = new Stude.Disciplina("hi!", 30);
    var12.setCor(2);
    Stude.Stude var16 = new Stude.Stude("hi!");
    int var17 = var16.intervalo();
    Stude.Usuario var18 = var16.getUsuario();
    Stude.Cronograma var19 = var16.getCronograma();
    var16.setMetodoAvancado();
    Stude.Cronograma var21 = var16.getCronograma();
    java.util.List var22 = var21.getDisciplinas();
    boolean var23 = var12.equals((java.lang.Object)var22);
    boolean var24 = var2.equals((java.lang.Object)var12);
    java.lang.String var25 = var12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test149");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.List var5 = var4.getDisciplinas();
    java.util.List var6 = var4.getDisciplinas();
    Stude.Cronograma var7 = new Stude.Cronograma();
    int var8 = var7.tamanhoDisciplinas();
    Stude.Cronograma var9 = new Stude.Cronograma();
    Stude.Disciplina var11 = var9.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var13 = var9.getDisciplina("");
    Stude.Cronograma var14 = new Stude.Cronograma();
    java.util.List var15 = var14.getDisciplinas();
    Stude.Disciplina var17 = var14.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var19 = var14.getDisciplina("hi!");
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var14.addDisciplina(var22);
    int var24 = var22.getCor();
    var9.addDisciplina(var22);
    var7.addDisciplina(var22);
    int var27 = var7.tamanhoDisciplinas();
    Stude.Disciplina var29 = var7.getDisciplina("Metodo de estudo regular");
    var4.addDisciplina(var29);
    double var31 = var29.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test150");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Disciplina var7 = var1.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test151");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test152");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test153");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    java.lang.String var4 = var3.getNome();
    java.lang.String var5 = var3.getNome();
    var3.setNome("hi!");
    var3.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test154");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setMetodoRegular();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test155");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 15);
    var2.setCor(15);
    Stude.Stude var6 = new Stude.Stude("hi!");
    var6.setMetodoAvancado();
    Stude.MetodoDeEstudo var8 = var6.getMetodoDeEstudo();
    java.util.HashMap var9 = var6.desempenho();
    var6.setMetodoRegular();
    java.util.List var11 = var6.getDisciplinas();
    var6.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var15 = var6.getMetodoDeEstudo();
    int var16 = var6.tempoDeEstudo();
    Stude.Cronograma var17 = var6.getCronograma();
    var6.addDisciplina("Metodo de estudo regular", 10);
    Stude.MetodoDeEstudo var21 = var6.getMetodoDeEstudo();
    var6.setMetodoRegular();
    var6.addDisciplina("hi!", 30);
    java.util.HashMap var26 = var6.desempenho();
    boolean var27 = var2.equals((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test156");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var11 = var1.getUsuario();
    var11.setNome("Metodo de estudo avancado");
    java.lang.String var14 = var11.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test157");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test158");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("hi!");
    Stude.Cronograma var8 = new Stude.Cronograma();
    java.util.List var9 = var8.getDisciplinas();
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var9);
    boolean var11 = var2.equals((java.lang.Object)var9);
    var2.setCor(30);
    java.lang.String var14 = var2.getNome();
    int var15 = var2.getCor();
    var2.setCor(2);
    var2.setNome("hi!");
    var2.setCor(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 30);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test159");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    boolean var8 = var2.equals((java.lang.Object)(byte)100);
    var2.setCor(100);
    int var11 = var2.getCor();
    int var12 = var2.getCor();
    double var13 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test160");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var14 = var1.getCronograma();
    int var15 = var14.tamanhoDisciplinas();
    Stude.Disciplina var18 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var19 = var18.toString();
    var18.setCor(15);
    var18.setCor(15);
    Stude.Stude var25 = new Stude.Stude("hi!");
    var25.setMetodoAvancado();
    Stude.MetodoDeEstudo var27 = var25.getMetodoDeEstudo();
    java.util.HashMap var28 = var25.desempenho();
    var25.setMetodoRegular();
    java.util.List var30 = var25.getDisciplinas();
    java.util.HashMap var31 = var25.desempenho();
    int var32 = var25.intervalo();
    Stude.MetodoDeEstudo var33 = var25.getMetodoDeEstudo();
    boolean var34 = var18.equals((java.lang.Object)var33);
    java.lang.String var35 = var18.getNome();
    var14.addDisciplina(var18);
    double var37 = var18.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Metodo de estudo avancado"+ "'", var35.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test161");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var10.setCor((-1));
    java.lang.String var13 = var10.getNome();
    java.lang.String var14 = var10.getNome();
    int var15 = var10.getCor();
    java.lang.String var16 = var10.getNome();
    var7.addDisciplina(var10);
    var10.setNome("Metodo de estudo avancado");
    var10.setCor(10);
    Stude.Disciplina var24 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var24.setCor((-1));
    int var27 = var24.getCor();
    var24.addHorasDeEstudo(1.0d);
    java.lang.String var30 = var24.getNome();
    Stude.Disciplina var33 = new Stude.Disciplina("hi!", 30);
    boolean var34 = var24.equals((java.lang.Object)var33);
    boolean var35 = var10.equals((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Metodo de estudo regular"+ "'", var30.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test162");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    int var12 = var1.tempoDeEstudo();
    Stude.Cronograma var13 = var1.getCronograma();
    int var14 = var13.tamanhoDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    int var20 = var17.getCor();
    var17.addHorasDeEstudo(1.0d);
    java.lang.String var23 = var17.toString();
    java.lang.String var24 = var17.toString();
    double var25 = var17.getHorasEstudadas();
    Stude.Stude var27 = new Stude.Stude("hi!");
    var27.setMetodoAvancado();
    Stude.MetodoDeEstudo var29 = var27.getMetodoDeEstudo();
    java.util.HashMap var30 = var27.desempenho();
    var27.setMetodoRegular();
    java.util.List var32 = var27.getDisciplinas();
    java.util.HashMap var33 = var27.desempenho();
    int var34 = var27.intervalo();
    Stude.Cronograma var35 = var27.getCronograma();
    java.util.List var36 = var27.getDisciplinas();
    boolean var37 = var17.equals((java.lang.Object)var36);
    var13.addDisciplina(var17);
    Stude.Disciplina var41 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var42 = var41.toString();
    var41.setCor(15);
    var41.setCor(15);
    int var47 = var41.getCor();
    java.lang.String var48 = var41.getNome();
    int var49 = var41.getCor();
    java.lang.String var50 = var41.toString();
    var13.addDisciplina(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Metodo de estudo avancado"+ "'", var42.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Metodo de estudo avancado"+ "'", var48.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Metodo de estudo avancado"+ "'", var50.equals("Metodo de estudo avancado"));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test163");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo avancado");
    int var12 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test164");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test165");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.List var14 = var1.getDisciplinas();
    java.util.List var15 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var16 = var1.getMetodoDeEstudo();
    java.util.HashMap var17 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test166");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    java.util.List var12 = var1.getDisciplinas();
    java.util.HashMap var13 = Stude.Desempenho.tempoDeEstudo(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test167");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", (-1));
    var1.setMetodoRegular();
    int var8 = var1.tempoDeEstudo();
    java.util.HashMap var9 = var1.desempenho();
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test168");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var5.getMetodoDeEstudo();
    var5.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var13 = var5.getCronograma();
    Stude.Disciplina var15 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var16 = var5.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getNome();
    int var25 = var20.getCor();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    Stude.Disciplina var29 = var0.getDisciplina("");
    Stude.Stude var31 = new Stude.Stude("hi!");
    var31.setMetodoAvancado();
    Stude.MetodoDeEstudo var33 = var31.getMetodoDeEstudo();
    java.util.HashMap var34 = var31.desempenho();
    var31.setMetodoRegular();
    java.util.List var36 = var31.getDisciplinas();
    java.util.HashMap var37 = var31.desempenho();
    int var38 = var31.intervalo();
    Stude.Cronograma var39 = var31.getCronograma();
    var31.setMetodoAvancado();
    Stude.Cronograma var41 = var31.getCronograma();
    Stude.Disciplina var44 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var45 = var44.getCor();
    double var46 = var44.getHorasEstudadas();
    java.lang.String var47 = var44.toString();
    var41.addDisciplina(var44);
    Stude.Disciplina var51 = new Stude.Disciplina("hi!", 5);
    double var52 = var51.getHorasEstudadas();
    var51.addHorasDeEstudo(10.0d);
    var51.addHorasDeEstudo(10.0d);
    var41.addDisciplina(var51);
    double var58 = var51.getHorasEstudadas();
    var0.addDisciplina(var51);
    double var60 = var51.getHorasEstudadas();
    java.lang.String var61 = var51.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Metodo de estudo regular"+ "'", var47.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test169");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test170");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    double var12 = var11.getHorasEstudadas();
    java.lang.String var13 = var11.toString();
    java.lang.String var14 = var11.getNome();
    var11.setCor(15);
    double var17 = var11.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test171");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var12 = var1.getDisciplina("");
    java.util.HashMap var13 = var1.desempenho();
    Stude.Cronograma var14 = var1.getCronograma();
    var1.setNomeUsuario("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test172");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Cronograma var8 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var8.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test173");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(20.0d);
    Stude.Stude var7 = new Stude.Stude("hi!");
    int var8 = var7.intervalo();
    var7.setNomeUsuario("Metodo de estudo regular");
    var7.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var13 = var7.getMetodoDeEstudo();
    Stude.Usuario var14 = var7.getUsuario();
    boolean var15 = var2.equals((java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test174");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var11 = var10.getHorasEstudadas();
    var10.setNome("hi!");
    var10.setNome("hi!");
    var7.addDisciplina(var10);
    var10.setNome("hi!");
    Stude.Cronograma var19 = new Stude.Cronograma();
    java.util.List var20 = var19.getDisciplinas();
    Stude.Disciplina var22 = var19.getDisciplina("Metodo de estudo regular");
    Stude.Stude var24 = new Stude.Stude("hi!");
    var24.setMetodoAvancado();
    Stude.MetodoDeEstudo var26 = var24.getMetodoDeEstudo();
    java.util.HashMap var27 = var24.desempenho();
    var24.setMetodoRegular();
    Stude.MetodoDeEstudo var29 = var24.getMetodoDeEstudo();
    var24.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var32 = var24.getCronograma();
    Stude.Disciplina var34 = var24.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var35 = var24.getCronograma();
    int var36 = var35.tamanhoDisciplinas();
    Stude.Disciplina var39 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var39.addHorasDeEstudo(10.0d);
    java.lang.String var42 = var39.toString();
    java.lang.String var43 = var39.getNome();
    int var44 = var39.getCor();
    var35.addDisciplina(var39);
    var19.addDisciplina(var39);
    Stude.Disciplina var49 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var50 = var49.toString();
    java.lang.String var51 = var49.toString();
    java.lang.String var52 = var49.toString();
    var49.addHorasDeEstudo(10.0d);
    var19.addDisciplina(var49);
    java.util.List var56 = var19.getDisciplinas();
    Stude.Disciplina var59 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    var59.setCor(5);
    java.lang.String var62 = var59.toString();
    var19.addDisciplina(var59);
    boolean var64 = var10.equals((java.lang.Object)var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Metodo de estudo regular"+ "'", var42.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Metodo de estudo regular"+ "'", var43.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Metodo de estudo avancado"+ "'", var50.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "Metodo de estudo avancado"+ "'", var51.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Metodo de estudo avancado"+ "'", var52.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "Metodo de estudo avancado"+ "'", var62.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test175");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test176");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    int var14 = var0.tamanhoDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var18 = var17.toString();
    var17.setCor(15);
    var17.setNome("Metodo de estudo regular");
    int var23 = var17.getCor();
    var0.addDisciplina(var17);
    Stude.Disciplina var26 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var27 = new Stude.Cronograma();
    java.util.List var28 = var27.getDisciplinas();
    Stude.Disciplina var30 = var27.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var32 = var27.getDisciplina("hi!");
    java.util.List var33 = var27.getDisciplinas();
    Stude.Disciplina var36 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var36.setCor((-1));
    int var39 = var36.getCor();
    var36.addHorasDeEstudo(1.0d);
    java.lang.String var42 = var36.getNome();
    var27.addDisciplina(var36);
    java.lang.String var44 = var36.toString();
    var0.addDisciplina(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Metodo de estudo regular"+ "'", var42.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo regular"+ "'", var44.equals("Metodo de estudo regular"));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test177");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test178");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.Cronograma var7 = new Stude.Cronograma();
    int var8 = var7.tamanhoDisciplinas();
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var12 = var11.getHorasEstudadas();
    double var13 = var11.getHorasEstudadas();
    var7.addDisciplina(var11);
    var11.setCor(15);
    var6.addDisciplina(var11);
    java.lang.String var18 = var11.getNome();
    int var19 = var11.getCor();
    var11.addHorasDeEstudo(1.0d);
    int var22 = var11.getCor();
    java.lang.String var23 = var11.toString();
    java.lang.String var24 = var11.toString();
    double var25 = var11.getHorasEstudadas();
    var11.setCor(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1.0d);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test179");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    int var9 = var0.getIntervalo();
    int var10 = var0.getIntervalo();
    int var11 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test180");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.Cronograma var7 = var1.getCronograma();
    int var8 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test181");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    double var12 = var11.getHorasEstudadas();
    var11.setNome("Metodo de estudo regular");
    java.lang.String var15 = var11.toString();
    Stude.Stude var17 = new Stude.Stude("hi!");
    var17.setMetodoAvancado();
    Stude.MetodoDeEstudo var19 = var17.getMetodoDeEstudo();
    var17.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var23 = var17.getDisciplina("Metodo de estudo regular");
    java.util.HashMap var24 = var17.desempenho();
    boolean var25 = var11.equals((java.lang.Object)var24);
    double var26 = var11.getHorasEstudadas();
    java.lang.String var27 = var11.getNome();
    var11.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo regular"+ "'", var27.equals("Metodo de estudo regular"));

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test182");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Disciplina var9 = var1.getDisciplina("");
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    var1.addDisciplina("Metodo de estudo avancado", 3);
    Stude.Usuario var16 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test183");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    Stude.Disciplina var7 = var1.getDisciplina("");
    Stude.Disciplina var9 = var1.getDisciplina("");
    boolean var11 = var1.removeDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test184");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    java.lang.String var6 = var2.getNome();
    Stude.Stude var8 = new Stude.Stude("hi!");
    int var9 = var8.intervalo();
    Stude.Usuario var10 = var8.getUsuario();
    Stude.Cronograma var11 = var8.getCronograma();
    java.util.HashMap var12 = var8.desempenho();
    Stude.Usuario var13 = var8.getUsuario();
    Stude.Usuario var14 = var8.getUsuario();
    java.util.List var15 = var8.getDisciplinas();
    java.util.HashMap var16 = Stude.Desempenho.tempoDeEstudo(var15);
    boolean var17 = var2.equals((java.lang.Object)var16);
    Stude.Stude var19 = new Stude.Stude("hi!");
    var19.setMetodoAvancado();
    Stude.MetodoDeEstudo var21 = var19.getMetodoDeEstudo();
    int var22 = var19.tempoDeEstudo();
    java.util.List var23 = var19.getDisciplinas();
    var19.setMetodoAvancado();
    int var25 = var19.intervalo();
    Stude.MetodoDeEstudo var26 = var19.getMetodoDeEstudo();
    boolean var27 = var2.equals((java.lang.Object)var26);
    Stude.Disciplina var30 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var31 = var30.toString();
    var30.setCor(15);
    var30.setNome("hi!");
    Stude.Cronograma var36 = new Stude.Cronograma();
    java.util.List var37 = var36.getDisciplinas();
    java.util.HashMap var38 = Stude.Desempenho.tempoDeEstudo(var37);
    boolean var39 = var30.equals((java.lang.Object)var37);
    var30.setCor(30);
    boolean var42 = var2.equals((java.lang.Object)30);
    int var43 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test185");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    java.util.List var3 = var1.getDisciplinas();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Cronograma var5 = var1.getCronograma();
    Stude.Disciplina var7 = var5.getDisciplina("Metodo de estudo avancado");
    java.util.List var8 = var5.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test186");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var11 = var10.getHorasEstudadas();
    var10.setNome("hi!");
    var10.setNome("hi!");
    var7.addDisciplina(var10);
    var10.setCor(30);
    java.lang.String var19 = var10.getNome();
    var10.addHorasDeEstudo(21.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test187");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.Cronograma var7 = new Stude.Cronograma();
    int var8 = var7.tamanhoDisciplinas();
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var12 = var11.getHorasEstudadas();
    double var13 = var11.getHorasEstudadas();
    var7.addDisciplina(var11);
    var11.setCor(15);
    var6.addDisciplina(var11);
    java.lang.String var18 = var11.getNome();
    int var19 = var11.getCor();
    var11.addHorasDeEstudo(1.0d);
    int var22 = var11.getCor();
    java.lang.String var23 = var11.toString();
    java.lang.String var24 = var11.toString();
    int var25 = var11.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 15);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test188");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.List var14 = var1.getDisciplinas();
    Stude.Disciplina var16 = var1.getDisciplina("");
    Stude.Disciplina var18 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("Metodo de estudo avancado", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test189");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    java.util.List var8 = var0.getDisciplinas();
    java.util.List var9 = var0.getDisciplinas();
    java.util.List var10 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test190");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    Stude.Cronograma var5 = var1.getCronograma();
    int var6 = var1.tempoDeEstudo();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Cronograma var8 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test191");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setNomeUsuario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test192");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var9 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", (-1));
    java.lang.String var13 = var12.toString();
    Stude.Disciplina var16 = new Stude.Disciplina("hi!", 5);
    double var17 = var16.getHorasEstudadas();
    var16.addHorasDeEstudo(10.0d);
    java.lang.String var20 = var16.toString();
    java.lang.String var21 = var16.toString();
    java.lang.String var22 = var16.getNome();
    var16.addHorasDeEstudo(10.0d);
    var16.setNome("hi!");
    boolean var27 = var12.equals((java.lang.Object)var16);
    var0.addDisciplina(var16);
    double var29 = var16.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 20.0d);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test193");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    int var9 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test194");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var6 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var6.setCor((-1));
    int var9 = var6.getCor();
    var6.addHorasDeEstudo(1.0d);
    java.lang.String var12 = var6.getNome();
    Stude.Disciplina var15 = new Stude.Disciplina("hi!", 30);
    boolean var16 = var6.equals((java.lang.Object)var15);
    java.lang.String var17 = var15.getNome();
    var15.setNome("hi!");
    var3.addDisciplina(var15);
    Stude.Stude var22 = new Stude.Stude("hi!");
    var22.setMetodoAvancado();
    Stude.MetodoDeEstudo var24 = var22.getMetodoDeEstudo();
    java.util.HashMap var25 = var22.desempenho();
    var22.setMetodoRegular();
    java.util.List var27 = var22.getDisciplinas();
    var22.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var32 = var22.getDisciplina("Metodo de estudo regular");
    double var33 = var32.getHorasEstudadas();
    java.lang.String var34 = var32.toString();
    java.lang.String var35 = var32.toString();
    var3.addDisciplina(var32);
    Stude.Disciplina var38 = var3.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Metodo de estudo regular"+ "'", var35.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test195");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 10);
    var1.setMetodoAvancado();
    int var17 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test196");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    Stude.Cronograma var10 = var1.getCronograma();
    int var11 = var10.tamanhoDisciplinas();
    Stude.Disciplina var14 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var14.setCor((-1));
    var14.setNome("Metodo de estudo regular");
    var10.addDisciplina(var14);
    java.lang.String var20 = var14.toString();
    double var21 = var14.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test197");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    var4.setCor(15);
    java.lang.String var10 = var4.toString();
    var4.addHorasDeEstudo(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test198");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    int var9 = var0.getIntervalo();
    int var10 = var0.getIntervalo();
    java.lang.String var11 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test199");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    java.util.List var8 = var1.getDisciplinas();
    Stude.Disciplina var10 = var1.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test200");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    int var12 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Usuario var14 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test201");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var5.getMetodoDeEstudo();
    var5.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var13 = var5.getCronograma();
    Stude.Disciplina var15 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var16 = var5.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getNome();
    int var25 = var20.getCor();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    int var28 = var0.tamanhoDisciplinas();
    int var29 = var0.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test202");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    int var11 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test203");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Usuario var7 = var1.getUsuario();
    var7.setNome("Metodo de estudo regular");
    var7.setNome("hi!");
    var7.setNome("Metodo de estudo regular");
    java.lang.String var14 = var7.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test204");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Usuario var13 = var1.getUsuario();
    int var14 = var1.tempoDeEstudo();
    java.util.HashMap var15 = var1.desempenho();
    java.util.List var16 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test205");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    int var13 = var1.intervalo();
    var1.setMetodoRegular();
    int var15 = var1.intervalo();
    java.util.HashMap var16 = var1.desempenho();
    java.util.HashMap var17 = var1.desempenho();
    var1.setNomeUsuario("Metodo de estudo avancado");
    java.util.HashMap var20 = var1.desempenho();
    Stude.Disciplina var22 = var1.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test206");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    java.util.HashMap var7 = var1.desempenho();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var10 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    Stude.Cronograma var13 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test207");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    int var9 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    var2.addHorasDeEstudo(1.0d);
    int var14 = var2.getCor();
    java.lang.String var15 = var2.toString();
    var2.addHorasDeEstudo(20.0d);
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var20 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test208");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 15);
    var2.setCor(30);
    java.lang.String var5 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test209");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    double var12 = var11.getHorasEstudadas();
    var11.setNome("Metodo de estudo regular");
    var11.setNome("Metodo de estudo regular");
    Stude.Stude var18 = new Stude.Stude("hi!");
    var18.setMetodoAvancado();
    Stude.MetodoDeEstudo var20 = var18.getMetodoDeEstudo();
    java.util.HashMap var21 = var18.desempenho();
    var18.setMetodoRegular();
    Stude.MetodoDeEstudo var23 = var18.getMetodoDeEstudo();
    var18.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var26 = var18.getCronograma();
    Stude.Disciplina var28 = var18.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var29 = var18.getCronograma();
    Stude.Cronograma var30 = var18.getCronograma();
    java.util.List var31 = var30.getDisciplinas();
    boolean var32 = var11.equals((java.lang.Object)var31);
    java.util.HashMap var33 = Stude.Desempenho.tempoDeEstudo(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test210");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    var2.setCor(100);
    var2.setNome("Metodo de estudo avancado");
    var2.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test211");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    int var11 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test212");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test213");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.addDisciplina("hi!", 1);
    Stude.Cronograma var13 = var1.getCronograma();
    int var14 = var13.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var13.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test214");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    java.util.HashMap var10 = var1.desempenho();
    var1.addDisciplina("hi!", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test215");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.tempoDeEstudo();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test216");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var15.setCor(100);
    Stude.Cronograma var18 = new Stude.Cronograma();
    java.util.List var19 = var18.getDisciplinas();
    Stude.Disciplina var21 = var18.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var23 = var18.getDisciplina("hi!");
    Stude.Disciplina var25 = var18.getDisciplina("");
    boolean var26 = var15.equals((java.lang.Object)"");
    var0.addDisciplina(var15);
    Stude.Disciplina var30 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var31 = var30.getHorasEstudadas();
    var30.setNome("hi!");
    var30.setNome("Metodo de estudo avancado");
    var30.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var30);
    Stude.Disciplina var41 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    int var42 = var41.getCor();
    double var43 = var41.getHorasEstudadas();
    var41.setCor(2);
    var0.addDisciplina(var41);
    boolean var48 = var0.removeDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test217");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getIntervalo();
    java.lang.String var11 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test218");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Usuario var10 = var1.getUsuario();
    var10.setNome("Metodo de estudo avancado");
    java.lang.String var13 = var10.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test219");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    int var9 = var0.getIntervalo();
    int var10 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test220");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test221");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    double var5 = var2.getHorasEstudadas();
    double var6 = var2.getHorasEstudadas();
    var2.setCor(30);
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo avancado", (-1));
    java.lang.String var12 = var11.toString();
    Stude.Disciplina var15 = new Stude.Disciplina("hi!", 5);
    double var16 = var15.getHorasEstudadas();
    var15.addHorasDeEstudo(10.0d);
    java.lang.String var19 = var15.toString();
    java.lang.String var20 = var15.toString();
    java.lang.String var21 = var15.getNome();
    var15.addHorasDeEstudo(10.0d);
    var15.setNome("hi!");
    boolean var26 = var11.equals((java.lang.Object)var15);
    var15.addHorasDeEstudo(100.0d);
    java.lang.String var29 = var15.getNome();
    java.lang.String var30 = var15.getNome();
    boolean var31 = var2.equals((java.lang.Object)var30);
    var2.addHorasDeEstudo(10.0d);
    var2.addHorasDeEstudo(100.0d);
    java.lang.String var36 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo regular"+ "'", var36.equals("Metodo de estudo regular"));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test222");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var9 = var1.desempenho();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Usuario var12 = var1.getUsuario();
    Stude.Cronograma var13 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test223");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.tempoDeEstudo();
    int var7 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 3);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test224");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    java.util.HashMap var10 = var1.desempenho();
    var1.addDisciplina("hi!", (-1));
    Stude.Disciplina var15 = var1.getDisciplina("");
    java.util.List var16 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test225");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    int var3 = var2.getCor();
    double var4 = var2.getHorasEstudadas();
    int var5 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test226");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var17 = var16.toString();
    Stude.Stude var19 = new Stude.Stude("hi!");
    var19.setMetodoAvancado();
    Stude.MetodoDeEstudo var21 = var19.getMetodoDeEstudo();
    java.util.HashMap var22 = var19.desempenho();
    var19.setMetodoRegular();
    Stude.MetodoDeEstudo var24 = var19.getMetodoDeEstudo();
    var19.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var27 = var19.desempenho();
    boolean var28 = var16.equals((java.lang.Object)var27);
    var7.addDisciplina(var16);
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var7.addDisciplina(var32);
    int var34 = var7.tamanhoDisciplinas();
    Stude.Disciplina var36 = var7.getDisciplina("Metodo de estudo avancado");
    java.lang.String var37 = var36.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo avancado"+ "'", var37.equals("Metodo de estudo avancado"));

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test227");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    int var20 = var17.getCor();
    var17.addHorasDeEstudo(1.0d);
    java.lang.String var23 = var17.getNome();
    Stude.Disciplina var26 = new Stude.Disciplina("hi!", 30);
    boolean var27 = var17.equals((java.lang.Object)var26);
    java.lang.String var28 = var26.getNome();
    var7.addDisciplina(var26);
    int var30 = var7.tamanhoDisciplinas();
    int var31 = var7.tamanhoDisciplinas();
    Stude.Disciplina var34 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var34.setCor((-1));
    var34.addHorasDeEstudo(10.0d);
    Stude.Cronograma var39 = new Stude.Cronograma();
    java.util.List var40 = var39.getDisciplinas();
    Stude.Disciplina var42 = var39.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var44 = var39.getDisciplina("hi!");
    Stude.Disciplina var46 = var39.getDisciplina("");
    java.util.List var47 = var39.getDisciplinas();
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var50 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var51 = Stude.Desempenho.tempoDeEstudo(var47);
    boolean var52 = var34.equals((java.lang.Object)var51);
    var34.setNome("Metodo de estudo regular");
    java.lang.String var55 = var34.toString();
    var7.addDisciplina(var34);
    Stude.Stude var58 = new Stude.Stude("hi!");
    var58.setMetodoAvancado();
    Stude.MetodoDeEstudo var60 = var58.getMetodoDeEstudo();
    java.util.HashMap var61 = var58.desempenho();
    java.util.HashMap var62 = var58.desempenho();
    var58.setMetodoAvancado();
    Stude.MetodoDeEstudo var64 = var58.getMetodoDeEstudo();
    boolean var65 = var34.equals((java.lang.Object)var58);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var67 = var58.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Metodo de estudo regular"+ "'", var55.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test228");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    int var6 = var1.tempoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
    java.util.List var10 = var1.getDisciplinas();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test229");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    java.util.List var12 = var1.getDisciplinas();
    int var13 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo regular", 15);
    Stude.Disciplina var18 = var1.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test230");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var7 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test231");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.MetodoDeEstudo var13 = var1.getMetodoDeEstudo();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test232");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var8 = var7.toString();
    var7.setCor(15);
    var7.setCor(10);
    var2.addDisciplina(var7);
    Stude.Disciplina var15 = var2.getDisciplina("");
    java.util.List var16 = var2.getDisciplinas();
    java.util.List var17 = var2.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test233");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test234");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    int var6 = var0.tamanhoDisciplinas();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var12.addDisciplina(var20);
    int var22 = var20.getCor();
    var7.addDisciplina(var20);
    java.lang.String var24 = var20.getNome();
    java.lang.String var25 = var20.getNome();
    java.lang.String var26 = var20.getNome();
    var20.setNome("hi!");
    java.lang.String var29 = var20.getNome();
    java.lang.String var30 = var20.toString();
    var0.addDisciplina(var20);
    int var32 = var0.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test235");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    var2.setNome("hi!");
    var2.setNome("Metodo de estudo avancado");
    var2.addHorasDeEstudo(1.0d);
    double var10 = var2.getHorasEstudadas();
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var13.setCor((-1));
    java.lang.String var16 = var13.getNome();
    java.lang.String var17 = var13.getNome();
    int var18 = var13.getCor();
    java.lang.String var19 = var13.getNome();
    boolean var20 = var2.equals((java.lang.Object)var13);
    int var21 = var2.getCor();
    int var22 = var2.getCor();
    java.lang.String var23 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test236");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Usuario var7 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test237");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    Stude.Disciplina var18 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var20 = var0.getDisciplina("hi!");
    Stude.Disciplina var22 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var27 = new Stude.Disciplina("hi!", 15);
    var27.setCor(15);
    var27.setNome("Metodo de estudo avancado");
    var0.addDisciplina(var27);
    Stude.Disciplina var34 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var36 = var0.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test238");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 15);
    var2.setCor(30);
    var2.setCor(0);
    double var7 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test239");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.lang.String var14 = var2.toString();
    int var15 = var2.getCor();
    java.lang.String var16 = var2.getNome();
    Stude.Disciplina var19 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var20 = var19.getHorasEstudadas();
    double var21 = var19.getHorasEstudadas();
    java.lang.String var22 = var19.toString();
    boolean var23 = var2.equals((java.lang.Object)var19);
    double var24 = var19.getHorasEstudadas();
    java.lang.String var25 = var19.getNome();
    var19.setCor(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo regular"+ "'", var22.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test240");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.List var10 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo avancado", 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test241");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Usuario var13 = var1.getUsuario();
    Stude.Cronograma var14 = var1.getCronograma();
    int var15 = var1.intervalo();
    Stude.Disciplina var17 = var1.getDisciplina("");
    var1.setMetodoRegular();
    int var19 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 5);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test242");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test243");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    int var6 = var1.tempoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    int var9 = var1.intervalo();
    Stude.Usuario var10 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test244");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test245");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    Stude.Usuario var5 = var1.getUsuario();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test246");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.HashMap var10 = var1.desempenho();
    java.util.HashMap var11 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test247");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    java.util.List var10 = var0.getDisciplinas();
    Stude.Disciplina var12 = var0.getDisciplina("Metodo de estudo avancado");
    int var13 = var0.tamanhoDisciplinas();
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var16.setCor((-1));
    java.lang.String var19 = var16.getNome();
    java.lang.String var20 = var16.getNome();
    int var21 = var16.getCor();
    var16.setCor(2);
    int var24 = var16.getCor();
    int var25 = var16.getCor();
    var0.addDisciplina(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test248");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.intervalo();
    Stude.Cronograma var12 = var1.getCronograma();
    java.util.List var13 = var12.getDisciplinas();
    java.util.List var14 = var12.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var12.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test249");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Disciplina var14 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var15 = var14.getCor();
    double var16 = var14.getHorasEstudadas();
    java.lang.String var17 = var14.toString();
    var11.addDisciplina(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var20 = var11.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test250");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    java.util.HashMap var8 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test251");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    java.util.List var12 = var1.getDisciplinas();
    int var13 = var1.tempoDeEstudo();
    Stude.Cronograma var14 = var1.getCronograma();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    var17.addHorasDeEstudo(10.0d);
    var17.setNome("Metodo de estudo regular");
    Stude.Stude var25 = new Stude.Stude("hi!");
    int var26 = var25.intervalo();
    Stude.Usuario var27 = var25.getUsuario();
    var25.addDisciplina("hi!", 0);
    java.util.HashMap var31 = var25.desempenho();
    Stude.MetodoDeEstudo var32 = var25.getMetodoDeEstudo();
    boolean var33 = var17.equals((java.lang.Object)var25);
    Stude.Stude var35 = new Stude.Stude("hi!");
    var35.setMetodoAvancado();
    Stude.MetodoDeEstudo var37 = var35.getMetodoDeEstudo();
    java.util.HashMap var38 = var35.desempenho();
    var35.setMetodoRegular();
    java.util.HashMap var40 = var35.desempenho();
    var35.setMetodoRegular();
    boolean var42 = var17.equals((java.lang.Object)var35);
    var17.setNome("hi!");
    java.lang.String var45 = var17.toString();
    var14.addDisciplina(var17);
    int var47 = var14.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test252");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    Stude.Disciplina var7 = var1.getDisciplina("");
    Stude.Disciplina var9 = var1.getDisciplina("");
    var1.setMetodoAvancado();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    java.util.HashMap var13 = var1.desempenho();
    java.util.HashMap var14 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test253");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    int var13 = var12.tamanhoDisciplinas();
    int var14 = var12.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test254");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var7.getDisciplina("hi!");
    Stude.Stude var11 = new Stude.Stude("hi!");
    var11.setMetodoAvancado();
    Stude.MetodoDeEstudo var13 = var11.getMetodoDeEstudo();
    var11.setMetodoAvancado();
    var11.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var19 = var11.getDisciplina("Metodo de estudo regular");
    var19.setCor(100);
    Stude.Cronograma var22 = new Stude.Cronograma();
    java.util.List var23 = var22.getDisciplinas();
    Stude.Disciplina var25 = var22.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var27 = var22.getDisciplina("hi!");
    Stude.Disciplina var29 = var22.getDisciplina("");
    boolean var30 = var19.equals((java.lang.Object)"");
    double var31 = var19.getHorasEstudadas();
    var19.setNome("Metodo de estudo regular");
    java.lang.String var34 = var19.getNome();
    var7.addDisciplina(var19);
    Stude.Disciplina var38 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var38.setCor((-1));
    int var41 = var38.getCor();
    var38.addHorasDeEstudo(1.0d);
    java.lang.String var44 = var38.getNome();
    double var45 = var38.getHorasEstudadas();
    var38.setCor(3);
    Stude.Stude var49 = new Stude.Stude("hi!");
    int var50 = var49.intervalo();
    Stude.Usuario var51 = var49.getUsuario();
    var49.setMetodoRegular();
    var49.setMetodoRegular();
    Stude.Usuario var54 = var49.getUsuario();
    boolean var55 = var38.equals((java.lang.Object)var54);
    var7.addDisciplina(var38);
    Stude.Stude var58 = new Stude.Stude("hi!");
    int var59 = var58.intervalo();
    Stude.Usuario var60 = var58.getUsuario();
    var58.addDisciplina("hi!", 0);
    java.util.HashMap var64 = var58.desempenho();
    Stude.Disciplina var66 = var58.getDisciplina("Metodo de estudo avancado");
    var58.setMetodoRegular();
    Stude.Cronograma var68 = var58.getCronograma();
    boolean var69 = var38.equals((java.lang.Object)var58);
    java.lang.String var70 = var38.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo regular"+ "'", var44.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Metodo de estudo regular"+ "'", var70.equals("Metodo de estudo regular"));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test255");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setCor(15);
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.getNome();
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var14 = var13.toString();
    var13.setCor(15);
    var13.setNome("Metodo de estudo regular");
    int var19 = var13.getCor();
    var13.setCor(30);
    boolean var22 = var2.equals((java.lang.Object)var13);
    java.lang.String var23 = var13.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test256");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    Stude.Disciplina var8 = var0.getDisciplina("hi!");
    int var9 = var0.tamanhoDisciplinas();
    Stude.Stude var11 = new Stude.Stude("hi!");
    var11.setMetodoAvancado();
    Stude.MetodoDeEstudo var13 = var11.getMetodoDeEstudo();
    var11.setMetodoAvancado();
    var11.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var19 = var11.getDisciplina("Metodo de estudo regular");
    var19.setCor(100);
    Stude.Cronograma var22 = new Stude.Cronograma();
    java.util.List var23 = var22.getDisciplinas();
    Stude.Disciplina var25 = var22.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var27 = var22.getDisciplina("hi!");
    Stude.Disciplina var29 = var22.getDisciplina("");
    boolean var30 = var19.equals((java.lang.Object)"");
    var0.addDisciplina(var19);
    var19.setNome("Metodo de estudo avancado");
    var19.setNome("Metodo de estudo regular");
    java.lang.String var36 = var19.getNome();
    var19.setCor(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo regular"+ "'", var36.equals("Metodo de estudo regular"));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test257");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var14 = var13.toString();
    java.lang.String var15 = var13.toString();
    java.lang.String var16 = var13.toString();
    var9.addDisciplina(var13);
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.setCor((-1));
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var25 = var20.getNome();
    var20.setNome("Metodo de estudo regular");
    var9.addDisciplina(var20);
    Stude.Disciplina var31 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var31.setCor((-1));
    int var34 = var31.getCor();
    var31.addHorasDeEstudo(1.0d);
    java.lang.String var37 = var31.getNome();
    int var38 = var31.getCor();
    var31.addHorasDeEstudo(1.0d);
    var31.addHorasDeEstudo(1.0d);
    var9.addDisciplina(var31);
    Stude.Disciplina var46 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var47 = new Stude.Cronograma();
    java.util.List var48 = var47.getDisciplinas();
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var48);
    boolean var50 = var46.equals((java.lang.Object)var49);
    var46.addHorasDeEstudo(1.0d);
    var46.addHorasDeEstudo(10.0d);
    var46.setCor(100);
    var9.addDisciplina(var46);
    var46.setCor(100);
    var46.setCor(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo regular"+ "'", var37.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test258");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var17 = var16.toString();
    Stude.Stude var19 = new Stude.Stude("hi!");
    var19.setMetodoAvancado();
    Stude.MetodoDeEstudo var21 = var19.getMetodoDeEstudo();
    java.util.HashMap var22 = var19.desempenho();
    var19.setMetodoRegular();
    Stude.MetodoDeEstudo var24 = var19.getMetodoDeEstudo();
    var19.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var27 = var19.desempenho();
    boolean var28 = var16.equals((java.lang.Object)var27);
    var7.addDisciplina(var16);
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var7.addDisciplina(var32);
    java.util.List var34 = var7.getDisciplinas();
    Stude.Disciplina var37 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var37.setCor((-1));
    java.lang.String var40 = var37.getNome();
    java.lang.String var41 = var37.getNome();
    int var42 = var37.getCor();
    var37.setNome("Metodo de estudo avancado");
    var7.addDisciplina(var37);
    Stude.Disciplina var48 = new Stude.Disciplina("Metodo de estudo regular", 10);
    var7.addDisciplina(var48);
    Stude.Stude var51 = new Stude.Stude("hi!");
    Stude.Cronograma var52 = var51.getCronograma();
    int var53 = var51.tempoDeEstudo();
    int var54 = var51.tempoDeEstudo();
    int var55 = var51.intervalo();
    var51.setMetodoAvancado();
    Stude.Cronograma var57 = var51.getCronograma();
    Stude.Disciplina var60 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var61 = var60.getHorasEstudadas();
    var60.setNome("hi!");
    var60.setNome("hi!");
    var57.addDisciplina(var60);
    var60.setCor(30);
    java.lang.String var69 = var60.getNome();
    var7.addDisciplina(var60);
    boolean var72 = var7.removeDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo regular"+ "'", var40.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo regular"+ "'", var41.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "hi!"+ "'", var69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test259");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    java.util.HashMap var8 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test260");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    int var9 = var1.tempoDeEstudo();
    int var10 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test261");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var12 = var10.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var14 = var10.getDisciplina("Metodo de estudo avancado");
    java.util.List var15 = var10.getDisciplinas();
    java.util.HashMap var16 = Stude.Desempenho.tempoDeEstudo(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test262");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.Cronograma var9 = new Stude.Cronograma();
    int var10 = var9.tamanhoDisciplinas();
    Stude.Cronograma var11 = new Stude.Cronograma();
    Stude.Disciplina var13 = var11.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var15 = var11.getDisciplina("");
    Stude.Cronograma var16 = new Stude.Cronograma();
    java.util.List var17 = var16.getDisciplinas();
    Stude.Disciplina var19 = var16.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var21 = var16.getDisciplina("hi!");
    Stude.Disciplina var24 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var16.addDisciplina(var24);
    int var26 = var24.getCor();
    var11.addDisciplina(var24);
    var9.addDisciplina(var24);
    int var29 = var9.tamanhoDisciplinas();
    Stude.Disciplina var31 = var9.getDisciplina("Metodo de estudo regular");
    var31.setCor(100);
    double var34 = var31.getHorasEstudadas();
    var8.addDisciplina(var31);
    double var36 = var31.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test263");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 30);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test264");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 2);
    java.util.List var10 = var1.getDisciplinas();
    var1.addDisciplina("hi!", 30);
    Stude.MetodoDeEstudo var14 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test265");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo avancado");
    int var10 = var1.tempoDeEstudo();
    Stude.Usuario var11 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test266");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test267");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    int var12 = var1.tempoDeEstudo();
    java.util.HashMap var13 = var1.desempenho();
    var1.setNomeUsuario("hi!");
    Stude.Cronograma var16 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test268");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var4 = var0.getDisciplinas();
    java.util.HashMap var5 = Stude.Desempenho.tempoDeEstudo(var4);
    java.util.HashMap var6 = Stude.Desempenho.tempoDeEstudo(var4);
    java.util.HashMap var7 = Stude.Desempenho.tempoDeEstudo(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test269");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var8 = var7.toString();
    var7.setCor(15);
    var7.setNome("Metodo de estudo regular");
    int var13 = var7.getCor();
    var2.addDisciplina(var7);
    int var15 = var2.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var17 = var2.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test270");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    java.util.List var18 = var0.getDisciplinas();
    java.util.List var19 = var0.getDisciplinas();
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var23 = var22.toString();
    var22.setCor(15);
    java.lang.String var26 = var22.getNome();
    boolean var28 = var22.equals((java.lang.Object)(byte)100);
    var0.addDisciplina(var22);
    int var30 = var0.tamanhoDisciplinas();
    boolean var32 = var0.removeDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test271");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    Stude.Disciplina var7 = var1.getDisciplina("");
    java.util.List var8 = var1.getDisciplinas();
    Stude.Usuario var9 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test272");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    java.util.List var8 = var7.getDisciplinas();
    int var9 = var7.tamanhoDisciplinas();
    int var10 = var7.tamanhoDisciplinas();
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var14 = var13.toString();
    var13.setCor(15);
    java.lang.String var17 = var13.getNome();
    Stude.Cronograma var18 = new Stude.Cronograma();
    Stude.Disciplina var20 = var18.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var22 = var18.getDisciplina("");
    java.util.List var23 = var18.getDisciplinas();
    boolean var24 = var13.equals((java.lang.Object)var18);
    java.util.List var25 = var18.getDisciplinas();
    Stude.Disciplina var28 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var28.setCor((-1));
    int var31 = var28.getCor();
    var28.addHorasDeEstudo(1.0d);
    java.lang.String var34 = var28.getNome();
    Stude.Disciplina var37 = new Stude.Disciplina("hi!", 30);
    boolean var38 = var28.equals((java.lang.Object)var37);
    java.lang.String var39 = var37.getNome();
    var18.addDisciplina(var37);
    int var41 = var18.tamanhoDisciplinas();
    int var42 = var18.tamanhoDisciplinas();
    Stude.Disciplina var45 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var45.setCor((-1));
    var45.addHorasDeEstudo(10.0d);
    Stude.Cronograma var50 = new Stude.Cronograma();
    java.util.List var51 = var50.getDisciplinas();
    Stude.Disciplina var53 = var50.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var55 = var50.getDisciplina("hi!");
    Stude.Disciplina var57 = var50.getDisciplina("");
    java.util.List var58 = var50.getDisciplinas();
    java.util.HashMap var59 = Stude.Desempenho.tempoDeEstudo(var58);
    java.util.HashMap var60 = Stude.Desempenho.tempoDeEstudo(var58);
    java.util.HashMap var61 = Stude.Desempenho.tempoDeEstudo(var58);
    java.util.HashMap var62 = Stude.Desempenho.tempoDeEstudo(var58);
    boolean var63 = var45.equals((java.lang.Object)var62);
    var45.setNome("Metodo de estudo regular");
    java.lang.String var66 = var45.toString();
    var18.addDisciplina(var45);
    int var68 = var45.getCor();
    java.lang.String var69 = var45.getNome();
    var7.addDisciplina(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "Metodo de estudo regular"+ "'", var66.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "Metodo de estudo regular"+ "'", var69.equals("Metodo de estudo regular"));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test273");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    int var13 = var1.intervalo();
    var1.setMetodoRegular();
    int var15 = var1.intervalo();
    java.util.HashMap var16 = var1.desempenho();
    Stude.MetodoDeEstudo var17 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test274");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    var2.addHorasDeEstudo(10.0d);
    var2.setNome("Metodo de estudo regular");
    Stude.Stude var10 = new Stude.Stude("hi!");
    int var11 = var10.intervalo();
    Stude.Usuario var12 = var10.getUsuario();
    var10.addDisciplina("hi!", 0);
    java.util.HashMap var16 = var10.desempenho();
    Stude.MetodoDeEstudo var17 = var10.getMetodoDeEstudo();
    boolean var18 = var2.equals((java.lang.Object)var10);
    Stude.Stude var20 = new Stude.Stude("hi!");
    var20.setMetodoAvancado();
    Stude.MetodoDeEstudo var22 = var20.getMetodoDeEstudo();
    java.util.HashMap var23 = var20.desempenho();
    var20.setMetodoRegular();
    java.util.HashMap var25 = var20.desempenho();
    var20.setMetodoRegular();
    boolean var27 = var2.equals((java.lang.Object)var20);
    java.util.HashMap var28 = var20.desempenho();
    int var29 = var20.intervalo();
    var20.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 5);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test275");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var4.tamanhoDisciplinas();
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var9 = var8.getCor();
    int var10 = var8.getCor();
    java.lang.String var11 = var8.getNome();
    var4.addDisciplina(var8);
    var8.addHorasDeEstudo(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test276");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(2);
    int var5 = var2.getCor();
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test277");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.List var8 = var1.getDisciplinas();
    Stude.Usuario var9 = var1.getUsuario();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test278");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 10);
    var1.setMetodoAvancado();
    int var17 = var1.tempoDeEstudo();
    java.util.List var18 = var1.getDisciplinas();
    Stude.Usuario var19 = var1.getUsuario();
    var1.addDisciplina("Metodo de estudo avancado", 30);
    int var23 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 10);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test279");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    java.util.List var10 = var0.getDisciplinas();
    Stude.Disciplina var12 = var0.getDisciplina("Metodo de estudo avancado");
    int var13 = var0.tamanhoDisciplinas();
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var16.setCor((-1));
    int var19 = var16.getCor();
    var16.addHorasDeEstudo(1.0d);
    double var22 = var16.getHorasEstudadas();
    java.lang.String var23 = var16.toString();
    Stude.Stude var25 = new Stude.Stude("hi!");
    int var26 = var25.intervalo();
    Stude.Usuario var27 = var25.getUsuario();
    Stude.Cronograma var28 = var25.getCronograma();
    var25.setNomeUsuario("Metodo de estudo avancado");
    java.util.HashMap var31 = var25.desempenho();
    Stude.MetodoDeEstudo var32 = var25.getMetodoDeEstudo();
    boolean var33 = var16.equals((java.lang.Object)var32);
    var0.addDisciplina(var16);
    Stude.Stude var36 = new Stude.Stude("hi!");
    int var37 = var36.intervalo();
    Stude.Usuario var38 = var36.getUsuario();
    Stude.Cronograma var39 = var36.getCronograma();
    var36.setMetodoAvancado();
    Stude.Cronograma var41 = var36.getCronograma();
    Stude.Cronograma var42 = new Stude.Cronograma();
    int var43 = var42.tamanhoDisciplinas();
    Stude.Disciplina var46 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var47 = var46.getHorasEstudadas();
    double var48 = var46.getHorasEstudadas();
    var42.addDisciplina(var46);
    var46.setCor(15);
    var41.addDisciplina(var46);
    java.lang.String var53 = var46.getNome();
    int var54 = var46.getCor();
    var0.addDisciplina(var46);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var57 = var0.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "Metodo de estudo regular"+ "'", var53.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 15);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test280");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var12 = var1.intervalo();
    Stude.Disciplina var14 = var1.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test281");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Usuario var2 = var1.getUsuario();
    var2.setNome("Metodo de estudo avancado");
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    var2.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test282");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var14 = var1.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test283");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    int var6 = var1.tempoDeEstudo();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test284");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test285");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    java.util.HashMap var8 = var1.desempenho();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test286");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var3 = new Stude.Cronograma();
    java.util.List var4 = var3.getDisciplinas();
    java.util.HashMap var5 = Stude.Desempenho.tempoDeEstudo(var4);
    boolean var6 = var2.equals((java.lang.Object)var5);
    var2.setCor(15);
    var2.setCor(1);
    double var11 = var2.getHorasEstudadas();
    java.lang.String var12 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test287");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test288");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo avancado", 15);
    int var10 = var1.tempoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    Stude.Cronograma var13 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test289");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test290");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var4.setCor((-1));
    int var7 = var4.getCor();
    var4.setNome("Metodo de estudo regular");
    double var10 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    var4.addHorasDeEstudo(3.0d);
    int var14 = var4.getCor();
    var4.addHorasDeEstudo(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test291");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo avancado");
    int var2 = var1.intervalo();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test292");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getIntervalo();
    int var11 = var0.getTempo();
    int var12 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test293");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var14 = var13.toString();
    java.lang.String var15 = var13.toString();
    java.lang.String var16 = var13.toString();
    var9.addDisciplina(var13);
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.setCor((-1));
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var25 = var20.getNome();
    var20.setNome("Metodo de estudo regular");
    var9.addDisciplina(var20);
    Stude.Disciplina var31 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var31.setCor((-1));
    int var34 = var31.getCor();
    var31.addHorasDeEstudo(1.0d);
    java.lang.String var37 = var31.getNome();
    int var38 = var31.getCor();
    var31.addHorasDeEstudo(1.0d);
    var31.addHorasDeEstudo(1.0d);
    var9.addDisciplina(var31);
    Stude.Cronograma var44 = new Stude.Cronograma();
    java.util.List var45 = var44.getDisciplinas();
    Stude.Disciplina var47 = var44.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var49 = var44.getDisciplina("hi!");
    java.util.List var50 = var44.getDisciplinas();
    int var51 = var44.tamanhoDisciplinas();
    Stude.Disciplina var54 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var55 = var54.toString();
    var54.setCor(15);
    var54.setNome("Metodo de estudo regular");
    int var60 = var54.getCor();
    var44.addDisciplina(var54);
    double var62 = var54.getHorasEstudadas();
    java.lang.String var63 = var54.getNome();
    var9.addDisciplina(var54);
    boolean var66 = var9.removeDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo regular"+ "'", var37.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Metodo de estudo avancado"+ "'", var55.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "Metodo de estudo regular"+ "'", var63.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test294");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var11 = var1.getUsuario();
    java.lang.String var12 = var11.getNome();
    java.lang.String var13 = var11.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test295");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.intervalo();
    var1.setMetodoAvancado();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Usuario var6 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test296");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test297");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.getNome();
    Stude.Stude var10 = new Stude.Stude("hi!");
    int var11 = var10.intervalo();
    var10.setNomeUsuario("Metodo de estudo regular");
    var10.setNomeUsuario("Metodo de estudo regular");
    int var16 = var10.tempoDeEstudo();
    Stude.Cronograma var17 = var10.getCronograma();
    boolean var18 = var2.equals((java.lang.Object)var17);
    java.util.List var19 = var17.getDisciplinas();
    java.util.List var20 = var17.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var22 = var17.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test298");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    int var9 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", 100);
    var1.setNomeUsuario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test299");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Usuario var2 = var1.getUsuario();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Usuario var6 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test300");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    int var7 = var1.intervalo();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test301");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    var2.setNome("Metodo de estudo avancado");
    var2.setNome("hi!");
    Stude.Stude var13 = new Stude.Stude("hi!");
    int var14 = var13.intervalo();
    var13.setNomeUsuario("Metodo de estudo regular");
    int var17 = var13.intervalo();
    Stude.Usuario var18 = var13.getUsuario();
    Stude.Disciplina var20 = var13.getDisciplina("Metodo de estudo avancado");
    int var21 = var13.intervalo();
    boolean var22 = var2.equals((java.lang.Object)var21);
    int var23 = var2.getCor();
    var2.setCor(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test302");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    java.util.List var7 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo regular");
    java.util.HashMap var11 = var1.desempenho();
    Stude.Usuario var12 = var1.getUsuario();
    java.util.HashMap var13 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test303");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    int var20 = var17.getCor();
    var17.addHorasDeEstudo(1.0d);
    java.lang.String var23 = var17.getNome();
    Stude.Disciplina var26 = new Stude.Disciplina("hi!", 30);
    boolean var27 = var17.equals((java.lang.Object)var26);
    java.lang.String var28 = var26.getNome();
    var7.addDisciplina(var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var26.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test304");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    var2.addHorasDeEstudo(10.0d);
    var2.setNome("Metodo de estudo regular");
    Stude.Stude var10 = new Stude.Stude("hi!");
    int var11 = var10.intervalo();
    Stude.Usuario var12 = var10.getUsuario();
    var10.addDisciplina("hi!", 0);
    java.util.HashMap var16 = var10.desempenho();
    Stude.MetodoDeEstudo var17 = var10.getMetodoDeEstudo();
    boolean var18 = var2.equals((java.lang.Object)var10);
    Stude.Cronograma var19 = var10.getCronograma();
    Stude.MetodoDeEstudo var20 = var10.getMetodoDeEstudo();
    Stude.Cronograma var21 = var10.getCronograma();
    Stude.Stude var23 = new Stude.Stude("hi!");
    int var24 = var23.intervalo();
    Stude.MetodoDeEstudo var25 = var23.getMetodoDeEstudo();
    var23.addDisciplina("hi!", 2);
    Stude.Disciplina var30 = var23.getDisciplina("hi!");
    var21.addDisciplina(var30);
    java.lang.String var32 = var30.getNome();
    java.lang.String var33 = var30.toString();
    double var34 = var30.getHorasEstudadas();
    java.lang.String var35 = var30.getNome();
    var30.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test305");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addHorasDeEstudo(10.0d);
    java.lang.String var10 = var7.toString();
    java.lang.String var11 = var7.getNome();
    java.lang.String var12 = var7.getNome();
    var4.addDisciplina(var7);
    Stude.Stude var15 = new Stude.Stude("hi!");
    var15.addDisciplina("hi!", 0);
    Stude.Disciplina var20 = var15.getDisciplina("Metodo de estudo regular");
    var15.setMetodoRegular();
    var15.setMetodoAvancado();
    boolean var23 = var7.equals((java.lang.Object)var15);
    var7.setCor(15);
    java.lang.String var26 = var7.toString();
    Stude.Disciplina var29 = new Stude.Disciplina("hi!", 5);
    double var30 = var29.getHorasEstudadas();
    var29.addHorasDeEstudo(10.0d);
    java.lang.String var33 = var29.toString();
    boolean var34 = var7.equals((java.lang.Object)var29);
    double var35 = var7.getHorasEstudadas();
    var7.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 10.0d);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test306");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getDisciplinas();
    Stude.Disciplina var16 = var7.getDisciplina("");
    Stude.Cronograma var17 = new Stude.Cronograma();
    java.util.List var18 = var17.getDisciplinas();
    Stude.Disciplina var20 = var17.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var22 = var17.getDisciplina("hi!");
    java.util.List var23 = var17.getDisciplinas();
    Stude.Disciplina var26 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var26.setCor((-1));
    int var29 = var26.getCor();
    var26.addHorasDeEstudo(1.0d);
    java.lang.String var32 = var26.getNome();
    var17.addDisciplina(var26);
    var7.addDisciplina(var26);
    Stude.Disciplina var36 = var7.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo regular"+ "'", var32.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test307");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var17 = var16.toString();
    Stude.Stude var19 = new Stude.Stude("hi!");
    var19.setMetodoAvancado();
    Stude.MetodoDeEstudo var21 = var19.getMetodoDeEstudo();
    java.util.HashMap var22 = var19.desempenho();
    var19.setMetodoRegular();
    Stude.MetodoDeEstudo var24 = var19.getMetodoDeEstudo();
    var19.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var27 = var19.desempenho();
    boolean var28 = var16.equals((java.lang.Object)var27);
    var7.addDisciplina(var16);
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var7.addDisciplina(var32);
    int var34 = var32.getCor();
    Stude.Disciplina var37 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var38 = var37.toString();
    java.lang.String var39 = var37.toString();
    java.lang.String var40 = var37.toString();
    var37.setNome("hi!");
    int var43 = var37.getCor();
    boolean var44 = var32.equals((java.lang.Object)var37);
    int var45 = var32.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo avancado"+ "'", var38.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo avancado"+ "'", var39.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo avancado"+ "'", var40.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 100);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test308");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Usuario var10 = var1.getUsuario();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("hi!");
    java.util.HashMap var14 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test309");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    var1.addDisciplina("Metodo de estudo avancado", 5);
    int var9 = var1.intervalo();
    var1.setMetodoRegular();
    Stude.Usuario var11 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test310");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    int var9 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    var2.addHorasDeEstudo(1.0d);
    int var14 = var2.getCor();
    java.lang.String var15 = var2.getNome();
    var2.setCor((-1));
    java.lang.String var18 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test311");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Usuario var7 = var1.getUsuario();
    java.util.HashMap var8 = var1.desempenho();
    Stude.Cronograma var9 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test312");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test313");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    int var9 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    int var11 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test314");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    int var6 = var1.tempoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.Disciplina var10 = var1.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test315");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var13 = var1.getDisciplina("hi!");
    int var14 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var15 = var1.getMetodoDeEstudo();
    Stude.Usuario var16 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test316");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var5.getMetodoDeEstudo();
    var5.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var13 = var5.getCronograma();
    Stude.Disciplina var15 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var16 = var5.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getNome();
    int var25 = var20.getCor();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    Stude.Disciplina var30 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var31 = var30.toString();
    java.lang.String var32 = var30.toString();
    java.lang.String var33 = var30.toString();
    var30.addHorasDeEstudo(10.0d);
    var0.addDisciplina(var30);
    Stude.Disciplina var38 = var0.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo avancado"+ "'", var32.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo avancado"+ "'", var33.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test317");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getIntervalo();
    int var13 = var0.getIntervalo();
    int var14 = var0.getTempo();
    int var15 = var0.getTempo();
    int var16 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test318");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.addDisciplina("hi!", 1);
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test319");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    boolean var8 = var2.equals((java.lang.Object)(byte)100);
    var2.setCor(100);
    int var11 = var2.getCor();
    int var12 = var2.getCor();
    var2.setNome("Metodo de estudo avancado");
    var2.setNome("Metodo de estudo regular");
    java.lang.String var17 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test320");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var14 = var1.getCronograma();
    Stude.MetodoDeEstudo var15 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var16 = var1.getMetodoDeEstudo();
    int var17 = var1.intervalo();
    var1.addDisciplina("Metodo de estudo regular", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test321");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test322");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var11.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    var16.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var24 = var16.getCronograma();
    Stude.Disciplina var26 = var16.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var27 = var16.getCronograma();
    Stude.Cronograma var28 = var16.getCronograma();
    java.util.List var29 = var28.getDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.setCor((-1));
    var32.addHorasDeEstudo(10.0d);
    Stude.Cronograma var37 = new Stude.Cronograma();
    java.util.List var38 = var37.getDisciplinas();
    Stude.Disciplina var40 = var37.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var42 = var37.getDisciplina("hi!");
    Stude.Disciplina var44 = var37.getDisciplina("");
    java.util.List var45 = var37.getDisciplinas();
    java.util.HashMap var46 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var47 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var45);
    boolean var50 = var32.equals((java.lang.Object)var49);
    var28.addDisciplina(var32);
    boolean var52 = var11.equals((java.lang.Object)var28);
    int var53 = var28.tamanhoDisciplinas();
    int var54 = var28.tamanhoDisciplinas();
    int var55 = var28.tamanhoDisciplinas();
    Stude.Disciplina var57 = var28.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test323");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    java.util.List var14 = var0.getDisciplinas();
    int var15 = var0.tamanhoDisciplinas();
    int var16 = var0.tamanhoDisciplinas();
    boolean var18 = var0.removeDisciplina("Metodo de estudo avancado");
    java.util.List var19 = var0.getDisciplinas();
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var23 = new Stude.Cronograma();
    java.util.List var24 = var23.getDisciplinas();
    java.util.HashMap var25 = Stude.Desempenho.tempoDeEstudo(var24);
    boolean var26 = var22.equals((java.lang.Object)var25);
    var22.setCor(15);
    var22.setCor(1);
    double var31 = var22.getHorasEstudadas();
    var0.addDisciplina(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test324");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.List var10 = var9.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test325");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    java.util.List var18 = var0.getDisciplinas();
    boolean var20 = var0.removeDisciplina("Metodo de estudo regular");
    Stude.Disciplina var22 = var0.getDisciplina("hi!");
    Stude.Disciplina var24 = var0.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test326");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var11.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    var16.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var24 = var16.getCronograma();
    Stude.Disciplina var26 = var16.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var27 = var16.getCronograma();
    Stude.Cronograma var28 = var16.getCronograma();
    java.util.List var29 = var28.getDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.setCor((-1));
    var32.addHorasDeEstudo(10.0d);
    Stude.Cronograma var37 = new Stude.Cronograma();
    java.util.List var38 = var37.getDisciplinas();
    Stude.Disciplina var40 = var37.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var42 = var37.getDisciplina("hi!");
    Stude.Disciplina var44 = var37.getDisciplina("");
    java.util.List var45 = var37.getDisciplinas();
    java.util.HashMap var46 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var47 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var45);
    boolean var50 = var32.equals((java.lang.Object)var49);
    var28.addDisciplina(var32);
    boolean var52 = var11.equals((java.lang.Object)var28);
    int var53 = var28.tamanhoDisciplinas();
    int var54 = var28.tamanhoDisciplinas();
    Stude.Disciplina var57 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var58 = var57.getHorasEstudadas();
    var57.setNome("hi!");
    var57.setNome("hi!");
    var57.setCor((-1));
    double var65 = var57.getHorasEstudadas();
    int var66 = var57.getCor();
    var28.addDisciplina(var57);
    java.util.List var68 = var28.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test327");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    double var7 = var2.getHorasEstudadas();
    var2.setCor(15);
    var2.setNome("hi!");
    var2.setNome("Metodo de estudo avancado");
    java.lang.String var14 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test328");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var5.getMetodoDeEstudo();
    var5.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var13 = var5.getCronograma();
    Stude.Disciplina var15 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var16 = var5.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getNome();
    int var25 = var20.getCor();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    var20.setCor(30);
    Stude.Avancado var30 = new Stude.Avancado();
    java.lang.String var31 = var30.toString();
    java.lang.String var32 = var30.toString();
    int var33 = var30.getIntervalo();
    int var34 = var30.getTempo();
    int var35 = var30.getTempo();
    int var36 = var30.getTempo();
    int var37 = var30.getTempo();
    java.lang.String var38 = var30.toString();
    boolean var39 = var20.equals((java.lang.Object)var30);
    int var40 = var30.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo avancado"+ "'", var32.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo avancado"+ "'", var38.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 30);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test329");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.tempoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = new Stude.Cronograma();
    Stude.Disciplina var12 = var10.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var14 = var10.getDisciplina("");
    Stude.Cronograma var15 = new Stude.Cronograma();
    java.util.List var16 = var15.getDisciplinas();
    Stude.Disciplina var18 = var15.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var20 = var15.getDisciplina("hi!");
    Stude.Disciplina var23 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var15.addDisciplina(var23);
    var23.addHorasDeEstudo(1.0d);
    var10.addDisciplina(var23);
    var23.setNome("hi!");
    var23.setCor(10);
    var23.setNome("Metodo de estudo regular");
    var23.addHorasDeEstudo(20.0d);
    var23.setNome("Metodo de estudo regular");
    var9.addDisciplina(var23);
    var23.setCor(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test330");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    int var13 = var12.tamanhoDisciplinas();
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var16.addHorasDeEstudo(10.0d);
    java.lang.String var19 = var16.toString();
    java.lang.String var20 = var16.getNome();
    int var21 = var16.getCor();
    var12.addDisciplina(var16);
    Stude.Stude var24 = new Stude.Stude("hi!");
    var24.setMetodoAvancado();
    Stude.MetodoDeEstudo var26 = var24.getMetodoDeEstudo();
    java.util.HashMap var27 = var24.desempenho();
    int var28 = var24.tempoDeEstudo();
    java.util.List var29 = var24.getDisciplinas();
    boolean var30 = var16.equals((java.lang.Object)var29);
    java.lang.String var31 = var16.toString();
    var16.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo regular"+ "'", var31.equals("Metodo de estudo regular"));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test331");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Usuario var10 = var1.getUsuario();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("hi!");
    Stude.Cronograma var14 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test332");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    java.lang.String var13 = var2.getNome();
    var2.addHorasDeEstudo(100.0d);
    Stude.Disciplina var18 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var19 = var18.toString();
    java.lang.String var20 = var18.getNome();
    double var21 = var18.getHorasEstudadas();
    double var22 = var18.getHorasEstudadas();
    boolean var23 = var2.equals((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo avancado"+ "'", var20.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test333");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getIntervalo();
    int var10 = var0.getTempo();
    int var11 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test334");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    int var9 = var1.tempoDeEstudo();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    int var12 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test335");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    int var12 = var1.intervalo();
    Stude.Disciplina var14 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    java.util.HashMap var16 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test336");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    int var5 = var1.tempoDeEstudo();
    java.util.List var6 = var1.getDisciplinas();
    Stude.Usuario var7 = var1.getUsuario();
    int var8 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test337");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test338");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test339");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    int var15 = var13.getCor();
    var0.addDisciplina(var13);
    int var17 = var13.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test340");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.List var11 = var1.getDisciplinas();
    java.util.HashMap var12 = var1.desempenho();
    int var13 = var1.tempoDeEstudo();
    int var14 = var1.intervalo();
    Stude.Usuario var15 = var1.getUsuario();
    var15.setNome("Metodo de estudo avancado");
    java.lang.String var18 = var15.getNome();
    java.lang.String var19 = var15.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test341");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
    Stude.Usuario var10 = var1.getUsuario();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test342");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    var2.setNome("hi!");
    int var8 = var2.getCor();
    java.lang.String var9 = var2.toString();
    Stude.Disciplina var12 = new Stude.Disciplina("hi!", 30);
    var12.setCor(2);
    Stude.Stude var16 = new Stude.Stude("hi!");
    int var17 = var16.intervalo();
    Stude.Usuario var18 = var16.getUsuario();
    Stude.Cronograma var19 = var16.getCronograma();
    var16.setMetodoAvancado();
    Stude.Cronograma var21 = var16.getCronograma();
    java.util.List var22 = var21.getDisciplinas();
    boolean var23 = var12.equals((java.lang.Object)var22);
    boolean var24 = var2.equals((java.lang.Object)var12);
    var12.addHorasDeEstudo(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test343");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var8 = var1.getDisciplinas();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    Stude.Disciplina var13 = var1.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test344");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    boolean var8 = var2.equals((java.lang.Object)(byte)100);
    var2.setCor(100);
    int var11 = var2.getCor();
    int var12 = var2.getCor();
    java.lang.String var13 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test345");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    Stude.Cronograma var14 = new Stude.Cronograma();
    java.util.List var15 = var14.getDisciplinas();
    Stude.Disciplina var17 = var14.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var19 = var14.getDisciplina("hi!");
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var14.addDisciplina(var22);
    Stude.Disciplina var26 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var14.addDisciplina(var26);
    Stude.Disciplina var30 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var31 = var30.toString();
    var30.setCor(15);
    var30.setCor(10);
    var14.addDisciplina(var30);
    java.lang.String var37 = var30.getNome();
    java.lang.String var38 = var30.toString();
    java.lang.String var39 = var30.toString();
    var0.addDisciplina(var30);
    java.lang.String var41 = var30.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo avancado"+ "'", var37.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo avancado"+ "'", var38.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo avancado"+ "'", var39.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo avancado"+ "'", var41.equals("Metodo de estudo avancado"));

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test346");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var14 = var13.toString();
    java.lang.String var15 = var13.toString();
    java.lang.String var16 = var13.toString();
    var9.addDisciplina(var13);
    double var18 = var13.getHorasEstudadas();
    java.lang.String var19 = var13.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test347");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var7 = var0.getDisciplina("");
    Stude.Disciplina var9 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var10 = var0.getDisciplinas();
    int var11 = var0.tamanhoDisciplinas();
    int var12 = var0.tamanhoDisciplinas();
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var15.setCor((-1));
    java.lang.String var18 = var15.getNome();
    var15.setCor((-1));
    Stude.Disciplina var23 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var24 = var23.toString();
    var23.setCor(15);
    java.lang.String var27 = var23.getNome();
    Stude.Cronograma var28 = new Stude.Cronograma();
    Stude.Disciplina var30 = var28.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var32 = var28.getDisciplina("");
    java.util.List var33 = var28.getDisciplinas();
    boolean var34 = var23.equals((java.lang.Object)var28);
    Stude.Disciplina var37 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var38 = var37.toString();
    Stude.Stude var40 = new Stude.Stude("hi!");
    var40.setMetodoAvancado();
    Stude.MetodoDeEstudo var42 = var40.getMetodoDeEstudo();
    java.util.HashMap var43 = var40.desempenho();
    var40.setMetodoRegular();
    Stude.MetodoDeEstudo var45 = var40.getMetodoDeEstudo();
    var40.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var48 = var40.desempenho();
    boolean var49 = var37.equals((java.lang.Object)var48);
    var28.addDisciplina(var37);
    boolean var51 = var15.equals((java.lang.Object)var28);
    Stude.Avancado var52 = new Stude.Avancado();
    java.lang.String var53 = var52.toString();
    java.lang.String var54 = var52.toString();
    int var55 = var52.getIntervalo();
    int var56 = var52.getIntervalo();
    boolean var57 = var15.equals((java.lang.Object)var56);
    var15.setNome("hi!");
    Stude.Disciplina var62 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var63 = var62.toString();
    var62.setCor(15);
    java.lang.String var66 = var62.getNome();
    Stude.Cronograma var67 = new Stude.Cronograma();
    Stude.Disciplina var69 = var67.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var71 = var67.getDisciplina("");
    java.util.List var72 = var67.getDisciplinas();
    boolean var73 = var62.equals((java.lang.Object)var67);
    java.util.List var74 = var67.getDisciplinas();
    java.util.HashMap var75 = Stude.Desempenho.tempoDeEstudo(var74);
    boolean var76 = var15.equals((java.lang.Object)var75);
    var15.setCor(4);
    var0.addDisciplina(var15);
    var15.setCor(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo avancado"+ "'", var24.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo avancado"+ "'", var38.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "Metodo de estudo avancado"+ "'", var53.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "Metodo de estudo avancado"+ "'", var54.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "Metodo de estudo avancado"+ "'", var63.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "Metodo de estudo avancado"+ "'", var66.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test348");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    var2.setCor(2);
    var2.setNome("Metodo de estudo regular");
    double var11 = var2.getHorasEstudadas();
    double var12 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10.0d);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test349");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test350");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.Disciplina var9 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    var6.addDisciplina(var9);
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var13.setCor((-1));
    var13.addHorasDeEstudo(10.0d);
    java.lang.String var18 = var13.getNome();
    int var19 = var13.getCor();
    var6.addDisciplina(var13);
    Stude.Disciplina var23 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var23.setCor((-1));
    java.lang.String var26 = var23.getNome();
    java.lang.String var27 = var23.getNome();
    int var28 = var23.getCor();
    double var29 = var23.getHorasEstudadas();
    var23.addHorasDeEstudo(20.0d);
    var6.addDisciplina(var23);
    var23.setCor(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo regular"+ "'", var27.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test351");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.addDisciplina("hi!", 2);
    int var7 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test352");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setNomeUsuario("hi!");
    int var13 = var1.intervalo();
    Stude.MetodoDeEstudo var14 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test353");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    int var12 = var1.tempoDeEstudo();
    int var13 = var1.intervalo();
    Stude.Usuario var14 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Disciplina var18 = var1.getDisciplina("hi!");
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test354");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    Stude.Disciplina var18 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var20 = var0.getDisciplina("hi!");
    Stude.Disciplina var22 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var27 = new Stude.Disciplina("hi!", 15);
    var27.setCor(15);
    var27.setNome("Metodo de estudo avancado");
    var0.addDisciplina(var27);
    Stude.Disciplina var34 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var36 = new Stude.Stude("hi!");
    var36.setMetodoAvancado();
    Stude.MetodoDeEstudo var38 = var36.getMetodoDeEstudo();
    var36.setMetodoAvancado();
    var36.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var44 = var36.getDisciplina("Metodo de estudo regular");
    var44.setCor(100);
    Stude.Cronograma var47 = new Stude.Cronograma();
    java.util.List var48 = var47.getDisciplinas();
    Stude.Disciplina var50 = var47.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var52 = var47.getDisciplina("hi!");
    Stude.Disciplina var54 = var47.getDisciplina("");
    boolean var55 = var44.equals((java.lang.Object)"");
    double var56 = var44.getHorasEstudadas();
    var44.setNome("Metodo de estudo regular");
    java.lang.String var59 = var44.getNome();
    var0.addDisciplina(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "Metodo de estudo regular"+ "'", var59.equals("Metodo de estudo regular"));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test355");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    int var10 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test356");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.List var11 = var1.getDisciplinas();
    java.util.HashMap var12 = Stude.Desempenho.tempoDeEstudo(var11);
    java.util.HashMap var13 = Stude.Desempenho.tempoDeEstudo(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test357");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var5 = var1.intervalo();
    java.util.List var6 = var1.getDisciplinas();
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    int var9 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test358");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.List var11 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    int var13 = var1.intervalo();
    var1.setMetodoRegular();
    java.util.List var15 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test359");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var15 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Usuario var16 = var1.getUsuario();
    var1.setMetodoAvancado();
    java.util.List var18 = var1.getDisciplinas();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test360");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    java.util.HashMap var11 = var1.desempenho();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var15 = var1.getDisciplina("");
    var1.setNomeUsuario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test361");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 10);
    int var8 = var7.getCor();
    var0.addDisciplina(var7);
    java.util.List var10 = var0.getDisciplinas();
    Stude.Stude var12 = new Stude.Stude("hi!");
    var12.setMetodoAvancado();
    Stude.MetodoDeEstudo var14 = var12.getMetodoDeEstudo();
    java.util.HashMap var15 = var12.desempenho();
    var12.setMetodoRegular();
    java.util.List var17 = var12.getDisciplinas();
    var12.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var22 = var12.getDisciplina("Metodo de estudo regular");
    double var23 = var22.getHorasEstudadas();
    var0.addDisciplina(var22);
    boolean var26 = var0.removeDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test362");


    Stude.Stude var1 = new Stude.Stude("hi!");
    java.util.HashMap var2 = var1.desempenho();
    int var3 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var4 = var1.getMetodoDeEstudo();
    Stude.Disciplina var6 = var1.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test363");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    int var10 = var1.intervalo();
    Stude.Usuario var11 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test364");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Usuario var13 = var1.getUsuario();
    Stude.Cronograma var14 = var1.getCronograma();
    Stude.Cronograma var15 = new Stude.Cronograma();
    java.util.List var16 = var15.getDisciplinas();
    Stude.Disciplina var18 = var15.getDisciplina("Metodo de estudo regular");
    Stude.Stude var20 = new Stude.Stude("hi!");
    var20.setMetodoAvancado();
    Stude.MetodoDeEstudo var22 = var20.getMetodoDeEstudo();
    java.util.HashMap var23 = var20.desempenho();
    var20.setMetodoRegular();
    Stude.MetodoDeEstudo var25 = var20.getMetodoDeEstudo();
    var20.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var28 = var20.getCronograma();
    Stude.Disciplina var30 = var20.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var31 = var20.getCronograma();
    int var32 = var31.tamanhoDisciplinas();
    Stude.Disciplina var35 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var35.addHorasDeEstudo(10.0d);
    java.lang.String var38 = var35.toString();
    java.lang.String var39 = var35.getNome();
    int var40 = var35.getCor();
    var31.addDisciplina(var35);
    var15.addDisciplina(var35);
    Stude.Disciplina var45 = new Stude.Disciplina("hi!", 5);
    double var46 = var45.getHorasEstudadas();
    var45.addHorasDeEstudo(10.0d);
    java.lang.String var49 = var45.toString();
    java.lang.String var50 = var45.toString();
    java.lang.String var51 = var45.getNome();
    var15.addDisciplina(var45);
    Stude.Disciplina var55 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var56 = var55.getHorasEstudadas();
    int var57 = var55.getCor();
    var15.addDisciplina(var55);
    var14.addDisciplina(var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var61 = var14.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo regular"+ "'", var38.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo regular"+ "'", var39.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 5);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test365");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    java.util.HashMap var8 = var1.desempenho();
    int var9 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    Stude.Cronograma var11 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test366");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test367");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Usuario var13 = var1.getUsuario();
    Stude.Cronograma var14 = var1.getCronograma();
    java.util.List var15 = var14.getDisciplinas();
    Stude.Cronograma var16 = new Stude.Cronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var21 = var20.getHorasEstudadas();
    double var22 = var20.getHorasEstudadas();
    var16.addDisciplina(var20);
    var20.setCor(15);
    int var26 = var20.getCor();
    var14.addDisciplina(var20);
    Stude.Stude var29 = new Stude.Stude("hi!");
    Stude.Cronograma var30 = var29.getCronograma();
    Stude.Cronograma var31 = var29.getCronograma();
    Stude.Cronograma var32 = var29.getCronograma();
    Stude.Disciplina var35 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var35.setCor((-1));
    var35.addHorasDeEstudo(10.0d);
    java.lang.String var40 = var35.getNome();
    var35.setNome("Metodo de estudo regular");
    var32.addDisciplina(var35);
    java.lang.String var44 = var35.toString();
    java.lang.String var45 = var35.getNome();
    var35.setCor(15);
    boolean var48 = var20.equals((java.lang.Object)var35);
    Stude.Stude var50 = new Stude.Stude("hi!");
    Stude.Cronograma var51 = var50.getCronograma();
    Stude.Cronograma var52 = var50.getCronograma();
    Stude.Disciplina var54 = var52.getDisciplina("");
    Stude.Disciplina var56 = var52.getDisciplina("Metodo de estudo regular");
    java.util.List var57 = var52.getDisciplinas();
    java.util.HashMap var58 = Stude.Desempenho.tempoDeEstudo(var57);
    boolean var59 = var20.equals((java.lang.Object)var57);
    java.util.HashMap var60 = Stude.Desempenho.tempoDeEstudo(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo regular"+ "'", var40.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo regular"+ "'", var44.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Metodo de estudo regular"+ "'", var45.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test368");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    Stude.Disciplina var7 = var1.getDisciplina("");
    Stude.Disciplina var9 = var1.getDisciplina("");
    var1.setMetodoAvancado();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    java.util.List var13 = var12.getDisciplinas();
    java.util.List var14 = var12.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test369");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.addDisciplina("hi!", 2);
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", (-1));
    Stude.Cronograma var11 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test370");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.util.List var14 = var7.getDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    int var20 = var17.getCor();
    var17.addHorasDeEstudo(1.0d);
    java.lang.String var23 = var17.getNome();
    Stude.Disciplina var26 = new Stude.Disciplina("hi!", 30);
    boolean var27 = var17.equals((java.lang.Object)var26);
    java.lang.String var28 = var26.getNome();
    var7.addDisciplina(var26);
    int var30 = var7.tamanhoDisciplinas();
    int var31 = var7.tamanhoDisciplinas();
    Stude.Disciplina var34 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var34.setCor((-1));
    var34.addHorasDeEstudo(10.0d);
    Stude.Cronograma var39 = new Stude.Cronograma();
    java.util.List var40 = var39.getDisciplinas();
    Stude.Disciplina var42 = var39.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var44 = var39.getDisciplina("hi!");
    Stude.Disciplina var46 = var39.getDisciplina("");
    java.util.List var47 = var39.getDisciplinas();
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var50 = Stude.Desempenho.tempoDeEstudo(var47);
    java.util.HashMap var51 = Stude.Desempenho.tempoDeEstudo(var47);
    boolean var52 = var34.equals((java.lang.Object)var51);
    var34.setNome("Metodo de estudo regular");
    java.lang.String var55 = var34.toString();
    var7.addDisciplina(var34);
    Stude.Disciplina var59 = new Stude.Disciplina("hi!", 5);
    double var60 = var59.getHorasEstudadas();
    var59.addHorasDeEstudo(10.0d);
    double var63 = var59.getHorasEstudadas();
    var59.setCor(3);
    java.lang.String var66 = var59.getNome();
    java.lang.String var67 = var59.getNome();
    java.lang.String var68 = var59.toString();
    var7.addDisciplina(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Metodo de estudo regular"+ "'", var55.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi!"+ "'", var66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test371");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    int var6 = var1.intervalo();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Usuario var8 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test372");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(2);
    var2.setCor(10);
    java.lang.String var7 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test373");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.intervalo();
    java.util.HashMap var7 = var1.desempenho();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var12.addDisciplina(var20);
    Stude.Disciplina var24 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var12.addDisciplina(var24);
    int var26 = var12.tamanhoDisciplinas();
    Stude.Disciplina var29 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var30 = var29.toString();
    var29.setCor(15);
    var29.setNome("Metodo de estudo regular");
    int var35 = var29.getCor();
    var12.addDisciplina(var29);
    Stude.Disciplina var38 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var40 = var12.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var42 = var12.getDisciplina("Metodo de estudo regular");
    var11.addDisciplina(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Metodo de estudo avancado"+ "'", var30.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test374");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    int var10 = var0.getIntervalo();
    int var11 = var0.getTempo();
    int var12 = var0.getTempo();
    int var13 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test375");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    java.lang.String var6 = var2.getNome();
    java.lang.String var7 = var2.toString();
    var2.setCor((-1));
    int var10 = var2.getCor();
    var2.addHorasDeEstudo(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test376");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    int var5 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo regular", 100);
    var1.addDisciplina("hi!", (-1));
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var15.setCor((-1));
    java.lang.String var18 = var15.getNome();
    java.lang.String var19 = var15.getNome();
    int var20 = var15.getCor();
    double var21 = var15.getHorasEstudadas();
    var15.setNome("Metodo de estudo avancado");
    var15.addHorasDeEstudo(3.0d);
    var12.addDisciplina(var15);
    Stude.Disciplina var28 = var12.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test377");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var11 = var1.getCronograma();
    int var12 = var11.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test378");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    int var9 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test379");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var5.getMetodoDeEstudo();
    var5.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var13 = var5.getCronograma();
    Stude.Disciplina var15 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var16 = var5.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getNome();
    int var25 = var20.getCor();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    java.lang.String var28 = var20.toString();
    int var29 = var20.getCor();
    java.lang.String var30 = var20.getNome();
    int var31 = var20.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Metodo de estudo regular"+ "'", var30.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 5);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test380");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var4.setCor((-1));
    int var7 = var4.getCor();
    var4.setNome("Metodo de estudo regular");
    double var10 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    var4.addHorasDeEstudo(3.0d);
    java.lang.String var14 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test381");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("hi!");
    int var8 = var2.getCor();
    Stude.Stude var10 = new Stude.Stude("hi!");
    int var11 = var10.intervalo();
    var10.setNomeUsuario("Metodo de estudo regular");
    int var14 = var10.intervalo();
    Stude.Usuario var15 = var10.getUsuario();
    Stude.Disciplina var17 = var10.getDisciplina("Metodo de estudo avancado");
    boolean var18 = var2.equals((java.lang.Object)var10);
    Stude.Usuario var19 = var10.getUsuario();
    Stude.Usuario var20 = var10.getUsuario();
    java.util.List var21 = var10.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test382");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test383");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("");
    java.util.List var9 = var1.getDisciplinas();
    java.util.List var10 = var1.getDisciplinas();
    Stude.Usuario var11 = var1.getUsuario();
    var11.setNome("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test384");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test385");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var12 = var1.getDisciplina("");
    int var13 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var16 = var1.intervalo();
    Stude.Disciplina var18 = var1.getDisciplina("");
    int var19 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 5);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test386");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    int var6 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test387");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    int var7 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.addDisciplina("hi!", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test388");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addHorasDeEstudo(10.0d);
    java.lang.String var10 = var7.toString();
    java.lang.String var11 = var7.getNome();
    java.lang.String var12 = var7.getNome();
    var4.addDisciplina(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var4.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test389");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    Stude.Disciplina var6 = var1.getDisciplina("hi!");
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test390");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    int var4 = var2.getCor();
    Stude.Stude var6 = new Stude.Stude("hi!");
    var6.setMetodoAvancado();
    Stude.MetodoDeEstudo var8 = var6.getMetodoDeEstudo();
    java.util.HashMap var9 = var6.desempenho();
    Stude.Cronograma var10 = var6.getCronograma();
    Stude.Disciplina var12 = var10.getDisciplina("Metodo de estudo avancado");
    java.util.List var13 = var10.getDisciplinas();
    boolean var14 = var2.equals((java.lang.Object)var10);
    java.lang.String var15 = var2.toString();
    double var16 = var2.getHorasEstudadas();
    double var17 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test391");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    java.util.List var9 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test392");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    int var14 = var0.tamanhoDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var18 = var17.toString();
    var17.setCor(15);
    var17.setNome("Metodo de estudo regular");
    int var23 = var17.getCor();
    var0.addDisciplina(var17);
    double var25 = var17.getHorasEstudadas();
    java.lang.String var26 = var17.toString();
    int var27 = var17.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 15);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test393");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    java.lang.String var8 = var7.getNome();
    java.lang.String var9 = var7.getNome();
    java.lang.String var10 = var7.getNome();
    java.lang.String var11 = var7.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test394");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var16 = var15.toString();
    var15.setCor(15);
    java.lang.String var19 = var15.getNome();
    boolean var21 = var15.equals((java.lang.Object)(byte)100);
    java.lang.String var22 = var15.toString();
    var12.addDisciplina(var15);
    Stude.Disciplina var26 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var26.addHorasDeEstudo(10.0d);
    java.lang.String var29 = var26.toString();
    var12.addDisciplina(var26);
    java.lang.String var31 = var26.getNome();
    var26.addHorasDeEstudo(100.0d);
    int var34 = var26.getCor();
    var26.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo regular"+ "'", var31.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 5);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test395");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    int var15 = var13.getCor();
    var0.addDisciplina(var13);
    java.lang.String var17 = var13.getNome();
    var13.setCor(100);
    var13.setCor(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test396");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Usuario var13 = var1.getUsuario();
    int var14 = var1.tempoDeEstudo();
    java.util.HashMap var15 = var1.desempenho();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.MetodoDeEstudo var18 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test397");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    java.util.List var8 = var0.getDisciplinas();
    Stude.Disciplina var10 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var13.setCor((-1));
    int var16 = var13.getCor();
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    java.lang.String var20 = var13.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test398");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    int var8 = var1.tempoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    var9.setNome("Metodo de estudo avancado");
    var9.setNome("Metodo de estudo regular");
    java.lang.String var14 = var9.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test399");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var10 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    java.util.List var12 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test400");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    int var12 = var1.tempoDeEstudo();
    int var13 = var1.intervalo();
    Stude.Disciplina var15 = var1.getDisciplina("Metodo de estudo regular");
    int var16 = var1.tempoDeEstudo();
    java.util.List var17 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test401");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var5.getMetodoDeEstudo();
    var5.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var13 = var5.getCronograma();
    Stude.Disciplina var15 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var16 = var5.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getNome();
    int var25 = var20.getCor();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    Stude.Disciplina var30 = new Stude.Disciplina("hi!", 5);
    double var31 = var30.getHorasEstudadas();
    var30.addHorasDeEstudo(10.0d);
    java.lang.String var34 = var30.toString();
    java.lang.String var35 = var30.toString();
    java.lang.String var36 = var30.getNome();
    var0.addDisciplina(var30);
    Stude.Disciplina var40 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var41 = var40.getHorasEstudadas();
    int var42 = var40.getCor();
    var0.addDisciplina(var40);
    int var44 = var40.getCor();
    var40.setCor(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 5);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test402");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var10 = var1.getCronograma();
    int var11 = var1.tempoDeEstudo();
    java.util.List var12 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var13 = var1.getMetodoDeEstudo();
    java.util.HashMap var14 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test403");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    Stude.Usuario var7 = var1.getUsuario();
    var7.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test404");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    Stude.Cronograma var10 = var1.getCronograma();
    int var11 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test405");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var4 = var0.getDisciplinas();
    int var5 = var0.tamanhoDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    Stude.Disciplina var9 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    java.lang.String var12 = var9.toString();
    var0.addDisciplina(var9);
    int var14 = var9.getCor();
    double var15 = var9.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test406");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    boolean var8 = var2.equals((java.lang.Object)(byte)100);
    int var9 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test407");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getTempo();
    int var13 = var0.getIntervalo();
    int var14 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 30);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test408");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", (-1));
    Stude.Disciplina var16 = var1.getDisciplina("");
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.List var20 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test409");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    var2.addHorasDeEstudo(10.0d);
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var14 = var7.getDisciplina("");
    java.util.List var15 = var7.getDisciplinas();
    java.util.HashMap var16 = Stude.Desempenho.tempoDeEstudo(var15);
    java.util.HashMap var17 = Stude.Desempenho.tempoDeEstudo(var15);
    java.util.HashMap var18 = Stude.Desempenho.tempoDeEstudo(var15);
    java.util.HashMap var19 = Stude.Desempenho.tempoDeEstudo(var15);
    boolean var20 = var2.equals((java.lang.Object)var19);
    var2.setNome("Metodo de estudo regular");
    java.lang.String var23 = var2.toString();
    java.lang.String var24 = var2.toString();
    java.lang.String var25 = var2.toString();
    int var26 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test410");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    Stude.Cronograma var9 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test411");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test412");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    var1.setNomeUsuario("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test413");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    Stude.Disciplina var10 = var1.getDisciplina("hi!");
    java.util.HashMap var11 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    int var14 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test414");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    int var9 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test415");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test416");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var9 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var0.getDisciplina("hi!");
    Stude.Disciplina var13 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var15 = var0.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test417");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test418");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("hi!");
    java.util.List var12 = var1.getDisciplinas();
    int var13 = var1.tempoDeEstudo();
    Stude.Disciplina var15 = var1.getDisciplina("Metodo de estudo regular");
    java.util.List var16 = var1.getDisciplinas();
    Stude.Cronograma var17 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test419");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    int var9 = var1.tempoDeEstudo();
    java.util.HashMap var10 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test420");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Usuario var10 = var1.getUsuario();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("hi!");
    java.util.HashMap var14 = var1.desempenho();
    java.util.List var15 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test421");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    int var6 = var0.tamanhoDisciplinas();
    java.util.List var7 = var0.getDisciplinas();
    int var8 = var0.tamanhoDisciplinas();
    int var9 = var0.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test422");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    java.util.List var8 = var0.getDisciplinas();
    java.util.List var9 = var0.getDisciplinas();
    java.util.List var10 = var0.getDisciplinas();
    Stude.Disciplina var12 = var0.getDisciplina("hi!");
    int var13 = var0.tamanhoDisciplinas();
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var16.setCor((-1));
    java.lang.String var19 = var16.getNome();
    java.lang.String var20 = var16.getNome();
    int var21 = var16.getCor();
    var16.setNome("Metodo de estudo avancado");
    var16.setCor(1);
    java.lang.String var26 = var16.getNome();
    var0.addDisciplina(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test423");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    int var2 = var0.tamanhoDisciplinas();
    int var3 = var0.tamanhoDisciplinas();
    Stude.Disciplina var5 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    java.util.HashMap var10 = var7.desempenho();
    var7.setMetodoRegular();
    Stude.MetodoDeEstudo var12 = var7.getMetodoDeEstudo();
    var7.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var15 = var7.getCronograma();
    java.util.List var16 = var7.getDisciplinas();
    var7.addDisciplina("hi!", (-1));
    Stude.Disciplina var21 = var7.getDisciplina("hi!");
    var21.setCor(2);
    java.lang.String var24 = var21.toString();
    double var25 = var21.getHorasEstudadas();
    var0.addDisciplina(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test424");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    var2.setNome("hi!");
    Stude.Stude var7 = new Stude.Stude("hi!");
    int var8 = var7.intervalo();
    Stude.Usuario var9 = var7.getUsuario();
    Stude.Cronograma var10 = var7.getCronograma();
    var7.setMetodoAvancado();
    Stude.Cronograma var12 = var7.getCronograma();
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    var12.addDisciplina(var15);
    var15.setNome("hi!");
    boolean var19 = var2.equals((java.lang.Object)"hi!");
    var2.addHorasDeEstudo(1.0d);
    Stude.Disciplina var24 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var25 = var24.toString();
    java.lang.String var26 = var24.toString();
    java.lang.String var27 = var24.toString();
    var24.setNome("hi!");
    Stude.Stude var31 = new Stude.Stude("hi!");
    int var32 = var31.intervalo();
    Stude.Usuario var33 = var31.getUsuario();
    var31.setMetodoRegular();
    var31.setNomeUsuario("Metodo de estudo regular");
    boolean var37 = var24.equals((java.lang.Object)var31);
    boolean var38 = var2.equals((java.lang.Object)var37);
    var2.addHorasDeEstudo(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo avancado"+ "'", var25.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test425");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.Disciplina var14 = var1.getDisciplina("Metodo de estudo avancado");
    java.util.List var15 = var1.getDisciplinas();
    Stude.Usuario var16 = var1.getUsuario();
    java.util.HashMap var17 = var1.desempenho();
    Stude.Usuario var18 = var1.getUsuario();
    java.lang.String var19 = var18.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test426");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    double var9 = var2.getHorasEstudadas();
    var2.setCor(3);
    Stude.Stude var13 = new Stude.Stude("hi!");
    int var14 = var13.intervalo();
    Stude.Usuario var15 = var13.getUsuario();
    var13.setMetodoRegular();
    var13.setMetodoRegular();
    Stude.Usuario var18 = var13.getUsuario();
    boolean var19 = var2.equals((java.lang.Object)var18);
    java.lang.String var20 = var2.toString();
    java.lang.String var21 = var2.toString();
    int var22 = var2.getCor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo regular"+ "'", var21.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 3);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test427");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    Stude.Disciplina var18 = var0.getDisciplina("Metodo de estudo avancado");
    int var19 = var0.tamanhoDisciplinas();
    Stude.Disciplina var21 = var0.getDisciplina("");
    Stude.Disciplina var23 = var0.getDisciplina("");
    java.util.List var24 = var0.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var26 = var0.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test428");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getIntervalo();
    int var11 = var0.getIntervalo();
    int var12 = var0.getTempo();
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test429");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    double var8 = var2.getHorasEstudadas();
    var2.setCor(10);
    java.lang.String var11 = var2.toString();
    Stude.Disciplina var14 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var14.setCor((-1));
    int var17 = var14.getCor();
    var14.addHorasDeEstudo(1.0d);
    java.lang.String var20 = var14.getNome();
    Stude.Disciplina var23 = new Stude.Disciplina("hi!", 30);
    boolean var24 = var14.equals((java.lang.Object)var23);
    var23.setNome("Metodo de estudo regular");
    Stude.Stude var28 = new Stude.Stude("hi!");
    var28.setMetodoAvancado();
    Stude.MetodoDeEstudo var30 = var28.getMetodoDeEstudo();
    java.util.HashMap var31 = var28.desempenho();
    var28.setMetodoRegular();
    Stude.MetodoDeEstudo var33 = var28.getMetodoDeEstudo();
    var28.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var36 = var28.getCronograma();
    Stude.Disciplina var38 = var28.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var39 = var28.getCronograma();
    Stude.Cronograma var40 = var28.getCronograma();
    java.util.List var41 = var40.getDisciplinas();
    Stude.Disciplina var44 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var44.setCor((-1));
    var44.addHorasDeEstudo(10.0d);
    Stude.Cronograma var49 = new Stude.Cronograma();
    java.util.List var50 = var49.getDisciplinas();
    Stude.Disciplina var52 = var49.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var54 = var49.getDisciplina("hi!");
    Stude.Disciplina var56 = var49.getDisciplina("");
    java.util.List var57 = var49.getDisciplinas();
    java.util.HashMap var58 = Stude.Desempenho.tempoDeEstudo(var57);
    java.util.HashMap var59 = Stude.Desempenho.tempoDeEstudo(var57);
    java.util.HashMap var60 = Stude.Desempenho.tempoDeEstudo(var57);
    java.util.HashMap var61 = Stude.Desempenho.tempoDeEstudo(var57);
    boolean var62 = var44.equals((java.lang.Object)var61);
    var40.addDisciplina(var44);
    boolean var64 = var23.equals((java.lang.Object)var40);
    Stude.Cronograma var65 = new Stude.Cronograma();
    java.util.List var66 = var65.getDisciplinas();
    Stude.Disciplina var68 = var65.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var70 = var65.getDisciplina("hi!");
    Stude.Disciplina var73 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var65.addDisciplina(var73);
    Stude.Disciplina var77 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var65.addDisciplina(var77);
    Stude.Disciplina var81 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var82 = var81.toString();
    var81.setCor(15);
    var81.setCor(10);
    var65.addDisciplina(var81);
    int var88 = var81.getCor();
    var40.addDisciplina(var81);
    java.util.List var90 = var40.getDisciplinas();
    boolean var91 = var2.equals((java.lang.Object)var40);
    Stude.Disciplina var93 = var40.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "Metodo de estudo avancado"+ "'", var82.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var93);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test430");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test431");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Usuario var5 = var1.getUsuario();
    var5.setNome("Metodo de estudo avancado");
    java.lang.String var8 = var5.getNome();
    var5.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test432");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test433");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test434");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var11 = var1.getUsuario();
    java.lang.String var12 = var11.getNome();
    var11.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test435");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    int var9 = var2.getCor();
    var2.setCor(15);
    java.lang.String var12 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test436");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    int var5 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo regular", 15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test437");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    int var3 = var1.intervalo();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    int var6 = var1.intervalo();
    var1.setMetodoRegular();
    java.util.HashMap var8 = var1.desempenho();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test438");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    int var11 = var0.getTempo();
    int var12 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test439");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getIntervalo();
    int var11 = var0.getTempo();
    int var12 = var0.getTempo();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getTempo();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test440");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test441");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 5);
    java.util.HashMap var9 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test442");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("hi!");
    int var8 = var2.getCor();
    double var9 = var2.getHorasEstudadas();
    java.lang.String var10 = var2.toString();
    int var11 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test443");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    Stude.Disciplina var8 = var0.getDisciplina("hi!");
    int var9 = var0.tamanhoDisciplinas();
    Stude.Stude var11 = new Stude.Stude("hi!");
    var11.setMetodoAvancado();
    Stude.MetodoDeEstudo var13 = var11.getMetodoDeEstudo();
    var11.setMetodoAvancado();
    var11.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var19 = var11.getDisciplina("Metodo de estudo regular");
    var19.setCor(100);
    Stude.Cronograma var22 = new Stude.Cronograma();
    java.util.List var23 = var22.getDisciplinas();
    Stude.Disciplina var25 = var22.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var27 = var22.getDisciplina("hi!");
    Stude.Disciplina var29 = var22.getDisciplina("");
    boolean var30 = var19.equals((java.lang.Object)"");
    var0.addDisciplina(var19);
    int var32 = var19.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 100);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test444");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    var2.setNome("hi!");
    Stude.Stude var9 = new Stude.Stude("hi!");
    int var10 = var9.intervalo();
    Stude.Usuario var11 = var9.getUsuario();
    var9.setMetodoRegular();
    var9.setNomeUsuario("Metodo de estudo regular");
    boolean var15 = var2.equals((java.lang.Object)var9);
    int var16 = var2.getCor();
    var2.addHorasDeEstudo(100.0d);
    int var19 = var2.getCor();
    var2.setCor((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test445");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test446");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test447");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.List var14 = var1.getDisciplinas();
    java.util.List var15 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var16 = var1.getMetodoDeEstudo();
    boolean var18 = var1.removeDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var20 = var1.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test448");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var12 = var1.getDisciplina("hi!");
    Stude.Usuario var13 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test449");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    double var7 = var2.getHorasEstudadas();
    Stude.Stude var9 = new Stude.Stude("hi!");
    var9.setMetodoAvancado();
    Stude.MetodoDeEstudo var11 = var9.getMetodoDeEstudo();
    java.util.HashMap var12 = var9.desempenho();
    var9.setMetodoRegular();
    java.util.List var14 = var9.getDisciplinas();
    java.util.HashMap var15 = var9.desempenho();
    int var16 = var9.intervalo();
    Stude.Cronograma var17 = var9.getCronograma();
    Stude.Cronograma var18 = var9.getCronograma();
    Stude.Disciplina var20 = var9.getDisciplina("");
    int var21 = var9.intervalo();
    java.util.HashMap var22 = var9.desempenho();
    Stude.MetodoDeEstudo var23 = var9.getMetodoDeEstudo();
    boolean var24 = var2.equals((java.lang.Object)var9);
    var9.addDisciplina("Metodo de estudo regular", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test450");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    java.util.HashMap var9 = var1.desempenho();
    Stude.Cronograma var10 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test451");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var13 = var1.getDisciplina("hi!");
    int var14 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test452");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Usuario var13 = var1.getUsuario();
    Stude.Cronograma var14 = var1.getCronograma();
    int var15 = var1.intervalo();
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test453");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    java.util.HashMap var12 = var1.desempenho();
    int var13 = var1.intervalo();
    var1.setMetodoAvancado();
    int var15 = var1.tempoDeEstudo();
    java.util.HashMap var16 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test454");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(2);
    int var5 = var2.getCor();
    var2.setNome("Metodo de estudo avancado");
    var2.addHorasDeEstudo(11.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test455");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var11 = var1.getUsuario();
    java.lang.String var12 = var11.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test456");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", (-1));
    Stude.Stude var4 = new Stude.Stude("hi!");
    var4.setMetodoAvancado();
    Stude.MetodoDeEstudo var6 = var4.getMetodoDeEstudo();
    var4.setNomeUsuario("Metodo de estudo regular");
    var4.setMetodoAvancado();
    java.util.HashMap var10 = var4.desempenho();
    java.util.HashMap var11 = var4.desempenho();
    java.util.List var12 = var4.getDisciplinas();
    var4.addDisciplina("hi!", 2);
    java.util.List var16 = var4.getDisciplinas();
    boolean var17 = var2.equals((java.lang.Object)var16);
    java.lang.String var18 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test457");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Usuario var8 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test458");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var17 = var16.toString();
    Stude.Stude var19 = new Stude.Stude("hi!");
    var19.setMetodoAvancado();
    Stude.MetodoDeEstudo var21 = var19.getMetodoDeEstudo();
    java.util.HashMap var22 = var19.desempenho();
    var19.setMetodoRegular();
    Stude.MetodoDeEstudo var24 = var19.getMetodoDeEstudo();
    var19.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var27 = var19.desempenho();
    boolean var28 = var16.equals((java.lang.Object)var27);
    var7.addDisciplina(var16);
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var7.addDisciplina(var32);
    java.util.List var34 = var7.getDisciplinas();
    Stude.Disciplina var36 = var7.getDisciplina("");
    int var37 = var7.tamanhoDisciplinas();
    java.util.List var38 = var7.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var40 = var7.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test459");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getIntervalo();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getTempo();
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test460");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Cronograma var8 = var1.getCronograma();
    var1.setMetodoRegular();
    Stude.Usuario var10 = var1.getUsuario();
    java.lang.String var11 = var10.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test461");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var5 = var3.getDisciplina("");
    Stude.Disciplina var7 = var3.getDisciplina("");
    Stude.Disciplina var9 = var3.getDisciplina("hi!");
    int var10 = var3.tamanhoDisciplinas();
    java.util.List var11 = var3.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test462");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var12 = var10.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test463");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    Stude.Disciplina var9 = var0.getDisciplina("hi!");
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var12.setCor((-1));
    java.lang.String var15 = var12.getNome();
    var0.addDisciplina(var12);
    java.util.List var17 = var0.getDisciplinas();
    Stude.Stude var19 = new Stude.Stude("hi!");
    int var20 = var19.intervalo();
    Stude.Usuario var21 = var19.getUsuario();
    Stude.Cronograma var22 = var19.getCronograma();
    var19.setMetodoAvancado();
    Stude.Cronograma var24 = var19.getCronograma();
    Stude.Cronograma var25 = new Stude.Cronograma();
    int var26 = var25.tamanhoDisciplinas();
    Stude.Disciplina var29 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var30 = var29.getHorasEstudadas();
    double var31 = var29.getHorasEstudadas();
    var25.addDisciplina(var29);
    var29.setCor(15);
    var24.addDisciplina(var29);
    var29.setCor(0);
    int var38 = var29.getCor();
    var0.addDisciplina(var29);
    int var40 = var0.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 3);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test464");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    int var3 = var1.intervalo();
    var1.setMetodoAvancado();
    int var5 = var1.tempoDeEstudo();
    Stude.Cronograma var6 = var1.getCronograma();
    java.util.List var7 = var6.getDisciplinas();
    java.util.HashMap var8 = Stude.Desempenho.tempoDeEstudo(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test465");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setNomeUsuario("hi!");
    java.util.HashMap var8 = var1.desempenho();
    int var9 = var1.tempoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test466");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    java.util.List var3 = var2.getDisciplinas();
    java.util.List var4 = var2.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test467");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 1);
    var0.addDisciplina(var4);
    int var6 = var0.tamanhoDisciplinas();
    java.util.List var7 = var0.getDisciplinas();
    int var8 = var0.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test468");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    Stude.Usuario var12 = var1.getUsuario();
    var12.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test469");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var7.getDisciplina("hi!");
    Stude.Disciplina var11 = var7.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test470");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.intervalo();
    Stude.Usuario var8 = var1.getUsuario();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    int var10 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test471");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    int var8 = var0.tamanhoDisciplinas();
    java.util.List var9 = var0.getDisciplinas();
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var12.setCor((-1));
    double var15 = var12.getHorasEstudadas();
    var12.addHorasDeEstudo(10.0d);
    var0.addDisciplina(var12);
    var12.setNome("Metodo de estudo avancado");
    var12.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test472");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    var7.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var7.getMetodoDeEstudo();
    var7.setMetodoAvancado();
    var7.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var15 = var7.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var15);
    Stude.Disciplina var18 = var0.getDisciplina("Metodo de estudo avancado");
    boolean var20 = var0.removeDisciplina("Metodo de estudo regular");
    Stude.Disciplina var22 = var0.getDisciplina("");
    Stude.Disciplina var25 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var26 = var25.toString();
    var25.setCor(15);
    java.lang.String var29 = var25.getNome();
    Stude.Cronograma var30 = new Stude.Cronograma();
    Stude.Disciplina var32 = var30.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var34 = var30.getDisciplina("");
    java.util.List var35 = var30.getDisciplinas();
    boolean var36 = var25.equals((java.lang.Object)var30);
    Stude.Stude var38 = new Stude.Stude("hi!");
    Stude.Cronograma var39 = var38.getCronograma();
    Stude.Usuario var40 = var38.getUsuario();
    java.lang.String var41 = var40.getNome();
    java.lang.String var42 = var40.getNome();
    boolean var43 = var25.equals((java.lang.Object)var40);
    java.lang.String var44 = var25.toString();
    var25.setNome("Metodo de estudo regular");
    var25.setNome("Metodo de estudo avancado");
    var0.addDisciplina(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo avancado"+ "'", var29.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo avancado"+ "'", var44.equals("Metodo de estudo avancado"));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test473");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var11.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    var16.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var24 = var16.getCronograma();
    Stude.Disciplina var26 = var16.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var27 = var16.getCronograma();
    Stude.Cronograma var28 = var16.getCronograma();
    java.util.List var29 = var28.getDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.setCor((-1));
    var32.addHorasDeEstudo(10.0d);
    Stude.Cronograma var37 = new Stude.Cronograma();
    java.util.List var38 = var37.getDisciplinas();
    Stude.Disciplina var40 = var37.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var42 = var37.getDisciplina("hi!");
    Stude.Disciplina var44 = var37.getDisciplina("");
    java.util.List var45 = var37.getDisciplinas();
    java.util.HashMap var46 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var47 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var48 = Stude.Desempenho.tempoDeEstudo(var45);
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var45);
    boolean var50 = var32.equals((java.lang.Object)var49);
    var28.addDisciplina(var32);
    boolean var52 = var11.equals((java.lang.Object)var28);
    Stude.Cronograma var53 = new Stude.Cronograma();
    java.util.List var54 = var53.getDisciplinas();
    Stude.Disciplina var56 = var53.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var58 = var53.getDisciplina("hi!");
    Stude.Disciplina var61 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var53.addDisciplina(var61);
    Stude.Disciplina var65 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var53.addDisciplina(var65);
    Stude.Disciplina var69 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var70 = var69.toString();
    var69.setCor(15);
    var69.setCor(10);
    var53.addDisciplina(var69);
    int var76 = var69.getCor();
    var28.addDisciplina(var69);
    boolean var79 = var28.removeDisciplina("Metodo de estudo avancado");
    java.util.List var80 = var28.getDisciplinas();
    Stude.Disciplina var82 = var28.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Metodo de estudo avancado"+ "'", var70.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test474");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var5.getDisciplina("hi!");
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var5.addDisciplina(var13);
    int var15 = var13.getCor();
    var0.addDisciplina(var13);
    var13.setNome("hi!");
    java.lang.String var19 = var13.toString();
    Stude.Avancado var20 = new Stude.Avancado();
    java.lang.String var21 = var20.toString();
    java.lang.String var22 = var20.toString();
    int var23 = var20.getIntervalo();
    java.lang.String var24 = var20.toString();
    int var25 = var20.getTempo();
    int var26 = var20.getIntervalo();
    int var27 = var20.getTempo();
    boolean var28 = var13.equals((java.lang.Object)var27);
    var13.setCor(2);
    var13.addHorasDeEstudo(1.0d);
    double var33 = var13.getHorasEstudadas();
    java.lang.String var34 = var13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo avancado"+ "'", var24.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test475");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var9 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var0.getDisciplina("hi!");
    Stude.Disciplina var13 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var17 = new Stude.Cronograma();
    java.util.List var18 = var17.getDisciplinas();
    java.util.HashMap var19 = Stude.Desempenho.tempoDeEstudo(var18);
    boolean var20 = var16.equals((java.lang.Object)var19);
    java.lang.String var21 = var16.getNome();
    var16.setCor(2);
    var0.addDisciplina(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test476");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    int var9 = var2.getCor();
    var2.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test477");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    Stude.Disciplina var9 = var0.getDisciplina("hi!");
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var12.setCor((-1));
    java.lang.String var15 = var12.getNome();
    var0.addDisciplina(var12);
    java.util.List var17 = var0.getDisciplinas();
    java.util.HashMap var18 = Stude.Desempenho.tempoDeEstudo(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test478");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    java.util.List var8 = var0.getDisciplinas();
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var11.setCor((-1));
    int var14 = var11.getCor();
    var11.addHorasDeEstudo(1.0d);
    java.lang.String var17 = var11.getNome();
    Stude.Disciplina var20 = new Stude.Disciplina("hi!", 30);
    boolean var21 = var11.equals((java.lang.Object)var20);
    var0.addDisciplina(var11);
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var26 = var0.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test479");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test480");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    int var14 = var0.tamanhoDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var18 = var17.toString();
    var17.setCor(15);
    var17.setNome("Metodo de estudo regular");
    int var23 = var17.getCor();
    var0.addDisciplina(var17);
    Stude.Disciplina var26 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var28 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var29 = var0.getDisciplinas();
    java.util.HashMap var30 = Stude.Desempenho.tempoDeEstudo(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test481");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    var1.setMetodoAvancado();
    java.util.List var9 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test482");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    int var13 = var12.tamanhoDisciplinas();
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var16.addHorasDeEstudo(10.0d);
    java.lang.String var19 = var16.toString();
    java.lang.String var20 = var16.getNome();
    int var21 = var16.getCor();
    var12.addDisciplina(var16);
    Stude.Stude var24 = new Stude.Stude("hi!");
    var24.setMetodoAvancado();
    Stude.MetodoDeEstudo var26 = var24.getMetodoDeEstudo();
    java.util.HashMap var27 = var24.desempenho();
    int var28 = var24.tempoDeEstudo();
    java.util.List var29 = var24.getDisciplinas();
    boolean var30 = var16.equals((java.lang.Object)var29);
    java.lang.String var31 = var16.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo regular"+ "'", var31.equals("Metodo de estudo regular"));

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test483");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Cronograma var9 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test484");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var5 = var1.intervalo();
    java.util.List var6 = var1.getDisciplinas();
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    int var9 = var1.tempoDeEstudo();
    int var10 = var1.intervalo();
    int var11 = var1.intervalo();
    var1.addDisciplina("Metodo de estudo regular", 2);
    java.util.List var15 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", (-1));
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test485");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    double var10 = var8.getHorasEstudadas();
    Stude.Stude var12 = new Stude.Stude("hi!");
    int var13 = var12.intervalo();
    Stude.Usuario var14 = var12.getUsuario();
    int var15 = var12.tempoDeEstudo();
    java.util.HashMap var16 = var12.desempenho();
    Stude.MetodoDeEstudo var17 = var12.getMetodoDeEstudo();
    Stude.Cronograma var18 = var12.getCronograma();
    Stude.Disciplina var20 = var18.getDisciplina("hi!");
    boolean var21 = var8.equals((java.lang.Object)var18);
    var8.setCor(2);
    java.lang.String var24 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test486");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Usuario var4 = var1.getUsuario();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test487");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.getNome();
    var2.setCor(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test488");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var8 = var1.getDisciplinas();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test489");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    int var7 = var2.getCor();
    int var8 = var2.getCor();
    java.lang.String var9 = var2.toString();
    double var10 = var2.getHorasEstudadas();
    int var11 = var2.getCor();
    Stude.Stude var13 = new Stude.Stude("hi!");
    var13.setMetodoAvancado();
    Stude.MetodoDeEstudo var15 = var13.getMetodoDeEstudo();
    java.util.HashMap var16 = var13.desempenho();
    var13.setMetodoRegular();
    java.util.List var18 = var13.getDisciplinas();
    java.util.HashMap var19 = var13.desempenho();
    int var20 = var13.intervalo();
    Stude.Cronograma var21 = var13.getCronograma();
    Stude.Cronograma var22 = var13.getCronograma();
    Stude.Disciplina var24 = var13.getDisciplina("");
    java.util.HashMap var25 = var13.desempenho();
    var13.setMetodoRegular();
    boolean var27 = var2.equals((java.lang.Object)var13);
    var13.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test490");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Cronograma var8 = var1.getCronograma();
    int var9 = var8.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test491");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var1.getDisciplina("");
    int var12 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test492");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getNome();
    double var5 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(20.0d);
    Stude.Stude var9 = new Stude.Stude("hi!");
    Stude.Cronograma var10 = var9.getCronograma();
    int var11 = var9.tempoDeEstudo();
    var9.setNomeUsuario("hi!");
    var9.setMetodoAvancado();
    java.util.HashMap var15 = var9.desempenho();
    Stude.Disciplina var17 = var9.getDisciplina("");
    Stude.Cronograma var18 = var9.getCronograma();
    java.util.HashMap var19 = var9.desempenho();
    java.util.HashMap var20 = var9.desempenho();
    Stude.Usuario var21 = var9.getUsuario();
    boolean var22 = var2.equals((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test493");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var3 = new Stude.Cronograma();
    java.util.List var4 = var3.getDisciplinas();
    Stude.Disciplina var6 = var3.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var8 = var3.getDisciplina("hi!");
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var3.addDisciplina(var11);
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var3.addDisciplina(var15);
    int var17 = var3.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var21 = var20.toString();
    var20.setCor(15);
    var20.setNome("Metodo de estudo regular");
    int var26 = var20.getCor();
    var3.addDisciplina(var20);
    var0.addDisciplina(var20);
    Stude.Disciplina var30 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var32 = var0.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test494");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var11 = var10.getHorasEstudadas();
    var10.setNome("hi!");
    var10.setNome("hi!");
    var7.addDisciplina(var10);
    boolean var18 = var7.removeDisciplina("hi!");
    Stude.Disciplina var20 = var7.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test495");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    int var6 = var0.tamanhoDisciplinas();
    java.util.List var7 = var0.getDisciplinas();
    int var8 = var0.tamanhoDisciplinas();
    int var9 = var0.tamanhoDisciplinas();
    java.util.List var10 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test496");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    java.lang.String var14 = var2.toString();
    int var15 = var2.getCor();
    java.lang.String var16 = var2.getNome();
    var2.setCor(15);
    double var19 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test497");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    var1.addDisciplina("hi!", 5);
    Stude.Cronograma var8 = var1.getCronograma();
    boolean var10 = var8.removeDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var8.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test498");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    var2.setCor((-1));
    var2.setCor(0);
    int var10 = var2.getCor();
    Stude.Stude var12 = new Stude.Stude("hi!");
    Stude.Cronograma var13 = var12.getCronograma();
    Stude.Disciplina var15 = var13.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var18 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var19 = var18.toString();
    var18.setCor(15);
    var18.setCor(10);
    var13.addDisciplina(var18);
    boolean var25 = var2.equals((java.lang.Object)var13);
    java.util.List var26 = var13.getDisciplinas();
    boolean var28 = var13.removeDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var30 = var13.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test499");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Usuario var13 = var1.getUsuario();
    Stude.Cronograma var14 = var1.getCronograma();
    int var15 = var1.intervalo();
    Stude.Disciplina var17 = var1.getDisciplina("");
    Stude.MetodoDeEstudo var18 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var20 = var1.tempoDeEstudo();
    int var21 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test500");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    int var10 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

}
