package org.basex.test.qt3ts.op;

import org.basex.tests.bxapi.XQuery;
import org.basex.test.qt3ts.QT3TestSet;

/**
 * Tests for the dateTime-equal() function.
 *
 * @author BaseX Team 2005-12, BSD License
 * @author Leo Woerteler
 */
@SuppressWarnings("all")
public class OpDateTimeEqual extends QT3TestSet {

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-1                                  
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: Simple test of 'eq' for xs:dateTime, returning positive. 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ1() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2004-08-12T23:01:04.12\") eq xs:dateTime(\"2004-08-12T23:01:04.12\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-10                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'ne' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ10() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T12:12:23\") ne xs:date(\"1999-12-04\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-11                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'le' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ11() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T12:12:23\") le xs:date(\"1999-12-04\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-12                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'lt' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ12() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T12:12:23\") lt xs:date(\"1999-12-04\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-13                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'ge' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ13() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T12:12:23\") ge xs:date(\"1999-12-04\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-14                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'gt' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ14() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T12:12:23\") gt xs:date(\"1999-12-04\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-15                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'eq' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ15() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-12-04\") eq xs:dateTime(\"1999-12-04T12:12:23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-16                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'ne' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ16() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-12-04\") ne xs:dateTime(\"1999-12-04T12:12:23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-17                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'le' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ17() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-12-04\") le xs:dateTime(\"1999-12-04T12:12:23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-18                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'lt' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ18() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-12-04\") lt xs:dateTime(\"1999-12-04T12:12:23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-19                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'ge' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ19() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-12-04\") ge xs:dateTime(\"1999-12-04T12:12:23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-2                                  
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: Simple test of 'eq' for xs:dateTime.         
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ2() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2004-08-12T23:01:04.12\") eq xs:dateTime(\"2004-08-12T23:01:04.13\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-20                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'gt' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ20() {
    final XQuery query = new XQuery(
      "xs:date(\"1999-12-04\") gt xs:dateTime(\"1999-12-04T12:12:23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-21                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'eq' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ21() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T12:12:23\") eq xs:time(\"22:12:04\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-22                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'ne' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ22() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T12:12:23\") ne xs:time(\"22:12:04\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-23                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'le' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ23() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T12:12:23\") le xs:time(\"22:12:04\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-24                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'lt' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ24() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T12:12:23\") lt xs:time(\"22:12:04\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-25                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'ge' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ25() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T12:12:23\") ge xs:time(\"22:12:04\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-26                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'gt' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ26() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T12:12:23\") gt xs:time(\"22:12:04\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-27                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'eq' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ27() {
    final XQuery query = new XQuery(
      "xs:time(\"22:12:04\") eq xs:dateTime(\"1999-12-04T12:12:23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-28                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'ne' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ28() {
    final XQuery query = new XQuery(
      "xs:time(\"22:12:04\") ne xs:dateTime(\"1999-12-04T12:12:23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-29                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'le' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ29() {
    final XQuery query = new XQuery(
      "xs:time(\"22:12:04\") le xs:dateTime(\"1999-12-04T12:12:23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-3                                  
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: Simple test of 'ne' for xs:dateTime.         
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ3() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2004-08-12T23:01:05.12\") ne xs:dateTime(\"2004-08-12T23:01:04.12\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-30                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'lt' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ30() {
    final XQuery query = new XQuery(
      "xs:time(\"22:12:04\") lt xs:dateTime(\"1999-12-04T12:12:23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-31                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'ge' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ31() {
    final XQuery query = new XQuery(
      "xs:time(\"22:12:04\") ge xs:dateTime(\"1999-12-04T12:12:23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-32                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'gt' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ32() {
    final XQuery query = new XQuery(
      "xs:time(\"22:12:04\") gt xs:dateTime(\"1999-12-04T12:12:23\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-4                                  
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: Simple test of 'ne' for xs:dateTime.         
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ4() {
    final XQuery query = new XQuery(
      "not(xs:dateTime(\"2004-07-12T23:01:04.12\") ne xs:dateTime(\"2004-07-12T23:01:04.12\"))",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-5                                  
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: Test that zone offset -00:00 is equal to Z, in xs:dateTime. 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ5() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T16:00:12.345-00:00\") eq xs:dateTime(\"1999-12-04T16:00:12.345Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-6                                  
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: Test that zone offset +00:00 is equal to Z, in xs:dateTime. 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ6() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T16:00:12.345+00:00\") eq xs:dateTime(\"1999-12-04T16:00:12.345Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-7                                  
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: Test that zone offset Z is equal to Z, in xs:dateTime. 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ7() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T16:00:12.345Z\") eq xs:dateTime(\"1999-12-04T16:00:12.345Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-8                                  
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: Test that zone offset -00:00 is equal to +00:00, in xs:dateTime. 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ8() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T16:00:12.345-00:00\") eq xs:dateTime(\"1999-12-04T16:00:12.345+00:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K-DateTimeEQ-9                                  
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: The operator 'eq' is not available between xs:dateTime and xs:date . 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void kDateTimeEQ9() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1999-12-04T12:12:23\") eq xs:date(\"1999-12-04\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      error("XPTY0004")
    );
  }

  /**
   * 
   * *******************************************************
   *  Test: K2-DateTimeEQ-1                                 
   *  Written by: Frans Englich                             
   *  Date: 2007-11-22T11:31:21+01:00                       
   *  Purpose: Basic negative equalness test for xs:dateTime. 
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void k2DateTimeEQ1() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2002-03-06T00:00:00Z\") ne xs:dateTime(\"2002-03-05T00:00:00+03:00\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-1                          
   * Written By: Carmelo Montanez                            
   * Date: Tue Apr 12 16:29:06 GMT-05:00 2005                
   * Purpose: Evaluates The "op:dateTime-equal" operator    
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(lower bound)                       
   * $arg2 = xs:dateTime(lower bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args1() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1970-01-01T00:00:00Z\") eq xs:dateTime(\"1970-01-01T00:00:00Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-10                         
   * Written By: Carmelo Montanez                            
   * Date: Tue Apr 12 16:29:06 GMT-05:00 2005                
   * Purpose: Evaluates The "op:dateTime-equal" operator    
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(lower bound)                       
   * $arg2 = xs:dateTime(upper bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args10() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1970-01-01T00:00:00Z\") ne xs:dateTime(\"2030-12-31T23:59:59Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-11                        
   * Written By: Carmelo Montanez                           
   * Date: June 3, 2005                                     
   * Purpose: Evaluates The "op:dateTime-equal" operator (le) 
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(lower bound)                       
   * $arg2 = xs:dateTime(lower bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args11() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1970-01-01T00:00:00Z\") le xs:dateTime(\"1970-01-01T00:00:00Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-12                        
   * Written By: Carmelo Montanez                           
   * Date: June 3, 2005                                     
   * Purpose: Evaluates The "op:dateTime-equal" operator (le)
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(mid range)                         
   * $arg2 = xs:dateTime(lower bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args12() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1996-04-07T01:40:52Z\") le xs:dateTime(\"1970-01-01T00:00:00Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-13                        
   * Written By: Carmelo Montanez                           
   * Date: June 3, 2005                                     
   * Purpose: Evaluates The "op:dateTime-equal" operator (le) 
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(upper bound)                       
   * $arg2 = xs:dateTime(lower bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args13() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2030-12-31T23:59:59Z\") le xs:dateTime(\"1970-01-01T00:00:00Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-14                        
   * Written By: Carmelo Montanez                           
   * Date: June 3, 2005                                     
   * Purpose: Evaluates The "op:dateTime-equal" operator (le) 
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(lower bound)                       
   * $arg2 = xs:dateTime(mid range)                         
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args14() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1970-01-01T00:00:00Z\") le xs:dateTime(\"1996-04-07T01:40:52Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-15                        
   * Written By: Carmelo Montanez                           
   * Date: June 3, 2005                                     
   * Purpose: Evaluates The "op:dateTime-equal" operator (le)
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(lower bound)                       
   * $arg2 = xs:dateTime(upper bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args15() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1970-01-01T00:00:00Z\") le xs:dateTime(\"2030-12-31T23:59:59Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-16                        
   * Written By: Carmelo Montanez                           
   * Date: June 3, 2005                                     
   * Purpose: Evaluates The "op:dateTime-equal" operator (ge) 
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(lower bound)                       
   * $arg2 = xs:dateTime(lower bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args16() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1970-01-01T00:00:00Z\") ge xs:dateTime(\"1970-01-01T00:00:00Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-17                        
   * Written By: Carmelo Montanez                           
   * Date: June 3, 2005                                     
   * Purpose: Evaluates The "op:dateTime-equal" operator (ge) 
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(mid range)                         
   * $arg2 = xs:dateTime(lower bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args17() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1996-04-07T01:40:52Z\") ge xs:dateTime(\"1970-01-01T00:00:00Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-18                        
   * Written By: Carmelo Montanez                           
   * Date: June 3, 2005                                     
   * Purpose: Evaluates The "op:dateTime-equal" operator (ge) 
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(upper bound)                       
   * $arg2 = xs:dateTime(lower bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args18() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2030-12-31T23:59:59Z\") ge xs:dateTime(\"1970-01-01T00:00:00Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-19                        
   * Written By: Carmelo Montanez                           
   * Date: June 3, 2005                                     
   * Purpose: Evaluates The "op:dateTime-equal" operator (ge) 
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(lower bound)                       
   * $arg2 = xs:dateTime(mid range)                         
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args19() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1970-01-01T00:00:00Z\") ge xs:dateTime(\"1996-04-07T01:40:52Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-2                          
   * Written By: Carmelo Montanez                            
   * Date: Tue Apr 12 16:29:06 GMT-05:00 2005                
   * Purpose: Evaluates The "op:dateTime-equal" operator    
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(mid range)                         
   * $arg2 = xs:dateTime(lower bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args2() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1996-04-07T01:40:52Z\") eq xs:dateTime(\"1970-01-01T00:00:00Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-20                        
   * Written By: Carmelo Montanez                           
   * Date: June 3, 2005                                     
   * Purpose: Evaluates The "op:dateTime-equal" operator (ge) 
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(lower bound)                       
   * $arg2 = xs:dateTime(upper bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args20() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1970-01-01T00:00:00Z\") ge xs:dateTime(\"2030-12-31T23:59:59Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-3                          
   * Written By: Carmelo Montanez                            
   * Date: Tue Apr 12 16:29:06 GMT-05:00 2005                
   * Purpose: Evaluates The "op:dateTime-equal" operator    
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(upper bound)                       
   * $arg2 = xs:dateTime(lower bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args3() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2030-12-31T23:59:59Z\") eq xs:dateTime(\"1970-01-01T00:00:00Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-4                          
   * Written By: Carmelo Montanez                            
   * Date: Tue Apr 12 16:29:06 GMT-05:00 2005                
   * Purpose: Evaluates The "op:dateTime-equal" operator    
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(lower bound)                       
   * $arg2 = xs:dateTime(mid range)                         
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args4() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1970-01-01T00:00:00Z\") eq xs:dateTime(\"1996-04-07T01:40:52Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-5                          
   * Written By: Carmelo Montanez                            
   * Date: Tue Apr 12 16:29:06 GMT-05:00 2005                
   * Purpose: Evaluates The "op:dateTime-equal" operator    
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(lower bound)                       
   * $arg2 = xs:dateTime(upper bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args5() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1970-01-01T00:00:00Z\") eq xs:dateTime(\"2030-12-31T23:59:59Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-6                          
   * Written By: Carmelo Montanez                            
   * Date: Tue Apr 12 16:29:06 GMT-05:00 2005                
   * Purpose: Evaluates The "op:dateTime-equal" operator    
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(lower bound)                       
   * $arg2 = xs:dateTime(lower bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args6() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1970-01-01T00:00:00Z\") ne xs:dateTime(\"1970-01-01T00:00:00Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-7                          
   * Written By: Carmelo Montanez                            
   * Date: Tue Apr 12 16:29:06 GMT-05:00 2005                
   * Purpose: Evaluates The "op:dateTime-equal" operator    
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(mid range)                         
   * $arg2 = xs:dateTime(lower bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args7() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1996-04-07T01:40:52Z\") ne xs:dateTime(\"1970-01-01T00:00:00Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-8                          
   * Written By: Carmelo Montanez                            
   * Date: Tue Apr 12 16:29:06 GMT-05:00 2005                
   * Purpose: Evaluates The "op:dateTime-equal" operator    
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(upper bound)                       
   * $arg2 = xs:dateTime(lower bound)                       
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args8() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"2030-12-31T23:59:59Z\") ne xs:dateTime(\"1970-01-01T00:00:00Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   * 
   * *******************************************************
   * Test: op-dateTime-equal2args-9                          
   * Written By: Carmelo Montanez                            
   * Date: Tue Apr 12 16:29:06 GMT-05:00 2005                
   * Purpose: Evaluates The "op:dateTime-equal" operator    
   *  with the arguments set as follows:                    
   * $arg1 = xs:dateTime(lower bound)                       
   * $arg2 = xs:dateTime(mid range)                         
   * *******************************************************
   * .
   */
  @org.junit.Test
  public void opDateTimeEqual2args9() {
    final XQuery query = new XQuery(
      "xs:dateTime(\"1970-01-01T00:00:00Z\") ne xs:dateTime(\"1996-04-07T01:40:52Z\")",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }
}
