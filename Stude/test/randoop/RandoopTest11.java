package randoop;

import junit.framework.*;

public class RandoopTest11 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test1");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    
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
    assertTrue(var6 == 5);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test2");


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
    int var19 = var1.intervalo();
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
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 5);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test3");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    boolean var10 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    var2.addHorasDeEstudo(10.0d);
    var2.setNome("Metodo de estudo regular");
    var2.setCor(2);
    java.lang.String var17 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test4");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo avancado");
    java.util.List var13 = var1.getDisciplinas();
    Stude.Cronograma var14 = var1.getCronograma();
    Stude.Stude var16 = new Stude.Stude("hi!");
    Stude.Cronograma var17 = var16.getCronograma();
    Stude.Cronograma var18 = var16.getCronograma();
    Stude.Disciplina var21 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var21.setCor((-1));
    int var24 = var21.getCor();
    var21.addHorasDeEstudo(1.0d);
    java.lang.String var27 = var21.getNome();
    Stude.Disciplina var30 = new Stude.Disciplina("hi!", 30);
    boolean var31 = var21.equals((java.lang.Object)var30);
    java.lang.String var32 = var30.getNome();
    var30.setNome("hi!");
    var18.addDisciplina(var30);
    Stude.Disciplina var38 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var38.setCor((-1));
    int var41 = var38.getCor();
    var38.addHorasDeEstudo(1.0d);
    java.lang.String var44 = var38.getNome();
    Stude.Disciplina var47 = new Stude.Disciplina("hi!", 30);
    boolean var48 = var38.equals((java.lang.Object)var47);
    java.lang.String var49 = var38.toString();
    var18.addDisciplina(var38);
    java.lang.String var51 = var38.toString();
    double var52 = var38.getHorasEstudadas();
    Stude.Stude var54 = new Stude.Stude("hi!");
    int var55 = var54.intervalo();
    Stude.Usuario var56 = var54.getUsuario();
    var54.setMetodoAvancado();
    boolean var58 = var38.equals((java.lang.Object)var54);
    var14.addDisciplina(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo regular"+ "'", var27.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo regular"+ "'", var44.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "Metodo de estudo regular"+ "'", var49.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "Metodo de estudo regular"+ "'", var51.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test5");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    Stude.Disciplina var9 = var0.getDisciplina("hi!");
    java.util.List var10 = var0.getDisciplinas();
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var13.setCor((-1));
    int var16 = var13.getCor();
    var13.addHorasDeEstudo(1.0d);
    java.lang.String var19 = var13.toString();
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    Stude.Stude var24 = new Stude.Stude("hi!");
    var24.setMetodoAvancado();
    Stude.MetodoDeEstudo var26 = var24.getMetodoDeEstudo();
    java.util.HashMap var27 = var24.desempenho();
    var24.setMetodoRegular();
    Stude.MetodoDeEstudo var29 = var24.getMetodoDeEstudo();
    var24.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var32 = var24.getCronograma();
    int var33 = var32.tamanhoDisciplinas();
    Stude.Disciplina var36 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var37 = var36.toString();
    java.lang.String var38 = var36.toString();
    java.lang.String var39 = var36.toString();
    var32.addDisciplina(var36);
    Stude.Disciplina var43 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var43.setCor((-1));
    var43.addHorasDeEstudo(10.0d);
    java.lang.String var48 = var43.getNome();
    var43.setNome("Metodo de estudo regular");
    var32.addDisciplina(var43);
    Stude.Stude var53 = new Stude.Stude("hi!");
    Stude.Cronograma var54 = var53.getCronograma();
    int var55 = var53.tempoDeEstudo();
    int var56 = var53.tempoDeEstudo();
    int var57 = var53.intervalo();
    var53.setMetodoAvancado();
    Stude.Cronograma var59 = var53.getCronograma();
    Stude.Disciplina var62 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var63 = var62.getHorasEstudadas();
    var62.setNome("hi!");
    var62.setNome("hi!");
    var59.addDisciplina(var62);
    var62.setCor(30);
    var32.addDisciplina(var62);
    var62.setCor((-1));
    int var74 = var62.getCor();
    var0.addDisciplina(var62);
    
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
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo avancado"+ "'", var37.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo avancado"+ "'", var38.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo avancado"+ "'", var39.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Metodo de estudo regular"+ "'", var48.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == (-1));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test6");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    int var10 = var1.tempoDeEstudo();
    Stude.Cronograma var11 = var1.getCronograma();
    java.util.List var12 = var11.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test7");


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
    Stude.MetodoDeEstudo var16 = var1.getMetodoDeEstudo();
    boolean var18 = var1.removeDisciplina("Metodo de estudo regular");
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test8");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    int var7 = var1.intervalo();
    Stude.Cronograma var8 = var1.getCronograma();
    int var9 = var1.intervalo();
    var1.setMetodoRegular();
    
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
    assertTrue(var9 == 10);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test9");


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
    Stude.Disciplina var15 = var1.getDisciplina("hi!");
    var1.addDisciplina("Metodo de estudo regular", 0);
    int var19 = var1.intervalo();
    Stude.Cronograma var20 = var1.getCronograma();
    Stude.Cronograma var21 = var1.getCronograma();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test10");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    int var11 = var1.tempoDeEstudo();
    Stude.Cronograma var12 = var1.getCronograma();
    java.util.List var13 = var1.getDisciplinas();
    java.util.HashMap var14 = Stude.Desempenho.tempoDeEstudo(var13);
    
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
    assertNotNull(var14);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test11");


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
    Stude.MetodoDeEstudo var17 = var9.getMetodoDeEstudo();
    boolean var18 = var2.equals((java.lang.Object)var17);
    java.lang.String var19 = var2.getNome();
    java.lang.String var20 = var2.getNome();
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo avancado"+ "'", var19.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo avancado"+ "'", var20.equals("Metodo de estudo avancado"));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test12");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
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
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test13");


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
    java.util.HashMap var30 = Stude.Desempenho.tempoDeEstudo(var29);
    
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

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test14");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var8 = var7.toString();
    var7.setCor(15);
    var7.setNome("Metodo de estudo regular");
    int var13 = var7.getCor();
    var2.addDisciplina(var7);
    int var15 = var7.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test15");


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
    var1.setNomeUsuario("Metodo de estudo regular");
    int var16 = var1.intervalo();
    
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
    assertTrue(var16 == 10);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test16");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("Metodo de estudo regular", 10);
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Cronograma var8 = var1.getCronograma();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("Metodo de estudo avancado");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test17");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 5);
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var13 = var1.getMetodoDeEstudo();
    Stude.Cronograma var14 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test18");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var7 = var0.getDisciplina("");
    Stude.Disciplina var9 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Stude var11 = new Stude.Stude("hi!");
    var11.setMetodoAvancado();
    Stude.MetodoDeEstudo var13 = var11.getMetodoDeEstudo();
    java.util.HashMap var14 = var11.desempenho();
    var11.setMetodoRegular();
    java.util.List var16 = var11.getDisciplinas();
    java.util.HashMap var17 = var11.desempenho();
    int var18 = var11.intervalo();
    Stude.Cronograma var19 = var11.getCronograma();
    var11.setMetodoAvancado();
    Stude.Cronograma var21 = var11.getCronograma();
    Stude.Disciplina var24 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var25 = var24.getCor();
    double var26 = var24.getHorasEstudadas();
    java.lang.String var27 = var24.toString();
    var21.addDisciplina(var24);
    Stude.Disciplina var31 = new Stude.Disciplina("hi!", 5);
    double var32 = var31.getHorasEstudadas();
    var31.addHorasDeEstudo(10.0d);
    var31.addHorasDeEstudo(10.0d);
    var21.addDisciplina(var31);
    Stude.Disciplina var39 = var21.getDisciplina("Metodo de estudo regular");
    var0.addDisciplina(var39);
    Stude.Disciplina var42 = var0.getDisciplina("Metodo de estudo avancado");
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo regular"+ "'", var27.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test19");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    double var10 = var2.getHorasEstudadas();
    int var11 = var2.getCor();
    int var12 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test20");


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
    java.lang.String var14 = var13.getNome();
    java.lang.String var15 = var13.getNome();
    
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
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test21");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    int var10 = var0.getTempo();
    
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
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test22");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test23");


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
    int var25 = var0.tamanhoDisciplinas();
    java.util.List var26 = var0.getDisciplinas();
    Stude.Disciplina var28 = var0.getDisciplina("");
    boolean var30 = var0.removeDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var32 = var0.removeDisciplina("hi!");
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
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test24");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var13 = var1.desempenho();
    Stude.Disciplina var15 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var17 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Usuario var18 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var18.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test25");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    double var10 = var8.getHorasEstudadas();
    var8.setCor(2);
    var8.setCor(2);
    java.lang.String var15 = var8.toString();
    java.lang.String var16 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test26");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoAvancado();
    int var7 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
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

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test27");


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
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    Stude.Usuario var14 = var1.getUsuario();
    var1.addDisciplina("Metodo de estudo regular", 2);
    
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
    assertNotNull(var14);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test28");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 15);
    Stude.Cronograma var15 = var1.getCronograma();
    
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
    assertNotNull(var15);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test29");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.intervalo();
    java.util.HashMap var7 = var1.desempenho();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 3);
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
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test30");


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
    java.util.List var32 = var21.getDisciplinas();
    Stude.Disciplina var34 = var21.getDisciplina("Metodo de estudo avancado");
    java.util.List var35 = var21.getDisciplinas();
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test31");


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
    java.lang.String var28 = var21.toString();
    int var29 = var21.getCor();
    var21.setNome("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 30);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test32");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Usuario var9 = var1.getUsuario();
    java.util.List var10 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test33");


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
    java.util.HashMap var13 = var1.desempenho();
    java.util.List var14 = var1.getDisciplinas();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test34");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo avancado", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test35");


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
    double var35 = var29.getHorasEstudadas();
    
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

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test36");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    var1.setMetodoRegular();
    Stude.Disciplina var7 = var1.getDisciplina("");
    Stude.Disciplina var9 = var1.getDisciplina("");
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test37");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    int var9 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var14 = var2.toString();
    var2.setCor(30);
    var2.setCor(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test38");


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
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getTempo();
    
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
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test39");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var10 = var1.getCronograma();
    int var11 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Usuario var13 = var1.getUsuario();
    
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
    assertNotNull(var13);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test40");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    Stude.Disciplina var8 = var1.getDisciplina("");
    java.util.List var9 = var1.getDisciplinas();
    
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

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test41");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
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
    assertNotNull(var7);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test42");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    int var6 = var1.tempoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    int var9 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    
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

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test43");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var5 = var1.intervalo();
    java.util.List var6 = var1.getDisciplinas();
    int var7 = var1.tempoDeEstudo();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoAvancado();
    Stude.Cronograma var11 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test44");


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
    Stude.Disciplina var22 = var6.getDisciplina("Metodo de estudo avancado");
    java.util.List var23 = var6.getDisciplinas();
    Stude.Disciplina var25 = var6.getDisciplina("Metodo de estudo avancado");
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test45");


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
    var1.setMetodoAvancado();
    java.util.HashMap var14 = var1.desempenho();
    int var15 = var1.tempoDeEstudo();
    Stude.Disciplina var17 = var1.getDisciplina("hi!");
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test46");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo regular");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoRegular();
    int var5 = var1.intervalo();
    var1.addDisciplina("Metodo de estudo avancado", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test47");


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
    int var45 = var11.tamanhoDisciplinas();
    java.util.List var46 = var11.getDisciplinas();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test48");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test49");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var2.setCor(10);
    var2.addHorasDeEstudo(10.0d);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test50");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Usuario var7 = var1.getUsuario();
    var1.addDisciplina("hi!", 15);
    var1.addDisciplina("Metodo de estudo avancado", 5);
    Stude.Disciplina var15 = var1.getDisciplina("hi!");
    Stude.Cronograma var16 = var1.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    boolean var19 = var16.removeDisciplina("hi!");
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test51");


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
    var2.setNome("Metodo de estudo regular");
    java.lang.String var17 = var2.getNome();
    
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
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo regular"+ "'", var17.equals("Metodo de estudo regular"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test52");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    int var3 = var0.getTempo();
    int var4 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test53");


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
    Stude.Stude var49 = new Stude.Stude("hi!");
    var49.setMetodoAvancado();
    Stude.MetodoDeEstudo var51 = var49.getMetodoDeEstudo();
    int var52 = var49.tempoDeEstudo();
    int var53 = var49.tempoDeEstudo();
    java.util.HashMap var54 = var49.desempenho();
    boolean var55 = var35.equals((java.lang.Object)var54);
    
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
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test54");


    Stude.Usuario var1 = new Stude.Usuario("hi!");
    var1.setNome("Metodo de estudo avancado");
    var1.setNome("Metodo de estudo avancado");
    java.lang.String var6 = var1.getNome();
    java.lang.String var7 = var1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test55");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    int var9 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test56");


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
    var29.setNome("hi!");
    var29.setCor(30);
    
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

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test57");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo avancado", 4);
    var1.addDisciplina("hi!", 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test58");


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
    var21.setCor(100);
    java.lang.String var30 = var21.toString();
    double var31 = var21.getHorasEstudadas();
    var21.setCor(30);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test59");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var4 = var0.getDisciplinas();
    int var5 = var0.tamanhoDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    Stude.Disciplina var8 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Stude var10 = new Stude.Stude("hi!");
    int var11 = var10.intervalo();
    Stude.MetodoDeEstudo var12 = var10.getMetodoDeEstudo();
    var10.addDisciplina("hi!", 2);
    Stude.Disciplina var17 = var10.getDisciplina("hi!");
    var17.addHorasDeEstudo(100.0d);
    var17.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var17);
    var17.setNome("Metodo de estudo regular");
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test60");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    java.util.HashMap var3 = var1.desempenho();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.tempoDeEstudo();
    Stude.Cronograma var6 = var1.getCronograma();
    int var7 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test61");


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
    java.lang.String var15 = var0.toString();
    
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
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test62");


    Stude.Usuario var1 = new Stude.Usuario("Metodo de estudo regular");
    java.lang.String var2 = var1.getNome();
    var1.setNome("Metodo de estudo regular");
    var1.setNome("Metodo de estudo avancado");
    java.lang.String var7 = var1.getNome();
    var1.setNome("Metodo de estudo avancado");
    java.lang.String var10 = var1.getNome();
    java.lang.String var11 = var1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test63");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test64");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Cronograma var6 = var1.getCronograma();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test65");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("");
    java.util.List var9 = var1.getDisciplinas();
    Stude.Cronograma var10 = var1.getCronograma();
    int var11 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = var1.removeDisciplina("hi!");
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
    assertTrue(var11 == 10);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test66");


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
    Stude.Disciplina var15 = var1.getDisciplina("hi!");
    var1.addDisciplina("Metodo de estudo regular", 0);
    java.util.List var19 = var1.getDisciplinas();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test67");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    java.util.List var8 = var1.getDisciplinas();
    java.util.HashMap var9 = var1.desempenho();
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    Stude.Cronograma var11 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test68");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    java.util.HashMap var8 = var1.desempenho();
    Stude.Cronograma var9 = var1.getCronograma();
    var1.setNomeUsuario("hi!");
    Stude.Cronograma var12 = var1.getCronograma();
    java.util.List var13 = var12.getDisciplinas();
    java.util.HashMap var14 = Stude.Desempenho.tempoDeEstudo(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test69");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.HashMap var11 = var1.desempenho();
    java.util.HashMap var12 = var1.desempenho();
    int var13 = var1.tempoDeEstudo();
    int var14 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var15 = var1.getMetodoDeEstudo();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test70");


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
    java.lang.String var23 = var10.toString();
    
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
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo regular"+ "'", var23.equals("Metodo de estudo regular"));

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test71");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
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
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test72");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    Stude.Disciplina var6 = var1.getDisciplina("hi!");
    java.util.HashMap var7 = var1.desempenho();
    
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

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test73");


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
    int var65 = var9.getCor();
    
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
    assertTrue(var65 == 100);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test74");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setNomeUsuario("Metodo de estudo avancado");
    int var9 = var1.intervalo();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test75");


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
    java.util.List var39 = var0.getDisciplinas();
    java.util.List var40 = var0.getDisciplinas();
    java.util.HashMap var41 = Stude.Desempenho.tempoDeEstudo(var40);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test76");


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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test77");


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
    java.lang.String var28 = var15.toString();
    var15.setNome("Metodo de estudo regular");
    Stude.Stude var32 = new Stude.Stude("hi!");
    Stude.Cronograma var33 = var32.getCronograma();
    Stude.Usuario var34 = var32.getUsuario();
    java.lang.String var35 = var34.getNome();
    java.lang.String var36 = var34.getNome();
    var34.setNome("Metodo de estudo regular");
    java.lang.String var39 = var34.getNome();
    java.lang.String var40 = var34.getNome();
    boolean var41 = var15.equals((java.lang.Object)var40);
    
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
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo regular"+ "'", var39.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo regular"+ "'", var40.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test78");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    
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
    assertTrue(var7 == 30);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test79");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    java.util.HashMap var10 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test80");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 10);
    int var8 = var7.getCor();
    var0.addDisciplina(var7);
    java.util.List var10 = var0.getDisciplinas();
    java.util.HashMap var11 = Stude.Desempenho.tempoDeEstudo(var10);
    java.util.HashMap var12 = Stude.Desempenho.tempoDeEstudo(var10);
    java.util.HashMap var13 = Stude.Desempenho.tempoDeEstudo(var10);
    java.util.HashMap var14 = Stude.Desempenho.tempoDeEstudo(var10);
    java.util.HashMap var15 = Stude.Desempenho.tempoDeEstudo(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
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

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test81");


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
    Stude.Disciplina var30 = var9.getDisciplina("");
    Stude.Disciplina var32 = var9.getDisciplina("hi!");
    java.util.List var33 = var9.getDisciplinas();
    boolean var35 = var9.removeDisciplina("Metodo de estudo regular");
    
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
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test82");


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
    int var23 = var12.tamanhoDisciplinas();
    Stude.Cronograma var24 = new Stude.Cronograma();
    int var25 = var24.tamanhoDisciplinas();
    Stude.Disciplina var28 = new Stude.Disciplina("Metodo de estudo regular", 1);
    var24.addDisciplina(var28);
    var12.addDisciplina(var28);
    java.util.List var31 = var12.getDisciplinas();
    
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
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test83");


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
    double var23 = var11.getHorasEstudadas();
    int var24 = var11.getCor();
    
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
    assertTrue(var23 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test84");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    var1.setMetodoAvancado();
    java.util.List var9 = var1.getDisciplinas();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test85");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
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
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test86");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var10 = new Stude.Disciplina("hi!", 5);
    double var11 = var10.getHorasEstudadas();
    var10.addHorasDeEstudo(10.0d);
    java.lang.String var14 = var10.toString();
    int var15 = var10.getCor();
    Stude.Disciplina var18 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var19 = var18.getHorasEstudadas();
    double var20 = var18.getHorasEstudadas();
    java.lang.String var21 = var18.toString();
    java.lang.String var22 = var18.getNome();
    var18.addHorasDeEstudo(20.0d);
    boolean var25 = var10.equals((java.lang.Object)var18);
    java.lang.String var26 = var18.getNome();
    var7.addDisciplina(var18);
    Stude.Disciplina var30 = new Stude.Disciplina("hi!", 30);
    var30.setCor(2);
    int var33 = var30.getCor();
    var7.addDisciplina(var30);
    Stude.Disciplina var36 = var7.getDisciplina("Metodo de estudo avancado");
    
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
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo regular"+ "'", var21.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo regular"+ "'", var22.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test87");


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
    Stude.Disciplina var16 = var13.getDisciplina("");
    int var17 = var13.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("hi!", 15);
    var20.setCor(15);
    var13.addDisciplina(var20);
    java.util.List var24 = var13.getDisciplinas();
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test88");


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
    int var32 = var7.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var34 = var7.removeDisciplina("Metodo de estudo avancado");
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
    assertTrue(var32 == 1);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test89");


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
    int var15 = var0.getTempo();
    
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
    assertTrue(var15 == 30);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test90");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    int var11 = var0.getTempo();
    
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
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test91");


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
    var1.setMetodoRegular();
    var1.addDisciplina("Metodo de estudo avancado", 15);
    java.util.List var21 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var23 = var1.removeDisciplina("");
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test92");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo regular", 1);
    java.util.List var12 = var1.getDisciplinas();
    int var13 = var1.tempoDeEstudo();
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test93");


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
    Stude.Disciplina var25 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var26 = var25.toString();
    var25.setCor(15);
    java.lang.String var29 = var25.getNome();
    Stude.Cronograma var30 = new Stude.Cronograma();
    Stude.Disciplina var32 = var30.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var34 = var30.getDisciplina("");
    java.util.List var35 = var30.getDisciplinas();
    boolean var36 = var25.equals((java.lang.Object)var30);
    Stude.Disciplina var39 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var40 = var39.toString();
    Stude.Stude var42 = new Stude.Stude("hi!");
    var42.setMetodoAvancado();
    Stude.MetodoDeEstudo var44 = var42.getMetodoDeEstudo();
    java.util.HashMap var45 = var42.desempenho();
    var42.setMetodoRegular();
    Stude.MetodoDeEstudo var47 = var42.getMetodoDeEstudo();
    var42.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var50 = var42.desempenho();
    boolean var51 = var39.equals((java.lang.Object)var50);
    var30.addDisciplina(var39);
    var39.setCor(0);
    var0.addDisciplina(var39);
    Stude.Stude var57 = new Stude.Stude("hi!");
    var57.setMetodoAvancado();
    Stude.MetodoDeEstudo var59 = var57.getMetodoDeEstudo();
    java.util.HashMap var60 = var57.desempenho();
    Stude.Cronograma var61 = var57.getCronograma();
    var57.setMetodoRegular();
    Stude.Cronograma var63 = var57.getCronograma();
    boolean var64 = var39.equals((java.lang.Object)var63);
    int var65 = var63.tamanhoDisciplinas();
    Stude.Cronograma var66 = new Stude.Cronograma();
    java.util.List var67 = var66.getDisciplinas();
    Stude.Disciplina var69 = var66.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var71 = var66.getDisciplina("hi!");
    Stude.Disciplina var74 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var66.addDisciplina(var74);
    Stude.Disciplina var78 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var66.addDisciplina(var78);
    int var80 = var66.tamanhoDisciplinas();
    Stude.Disciplina var83 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var84 = var83.toString();
    var83.setCor(15);
    var83.setNome("Metodo de estudo regular");
    int var89 = var83.getCor();
    var66.addDisciplina(var83);
    Stude.Disciplina var92 = var66.getDisciplina("Metodo de estudo regular");
    java.lang.String var93 = var92.toString();
    var92.addHorasDeEstudo(100.0d);
    double var96 = var92.getHorasEstudadas();
    var92.setCor(3);
    var63.addDisciplina(var92);
    
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
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo avancado"+ "'", var40.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "Metodo de estudo avancado"+ "'", var84.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "Metodo de estudo regular"+ "'", var93.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 100.0d);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test94");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Usuario var5 = var1.getUsuario();
    var1.setMetodoRegular();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test95");


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
    int var23 = var12.tamanhoDisciplinas();
    int var24 = var12.tamanhoDisciplinas();
    Stude.Cronograma var25 = new Stude.Cronograma();
    Stude.Disciplina var27 = var25.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var29 = var25.getDisciplina("");
    int var30 = var25.tamanhoDisciplinas();
    Stude.Disciplina var32 = var25.getDisciplina("hi!");
    Stude.Disciplina var35 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var36 = var35.toString();
    java.lang.String var37 = var35.toString();
    var35.setCor((-1));
    var35.setCor(3);
    int var42 = var35.getCor();
    var25.addDisciplina(var35);
    var12.addDisciplina(var35);
    java.util.List var45 = var12.getDisciplinas();
    
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
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo avancado"+ "'", var36.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo avancado"+ "'", var37.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test96");


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
    var19.setNome("Metodo de estudo regular");
    int var26 = var19.getCor();
    
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
    assertTrue(var26 == 5);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test97");


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
    Stude.MetodoDeEstudo var17 = var9.getMetodoDeEstudo();
    boolean var18 = var2.equals((java.lang.Object)var17);
    Stude.Stude var20 = new Stude.Stude("hi!");
    var20.setMetodoAvancado();
    Stude.MetodoDeEstudo var22 = var20.getMetodoDeEstudo();
    java.util.HashMap var23 = var20.desempenho();
    var20.setMetodoRegular();
    Stude.MetodoDeEstudo var25 = var20.getMetodoDeEstudo();
    int var26 = var20.tempoDeEstudo();
    Stude.Disciplina var28 = var20.getDisciplina("Metodo de estudo avancado");
    int var29 = var20.tempoDeEstudo();
    boolean var30 = var2.equals((java.lang.Object)var20);
    Stude.Usuario var31 = var20.getUsuario();
    Stude.Cronograma var32 = var20.getCronograma();
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test98");


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
    int var53 = var11.getCor();
    int var54 = var11.getCor();
    java.lang.String var55 = var11.toString();
    
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
    assertTrue(var53 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Metodo de estudo regular"+ "'", var55.equals("Metodo de estudo regular"));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test99");


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
    int var13 = var1.tempoDeEstudo();
    Stude.Cronograma var14 = var1.getCronograma();
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test100");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    
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
    assertTrue(var7 == 10);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test101");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test102");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test103");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var3 = new Stude.Cronograma();
    java.util.List var4 = var3.getDisciplinas();
    java.util.HashMap var5 = Stude.Desempenho.tempoDeEstudo(var4);
    boolean var6 = var2.equals((java.lang.Object)var5);
    var2.addHorasDeEstudo(1.0d);
    var2.setCor(5);
    double var11 = var2.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1.0d);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test104");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.List var11 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var13 = var1.getMetodoDeEstudo();
    int var14 = var1.intervalo();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test105");


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
    Stude.Disciplina var14 = var1.getDisciplina("hi!");
    Stude.Usuario var15 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.setNome("");
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test106");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoAvancado();
    int var7 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.List var11 = var10.getDisciplinas();
    
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
    assertNotNull(var11);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test107");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    boolean var10 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    var2.addHorasDeEstudo(10.0d);
    var2.addHorasDeEstudo(1.0d);
    Stude.Stude var16 = new Stude.Stude("hi!");
    int var17 = var16.intervalo();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    Stude.Disciplina var20 = var16.getDisciplina("Metodo de estudo avancado");
    var16.setMetodoAvancado();
    Stude.Usuario var22 = var16.getUsuario();
    int var23 = var16.tempoDeEstudo();
    Stude.Usuario var24 = var16.getUsuario();
    java.lang.String var25 = var24.getNome();
    var24.setNome("Metodo de estudo avancado");
    var24.setNome("Metodo de estudo avancado");
    boolean var30 = var2.equals((java.lang.Object)var24);
    var2.setNome("hi!");
    
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
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test108");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.MetodoDeEstudo var2 = var1.getMetodoDeEstudo();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test109");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.List var4 = var1.getDisciplinas();
    var1.setNomeUsuario("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    int var9 = var1.tempoDeEstudo();
    java.util.List var10 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var15 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test110");


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
    java.lang.String var15 = var0.toString();
    
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
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test111");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    int var3 = var0.tamanhoDisciplinas();
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    java.util.HashMap var8 = var5.desempenho();
    var5.setMetodoRegular();
    java.util.List var10 = var5.getDisciplinas();
    java.util.HashMap var11 = var5.desempenho();
    int var12 = var5.intervalo();
    Stude.Cronograma var13 = var5.getCronograma();
    var5.setMetodoAvancado();
    Stude.Cronograma var15 = var5.getCronograma();
    Stude.Disciplina var18 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    var15.addDisciplina(var18);
    Stude.Avancado var20 = new Stude.Avancado();
    java.lang.String var21 = var20.toString();
    java.lang.String var22 = var20.toString();
    int var23 = var20.getIntervalo();
    int var24 = var20.getIntervalo();
    int var25 = var20.getIntervalo();
    int var26 = var20.getIntervalo();
    int var27 = var20.getIntervalo();
    boolean var28 = var18.equals((java.lang.Object)var27);
    var0.addDisciplina(var18);
    java.lang.String var30 = var18.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Metodo de estudo avancado"+ "'", var30.equals("Metodo de estudo avancado"));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test112");


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
    double var39 = var30.getHorasEstudadas();
    int var40 = var30.getCor();
    Stude.Stude var42 = new Stude.Stude("hi!");
    var42.setMetodoAvancado();
    Stude.MetodoDeEstudo var44 = var42.getMetodoDeEstudo();
    java.util.HashMap var45 = var42.desempenho();
    var42.setMetodoRegular();
    Stude.MetodoDeEstudo var47 = var42.getMetodoDeEstudo();
    java.util.List var48 = var42.getDisciplinas();
    java.util.HashMap var49 = Stude.Desempenho.tempoDeEstudo(var48);
    java.util.HashMap var50 = Stude.Desempenho.tempoDeEstudo(var48);
    boolean var51 = var30.equals((java.lang.Object)var50);
    
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
    assertTrue(var39 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test113");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", (-1));
    var1.setMetodoRegular();
    int var8 = var1.tempoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    Stude.Cronograma var10 = var1.getCronograma();
    var1.setMetodoAvancado();
    
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

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test114");


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
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var20.setCor((-1));
    var20.addHorasDeEstudo(10.0d);
    var20.setNome("Metodo de estudo regular");
    Stude.Stude var28 = new Stude.Stude("hi!");
    int var29 = var28.intervalo();
    Stude.Usuario var30 = var28.getUsuario();
    var28.addDisciplina("hi!", 0);
    java.util.HashMap var34 = var28.desempenho();
    Stude.MetodoDeEstudo var35 = var28.getMetodoDeEstudo();
    boolean var36 = var20.equals((java.lang.Object)var28);
    boolean var38 = var28.removeDisciplina("hi!");
    java.util.List var39 = var28.getDisciplinas();
    boolean var40 = var10.equals((java.lang.Object)var39);
    var10.setNome("hi!");
    
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
    assertTrue(var29 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test115");


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
    Stude.Disciplina var15 = var1.getDisciplina("hi!");
    var15.setNome("Metodo de estudo avancado");
    
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

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test116");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    
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
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test117");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    int var6 = var1.tempoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    int var9 = var1.intervalo();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo avancado");
    
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
    assertNull(var11);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test118");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Usuario var6 = var1.getUsuario();
    java.lang.String var7 = var6.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.setNome("");
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test119");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.List var8 = var1.getDisciplinas();
    int var9 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test120");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.setNome("Metodo de estudo regular");
    double var8 = var2.getHorasEstudadas();
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var11.setCor((-1));
    var11.setNome("Metodo de estudo regular");
    boolean var16 = var2.equals((java.lang.Object)"Metodo de estudo regular");
    double var17 = var2.getHorasEstudadas();
    var2.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test121");


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
    Stude.Disciplina var20 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var21 = var0.getDisciplinas();
    boolean var23 = var0.removeDisciplina("Metodo de estudo regular");
    
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
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test122");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    
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
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test123");


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
    var1.setNomeUsuario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test124");


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
    int var14 = var1.intervalo();
    
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
    assertTrue(var14 == 5);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test125");


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
    java.util.List var15 = var0.getDisciplinas();
    
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

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test126");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    Stude.Disciplina var9 = var0.getDisciplina("hi!");
    java.util.List var10 = var0.getDisciplinas();
    Stude.Disciplina var13 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var13.setCor((-1));
    int var16 = var13.getCor();
    var13.addHorasDeEstudo(1.0d);
    java.lang.String var19 = var13.toString();
    var13.addHorasDeEstudo(1.0d);
    var0.addDisciplina(var13);
    boolean var24 = var0.removeDisciplina("Metodo de estudo regular");
    
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
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test127");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    java.util.List var11 = var1.getDisciplinas();
    
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

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test128");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Usuario var5 = var1.getUsuario();
    Stude.Usuario var6 = var1.getUsuario();
    int var7 = var1.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 1);
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
    assertTrue(var7 == 5);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test129");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    
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

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test130");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
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
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test131");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.addDisciplina("hi!", 2);
    Stude.Disciplina var8 = var1.getDisciplina("hi!");
    int var9 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo regular", 2);
    int var13 = var1.intervalo();
    java.util.List var14 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test132");


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
    int var39 = var28.tempoDeEstudo();
    
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
    assertTrue(var39 == 30);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test133");


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
    java.util.List var46 = var12.getDisciplinas();
    
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
    assertNotNull(var46);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test134");


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
    Stude.Stude var37 = new Stude.Stude("hi!");
    var37.setMetodoAvancado();
    Stude.MetodoDeEstudo var39 = var37.getMetodoDeEstudo();
    java.util.HashMap var40 = var37.desempenho();
    var37.setMetodoRegular();
    Stude.MetodoDeEstudo var42 = var37.getMetodoDeEstudo();
    var37.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var45 = var37.getCronograma();
    int var46 = var45.tamanhoDisciplinas();
    Stude.Disciplina var49 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var50 = var49.toString();
    java.lang.String var51 = var49.toString();
    java.lang.String var52 = var49.toString();
    var45.addDisciplina(var49);
    Stude.Disciplina var56 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var56.setCor((-1));
    var56.addHorasDeEstudo(10.0d);
    java.lang.String var61 = var56.getNome();
    var56.setNome("Metodo de estudo regular");
    var45.addDisciplina(var56);
    Stude.Disciplina var67 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var67.setCor((-1));
    int var70 = var67.getCor();
    var67.addHorasDeEstudo(1.0d);
    java.lang.String var73 = var67.getNome();
    int var74 = var67.getCor();
    var67.addHorasDeEstudo(1.0d);
    var67.addHorasDeEstudo(1.0d);
    var45.addDisciplina(var67);
    Stude.Disciplina var82 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var83 = new Stude.Cronograma();
    java.util.List var84 = var83.getDisciplinas();
    java.util.HashMap var85 = Stude.Desempenho.tempoDeEstudo(var84);
    boolean var86 = var82.equals((java.lang.Object)var85);
    var82.addHorasDeEstudo(1.0d);
    var82.addHorasDeEstudo(10.0d);
    var82.setCor(100);
    var45.addDisciplina(var82);
    var82.setCor(100);
    var3.addDisciplina(var82);
    java.util.List var97 = var3.getDisciplinas();
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Metodo de estudo avancado"+ "'", var50.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "Metodo de estudo avancado"+ "'", var51.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Metodo de estudo avancado"+ "'", var52.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "Metodo de estudo regular"+ "'", var61.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "Metodo de estudo regular"+ "'", var73.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test135");


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
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    
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
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test136");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Disciplina var9 = var1.getDisciplina("");
    var1.setNomeUsuario("hi!");
    Stude.Cronograma var12 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test137");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    
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
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test138");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.addDisciplina("hi!", 2);
    Stude.Disciplina var8 = var1.getDisciplina("hi!");
    var8.addHorasDeEstudo(100.0d);
    Stude.Cronograma var11 = new Stude.Cronograma();
    java.util.List var12 = var11.getDisciplinas();
    Stude.Disciplina var14 = var11.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var16 = var11.getDisciplina("hi!");
    java.util.List var17 = var11.getDisciplinas();
    boolean var18 = var8.equals((java.lang.Object)var17);
    java.lang.String var19 = var8.getNome();
    var8.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test139");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var6 = var1.getCronograma();
    java.util.HashMap var7 = var1.desempenho();
    java.util.List var8 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test140");


    Stude.Stude var1 = new Stude.Stude("hi!");
    java.util.HashMap var2 = var1.desempenho();
    int var3 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    java.util.HashMap var5 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test141");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test142");


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
    var29.addHorasDeEstudo(10.0d);
    
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

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test143");


    Stude.Usuario var1 = new Stude.Usuario("Metodo de estudo regular");
    java.lang.String var2 = var1.getNome();
    var1.setNome("hi!");
    var1.setNome("hi!");
    var1.setNome("Metodo de estudo avancado");
    java.lang.String var9 = var1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test144");


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
    int var23 = var12.tamanhoDisciplinas();
    int var24 = var12.tamanhoDisciplinas();
    java.util.List var25 = var12.getDisciplinas();
    int var26 = var12.tamanhoDisciplinas();
    int var27 = var12.tamanhoDisciplinas();
    
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
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test145");


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
    var9.setNome("Metodo de estudo avancado");
    
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

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test146");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var20 = var1.removeDisciplina("Metodo de estudo avancado");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 30);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test147");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 10);
    int var8 = var7.getCor();
    var0.addDisciplina(var7);
    Stude.Stude var11 = new Stude.Stude("hi!");
    Stude.Cronograma var12 = var11.getCronograma();
    var11.setMetodoAvancado();
    java.util.List var14 = var11.getDisciplinas();
    java.util.HashMap var15 = Stude.Desempenho.tempoDeEstudo(var14);
    boolean var16 = var7.equals((java.lang.Object)var14);
    double var17 = var7.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test148");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    java.util.HashMap var9 = var1.desempenho();
    java.util.List var10 = var1.getDisciplinas();
    
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

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test149");


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
    var9.addDisciplina("Metodo de estudo avancado", 1);
    var9.setMetodoRegular();
    java.util.HashMap var19 = var9.desempenho();
    Stude.Cronograma var20 = var9.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test150");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    java.util.List var6 = var0.getDisciplinas();
    Stude.Disciplina var9 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var9.setCor((-1));
    int var12 = var9.getCor();
    var9.addHorasDeEstudo(1.0d);
    java.lang.String var15 = var9.getNome();
    var0.addDisciplina(var9);
    int var17 = var0.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("hi!", 5);
    double var21 = var20.getHorasEstudadas();
    var20.addHorasDeEstudo(10.0d);
    java.lang.String var24 = var20.toString();
    java.lang.String var25 = var20.toString();
    java.lang.String var26 = var20.getNome();
    var20.addHorasDeEstudo(10.0d);
    var0.addDisciplina(var20);
    double var30 = var20.getHorasEstudadas();
    int var31 = var20.getCor();
    java.lang.String var32 = var20.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test151");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var1.tempoDeEstudo();
    java.util.List var11 = var1.getDisciplinas();
    int var12 = var1.intervalo();
    
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
    assertTrue(var12 == 5);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test152");


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
    int var14 = var0.getIntervalo();
    
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
    assertTrue(var14 == 5);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test153");


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
    java.util.List var15 = var1.getDisciplinas();
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test154");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("hi!");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var8 = var7.toString();
    var7.setCor(15);
    var7.setCor(15);
    var2.addDisciplina(var7);
    Stude.Disciplina var15 = var2.getDisciplina("hi!");
    Stude.Disciplina var17 = var2.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test155");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    
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
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test156");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.intervalo();
    Stude.Usuario var8 = var1.getUsuario();
    var1.addDisciplina("Metodo de estudo regular", 15);
    java.util.List var12 = var1.getDisciplinas();
    
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
    assertNotNull(var12);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test157");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.HashMap var7 = var1.desempenho();
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test158");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var9.tamanhoDisciplinas();
    Stude.Disciplina var12 = var9.getDisciplina("");
    Stude.Disciplina var14 = var9.getDisciplina("hi!");
    int var15 = var9.tamanhoDisciplinas();
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test159");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var5 = var4.getHorasEstudadas();
    double var6 = var4.getHorasEstudadas();
    var0.addDisciplina(var4);
    java.util.List var8 = var0.getDisciplinas();
    Stude.Disciplina var10 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var12 = var0.getDisciplina("Metodo de estudo regular");
    double var13 = var12.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test160");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    java.util.List var11 = var1.getDisciplinas();
    Stude.Cronograma var12 = var1.getCronograma();
    java.util.HashMap var13 = var1.desempenho();
    Stude.Cronograma var14 = var1.getCronograma();
    
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

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test161");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    Stude.Usuario var5 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test162");


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
    Stude.Disciplina var17 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var19 = var1.getDisciplina("Metodo de estudo avancado");
    
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
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test163");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.addDisciplina("hi!", 2);
    Stude.Disciplina var8 = var1.getDisciplina("hi!");
    int var9 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo regular", 2);
    int var13 = var1.intervalo();
    Stude.Cronograma var14 = var1.getCronograma();
    Stude.Usuario var15 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test164");


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
    Stude.Stude var38 = new Stude.Stude("hi!");
    var38.addDisciplina("Metodo de estudo regular", 10);
    int var42 = var38.intervalo();
    var38.setMetodoRegular();
    boolean var44 = var34.equals((java.lang.Object)var38);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test165");


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
    Stude.Disciplina var16 = var14.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var18 = var14.getDisciplina("");
    int var19 = var14.tamanhoDisciplinas();
    int var20 = var14.tamanhoDisciplinas();
    boolean var21 = var7.equals((java.lang.Object)var14);
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test166");


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
    java.lang.String var18 = var2.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo regular"+ "'", var18.equals("Metodo de estudo regular"));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test167");


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
    int var16 = var1.tempoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Usuario var19 = var1.getUsuario();
    java.lang.String var20 = var19.getNome();
    
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
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test168");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    java.util.List var8 = var1.getDisciplinas();
    java.util.HashMap var9 = var1.desempenho();
    var1.setMetodoAvancado();
    int var11 = var1.tempoDeEstudo();
    int var12 = var1.tempoDeEstudo();
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test169");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    int var8 = var1.intervalo();
    java.util.HashMap var9 = var1.desempenho();
    Stude.Usuario var10 = var1.getUsuario();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    
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

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test170");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test171");


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
    var25.setMetodoAvancado();
    var25.setMetodoAvancado();
    
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

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test172");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getTempo();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    
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
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test173");


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
    Stude.Disciplina var15 = var1.getDisciplina("hi!");
    var15.setCor(2);
    java.lang.String var18 = var15.toString();
    double var19 = var15.getHorasEstudadas();
    double var20 = var15.getHorasEstudadas();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test174");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    int var6 = var1.intervalo();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    
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
    assertNull(var10);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test175");


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
    var13.setNome("hi!");
    var13.setNome("Metodo de estudo avancado");
    java.lang.String var24 = var13.getNome();
    int var25 = var13.getCor();
    var13.addHorasDeEstudo(2.0d);
    
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
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo avancado"+ "'", var24.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 5);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test176");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.toString();
    var2.setCor(10);
    int var13 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test177");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    int var7 = var1.intervalo();
    int var8 = var1.intervalo();
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    int var11 = var1.tempoDeEstudo();
    java.util.List var12 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test178");


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
    java.util.HashMap var20 = var1.desempenho();
    Stude.Usuario var21 = var1.getUsuario();
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test179");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var10 = var1.getCronograma();
    int var11 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test180");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo regular");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.MetodoDeEstudo var4 = var1.getMetodoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    java.util.HashMap var6 = Stude.Desempenho.tempoDeEstudo(var5);
    
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

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test181");


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
    java.util.List var28 = var0.getDisciplinas();
    Stude.Stude var30 = new Stude.Stude("hi!");
    Stude.Cronograma var31 = var30.getCronograma();
    Stude.Disciplina var33 = var31.getDisciplina("hi!");
    Stude.Disciplina var36 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var37 = var36.toString();
    var36.setCor(15);
    var36.setCor(15);
    var31.addDisciplina(var36);
    int var43 = var36.getCor();
    java.lang.String var44 = var36.toString();
    var0.addDisciplina(var36);
    java.util.List var46 = var0.getDisciplinas();
    java.util.HashMap var47 = Stude.Desempenho.tempoDeEstudo(var46);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo avancado"+ "'", var37.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo avancado"+ "'", var44.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test182");


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
    java.util.List var16 = var2.getDisciplinas();
    Stude.Disciplina var18 = var2.getDisciplina("hi!");
    java.util.List var19 = var2.getDisciplinas();
    java.util.HashMap var20 = Stude.Desempenho.tempoDeEstudo(var19);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test183");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!");
    Stude.Stude var10 = new Stude.Stude("hi!");
    int var11 = var10.intervalo();
    Stude.Usuario var12 = var10.getUsuario();
    var10.addDisciplina("hi!", 0);
    Stude.Disciplina var17 = var10.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var18 = var10.getMetodoDeEstudo();
    var10.setMetodoAvancado();
    boolean var20 = var2.equals((java.lang.Object)var10);
    java.util.HashMap var21 = var10.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test184");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var36 = var0.removeDisciplina("Metodo de estudo avancado");
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

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test185");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    java.util.List var8 = var0.getDisciplinas();
    int var9 = var0.tamanhoDisciplinas();
    Stude.Disciplina var11 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var12 = var0.getDisciplinas();
    int var13 = var0.tamanhoDisciplinas();
    Stude.Disciplina var15 = var0.getDisciplina("hi!");
    
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
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test186");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    java.lang.String var6 = var2.getNome();
    var2.setNome("hi!");
    var2.addHorasDeEstudo(21.0d);
    java.lang.String var11 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test187");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    java.util.List var9 = var1.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var1.removeDisciplina("hi!");
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
    assertNotNull(var9);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test188");


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
    var22.setCor(1);
    var22.addHorasDeEstudo(1.0d);
    
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

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test189");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    int var5 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 4);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test190");


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
    java.util.HashMap var13 = var1.desempenho();
    Stude.Cronograma var14 = var1.getCronograma();
    var1.setNomeUsuario("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test191");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    java.util.List var8 = var1.getDisciplinas();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    int var11 = var1.intervalo();
    java.util.HashMap var12 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var1.removeDisciplina("Metodo de estudo regular");
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test192");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    double var4 = var2.getHorasEstudadas();
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.toString();
    var2.setCor((-1));
    var2.addHorasDeEstudo(100.0d);
    java.lang.String var11 = var2.toString();
    var2.setNome("hi!");
    var2.setNome("Metodo de estudo regular");
    
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

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test193");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 10);
    int var8 = var7.getCor();
    var0.addDisciplina(var7);
    java.util.List var10 = var0.getDisciplinas();
    Stude.Disciplina var12 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Stude var14 = new Stude.Stude("hi!");
    Stude.Cronograma var15 = var14.getCronograma();
    int var16 = var14.tempoDeEstudo();
    int var17 = var14.tempoDeEstudo();
    int var18 = var14.intervalo();
    int var19 = var14.tempoDeEstudo();
    Stude.Cronograma var20 = var14.getCronograma();
    Stude.Disciplina var22 = var14.getDisciplina("hi!");
    java.util.List var23 = var14.getDisciplinas();
    boolean var24 = var12.equals((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test194");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    int var7 = var2.getCor();
    Stude.Stude var9 = new Stude.Stude("hi!");
    int var10 = var9.intervalo();
    Stude.Usuario var11 = var9.getUsuario();
    int var12 = var9.intervalo();
    java.util.List var13 = var9.getDisciplinas();
    boolean var14 = var2.equals((java.lang.Object)var13);
    java.util.HashMap var15 = Stude.Desempenho.tempoDeEstudo(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test195");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo regular");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    int var4 = var3.tamanhoDisciplinas();
    Stude.Cronograma var5 = new Stude.Cronograma();
    java.util.List var6 = var5.getDisciplinas();
    Stude.Disciplina var8 = var5.getDisciplina("Metodo de estudo regular");
    Stude.Stude var10 = new Stude.Stude("hi!");
    var10.setMetodoAvancado();
    Stude.MetodoDeEstudo var12 = var10.getMetodoDeEstudo();
    java.util.HashMap var13 = var10.desempenho();
    var10.setMetodoRegular();
    Stude.MetodoDeEstudo var15 = var10.getMetodoDeEstudo();
    var10.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var18 = var10.getCronograma();
    Stude.Disciplina var20 = var10.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var21 = var10.getCronograma();
    int var22 = var21.tamanhoDisciplinas();
    Stude.Disciplina var25 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var25.addHorasDeEstudo(10.0d);
    java.lang.String var28 = var25.toString();
    java.lang.String var29 = var25.getNome();
    int var30 = var25.getCor();
    var21.addDisciplina(var25);
    var5.addDisciplina(var25);
    var25.setCor(30);
    var25.addHorasDeEstudo(1.0d);
    java.lang.String var37 = var25.getNome();
    double var38 = var25.getHorasEstudadas();
    var3.addDisciplina(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Metodo de estudo regular"+ "'", var37.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 11.0d);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test196");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    java.util.List var10 = var1.getDisciplinas();
    
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
    assertNotNull(var10);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test197");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
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
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test198");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    Stude.Cronograma var9 = var1.getCronograma();
    int var10 = var1.tempoDeEstudo();
    Stude.Cronograma var11 = var1.getCronograma();
    int var12 = var11.tamanhoDisciplinas();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test199");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.List var10 = var1.getDisciplinas();
    
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

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test200");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    var1.addDisciplina("hi!", 0);
    var1.setNomeUsuario("hi!");
    java.util.List var13 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test201");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getTempo();
    int var3 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test202");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
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
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test203");


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
    boolean var81 = var28.removeDisciplina("Metodo de estudo regular");
    Stude.Disciplina var83 = var28.getDisciplina("");
    Stude.Disciplina var85 = var28.getDisciplina("");
    
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
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test204");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 15);
    int var3 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    int var6 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test205");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var4.tamanhoDisciplinas();
    Stude.Disciplina var7 = var4.getDisciplina("Metodo de estudo regular");
    int var8 = var4.tamanhoDisciplinas();
    Stude.Disciplina var11 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var11.setCor((-1));
    var11.addHorasDeEstudo(10.0d);
    java.lang.String var16 = var11.getNome();
    var11.setNome("Metodo de estudo regular");
    var4.addDisciplina(var11);
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var23 = var22.toString();
    var22.setCor(15);
    java.lang.String var26 = var22.getNome();
    Stude.Cronograma var27 = new Stude.Cronograma();
    Stude.Disciplina var29 = var27.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var31 = var27.getDisciplina("");
    java.util.List var32 = var27.getDisciplinas();
    boolean var33 = var22.equals((java.lang.Object)var27);
    int var34 = var22.getCor();
    Stude.Cronograma var35 = new Stude.Cronograma();
    java.util.List var36 = var35.getDisciplinas();
    Stude.Disciplina var38 = var35.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var40 = var35.getDisciplina("hi!");
    java.util.List var41 = var35.getDisciplinas();
    Stude.Cronograma var42 = new Stude.Cronograma();
    java.util.List var43 = var42.getDisciplinas();
    Stude.Disciplina var45 = var42.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var47 = var42.getDisciplina("hi!");
    Stude.Disciplina var50 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var42.addDisciplina(var50);
    var50.addHorasDeEstudo(1.0d);
    var35.addDisciplina(var50);
    int var55 = var35.tamanhoDisciplinas();
    java.util.List var56 = var35.getDisciplinas();
    boolean var57 = var22.equals((java.lang.Object)var35);
    java.lang.String var58 = var22.toString();
    var4.addDisciplina(var22);
    
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
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "Metodo de estudo avancado"+ "'", var58.equals("Metodo de estudo avancado"));

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test206");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Cronograma var10 = var1.getCronograma();
    java.util.HashMap var11 = var1.desempenho();
    java.util.HashMap var12 = var1.desempenho();
    int var13 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    Stude.Disciplina var17 = var1.getDisciplina("Metodo de estudo avancado");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test207");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Cronograma var8 = var1.getCronograma();
    Stude.Disciplina var10 = var1.getDisciplina("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test208");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 100);
    Stude.Cronograma var14 = var1.getCronograma();
    Stude.Disciplina var17 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var17.setCor((-1));
    java.lang.String var20 = var17.getNome();
    var17.setCor((-1));
    var17.setCor(0);
    java.lang.String var25 = var17.toString();
    java.lang.String var26 = var17.getNome();
    double var27 = var17.getHorasEstudadas();
    java.lang.String var28 = var17.toString();
    var14.addDisciplina(var17);
    Stude.Avancado var30 = new Stude.Avancado();
    java.lang.String var31 = var30.toString();
    java.lang.String var32 = var30.toString();
    int var33 = var30.getIntervalo();
    int var34 = var30.getIntervalo();
    int var35 = var30.getTempo();
    int var36 = var30.getTempo();
    int var37 = var30.getTempo();
    int var38 = var30.getIntervalo();
    java.lang.String var39 = var30.toString();
    java.lang.String var40 = var30.toString();
    int var41 = var30.getTempo();
    boolean var42 = var17.equals((java.lang.Object)var30);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo regular"+ "'", var25.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo regular"+ "'", var28.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Metodo de estudo avancado"+ "'", var32.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo avancado"+ "'", var39.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo avancado"+ "'", var40.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test209");


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
    java.lang.String var23 = var16.getNome();
    java.lang.String var24 = var16.toString();
    Stude.Stude var26 = new Stude.Stude("hi!");
    int var27 = var26.intervalo();
    Stude.Usuario var28 = var26.getUsuario();
    int var29 = var26.tempoDeEstudo();
    java.util.HashMap var30 = var26.desempenho();
    Stude.MetodoDeEstudo var31 = var26.getMetodoDeEstudo();
    Stude.Cronograma var32 = var26.getCronograma();
    java.util.List var33 = var32.getDisciplinas();
    int var34 = var32.tamanhoDisciplinas();
    Stude.Cronograma var35 = new Stude.Cronograma();
    Stude.Disciplina var37 = var35.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var39 = var35.getDisciplina("");
    Stude.Cronograma var40 = new Stude.Cronograma();
    java.util.List var41 = var40.getDisciplinas();
    Stude.Disciplina var43 = var40.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var45 = var40.getDisciplina("hi!");
    Stude.Disciplina var48 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var40.addDisciplina(var48);
    int var50 = var48.getCor();
    var35.addDisciplina(var48);
    var48.setNome("hi!");
    java.lang.String var54 = var48.toString();
    var32.addDisciplina(var48);
    boolean var56 = var16.equals((java.lang.Object)var48);
    java.lang.String var57 = var48.toString();
    double var58 = var48.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo avancado"+ "'", var24.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "hi!"+ "'", var57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test210");


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
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test211");


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
    java.util.List var22 = var21.getDisciplinas();
    
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
    assertNotNull(var22);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test212");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Cronograma var8 = var1.getCronograma();
    var1.setMetodoRegular();
    Stude.Usuario var10 = var1.getUsuario();
    java.util.HashMap var11 = var1.desempenho();
    Stude.Cronograma var12 = var1.getCronograma();
    Stude.Disciplina var14 = var12.getDisciplina("");
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test213");


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
    int var36 = var2.tamanhoDisciplinas();
    Stude.Disciplina var38 = var2.getDisciplina("hi!");
    
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
    assertTrue(var36 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test214");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("Metodo de estudo avancado", 15);
    int var9 = var1.intervalo();
    java.util.List var10 = var1.getDisciplinas();
    Stude.Disciplina var12 = var1.getDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test215");


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
    int var60 = var20.getCor();
    Stude.Stude var62 = new Stude.Stude("hi!");
    var62.setMetodoAvancado();
    Stude.MetodoDeEstudo var64 = var62.getMetodoDeEstudo();
    java.util.HashMap var65 = var62.desempenho();
    var62.setMetodoRegular();
    java.util.List var67 = var62.getDisciplinas();
    java.util.HashMap var68 = var62.desempenho();
    int var69 = var62.intervalo();
    Stude.Cronograma var70 = var62.getCronograma();
    Stude.Cronograma var71 = var62.getCronograma();
    Stude.Disciplina var73 = var62.getDisciplina("");
    java.util.HashMap var74 = var62.desempenho();
    boolean var75 = var20.equals((java.lang.Object)var62);
    
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
    assertTrue(var60 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test216");


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
    Stude.Cronograma var25 = new Stude.Cronograma();
    int var26 = var25.tamanhoDisciplinas();
    Stude.Cronograma var27 = new Stude.Cronograma();
    Stude.Disciplina var29 = var27.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var31 = var27.getDisciplina("");
    Stude.Cronograma var32 = new Stude.Cronograma();
    java.util.List var33 = var32.getDisciplinas();
    Stude.Disciplina var35 = var32.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var37 = var32.getDisciplina("hi!");
    Stude.Disciplina var40 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var32.addDisciplina(var40);
    int var42 = var40.getCor();
    var27.addDisciplina(var40);
    var25.addDisciplina(var40);
    int var45 = var25.tamanhoDisciplinas();
    Stude.Disciplina var47 = var25.getDisciplina("Metodo de estudo regular");
    int var48 = var25.tamanhoDisciplinas();
    Stude.Disciplina var51 = new Stude.Disciplina("hi!", 5);
    double var52 = var51.getHorasEstudadas();
    var51.addHorasDeEstudo(10.0d);
    double var55 = var51.getHorasEstudadas();
    var51.addHorasDeEstudo(20.0d);
    var25.addDisciplina(var51);
    boolean var59 = var19.equals((java.lang.Object)var51);
    var51.setCor(2);
    
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
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test217");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getIntervalo();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getIntervalo();
    int var10 = var0.getIntervalo();
    int var11 = var0.getTempo();
    int var12 = var0.getIntervalo();
    
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
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test218");


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
    int var10 = var0.getTempo();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getTempo();
    int var13 = var0.getIntervalo();
    int var14 = var0.getIntervalo();
    int var15 = var0.getTempo();
    
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
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 30);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test219");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
    int var10 = var0.getIntervalo();
    java.lang.String var11 = var0.toString();
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
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test220");


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
    int var36 = var2.getCor();
    
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
    assertTrue(var36 == 30);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test221");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    Stude.Cronograma var5 = var1.getCronograma();
    java.util.HashMap var6 = var1.desempenho();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    int var8 = var1.tempoDeEstudo();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo regular");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var1.removeDisciplina("Metodo de estudo avancado");
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test222");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    int var12 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var13 = var1.getMetodoDeEstudo();
    int var14 = var1.tempoDeEstudo();
    
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
    assertTrue(var14 == 15);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test223");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    int var9 = var0.getIntervalo();
    int var10 = var0.getTempo();
    
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
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test224");


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
    boolean var45 = var0.removeDisciplina("Metodo de estudo regular");
    Stude.Disciplina var47 = var0.getDisciplina("Metodo de estudo avancado");
    
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
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test225");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var0.addDisciplina(var8);
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var0.addDisciplina(var12);
    double var14 = var12.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test226");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getIntervalo();
    
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
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test227");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo regular");
    Stude.MetodoDeEstudo var9 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo avancado", 2);
    Stude.MetodoDeEstudo var16 = var1.getMetodoDeEstudo();
    
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
    assertNotNull(var16);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test228");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(2);
    double var5 = var2.getHorasEstudadas();
    Stude.Stude var7 = new Stude.Stude("hi!");
    Stude.Usuario var8 = var7.getUsuario();
    java.lang.String var9 = var8.getNome();
    boolean var10 = var2.equals((java.lang.Object)var8);
    java.lang.String var11 = var8.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test229");


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
    java.util.List var36 = var0.getDisciplinas();
    java.util.List var37 = var0.getDisciplinas();
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test230");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoRegular();
    Stude.Disciplina var6 = var1.getDisciplina("");
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Usuario var8 = var1.getUsuario();
    var8.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test231");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoAvancado();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test232");


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
    java.lang.String var23 = var2.toString();
    var2.setCor(100);
    
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
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test233");


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
    var15.setCor(0);
    Stude.Avancado var19 = new Stude.Avancado();
    java.lang.String var20 = var19.toString();
    java.lang.String var21 = var19.toString();
    int var22 = var19.getIntervalo();
    java.lang.String var23 = var19.toString();
    int var24 = var19.getIntervalo();
    boolean var25 = var15.equals((java.lang.Object)var24);
    java.lang.String var26 = var15.toString();
    var15.setNome("Metodo de estudo regular");
    java.lang.String var29 = var15.getNome();
    
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
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo avancado"+ "'", var20.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Metodo de estudo regular"+ "'", var29.equals("Metodo de estudo regular"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test234");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    java.util.HashMap var8 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test235");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    int var10 = var1.tempoDeEstudo();
    java.util.HashMap var11 = var1.desempenho();
    int var12 = var1.intervalo();
    int var13 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test236");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    
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
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test237");


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
    java.lang.String var15 = var0.toString();
    int var16 = var0.getTempo();
    int var17 = var0.getIntervalo();
    int var18 = var0.getTempo();
    
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
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 30);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test238");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    int var3 = var1.intervalo();
    int var4 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var5 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test239");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.intervalo();
    var1.setMetodoAvancado();
    int var8 = var1.tempoDeEstudo();
    Stude.Cronograma var9 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test240");


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
    java.lang.String var21 = var18.getNome();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test241");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test242");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 0);
    var2.setCor(5);
    var2.setCor(10);
    int var7 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test243");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    var2.setNome("hi!");
    double var16 = var2.getHorasEstudadas();
    double var17 = var2.getHorasEstudadas();
    double var18 = var2.getHorasEstudadas();
    int var19 = var2.getCor();
    
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
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 15);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test244");


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
    java.lang.String var39 = var21.toString();
    
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
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo avancado"+ "'", var39.equals("Metodo de estudo avancado"));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test245");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getIntervalo();
    int var10 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo avancado"+ "'", var2.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test246");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    double var8 = var2.getHorasEstudadas();
    java.lang.String var9 = var2.toString();
    Stude.Stude var11 = new Stude.Stude("hi!");
    int var12 = var11.intervalo();
    Stude.Usuario var13 = var11.getUsuario();
    Stude.Cronograma var14 = var11.getCronograma();
    var11.setNomeUsuario("Metodo de estudo avancado");
    java.util.HashMap var17 = var11.desempenho();
    Stude.MetodoDeEstudo var18 = var11.getMetodoDeEstudo();
    boolean var19 = var2.equals((java.lang.Object)var18);
    Stude.Stude var21 = new Stude.Stude("hi!");
    int var22 = var21.intervalo();
    Stude.Usuario var23 = var21.getUsuario();
    var21.addDisciplina("hi!", 0);
    int var27 = var21.tempoDeEstudo();
    var21.setMetodoRegular();
    boolean var30 = var21.removeDisciplina("hi!");
    boolean var31 = var2.equals((java.lang.Object)var30);
    var2.addHorasDeEstudo(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test247");


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
    double var20 = var13.getHorasEstudadas();
    
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
    assertTrue(var20 == 1.0d);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test248");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    java.util.List var3 = var1.getDisciplinas();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Cronograma var5 = var1.getCronograma();
    int var6 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test249");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    Stude.Cronograma var3 = new Stude.Cronograma();
    java.util.List var4 = var3.getDisciplinas();
    java.util.HashMap var5 = Stude.Desempenho.tempoDeEstudo(var4);
    boolean var6 = var2.equals((java.lang.Object)var5);
    java.lang.String var7 = var2.getNome();
    var2.setCor(2);
    var2.addHorasDeEstudo(3.0d);
    int var12 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test250");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var8 = var1.getUsuario();
    var1.setMetodoRegular();
    Stude.Usuario var10 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test251");


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
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test252");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var8 = var1.getCronograma();
    int var9 = var1.tempoDeEstudo();
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test253");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    var1.addDisciplina("hi!", 5);
    Stude.Cronograma var8 = var1.getCronograma();
    int var9 = var8.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var8.removeDisciplina("Metodo de estudo avancado");
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
    assertTrue(var9 == 1);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test254");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    int var10 = var1.tempoDeEstudo();
    Stude.Usuario var11 = var1.getUsuario();
    Stude.Cronograma var12 = var1.getCronograma();
    int var13 = var12.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test255");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 100);
    var2.setNome("Metodo de estudo avancado");
    int var5 = var2.getCor();
    var2.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test256");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
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
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test257");


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
    Stude.MetodoDeEstudo var19 = var10.getMetodoDeEstudo();
    Stude.Cronograma var20 = var10.getCronograma();
    java.util.HashMap var21 = var10.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var23 = var10.removeDisciplina("Metodo de estudo avancado");
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test258");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 10);
    Stude.MetodoDeEstudo var13 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test259");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    int var6 = var1.tempoDeEstudo();
    int var7 = var1.tempoDeEstudo();
    int var8 = var1.tempoDeEstudo();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    
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
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test260");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    var1.addDisciplina("Metodo de estudo avancado", 5);
    var1.setMetodoAvancado();
    Stude.Cronograma var10 = var1.getCronograma();
    Stude.Cronograma var11 = new Stude.Cronograma();
    java.util.List var12 = var11.getDisciplinas();
    Stude.Disciplina var14 = var11.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var16 = var11.getDisciplina("hi!");
    Stude.Disciplina var19 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var11.addDisciplina(var19);
    Stude.Disciplina var23 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var11.addDisciplina(var23);
    Stude.Disciplina var27 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var28 = var27.toString();
    var27.setCor(15);
    var27.setCor(10);
    var11.addDisciplina(var27);
    java.lang.String var34 = var27.getNome();
    java.lang.String var35 = var27.toString();
    Stude.Stude var37 = new Stude.Stude("hi!");
    int var38 = var37.intervalo();
    Stude.Usuario var39 = var37.getUsuario();
    int var40 = var37.tempoDeEstudo();
    java.util.HashMap var41 = var37.desempenho();
    Stude.MetodoDeEstudo var42 = var37.getMetodoDeEstudo();
    Stude.Cronograma var43 = var37.getCronograma();
    java.util.List var44 = var43.getDisciplinas();
    int var45 = var43.tamanhoDisciplinas();
    Stude.Cronograma var46 = new Stude.Cronograma();
    Stude.Disciplina var48 = var46.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var50 = var46.getDisciplina("");
    Stude.Cronograma var51 = new Stude.Cronograma();
    java.util.List var52 = var51.getDisciplinas();
    Stude.Disciplina var54 = var51.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var56 = var51.getDisciplina("hi!");
    Stude.Disciplina var59 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var51.addDisciplina(var59);
    int var61 = var59.getCor();
    var46.addDisciplina(var59);
    var59.setNome("hi!");
    java.lang.String var65 = var59.toString();
    var43.addDisciplina(var59);
    boolean var67 = var27.equals((java.lang.Object)var59);
    java.lang.String var68 = var59.toString();
    var10.addDisciplina(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Metodo de estudo avancado"+ "'", var28.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo avancado"+ "'", var34.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Metodo de estudo avancado"+ "'", var35.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test261");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    var1.addDisciplina("Metodo de estudo avancado", 3);
    Stude.Disciplina var12 = var1.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test262");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var7.getDisciplina("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var7.removeDisciplina("");
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
    assertNull(var9);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test263");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.addDisciplina("hi!", 30);
    var1.setMetodoAvancado();
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Usuario var12 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.MetodoDeEstudo var15 = var1.getMetodoDeEstudo();
    int var16 = var1.tempoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 2);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 30);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test264");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    java.util.List var4 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.setNome("");
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
    assertNotNull(var6);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test265");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    java.util.List var6 = var1.getDisciplinas();
    var1.setNomeUsuario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test266");


    Stude.Cronograma var0 = new Stude.Cronograma();
    int var1 = var0.tamanhoDisciplinas();
    Stude.Disciplina var4 = new Stude.Disciplina("Metodo de estudo regular", 1);
    var0.addDisciplina(var4);
    Stude.Disciplina var8 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var8.addHorasDeEstudo(10.0d);
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = var8.getNome();
    java.lang.String var13 = var8.getNome();
    java.lang.String var14 = var8.toString();
    var0.addDisciplina(var8);
    Stude.Stude var17 = new Stude.Stude("hi!");
    int var18 = var17.intervalo();
    Stude.Usuario var19 = var17.getUsuario();
    Stude.Cronograma var20 = var17.getCronograma();
    var17.setMetodoAvancado();
    Stude.Cronograma var22 = var17.getCronograma();
    Stude.Disciplina var25 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    var22.addDisciplina(var25);
    java.lang.String var27 = var25.toString();
    double var28 = var25.getHorasEstudadas();
    double var29 = var25.getHorasEstudadas();
    var0.addDisciplina(var25);
    var25.setCor(30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo avancado"+ "'", var27.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test267");


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
    java.util.List var15 = var14.getDisciplinas();
    
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

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test268");


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
    java.lang.String var19 = var2.getNome();
    int var20 = var2.getCor();
    int var21 = var2.getCor();
    var2.setCor(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo(0.0d);
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test269");


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
    java.util.List var31 = var12.getDisciplinas();
    boolean var33 = var12.removeDisciplina("Metodo de estudo avancado");
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test270");


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
    java.util.HashMap var15 = var1.desempenho();
    java.util.List var16 = var1.getDisciplinas();
    java.util.HashMap var17 = Stude.Desempenho.tempoDeEstudo(var16);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test271");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    java.util.List var5 = var0.getDisciplinas();
    java.util.List var6 = var0.getDisciplinas();
    Stude.Disciplina var8 = var0.getDisciplina("hi!");
    java.util.List var9 = var0.getDisciplinas();
    int var10 = var0.tamanhoDisciplinas();
    Stude.Disciplina var12 = var0.getDisciplina("hi!");
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test272");


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
    double var45 = var35.getHorasEstudadas();
    
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
    assertTrue(var45 == 0.0d);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test273");


    Stude.Usuario var1 = new Stude.Usuario("Metodo de estudo regular");
    var1.setNome("hi!");
    var1.setNome("Metodo de estudo regular");
    java.lang.String var6 = var1.getNome();
    var1.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test274");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var6 = var1.desempenho();
    java.util.HashMap var7 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo avancado", 30);
    var1.setNomeUsuario("hi!");
    boolean var14 = var1.removeDisciplina("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test275");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setNome("");
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

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test276");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    int var3 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test277");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.addDisciplina("Metodo de estudo regular", 1);
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var10 = var1.getCronograma();
    int var11 = var1.tempoDeEstudo();
    boolean var13 = var1.removeDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test278");


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

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test279");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    int var3 = var1.intervalo();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var1.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test280");


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
    java.util.List var33 = var32.getDisciplinas();
    Stude.Disciplina var35 = var32.getDisciplina("Metodo de estudo regular");
    Stude.Stude var37 = new Stude.Stude("hi!");
    var37.setMetodoAvancado();
    Stude.MetodoDeEstudo var39 = var37.getMetodoDeEstudo();
    java.util.HashMap var40 = var37.desempenho();
    var37.setMetodoRegular();
    Stude.MetodoDeEstudo var42 = var37.getMetodoDeEstudo();
    var37.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var45 = var37.getCronograma();
    Stude.Disciplina var47 = var37.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var48 = var37.getCronograma();
    int var49 = var48.tamanhoDisciplinas();
    Stude.Disciplina var52 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var52.addHorasDeEstudo(10.0d);
    java.lang.String var55 = var52.toString();
    java.lang.String var56 = var52.getNome();
    int var57 = var52.getCor();
    var48.addDisciplina(var52);
    var32.addDisciplina(var52);
    Stude.Disciplina var62 = new Stude.Disciplina("hi!", 5);
    double var63 = var62.getHorasEstudadas();
    var62.addHorasDeEstudo(10.0d);
    java.lang.String var66 = var62.toString();
    java.lang.String var67 = var62.toString();
    java.lang.String var68 = var62.getNome();
    var32.addDisciplina(var62);
    var0.addDisciplina(var62);
    java.lang.String var71 = var62.toString();
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Metodo de estudo regular"+ "'", var55.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "Metodo de estudo regular"+ "'", var56.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi!"+ "'", var66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "hi!"+ "'", var67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "hi!"+ "'", var68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!"+ "'", var71.equals("hi!"));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test281");


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
    double var16 = var9.getHorasEstudadas();
    
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
    assertTrue(var16 == 0.0d);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test282");


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
    int var15 = var2.getCor();
    
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

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test283");


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
    int var11 = var1.intervalo();
    java.util.HashMap var12 = var1.desempenho();
    Stude.Cronograma var13 = var1.getCronograma();
    java.util.List var14 = var13.getDisciplinas();
    
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
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test284");


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
    java.util.List var53 = var28.getDisciplinas();
    java.util.List var54 = var28.getDisciplinas();
    
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
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test285");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoAvancado();
    int var7 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Usuario var10 = var1.getUsuario();
    
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

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test286");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.Cronograma var8 = var1.getCronograma();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test287");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    Stude.Stude var5 = new Stude.Stude("hi!");
    var5.setMetodoRegular();
    Stude.MetodoDeEstudo var7 = var5.getMetodoDeEstudo();
    var5.setMetodoAvancado();
    Stude.Cronograma var9 = var5.getCronograma();
    boolean var10 = var2.equals((java.lang.Object)var5);
    int var11 = var2.getCor();
    var2.setCor((-1));
    var2.setNome("hi!");
    double var16 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test288");


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
    Stude.MetodoDeEstudo var15 = var9.getMetodoDeEstudo();
    int var16 = var9.intervalo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var18 = var9.removeDisciplina("Metodo de estudo regular");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test289");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Usuario var7 = var1.getUsuario();
    java.util.List var8 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 10);
    int var12 = var1.intervalo();
    Stude.MetodoDeEstudo var13 = var1.getMetodoDeEstudo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var1.removeDisciplina("hi!");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test290");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    var1.addDisciplina("hi!", 0);
    Stude.Usuario var11 = var1.getUsuario();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test291");


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
    var1.setMetodoRegular();
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test292");


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
    java.lang.String var78 = var69.toString();
    var69.setNome("hi!");
    java.lang.String var81 = var69.toString();
    
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
    assertTrue("'" + var78 + "' != '" + "Metodo de estudo avancado"+ "'", var78.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "hi!"+ "'", var81.equals("hi!"));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test293");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    int var7 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setNomeUsuario("Metodo de estudo regular");
    
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

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test294");


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
    java.lang.String var12 = var0.toString();
    
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
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test295");


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
    java.util.HashMap var14 = var1.desempenho();
    int var15 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo avancado");
    
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
    assertTrue(var15 == 5);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test296");


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
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var18 = var1.removeDisciplina("Metodo de estudo regular");
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test297");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    
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
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test298");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    var1.addDisciplina("Metodo de estudo avancado", 15);
    int var10 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDisciplina("", 3);
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test299");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", 100);
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test300");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    int var6 = var0.tamanhoDisciplinas();
    Stude.Disciplina var8 = var0.getDisciplina("Metodo de estudo regular");
    java.util.List var9 = var0.getDisciplinas();
    java.util.List var10 = var0.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var0.removeDisciplina("hi!");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test301");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    int var11 = var1.intervalo();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    int var13 = var1.intervalo();
    int var14 = var1.tempoDeEstudo();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 30);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test302");


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
    var1.setMetodoRegular();
    var1.addDisciplina("Metodo de estudo avancado", 15);
    var1.addDisciplina("Metodo de estudo regular", 5);
    Stude.MetodoDeEstudo var24 = var1.getMetodoDeEstudo();
    
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
    assertNotNull(var24);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test303");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 30);
    var2.setCor(2);
    var2.setNome("Metodo de estudo avancado");
    java.lang.String var7 = var2.getNome();
    var2.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test304");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo regular"+ "'", var1.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo regular"+ "'", var4.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test305");


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
    var1.setMetodoAvancado();
    
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

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test306");


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
    var28.setCor(1);
    java.lang.String var31 = var28.toString();
    Stude.Disciplina var34 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var35 = var34.toString();
    var34.setCor(15);
    var34.setNome("hi!");
    int var40 = var34.getCor();
    Stude.Cronograma var41 = new Stude.Cronograma();
    java.util.List var42 = var41.getDisciplinas();
    Stude.Disciplina var44 = var41.getDisciplina("Metodo de estudo regular");
    Stude.Stude var46 = new Stude.Stude("hi!");
    var46.setMetodoAvancado();
    Stude.MetodoDeEstudo var48 = var46.getMetodoDeEstudo();
    java.util.HashMap var49 = var46.desempenho();
    var46.setMetodoRegular();
    Stude.MetodoDeEstudo var51 = var46.getMetodoDeEstudo();
    var46.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var54 = var46.getCronograma();
    Stude.Disciplina var56 = var46.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var57 = var46.getCronograma();
    int var58 = var57.tamanhoDisciplinas();
    Stude.Disciplina var61 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var61.addHorasDeEstudo(10.0d);
    java.lang.String var64 = var61.toString();
    java.lang.String var65 = var61.getNome();
    int var66 = var61.getCor();
    var57.addDisciplina(var61);
    var41.addDisciplina(var61);
    Stude.Disciplina var71 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var72 = var71.toString();
    java.lang.String var73 = var71.toString();
    java.lang.String var74 = var71.toString();
    var71.addHorasDeEstudo(10.0d);
    var41.addDisciplina(var71);
    java.util.List var78 = var41.getDisciplinas();
    boolean var79 = var34.equals((java.lang.Object)var78);
    var34.setCor(30);
    int var82 = var34.getCor();
    boolean var83 = var28.equals((java.lang.Object)var34);
    
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
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo avancado"+ "'", var31.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Metodo de estudo avancado"+ "'", var35.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "Metodo de estudo regular"+ "'", var64.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "Metodo de estudo regular"+ "'", var65.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "Metodo de estudo avancado"+ "'", var72.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "Metodo de estudo avancado"+ "'", var73.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "Metodo de estudo avancado"+ "'", var74.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test307");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    int var11 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    int var13 = var1.intervalo();
    
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
    assertTrue(var13 == 10);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test308");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    java.util.HashMap var11 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test309");


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
    Stude.Disciplina var15 = var1.getDisciplina("hi!");
    var15.setCor(2);
    java.lang.String var18 = var15.toString();
    double var19 = var15.getHorasEstudadas();
    var15.addHorasDeEstudo(3.0d);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test310");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setMetodoAvancado();
    java.util.HashMap var7 = var1.desempenho();
    java.util.HashMap var8 = var1.desempenho();
    Stude.Usuario var9 = var1.getUsuario();
    int var10 = var1.tempoDeEstudo();
    
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

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test311");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    Stude.Usuario var9 = var1.getUsuario();
    var1.setMetodoAvancado();
    int var11 = var1.tempoDeEstudo();
    Stude.Usuario var12 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test312");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getIntervalo();
    java.lang.String var12 = var0.toString();
    
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
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo regular"+ "'", var12.equals("Metodo de estudo regular"));

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test313");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Usuario var8 = var1.getUsuario();
    java.lang.String var9 = var8.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setNome("");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test314");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    Stude.Disciplina var7 = var0.getDisciplina("");
    Stude.Disciplina var9 = var0.getDisciplina("Metodo de estudo regular");
    int var10 = var0.tamanhoDisciplinas();
    Stude.Disciplina var12 = var0.getDisciplina("Metodo de estudo avancado");
    
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
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test315");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    int var6 = var0.tamanhoDisciplinas();
    Stude.Stude var8 = new Stude.Stude("hi!");
    var8.setMetodoAvancado();
    Stude.MetodoDeEstudo var10 = var8.getMetodoDeEstudo();
    java.util.HashMap var11 = var8.desempenho();
    var8.setMetodoRegular();
    Stude.MetodoDeEstudo var13 = var8.getMetodoDeEstudo();
    var8.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var16 = var8.getCronograma();
    int var17 = var16.tamanhoDisciplinas();
    Stude.Disciplina var20 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var21 = var20.toString();
    java.lang.String var22 = var20.toString();
    java.lang.String var23 = var20.toString();
    var16.addDisciplina(var20);
    var0.addDisciplina(var20);
    java.lang.String var26 = var20.getNome();
    var20.addHorasDeEstudo(11.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Metodo de estudo avancado"+ "'", var22.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo avancado"+ "'", var26.equals("Metodo de estudo avancado"));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test316");


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
    var9.addDisciplina("Metodo de estudo avancado", 1);
    var9.setMetodoRegular();
    int var19 = var9.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 5);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test317");


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
    Stude.Disciplina var22 = var0.getDisciplina("hi!");
    Stude.Disciplina var24 = var0.getDisciplina("Metodo de estudo regular");
    
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
    assertNotNull(var24);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test318");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    int var3 = var2.getCor();
    double var4 = var2.getHorasEstudadas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addHorasDeEstudo(0.0d);
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test319");


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
    var13.setNome("hi!");
    java.lang.String var22 = var13.getNome();
    java.lang.String var23 = var13.toString();
    var13.setCor(15);
    double var26 = var13.getHorasEstudadas();
    java.lang.String var27 = var13.toString();
    
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
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test320");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    Stude.Disciplina var12 = var1.getDisciplina("");
    
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
    assertNull(var12);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test321");


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
    int var12 = var0.getIntervalo();
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
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test322");


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
    java.lang.String var14 = var9.getNome();
    Stude.Stude var16 = new Stude.Stude("hi!");
    var16.setMetodoRegular();
    Stude.MetodoDeEstudo var18 = var16.getMetodoDeEstudo();
    var16.setMetodoAvancado();
    int var20 = var16.intervalo();
    java.util.List var21 = var16.getDisciplinas();
    java.util.HashMap var22 = var16.desempenho();
    Stude.MetodoDeEstudo var23 = var16.getMetodoDeEstudo();
    Stude.Cronograma var24 = var16.getCronograma();
    boolean var25 = var9.equals((java.lang.Object)var16);
    java.util.HashMap var26 = var16.desempenho();
    
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
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test323");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    java.util.List var6 = var1.getDisciplinas();
    var1.setMetodoRegular();
    java.util.List var8 = var1.getDisciplinas();
    var1.setNomeUsuario("Metodo de estudo regular");
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
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test324");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    var1.setMetodoAvancado();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.HashMap var7 = var1.desempenho();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test325");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.intervalo();
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    
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

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test326");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    java.util.List var7 = var1.getDisciplinas();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoAvancado();
    
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

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test327");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    var1.setNomeUsuario("Metodo de estudo regular");
    int var7 = var1.tempoDeEstudo();
    Stude.Cronograma var8 = var1.getCronograma();
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
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test328");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    int var3 = var0.getTempo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test329");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Disciplina var9 = var1.getDisciplina("");
    java.util.List var10 = var1.getDisciplinas();
    var1.setNomeUsuario("hi!");
    
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

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test330");


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
    java.lang.String var24 = var2.toString();
    var2.setCor(10);
    java.lang.String var27 = var2.getNome();
    
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
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo regular"+ "'", var24.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo regular"+ "'", var27.equals("Metodo de estudo regular"));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test331");


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
    java.lang.String var44 = var38.toString();
    
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
    assertTrue("'" + var44 + "' != '" + "Metodo de estudo regular"+ "'", var44.equals("Metodo de estudo regular"));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test332");


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
    java.lang.String var34 = var26.toString();
    var26.setNome("Metodo de estudo regular");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Metodo de estudo regular"+ "'", var34.equals("Metodo de estudo regular"));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test333");


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
    Stude.Disciplina var15 = var1.getDisciplina("Metodo de estudo avancado");
    int var16 = var1.tempoDeEstudo();
    var1.setMetodoRegular();
    Stude.Cronograma var18 = var1.getCronograma();
    
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test334");


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
    var1.setMetodoRegular();
    var1.addDisciplina("Metodo de estudo avancado", 15);
    var1.setNomeUsuario("Metodo de estudo regular");
    
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

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test335");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", (-1));
    int var15 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 30);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test336");


    Stude.Cronograma var0 = new Stude.Cronograma();
    java.util.List var1 = var0.getDisciplinas();
    Stude.Disciplina var3 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var5 = var0.getDisciplina("hi!");
    int var6 = var0.tamanhoDisciplinas();
    Stude.Disciplina var8 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Stude var10 = new Stude.Stude("hi!");
    var10.setMetodoAvancado();
    Stude.MetodoDeEstudo var12 = var10.getMetodoDeEstudo();
    int var13 = var10.tempoDeEstudo();
    java.util.List var14 = var10.getDisciplinas();
    var10.setMetodoAvancado();
    Stude.MetodoDeEstudo var16 = var10.getMetodoDeEstudo();
    java.util.HashMap var17 = var10.desempenho();
    Stude.MetodoDeEstudo var18 = var10.getMetodoDeEstudo();
    Stude.Cronograma var19 = var10.getCronograma();
    Stude.Stude var21 = new Stude.Stude("hi!");
    int var22 = var21.intervalo();
    Stude.Usuario var23 = var21.getUsuario();
    var21.addDisciplina("hi!", 0);
    int var27 = var21.tempoDeEstudo();
    var21.setMetodoRegular();
    java.util.List var29 = var21.getDisciplinas();
    Stude.Cronograma var30 = var21.getCronograma();
    Stude.Stude var32 = new Stude.Stude("hi!");
    var32.setMetodoAvancado();
    Stude.MetodoDeEstudo var34 = var32.getMetodoDeEstudo();
    java.util.HashMap var35 = var32.desempenho();
    var32.setMetodoRegular();
    Stude.MetodoDeEstudo var37 = var32.getMetodoDeEstudo();
    var32.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var40 = var32.getCronograma();
    int var41 = var40.tamanhoDisciplinas();
    Stude.Disciplina var44 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var45 = var44.toString();
    java.lang.String var46 = var44.toString();
    java.lang.String var47 = var44.toString();
    var40.addDisciplina(var44);
    Stude.Disciplina var51 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var51.setCor((-1));
    var51.addHorasDeEstudo(10.0d);
    java.lang.String var56 = var51.getNome();
    var51.setNome("Metodo de estudo regular");
    var40.addDisciplina(var51);
    Stude.Stude var61 = new Stude.Stude("hi!");
    Stude.Cronograma var62 = var61.getCronograma();
    int var63 = var61.tempoDeEstudo();
    int var64 = var61.tempoDeEstudo();
    int var65 = var61.intervalo();
    var61.setMetodoAvancado();
    Stude.Cronograma var67 = var61.getCronograma();
    Stude.Disciplina var70 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var71 = var70.getHorasEstudadas();
    var70.setNome("hi!");
    var70.setNome("hi!");
    var67.addDisciplina(var70);
    var70.setCor(30);
    var40.addDisciplina(var70);
    var70.setCor((-1));
    var30.addDisciplina(var70);
    var70.setNome("Metodo de estudo avancado");
    var19.addDisciplina(var70);
    var0.addDisciplina(var70);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Metodo de estudo avancado"+ "'", var45.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Metodo de estudo avancado"+ "'", var46.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Metodo de estudo avancado"+ "'", var47.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "Metodo de estudo regular"+ "'", var56.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0.0d);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test337");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var10 = var1.getMetodoDeEstudo();
    Stude.Usuario var11 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test338");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.List var5 = var4.getDisciplinas();
    java.util.HashMap var6 = Stude.Desempenho.tempoDeEstudo(var5);
    
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

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test339");


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
    boolean var22 = var11.equals((java.lang.Object)1);
    var11.setNome("hi!");
    
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
    assertTrue(var22 == false);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test340");


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
    int var14 = var1.intervalo();
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test341");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    int var5 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", 100);
    Stude.Usuario var9 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test342");


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
    java.lang.String var24 = var2.getNome();
    java.lang.String var25 = var2.toString();
    Stude.Stude var27 = new Stude.Stude("hi!");
    var27.setMetodoAvancado();
    Stude.MetodoDeEstudo var29 = var27.getMetodoDeEstudo();
    java.util.HashMap var30 = var27.desempenho();
    var27.setMetodoRegular();
    java.util.List var32 = var27.getDisciplinas();
    java.util.HashMap var33 = var27.desempenho();
    int var34 = var27.intervalo();
    Stude.Cronograma var35 = var27.getCronograma();
    var27.setMetodoAvancado();
    var27.setMetodoRegular();
    int var38 = var27.intervalo();
    boolean var39 = var2.equals((java.lang.Object)var27);
    
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
    assertTrue(var38 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test343");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    double var6 = var2.getHorasEstudadas();
    var2.setCor(3);
    Stude.Stude var10 = new Stude.Stude("hi!");
    int var11 = var10.intervalo();
    Stude.Usuario var12 = var10.getUsuario();
    Stude.Cronograma var13 = var10.getCronograma();
    Stude.Disciplina var16 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var16.addHorasDeEstudo(10.0d);
    java.lang.String var19 = var16.toString();
    java.lang.String var20 = var16.getNome();
    java.lang.String var21 = var16.getNome();
    var13.addDisciplina(var16);
    Stude.Stude var24 = new Stude.Stude("hi!");
    var24.addDisciplina("hi!", 0);
    Stude.Disciplina var29 = var24.getDisciplina("Metodo de estudo regular");
    var24.setMetodoRegular();
    var24.setMetodoAvancado();
    boolean var32 = var16.equals((java.lang.Object)var24);
    var16.setCor(15);
    java.lang.String var35 = var16.toString();
    Stude.Disciplina var38 = new Stude.Disciplina("hi!", 5);
    double var39 = var38.getHorasEstudadas();
    var38.addHorasDeEstudo(10.0d);
    java.lang.String var42 = var38.toString();
    boolean var43 = var16.equals((java.lang.Object)var38);
    boolean var44 = var2.equals((java.lang.Object)var38);
    var2.setCor(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Metodo de estudo regular"+ "'", var19.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo regular"+ "'", var20.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo regular"+ "'", var21.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Metodo de estudo regular"+ "'", var35.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test344");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo regular");
    Stude.Disciplina var8 = var1.getDisciplina("");
    int var9 = var1.tempoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test345");


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
    java.lang.String var71 = var30.getNome();
    java.lang.String var72 = var30.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "Metodo de estudo regular"+ "'", var71.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "Metodo de estudo regular"+ "'", var72.equals("Metodo de estudo regular"));

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test346");


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
    Stude.Stude var29 = new Stude.Stude("hi!");
    int var30 = var29.intervalo();
    Stude.Usuario var31 = var29.getUsuario();
    Stude.Cronograma var32 = var29.getCronograma();
    Stude.Disciplina var35 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var35.addHorasDeEstudo(10.0d);
    java.lang.String var38 = var35.toString();
    java.lang.String var39 = var35.getNome();
    java.lang.String var40 = var35.getNome();
    var32.addDisciplina(var35);
    var0.addDisciplina(var35);
    var35.addHorasDeEstudo(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var35.addHorasDeEstudo(0.0d);
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
    assertTrue(var30 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "Metodo de estudo regular"+ "'", var38.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo regular"+ "'", var39.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Metodo de estudo regular"+ "'", var40.equals("Metodo de estudo regular"));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test347");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getTempo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
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
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test348");


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
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test349");


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
    java.util.List var28 = var14.getDisciplinas();
    int var29 = var14.tamanhoDisciplinas();
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test350");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    double var3 = var2.getHorasEstudadas();
    double var4 = var2.getHorasEstudadas();
    Stude.Avancado var5 = new Stude.Avancado();
    int var6 = var5.getIntervalo();
    java.lang.String var7 = var5.toString();
    java.lang.String var8 = var5.toString();
    int var9 = var5.getIntervalo();
    int var10 = var5.getTempo();
    java.lang.String var11 = var5.toString();
    int var12 = var5.getTempo();
    java.lang.String var13 = var5.toString();
    java.lang.String var14 = var5.toString();
    java.lang.String var15 = var5.toString();
    boolean var16 = var2.equals((java.lang.Object)var5);
    int var17 = var5.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo avancado"+ "'", var15.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test351");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    var1.setMetodoAvancado();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    java.lang.String var10 = var7.toString();
    var7.setCor((-1));
    java.lang.String var13 = var7.toString();
    java.lang.String var14 = var7.getNome();
    var7.addHorasDeEstudo(20.0d);
    var4.addDisciplina(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test352");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.Cronograma var8 = var1.getCronograma();
    var1.setMetodoRegular();
    Stude.Usuario var10 = var1.getUsuario();
    var1.setMetodoAvancado();
    
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

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test353");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    java.util.HashMap var8 = var1.desempenho();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.removeDisciplina("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test354");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 5);
    java.lang.String var3 = var2.getNome();
    var2.setCor(15);
    var2.setNome("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test355");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var7 = var1.getMetodoDeEstudo();
    java.util.HashMap var8 = var1.desempenho();
    int var9 = var1.tempoDeEstudo();
    int var10 = var1.intervalo();
    java.util.List var11 = var1.getDisciplinas();
    
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
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test356");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Usuario var7 = var1.getUsuario();
    var1.addDisciplina("hi!", 15);
    var1.addDisciplina("Metodo de estudo avancado", 5);
    Stude.Disciplina var15 = var1.getDisciplina("hi!");
    Stude.Cronograma var16 = var1.getCronograma();
    Stude.Disciplina var18 = var16.getDisciplina("Metodo de estudo regular");
    int var19 = var16.tamanhoDisciplinas();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test357");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getTempo();
    int var12 = var0.getTempo();
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
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test358");


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
    java.lang.String var23 = var16.getNome();
    java.lang.String var24 = var16.toString();
    var16.addHorasDeEstudo(3.0d);
    var16.addHorasDeEstudo(21.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Metodo de estudo avancado"+ "'", var24.equals("Metodo de estudo avancado"));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test359");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    java.util.List var14 = var1.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test360");


    Stude.Usuario var1 = new Stude.Usuario("Metodo de estudo regular");
    java.lang.String var2 = var1.getNome();
    var1.setNome("hi!");
    var1.setNome("Metodo de estudo avancado");
    java.lang.String var7 = var1.getNome();
    java.lang.String var8 = var1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Metodo de estudo regular"+ "'", var2.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test361");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    int var8 = var1.intervalo();
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
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test362");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    java.util.List var9 = var1.getDisciplinas();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    Stude.Disciplina var13 = var1.getDisciplina("");
    Stude.Usuario var14 = var1.getUsuario();
    java.lang.String var15 = var14.getNome();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test363");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo avancado");
    int var2 = var1.intervalo();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var5 = var3.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var7 = var3.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var9 = var3.getDisciplina("");
    
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

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test364");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getIntervalo();
    java.lang.String var10 = var0.toString();
    
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
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo regular"+ "'", var10.equals("Metodo de estudo regular"));

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test365");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    Stude.MetodoDeEstudo var5 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test366");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    var2.setNome("hi!");
    int var8 = var2.getCor();
    Stude.Stude var10 = new Stude.Stude("hi!");
    var10.addDisciplina("Metodo de estudo regular", 10);
    int var14 = var10.tempoDeEstudo();
    java.util.List var15 = var10.getDisciplinas();
    java.util.HashMap var16 = Stude.Desempenho.tempoDeEstudo(var15);
    boolean var17 = var2.equals((java.lang.Object)var16);
    double var18 = var2.getHorasEstudadas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test367");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    int var8 = var1.tempoDeEstudo();
    Stude.Usuario var9 = var1.getUsuario();
    int var10 = var1.tempoDeEstudo();
    Stude.Disciplina var12 = var1.getDisciplina("hi!");
    java.util.HashMap var13 = var1.desempenho();
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test368");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    double var8 = var2.getHorasEstudadas();
    var2.setCor(10);
    java.lang.String var11 = var2.toString();
    int var12 = var2.getCor();
    java.lang.String var13 = var2.getNome();
    var2.setCor(2);
    var2.setNome("Metodo de estudo regular");
    var2.setCor(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo regular"+ "'", var13.equals("Metodo de estudo regular"));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test369");


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
    java.lang.String var39 = var11.getNome();
    Stude.Cronograma var40 = new Stude.Cronograma();
    Stude.Disciplina var42 = var40.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var44 = var40.getDisciplina("");
    int var45 = var40.tamanhoDisciplinas();
    Stude.Disciplina var47 = var40.getDisciplina("hi!");
    java.util.List var48 = var40.getDisciplinas();
    Stude.Disciplina var50 = var40.getDisciplina("Metodo de estudo regular");
    Stude.Stude var52 = new Stude.Stude("hi!");
    var52.setMetodoAvancado();
    Stude.MetodoDeEstudo var54 = var52.getMetodoDeEstudo();
    java.util.HashMap var55 = var52.desempenho();
    var52.setMetodoRegular();
    java.util.List var57 = var52.getDisciplinas();
    var52.addDisciplina("Metodo de estudo regular", 100);
    Stude.Disciplina var62 = var52.getDisciplina("Metodo de estudo regular");
    var40.addDisciplina(var62);
    java.util.List var64 = var40.getDisciplinas();
    java.util.List var65 = var40.getDisciplinas();
    boolean var66 = var11.equals((java.lang.Object)var40);
    Stude.Disciplina var68 = var40.getDisciplina("Metodo de estudo avancado");
    
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
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo regular"+ "'", var39.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test370");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    var1.setNomeUsuario("Metodo de estudo avancado");
    java.util.HashMap var9 = var1.desempenho();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test371");


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
    int var20 = var0.tamanhoDisciplinas();
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
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test372");


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
    int var11 = var0.getIntervalo();
    int var12 = var0.getIntervalo();
    
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
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test373");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    Stude.Disciplina var9 = var1.getDisciplina("");
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test374");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var2.setCor(5);
    Stude.Stude var6 = new Stude.Stude("hi!");
    var6.setMetodoAvancado();
    Stude.MetodoDeEstudo var8 = var6.getMetodoDeEstudo();
    java.util.HashMap var9 = var6.desempenho();
    var6.setMetodoRegular();
    Stude.MetodoDeEstudo var11 = var6.getMetodoDeEstudo();
    var6.setNomeUsuario("Metodo de estudo regular");
    Stude.Cronograma var14 = var6.getCronograma();
    Stude.Disciplina var16 = var6.getDisciplina("Metodo de estudo regular");
    Stude.Cronograma var17 = var6.getCronograma();
    Stude.Cronograma var18 = var6.getCronograma();
    java.util.List var19 = var18.getDisciplinas();
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var22.setCor((-1));
    var22.addHorasDeEstudo(10.0d);
    Stude.Cronograma var27 = new Stude.Cronograma();
    java.util.List var28 = var27.getDisciplinas();
    Stude.Disciplina var30 = var27.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var32 = var27.getDisciplina("hi!");
    Stude.Disciplina var34 = var27.getDisciplina("");
    java.util.List var35 = var27.getDisciplinas();
    java.util.HashMap var36 = Stude.Desempenho.tempoDeEstudo(var35);
    java.util.HashMap var37 = Stude.Desempenho.tempoDeEstudo(var35);
    java.util.HashMap var38 = Stude.Desempenho.tempoDeEstudo(var35);
    java.util.HashMap var39 = Stude.Desempenho.tempoDeEstudo(var35);
    boolean var40 = var22.equals((java.lang.Object)var39);
    var18.addDisciplina(var22);
    Stude.Disciplina var43 = var18.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var45 = var18.getDisciplina("");
    boolean var46 = var2.equals((java.lang.Object)var18);
    java.lang.String var47 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Metodo de estudo avancado"+ "'", var47.equals("Metodo de estudo avancado"));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test375");


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
    var15.setCor(0);
    Stude.Avancado var19 = new Stude.Avancado();
    java.lang.String var20 = var19.toString();
    java.lang.String var21 = var19.toString();
    int var22 = var19.getIntervalo();
    java.lang.String var23 = var19.toString();
    int var24 = var19.getIntervalo();
    boolean var25 = var15.equals((java.lang.Object)var24);
    java.lang.String var26 = var15.toString();
    int var27 = var15.getCor();
    double var28 = var15.getHorasEstudadas();
    
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
    assertTrue("'" + var20 + "' != '" + "Metodo de estudo avancado"+ "'", var20.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Metodo de estudo avancado"+ "'", var21.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Metodo de estudo regular"+ "'", var26.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test376");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    java.util.HashMap var7 = var1.desempenho();
    java.util.List var8 = var1.getDisciplinas();
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

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test377");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var9 = var1.getCronograma();
    java.util.List var10 = var1.getDisciplinas();
    java.util.HashMap var11 = var1.desempenho();
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
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test378");


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
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test379");


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
    java.lang.String var39 = var13.getNome();
    var13.addHorasDeEstudo(1.0d);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Metodo de estudo regular"+ "'", var39.equals("Metodo de estudo regular"));

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test380");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    var1.addDisciplina("hi!", 5);
    java.util.List var11 = var1.getDisciplinas();
    boolean var13 = var1.removeDisciplina("hi!");
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 15);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test381");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    int var7 = var1.intervalo();
    var1.addDisciplina("Metodo de estudo avancado", 2);
    Stude.MetodoDeEstudo var11 = var1.getMetodoDeEstudo();
    var1.addDisciplina("hi!", 1);
    var1.setNomeUsuario("Metodo de estudo avancado");
    
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
    assertNotNull(var11);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test382");


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
    Stude.Stude var45 = new Stude.Stude("hi!");
    int var46 = var45.intervalo();
    Stude.MetodoDeEstudo var47 = var45.getMetodoDeEstudo();
    int var48 = var45.tempoDeEstudo();
    var45.setMetodoAvancado();
    int var50 = var45.tempoDeEstudo();
    boolean var51 = var40.equals((java.lang.Object)var45);
    int var52 = var45.intervalo();
    
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
    assertTrue(var46 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 10);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test383");


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
    int var25 = var0.tamanhoDisciplinas();
    int var26 = var0.tamanhoDisciplinas();
    java.util.List var27 = var0.getDisciplinas();
    
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
    assertTrue(var25 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test384");


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
    var13.setCor(5);
    java.lang.String var33 = var13.getNome();
    
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
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo regular"+ "'", var33.equals("Metodo de estudo regular"));

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test385");


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
    int var37 = var36.intervalo();
    Stude.Usuario var38 = var36.getUsuario();
    Stude.Cronograma var39 = var36.getCronograma();
    Stude.Disciplina var42 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var42.addHorasDeEstudo(10.0d);
    java.lang.String var45 = var42.toString();
    java.lang.String var46 = var42.getNome();
    java.lang.String var47 = var42.getNome();
    var39.addDisciplina(var42);
    Stude.Stude var50 = new Stude.Stude("hi!");
    var50.addDisciplina("hi!", 0);
    Stude.Disciplina var55 = var50.getDisciplina("Metodo de estudo regular");
    var50.setMetodoRegular();
    var50.setMetodoAvancado();
    boolean var58 = var42.equals((java.lang.Object)var50);
    int var59 = var50.intervalo();
    boolean var60 = var34.equals((java.lang.Object)var50);
    Stude.Disciplina var62 = var50.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var64 = var50.getDisciplina("Metodo de estudo avancado");
    int var65 = var50.tempoDeEstudo();
    
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
    assertTrue(var37 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Metodo de estudo regular"+ "'", var45.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Metodo de estudo regular"+ "'", var46.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Metodo de estudo regular"+ "'", var47.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 30);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test386");


    Stude.Cronograma var0 = new Stude.Cronograma();
    Stude.Disciplina var2 = var0.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var4 = var0.getDisciplina("");
    int var5 = var0.tamanhoDisciplinas();
    Stude.Disciplina var7 = var0.getDisciplina("hi!");
    Stude.Disciplina var9 = var0.getDisciplina("hi!");
    java.util.List var10 = var0.getDisciplinas();
    int var11 = var0.tamanhoDisciplinas();
    java.util.List var12 = var0.getDisciplinas();
    Stude.Disciplina var14 = var0.getDisciplina("Metodo de estudo avancado");
    java.util.List var15 = var0.getDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var17 = var0.removeDisciplina("");
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
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test387");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var5 = var3.getDisciplina("");
    java.util.List var6 = var3.getDisciplinas();
    java.util.List var7 = var3.getDisciplinas();
    Stude.Cronograma var8 = new Stude.Cronograma();
    Stude.Disciplina var10 = var8.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var12 = var8.getDisciplina("");
    Stude.Disciplina var15 = new Stude.Disciplina("Metodo de estudo avancado", 10);
    int var16 = var15.getCor();
    var8.addDisciplina(var15);
    double var18 = var15.getHorasEstudadas();
    var3.addDisciplina(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test388");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    var2.setCor(100);
    Stude.Avancado var8 = new Stude.Avancado();
    java.lang.String var9 = var8.toString();
    java.lang.String var10 = var8.toString();
    int var11 = var8.getIntervalo();
    java.lang.String var12 = var8.toString();
    java.lang.String var13 = var8.toString();
    java.lang.String var14 = var8.toString();
    int var15 = var8.getTempo();
    int var16 = var8.getIntervalo();
    int var17 = var8.getTempo();
    java.lang.String var18 = var8.toString();
    boolean var19 = var2.equals((java.lang.Object)var8);
    int var20 = var8.getIntervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test389");


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
    java.util.List var13 = var10.getDisciplinas();
    Stude.Disciplina var15 = var10.getDisciplina("");
    Stude.Disciplina var17 = var10.getDisciplina("");
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test390");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    
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
    assertTrue(var8 == 5);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test391");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Disciplina var4 = var2.getDisciplina("hi!");
    Stude.Disciplina var7 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var8 = var7.toString();
    var7.setCor(15);
    var7.setCor(15);
    var2.addDisciplina(var7);
    Stude.Disciplina var15 = var2.getDisciplina("hi!");
    int var16 = var2.tamanhoDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test392");


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
    int var15 = var1.tempoDeEstudo();
    
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
    assertTrue(var15 == 15);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test393");


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
    var29.addDisciplina("Metodo de estudo regular", 10);
    int var33 = var29.tempoDeEstudo();
    var29.addDisciplina("Metodo de estudo regular", 15);
    boolean var37 = var15.equals((java.lang.Object)var29);
    var15.addHorasDeEstudo(101.0d);
    
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
    assertTrue(var33 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test394");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    java.lang.String var8 = var0.toString();
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
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo regular"+ "'", var9.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test395");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    
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

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test396");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    int var7 = var1.tempoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    Stude.Cronograma var9 = var1.getCronograma();
    Stude.Disciplina var12 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var13 = var12.toString();
    var12.setCor(15);
    var12.setNome("hi!");
    int var18 = var12.getCor();
    Stude.Stude var20 = new Stude.Stude("hi!");
    int var21 = var20.intervalo();
    var20.setNomeUsuario("Metodo de estudo regular");
    int var24 = var20.intervalo();
    Stude.Usuario var25 = var20.getUsuario();
    Stude.Disciplina var27 = var20.getDisciplina("Metodo de estudo avancado");
    boolean var28 = var12.equals((java.lang.Object)var20);
    java.lang.String var29 = var12.toString();
    int var30 = var12.getCor();
    var9.addDisciplina(var12);
    
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
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 15);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test397");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    var1.addDisciplina("hi!", 15);
    Stude.MetodoDeEstudo var13 = var1.getMetodoDeEstudo();
    boolean var15 = var1.removeDisciplina("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test398");


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
    var37.setNome("hi!");
    java.lang.String var47 = var37.getNome();
    Stude.Cronograma var48 = new Stude.Cronograma();
    java.util.List var49 = var48.getDisciplinas();
    Stude.Disciplina var52 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var52.setCor((-1));
    int var55 = var52.getCor();
    var52.setNome("Metodo de estudo regular");
    double var58 = var52.getHorasEstudadas();
    var48.addDisciplina(var52);
    boolean var60 = var37.equals((java.lang.Object)var52);
    int var61 = var52.getCor();
    
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
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == (-1));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test399");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    int var5 = var0.getIntervalo();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getTempo();
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
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test400");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var10 = var1.getCronograma();
    int var11 = var1.tempoDeEstudo();
    Stude.Disciplina var13 = var1.getDisciplina("hi!");
    int var14 = var1.intervalo();
    Stude.Cronograma var15 = var1.getCronograma();
    var1.setNomeUsuario("hi!");
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test401");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    int var4 = var1.tempoDeEstudo();
    java.util.List var5 = var1.getDisciplinas();
    int var6 = var1.tempoDeEstudo();
    java.util.List var7 = var1.getDisciplinas();
    java.util.HashMap var8 = var1.desempenho();
    java.util.HashMap var9 = var1.desempenho();
    var1.setMetodoAvancado();
    Stude.Usuario var11 = var1.getUsuario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test402");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    int var9 = var0.getIntervalo();
    int var10 = var0.getTempo();
    int var11 = var0.getIntervalo();
    int var12 = var0.getIntervalo();
    
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
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test403");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 15);
    int var3 = var2.getCor();
    var2.addHorasDeEstudo(101.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test404");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    int var5 = var1.tempoDeEstudo();
    java.util.List var6 = var1.getDisciplinas();
    var1.setMetodoRegular();
    java.util.List var8 = var1.getDisciplinas();
    java.util.List var9 = var1.getDisciplinas();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test405");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoRegular();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Usuario var4 = var1.getUsuario();
    Stude.Cronograma var5 = var1.getCronograma();
    Stude.Cronograma var6 = new Stude.Cronograma();
    java.util.List var7 = var6.getDisciplinas();
    Stude.Disciplina var9 = var6.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var6.getDisciplina("hi!");
    Stude.Disciplina var14 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var6.addDisciplina(var14);
    Stude.Disciplina var18 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    var6.addDisciplina(var18);
    Stude.Disciplina var22 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var23 = var22.toString();
    var22.setCor(15);
    var22.setCor(10);
    var6.addDisciplina(var22);
    Stude.Disciplina var30 = var6.getDisciplina("Metodo de estudo regular");
    Stude.Stude var32 = new Stude.Stude("hi!");
    int var33 = var32.intervalo();
    Stude.Usuario var34 = var32.getUsuario();
    var32.setMetodoRegular();
    var32.setMetodoRegular();
    Stude.Usuario var37 = var32.getUsuario();
    java.util.List var38 = var32.getDisciplinas();
    Stude.Disciplina var40 = var32.getDisciplina("");
    Stude.Disciplina var42 = var32.getDisciplina("Metodo de estudo avancado");
    var32.addDisciplina("hi!", 15);
    boolean var46 = var30.equals((java.lang.Object)"hi!");
    var5.addDisciplina(var30);
    java.util.List var48 = var5.getDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test406");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.tempoDeEstudo();
    java.util.HashMap var5 = var1.desempenho();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Usuario var8 = var1.getUsuario();
    java.lang.String var9 = var8.getNome();
    
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
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test407");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    var1.setNomeUsuario("Metodo de estudo regular");
    int var5 = var1.intervalo();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("");
    java.util.List var9 = var1.getDisciplinas();
    java.util.HashMap var10 = Stude.Desempenho.tempoDeEstudo(var9);
    java.util.HashMap var11 = Stude.Desempenho.tempoDeEstudo(var9);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test408");


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
    var39.setNome("hi!");
    
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

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test409");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    int var2 = var0.getIntervalo();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getIntervalo();
    
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
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test410");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    Stude.Cronograma var5 = var1.getCronograma();
    Stude.MetodoDeEstudo var6 = var1.getMetodoDeEstudo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test411");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    java.lang.String var5 = var2.getNome();
    java.lang.String var6 = var2.getNome();
    int var7 = var2.getCor();
    var2.setCor(2);
    Stude.Stude var11 = new Stude.Stude("hi!");
    var11.setMetodoAvancado();
    Stude.MetodoDeEstudo var13 = var11.getMetodoDeEstudo();
    java.util.HashMap var14 = var11.desempenho();
    var11.setMetodoRegular();
    java.util.List var16 = var11.getDisciplinas();
    java.util.HashMap var17 = var11.desempenho();
    var11.addDisciplina("hi!", 5);
    boolean var21 = var2.equals((java.lang.Object)5);
    var2.setNome("hi!");
    var2.setCor(15);
    Stude.Stude var27 = new Stude.Stude("hi!");
    var27.setMetodoAvancado();
    Stude.MetodoDeEstudo var29 = var27.getMetodoDeEstudo();
    java.util.HashMap var30 = var27.desempenho();
    var27.setMetodoRegular();
    Stude.MetodoDeEstudo var32 = var27.getMetodoDeEstudo();
    java.util.HashMap var33 = var27.desempenho();
    java.util.HashMap var34 = var27.desempenho();
    boolean var35 = var2.equals((java.lang.Object)var34);
    int var36 = var2.getCor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo regular"+ "'", var6.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 15);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test412");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getIntervalo();
    int var8 = var0.getIntervalo();
    int var9 = var0.getTempo();
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
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test413");


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
    int var37 = var3.tamanhoDisciplinas();
    
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
    assertTrue(var37 == 2);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test414");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var72 = var7.removeDisciplina("");
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

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test415");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    java.util.HashMap var5 = var1.desempenho();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Usuario var7 = var1.getUsuario();
    Stude.MetodoDeEstudo var8 = var1.getMetodoDeEstudo();
    var1.addDisciplina("Metodo de estudo regular", 2);
    
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

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test416");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getTempo();
    int var6 = var0.getTempo();
    int var7 = var0.getTempo();
    int var8 = var0.getIntervalo();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getIntervalo();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getIntervalo();
    int var15 = var0.getIntervalo();
    java.lang.String var16 = var0.toString();
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
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Metodo de estudo avancado"+ "'", var9.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Metodo de estudo avancado"+ "'", var10.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Metodo de estudo avancado"+ "'", var13.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo avancado"+ "'", var16.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test417");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    Stude.Cronograma var7 = new Stude.Cronograma();
    Stude.Disciplina var9 = var7.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var11 = var7.getDisciplina("");
    java.util.List var12 = var7.getDisciplinas();
    boolean var13 = var2.equals((java.lang.Object)var7);
    int var14 = var2.getCor();
    int var15 = var2.getCor();
    var2.setCor(15);
    
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
    assertTrue(var14 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test418");


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
    Stude.MetodoDeEstudo var12 = var1.getMetodoDeEstudo();
    
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

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test419");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    var1.setMetodoAvancado();
    int var7 = var1.intervalo();
    Stude.Cronograma var8 = var1.getCronograma();
    int var9 = var1.intervalo();
    var1.setMetodoAvancado();
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
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test420");


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
    Stude.Disciplina var32 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var33 = var32.toString();
    var32.setCor(15);
    java.lang.String var36 = var32.getNome();
    boolean var38 = var32.equals((java.lang.Object)(byte)100);
    double var39 = var32.getHorasEstudadas();
    Stude.Stude var41 = new Stude.Stude("hi!");
    int var42 = var41.intervalo();
    Stude.MetodoDeEstudo var43 = var41.getMetodoDeEstudo();
    Stude.Disciplina var45 = var41.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var47 = var41.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var49 = var41.getDisciplina("Metodo de estudo avancado");
    Stude.Usuario var50 = var41.getUsuario();
    java.lang.String var51 = var50.getNome();
    boolean var52 = var32.equals((java.lang.Object)var50);
    java.lang.String var53 = var50.getNome();
    boolean var54 = var13.equals((java.lang.Object)var53);
    
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
    assertTrue("'" + var33 + "' != '" + "Metodo de estudo avancado"+ "'", var33.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Metodo de estudo avancado"+ "'", var36.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "hi!"+ "'", var51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test421");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    var2.setNome("hi!");
    int var8 = var2.getCor();
    var2.setNome("Metodo de estudo avancado");
    var2.setNome("Metodo de estudo regular");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Metodo de estudo avancado"+ "'", var4.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo avancado"+ "'", var5.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test422");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    int var5 = var1.intervalo();
    var1.addDisciplina("Metodo de estudo avancado", 5);
    boolean var10 = var1.removeDisciplina("Metodo de estudo avancado");
    var1.setNomeUsuario("hi!");
    Stude.Disciplina var14 = var1.getDisciplina("hi!");
    var1.setMetodoAvancado();
    var1.setMetodoRegular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test423");


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
    java.lang.String var25 = var2.getNome();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Metodo de estudo avancado"+ "'", var25.equals("Metodo de estudo avancado"));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test424");


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
    Stude.Usuario var13 = var1.getUsuario();
    var1.setNomeUsuario("Metodo de estudo avancado");
    
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

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test425");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.addDisciplina("Metodo de estudo avancado", (-1));
    var1.setMetodoRegular();
    int var8 = var1.tempoDeEstudo();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    boolean var12 = var1.removeDisciplina("Metodo de estudo avancado");
    int var13 = var1.intervalo();
    int var14 = var1.intervalo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test426");


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
    Stude.Cronograma var16 = var1.getCronograma();
    java.util.List var17 = var16.getDisciplinas();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test427");


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
    Stude.Disciplina var14 = new Stude.Disciplina("Metodo de estudo avancado", 15);
    var11.addDisciplina(var14);
    Stude.Avancado var16 = new Stude.Avancado();
    java.lang.String var17 = var16.toString();
    java.lang.String var18 = var16.toString();
    int var19 = var16.getIntervalo();
    int var20 = var16.getIntervalo();
    int var21 = var16.getIntervalo();
    int var22 = var16.getIntervalo();
    int var23 = var16.getIntervalo();
    boolean var24 = var14.equals((java.lang.Object)var23);
    var14.setNome("Metodo de estudo avancado");
    
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
    assertTrue("'" + var17 + "' != '" + "Metodo de estudo avancado"+ "'", var17.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Metodo de estudo avancado"+ "'", var18.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test428");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo regular");
    var1.addDisciplina("hi!", (-1));
    var1.setMetodoRegular();
    var1.addDisciplina("Metodo de estudo regular", 10);
    
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

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test429");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    Stude.Disciplina var5 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var7 = var1.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var9 = var1.getDisciplina("Metodo de estudo avancado");
    Stude.Cronograma var10 = var1.getCronograma();
    int var11 = var1.tempoDeEstudo();
    java.util.List var12 = var1.getDisciplinas();
    int var13 = var1.tempoDeEstudo();
    Stude.Usuario var14 = var1.getUsuario();
    var1.addDisciplina("hi!", 0);
    
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
    assertTrue(var13 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test430");


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
    java.util.List var15 = var1.getDisciplinas();
    var1.setMetodoRegular();
    
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
    assertNotNull(var15);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test431");


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
    java.lang.String var31 = var20.getNome();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Metodo de estudo regular"+ "'", var31.equals("Metodo de estudo regular"));

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test432");


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
    int var13 = var1.intervalo();
    Stude.Usuario var14 = var1.getUsuario();
    int var15 = var1.intervalo();
    
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
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test433");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    Stude.Cronograma var4 = var1.getCronograma();
    var1.setMetodoAvancado();
    var1.setMetodoAvancado();
    Stude.Usuario var7 = var1.getUsuario();
    java.lang.String var8 = var7.getNome();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test434");


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
    var69.setCor(3);
    var69.setNome("Metodo de estudo regular");
    
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

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test435");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    var1.setMetodoAvancado();
    java.util.List var5 = var1.getDisciplinas();
    java.util.HashMap var6 = var1.desempenho();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var10 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var11 = var10.toString();
    var10.setCor(15);
    java.lang.String var14 = var10.getNome();
    var7.addDisciplina(var10);
    int var16 = var7.tamanhoDisciplinas();
    int var17 = var7.tamanhoDisciplinas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var19 = var7.removeDisciplina("hi!");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo avancado"+ "'", var14.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test436");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getTempo();
    int var4 = var0.getTempo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Metodo de estudo avancado"+ "'", var1.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test437");


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
    var19.addHorasDeEstudo(20.0d);
    
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

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test438");


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
    Stude.Disciplina var62 = var9.getDisciplina("Metodo de estudo regular");
    
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
    assertNull(var62);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test439");


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
    Stude.Disciplina var61 = var7.getDisciplina("hi!");
    
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

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test440");


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
    int var14 = var1.intervalo();
    Stude.Usuario var15 = var1.getUsuario();
    
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
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test441");


    Stude.Regular var0 = new Stude.Regular();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getTempo();
    int var3 = var0.getIntervalo();
    int var4 = var0.getTempo();
    int var5 = var0.getIntervalo();
    int var6 = var0.getIntervalo();
    int var7 = var0.getTempo();
    java.lang.String var8 = var0.toString();
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
    assertTrue(var4 == 15);
    
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
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo regular"+ "'", var11.equals("Metodo de estudo regular"));

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test442");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    var1.addDisciplina("Metodo de estudo regular", 100);
    Stude.Usuario var10 = var1.getUsuario();
    Stude.Usuario var11 = var1.getUsuario();
    java.util.List var12 = var1.getDisciplinas();
    java.util.HashMap var13 = Stude.Desempenho.tempoDeEstudo(var12);
    java.util.HashMap var14 = Stude.Desempenho.tempoDeEstudo(var12);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test443");


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
    int var23 = var12.tamanhoDisciplinas();
    Stude.Cronograma var24 = new Stude.Cronograma();
    int var25 = var24.tamanhoDisciplinas();
    Stude.Disciplina var28 = new Stude.Disciplina("Metodo de estudo regular", 1);
    var24.addDisciplina(var28);
    var12.addDisciplina(var28);
    var28.addHorasDeEstudo(101.0d);
    
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
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test444");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    int var3 = var1.tempoDeEstudo();
    var1.setNomeUsuario("hi!");
    var1.setMetodoAvancado();
    Stude.Disciplina var8 = var1.getDisciplina("");
    Stude.Disciplina var10 = var1.getDisciplina("Metodo de estudo avancado");
    int var11 = var1.intervalo();
    var1.setMetodoRegular();
    Stude.Disciplina var14 = var1.getDisciplina("Metodo de estudo avancado");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test445");


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
    java.lang.String var12 = var0.toString();
    int var13 = var0.getTempo();
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
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Metodo de estudo avancado"+ "'", var11.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Metodo de estudo avancado"+ "'", var12.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 30);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test446");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    Stude.Cronograma var5 = var1.getCronograma();
    var1.setMetodoRegular();
    Stude.Cronograma var7 = var1.getCronograma();
    Stude.Disciplina var9 = var1.getDisciplina("hi!");
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test447");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var3 = var2.toString();
    var2.setCor(15);
    java.lang.String var6 = var2.getNome();
    java.lang.String var7 = var2.getNome();
    Stude.Stude var9 = new Stude.Stude("hi!");
    int var10 = var9.intervalo();
    Stude.Usuario var11 = var9.getUsuario();
    Stude.Cronograma var12 = var9.getCronograma();
    int var13 = var9.intervalo();
    java.util.HashMap var14 = var9.desempenho();
    java.util.List var15 = var9.getDisciplinas();
    int var16 = var9.tempoDeEstudo();
    var9.setMetodoAvancado();
    Stude.Usuario var18 = var9.getUsuario();
    Stude.MetodoDeEstudo var19 = var9.getMetodoDeEstudo();
    var9.setMetodoAvancado();
    Stude.Usuario var21 = var9.getUsuario();
    boolean var22 = var2.equals((java.lang.Object)var9);
    java.lang.String var23 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Metodo de estudo avancado"+ "'", var3.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Metodo de estudo avancado"+ "'", var23.equals("Metodo de estudo avancado"));

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test448");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Usuario var5 = var1.getUsuario();
    Stude.Usuario var6 = var1.getUsuario();
    Stude.Disciplina var8 = var1.getDisciplina("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test449");


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
    int var16 = var0.getIntervalo();
    int var17 = var0.getIntervalo();
    
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
    assertTrue(var16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test450");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getTempo();
    int var8 = var0.getTempo();
    int var9 = var0.getIntervalo();
    int var10 = var0.getIntervalo();
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
    assertTrue("'" + var6 + "' != '" + "Metodo de estudo avancado"+ "'", var6.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test451");


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
    int var15 = var0.getTempo();
    
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
    assertTrue(var15 == 15);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test452");


    Stude.Stude var1 = new Stude.Stude("Metodo de estudo avancado");
    int var2 = var1.intervalo();
    Stude.Cronograma var3 = var1.getCronograma();
    Stude.Disciplina var5 = var3.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var7 = var3.getDisciplina("");
    Stude.Disciplina var9 = var3.getDisciplina("Metodo de estudo avancado");
    int var10 = var3.tamanhoDisciplinas();
    
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
    assertTrue(var10 == 0);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test453");


    Stude.Avancado var0 = new Stude.Avancado();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getIntervalo();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getTempo();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    int var11 = var0.getTempo();
    int var12 = var0.getIntervalo();
    
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
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test454");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.addDisciplina("hi!", 0);
    Stude.Disciplina var6 = var1.getDisciplina("Metodo de estudo regular");
    var1.setMetodoRegular();
    var1.setMetodoAvancado();
    var1.setNomeUsuario("Metodo de estudo avancado");
    var1.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var13 = var1.desempenho();
    var1.setNomeUsuario("Metodo de estudo avancado");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test455");


    Stude.Stude var1 = new Stude.Stude("hi!");
    var1.setMetodoAvancado();
    Stude.MetodoDeEstudo var3 = var1.getMetodoDeEstudo();
    java.util.HashMap var4 = var1.desempenho();
    var1.setMetodoRegular();
    java.util.List var6 = var1.getDisciplinas();
    java.util.HashMap var7 = var1.desempenho();
    var1.addDisciplina("hi!", 0);
    Stude.Cronograma var11 = var1.getCronograma();
    Stude.Disciplina var13 = var1.getDisciplina("Metodo de estudo avancado");
    boolean var15 = var1.removeDisciplina("hi!");
    Stude.Cronograma var16 = var1.getCronograma();
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test456");


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
    Stude.Disciplina var33 = var0.getDisciplina("Metodo de estudo avancado");
    Stude.Disciplina var35 = var0.getDisciplina("hi!");
    Stude.Disciplina var38 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var38.setCor((-1));
    java.lang.String var41 = var38.getNome();
    var38.setCor((-1));
    Stude.Disciplina var46 = new Stude.Disciplina("Metodo de estudo avancado", 100);
    java.lang.String var47 = var46.toString();
    var46.setCor(15);
    java.lang.String var50 = var46.getNome();
    Stude.Cronograma var51 = new Stude.Cronograma();
    Stude.Disciplina var53 = var51.getDisciplina("Metodo de estudo regular");
    Stude.Disciplina var55 = var51.getDisciplina("");
    java.util.List var56 = var51.getDisciplinas();
    boolean var57 = var46.equals((java.lang.Object)var51);
    Stude.Disciplina var60 = new Stude.Disciplina("Metodo de estudo avancado", 1);
    java.lang.String var61 = var60.toString();
    Stude.Stude var63 = new Stude.Stude("hi!");
    var63.setMetodoAvancado();
    Stude.MetodoDeEstudo var65 = var63.getMetodoDeEstudo();
    java.util.HashMap var66 = var63.desempenho();
    var63.setMetodoRegular();
    Stude.MetodoDeEstudo var68 = var63.getMetodoDeEstudo();
    var63.setNomeUsuario("Metodo de estudo regular");
    java.util.HashMap var71 = var63.desempenho();
    boolean var72 = var60.equals((java.lang.Object)var71);
    var51.addDisciplina(var60);
    boolean var74 = var38.equals((java.lang.Object)var51);
    var38.addHorasDeEstudo(100.0d);
    java.lang.String var77 = var38.getNome();
    var0.addDisciplina(var38);
    
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
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Metodo de estudo regular"+ "'", var41.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Metodo de estudo avancado"+ "'", var47.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Metodo de estudo avancado"+ "'", var50.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "Metodo de estudo avancado"+ "'", var61.equals("Metodo de estudo avancado"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "Metodo de estudo regular"+ "'", var77.equals("Metodo de estudo regular"));

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test457");


    Stude.Disciplina var2 = new Stude.Disciplina("hi!", 5);
    double var3 = var2.getHorasEstudadas();
    var2.addHorasDeEstudo(10.0d);
    java.lang.String var6 = var2.toString();
    int var7 = var2.getCor();
    int var8 = var2.getCor();
    java.lang.String var9 = var2.toString();
    double var10 = var2.getHorasEstudadas();
    var2.setCor(30);
    
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

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test458");


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
    java.util.List var16 = var13.getDisciplinas();
    Stude.Disciplina var18 = var13.getDisciplina("Metodo de estudo regular");
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test459");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    var1.setMetodoRegular();
    var1.setMetodoRegular();
    Stude.Usuario var6 = var1.getUsuario();
    java.util.List var7 = var1.getDisciplinas();
    Stude.Disciplina var9 = var1.getDisciplina("");
    Stude.Disciplina var11 = var1.getDisciplina("Metodo de estudo avancado");
    var1.addDisciplina("hi!", 15);
    int var15 = var1.tempoDeEstudo();
    Stude.MetodoDeEstudo var16 = var1.getMetodoDeEstudo();
    int var17 = var1.intervalo();
    
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
    assertTrue(var15 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test460");


    Stude.Regular var0 = new Stude.Regular();
    int var1 = var0.getTempo();
    int var2 = var0.getTempo();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getIntervalo();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getTempo();
    int var10 = var0.getIntervalo();
    
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
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo regular"+ "'", var7.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test461");


    Stude.Stude var1 = new Stude.Stude("hi!");
    int var2 = var1.intervalo();
    Stude.Usuario var3 = var1.getUsuario();
    int var4 = var1.intervalo();
    java.util.List var5 = var1.getDisciplinas();
    Stude.Cronograma var6 = var1.getCronograma();
    int var7 = var1.tempoDeEstudo();
    Stude.Usuario var8 = var1.getUsuario();
    Stude.Usuario var9 = var1.getUsuario();
    var1.setMetodoRegular();
    java.util.HashMap var11 = var1.desempenho();
    Stude.Disciplina var13 = var1.getDisciplina("Metodo de estudo avancado");
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test462");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    var2.setCor((-1));
    int var5 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var8 = var2.getNome();
    int var9 = var2.getCor();
    var2.addHorasDeEstudo(1.0d);
    var2.addHorasDeEstudo(1.0d);
    java.lang.String var14 = var2.toString();
    java.lang.String var15 = var2.getNome();
    java.lang.String var16 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo regular"+ "'", var8.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Metodo de estudo regular"+ "'", var14.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Metodo de estudo regular"+ "'", var15.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Metodo de estudo regular"+ "'", var16.equals("Metodo de estudo regular"));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test463");


    Stude.Avancado var0 = new Stude.Avancado();
    int var1 = var0.getIntervalo();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getIntervalo();
    int var6 = var0.getTempo();
    int var7 = var0.getIntervalo();
    int var8 = var0.getTempo();
    int var9 = var0.getTempo();
    int var10 = var0.getTempo();
    int var11 = var0.getTempo();
    
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
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test464");


    Stude.Disciplina var2 = new Stude.Disciplina("Metodo de estudo regular", 5);
    int var3 = var2.getCor();
    int var4 = var2.getCor();
    java.lang.String var5 = var2.getNome();
    var2.setNome("Metodo de estudo avancado");
    java.lang.String var8 = var2.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Metodo de estudo regular"+ "'", var5.equals("Metodo de estudo regular"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Metodo de estudo avancado"+ "'", var8.equals("Metodo de estudo avancado"));

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test465");


    Stude.Usuario var1 = new Stude.Usuario("Metodo de estudo regular");
    var1.setNome("hi!");
    java.lang.String var4 = var1.getNome();
    var1.setNome("Metodo de estudo avancado");
    java.lang.String var7 = var1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Metodo de estudo avancado"+ "'", var7.equals("Metodo de estudo avancado"));

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test466");


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
    Stude.Disciplina var22 = var0.getDisciplina("Metodo de estudo regular");
    var22.setCor(100);
    var22.setCor((-1));
    java.lang.String var27 = var22.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var22.addHorasDeEstudo(0.0d);
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Metodo de estudo regular"+ "'", var27.equals("Metodo de estudo regular"));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test467");


    Stude.Stude var1 = new Stude.Stude("hi!");
    Stude.Cronograma var2 = var1.getCronograma();
    Stude.Cronograma var3 = var1.getCronograma();
    java.util.List var4 = var3.getDisciplinas();
    Stude.Disciplina var7 = new Stude.Disciplina("hi!", 30);
    double var8 = var7.getHorasEstudadas();
    int var9 = var7.getCor();
    var7.setNome("Metodo de estudo avancado");
    var3.addDisciplina(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);

  }

}
