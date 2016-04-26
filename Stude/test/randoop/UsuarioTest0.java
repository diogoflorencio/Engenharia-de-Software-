package randoop;

import junit.framework.*;

public class UsuarioTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test1");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      models.Usuario var1 = new models.Usuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test2");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNome("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test3");


    models.Usuario var1 = new models.Usuario("25/04/2016");

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test4");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    var1.setNome("hi!");
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Usuario: hi!\r\nData de ingresso: 25/04/2016"+ "'", var5.equals("Usuario: hi!\r\nData de ingresso: 25/04/2016"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test5");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Usuario: hi!\r\nData de ingresso: 25/04/2016"+ "'", var2.equals("Usuario: hi!\r\nData de ingresso: 25/04/2016"));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test6");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    var1.setNome("hi!");
    java.lang.String var5 = var1.getNome();
    java.lang.String var6 = var1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test7");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    var1.setNome("hi!");
    java.lang.String var5 = var1.getNome();
    boolean var7 = var1.equals((java.lang.Object)false);
    java.lang.String var8 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Usuario: hi!\r\nData de ingresso: 25/04/2016"+ "'", var8.equals("Usuario: hi!\r\nData de ingresso: 25/04/2016"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test8");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    var1.setNome("hi!");
    java.lang.String var5 = var1.getNome();
    boolean var7 = var1.equals((java.lang.Object)false);
    boolean var9 = var1.isStringValida("Usuario: hi!\r\nData de ingresso: 25/04/2016");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test9");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getDataDeIngresso();
    java.lang.String var3 = var1.getDataDeIngresso();
    java.lang.String var4 = var1.getDataDeIngresso();
    var1.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "25/04/2016"+ "'", var2.equals("25/04/2016"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "25/04/2016"+ "'", var3.equals("25/04/2016"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "25/04/2016"+ "'", var4.equals("25/04/2016"));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test10");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getDataDeIngresso();
    java.lang.String var3 = var1.getDataDeIngresso();
    java.lang.String var4 = var1.getNome();
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "25/04/2016"+ "'", var2.equals("25/04/2016"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "25/04/2016"+ "'", var3.equals("25/04/2016"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Usuario: hi!\r\nData de ingresso: 25/04/2016"+ "'", var5.equals("Usuario: hi!\r\nData de ingresso: 25/04/2016"));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test11");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getDataDeIngresso();
    java.lang.String var3 = var1.getNome();
    java.lang.String var4 = var1.getDataDeIngresso();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "25/04/2016"+ "'", var2.equals("25/04/2016"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "25/04/2016"+ "'", var4.equals("25/04/2016"));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test12");


    models.Usuario var1 = new models.Usuario("hi!");
    boolean var3 = var1.equals((java.lang.Object)(short)100);
    java.lang.String var4 = var1.getDataDeIngresso();
    java.lang.String var5 = var1.getDataDeIngresso();
    java.lang.String var6 = var1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "25/04/2016"+ "'", var4.equals("25/04/2016"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "25/04/2016"+ "'", var5.equals("25/04/2016"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test13");


    models.Usuario var1 = new models.Usuario("hi!");
    boolean var3 = var1.equals((java.lang.Object)(short)100);
    java.lang.String var4 = var1.getDataDeIngresso();
    java.lang.String var5 = var1.getDataDeIngresso();
    java.lang.String var6 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "25/04/2016"+ "'", var4.equals("25/04/2016"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "25/04/2016"+ "'", var5.equals("25/04/2016"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Usuario: hi!\r\nData de ingresso: 25/04/2016"+ "'", var6.equals("Usuario: hi!\r\nData de ingresso: 25/04/2016"));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nUsuarioTest0.test14");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    var1.setNome("hi!");
    var1.setNome("25/04/2016");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

}
