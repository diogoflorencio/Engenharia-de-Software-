package randoop;

import junit.framework.*;

public class RandoopTest9 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test1");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Usuario var7 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setNome("");
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test2");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    java.util.HashMap var11 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo avancado", 3);
    int var15 = var1.tempoDeEstudo();
    
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
    assertTrue(var15 == 30);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test3");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    java.util.List var8 = var0.getDisciplinas();
    Stude.Disciplina var10 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var0.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var16 = var15.toString();
    java.lang.String var17 = var15.toString();
    var15.setCor((-1));
    var15.setCor(3);
    var0.addDisciplina(var15);
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo regular");
    int var25 = var0.tamanhoDisciplinas();
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test4");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    java.lang.String var4 = var3.getNome();
    java.lang.String var5 = var3.getNome();
    var3.setNome("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test5");


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
    Stude.Usuario var24 = var15.getUsuario();
    
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

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test6");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    var2.setCor(2);
    int var10 = var2.getCor();
    var2.setNome("Metodo de estudo regular");
    var2.addHorasDeEstudo(20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test7");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", (-1));
    var1.setMetodoRegular();
    int var8 = var1.tempoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    Stude.Cronograma var10 = var1.getCronograma();
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
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test8");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var9.setCor(100);
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var19 = var12.getDisciplina("");
    boolean var20 = var9.equals((java.lang.Object)"");
    int var21 = var9.getCor();
    int var22 = var9.getCor();
    Stude.Stude var24 = new Stude.Stude("hi!");
    var24.setMetodoAvancado();
    Stude.MetodoDeEstudo var26 = var24.getMetodoDeEstudo();
    java.util.List var27 = var24.getDisciplinas();
    var24.setNomeUsuario("hi!");
    var24.setMetodoRegular();
    Stude.MetodoDeEstudo var31 = var24.getMetodoDeEstudo();
    boolean var32 = var9.equals((java.lang.Object)var31);
    java.lang.String var33 = var9.toString();
    java.lang.String var34 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo regular"+ "'", var33.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test9");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.List var11 = var10.getDisciplinas();
    Stude.Disciplina var14 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var15 = var14.toString();
    var14.setCor(15);
    java.lang.String var18 = var14.getNome();
    boolean var20 = var14.equals((java.lang.Object)(byte)100);
    java.lang.String var21 = var14.toString();
    int var22 = var14.getCor();
    java.lang.String var23 = var14.toString();
    var10.addDisciplina(var14);
    java.lang.String var25 = var14.getNome();
    java.lang.String var26 = var14.getNome();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo avancado"+ "'", var25.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test10");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    int var9 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test11");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("hi!");
    Stude.Cronograma var8 = new Stude.Cronograma();
    java.util.List var9 = var8.getDisciplinas();
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var9);
    boolean var11 = var2.equals((java.lang.Object)var9);
    var2.setCor(30);
    Stude.Stude var15 = new Stude.Stude("hi!");
    int var16 = var15.intervalo();
    Stude.Usuario var17 = var15.getUsuario();
    int var18 = var15.intervalo();
    java.util.List var19 = var15.getDisciplinas();
    Stude.Cronograma var20 = var15.getCronograma();
    int var21 = var15.tempoDeEstudo();
    boolean var22 = var2.equals((java.lang.Object)var15);
    java.lang.String var23 = var2.getNome();
    Stude.Stude var25 = new Stude.Stude("hi!");
    int var26 = var25.intervalo();
    Stude.Usuario var27 = var25.getUsuario();
    Stude.Cronograma var28 = var25.getCronograma();
    java.util.HashMap var29 = var25.desempenho();
    Stude.Usuario var30 = var25.getUsuario();
    Stude.Usuario var31 = var25.getUsuario();
    boolean var32 = var2.equals((java.lang.Object)var25);
    var25.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test12");


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
    var15.setNome("hi!");
    java.lang.String var22 = var15.toString();
    double var23 = var15.getHorasEstudadas();
    var15.setNome("hi!");
    
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
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test13");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test14");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Cronograma var13 = var1.getCronograma();
    Stude.Disciplina var15 = var13.getDisciplina("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test15");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    var1.setMetodoAvancado();
    Stude.Disciplina var12 = var1.getDisciplina("hi!");
    Stude.Cronograma var13 = var1.getCronograma();
    java.util.HashMap var14 = var1.desempenho();
    Stude.Cronograma var15 = var1.getCronograma();
    Stude.Disciplina var17 = var15.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test16");


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
    java.util.List var11 = var10.getDisciplinas();
    int var12 = var10.tamanhoDisciplinas();
    Stude.Cronograma var13 = new Stude.Cronograma();
    int var14 = var13.tamanhoDisciplinas();
    Stude.Cronograma var15 = new Stude.Cronograma();
    Stude.Disciplina var17 = var15.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var19 = var15.getDisciplina("");
    Stude.Cronograma var20 = new Stude.Cronograma();
    java.util.List var21 = var20.getDisciplinas();
    Stude.Disciplina var23 = var20.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var25 = var20.getDisciplina("hi!");
    Stude.Disciplina var28 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.addDisciplina(var28);
    int var30 = var28.getCor();
    var15.addDisciplina(var28);
    var13.addDisciplina(var28);
    java.lang.String var33 = var28.getNome();
    var10.addDisciplina(var28);
    var28.addHorasDeEstudo(21.0d);
    java.lang.String var37 = var28.toString();
    Stude.Stude var39 = new Stude.Stude("hi!");
    var39.setMetodoAvancado();
    Stude.MetodoDeEstudo var41 = var39.getMetodoDeEstudo();
    var39.setMetodoAvancado();
    var39.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var47 = var39.getDisciplina("hi!");
    var39.setMetodoRegular();
    java.util.HashMap var49 = var39.desempenho();
    boolean var50 = var28.equals((java.lang.Object)var39);
    
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
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo regular"+ "'", var33.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo regular"+ "'", var37.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test17");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoRegular();
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test18");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.addDisciplina("Metodo de estudo regular", 10);
    Stude.Usuario var8 = var1.getUsuario();
    java.util.HashMap var9 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test19");


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
    java.lang.String var19 = var2.getNome();
    java.lang.String var20 = var2.toString();
    var2.addHorasDeEstudo(21.0d);
    double var23 = var2.getHorasEstudadas();
    
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 21.0d);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test20");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo regular");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    int var4 = var3.tamanhoDisciplinas();
    int var5 = var3.tamanhoDisciplinas();
    Stude.Disciplina var7 = var3.getDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var3.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test21");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    var15.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var15);
    Stude.Disciplina var21 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var23 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var24 = new Stude.Cronograma();
    java.util.List var25 = var24.getDisciplinas();
    Stude.Disciplina var27 = var24.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var29 = var24.getDisciplina("hi!");
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var24.addDisciplina(var32);
    Stude.Disciplina var36 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var24.addDisciplina(var36);
    Stude.Disciplina var40 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var41 = var40.toString();
    var40.setCor(15);
    var40.setCor(10);
    var24.addDisciplina(var40);
    java.lang.String var47 = var40.getNome();
    java.lang.String var48 = var40.toString();
    java.lang.String var49 = var40.toString();
    var0.addDisciplina(var40);
    Stude.Disciplina var52 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Stude var54 = new Stude.Stude("hi!");
    Stude.Cronograma var55 = var54.getCronograma();
    Stude.Cronograma var56 = var54.getCronograma();
    Stude.Cronograma var57 = var54.getCronograma();
    Stude.Disciplina var60 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var60.setCor((-1));
    var60.addHorasDeEstudo(10.0d);
    java.lang.String var65 = var60.getNome();
    var60.setNome("Metodo de estudo regular");
    var57.addDisciplina(var60);
    double var69 = var60.getHorasEstudadas();
    var0.addDisciplina(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo avancado"+ "'", var41.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Metodo de estudo avancado"+ "'", var47.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Metodo de estudo avancado"+ "'", var48.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "Metodo de estudo avancado"+ "'", var49.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "Metodo de estudo regular"+ "'", var65.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 10.0d);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test22");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test23");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test24");


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
    Stude.Disciplina var15 = new Stude.Disciplina("hi!", 3);
    var15.addHorasDeEstudo(10.0d);
    var12.addDisciplina(var15);
    
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

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test25");


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
    Stude.Stude var19 = new Stude.Stude("hi!");
    Stude.Cronograma var20 = var19.getCronograma();
    int var21 = var19.tempoDeEstudo();
    var19.setNomeUsuario("hi!");
    var19.setMetodoAvancado();
    java.util.HashMap var25 = var19.desempenho();
    Stude.Disciplina var27 = var19.getDisciplina("");
    Stude.Usuario var28 = var19.getUsuario();
    var19.setMetodoAvancado();
    boolean var30 = var13.equals((java.lang.Object)var19);
    var19.setMetodoRegular();
    Stude.MetodoDeEstudo var32 = var19.getMetodoDeEstudo();
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test26");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    int var8 = var7.tamanhoDisciplinas();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 5);
    double var12 = var11.getHorasEstudadas();
    var11.addHorasDeEstudo(10.0d);
    var11.setCor(0);
    var7.addDisciplina(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var19 = var7.removeDisciplina("Metodo de estudo avancado");
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
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test27");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 30);
    double var3 = var2.getHorasEstudadas();
    java.lang.String var4 = var2.getNome();
    java.lang.String var5 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test28");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.List var11 = var10.getDisciplinas();
    java.util.List var12 = var10.getDisciplinas();
    int var13 = var10.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var10.removeDisciplina("Metodo de estudo avancado");
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test29");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getTempo();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getIntervalo();
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
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test30");


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
    var1.addDisciplina("hi!", 10);
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

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test31");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 5);
    java.lang.String var3 = var2.getNome();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test32");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(2);
    var2.setCor(10);
    java.lang.String var7 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test33");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    boolean var10 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    var2.addHorasDeEstudo(10.0d);
    var2.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    int var17 = var16.intervalo();
    Stude.Usuario var18 = var16.getUsuario();
    Stude.Cronograma var19 = var16.getCronograma();
    Stude.Disciplina var21 = var19.getDisciplina("hi!");
    Stude.Cronograma var22 = new Stude.Cronograma();
    java.util.List var23 = var22.getDisciplinas();
    Stude.Disciplina var25 = var22.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var27 = var22.getDisciplina("hi!");
    Stude.Disciplina var30 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var22.addDisciplina(var30);
    double var32 = var30.getHorasEstudadas();
    var30.setCor(2);
    var19.addDisciplina(var30);
    var30.setNome("Metodo de estudo avancado");
    boolean var38 = var2.equals((java.lang.Object)var30);
    java.lang.String var39 = var30.getNome();
    java.lang.String var40 = var30.toString();
    java.lang.String var41 = var30.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo avancado"+ "'", var39.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo avancado"+ "'", var40.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo avancado"+ "'", var41.equals("Metodo de estudo avancado"));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test34");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test35");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Usuario var5 = var1.getUsuario();
    Stude.Usuario var6 = var1.getUsuario();
    var1.setMetodoRegular();
    java.util.List var8 = var1.getDisciplinas();
    Stude.Cronograma var9 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test36");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    java.util.HashMap var13 = var1.desempenho();
    java.util.HashMap var14 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo avancado", 3);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test37");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Cronograma var8 = var1.getCronograma();
    var1.setMetodoRegular();
    java.util.List var10 = var1.getDisciplinas();
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
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test38");


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
    Stude.Disciplina var19 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var19.addHorasDeEstudo(10.0d);
    java.lang.String var22 = var19.toString();
    java.lang.String var23 = var19.getNome();
    int var24 = var19.getCor();
    var7.addDisciplina(var19);
    int var26 = var7.tamanhoDisciplinas();
    Stude.Disciplina var28 = var7.getDisciplina("Metodo de estudo regular");
    int var29 = var28.getCor();
    java.lang.String var30 = var28.getNome();
    
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
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo regular"+ "'", var22.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Metodo de estudo regular"+ "'", var30.equals("Metodo de estudo regular"));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test39");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var9 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var10 = var0.getDisciplinas();
    int var11 = var0.tamanhoDisciplinas();
    Stude.Stude var13 = new Stude.Stude("hi!");
    var13.setMetodoAvancado();
    Stude.MetodoDeEstudo var15 = var13.getMetodoDeEstudo();
    java.util.HashMap var16 = var13.desempenho();
    var13.setMetodoRegular();
    Stude.MetodoDeEstudo var18 = var13.getMetodoDeEstudo();
    var13.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var21 = var13.getCronograma();
    Stude.Disciplina var23 = var13.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var24 = var13.getCronograma();
    Stude.Disciplina var27 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var28 = var27.toString();
    var27.setCor(15);
    java.lang.String var31 = var27.getNome();
    boolean var33 = var27.equals((java.lang.Object)(byte)100);
    java.lang.String var34 = var27.toString();
    var24.addDisciplina(var27);
    Stude.Disciplina var38 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var38.addHorasDeEstudo(10.0d);
    java.lang.String var41 = var38.toString();
    var24.addDisciplina(var38);
    var0.addDisciplina(var38);
    Stude.Stude var45 = new Stude.Stude("hi!");
    Stude.MetodoDeEstudo var46 = var45.getMetodoDeEstudo();
    boolean var47 = var38.equals((java.lang.Object)var45);
    Stude.MetodoDeEstudo var48 = var45.getMetodoDeEstudo();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo avancado"+ "'", var28.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo avancado"+ "'", var34.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo regular"+ "'", var41.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test40");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.addDisciplina("hi!", 0);
    int var10 = var1.intervalo();
    Stude.Disciplina var12 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var14 = var1.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test41");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Cronograma var14 = new Stude.Cronograma();
    Stude.Disciplina var16 = var14.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var18 = var14.getDisciplina("");
    int var19 = var14.tamanhoDisciplinas();
    Stude.Disciplina var21 = var14.getDisciplina("hi!");
    java.util.List var22 = var14.getDisciplinas();
    int var23 = var14.tamanhoDisciplinas();
    Stude.Disciplina var26 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var27 = new Stude.Cronograma();
    java.util.List var28 = var27.getDisciplinas();
    java.util.HashMap var29 = Stude.Desempenho.tempoDeEstudo(var28);
    boolean var30 = var26.equals((java.lang.Object)var29);
    double var31 = var26.getHorasEstudadas();
    var14.addDisciplina(var26);
    var7.addDisciplina(var26);
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test42");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var1.getDisciplina("");
    int var12 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test43");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    var6.setNome("Metodo de estudo avancado");
    var6.setNome("Metodo de estudo avancado");
    var6.setNome("Metodo de estudo regular");
    java.lang.String var13 = var6.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test44");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 2);
    int var10 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setNomeUsuario("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test45");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var5 = var1.intervalo();
    java.util.List var6 = var1.getDisciplinas();
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo regular");
    int var11 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var1.removeDisciplina("Metodo de estudo avancado");
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test46");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    int var8 = var0.tamanhoDisciplinas();
    Stude.Disciplina var10 = var0.getDisciplina("hi!");
    Stude.Stude var12 = new Stude.Stude("hi!");
    var12.setMetodoAvancado();
    Stude.MetodoDeEstudo var14 = var12.getMetodoDeEstudo();
    java.util.HashMap var15 = var12.desempenho();
    var12.setMetodoRegular();
    java.util.List var17 = var12.getDisciplinas();
    var12.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var21 = var12.getMetodoDeEstudo();
    Stude.Disciplina var23 = var12.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test47");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.List var10 = var1.getDisciplinas();
    var1.addDisciplina("hi!", (-1));
    var1.setMetodoAvancado();
    java.util.HashMap var15 = var1.desempenho();
    
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
    assertNotNull(var15);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test48");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    int var8 = var1.tempoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    int var10 = var1.tempoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    int var14 = var1.tempoDeEstudo();
    java.util.HashMap var15 = var1.desempenho();
    
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
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test49");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test50");


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
    var2.setCor(100);
    java.lang.String var26 = var2.toString();
    
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
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test51");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Disciplina var9 = var1.getDisciplina("");
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.removeDisciplina("Metodo de estudo regular");
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

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test52");


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
    Stude.Cronograma var26 = new Stude.Cronograma();
    int var27 = var26.tamanhoDisciplinas();
    Stude.Disciplina var30 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var31 = var30.getHorasEstudadas();
    double var32 = var30.getHorasEstudadas();
    var26.addDisciplina(var30);
    int var34 = var26.tamanhoDisciplinas();
    java.util.List var35 = var26.getDisciplinas();
    java.util.HashMap var36 = Stude.Desempenho.tempoDeEstudo(var35);
    boolean var37 = var2.equals((java.lang.Object)var35);
    var2.addHorasDeEstudo(1.0d);
    double var40 = var2.getHorasEstudadas();
    
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
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1.0d);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test53");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", 100);
    int var13 = var1.tempoDeEstudo();
    java.util.List var14 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test54");


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
    int var31 = var26.getCor();
    double var32 = var26.getHorasEstudadas();
    double var33 = var26.getHorasEstudadas();
    var26.setCor(10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 100.0d);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test55");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.Usuario var9 = var1.getUsuario();
    Stude.Usuario var10 = var1.getUsuario();
    Stude.Usuario var11 = var1.getUsuario();
    Stude.Usuario var12 = var1.getUsuario();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test56");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Stude var15 = new Stude.Stude("hi!");
    var15.setMetodoAvancado();
    Stude.MetodoDeEstudo var17 = var15.getMetodoDeEstudo();
    java.util.HashMap var18 = var15.desempenho();
    var15.setMetodoRegular();
    Stude.MetodoDeEstudo var20 = var15.getMetodoDeEstudo();
    boolean var21 = var2.equals((java.lang.Object)var15);
    java.util.HashMap var22 = var15.desempenho();
    var15.setMetodoRegular();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test57");


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
    var1.setMetodoRegular();
    
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

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test58");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.addDisciplina("Metodo de estudo regular", 10);
    int var8 = var1.intervalo();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test59");


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
    Stude.Usuario var16 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Usuario var19 = var1.getUsuario();
    var19.setNome("Metodo de estudo regular");
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test60");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    java.util.HashMap var13 = var1.desempenho();
    Stude.Cronograma var14 = var1.getCronograma();
    Stude.Disciplina var16 = var1.getDisciplina("");
    java.util.HashMap var17 = var1.desempenho();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test61");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Usuario var10 = var1.getUsuario();
    java.lang.String var11 = var10.getNome();
    var10.setNome("Metodo de estudo regular");
    java.lang.String var14 = var10.getNome();
    
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test62");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var1.tempoDeEstudo();
    java.util.List var11 = var1.getDisciplinas();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test63");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    int var6 = var1.tempoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
    java.util.HashMap var10 = var1.desempenho();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test64");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    java.util.List var8 = var0.getDisciplinas();
    java.util.HashMap var9 = Stude.Desempenho.tempoDeEstudo(var8);
    
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
    assertNotNull(var9);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test65");


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
    double var15 = var11.getHorasEstudadas();
    Stude.Avancado var16 = new Stude.Avancado();
    java.lang.String var17 = var16.toString();
    java.lang.String var18 = var16.toString();
    int var19 = var16.getIntervalo();
    int var20 = var16.getIntervalo();
    int var21 = var16.getTempo();
    int var22 = var16.getTempo();
    int var23 = var16.getTempo();
    int var24 = var16.getIntervalo();
    java.lang.String var25 = var16.toString();
    java.lang.String var26 = var16.toString();
    boolean var27 = var11.equals((java.lang.Object)var26);
    double var28 = var11.getHorasEstudadas();
    
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
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo avancado"+ "'", var25.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test66");


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
    java.util.List var17 = var1.getDisciplinas();
    Stude.Disciplina var19 = var1.getDisciplina("Metodo de estudo regular");
    int var20 = var1.tempoDeEstudo();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 30);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test67");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    var2.setCor((-1));
    var2.addHorasDeEstudo(100.0d);
    java.lang.String var10 = var2.toString();
    double var11 = var2.getHorasEstudadas();
    int var12 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test68");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setCor(15);
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
    java.util.List var19 = var9.getDisciplinas();
    Stude.MetodoDeEstudo var20 = var9.getMetodoDeEstudo();
    int var21 = var9.intervalo();
    Stude.Disciplina var23 = var9.getDisciplina("hi!");
    int var24 = var9.intervalo();
    boolean var25 = var2.equals((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test69");


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
    var13.addHorasDeEstudo(20.0d);
    double var22 = var13.getHorasEstudadas();
    java.lang.String var23 = var13.toString();
    var13.setNome("Metodo de estudo regular");
    java.lang.String var26 = var13.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test70");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    int var7 = var1.tempoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    var1.setMetodoRegular();
    java.util.HashMap var10 = var1.desempenho();
    int var11 = var1.tempoDeEstudo();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test71");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    double var4 = var2.getHorasEstudadas();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getCor();
    java.lang.String var7 = var2.toString();
    double var8 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test72");


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
    Stude.Cronograma var81 = new Stude.Cronograma();
    Stude.Disciplina var83 = var81.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var85 = var81.getDisciplina("");
    int var86 = var81.tamanhoDisciplinas();
    Stude.Disciplina var88 = var81.getDisciplina("hi!");
    java.util.List var89 = var81.getDisciplinas();
    Stude.Disciplina var92 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var93 = var92.getCor();
    double var94 = var92.getHorasEstudadas();
    var81.addDisciplina(var92);
    var92.setCor(2);
    var28.addDisciplina(var92);
    
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
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0.0d);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test73");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    var2.addHorasDeEstudo(1.0d);
    int var9 = var2.getCor();
    java.lang.String var10 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test74");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    Stude.Disciplina var8 = var0.getDisciplina("hi!");
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var11.addHorasDeEstudo(10.0d);
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = var11.getNome();
    Stude.Cronograma var16 = new Stude.Cronograma();
    Stude.Disciplina var18 = var16.getDisciplina("Metodo de estudo regular");
    boolean var19 = var11.equals((java.lang.Object)"Metodo de estudo regular");
    int var20 = var11.getCor();
    var0.addDisciplina(var11);
    int var22 = var0.tamanhoDisciplinas();
    Stude.Cronograma var23 = new Stude.Cronograma();
    java.util.List var24 = var23.getDisciplinas();
    Stude.Disciplina var26 = var23.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var28 = var23.getDisciplina("hi!");
    java.util.List var29 = var23.getDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.setCor((-1));
    int var35 = var32.getCor();
    var32.addHorasDeEstudo(1.0d);
    java.lang.String var38 = var32.getNome();
    var23.addDisciplina(var32);
    java.lang.String var40 = var32.getNome();
    double var41 = var32.getHorasEstudadas();
    int var42 = var32.getCor();
    var0.addDisciplina(var32);
    java.lang.String var44 = var32.toString();
    double var45 = var32.getHorasEstudadas();
    
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
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo regular"+ "'", var38.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo regular"+ "'", var40.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo regular"+ "'", var44.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1.0d);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test75");


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
    java.util.List var11 = var10.getDisciplinas();
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var12.addDisciplina(var20);
    Stude.Disciplina var24 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var12.addDisciplina(var24);
    var10.addDisciplina(var24);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test76");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.setNome("Metodo de estudo regular");
    Stude.Stude var9 = new Stude.Stude("hi!");
    var9.setMetodoAvancado();
    Stude.MetodoDeEstudo var11 = var9.getMetodoDeEstudo();
    java.util.HashMap var12 = var9.desempenho();
    var9.setMetodoRegular();
    java.util.List var14 = var9.getDisciplinas();
    var9.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var19 = var9.getDisciplina("Metodo de estudo regular");
    var9.setNomeUsuario("Metodo de estudo regular");
    java.util.List var22 = var9.getDisciplinas();
    boolean var23 = var2.equals((java.lang.Object)var9);
    java.util.HashMap var24 = var9.desempenho();
    var9.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test77");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var13 = var1.getDisciplina("hi!");
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Cronograma var16 = var1.getCronograma();
    
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
    assertNotNull(var16);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test78");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.Usuario var3 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test79");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    Stude.Disciplina var7 = var1.getDisciplina("");
    Stude.Disciplina var9 = var1.getDisciplina("");
    java.util.HashMap var10 = var1.desempenho();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test80");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    int var5 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    var1.addDisciplina("hi!", 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test81");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("hi!");
    int var8 = var2.getCor();
    double var9 = var2.getHorasEstudadas();
    var2.setCor(30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test82");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var6 = var1.desempenho();
    java.util.HashMap var7 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo avancado", 30);
    var1.setNomeUsuario("hi!");
    Stude.Usuario var13 = var1.getUsuario();
    int var14 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test83");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    int var8 = var7.tamanhoDisciplinas();
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var11.setCor((-1));
    int var14 = var11.getCor();
    java.lang.String var15 = var11.getNome();
    java.lang.String var16 = var11.toString();
    var11.setCor((-1));
    int var19 = var11.getCor();
    var7.addDisciplina(var11);
    Stude.Stude var22 = new Stude.Stude("hi!");
    var22.setMetodoAvancado();
    Stude.MetodoDeEstudo var24 = var22.getMetodoDeEstudo();
    java.util.HashMap var25 = var22.desempenho();
    var22.setMetodoRegular();
    java.util.HashMap var27 = var22.desempenho();
    var22.setMetodoRegular();
    var22.setMetodoRegular();
    Stude.Cronograma var30 = var22.getCronograma();
    var22.setNomeUsuario("Metodo de estudo regular");
    int var33 = var22.tempoDeEstudo();
    boolean var34 = var11.equals((java.lang.Object)var22);
    var11.setNome("Metodo de estudo avancado");
    
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
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test84");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    Stude.Disciplina var9 = var0.getDisciplina("hi!");
    java.util.List var10 = var0.getDisciplinas();
    Stude.Stude var12 = new Stude.Stude("hi!");
    int var13 = var12.intervalo();
    Stude.MetodoDeEstudo var14 = var12.getMetodoDeEstudo();
    var12.addDisciplina("hi!", 2);
    Stude.Disciplina var19 = var12.getDisciplina("hi!");
    var19.addHorasDeEstudo(100.0d);
    var19.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var26 = var0.removeDisciplina("");
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test85");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Disciplina var14 = var1.getDisciplina("");
    int var15 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test86");


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
    Stude.Cronograma var23 = new Stude.Cronograma();
    Stude.Disciplina var25 = var23.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var27 = var23.getDisciplina("");
    java.util.List var28 = var23.getDisciplinas();
    Stude.Stude var30 = new Stude.Stude("hi!");
    var30.setMetodoAvancado();
    Stude.MetodoDeEstudo var32 = var30.getMetodoDeEstudo();
    var30.setMetodoAvancado();
    var30.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var38 = var30.getDisciplina("Metodo de estudo regular");
    var23.addDisciplina(var38);
    double var40 = var38.getHorasEstudadas();
    var38.setNome("Metodo de estudo regular");
    int var43 = var38.getCor();
    var12.addDisciplina(var38);
    java.util.List var45 = var12.getDisciplinas();
    Stude.Disciplina var47 = var12.getDisciplina("");
    int var48 = var12.tamanhoDisciplinas();
    
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
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test87");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Usuario var7 = var1.getUsuario();
    java.lang.String var8 = var7.getNome();
    var7.setNome("Metodo de estudo avancado");
    
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
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test88");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    int var8 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test89");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.Usuario var9 = var1.getUsuario();
    Stude.Usuario var10 = var1.getUsuario();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test90");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    java.util.HashMap var11 = var1.desempenho();
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    java.util.List var15 = var1.getDisciplinas();
    java.util.HashMap var16 = var1.desempenho();
    java.util.List var17 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo avancado", 100);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test91");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Usuario var8 = var1.getUsuario();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test92");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    java.lang.String var7 = var6.getNome();
    var6.setNome("hi!");
    var6.setNome("hi!");
    var6.setNome("Metodo de estudo avancado");
    var6.setNome("Metodo de estudo avancado");
    var6.setNome("Metodo de estudo regular");
    java.lang.String var18 = var6.getNome();
    var6.setNome("Metodo de estudo avancado");
    
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
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test93");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.intervalo();
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test94");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    int var7 = var1.intervalo();
    Stude.Cronograma var8 = var1.getCronograma();
    java.util.List var9 = var8.getDisciplinas();
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var13 = var12.toString();
    var12.setCor(15);
    java.lang.String var16 = var12.getNome();
    Stude.Cronograma var17 = new Stude.Cronograma();
    Stude.Disciplina var19 = var17.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var21 = var17.getDisciplina("");
    java.util.List var22 = var17.getDisciplinas();
    boolean var23 = var12.equals((java.lang.Object)var17);
    Stude.Disciplina var26 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var27 = var26.toString();
    Stude.Stude var29 = new Stude.Stude("hi!");
    var29.setMetodoAvancado();
    Stude.MetodoDeEstudo var31 = var29.getMetodoDeEstudo();
    java.util.HashMap var32 = var29.desempenho();
    var29.setMetodoRegular();
    Stude.MetodoDeEstudo var34 = var29.getMetodoDeEstudo();
    var29.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var37 = var29.desempenho();
    boolean var38 = var26.equals((java.lang.Object)var37);
    var17.addDisciplina(var26);
    Stude.Disciplina var42 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var17.addDisciplina(var42);
    int var44 = var42.getCor();
    Stude.Disciplina var47 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var48 = var47.toString();
    java.lang.String var49 = var47.toString();
    java.lang.String var50 = var47.toString();
    var47.setNome("hi!");
    int var53 = var47.getCor();
    boolean var54 = var42.equals((java.lang.Object)var47);
    var42.setNome("hi!");
    Stude.Stude var58 = new Stude.Stude("hi!");
    var58.setMetodoAvancado();
    Stude.MetodoDeEstudo var60 = var58.getMetodoDeEstudo();
    java.util.HashMap var61 = var58.desempenho();
    var58.setMetodoRegular();
    java.util.HashMap var63 = var58.desempenho();
    var58.setMetodoRegular();
    java.util.List var65 = var58.getDisciplinas();
    java.util.HashMap var66 = var58.desempenho();
    boolean var67 = var42.equals((java.lang.Object)var66);
    var8.addDisciplina(var42);
    var42.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Metodo de estudo avancado"+ "'", var48.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "Metodo de estudo avancado"+ "'", var49.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Metodo de estudo avancado"+ "'", var50.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test95");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.setNomeUsuario("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("hi!");
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

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test96");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setMetodoRegular();
    Stude.Cronograma var14 = var1.getCronograma();
    int var15 = var1.intervalo();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test97");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    var2.setCor(3);
    Stude.Stude var6 = new Stude.Stude("hi!");
    int var7 = var6.intervalo();
    Stude.Usuario var8 = var6.getUsuario();
    int var9 = var6.intervalo();
    java.util.List var10 = var6.getDisciplinas();
    Stude.Cronograma var11 = var6.getCronograma();
    Stude.Usuario var12 = var6.getUsuario();
    Stude.MetodoDeEstudo var13 = var6.getMetodoDeEstudo();
    boolean var14 = var2.equals((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertTrue(var14 == false);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test98");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Usuario var7 = var1.getUsuario();
    var1.addDisciplina("hi!", 15);
    var1.addDisciplina("Metodo de estudo avancado", 5);
    int var14 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var15 = var1.getMetodoDeEstudo();
    
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
    assertTrue(var14 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test99");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var9.setCor(100);
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var19 = var12.getDisciplina("");
    boolean var20 = var9.equals((java.lang.Object)"");
    double var21 = var9.getHorasEstudadas();
    var9.setNome("hi!");
    var9.addHorasDeEstudo(10.0d);
    var9.addHorasDeEstudo(1.0d);
    java.lang.String var28 = var9.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test100");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.setNome("Metodo de estudo regular");
    Stude.Stude var9 = new Stude.Stude("hi!");
    var9.setMetodoAvancado();
    Stude.MetodoDeEstudo var11 = var9.getMetodoDeEstudo();
    java.util.HashMap var12 = var9.desempenho();
    var9.setMetodoRegular();
    java.util.List var14 = var9.getDisciplinas();
    var9.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var19 = var9.getDisciplina("Metodo de estudo regular");
    var9.setNomeUsuario("Metodo de estudo regular");
    java.util.List var22 = var9.getDisciplinas();
    boolean var23 = var2.equals((java.lang.Object)var9);
    java.lang.String var24 = var2.toString();
    double var25 = var2.getHorasEstudadas();
    var2.setCor(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test101");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test102");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    java.util.List var8 = var0.getDisciplinas();
    int var9 = var0.tamanhoDisciplinas();
    Stude.Disciplina var11 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var12 = var0.getDisciplinas();
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var16 = var15.toString();
    var15.setCor(15);
    java.lang.String var19 = var15.getNome();
    Stude.Cronograma var20 = new Stude.Cronograma();
    Stude.Disciplina var22 = var20.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var24 = var20.getDisciplina("");
    java.util.List var25 = var20.getDisciplinas();
    boolean var26 = var15.equals((java.lang.Object)var20);
    Stude.Disciplina var29 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var30 = var29.toString();
    Stude.Stude var32 = new Stude.Stude("hi!");
    var32.setMetodoAvancado();
    Stude.MetodoDeEstudo var34 = var32.getMetodoDeEstudo();
    java.util.HashMap var35 = var32.desempenho();
    var32.setMetodoRegular();
    Stude.MetodoDeEstudo var37 = var32.getMetodoDeEstudo();
    var32.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var40 = var32.desempenho();
    boolean var41 = var29.equals((java.lang.Object)var40);
    var20.addDisciplina(var29);
    var29.addHorasDeEstudo(10.0d);
    var29.setCor(2);
    var0.addDisciplina(var29);
    
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
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Metodo de estudo avancado"+ "'", var30.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test103");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.setNome("");
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
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test104");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
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
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test105");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var9 = var1.desempenho();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var16 = var15.toString();
    var15.setCor(15);
    java.lang.String var19 = var15.getNome();
    Stude.Cronograma var20 = new Stude.Cronograma();
    Stude.Disciplina var22 = var20.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var24 = var20.getDisciplina("");
    java.util.List var25 = var20.getDisciplinas();
    boolean var26 = var15.equals((java.lang.Object)var20);
    Stude.Disciplina var29 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var30 = var29.toString();
    Stude.Stude var32 = new Stude.Stude("hi!");
    var32.setMetodoAvancado();
    Stude.MetodoDeEstudo var34 = var32.getMetodoDeEstudo();
    java.util.HashMap var35 = var32.desempenho();
    var32.setMetodoRegular();
    Stude.MetodoDeEstudo var37 = var32.getMetodoDeEstudo();
    var32.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var40 = var32.desempenho();
    boolean var41 = var29.equals((java.lang.Object)var40);
    var20.addDisciplina(var29);
    int var43 = var29.getCor();
    java.lang.String var44 = var29.getNome();
    var12.addDisciplina(var29);
    
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
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Metodo de estudo avancado"+ "'", var30.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo avancado"+ "'", var44.equals("Metodo de estudo avancado"));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test106");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    java.lang.String var8 = var4.toString();
    double var9 = var4.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test107");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var3 = new Stude.Cronograma();
    java.util.List var4 = var3.getDisciplinas();
    java.util.HashMap var5 = Stude.Desempenho.tempoDeEstudo(var4);
    boolean var6 = var2.equals((java.lang.Object)var5);
    var2.addHorasDeEstudo(1.0d);
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var11 = var2.toString();
    int var12 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test108");


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
    java.util.List var27 = var0.getDisciplinas();
    int var28 = var0.tamanhoDisciplinas();
    Stude.Stude var30 = new Stude.Stude("hi!");
    int var31 = var30.intervalo();
    Stude.Usuario var32 = var30.getUsuario();
    int var33 = var30.tempoDeEstudo();
    java.util.HashMap var34 = var30.desempenho();
    Stude.MetodoDeEstudo var35 = var30.getMetodoDeEstudo();
    Stude.Cronograma var36 = var30.getCronograma();
    int var37 = var36.tamanhoDisciplinas();
    Stude.Disciplina var40 = new Stude.Disciplina("hi!", 5);
    double var41 = var40.getHorasEstudadas();
    var40.addHorasDeEstudo(10.0d);
    var40.setCor(0);
    var36.addDisciplina(var40);
    var0.addDisciplina(var40);
    java.util.List var48 = var0.getDisciplinas();
    Stude.Stude var50 = new Stude.Stude("hi!");
    var50.setMetodoAvancado();
    Stude.MetodoDeEstudo var52 = var50.getMetodoDeEstudo();
    var50.setMetodoAvancado();
    var50.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var58 = var50.getDisciplina("Metodo de estudo regular");
    var58.setCor(100);
    Stude.Cronograma var61 = new Stude.Cronograma();
    java.util.List var62 = var61.getDisciplinas();
    Stude.Disciplina var64 = var61.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var66 = var61.getDisciplina("hi!");
    Stude.Disciplina var68 = var61.getDisciplina("");
    boolean var69 = var58.equals((java.lang.Object)"");
    int var70 = var58.getCor();
    var58.addHorasDeEstudo(100.0d);
    double var73 = var58.getHorasEstudadas();
    double var74 = var58.getHorasEstudadas();
    java.lang.String var75 = var58.getNome();
    var0.addDisciplina(var58);
    Stude.Disciplina var79 = new Stude.Disciplina("Metodo de estudo avancado", 5);
    java.lang.String var80 = var79.getNome();
    var0.addDisciplina(var79);
    var79.setCor(1);
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "Metodo de estudo regular"+ "'", var75.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "Metodo de estudo avancado"+ "'", var80.equals("Metodo de estudo avancado"));

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test109");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var8 = var1.getDisciplina("");
    int var9 = var1.tempoDeEstudo();
    var1.addDisciplina("hi!", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test110");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    Stude.Usuario var7 = var1.getUsuario();
    java.lang.String var8 = var7.getNome();
    var7.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test111");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Usuario var5 = var1.getUsuario();
    Stude.Usuario var6 = var1.getUsuario();
    var1.setMetodoRegular();
    java.util.List var8 = var1.getDisciplinas();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    Stude.Disciplina var12 = var9.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test112");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    int var10 = var0.getIntervalo();
    
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
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test113");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Disciplina var10 = var1.getDisciplina("");
    int var11 = var1.tempoDeEstudo();
    Stude.Usuario var12 = var1.getUsuario();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test114");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Usuario var7 = var1.getUsuario();
    var1.addDisciplina("hi!", 15);
    int var11 = var1.intervalo();
    java.util.HashMap var12 = var1.desempenho();
    Stude.Cronograma var13 = var1.getCronograma();
    java.util.HashMap var14 = var1.desempenho();
    
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
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test115");


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
    double var20 = var10.getHorasEstudadas();
    var10.setCor((-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test116");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", (-1));
    var2.addHorasDeEstudo(100.0d);
    java.lang.String var5 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test117");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getIntervalo();
    
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
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test118");


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
    java.lang.String var14 = var11.toString();
    double var15 = var11.getHorasEstudadas();
    var11.setCor(10);
    
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
    assertTrue(var15 == 0.0d);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test119");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Usuario var2 = var1.getUsuario();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var6 = var1.intervalo();
    Stude.Cronograma var7 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test120");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("hi!", (-1));
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
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
    assertNull(var9);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test121");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Disciplina var14 = var1.getDisciplina("");
    int var15 = var1.tempoDeEstudo();
    Stude.Cronograma var16 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test122");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    var2.setCor(2);
    int var10 = var2.getCor();
    int var11 = var2.getCor();
    java.lang.String var12 = var2.toString();
    double var13 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test123");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    java.util.List var5 = var1.getDisciplinas();
    var1.setNomeUsuario("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test124");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getTempo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test125");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Usuario var7 = var1.getUsuario();
    java.util.List var8 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 10);
    int var12 = var1.tempoDeEstudo();
    
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
    assertTrue(var12 == 15);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test126");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    int var7 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test127");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    Stude.Cronograma var11 = var1.getCronograma();
    java.util.List var12 = var11.getDisciplinas();
    java.util.List var13 = var11.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test128");


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
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    int var13 = var1.tempoDeEstudo();
    int var14 = var1.tempoDeEstudo();
    
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
    assertTrue(var13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test129");


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
    int var36 = var0.tamanhoDisciplinas();
    
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
    assertTrue(var36 == 2);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test130");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoAvancado();
    int var7 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Cronograma var10 = var1.getCronograma();
    int var11 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test131");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test132");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.List var8 = var1.getDisciplinas();
    java.util.HashMap var9 = Stude.Desempenho.tempoDeEstudo(var8);
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test133");


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
    Stude.Regular var26 = new Stude.Regular();
    java.lang.String var27 = var26.toString();
    java.lang.String var28 = var26.toString();
    int var29 = var26.getIntervalo();
    int var30 = var26.getIntervalo();
    boolean var31 = var11.equals((java.lang.Object)var30);
    var11.addHorasDeEstudo(11.0d);
    
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
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo regular"+ "'", var27.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test134");


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
    int var12 = var1.intervalo();
    int var13 = var1.intervalo();
    
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
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test135");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    
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
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test136");


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
    var2.addHorasDeEstudo(21.0d);
    
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

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test137");


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
    int var20 = var0.tamanhoDisciplinas();
    
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
    assertTrue(var20 == 1);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test138");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    java.util.HashMap var9 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test139");


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
    int var11 = var0.getIntervalo();
    int var12 = var0.getTempo();
    int var13 = var0.getIntervalo();
    java.lang.String var14 = var0.toString();
    
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
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test140");


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
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    int var15 = var1.tempoDeEstudo();
    int var16 = var1.tempoDeEstudo();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 30);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test141");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test142");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    java.lang.String var7 = var6.getNome();
    var6.setNome("hi!");
    var6.setNome("hi!");
    var6.setNome("Metodo de estudo avancado");
    var6.setNome("Metodo de estudo avancado");
    var6.setNome("Metodo de estudo regular");
    var6.setNome("Metodo de estudo regular");
    var6.setNome("Metodo de estudo avancado");
    
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
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test143");


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
    Stude.Cronograma var14 = var1.getCronograma();
    Stude.Usuario var15 = var1.getUsuario();
    
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
    assertNotNull(var15);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test144");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test145");


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
    Stude.Disciplina var59 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var59.setCor((-1));
    int var62 = var59.getCor();
    var59.addHorasDeEstudo(1.0d);
    Stude.Cronograma var65 = new Stude.Cronograma();
    Stude.Disciplina var67 = var65.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var69 = var65.getDisciplina("");
    Stude.Cronograma var70 = new Stude.Cronograma();
    java.util.List var71 = var70.getDisciplinas();
    Stude.Disciplina var73 = var70.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var75 = var70.getDisciplina("hi!");
    Stude.Disciplina var78 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var70.addDisciplina(var78);
    int var80 = var78.getCor();
    var65.addDisciplina(var78);
    var78.setNome("hi!");
    int var84 = var78.getCor();
    boolean var85 = var59.equals((java.lang.Object)var84);
    var7.addDisciplina(var59);
    double var87 = var59.getHorasEstudadas();
    
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
    assertTrue(var62 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 1.0d);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test146");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    Stude.Disciplina var6 = var1.getDisciplina("hi!");
    Stude.Usuario var7 = var1.getUsuario();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var1.removeDisciplina("Metodo de estudo regular");
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
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test147");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getIntervalo();
    int var10 = var0.getIntervalo();
    int var11 = var0.getIntervalo();
    
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
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test148");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    java.util.HashMap var10 = var1.desempenho();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test149");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    
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
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test150");


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
    int var30 = var0.tamanhoDisciplinas();
    java.util.List var31 = var0.getDisciplinas();
    int var32 = var0.tamanhoDisciplinas();
    
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
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test151");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    Stude.Cronograma var5 = var1.getCronograma();
    Stude.Cronograma var6 = new Stude.Cronograma();
    Stude.Disciplina var8 = var6.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var9 = new Stude.Cronograma();
    java.util.List var10 = var9.getDisciplinas();
    Stude.Disciplina var12 = var9.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var14 = var9.getDisciplina("hi!");
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var9.addDisciplina(var17);
    Stude.Disciplina var21 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var9.addDisciplina(var21);
    int var23 = var9.tamanhoDisciplinas();
    Stude.Disciplina var26 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var27 = var26.toString();
    var26.setCor(15);
    var26.setNome("Metodo de estudo regular");
    int var32 = var26.getCor();
    var9.addDisciplina(var26);
    var6.addDisciplina(var26);
    var5.addDisciplina(var26);
    java.util.List var36 = var5.getDisciplinas();
    Stude.Disciplina var38 = var5.getDisciplina("Metodo de estudo regular");
    int var39 = var5.tamanhoDisciplinas();
    Stude.Disciplina var41 = var5.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test152");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Cronograma var5 = var1.getCronograma();
    int var6 = var5.tamanhoDisciplinas();
    Stude.Disciplina var9 = new Stude.Disciplina("hi!", 30);
    var9.setCor(2);
    Stude.Stude var13 = new Stude.Stude("hi!");
    int var14 = var13.intervalo();
    Stude.Usuario var15 = var13.getUsuario();
    Stude.Cronograma var16 = var13.getCronograma();
    var13.setMetodoAvancado();
    Stude.Cronograma var18 = var13.getCronograma();
    java.util.List var19 = var18.getDisciplinas();
    boolean var20 = var9.equals((java.lang.Object)var19);
    java.lang.String var21 = var9.getNome();
    var5.addDisciplina(var9);
    int var23 = var5.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test153");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("hi!");
    int var8 = var2.getCor();
    double var9 = var2.getHorasEstudadas();
    double var10 = var2.getHorasEstudadas();
    var2.setNome("Metodo de estudo avancado");
    var2.addHorasDeEstudo(20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test154");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    double var7 = var2.getHorasEstudadas();
    java.lang.String var8 = var2.toString();
    Stude.Stude var10 = new Stude.Stude("hi!");
    var10.setMetodoAvancado();
    Stude.MetodoDeEstudo var12 = var10.getMetodoDeEstudo();
    java.util.HashMap var13 = var10.desempenho();
    var10.setMetodoRegular();
    java.util.HashMap var15 = var10.desempenho();
    Stude.Cronograma var16 = var10.getCronograma();
    java.util.List var17 = var16.getDisciplinas();
    boolean var18 = var2.equals((java.lang.Object)var17);
    java.util.HashMap var19 = Stude.Desempenho.tempoDeEstudo(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test155");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    
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
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test156");


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
    java.util.List var44 = var9.getDisciplinas();
    Stude.Stude var46 = new Stude.Stude("hi!");
    int var47 = var46.intervalo();
    var46.setNomeUsuario("Metodo de estudo regular");
    var46.setNomeUsuario("Metodo de estudo regular");
    int var52 = var46.tempoDeEstudo();
    Stude.Cronograma var53 = var46.getCronograma();
    Stude.Disciplina var55 = var53.getDisciplina("Metodo de estudo avancado");
    Stude.Stude var57 = new Stude.Stude("hi!");
    Stude.Cronograma var58 = var57.getCronograma();
    Stude.Cronograma var59 = var57.getCronograma();
    Stude.Disciplina var62 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var62.setCor((-1));
    int var65 = var62.getCor();
    var62.addHorasDeEstudo(1.0d);
    java.lang.String var68 = var62.getNome();
    Stude.Disciplina var71 = new Stude.Disciplina("hi!", 30);
    boolean var72 = var62.equals((java.lang.Object)var71);
    java.lang.String var73 = var71.getNome();
    var71.setNome("hi!");
    var59.addDisciplina(var71);
    Stude.Disciplina var79 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var79.setCor((-1));
    int var82 = var79.getCor();
    var79.addHorasDeEstudo(1.0d);
    java.lang.String var85 = var79.getNome();
    Stude.Disciplina var88 = new Stude.Disciplina("hi!", 30);
    boolean var89 = var79.equals((java.lang.Object)var88);
    java.lang.String var90 = var79.toString();
    var59.addDisciplina(var79);
    java.lang.String var92 = var79.toString();
    double var93 = var79.getHorasEstudadas();
    var79.setNome("Metodo de estudo regular");
    var53.addDisciplina(var79);
    var9.addDisciplina(var79);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "Metodo de estudo regular"+ "'", var68.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "Metodo de estudo regular"+ "'", var85.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "Metodo de estudo regular"+ "'", var90.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "Metodo de estudo regular"+ "'", var92.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 1.0d);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test157");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test158");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    java.util.List var9 = var1.getDisciplinas();
    var1.setMetodoRegular();
    var1.addDisciplina("Metodo de estudo avancado", 15);
    
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
    assertNotNull(var9);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test159");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    java.util.HashMap var6 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo avancado", 15);
    java.util.List var10 = var1.getDisciplinas();
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Disciplina var14 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var15 = var14.toString();
    var14.setCor(15);
    java.lang.String var18 = var14.getNome();
    Stude.Cronograma var19 = new Stude.Cronograma();
    Stude.Disciplina var21 = var19.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var23 = var19.getDisciplina("");
    java.util.List var24 = var19.getDisciplinas();
    boolean var25 = var14.equals((java.lang.Object)var19);
    Stude.Disciplina var28 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var29 = var28.toString();
    Stude.Stude var31 = new Stude.Stude("hi!");
    var31.setMetodoAvancado();
    Stude.MetodoDeEstudo var33 = var31.getMetodoDeEstudo();
    java.util.HashMap var34 = var31.desempenho();
    var31.setMetodoRegular();
    Stude.MetodoDeEstudo var36 = var31.getMetodoDeEstudo();
    var31.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var39 = var31.desempenho();
    boolean var40 = var28.equals((java.lang.Object)var39);
    var19.addDisciplina(var28);
    int var42 = var28.getCor();
    java.lang.String var43 = var28.getNome();
    Stude.Avancado var44 = new Stude.Avancado();
    java.lang.String var45 = var44.toString();
    java.lang.String var46 = var44.toString();
    int var47 = var44.getIntervalo();
    int var48 = var44.getIntervalo();
    int var49 = var44.getTempo();
    int var50 = var44.getTempo();
    int var51 = var44.getTempo();
    int var52 = var44.getIntervalo();
    java.lang.String var53 = var44.toString();
    boolean var54 = var28.equals((java.lang.Object)var53);
    var11.addDisciplina(var28);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo avancado"+ "'", var29.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Metodo de estudo avancado"+ "'", var43.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Metodo de estudo avancado"+ "'", var45.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Metodo de estudo avancado"+ "'", var46.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "Metodo de estudo avancado"+ "'", var53.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test160");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    int var6 = var1.tempoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var12 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    
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
    assertNotNull(var12);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test161");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    int var3 = var1.intervalo();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    int var6 = var1.intervalo();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test162");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNomeUsuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test163");


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
    Stude.Cronograma var13 = var1.getCronograma();
    int var14 = var1.tempoDeEstudo();
    java.util.HashMap var15 = var1.desempenho();
    Stude.Cronograma var16 = var1.getCronograma();
    
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

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test164");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    java.util.HashMap var6 = var1.desempenho();
    java.util.List var7 = var1.getDisciplinas();
    int var8 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Usuario var10 = var1.getUsuario();
    int var11 = var1.tempoDeEstudo();
    
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
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test165");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 15);
    
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

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test166");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Usuario var5 = var1.getUsuario();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test167");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    java.util.List var8 = var1.getDisciplinas();
    Stude.Usuario var9 = var1.getUsuario();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test168");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var24 = var12.removeDisciplina("Metodo de estudo avancado");
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
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test169");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("hi!");
    Stude.Cronograma var8 = new Stude.Cronograma();
    java.util.List var9 = var8.getDisciplinas();
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var9);
    boolean var11 = var2.equals((java.lang.Object)var9);
    var2.setCor(30);
    java.lang.String var14 = var2.toString();
    java.lang.String var15 = var2.toString();
    var2.addHorasDeEstudo(3.0d);
    
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
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test170");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var11 = var1.intervalo();
    Stude.Usuario var12 = var1.getUsuario();
    java.lang.String var13 = var12.getNome();
    var12.setNome("hi!");
    java.lang.String var16 = var12.getNome();
    java.lang.String var17 = var12.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test171");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoRegular();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var13 = var12.toString();
    var12.setCor(15);
    java.lang.String var16 = var12.getNome();
    Stude.Cronograma var17 = new Stude.Cronograma();
    Stude.Disciplina var19 = var17.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var21 = var17.getDisciplina("");
    java.util.List var22 = var17.getDisciplinas();
    boolean var23 = var12.equals((java.lang.Object)var17);
    Stude.Disciplina var26 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var27 = var26.toString();
    Stude.Stude var29 = new Stude.Stude("hi!");
    var29.setMetodoAvancado();
    Stude.MetodoDeEstudo var31 = var29.getMetodoDeEstudo();
    java.util.HashMap var32 = var29.desempenho();
    var29.setMetodoRegular();
    Stude.MetodoDeEstudo var34 = var29.getMetodoDeEstudo();
    var29.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var37 = var29.desempenho();
    boolean var38 = var26.equals((java.lang.Object)var37);
    var17.addDisciplina(var26);
    Stude.Disciplina var42 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var17.addDisciplina(var42);
    Stude.Disciplina var46 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var46.setCor((-1));
    int var49 = var46.getCor();
    var17.addDisciplina(var46);
    var46.setNome("hi!");
    var9.addDisciplina(var46);
    double var54 = var46.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test172");


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
    java.lang.String var36 = var23.toString();
    java.lang.String var37 = var23.toString();
    java.lang.String var38 = var23.toString();
    int var39 = var23.getCor();
    java.lang.String var40 = var23.getNome();
    
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
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo regular"+ "'", var36.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo regular"+ "'", var37.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo regular"+ "'", var38.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo regular"+ "'", var40.equals("Metodo de estudo regular"));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test173");


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
    java.lang.String var44 = var40.toString();
    var40.setCor((-1));
    
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
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo regular"+ "'", var44.equals("Metodo de estudo regular"));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test174");


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
    int var18 = var9.tamanhoDisciplinas();
    Stude.Disciplina var20 = var9.getDisciplina("hi!");
    
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
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test175");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    double var4 = var2.getHorasEstudadas();
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.toString();
    var2.setCor((-1));
    var2.addHorasDeEstudo(100.0d);
    var2.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test176");


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
    Stude.Disciplina var14 = var1.getDisciplina("");
    java.util.List var15 = var1.getDisciplinas();
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test177");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    
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
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test178");


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
    Stude.Disciplina var14 = var12.getDisciplina("Metodo de estudo regular");
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
    var35.setCor(30);
    var35.addHorasDeEstudo(1.0d);
    var12.addDisciplina(var35);
    java.lang.String var48 = var35.getNome();
    
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
    assertNull(var14);
    
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
    assertTrue("'" + var48 + "' != '" + "Metodo de estudo regular"+ "'", var48.equals("Metodo de estudo regular"));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test179");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 2);
    int var10 = var1.tempoDeEstudo();
    int var11 = var1.intervalo();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test180");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getIntervalo();
    
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
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test181");


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
    Stude.Disciplina var19 = var7.getDisciplina("hi!");
    java.util.List var20 = var7.getDisciplinas();
    java.util.HashMap var21 = Stude.Desempenho.tempoDeEstudo(var20);
    
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test182");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getIntervalo();
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
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test183");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    
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
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test184");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    int var9 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test185");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getIntervalo();
    int var13 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test186");


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
    Stude.Cronograma var14 = new Stude.Cronograma();
    java.util.List var15 = var14.getDisciplinas();
    Stude.Disciplina var17 = var14.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var19 = var14.getDisciplina("hi!");
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var14.addDisciplina(var22);
    var22.addHorasDeEstudo(1.0d);
    var4.addDisciplina(var22);
    int var27 = var4.tamanhoDisciplinas();
    Stude.Cronograma var28 = new Stude.Cronograma();
    Stude.Disciplina var30 = var28.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var32 = var28.getDisciplina("");
    Stude.Cronograma var33 = new Stude.Cronograma();
    java.util.List var34 = var33.getDisciplinas();
    Stude.Disciplina var36 = var33.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var38 = var33.getDisciplina("hi!");
    Stude.Disciplina var41 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var33.addDisciplina(var41);
    var41.addHorasDeEstudo(1.0d);
    var28.addDisciplina(var41);
    java.util.List var46 = var28.getDisciplinas();
    java.util.List var47 = var28.getDisciplinas();
    Stude.Disciplina var50 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var50.setCor((-1));
    java.lang.String var53 = var50.getNome();
    var50.setCor((-1));
    var50.setCor(0);
    int var58 = var50.getCor();
    var28.addDisciplina(var50);
    var50.setCor(30);
    java.lang.String var62 = var50.toString();
    var4.addDisciplina(var50);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "Metodo de estudo regular"+ "'", var53.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "Metodo de estudo regular"+ "'", var62.equals("Metodo de estudo regular"));

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test187");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    Stude.Stude var12 = new Stude.Stude("hi!");
    var12.setMetodoAvancado();
    Stude.MetodoDeEstudo var14 = var12.getMetodoDeEstudo();
    java.util.HashMap var15 = var12.desempenho();
    var12.setMetodoRegular();
    Stude.MetodoDeEstudo var17 = var12.getMetodoDeEstudo();
    var12.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var20 = var12.getCronograma();
    int var21 = var20.tamanhoDisciplinas();
    Stude.Disciplina var24 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var25 = var24.toString();
    java.lang.String var26 = var24.toString();
    java.lang.String var27 = var24.toString();
    var20.addDisciplina(var24);
    Stude.Disciplina var31 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var31.setCor((-1));
    var31.addHorasDeEstudo(10.0d);
    java.lang.String var36 = var31.getNome();
    var31.setNome("Metodo de estudo regular");
    var20.addDisciplina(var31);
    Stude.Stude var41 = new Stude.Stude("hi!");
    Stude.Cronograma var42 = var41.getCronograma();
    int var43 = var41.tempoDeEstudo();
    int var44 = var41.tempoDeEstudo();
    int var45 = var41.intervalo();
    var41.setMetodoAvancado();
    Stude.Cronograma var47 = var41.getCronograma();
    Stude.Disciplina var50 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var51 = var50.getHorasEstudadas();
    var50.setNome("hi!");
    var50.setNome("hi!");
    var47.addDisciplina(var50);
    var50.setCor(30);
    var20.addDisciplina(var50);
    var9.addDisciplina(var50);
    int var61 = var9.tamanhoDisciplinas();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo avancado"+ "'", var25.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo regular"+ "'", var36.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test188");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    java.util.List var14 = var0.getDisciplinas();
    java.util.List var15 = var0.getDisciplinas();
    java.util.HashMap var16 = Stude.Desempenho.tempoDeEstudo(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test189");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.addDisciplina("hi!", 0);
    int var10 = var1.intervalo();
    Stude.Disciplina var12 = var1.getDisciplina("Metodo de estudo regular");
    var1.addDisciplina("Metodo de estudo avancado", 4);
    var1.setNomeUsuario("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test190");


    Stude.Usuario var1 = new Stude.Usuario("Metodo de estudo regular");
    java.lang.String var2 = var1.getNome();
    var1.setNome("hi!");
    java.lang.String var5 = var1.getNome();
    var1.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test191");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoRegular();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test192");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var6 = var1.intervalo();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
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
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test193");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    java.util.List var8 = var0.getDisciplinas();
    Stude.Disciplina var10 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var0.getDisciplina("hi!");
    int var13 = var0.tamanhoDisciplinas();
    java.util.List var14 = var0.getDisciplinas();
    java.util.HashMap var15 = Stude.Desempenho.tempoDeEstudo(var14);
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test194");


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
    Stude.Disciplina var30 = var0.getDisciplina("");
    int var31 = var0.tamanhoDisciplinas();
    java.util.List var32 = var0.getDisciplinas();
    
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
    assertTrue(var31 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test195");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    int var11 = var0.getTempo();
    int var12 = var0.getTempo();
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test196");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    java.util.HashMap var7 = var1.desempenho();
    Stude.Usuario var8 = var1.getUsuario();
    var8.setNome("Metodo de estudo regular");
    
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

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test197");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    java.util.List var6 = var1.getDisciplinas();
    java.util.List var7 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test198");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", (-1));
    var1.setMetodoRegular();
    int var8 = var1.tempoDeEstudo();
    java.util.HashMap var9 = var1.desempenho();
    java.util.List var10 = var1.getDisciplinas();
    
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

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test199");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    int var9 = var1.tempoDeEstudo();
    java.util.List var10 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    Stude.Cronograma var13 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test200");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var6 = var1.desempenho();
    java.util.HashMap var7 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo avancado", 30);
    var1.setNomeUsuario("hi!");
    int var13 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("Metodo de estudo avancado", 30);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 30);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test201");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getIntervalo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getTempo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test202");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var1.tempoDeEstudo();
    Stude.Cronograma var11 = var1.getCronograma();
    var1.setMetodoRegular();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test203");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Disciplina var9 = var1.getDisciplina("");
    java.util.List var10 = var1.getDisciplinas();
    java.util.HashMap var11 = var1.desempenho();
    Stude.Usuario var12 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test204");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test205");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("hi!");
    java.util.List var12 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.Cronograma var14 = var1.getCronograma();
    int var15 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 30);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test206");


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
    var1.setNomeUsuario("hi!");
    java.util.List var19 = var1.getDisciplinas();
    Stude.Cronograma var20 = var1.getCronograma();
    int var21 = var1.intervalo();
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test207");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.addDisciplina("Metodo de estudo avancado", 4);
    Stude.Cronograma var9 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test208");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    Stude.Cronograma var9 = var1.getCronograma();
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
    java.util.List var12 = var1.getDisciplinas();
    
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
    assertNotNull(var12);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test209");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    int var8 = var1.intervalo();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo regular");
    java.util.HashMap var11 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test210");


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
    double var37 = var30.getHorasEstudadas();
    java.lang.String var38 = var30.getNome();
    java.lang.String var39 = var30.toString();
    
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
    assertTrue(var37 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo avancado"+ "'", var38.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo avancado"+ "'", var39.equals("Metodo de estudo avancado"));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test211");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    java.util.List var8 = var1.getDisciplinas();
    java.util.HashMap var9 = Stude.Desempenho.tempoDeEstudo(var8);
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var8);
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test212");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Usuario var7 = var1.getUsuario();
    var1.addDisciplina("hi!", 15);
    var1.addDisciplina("Metodo de estudo avancado", 5);
    int var14 = var1.tempoDeEstudo();
    Stude.Cronograma var15 = var1.getCronograma();
    var1.setMetodoRegular();
    
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
    assertTrue(var14 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test213");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var9 = var1.desempenho();
    Stude.Usuario var10 = var1.getUsuario();
    Stude.Cronograma var11 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 100);
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
    assertNotNull(var11);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test214");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    Stude.Cronograma var8 = var1.getCronograma();
    java.util.List var9 = var8.getDisciplinas();
    java.util.List var10 = var8.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test215");


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
    int var21 = var10.tempoDeEstudo();
    
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
    assertTrue(var21 == 15);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test216");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var9.setCor(100);
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var19 = var12.getDisciplina("");
    boolean var20 = var9.equals((java.lang.Object)"");
    int var21 = var9.getCor();
    var9.addHorasDeEstudo(100.0d);
    double var24 = var9.getHorasEstudadas();
    Stude.Disciplina var27 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var27.setCor((-1));
    java.lang.String var30 = var27.getNome();
    var27.setCor((-1));
    Stude.Disciplina var35 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var36 = var35.toString();
    var35.setCor(15);
    java.lang.String var39 = var35.getNome();
    Stude.Cronograma var40 = new Stude.Cronograma();
    Stude.Disciplina var42 = var40.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var44 = var40.getDisciplina("");
    java.util.List var45 = var40.getDisciplinas();
    boolean var46 = var35.equals((java.lang.Object)var40);
    Stude.Disciplina var49 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var50 = var49.toString();
    Stude.Stude var52 = new Stude.Stude("hi!");
    var52.setMetodoAvancado();
    Stude.MetodoDeEstudo var54 = var52.getMetodoDeEstudo();
    java.util.HashMap var55 = var52.desempenho();
    var52.setMetodoRegular();
    Stude.MetodoDeEstudo var57 = var52.getMetodoDeEstudo();
    var52.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var60 = var52.desempenho();
    boolean var61 = var49.equals((java.lang.Object)var60);
    var40.addDisciplina(var49);
    boolean var63 = var27.equals((java.lang.Object)var40);
    boolean var64 = var9.equals((java.lang.Object)var40);
    Stude.Disciplina var66 = var40.getDisciplina("Metodo de estudo regular");
    java.util.List var67 = var40.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Metodo de estudo regular"+ "'", var30.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo avancado"+ "'", var36.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo avancado"+ "'", var39.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Metodo de estudo avancado"+ "'", var50.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test217");


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
    int var12 = var0.getIntervalo();
    
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
    assertTrue(var12 == 5);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test218");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var5 = var1.intervalo();
    java.util.List var6 = var1.getDisciplinas();
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var11 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test219");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    var1.setNomeUsuario("Metodo de estudo avancado");
    java.util.HashMap var9 = var1.desempenho();
    int var10 = var1.intervalo();
    var1.setMetodoAvancado();
    java.util.HashMap var12 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo avancado", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test220");


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
    Stude.Disciplina var21 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var22 = var21.toString();
    var21.setCor(15);
    var21.setCor(15);
    Stude.Stude var28 = new Stude.Stude("hi!");
    var28.setMetodoAvancado();
    Stude.MetodoDeEstudo var30 = var28.getMetodoDeEstudo();
    java.util.HashMap var31 = var28.desempenho();
    var28.setMetodoRegular();
    java.util.List var33 = var28.getDisciplinas();
    java.util.HashMap var34 = var28.desempenho();
    int var35 = var28.intervalo();
    Stude.MetodoDeEstudo var36 = var28.getMetodoDeEstudo();
    boolean var37 = var21.equals((java.lang.Object)var36);
    var0.addDisciplina(var21);
    Stude.Disciplina var41 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var42 = var41.toString();
    java.lang.String var43 = var41.getNome();
    var0.addDisciplina(var41);
    java.util.List var45 = var0.getDisciplinas();
    Stude.Disciplina var48 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var49 = var48.toString();
    var48.setCor(15);
    java.lang.String var52 = var48.getNome();
    Stude.Cronograma var53 = new Stude.Cronograma();
    Stude.Disciplina var55 = var53.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var57 = var53.getDisciplina("");
    java.util.List var58 = var53.getDisciplinas();
    boolean var59 = var48.equals((java.lang.Object)var53);
    java.lang.String var60 = var48.toString();
    int var61 = var48.getCor();
    java.lang.String var62 = var48.getNome();
    Stude.Disciplina var65 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var66 = var65.getHorasEstudadas();
    double var67 = var65.getHorasEstudadas();
    java.lang.String var68 = var65.toString();
    boolean var69 = var48.equals((java.lang.Object)var65);
    var48.setCor(2);
    var0.addDisciplina(var48);
    int var73 = var48.getCor();
    var48.setCor(15);
    
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
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Metodo de estudo avancado"+ "'", var42.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Metodo de estudo avancado"+ "'", var43.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "Metodo de estudo avancado"+ "'", var49.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Metodo de estudo avancado"+ "'", var52.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "Metodo de estudo avancado"+ "'", var60.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "Metodo de estudo avancado"+ "'", var62.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "Metodo de estudo regular"+ "'", var68.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 2);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test221");


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
    Stude.Disciplina var37 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var37.setCor((-1));
    int var40 = var37.getCor();
    var37.addHorasDeEstudo(1.0d);
    java.lang.String var43 = var37.getNome();
    Stude.Disciplina var46 = new Stude.Disciplina("hi!", 30);
    boolean var47 = var37.equals((java.lang.Object)var46);
    var37.setNome("Metodo de estudo regular");
    Stude.Stude var51 = new Stude.Stude("hi!");
    var51.setMetodoAvancado();
    Stude.MetodoDeEstudo var53 = var51.getMetodoDeEstudo();
    java.util.HashMap var54 = var51.desempenho();
    var51.setMetodoRegular();
    Stude.MetodoDeEstudo var56 = var51.getMetodoDeEstudo();
    boolean var57 = var37.equals((java.lang.Object)var56);
    boolean var58 = var34.equals((java.lang.Object)var56);
    Stude.Stude var60 = new Stude.Stude("hi!");
    var60.setMetodoAvancado();
    Stude.MetodoDeEstudo var62 = var60.getMetodoDeEstudo();
    java.util.HashMap var63 = var60.desempenho();
    var60.setMetodoRegular();
    Stude.MetodoDeEstudo var65 = var60.getMetodoDeEstudo();
    java.util.HashMap var66 = var60.desempenho();
    java.util.HashMap var67 = var60.desempenho();
    boolean var68 = var34.equals((java.lang.Object)var67);
    
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
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Metodo de estudo regular"+ "'", var43.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test222");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    Stude.Disciplina var10 = var1.getDisciplina("hi!");
    Stude.Cronograma var11 = var1.getCronograma();
    java.util.List var12 = var11.getDisciplinas();
    
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
    assertNotNull(var12);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test223");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Stude var15 = new Stude.Stude("hi!");
    var15.setMetodoAvancado();
    Stude.MetodoDeEstudo var17 = var15.getMetodoDeEstudo();
    java.util.HashMap var18 = var15.desempenho();
    var15.setMetodoRegular();
    Stude.MetodoDeEstudo var20 = var15.getMetodoDeEstudo();
    boolean var21 = var2.equals((java.lang.Object)var15);
    java.util.List var22 = var15.getDisciplinas();
    var15.setNomeUsuario("Metodo de estudo regular");
    var15.addDisciplina("Metodo de estudo avancado", 5);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test224");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    var15.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var15);
    int var20 = var0.tamanhoDisciplinas();
    java.util.List var21 = var0.getDisciplinas();
    java.util.HashMap var22 = Stude.Desempenho.tempoDeEstudo(var21);
    java.util.HashMap var23 = Stude.Desempenho.tempoDeEstudo(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test225");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    var2.setNome("Metodo de estudo avancado");
    var2.setNome("hi!");
    java.lang.String var12 = var2.getNome();
    int var13 = var2.getCor();
    var2.addHorasDeEstudo(11.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test226");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var5 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test227");


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
    java.util.List var13 = var10.getDisciplinas();
    Stude.Disciplina var15 = var10.getDisciplina("Metodo de estudo avancado");
    
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
    assertNull(var15);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test228");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test229");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var11 = var10.toString();
    var10.setCor(15);
    var10.setNome("Metodo de estudo regular");
    int var16 = var10.getCor();
    var0.addDisciplina(var10);
    double var18 = var10.getHorasEstudadas();
    var10.setCor(3);
    
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
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test230");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    java.lang.String var14 = var12.getNome();
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    var16.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var24 = var16.getMetodoDeEstudo();
    Stude.Cronograma var25 = var16.getCronograma();
    boolean var26 = var12.equals((java.lang.Object)var25);
    var12.addHorasDeEstudo(1.0d);
    var12.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test231");


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
    java.lang.String var10 = var0.toString();
    int var11 = var0.getTempo();
    
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
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test232");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getTempo();
    java.lang.String var11 = var0.toString();
    
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
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test233");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    var2.setCor(2);
    int var10 = var2.getCor();
    int var11 = var2.getCor();
    java.lang.String var12 = var2.toString();
    var2.setCor(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test234");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    
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
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test235");


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
    var32.setNome("hi!");
    Stude.Stude var48 = new Stude.Stude("hi!");
    var48.setMetodoAvancado();
    Stude.MetodoDeEstudo var50 = var48.getMetodoDeEstudo();
    java.util.HashMap var51 = var48.desempenho();
    var48.setMetodoRegular();
    java.util.HashMap var53 = var48.desempenho();
    var48.setMetodoRegular();
    java.util.List var55 = var48.getDisciplinas();
    java.util.HashMap var56 = var48.desempenho();
    boolean var57 = var32.equals((java.lang.Object)var56);
    java.lang.String var58 = var32.toString();
    
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
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "hi!"+ "'", var58.equals("hi!"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test236");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    double var6 = var2.getHorasEstudadas();
    var2.setNome("Metodo de estudo avancado");
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var11.setCor((-1));
    java.lang.String var14 = var11.getNome();
    var11.setCor((-1));
    Stude.Stude var18 = new Stude.Stude("hi!");
    var18.setMetodoRegular();
    Stude.MetodoDeEstudo var20 = var18.getMetodoDeEstudo();
    var18.setMetodoAvancado();
    var18.setMetodoAvancado();
    boolean var23 = var11.equals((java.lang.Object)var18);
    boolean var24 = var2.equals((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test237");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    double var10 = var8.getHorasEstudadas();
    var8.setCor((-1));
    java.lang.String var13 = var8.toString();
    java.lang.String var14 = var8.toString();
    var8.setCor(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test238");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.Disciplina var4 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var6 = var1.getDisciplina("");
    Stude.Usuario var7 = var1.getUsuario();
    var7.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test239");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    int var11 = var1.tempoDeEstudo();
    java.util.List var12 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.Usuario var14 = var1.getUsuario();
    Stude.Cronograma var15 = var1.getCronograma();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo avancado");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test240");


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
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var26 = new Stude.Stude("hi!");
    int var27 = var26.intervalo();
    Stude.Usuario var28 = var26.getUsuario();
    var26.setMetodoRegular();
    var26.setMetodoRegular();
    Stude.Usuario var31 = var26.getUsuario();
    java.util.List var32 = var26.getDisciplinas();
    Stude.Disciplina var34 = var26.getDisciplina("");
    Stude.Disciplina var36 = var26.getDisciplina("Metodo de estudo avancado");
    var26.addDisciplina("hi!", 15);
    boolean var40 = var24.equals((java.lang.Object)"hi!");
    var24.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test241");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Usuario var6 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var9 = var1.desempenho();
    Stude.Disciplina var11 = var1.getDisciplina("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test242");


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
    java.lang.String var17 = var11.getNome();
    
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
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test243");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    var2.setCor((-1));
    var2.setCor(3);
    var2.setNome("Metodo de estudo regular");
    int var11 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test244");


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
    Stude.Disciplina var21 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var22 = var21.toString();
    java.lang.String var23 = var21.toString();
    java.lang.String var24 = var21.toString();
    var21.setNome("hi!");
    Stude.Stude var28 = new Stude.Stude("hi!");
    int var29 = var28.intervalo();
    Stude.Usuario var30 = var28.getUsuario();
    var28.setMetodoRegular();
    var28.setNomeUsuario("Metodo de estudo regular");
    boolean var34 = var21.equals((java.lang.Object)var28);
    int var35 = var21.getCor();
    var21.addHorasDeEstudo(100.0d);
    boolean var38 = var11.equals((java.lang.Object)var21);
    Stude.Stude var40 = new Stude.Stude("hi!");
    int var41 = var40.intervalo();
    Stude.Usuario var42 = var40.getUsuario();
    Stude.Cronograma var43 = var40.getCronograma();
    java.util.HashMap var44 = var40.desempenho();
    var40.setMetodoRegular();
    var40.setMetodoAvancado();
    int var47 = var40.tempoDeEstudo();
    var40.setMetodoRegular();
    boolean var49 = var21.equals((java.lang.Object)var40);
    
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
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo avancado"+ "'", var24.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test245");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    var2.setCor(2);
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var12 = var11.toString();
    var11.setCor(15);
    var11.setNome("Metodo de estudo regular");
    int var17 = var11.getCor();
    java.lang.String var18 = var11.toString();
    var11.setNome("Metodo de estudo regular");
    boolean var21 = var2.equals((java.lang.Object)var11);
    double var22 = var11.getHorasEstudadas();
    var11.setCor(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test246");


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
    Stude.Usuario var18 = var1.getUsuario();
    var18.setNome("hi!");
    java.lang.String var21 = var18.getNome();
    
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
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test247");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    
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
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test248");


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
    java.lang.String var13 = var12.getNome();
    
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
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test249");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.List var8 = var1.getDisciplinas();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setNomeUsuario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test250");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.Disciplina var9 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    var6.addDisciplina(var9);
    var9.setNome("hi!");
    java.lang.String var13 = var9.toString();
    var9.setNome("Metodo de estudo regular");
    int var16 = var9.getCor();
    var9.addHorasDeEstudo(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test251");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    int var10 = var1.tempoDeEstudo();
    java.util.HashMap var11 = var1.desempenho();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test252");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
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
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test253");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setNomeUsuario("Metodo de estudo avancado");
    int var9 = var1.intervalo();
    var1.setMetodoAvancado();
    java.util.List var11 = var1.getDisciplinas();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test254");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var11 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.MetodoDeEstudo var14 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test255");


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
    java.lang.String var22 = var13.toString();
    var13.setCor(4);
    
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
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test256");


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
    int var47 = var0.tamanhoDisciplinas();
    
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
    assertTrue(var47 == 3);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test257");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.List var4 = var1.getDisciplinas();
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    int var9 = var1.tempoDeEstudo();
    var1.addDisciplina("hi!", 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test258");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    var1.setMetodoRegular();
    var1.addDisciplina("Metodo de estudo regular", 3);
    Stude.Disciplina var13 = var1.getDisciplina("Metodo de estudo regular");
    double var14 = var13.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test259");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Usuario var8 = var1.getUsuario();
    var8.setNome("Metodo de estudo avancado");
    java.lang.String var11 = var8.getNome();
    
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
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test260");


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
    Stude.Cronograma var13 = var1.getCronograma();
    java.util.List var14 = var13.getDisciplinas();
    int var15 = var13.tamanhoDisciplinas();
    int var16 = var13.tamanhoDisciplinas();
    Stude.Disciplina var19 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var19.setCor((-1));
    int var22 = var19.getCor();
    var19.addHorasDeEstudo(1.0d);
    double var25 = var19.getHorasEstudadas();
    java.lang.String var26 = var19.toString();
    Stude.Stude var28 = new Stude.Stude("hi!");
    int var29 = var28.intervalo();
    Stude.Usuario var30 = var28.getUsuario();
    Stude.Cronograma var31 = var28.getCronograma();
    var28.setNomeUsuario("Metodo de estudo avancado");
    java.util.HashMap var34 = var28.desempenho();
    Stude.MetodoDeEstudo var35 = var28.getMetodoDeEstudo();
    boolean var36 = var19.equals((java.lang.Object)var35);
    Stude.Disciplina var39 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var39.setCor((-1));
    var39.addHorasDeEstudo(10.0d);
    java.lang.String var44 = var39.getNome();
    int var45 = var39.getCor();
    boolean var46 = var19.equals((java.lang.Object)var39);
    var13.addDisciplina(var39);
    var39.setCor(15);
    
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
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo regular"+ "'", var44.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test261");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    var5.setMetodoAvancado();
    Stude.Cronograma var9 = var5.getCronograma();
    boolean var10 = var2.equals((java.lang.Object)var5);
    var5.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.addDisciplina("", 5);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test262");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    int var6 = var0.tamanhoDisciplinas();
    Stude.Disciplina var8 = var0.getDisciplina("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.removeDisciplina("Metodo de estudo avancado");
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
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test263");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var9 = var1.getCronograma();
    var1.setMetodoRegular();
    Stude.Usuario var11 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test264");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test265");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("hi!", (-1));
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Disciplina var13 = new Stude.Disciplina("hi!", 5);
    double var14 = var13.getHorasEstudadas();
    var13.addHorasDeEstudo(20.0d);
    java.lang.String var17 = var13.toString();
    int var18 = var13.getCor();
    var10.addDisciplina(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test266");


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
    java.util.HashMap var19 = var10.desempenho();
    java.util.List var20 = var10.getDisciplinas();
    var10.setMetodoAvancado();
    
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

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test267");


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
    java.lang.String var17 = var13.toString();
    java.lang.String var18 = var13.toString();
    java.lang.String var19 = var13.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test268");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Stude var4 = new Stude.Stude("hi!");
    int var5 = var4.intervalo();
    Stude.Usuario var6 = var4.getUsuario();
    Stude.Cronograma var7 = var4.getCronograma();
    Stude.Disciplina var9 = var7.getDisciplina("hi!");
    Stude.Cronograma var10 = new Stude.Cronograma();
    java.util.List var11 = var10.getDisciplinas();
    Stude.Disciplina var13 = var10.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var15 = var10.getDisciplina("hi!");
    Stude.Disciplina var18 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var10.addDisciplina(var18);
    double var20 = var18.getHorasEstudadas();
    var18.setCor(2);
    var7.addDisciplina(var18);
    var2.addDisciplina(var18);
    Stude.Disciplina var27 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var27.setCor((-1));
    int var30 = var27.getCor();
    var27.addHorasDeEstudo(1.0d);
    java.lang.String var33 = var27.getNome();
    double var34 = var27.getHorasEstudadas();
    var2.addDisciplina(var27);
    Stude.Cronograma var36 = new Stude.Cronograma();
    int var37 = var36.tamanhoDisciplinas();
    Stude.Disciplina var40 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var41 = var40.getHorasEstudadas();
    double var42 = var40.getHorasEstudadas();
    var36.addDisciplina(var40);
    Stude.Disciplina var45 = var36.getDisciplina("hi!");
    Stude.Disciplina var48 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var48.setCor((-1));
    java.lang.String var51 = var48.getNome();
    var36.addDisciplina(var48);
    var48.addHorasDeEstudo(11.0d);
    var2.addDisciplina(var48);
    Stude.Cronograma var56 = new Stude.Cronograma();
    Stude.Disciplina var58 = var56.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var60 = var56.getDisciplina("");
    Stude.Cronograma var61 = new Stude.Cronograma();
    java.util.List var62 = var61.getDisciplinas();
    Stude.Disciplina var64 = var61.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var66 = var61.getDisciplina("hi!");
    Stude.Disciplina var69 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var61.addDisciplina(var69);
    int var71 = var69.getCor();
    var56.addDisciplina(var69);
    java.lang.String var73 = var69.getNome();
    var69.setCor(100);
    var69.addHorasDeEstudo(20.0d);
    double var78 = var69.getHorasEstudadas();
    var2.addDisciplina(var69);
    int var80 = var2.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo regular"+ "'", var33.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "Metodo de estudo regular"+ "'", var51.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "Metodo de estudo regular"+ "'", var73.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 4);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test269");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getTempo();
    int var11 = var0.getTempo();
    int var12 = var0.getTempo();
    
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
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test270");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("hi!");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var8 = var7.toString();
    var7.setCor(15);
    var7.setCor(15);
    var2.addDisciplina(var7);
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var17 = var16.getHorasEstudadas();
    var16.setNome("hi!");
    var16.setNome("hi!");
    var16.setCor((-1));
    var16.setCor(1);
    var2.addDisciplina(var16);
    Stude.Stude var28 = new Stude.Stude("hi!");
    var28.setMetodoAvancado();
    Stude.MetodoDeEstudo var30 = var28.getMetodoDeEstudo();
    var28.setMetodoAvancado();
    java.util.List var32 = var28.getDisciplinas();
    java.util.HashMap var33 = var28.desempenho();
    java.util.HashMap var34 = var28.desempenho();
    Stude.MetodoDeEstudo var35 = var28.getMetodoDeEstudo();
    boolean var36 = var16.equals((java.lang.Object)var35);
    Stude.Disciplina var39 = new Stude.Disciplina("hi!", 5);
    double var40 = var39.getHorasEstudadas();
    var39.addHorasDeEstudo(10.0d);
    double var43 = var39.getHorasEstudadas();
    var39.addHorasDeEstudo(20.0d);
    var39.setNome("Metodo de estudo avancado");
    boolean var48 = var16.equals((java.lang.Object)var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test271");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 100);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test272");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var5 = var1.intervalo();
    java.util.List var6 = var1.getDisciplinas();
    int var7 = var1.tempoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    Stude.Disciplina var12 = var1.getDisciplina("");
    Stude.MetodoDeEstudo var13 = var1.getMetodoDeEstudo();
    int var14 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 30);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test273");


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
    java.lang.String var20 = var19.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var19.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
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
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test274");


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
    var10.addDisciplina("Metodo de estudo avancado", 100);
    var10.setMetodoAvancado();
    
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

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test275");


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
    int var17 = var1.tempoDeEstudo();
    int var18 = var1.tempoDeEstudo();
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 30);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test276");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 1);
    var0.addDisciplina(var4);
    int var6 = var0.tamanhoDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var10.setCor((-1));
    int var13 = var10.getCor();
    var10.addHorasDeEstudo(1.0d);
    java.lang.String var16 = var10.getNome();
    Stude.Disciplina var19 = new Stude.Disciplina("hi!", 30);
    boolean var20 = var10.equals((java.lang.Object)var19);
    java.lang.String var21 = var10.toString();
    var0.addDisciplina(var10);
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo regular"+ "'", var21.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test277");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var4 = var0.getDisciplinas();
    int var5 = var0.tamanhoDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    java.util.List var7 = var0.getDisciplinas();
    java.util.List var8 = var0.getDisciplinas();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test278");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo avancado");
    int var13 = var1.intervalo();
    Stude.Usuario var14 = var1.getUsuario();
    java.lang.String var15 = var14.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test279");


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
    Stude.Stude var79 = new Stude.Stude("hi!");
    int var80 = var79.intervalo();
    Stude.Usuario var81 = var79.getUsuario();
    int var82 = var79.tempoDeEstudo();
    java.util.HashMap var83 = var79.desempenho();
    Stude.MetodoDeEstudo var84 = var79.getMetodoDeEstudo();
    java.util.List var85 = var79.getDisciplinas();
    boolean var86 = var69.equals((java.lang.Object)var79);
    Stude.Cronograma var87 = var79.getCronograma();
    Stude.Cronograma var88 = var79.getCronograma();
    Stude.Usuario var89 = var79.getUsuario();
    java.util.List var90 = var79.getDisciplinas();
    
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
    assertTrue(var80 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test280");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var4.tamanhoDisciplinas();
    Stude.Disciplina var7 = var4.getDisciplina("Metodo de estudo regular");
    int var8 = var4.tamanhoDisciplinas();
    Stude.Disciplina var10 = var4.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var13 = new Stude.Disciplina("hi!", (-1));
    var4.addDisciplina(var13);
    var13.setCor(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test281");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    int var9 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
    java.util.List var12 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test282");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    var1.setMetodoAvancado();
    Stude.Disciplina var12 = var1.getDisciplina("hi!");
    Stude.Cronograma var13 = var1.getCronograma();
    java.util.HashMap var14 = var1.desempenho();
    Stude.Cronograma var15 = var1.getCronograma();
    Stude.Stude var17 = new Stude.Stude("hi!");
    int var18 = var17.intervalo();
    Stude.Usuario var19 = var17.getUsuario();
    Stude.Cronograma var20 = var17.getCronograma();
    var17.setMetodoAvancado();
    Stude.Cronograma var22 = var17.getCronograma();
    Stude.Cronograma var23 = new Stude.Cronograma();
    int var24 = var23.tamanhoDisciplinas();
    Stude.Disciplina var27 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var28 = var27.getHorasEstudadas();
    double var29 = var27.getHorasEstudadas();
    var23.addDisciplina(var27);
    var27.setCor(15);
    var22.addDisciplina(var27);
    java.lang.String var34 = var27.getNome();
    java.lang.String var35 = var27.toString();
    var15.addDisciplina(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Metodo de estudo regular"+ "'", var35.equals("Metodo de estudo regular"));

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test283");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var5 = var1.getCronograma();
    java.util.List var6 = var5.getDisciplinas();
    java.util.HashMap var7 = Stude.Desempenho.tempoDeEstudo(var6);
    java.util.HashMap var8 = Stude.Desempenho.tempoDeEstudo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test284");


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
    var1.setMetodoAvancado();
    Stude.Usuario var14 = var1.getUsuario();
    java.lang.String var15 = var14.getNome();
    java.lang.String var16 = var14.getNome();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test285");


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
    int var21 = var6.tamanhoDisciplinas();
    Stude.Cronograma var22 = new Stude.Cronograma();
    java.util.List var23 = var22.getDisciplinas();
    Stude.Disciplina var25 = var22.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var27 = var22.getDisciplina("hi!");
    java.util.List var28 = var22.getDisciplinas();
    int var29 = var22.tamanhoDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var33 = var32.toString();
    var32.setCor(15);
    var32.setNome("Metodo de estudo regular");
    int var38 = var32.getCor();
    var22.addDisciplina(var32);
    Stude.Disciplina var42 = new Stude.Disciplina("hi!", 30);
    var42.setCor(2);
    int var45 = var42.getCor();
    java.lang.String var46 = var42.toString();
    java.lang.String var47 = var42.toString();
    double var48 = var42.getHorasEstudadas();
    var22.addDisciplina(var42);
    var6.addDisciplina(var42);
    
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
    assertTrue(var21 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo avancado"+ "'", var33.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi!"+ "'", var46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0.0d);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test286");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    int var5 = var1.tempoDeEstudo();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    int var8 = var1.intervalo();
    Stude.Usuario var9 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test287");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setCor(15);
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.getNome();
    double var11 = var2.getHorasEstudadas();
    java.lang.String var12 = var2.getNome();
    double var13 = var2.getHorasEstudadas();
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
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test288");


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
    java.util.List var18 = var7.getDisciplinas();
    
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
    assertNotNull(var18);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test289");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.getNome();
    int var8 = var2.getCor();
    java.lang.String var9 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setNome("");
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
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test290");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.List var10 = var1.getDisciplinas();
    var1.addDisciplina("hi!", (-1));
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var18 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 15);
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
    assertTrue(var18 == 5);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test291");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.List var10 = var1.getDisciplinas();
    var1.addDisciplina("hi!", (-1));
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var18 = var1.intervalo();
    Stude.Usuario var19 = var1.getUsuario();
    var1.setNomeUsuario("hi!");
    java.util.List var22 = var1.getDisciplinas();
    
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
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test292");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    int var8 = var1.intervalo();
    java.util.HashMap var9 = var1.desempenho();
    int var10 = var1.intervalo();
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Disciplina var14 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var15 = var14.getCor();
    java.lang.String var16 = var14.getNome();
    var11.addDisciplina(var14);
    
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
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test293");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getIntervalo();
    int var10 = var0.getIntervalo();
    int var11 = var0.getIntervalo();
    int var12 = var0.getIntervalo();
    int var13 = var0.getTempo();
    
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
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test294");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Usuario var7 = var1.getUsuario();
    java.util.List var8 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 10);
    Stude.Disciplina var13 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoAvancado();
    java.util.List var15 = var1.getDisciplinas();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test295");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var9 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var10 = var0.getDisciplinas();
    int var11 = var0.tamanhoDisciplinas();
    Stude.Stude var13 = new Stude.Stude("hi!");
    var13.setMetodoAvancado();
    Stude.MetodoDeEstudo var15 = var13.getMetodoDeEstudo();
    java.util.HashMap var16 = var13.desempenho();
    var13.setMetodoRegular();
    Stude.MetodoDeEstudo var18 = var13.getMetodoDeEstudo();
    var13.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var21 = var13.getCronograma();
    Stude.Disciplina var23 = var13.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var24 = var13.getCronograma();
    Stude.Disciplina var27 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var28 = var27.toString();
    var27.setCor(15);
    java.lang.String var31 = var27.getNome();
    boolean var33 = var27.equals((java.lang.Object)(byte)100);
    java.lang.String var34 = var27.toString();
    var24.addDisciplina(var27);
    Stude.Disciplina var38 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var38.addHorasDeEstudo(10.0d);
    java.lang.String var41 = var38.toString();
    var24.addDisciplina(var38);
    var0.addDisciplina(var38);
    Stude.Disciplina var45 = var0.getDisciplina("Metodo de estudo regular");
    double var46 = var45.getHorasEstudadas();
    double var47 = var45.getHorasEstudadas();
    double var48 = var45.getHorasEstudadas();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo avancado"+ "'", var28.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo avancado"+ "'", var34.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo regular"+ "'", var41.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 10.0d);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test296");


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
    int var45 = var2.getCor();
    var2.setCor((-1));
    int var48 = var2.getCor();
    var2.setCor(0);
    
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
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test297");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("");
    java.util.List var9 = var1.getDisciplinas();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Stude var12 = new Stude.Stude("hi!");
    Stude.Cronograma var13 = var12.getCronograma();
    int var14 = var12.tempoDeEstudo();
    int var15 = var12.tempoDeEstudo();
    int var16 = var12.intervalo();
    var12.setMetodoAvancado();
    Stude.Cronograma var18 = var12.getCronograma();
    Stude.Disciplina var21 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var21.setCor((-1));
    java.lang.String var24 = var21.getNome();
    java.lang.String var25 = var21.getNome();
    int var26 = var21.getCor();
    java.lang.String var27 = var21.getNome();
    var18.addDisciplina(var21);
    java.lang.String var29 = var21.getNome();
    Stude.Stude var31 = new Stude.Stude("hi!");
    var31.setMetodoAvancado();
    Stude.MetodoDeEstudo var33 = var31.getMetodoDeEstudo();
    java.util.HashMap var34 = var31.desempenho();
    var31.setMetodoRegular();
    java.util.List var36 = var31.getDisciplinas();
    var31.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var40 = var31.getMetodoDeEstudo();
    java.util.HashMap var41 = var31.desempenho();
    var31.setNomeUsuario("Metodo de estudo regular");
    boolean var44 = var21.equals((java.lang.Object)var31);
    Stude.Stude var46 = new Stude.Stude("hi!");
    Stude.Cronograma var47 = var46.getCronograma();
    Stude.Cronograma var48 = var46.getCronograma();
    java.util.List var49 = var48.getDisciplinas();
    boolean var50 = var21.equals((java.lang.Object)var49);
    var10.addDisciplina(var21);
    double var52 = var21.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo regular"+ "'", var27.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test298");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    java.lang.String var10 = var8.toString();
    var8.addHorasDeEstudo(1.0d);
    var8.setCor(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test299");


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
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Usuario var21 = var1.getUsuario();
    Stude.Usuario var22 = var1.getUsuario();
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test300");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.List var4 = var1.getDisciplinas();
    int var5 = var1.intervalo();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    java.util.List var10 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test301");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    java.util.List var6 = var1.getDisciplinas();
    var1.setMetodoRegular();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    int var10 = var1.intervalo();
    int var11 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test302");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    var2.setCor(2);
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var12 = var11.toString();
    var11.setCor(15);
    var11.setNome("Metodo de estudo regular");
    int var17 = var11.getCor();
    java.lang.String var18 = var11.toString();
    var11.setNome("Metodo de estudo regular");
    boolean var21 = var2.equals((java.lang.Object)var11);
    java.lang.String var22 = var2.toString();
    var2.addHorasDeEstudo(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test303");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    var2.addHorasDeEstudo(3.0d);
    int var10 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test304");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var9 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var10 = var0.getDisciplinas();
    int var11 = var0.tamanhoDisciplinas();
    java.util.List var12 = var0.getDisciplinas();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test305");


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
    Stude.Usuario var40 = var29.getUsuario();
    
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
    assertNotNull(var40);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test306");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    int var4 = var2.getCor();
    var2.addHorasDeEstudo(20.0d);
    int var7 = var2.getCor();
    java.lang.String var8 = var2.getNome();
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test307");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var4.tamanhoDisciplinas();
    Stude.Disciplina var7 = var4.getDisciplina("Metodo de estudo regular");
    int var8 = var4.tamanhoDisciplinas();
    int var9 = var4.tamanhoDisciplinas();
    Stude.Cronograma var10 = new Stude.Cronograma();
    int var11 = var10.tamanhoDisciplinas();
    Stude.Cronograma var12 = new Stude.Cronograma();
    Stude.Disciplina var14 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var16 = var12.getDisciplina("");
    Stude.Cronograma var17 = new Stude.Cronograma();
    java.util.List var18 = var17.getDisciplinas();
    Stude.Disciplina var20 = var17.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var22 = var17.getDisciplina("hi!");
    Stude.Disciplina var25 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.addDisciplina(var25);
    int var27 = var25.getCor();
    var12.addDisciplina(var25);
    var10.addDisciplina(var25);
    var25.setCor(0);
    var4.addDisciplina(var25);
    Stude.Cronograma var33 = new Stude.Cronograma();
    Stude.Disciplina var35 = var33.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var37 = var33.getDisciplina("");
    Stude.Cronograma var38 = new Stude.Cronograma();
    java.util.List var39 = var38.getDisciplinas();
    Stude.Disciplina var41 = var38.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var43 = var38.getDisciplina("hi!");
    Stude.Disciplina var46 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var38.addDisciplina(var46);
    int var48 = var46.getCor();
    var33.addDisciplina(var46);
    var46.setNome("hi!");
    java.lang.String var52 = var46.toString();
    Stude.Avancado var53 = new Stude.Avancado();
    java.lang.String var54 = var53.toString();
    java.lang.String var55 = var53.toString();
    int var56 = var53.getIntervalo();
    java.lang.String var57 = var53.toString();
    int var58 = var53.getTempo();
    int var59 = var53.getIntervalo();
    int var60 = var53.getTempo();
    boolean var61 = var46.equals((java.lang.Object)var60);
    var46.setCor(2);
    var46.addHorasDeEstudo(1.0d);
    var46.setNome("Metodo de estudo regular");
    boolean var68 = var25.equals((java.lang.Object)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "Metodo de estudo avancado"+ "'", var54.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Metodo de estudo avancado"+ "'", var55.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "Metodo de estudo avancado"+ "'", var57.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test308");


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
    java.lang.String var28 = var15.toString();
    var15.setCor(3);
    java.lang.String var31 = var15.getNome();
    
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
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo regular"+ "'", var31.equals("Metodo de estudo regular"));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test309");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    var2.addHorasDeEstudo(1.0d);
    int var9 = var2.getCor();
    int var10 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test310");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.List var14 = var1.getDisciplinas();
    Stude.Disciplina var16 = var1.getDisciplina("Metodo de estudo avancado");
    int var17 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test311");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test312");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    int var6 = var1.intervalo();
    int var7 = var1.intervalo();
    var1.setMetodoRegular();
    java.util.HashMap var9 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test313");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    java.lang.String var10 = var0.toString();
    
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
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test314");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test315");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    int var10 = var0.getIntervalo();
    int var11 = var0.getIntervalo();
    
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
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test316");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    var2.setCor(2);
    var2.setCor(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test317");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    int var7 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    java.util.List var10 = var1.getDisciplinas();
    
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
    assertNotNull(var10);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test318");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    Stude.Stude var15 = new Stude.Stude("hi!");
    Stude.Cronograma var16 = var15.getCronograma();
    Stude.Usuario var17 = var15.getUsuario();
    java.lang.String var18 = var17.getNome();
    java.lang.String var19 = var17.getNome();
    boolean var20 = var2.equals((java.lang.Object)var17);
    java.lang.String var21 = var2.toString();
    var2.setNome("Metodo de estudo regular");
    var2.setNome("Metodo de estudo avancado");
    double var26 = var2.getHorasEstudadas();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test319");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var11.setCor((-1));
    int var14 = var11.getCor();
    var11.setNome("Metodo de estudo regular");
    double var17 = var11.getHorasEstudadas();
    var11.addHorasDeEstudo(10.0d);
    var8.addDisciplina(var11);
    Stude.Cronograma var21 = new Stude.Cronograma();
    int var22 = var21.tamanhoDisciplinas();
    Stude.Disciplina var25 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var26 = var25.getHorasEstudadas();
    double var27 = var25.getHorasEstudadas();
    var21.addDisciplina(var25);
    java.lang.String var29 = var25.toString();
    boolean var30 = var11.equals((java.lang.Object)var25);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test320");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    java.util.List var8 = var0.getDisciplinas();
    int var9 = var0.tamanhoDisciplinas();
    Stude.Disciplina var11 = var0.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test321");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("Metodo de estudo avancado", 15);
    var1.setMetodoRegular();
    java.util.List var14 = var1.getDisciplinas();
    
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
    assertNotNull(var14);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test322");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    var2.setNome("Metodo de estudo regular");
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoAvancado();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    java.util.HashMap var19 = var16.desempenho();
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var21 = var16.getMetodoDeEstudo();
    boolean var22 = var2.equals((java.lang.Object)var21);
    double var23 = var2.getHorasEstudadas();
    var2.setCor(100);
    Stude.Stude var27 = new Stude.Stude("hi!");
    var27.setMetodoAvancado();
    Stude.MetodoDeEstudo var29 = var27.getMetodoDeEstudo();
    java.util.HashMap var30 = var27.desempenho();
    var27.setMetodoRegular();
    Stude.MetodoDeEstudo var32 = var27.getMetodoDeEstudo();
    var27.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var35 = var27.getCronograma();
    Stude.MetodoDeEstudo var36 = var27.getMetodoDeEstudo();
    int var37 = var27.intervalo();
    Stude.Cronograma var38 = var27.getCronograma();
    java.util.List var39 = var38.getDisciplinas();
    boolean var40 = var2.equals((java.lang.Object)var38);
    Stude.Disciplina var42 = var38.getDisciplina("Metodo de estudo regular");
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test323");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    int var9 = var1.intervalo();
    java.util.HashMap var10 = var1.desempenho();
    Stude.Disciplina var12 = var1.getDisciplina("hi!");
    Stude.Disciplina var14 = var1.getDisciplina("hi!");
    Stude.Cronograma var15 = var1.getCronograma();
    java.util.List var16 = var1.getDisciplinas();
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test324");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getIntervalo();
    
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
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test325");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    var1.setMetodoAvancado();
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Disciplina var14 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var14.setCor((-1));
    int var17 = var14.getCor();
    var14.addHorasDeEstudo(1.0d);
    java.lang.String var20 = var14.getNome();
    Stude.Disciplina var23 = new Stude.Disciplina("hi!", 30);
    boolean var24 = var14.equals((java.lang.Object)var23);
    var23.setNome("Metodo de estudo regular");
    java.lang.String var27 = var23.getNome();
    var11.addDisciplina(var23);
    int var29 = var23.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo regular"+ "'", var27.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 30);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test326");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    var1.addDisciplina("hi!", 5);
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
    assertTrue(var4 == 15);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test327");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("hi!");
    java.util.HashMap var7 = var1.desempenho();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test328");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Usuario var10 = var1.getUsuario();
    java.util.HashMap var11 = var1.desempenho();
    Stude.Usuario var12 = var1.getUsuario();
    var1.setMetodoAvancado();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test329");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var9.setCor(100);
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var19 = var12.getDisciplina("");
    boolean var20 = var9.equals((java.lang.Object)"");
    double var21 = var9.getHorasEstudadas();
    var9.setNome("hi!");
    var9.addHorasDeEstudo(10.0d);
    java.lang.String var26 = var9.getNome();
    Stude.Stude var28 = new Stude.Stude("hi!");
    var28.setMetodoAvancado();
    Stude.MetodoDeEstudo var30 = var28.getMetodoDeEstudo();
    java.util.HashMap var31 = var28.desempenho();
    var28.setMetodoRegular();
    java.util.List var33 = var28.getDisciplinas();
    var28.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var37 = var28.getMetodoDeEstudo();
    int var38 = var28.tempoDeEstudo();
    Stude.Cronograma var39 = var28.getCronograma();
    var28.setMetodoAvancado();
    Stude.MetodoDeEstudo var41 = var28.getMetodoDeEstudo();
    boolean var42 = var9.equals((java.lang.Object)var28);
    var9.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test330");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    var1.setMetodoRegular();
    Stude.Disciplina var9 = var1.getDisciplina("");
    var1.setMetodoAvancado();
    
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
    assertNull(var9);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test331");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    var1.setMetodoAvancado();
    Stude.Disciplina var12 = var1.getDisciplina("hi!");
    Stude.Cronograma var13 = var1.getCronograma();
    java.util.HashMap var14 = var1.desempenho();
    Stude.Cronograma var15 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test332");


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
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var25 = new Stude.Cronograma();
    java.util.List var26 = var25.getDisciplinas();
    Stude.Disciplina var28 = var25.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var30 = var25.getDisciplina("hi!");
    Stude.Disciplina var33 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var25.addDisciplina(var33);
    Stude.Disciplina var37 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var25.addDisciplina(var37);
    int var39 = var25.tamanhoDisciplinas();
    Stude.Disciplina var42 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var43 = var42.toString();
    var42.setCor(15);
    var42.setNome("Metodo de estudo regular");
    int var48 = var42.getCor();
    var25.addDisciplina(var42);
    Stude.Disciplina var51 = var25.getDisciplina("Metodo de estudo regular");
    java.lang.String var52 = var51.toString();
    var51.addHorasDeEstudo(100.0d);
    var0.addDisciplina(var51);
    Stude.Disciplina var58 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var58.setCor((-1));
    int var61 = var58.getCor();
    var58.addHorasDeEstudo(1.0d);
    java.lang.String var64 = var58.getNome();
    Stude.Disciplina var67 = new Stude.Disciplina("hi!", 30);
    boolean var68 = var58.equals((java.lang.Object)var67);
    java.lang.String var69 = var58.toString();
    java.lang.String var70 = var58.getNome();
    var0.addDisciplina(var58);
    boolean var73 = var0.removeDisciplina("Metodo de estudo avancado");
    int var74 = var0.tamanhoDisciplinas();
    boolean var76 = var0.removeDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Metodo de estudo avancado"+ "'", var43.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Metodo de estudo regular"+ "'", var52.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "Metodo de estudo regular"+ "'", var64.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "Metodo de estudo regular"+ "'", var69.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Metodo de estudo regular"+ "'", var70.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test333");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 2);
    int var10 = var1.tempoDeEstudo();
    int var11 = var1.intervalo();
    int var12 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test334");


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
    int var18 = var6.tamanhoDisciplinas();
    
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
    assertTrue(var18 == 1);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test335");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getTempo();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getIntervalo();
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
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test336");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Usuario var7 = var1.getUsuario();
    java.util.List var8 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 10);
    Stude.Disciplina var13 = var1.getDisciplina("Metodo de estudo regular");
    var13.addHorasDeEstudo(20.0d);
    var13.setCor(3);
    
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
    assertNotNull(var13);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test337");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    var1.setMetodoAvancado();
    java.util.List var9 = var1.getDisciplinas();
    int var10 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test338");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.List var14 = var1.getDisciplinas();
    Stude.Disciplina var16 = var1.getDisciplina("");
    java.util.HashMap var17 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test339");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Disciplina var6 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var8 = var0.getDisciplina("hi!");
    int var9 = var0.tamanhoDisciplinas();
    Stude.Stude var11 = new Stude.Stude("hi!");
    var11.setMetodoAvancado();
    Stude.MetodoDeEstudo var13 = var11.getMetodoDeEstudo();
    java.util.HashMap var14 = var11.desempenho();
    var11.setMetodoRegular();
    Stude.MetodoDeEstudo var16 = var11.getMetodoDeEstudo();
    var11.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var19 = var11.getCronograma();
    Stude.Disciplina var21 = var11.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var22 = var11.getCronograma();
    Stude.Cronograma var23 = var11.getCronograma();
    java.util.List var24 = var23.getDisciplinas();
    Stude.Disciplina var27 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var27.setCor((-1));
    var27.addHorasDeEstudo(10.0d);
    Stude.Cronograma var32 = new Stude.Cronograma();
    java.util.List var33 = var32.getDisciplinas();
    Stude.Disciplina var35 = var32.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var37 = var32.getDisciplina("hi!");
    Stude.Disciplina var39 = var32.getDisciplina("");
    java.util.List var40 = var32.getDisciplinas();
    java.util.HashMap var41 = Stude.Desempenho.tempoDeEstudo(var40);
    java.util.HashMap var42 = Stude.Desempenho.tempoDeEstudo(var40);
    java.util.HashMap var43 = Stude.Desempenho.tempoDeEstudo(var40);
    java.util.HashMap var44 = Stude.Desempenho.tempoDeEstudo(var40);
    boolean var45 = var27.equals((java.lang.Object)var44);
    var23.addDisciplina(var27);
    Stude.Disciplina var48 = var23.getDisciplina("Metodo de estudo avancado");
    java.util.List var49 = var23.getDisciplinas();
    Stude.Disciplina var51 = var23.getDisciplina("Metodo de estudo regular");
    Stude.Stude var53 = new Stude.Stude("hi!");
    var53.setMetodoAvancado();
    Stude.MetodoDeEstudo var55 = var53.getMetodoDeEstudo();
    java.util.HashMap var56 = var53.desempenho();
    var53.setMetodoRegular();
    java.util.HashMap var58 = var53.desempenho();
    boolean var59 = var51.equals((java.lang.Object)var58);
    int var60 = var51.getCor();
    var0.addDisciplina(var51);
    java.util.List var62 = var0.getDisciplinas();
    Stude.Disciplina var65 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var65.setCor((-1));
    java.lang.String var68 = var65.getNome();
    java.lang.String var69 = var65.getNome();
    int var70 = var65.getCor();
    var65.setNome("Metodo de estudo avancado");
    var65.setNome("hi!");
    java.lang.String var75 = var65.toString();
    java.lang.String var76 = var65.getNome();
    var0.addDisciplina(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "Metodo de estudo regular"+ "'", var68.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "Metodo de estudo regular"+ "'", var69.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi!"+ "'", var75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "hi!"+ "'", var76.equals("hi!"));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test340");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    java.util.HashMap var7 = var1.desempenho();
    java.util.List var8 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("hi!");
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
    assertNotNull(var8);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test341");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.addDisciplina("hi!", 2);
    Stude.Disciplina var8 = var1.getDisciplina("hi!");
    var8.addHorasDeEstudo(100.0d);
    java.lang.String var11 = var8.getNome();
    var8.setCor(2);
    var8.setCor(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test342");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    int var4 = var2.getCor();
    var2.addHorasDeEstudo(20.0d);
    java.lang.String var7 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test343");


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
    java.lang.String var43 = var2.toString();
    
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
    assertTrue("'" + var43 + "' != '" + "Metodo de estudo regular"+ "'", var43.equals("Metodo de estudo regular"));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test344");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    var9.setNome("Metodo de estudo regular");
    
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
    assertNotNull(var9);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test345");


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
    var17.setCor(100);
    var17.addHorasDeEstudo(2.0d);
    
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

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test346");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    int var7 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test347");


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
    Stude.Stude var34 = new Stude.Stude("hi!");
    int var35 = var34.intervalo();
    Stude.MetodoDeEstudo var36 = var34.getMetodoDeEstudo();
    var34.addDisciplina("hi!", 2);
    Stude.Disciplina var41 = var34.getDisciplina("hi!");
    var41.addHorasDeEstudo(100.0d);
    java.lang.String var44 = var41.getNome();
    var41.setCor(2);
    var6.addDisciplina(var41);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test348");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.Disciplina var4 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    var1.addDisciplina("Metodo de estudo regular", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test349");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("hi!", (-1));
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
    java.util.HashMap var12 = Stude.Desempenho.tempoDeEstudo(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test350");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoRegular();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.Usuario var9 = var1.getUsuario();
    var9.setNome("Metodo de estudo avancado");
    java.lang.String var12 = var9.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test351");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
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
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test352");


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
    java.util.List var16 = var10.getDisciplinas();
    int var17 = var10.tamanhoDisciplinas();
    java.util.List var18 = var10.getDisciplinas();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test353");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.List var8 = var1.getDisciplinas();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Usuario var11 = var1.getUsuario();
    java.util.List var12 = var1.getDisciplinas();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test354");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    java.util.List var4 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    java.util.List var6 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test355");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    boolean var16 = var1.removeDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test356");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    java.util.HashMap var11 = var1.desempenho();
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    java.util.List var15 = var1.getDisciplinas();
    int var16 = var1.tempoDeEstudo();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test357");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    Stude.Disciplina var11 = new Stude.Disciplina("hi!", 30);
    boolean var12 = var2.equals((java.lang.Object)var11);
    java.lang.String var13 = var2.toString();
    double var14 = var2.getHorasEstudadas();
    var2.setCor(100);
    int var17 = var2.getCor();
    var2.setCor(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test358");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Usuario var8 = var1.getUsuario();
    java.util.List var9 = var1.getDisciplinas();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test359");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    var8.setCor(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test360");


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
    double var23 = var2.getHorasEstudadas();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1.0d);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test361");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    int var11 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test362");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    java.util.List var10 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test363");


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
    java.lang.String var19 = var2.toString();
    java.lang.String var20 = var2.toString();
    var2.setNome("Metodo de estudo regular");
    java.lang.String var23 = var2.getNome();
    
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test364");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(0);
    var2.setCor(0);
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    java.util.List var13 = var7.getDisciplinas();
    int var14 = var7.tamanhoDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var18 = var17.toString();
    var17.setCor(15);
    var17.setNome("Metodo de estudo regular");
    int var23 = var17.getCor();
    var7.addDisciplina(var17);
    java.lang.String var25 = var17.getNome();
    Stude.Stude var27 = new Stude.Stude("hi!");
    var27.setMetodoAvancado();
    Stude.MetodoDeEstudo var29 = var27.getMetodoDeEstudo();
    java.util.HashMap var30 = var27.desempenho();
    int var31 = var27.tempoDeEstudo();
    java.util.List var32 = var27.getDisciplinas();
    java.util.HashMap var33 = Stude.Desempenho.tempoDeEstudo(var32);
    boolean var34 = var17.equals((java.lang.Object)var32);
    java.lang.String var35 = var17.getNome();
    boolean var36 = var2.equals((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Metodo de estudo regular"+ "'", var35.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test365");


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
    int var11 = var0.getIntervalo();
    int var12 = var0.getIntervalo();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    
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
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test366");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setNomeUsuario("Metodo de estudo avancado");
    java.util.HashMap var7 = var1.desempenho();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    java.util.List var9 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test367");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    int var7 = var2.getCor();
    int var8 = var2.getCor();
    java.lang.String var9 = var2.toString();
    var2.setNome("Metodo de estudo regular");
    
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

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test368");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    
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
    assertTrue(var9 == 30);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test369");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.Disciplina var9 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    var6.addDisciplina(var9);
    var9.setNome("hi!");
    java.lang.String var13 = var9.toString();
    java.lang.String var14 = var9.getNome();
    var9.addHorasDeEstudo(100.0d);
    java.lang.String var17 = var9.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test370");


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
    Stude.Stude var79 = new Stude.Stude("hi!");
    int var80 = var79.intervalo();
    Stude.Usuario var81 = var79.getUsuario();
    int var82 = var79.tempoDeEstudo();
    java.util.HashMap var83 = var79.desempenho();
    Stude.MetodoDeEstudo var84 = var79.getMetodoDeEstudo();
    java.util.List var85 = var79.getDisciplinas();
    boolean var86 = var69.equals((java.lang.Object)var79);
    Stude.Cronograma var87 = var79.getCronograma();
    Stude.Cronograma var88 = var79.getCronograma();
    java.util.HashMap var89 = var79.desempenho();
    java.util.HashMap var90 = var79.desempenho();
    var79.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var93 = var79.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var80 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test371");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.List var4 = var1.getDisciplinas();
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    java.util.HashMap var9 = var1.desempenho();
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test372");


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
    java.util.List var16 = var1.getDisciplinas();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test373");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var9.setCor(100);
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var19 = var12.getDisciplina("");
    boolean var20 = var9.equals((java.lang.Object)"");
    int var21 = var9.getCor();
    var9.addHorasDeEstudo(100.0d);
    double var24 = var9.getHorasEstudadas();
    double var25 = var9.getHorasEstudadas();
    int var26 = var9.getCor();
    var9.setCor(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 100);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test374");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var11 = var1.intervalo();
    Stude.Usuario var12 = var1.getUsuario();
    java.lang.String var13 = var12.getNome();
    var12.setNome("hi!");
    var12.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test375");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    int var11 = var1.tempoDeEstudo();
    
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
    assertTrue(var11 == 15);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test376");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var3 = new Stude.Cronograma();
    java.util.List var4 = var3.getDisciplinas();
    java.util.HashMap var5 = Stude.Desempenho.tempoDeEstudo(var4);
    boolean var6 = var2.equals((java.lang.Object)var5);
    var2.addHorasDeEstudo(1.0d);
    var2.setCor(5);
    Stude.Stude var12 = new Stude.Stude("hi!");
    int var13 = var12.intervalo();
    var12.setNomeUsuario("Metodo de estudo regular");
    int var16 = var12.intervalo();
    Stude.Usuario var17 = var12.getUsuario();
    Stude.Disciplina var19 = var12.getDisciplina("Metodo de estudo avancado");
    var12.setMetodoRegular();
    int var21 = var12.tempoDeEstudo();
    java.util.HashMap var22 = var12.desempenho();
    int var23 = var12.intervalo();
    int var24 = var12.intervalo();
    var12.addDisciplina("Metodo de estudo regular", (-1));
    boolean var28 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    java.lang.String var29 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo avancado"+ "'", var29.equals("Metodo de estudo avancado"));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test377");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test378");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var6 = var2.getDisciplina("");
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    int var12 = var7.tamanhoDisciplinas();
    Stude.Disciplina var14 = var7.getDisciplina("hi!");
    Stude.Disciplina var16 = var7.getDisciplina("hi!");
    java.util.List var17 = var7.getDisciplinas();
    Stude.Stude var19 = new Stude.Stude("hi!");
    int var20 = var19.intervalo();
    Stude.MetodoDeEstudo var21 = var19.getMetodoDeEstudo();
    var19.addDisciplina("hi!", 2);
    Stude.Disciplina var26 = var19.getDisciplina("hi!");
    var26.addHorasDeEstudo(100.0d);
    var26.addHorasDeEstudo(1.0d);
    var7.addDisciplina(var26);
    var2.addDisciplina(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test379");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    java.util.List var7 = var1.getDisciplinas();
    
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

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test380");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    java.util.List var8 = var0.getDisciplinas();
    Stude.Disciplina var10 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var0.getDisciplina("hi!");
    int var13 = var0.tamanhoDisciplinas();
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
    java.lang.String var32 = var29.toString();
    var0.addDisciplina(var29);
    int var34 = var0.tamanhoDisciplinas();
    java.util.List var35 = var0.getDisciplinas();
    java.util.List var36 = var0.getDisciplinas();
    java.util.List var37 = var0.getDisciplinas();
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
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
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo regular"+ "'", var32.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test381");


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
    java.lang.String var29 = var20.toString();
    java.lang.String var30 = var20.getNome();
    var20.setNome("Metodo de estudo avancado");
    var20.setNome("hi!");
    
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
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Metodo de estudo regular"+ "'", var30.equals("Metodo de estudo regular"));

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test382");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Usuario var10 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setNome("");
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test383");


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
    java.util.HashMap var12 = var1.desempenho();
    
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

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test384");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    boolean var10 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    var2.addHorasDeEstudo(10.0d);
    double var13 = var2.getHorasEstudadas();
    int var14 = var2.getCor();
    double var15 = var2.getHorasEstudadas();
    java.lang.String var16 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test385");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var3 = var2.getCor();
    int var4 = var2.getCor();
    java.lang.String var5 = var2.getNome();
    var2.setNome("Metodo de estudo avancado");
    java.lang.String var8 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test386");


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
    java.util.List var14 = var4.getDisciplinas();
    java.util.List var15 = var4.getDisciplinas();
    int var16 = var4.tamanhoDisciplinas();
    Stude.Stude var18 = new Stude.Stude("hi!");
    var18.setMetodoAvancado();
    Stude.MetodoDeEstudo var20 = var18.getMetodoDeEstudo();
    var18.setMetodoAvancado();
    var18.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var26 = var18.getDisciplina("Metodo de estudo regular");
    var26.setCor(100);
    Stude.Cronograma var29 = new Stude.Cronograma();
    java.util.List var30 = var29.getDisciplinas();
    Stude.Disciplina var32 = var29.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var34 = var29.getDisciplina("hi!");
    Stude.Disciplina var36 = var29.getDisciplina("");
    boolean var37 = var26.equals((java.lang.Object)"");
    double var38 = var26.getHorasEstudadas();
    var26.setNome("Metodo de estudo regular");
    java.lang.String var41 = var26.getNome();
    java.lang.String var42 = var26.toString();
    var4.addDisciplina(var26);
    Stude.Disciplina var45 = var4.getDisciplina("Metodo de estudo avancado");
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo regular"+ "'", var41.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Metodo de estudo regular"+ "'", var42.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test387");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    Stude.Disciplina var7 = var1.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test388");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    java.lang.String var7 = var6.getNome();
    var6.setNome("hi!");
    java.lang.String var10 = var6.getNome();
    java.lang.String var11 = var6.getNome();
    var6.setNome("Metodo de estudo avancado");
    
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
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test389");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test390");


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
    Stude.Stude var32 = new Stude.Stude("hi!");
    Stude.Cronograma var33 = var32.getCronograma();
    Stude.Cronograma var34 = var32.getCronograma();
    Stude.Disciplina var37 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var37.setCor((-1));
    int var40 = var37.getCor();
    var37.addHorasDeEstudo(1.0d);
    java.lang.String var43 = var37.getNome();
    Stude.Disciplina var46 = new Stude.Disciplina("hi!", 30);
    boolean var47 = var37.equals((java.lang.Object)var46);
    java.lang.String var48 = var46.getNome();
    var46.setNome("hi!");
    var34.addDisciplina(var46);
    Stude.Disciplina var54 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var54.setCor((-1));
    int var57 = var54.getCor();
    var54.addHorasDeEstudo(1.0d);
    java.lang.String var60 = var54.getNome();
    Stude.Disciplina var63 = new Stude.Disciplina("hi!", 30);
    boolean var64 = var54.equals((java.lang.Object)var63);
    java.lang.String var65 = var54.toString();
    var34.addDisciplina(var54);
    java.util.List var67 = var34.getDisciplinas();
    boolean var69 = var34.removeDisciplina("hi!");
    boolean var70 = var30.equals((java.lang.Object)"hi!");
    var30.setNome("Metodo de estudo regular");
    var30.setCor(4);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Metodo de estudo regular"+ "'", var43.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "Metodo de estudo regular"+ "'", var60.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "Metodo de estudo regular"+ "'", var65.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test391");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    int var8 = var1.tempoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test392");


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
    var2.setNome("Metodo de estudo avancado");
    int var23 = var2.getCor();
    java.lang.String var24 = var2.toString();
    
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
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo avancado"+ "'", var24.equals("Metodo de estudo avancado"));

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test393");


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
    java.lang.String var13 = var0.toString();
    int var14 = var0.getIntervalo();
    int var15 = var0.getIntervalo();
    
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
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test394");


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
    java.lang.String var19 = var2.getNome();
    java.lang.String var20 = var2.toString();
    java.lang.String var21 = var2.getNome();
    
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test395");


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
    Stude.Stude var19 = new Stude.Stude("hi!");
    Stude.Cronograma var20 = var19.getCronograma();
    int var21 = var19.tempoDeEstudo();
    var19.setNomeUsuario("hi!");
    var19.setMetodoAvancado();
    java.util.HashMap var25 = var19.desempenho();
    Stude.Disciplina var27 = var19.getDisciplina("");
    Stude.Usuario var28 = var19.getUsuario();
    var19.setMetodoAvancado();
    boolean var30 = var13.equals((java.lang.Object)var19);
    var19.setMetodoRegular();
    java.util.HashMap var32 = var19.desempenho();
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test396");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    double var4 = var2.getHorasEstudadas();
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.toString();
    var2.setCor((-1));
    var2.setCor(15);
    java.lang.String var11 = var2.toString();
    int var12 = var2.getCor();
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var16 = var15.toString();
    var15.setCor(15);
    java.lang.String var19 = var15.getNome();
    Stude.Cronograma var20 = new Stude.Cronograma();
    Stude.Disciplina var22 = var20.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var24 = var20.getDisciplina("");
    java.util.List var25 = var20.getDisciplinas();
    boolean var26 = var15.equals((java.lang.Object)var20);
    java.lang.String var27 = var15.toString();
    Stude.Stude var29 = new Stude.Stude("hi!");
    int var30 = var29.intervalo();
    Stude.Usuario var31 = var29.getUsuario();
    Stude.Cronograma var32 = var29.getCronograma();
    var29.setMetodoAvancado();
    Stude.Cronograma var34 = var29.getCronograma();
    java.util.List var35 = var34.getDisciplinas();
    boolean var36 = var15.equals((java.lang.Object)var34);
    double var37 = var15.getHorasEstudadas();
    boolean var38 = var2.equals((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test397");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    java.util.List var8 = var0.getDisciplinas();
    Stude.Disciplina var10 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var0.getDisciplina("hi!");
    int var13 = var0.tamanhoDisciplinas();
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
    java.lang.String var32 = var29.toString();
    var0.addDisciplina(var29);
    int var34 = var0.tamanhoDisciplinas();
    Stude.Disciplina var37 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var38 = var37.getHorasEstudadas();
    var37.setNome("hi!");
    var37.setNome("hi!");
    var37.setCor((-1));
    var37.setCor(1);
    var0.addDisciplina(var37);
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
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
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo regular"+ "'", var32.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test398");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    int var10 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var13 = var1.intervalo();
    Stude.Usuario var14 = var1.getUsuario();
    java.util.HashMap var15 = var1.desempenho();
    int var16 = var1.intervalo();
    
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
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test399");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test400");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    Stude.Usuario var9 = var1.getUsuario();
    Stude.Usuario var10 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test401");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    int var6 = var1.tempoDeEstudo();
    Stude.Usuario var7 = var1.getUsuario();
    java.util.HashMap var8 = var1.desempenho();
    Stude.Usuario var9 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test402");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    java.util.List var8 = var0.getDisciplinas();
    Stude.Disciplina var10 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var0.getDisciplina("hi!");
    int var13 = var0.tamanhoDisciplinas();
    int var14 = var0.tamanhoDisciplinas();
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test403");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test404");


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
    Stude.Cronograma var13 = var1.getCronograma();
    int var14 = var1.tempoDeEstudo();
    int var15 = var1.tempoDeEstudo();
    java.util.HashMap var16 = var1.desempenho();
    
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
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test405");


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
    int var11 = var0.getTempo();
    int var12 = var0.getTempo();
    int var13 = var0.getTempo();
    int var14 = var0.getTempo();
    int var15 = var0.getIntervalo();
    
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
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test406");


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
    Stude.Disciplina var21 = var19.getDisciplina("Metodo de estudo regular");
    int var22 = var19.tamanhoDisciplinas();
    
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
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test407");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test408");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test409");


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
    Stude.Disciplina var48 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var49 = var48.toString();
    var48.setCor(15);
    java.lang.String var52 = var48.getNome();
    Stude.Cronograma var53 = new Stude.Cronograma();
    Stude.Disciplina var55 = var53.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var57 = var53.getDisciplina("");
    java.util.List var58 = var53.getDisciplinas();
    boolean var59 = var48.equals((java.lang.Object)var53);
    java.lang.String var60 = var48.toString();
    int var61 = var48.getCor();
    java.lang.String var62 = var48.getNome();
    var48.setCor(15);
    var7.addDisciplina(var48);
    Stude.Stude var67 = new Stude.Stude("hi!");
    var67.setMetodoAvancado();
    Stude.MetodoDeEstudo var69 = var67.getMetodoDeEstudo();
    java.util.HashMap var70 = var67.desempenho();
    int var71 = var67.tempoDeEstudo();
    java.util.List var72 = var67.getDisciplinas();
    var67.setMetodoRegular();
    var67.setMetodoRegular();
    var67.setNomeUsuario("hi!");
    boolean var77 = var48.equals((java.lang.Object)var67);
    var67.setMetodoRegular();
    
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
    assertTrue("'" + var49 + "' != '" + "Metodo de estudo avancado"+ "'", var49.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Metodo de estudo avancado"+ "'", var52.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "Metodo de estudo avancado"+ "'", var60.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "Metodo de estudo avancado"+ "'", var62.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test410");


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
    Stude.Disciplina var19 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var19.addHorasDeEstudo(10.0d);
    java.lang.String var22 = var19.toString();
    java.lang.String var23 = var19.getNome();
    int var24 = var19.getCor();
    var7.addDisciplina(var19);
    int var26 = var7.tamanhoDisciplinas();
    Stude.Disciplina var28 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var30 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Stude var32 = new Stude.Stude("hi!");
    var32.setMetodoAvancado();
    Stude.MetodoDeEstudo var34 = var32.getMetodoDeEstudo();
    var32.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var38 = var32.getDisciplina("Metodo de estudo regular");
    int var39 = var32.intervalo();
    int var40 = var32.intervalo();
    var32.setNomeUsuario("hi!");
    boolean var43 = var30.equals((java.lang.Object)var32);
    var32.setMetodoRegular();
    
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
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo regular"+ "'", var22.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test411");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var1.tempoDeEstudo();
    Stude.Usuario var11 = var1.getUsuario();
    java.util.HashMap var12 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test412");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    var15.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var15);
    Stude.Disciplina var21 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var23 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var24 = var0.getDisciplinas();
    java.util.List var25 = var0.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var27 = var0.removeDisciplina("Metodo de estudo avancado");
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test413");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    Stude.Cronograma var7 = new Stude.Cronograma();
    java.util.List var8 = var7.getDisciplinas();
    Stude.Disciplina var10 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var7.getDisciplina("hi!");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var7.addDisciplina(var15);
    var15.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var15);
    Stude.Disciplina var21 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var23 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var24 = new Stude.Cronograma();
    java.util.List var25 = var24.getDisciplinas();
    Stude.Disciplina var27 = var24.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var29 = var24.getDisciplina("hi!");
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var24.addDisciplina(var32);
    Stude.Disciplina var36 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var24.addDisciplina(var36);
    Stude.Disciplina var40 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var41 = var40.toString();
    var40.setCor(15);
    var40.setCor(10);
    var24.addDisciplina(var40);
    java.lang.String var47 = var40.getNome();
    java.lang.String var48 = var40.toString();
    java.lang.String var49 = var40.toString();
    var0.addDisciplina(var40);
    Stude.Disciplina var52 = var0.getDisciplina("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var54 = var0.removeDisciplina("");
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo avancado"+ "'", var41.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Metodo de estudo avancado"+ "'", var47.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Metodo de estudo avancado"+ "'", var48.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "Metodo de estudo avancado"+ "'", var49.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test414");


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
    Stude.Disciplina var16 = var14.getDisciplina("");
    java.util.List var17 = var14.getDisciplinas();
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test415");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    double var8 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(20.0d);
    java.lang.String var11 = var2.toString();
    Stude.Stude var13 = new Stude.Stude("hi!");
    int var14 = var13.intervalo();
    Stude.Usuario var15 = var13.getUsuario();
    Stude.Cronograma var16 = var13.getCronograma();
    var13.setMetodoAvancado();
    Stude.Cronograma var18 = var13.getCronograma();
    Stude.Disciplina var20 = var13.getDisciplina("Metodo de estudo avancado");
    boolean var21 = var2.equals((java.lang.Object)"Metodo de estudo avancado");
    java.lang.String var22 = var2.getNome();
    var2.addHorasDeEstudo(11.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo regular"+ "'", var22.equals("Metodo de estudo regular"));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test416");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    var1.addDisciplina("hi!", 2);
    java.util.HashMap var10 = var1.desempenho();
    boolean var12 = var1.removeDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test417");


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
    int var17 = var10.getCor();
    
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
    assertTrue(var17 == 5);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test418");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo regular");
    Stude.Usuario var2 = var1.getUsuario();
    Stude.Usuario var3 = var1.getUsuario();
    java.util.HashMap var4 = var1.desempenho();
    java.util.List var5 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test419");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoAvancado();
    java.util.List var13 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test420");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test421");


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
    java.lang.String var29 = var13.getNome();
    int var30 = var13.getCor();
    java.lang.String var31 = var13.getNome();
    var13.addHorasDeEstudo(100.0d);
    
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
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test422");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var7.getDisciplina("");
    int var10 = var7.tamanhoDisciplinas();
    java.util.List var11 = var7.getDisciplinas();
    java.util.List var12 = var7.getDisciplinas();
    Stude.Stude var14 = new Stude.Stude("hi!");
    var14.setMetodoAvancado();
    Stude.MetodoDeEstudo var16 = var14.getMetodoDeEstudo();
    java.util.HashMap var17 = var14.desempenho();
    var14.setMetodoRegular();
    Stude.MetodoDeEstudo var19 = var14.getMetodoDeEstudo();
    var14.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var22 = var14.getCronograma();
    Stude.Disciplina var24 = var14.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var25 = var14.getCronograma();
    Stude.Usuario var26 = var14.getUsuario();
    Stude.Cronograma var27 = var14.getCronograma();
    java.util.List var28 = var27.getDisciplinas();
    Stude.Disciplina var31 = new Stude.Disciplina("hi!", 30);
    var31.setCor(2);
    var27.addDisciplina(var31);
    Stude.Regular var35 = new Stude.Regular();
    int var36 = var35.getTempo();
    java.lang.String var37 = var35.toString();
    int var38 = var35.getIntervalo();
    java.lang.String var39 = var35.toString();
    int var40 = var35.getIntervalo();
    int var41 = var35.getTempo();
    int var42 = var35.getIntervalo();
    java.lang.String var43 = var35.toString();
    java.lang.String var44 = var35.toString();
    java.lang.String var45 = var35.toString();
    java.lang.String var46 = var35.toString();
    boolean var47 = var31.equals((java.lang.Object)var35);
    var7.addDisciplina(var31);
    
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
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo regular"+ "'", var37.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo regular"+ "'", var39.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Metodo de estudo regular"+ "'", var43.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo regular"+ "'", var44.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Metodo de estudo regular"+ "'", var45.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Metodo de estudo regular"+ "'", var46.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test423");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    java.lang.String var9 = var0.toString();
    
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
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test424");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var9.setCor(100);
    Stude.Cronograma var12 = new Stude.Cronograma();
    java.util.List var13 = var12.getDisciplinas();
    Stude.Disciplina var15 = var12.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var12.getDisciplina("hi!");
    Stude.Disciplina var19 = var12.getDisciplina("");
    boolean var20 = var9.equals((java.lang.Object)"");
    int var21 = var9.getCor();
    int var22 = var9.getCor();
    Stude.Stude var24 = new Stude.Stude("hi!");
    var24.setMetodoAvancado();
    Stude.MetodoDeEstudo var26 = var24.getMetodoDeEstudo();
    java.util.List var27 = var24.getDisciplinas();
    var24.setNomeUsuario("hi!");
    var24.setMetodoRegular();
    Stude.MetodoDeEstudo var31 = var24.getMetodoDeEstudo();
    boolean var32 = var9.equals((java.lang.Object)var31);
    java.lang.String var33 = var9.toString();
    var9.setNome("hi!");
    int var36 = var9.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo regular"+ "'", var33.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 100);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test425");


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
    java.lang.String var12 = var0.toString();
    
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
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test426");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    int var3 = var2.getCor();
    Stude.Stude var5 = new Stude.Stude("hi!");
    int var6 = var5.intervalo();
    Stude.Usuario var7 = var5.getUsuario();
    var5.addDisciplina("hi!", 0);
    java.util.HashMap var11 = var5.desempenho();
    var5.setMetodoRegular();
    Stude.Usuario var13 = var5.getUsuario();
    Stude.Usuario var14 = var5.getUsuario();
    Stude.Usuario var15 = var5.getUsuario();
    boolean var16 = var2.equals((java.lang.Object)var5);
    Stude.Disciplina var18 = var5.getDisciplina("");
    var5.setNomeUsuario("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test427");


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
    int var13 = var0.getIntervalo();
    int var14 = var0.getTempo();
    java.lang.String var15 = var0.toString();
    int var16 = var0.getTempo();
    
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
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 30);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test428");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    java.util.HashMap var6 = var1.desempenho();
    java.util.List var7 = var1.getDisciplinas();
    int var8 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Usuario var10 = var1.getUsuario();
    java.lang.String var11 = var10.getNome();
    java.lang.String var12 = var10.getNome();
    var10.setNome("hi!");
    
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
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test429");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    var1.addDisciplina("hi!", 0);
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Stude var13 = new Stude.Stude("hi!");
    var13.setMetodoAvancado();
    Stude.MetodoDeEstudo var15 = var13.getMetodoDeEstudo();
    var13.setMetodoAvancado();
    var13.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var21 = var13.getDisciplina("Metodo de estudo regular");
    var21.setCor(100);
    Stude.Cronograma var24 = new Stude.Cronograma();
    java.util.List var25 = var24.getDisciplinas();
    Stude.Disciplina var27 = var24.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var29 = var24.getDisciplina("hi!");
    Stude.Disciplina var31 = var24.getDisciplina("");
    boolean var32 = var21.equals((java.lang.Object)"");
    double var33 = var21.getHorasEstudadas();
    var11.addDisciplina(var21);
    Stude.Disciplina var37 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var38 = var37.toString();
    var37.setCor(15);
    java.lang.String var41 = var37.getNome();
    int var42 = var37.getCor();
    int var43 = var37.getCor();
    var11.addDisciplina(var37);
    var37.addHorasDeEstudo(11.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo avancado"+ "'", var38.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo avancado"+ "'", var41.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 15);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test430");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    int var7 = var0.tamanhoDisciplinas();
    Stude.Disciplina var9 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var10 = var0.getDisciplinas();
    int var11 = var0.tamanhoDisciplinas();
    Stude.Stude var13 = new Stude.Stude("hi!");
    var13.setMetodoAvancado();
    Stude.MetodoDeEstudo var15 = var13.getMetodoDeEstudo();
    java.util.HashMap var16 = var13.desempenho();
    var13.setMetodoRegular();
    Stude.MetodoDeEstudo var18 = var13.getMetodoDeEstudo();
    var13.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var21 = var13.getCronograma();
    Stude.Disciplina var23 = var13.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var24 = var13.getCronograma();
    Stude.Disciplina var27 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var28 = var27.toString();
    var27.setCor(15);
    java.lang.String var31 = var27.getNome();
    boolean var33 = var27.equals((java.lang.Object)(byte)100);
    java.lang.String var34 = var27.toString();
    var24.addDisciplina(var27);
    Stude.Disciplina var38 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var38.addHorasDeEstudo(10.0d);
    java.lang.String var41 = var38.toString();
    var24.addDisciplina(var38);
    var0.addDisciplina(var38);
    Stude.Disciplina var45 = var0.getDisciplina("Metodo de estudo regular");
    int var46 = var0.tamanhoDisciplinas();
    int var47 = var0.tamanhoDisciplinas();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo avancado"+ "'", var28.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo avancado"+ "'", var34.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo regular"+ "'", var41.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test431");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Usuario var4 = var1.getUsuario();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Usuario var7 = var1.getUsuario();
    
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
    assertNotNull(var7);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test432");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    java.util.List var6 = var1.getDisciplinas();
    var1.setNomeUsuario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test433");


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
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    int var15 = var1.tempoDeEstudo();
    java.util.List var16 = var1.getDisciplinas();
    var1.setNomeUsuario("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test434");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    
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
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test435");


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
    java.lang.String var18 = var13.getNome();
    java.lang.String var19 = var13.getNome();
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
    boolean var36 = var13.equals((java.lang.Object)var34);
    var13.addHorasDeEstudo(100.0d);
    var13.setCor(10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));
    
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
    assertTrue(var36 == false);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test436");


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
    int var25 = var22.getCor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var22.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var25 == 100);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test437");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.intervalo();
    java.util.List var6 = var1.getDisciplinas();
    int var7 = var1.intervalo();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test438");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    java.util.List var9 = var1.getDisciplinas();
    Stude.Usuario var10 = var1.getUsuario();
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

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test439");


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
    int var15 = var0.getIntervalo();
    int var16 = var0.getTempo();
    int var17 = var0.getTempo();
    java.lang.String var18 = var0.toString();
    
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
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test440");


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
    java.lang.String var17 = var10.getNome();
    
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
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test441");


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
    Stude.Disciplina var45 = var9.getDisciplina("hi!");
    Stude.Disciplina var48 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var49 = var48.toString();
    java.lang.String var50 = var48.getNome();
    var9.addDisciplina(var48);
    java.util.List var52 = var9.getDisciplinas();
    java.util.HashMap var53 = Stude.Desempenho.tempoDeEstudo(var52);
    
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
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "Metodo de estudo avancado"+ "'", var49.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Metodo de estudo avancado"+ "'", var50.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test442");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 10);
    int var8 = var7.getCor();
    var0.addDisciplina(var7);
    java.util.List var10 = var0.getDisciplinas();
    Stude.Stude var12 = new Stude.Stude("hi!");
    Stude.Cronograma var13 = var12.getCronograma();
    Stude.Cronograma var14 = var12.getCronograma();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    int var20 = var17.getCor();
    var17.addHorasDeEstudo(1.0d);
    java.lang.String var23 = var17.getNome();
    Stude.Disciplina var26 = new Stude.Disciplina("hi!", 30);
    boolean var27 = var17.equals((java.lang.Object)var26);
    java.lang.String var28 = var26.getNome();
    var26.setNome("hi!");
    var14.addDisciplina(var26);
    Stude.Disciplina var33 = var14.getDisciplina("hi!");
    Stude.Disciplina var36 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var36.setCor((-1));
    java.lang.String var39 = var36.getNome();
    java.lang.String var40 = var36.getNome();
    int var41 = var36.getCor();
    double var42 = var36.getHorasEstudadas();
    var36.setNome("Metodo de estudo avancado");
    var14.addDisciplina(var36);
    int var46 = var36.getCor();
    var0.addDisciplina(var36);
    java.util.List var48 = var0.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo regular"+ "'", var39.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo regular"+ "'", var40.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test443");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test444");


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
    Stude.Regular var14 = new Stude.Regular();
    int var15 = var14.getTempo();
    int var16 = var14.getTempo();
    java.lang.String var17 = var14.toString();
    int var18 = var14.getIntervalo();
    int var19 = var14.getIntervalo();
    int var20 = var14.getTempo();
    int var21 = var14.getTempo();
    boolean var22 = var2.equals((java.lang.Object)var14);
    int var23 = var14.getTempo();
    
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
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 15);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test445");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    var1.addDisciplina("Metodo de estudo regular", 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test446");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    java.util.List var8 = var0.getDisciplinas();
    int var9 = var0.tamanhoDisciplinas();
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var13 = var12.toString();
    var12.setCor(15);
    java.lang.String var16 = var12.getNome();
    Stude.Cronograma var17 = new Stude.Cronograma();
    Stude.Disciplina var19 = var17.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var21 = var17.getDisciplina("");
    java.util.List var22 = var17.getDisciplinas();
    boolean var23 = var12.equals((java.lang.Object)var17);
    Stude.Disciplina var26 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var27 = var26.toString();
    Stude.Stude var29 = new Stude.Stude("hi!");
    var29.setMetodoAvancado();
    Stude.MetodoDeEstudo var31 = var29.getMetodoDeEstudo();
    java.util.HashMap var32 = var29.desempenho();
    var29.setMetodoRegular();
    Stude.MetodoDeEstudo var34 = var29.getMetodoDeEstudo();
    var29.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var37 = var29.desempenho();
    boolean var38 = var26.equals((java.lang.Object)var37);
    var17.addDisciplina(var26);
    Stude.Disciplina var42 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var17.addDisciplina(var42);
    int var44 = var42.getCor();
    Stude.Disciplina var47 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var48 = var47.toString();
    java.lang.String var49 = var47.toString();
    java.lang.String var50 = var47.toString();
    var47.setNome("hi!");
    int var53 = var47.getCor();
    boolean var54 = var42.equals((java.lang.Object)var47);
    var47.setNome("hi!");
    var0.addDisciplina(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Metodo de estudo avancado"+ "'", var48.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "Metodo de estudo avancado"+ "'", var49.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Metodo de estudo avancado"+ "'", var50.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test447");


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
    Stude.Stude var79 = new Stude.Stude("hi!");
    int var80 = var79.intervalo();
    Stude.Usuario var81 = var79.getUsuario();
    int var82 = var79.tempoDeEstudo();
    java.util.HashMap var83 = var79.desempenho();
    Stude.MetodoDeEstudo var84 = var79.getMetodoDeEstudo();
    java.util.List var85 = var79.getDisciplinas();
    boolean var86 = var69.equals((java.lang.Object)var79);
    Stude.MetodoDeEstudo var87 = var79.getMetodoDeEstudo();
    Stude.Cronograma var88 = var79.getCronograma();
    int var89 = var79.tempoDeEstudo();
    
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
    assertTrue(var80 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 15);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test448");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    java.util.HashMap var8 = var1.desempenho();
    Stude.Cronograma var9 = var1.getCronograma();
    var1.addDisciplina("Metodo de estudo regular", 100);
    java.util.List var13 = var1.getDisciplinas();
    Stude.Cronograma var14 = var1.getCronograma();
    int var15 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test449");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoRegular();
    int var7 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 10);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test450");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo regular"+ "'", var3.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test451");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    Stude.Disciplina var6 = var1.getDisciplina("hi!");
    Stude.Usuario var7 = var1.getUsuario();
    var7.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test452");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Disciplina var10 = var1.getDisciplina("");
    Stude.Cronograma var11 = var1.getCronograma();
    java.util.List var12 = var11.getDisciplinas();
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test453");


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
    Stude.Cronograma var13 = var1.getCronograma();
    java.util.List var14 = var13.getDisciplinas();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    var17.addHorasDeEstudo(10.0d);
    Stude.Cronograma var22 = new Stude.Cronograma();
    java.util.List var23 = var22.getDisciplinas();
    Stude.Disciplina var25 = var22.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var27 = var22.getDisciplina("hi!");
    Stude.Disciplina var29 = var22.getDisciplina("");
    java.util.List var30 = var22.getDisciplinas();
    java.util.HashMap var31 = Stude.Desempenho.tempoDeEstudo(var30);
    java.util.HashMap var32 = Stude.Desempenho.tempoDeEstudo(var30);
    java.util.HashMap var33 = Stude.Desempenho.tempoDeEstudo(var30);
    java.util.HashMap var34 = Stude.Desempenho.tempoDeEstudo(var30);
    boolean var35 = var17.equals((java.lang.Object)var34);
    var13.addDisciplina(var17);
    Stude.Disciplina var38 = var13.getDisciplina("Metodo de estudo avancado");
    java.util.List var39 = var13.getDisciplinas();
    Stude.Disciplina var41 = var13.getDisciplina("Metodo de estudo regular");
    Stude.Stude var43 = new Stude.Stude("hi!");
    var43.setMetodoAvancado();
    Stude.MetodoDeEstudo var45 = var43.getMetodoDeEstudo();
    java.util.HashMap var46 = var43.desempenho();
    var43.setMetodoRegular();
    java.util.HashMap var48 = var43.desempenho();
    boolean var49 = var41.equals((java.lang.Object)var48);
    int var50 = var41.getCor();
    var41.setNome("Metodo de estudo avancado");
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test454");


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
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var22.setCor((-1));
    java.lang.String var25 = var22.getNome();
    var22.setCor((-1));
    var22.setCor(0);
    int var30 = var22.getCor();
    var0.addDisciplina(var22);
    Stude.Cronograma var32 = new Stude.Cronograma();
    int var33 = var32.tamanhoDisciplinas();
    Stude.Cronograma var34 = new Stude.Cronograma();
    Stude.Disciplina var36 = var34.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var38 = var34.getDisciplina("");
    Stude.Cronograma var39 = new Stude.Cronograma();
    java.util.List var40 = var39.getDisciplinas();
    Stude.Disciplina var42 = var39.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var44 = var39.getDisciplina("hi!");
    Stude.Disciplina var47 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var39.addDisciplina(var47);
    int var49 = var47.getCor();
    var34.addDisciplina(var47);
    var32.addDisciplina(var47);
    java.lang.String var52 = var47.toString();
    var0.addDisciplina(var47);
    
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
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Metodo de estudo regular"+ "'", var52.equals("Metodo de estudo regular"));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test455");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    java.util.HashMap var8 = var1.desempenho();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Stude var11 = new Stude.Stude("hi!");
    int var12 = var11.intervalo();
    Stude.Usuario var13 = var11.getUsuario();
    Stude.Cronograma var14 = var11.getCronograma();
    int var15 = var14.tamanhoDisciplinas();
    Stude.Stude var17 = new Stude.Stude("hi!");
    Stude.Cronograma var18 = var17.getCronograma();
    Stude.Cronograma var19 = var17.getCronograma();
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var22.setCor((-1));
    int var25 = var22.getCor();
    var22.addHorasDeEstudo(1.0d);
    java.lang.String var28 = var22.getNome();
    Stude.Disciplina var31 = new Stude.Disciplina("hi!", 30);
    boolean var32 = var22.equals((java.lang.Object)var31);
    java.lang.String var33 = var31.getNome();
    var31.setNome("hi!");
    var19.addDisciplina(var31);
    var14.addDisciplina(var31);
    var9.addDisciplina(var31);
    Stude.Disciplina var40 = var9.getDisciplina("hi!");
    java.util.List var41 = var9.getDisciplinas();
    int var42 = var9.tamanhoDisciplinas();
    int var43 = var9.tamanhoDisciplinas();
    int var44 = var9.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test456");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    
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
    assertTrue(var7 == 5);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test457");


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
    Stude.Disciplina var22 = var0.getDisciplina("Metodo de estudo avancado");
    
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

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test458");


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
    int var40 = var30.getIntervalo();
    
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
    assertTrue(var40 == 10);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test459");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    var2.setNome("hi!");
    Stude.Cronograma var8 = new Stude.Cronograma();
    java.util.List var9 = var8.getDisciplinas();
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var9);
    boolean var11 = var2.equals((java.lang.Object)var9);
    var2.setCor(30);
    Stude.Stude var15 = new Stude.Stude("hi!");
    int var16 = var15.intervalo();
    Stude.Usuario var17 = var15.getUsuario();
    int var18 = var15.intervalo();
    java.util.List var19 = var15.getDisciplinas();
    Stude.Cronograma var20 = var15.getCronograma();
    int var21 = var15.tempoDeEstudo();
    boolean var22 = var2.equals((java.lang.Object)var15);
    Stude.Stude var24 = new Stude.Stude("hi!");
    var24.setMetodoAvancado();
    Stude.MetodoDeEstudo var26 = var24.getMetodoDeEstudo();
    java.util.HashMap var27 = var24.desempenho();
    var24.setMetodoRegular();
    java.util.List var29 = var24.getDisciplinas();
    java.util.HashMap var30 = var24.desempenho();
    int var31 = var24.intervalo();
    Stude.Cronograma var32 = var24.getCronograma();
    var24.setMetodoAvancado();
    var24.setMetodoRegular();
    var24.setMetodoRegular();
    int var36 = var24.tempoDeEstudo();
    java.util.HashMap var37 = var24.desempenho();
    boolean var38 = var2.equals((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test460");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
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
    assertTrue(var3 == 15);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test461");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    double var4 = var2.getHorasEstudadas();
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.toString();
    var2.setCor((-1));
    var2.setCor(15);
    java.lang.String var11 = var2.toString();
    java.lang.String var12 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test462");


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
    int var11 = var0.getTempo();
    int var12 = var0.getTempo();
    int var13 = var0.getTempo();
    java.lang.String var14 = var0.toString();
    int var15 = var0.getTempo();
    int var16 = var0.getIntervalo();
    int var17 = var0.getTempo();
    
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
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test463");


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
    java.lang.String var14 = var0.toString();
    int var15 = var0.getIntervalo();
    
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
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test464");


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
    var11.setNome("Metodo de estudo regular");
    var11.setCor(10);
    
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

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test465");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var12 = var1.getDisciplina("Metodo de estudo regular");
    var1.addDisciplina("hi!", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test466");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var6 = var1.getCronograma();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setNomeUsuario("Metodo de estudo regular");
    
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

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test467");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var21 = var0.removeDisciplina("hi!");
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test468");


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
    java.util.List var35 = var7.getDisciplinas();
    Stude.Disciplina var38 = new Stude.Disciplina("hi!", 5);
    double var39 = var38.getHorasEstudadas();
    var38.addHorasDeEstudo(10.0d);
    java.lang.String var42 = var38.toString();
    java.lang.String var43 = var38.toString();
    java.lang.String var44 = var38.getNome();
    var38.addHorasDeEstudo(10.0d);
    var38.setCor(5);
    var7.addDisciplina(var38);
    int var50 = var7.tamanhoDisciplinas();
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 3);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test469");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getIntervalo();
    int var12 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test470");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test471");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    java.util.HashMap var7 = var1.desempenho();
    var1.setMetodoRegular();
    var1.addDisciplina("Metodo de estudo regular", 3);
    Stude.Disciplina var13 = var1.getDisciplina("Metodo de estudo regular");
    int var14 = var13.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test472");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    double var4 = var2.getHorasEstudadas();
    java.lang.String var5 = var2.toString();
    var2.setNome("hi!");
    java.lang.String var8 = var2.getNome();
    var2.setNome("Metodo de estudo regular");
    var2.addHorasDeEstudo(1.0d);
    Stude.Stude var14 = new Stude.Stude("hi!");
    Stude.Cronograma var15 = var14.getCronograma();
    int var16 = var14.tempoDeEstudo();
    int var17 = var14.tempoDeEstudo();
    int var18 = var14.intervalo();
    int var19 = var14.tempoDeEstudo();
    boolean var20 = var2.equals((java.lang.Object)var14);
    var2.setCor(1);
    var2.setCor(30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test473");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    double var4 = var2.getHorasEstudadas();
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
    var2.addHorasDeEstudo(20.0d);
    var2.setCor((-1));
    Stude.Stude var12 = new Stude.Stude("hi!");
    var12.setMetodoAvancado();
    int var14 = var12.intervalo();
    var12.setMetodoAvancado();
    int var16 = var12.tempoDeEstudo();
    Stude.Cronograma var17 = var12.getCronograma();
    Stude.Usuario var18 = var12.getUsuario();
    boolean var19 = var2.equals((java.lang.Object)var18);
    java.lang.String var20 = var18.getNome();
    var18.setNome("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var18.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test474");


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
    int var14 = var4.tamanhoDisciplinas();
    Stude.Disciplina var16 = var4.getDisciplina("");
    
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
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test475");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo regular");
    var1.addDisciplina("Metodo de estudo avancado", 100);
    var1.setNomeUsuario("Metodo de estudo regular");
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test476");


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
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    int var13 = var0.getIntervalo();
    java.lang.String var14 = var0.toString();
    int var15 = var0.getIntervalo();
    
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
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test477");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    
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
    assertTrue(var8 == 15);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test478");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    int var10 = var8.getCor();
    java.lang.String var11 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test479");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    int var3 = var0.tamanhoDisciplinas();
    Stude.Cronograma var4 = new Stude.Cronograma();
    int var5 = var4.tamanhoDisciplinas();
    Stude.Cronograma var6 = new Stude.Cronograma();
    Stude.Disciplina var8 = var6.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var10 = var6.getDisciplina("");
    Stude.Cronograma var11 = new Stude.Cronograma();
    java.util.List var12 = var11.getDisciplinas();
    Stude.Disciplina var14 = var11.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var16 = var11.getDisciplina("hi!");
    Stude.Disciplina var19 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var11.addDisciplina(var19);
    int var21 = var19.getCor();
    var6.addDisciplina(var19);
    var4.addDisciplina(var19);
    java.lang.String var24 = var19.getNome();
    var0.addDisciplina(var19);
    boolean var27 = var0.removeDisciplina("Metodo de estudo regular");
    Stude.Disciplina var30 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var30.setCor((-1));
    int var33 = var30.getCor();
    var30.addHorasDeEstudo(1.0d);
    java.lang.String var36 = var30.getNome();
    Stude.Disciplina var39 = new Stude.Disciplina("hi!", 30);
    boolean var40 = var30.equals((java.lang.Object)var39);
    java.lang.String var41 = var30.getNome();
    var30.addHorasDeEstudo(100.0d);
    var0.addDisciplina(var30);
    Stude.Disciplina var47 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var47.setCor((-1));
    var47.addHorasDeEstudo(10.0d);
    var47.setNome("Metodo de estudo regular");
    Stude.Stude var55 = new Stude.Stude("hi!");
    int var56 = var55.intervalo();
    Stude.Usuario var57 = var55.getUsuario();
    var55.addDisciplina("hi!", 0);
    java.util.HashMap var61 = var55.desempenho();
    Stude.MetodoDeEstudo var62 = var55.getMetodoDeEstudo();
    boolean var63 = var47.equals((java.lang.Object)var55);
    Stude.Cronograma var64 = var55.getCronograma();
    Stude.MetodoDeEstudo var65 = var55.getMetodoDeEstudo();
    Stude.Cronograma var66 = var55.getCronograma();
    Stude.Stude var68 = new Stude.Stude("hi!");
    int var69 = var68.intervalo();
    Stude.MetodoDeEstudo var70 = var68.getMetodoDeEstudo();
    var68.addDisciplina("hi!", 2);
    Stude.Disciplina var75 = var68.getDisciplina("hi!");
    var66.addDisciplina(var75);
    var75.setNome("Metodo de estudo regular");
    var0.addDisciplina(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo regular"+ "'", var36.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo regular"+ "'", var41.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test480");


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
    int var10 = var0.getTempo();
    int var11 = var0.getIntervalo();
    
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
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test481");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    double var9 = var2.getHorasEstudadas();
    double var10 = var2.getHorasEstudadas();
    java.lang.String var11 = var2.toString();
    var2.addHorasDeEstudo(100.0d);
    double var14 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 101.0d);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test482");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 10);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test483");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    
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
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test484");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    java.util.HashMap var8 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test485");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test486");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    int var6 = var1.intervalo();
    int var7 = var1.intervalo();
    var1.setMetodoRegular();
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.List var10 = var9.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test487");


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
    Stude.Disciplina var14 = var1.getDisciplina("Metodo de estudo avancado");
    java.util.HashMap var15 = var1.desempenho();
    int var16 = var1.tempoDeEstudo();
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test488");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    java.util.HashMap var10 = var1.desempenho();
    var1.addDisciplina("hi!", 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test489");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("hi!");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var8 = var7.toString();
    var7.setCor(15);
    var7.setCor(15);
    var2.addDisciplina(var7);
    Stude.Disciplina var15 = var2.getDisciplina("hi!");
    java.util.List var16 = var2.getDisciplinas();
    java.util.HashMap var17 = Stude.Desempenho.tempoDeEstudo(var16);
    
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

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test490");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    
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
    assertTrue(var8 == 30);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test491");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    var1.setNomeUsuario("hi!");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test492");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.MetodoDeEstudo var2 = var1.getMetodoDeEstudo();
    Stude.Cronograma var3 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Usuario var5 = var1.getUsuario();
    Stude.Usuario var6 = var1.getUsuario();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test493");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.intervalo();
    var1.setMetodoAvancado();
    java.util.HashMap var8 = var1.desempenho();
    var1.addDisciplina("hi!", 10);
    var1.addDisciplina("hi!", 15);
    Stude.Disciplina var16 = var1.getDisciplina("hi!");
    
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
    assertNotNull(var16);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test494");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    Stude.Cronograma var6 = var1.getCronograma();
    java.util.HashMap var7 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test495");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var12 = new Stude.Disciplina("hi!", 5);
    double var13 = var12.getHorasEstudadas();
    var12.addHorasDeEstudo(10.0d);
    java.lang.String var16 = var12.toString();
    int var17 = var12.getCor();
    Stude.Stude var19 = new Stude.Stude("hi!");
    int var20 = var19.intervalo();
    Stude.Usuario var21 = var19.getUsuario();
    int var22 = var19.intervalo();
    java.util.List var23 = var19.getDisciplinas();
    boolean var24 = var12.equals((java.lang.Object)var23);
    Stude.Stude var26 = new Stude.Stude("hi!");
    var26.setMetodoAvancado();
    Stude.MetodoDeEstudo var28 = var26.getMetodoDeEstudo();
    var26.setMetodoAvancado();
    java.util.List var30 = var26.getDisciplinas();
    java.util.HashMap var31 = var26.desempenho();
    Stude.Cronograma var32 = var26.getCronograma();
    Stude.Disciplina var35 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var36 = var35.toString();
    var35.setCor(15);
    java.lang.String var39 = var35.getNome();
    var32.addDisciplina(var35);
    var35.setNome("Metodo de estudo regular");
    boolean var43 = var12.equals((java.lang.Object)var35);
    var9.addDisciplina(var35);
    boolean var46 = var9.removeDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo avancado"+ "'", var36.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo avancado"+ "'", var39.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test496");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test497");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    var2.setCor((-1));
    var2.addHorasDeEstudo(100.0d);
    java.lang.String var10 = var2.toString();
    double var11 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(2.0d);
    int var14 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test498");


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
    java.lang.String var27 = var15.toString();
    java.lang.String var28 = var15.toString();
    var0.addDisciplina(var15);
    int var30 = var0.tamanhoDisciplinas();
    
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
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo regular"+ "'", var27.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test499");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    Stude.Disciplina var8 = var0.getDisciplina("hi!");
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var11.addHorasDeEstudo(10.0d);
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = var11.getNome();
    Stude.Cronograma var16 = new Stude.Cronograma();
    Stude.Disciplina var18 = var16.getDisciplina("Metodo de estudo regular");
    boolean var19 = var11.equals((java.lang.Object)"Metodo de estudo regular");
    int var20 = var11.getCor();
    var0.addDisciplina(var11);
    int var22 = var0.tamanhoDisciplinas();
    Stude.Cronograma var23 = new Stude.Cronograma();
    java.util.List var24 = var23.getDisciplinas();
    Stude.Disciplina var26 = var23.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var28 = var23.getDisciplina("hi!");
    java.util.List var29 = var23.getDisciplinas();
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.setCor((-1));
    int var35 = var32.getCor();
    var32.addHorasDeEstudo(1.0d);
    java.lang.String var38 = var32.getNome();
    var23.addDisciplina(var32);
    java.lang.String var40 = var32.getNome();
    double var41 = var32.getHorasEstudadas();
    int var42 = var32.getCor();
    var0.addDisciplina(var32);
    java.util.List var44 = var0.getDisciplinas();
    int var45 = var0.tamanhoDisciplinas();
    Stude.Cronograma var46 = new Stude.Cronograma();
    java.util.List var47 = var46.getDisciplinas();
    Stude.Disciplina var49 = var46.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var51 = var46.getDisciplina("hi!");
    Stude.Disciplina var54 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var46.addDisciplina(var54);
    Stude.Disciplina var58 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var46.addDisciplina(var58);
    Stude.Disciplina var62 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var63 = var62.toString();
    var62.setCor(15);
    var62.setCor(10);
    var46.addDisciplina(var62);
    java.lang.String var69 = var62.getNome();
    var62.setCor(0);
    var0.addDisciplina(var62);
    
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
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo regular"+ "'", var38.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo regular"+ "'", var40.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "Metodo de estudo avancado"+ "'", var63.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "Metodo de estudo avancado"+ "'", var69.equals("Metodo de estudo avancado"));

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test500");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var5 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var5.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

}