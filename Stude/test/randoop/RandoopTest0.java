package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Usuario: hi!\r\nData de ingresso: 25/04/2016"+ "'", var3.equals("Usuario: hi!\r\nData de ingresso: 25/04/2016"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    boolean var4 = var1.isStringValida("hi!");
    var1.setNome("Usuario: hi!\r\nData de ingresso: 25/04/2016");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    boolean var4 = var1.isStringValida("hi!");
    boolean var6 = var1.isStringValida("");
    java.lang.String var7 = var1.getNome();
    java.lang.String var8 = var1.getNome();
    java.lang.String var9 = var1.getDataDeIngresso();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "25/04/2016"+ "'", var9.equals("25/04/2016"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    boolean var4 = var1.isStringValida("hi!");
    java.lang.String var5 = var1.toString();
    boolean var7 = var1.isStringValida("Usuario: hi!\r\nData de ingresso: 25/04/2016");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Usuario: hi!\r\nData de ingresso: 25/04/2016"+ "'", var5.equals("Usuario: hi!\r\nData de ingresso: 25/04/2016"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      models.Usuario var1 = new models.Usuario("");
      fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    boolean var4 = var1.isStringValida("hi!");
    java.lang.String var5 = var1.getDataDeIngresso();
    boolean var7 = var1.isStringValida("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "25/04/2016"+ "'", var5.equals("25/04/2016"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.toString();
    var1.setNome("Usuario: hi!\r\nData de ingresso: 25/04/2016");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Usuario: hi!\r\nData de ingresso: 25/04/2016"+ "'", var2.equals("Usuario: hi!\r\nData de ingresso: 25/04/2016"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    models.Usuario var1 = new models.Usuario("Usuario: hi!\r\nData de ingresso: 25/04/2016");
    var1.setNome("25/04/2016");

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    models.Usuario var1 = new models.Usuario("hi!");
    java.lang.String var2 = var1.getNome();
    boolean var4 = var1.isStringValida("hi!");
    java.lang.String var5 = var1.getDataDeIngresso();
    java.lang.String var6 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "25/04/2016"+ "'", var5.equals("25/04/2016"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Usuario: hi!\r\nData de ingresso: 25/04/2016"+ "'", var6.equals("Usuario: hi!\r\nData de ingresso: 25/04/2016"));

  }

}
