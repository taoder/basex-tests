package org.basex.test.qt3ts.prod;

import org.basex.tests.bxapi.XQuery;
import org.basex.test.qt3ts.QT3TestSet;

/**
 * Tests for the SequenceType production.
 *
 * @author BaseX Team 2005-12, BSD License
 * @author Leo Woerteler
 */
@SuppressWarnings("all")
public class ProdSequenceType extends QT3TestSet {

  /**
   *  Evaluate simple sequence type using instance of and integers. .
   */
  @org.junit.Test
  public void sequenceType1() {
    final XQuery query = new XQuery(
      "(1,2,3) instance of xs:integer*",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluate simple sequence type using castable and integer. uses "integer?" on sequence of two integers. .
   */
  @org.junit.Test
  public void sequenceType10() {
    final XQuery query = new XQuery(
      "(1,2) castable as xs:integer?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   *  Evaluate simple sequence type using castable and double. uses "double?" on sequence of one double. .
   */
  @org.junit.Test
  public void sequenceType11() {
    final XQuery query = new XQuery(
      "(1E3) castable as xs:double?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluate simple sequence type using castable and double. uses "double?" on sequence of two doubles. .
   */
  @org.junit.Test
  public void sequenceType12() {
    final XQuery query = new XQuery(
      "(1E3,2E3) castable as xs:double?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   *  Evaluate simple sequence type using castable and decimal. uses "decimal?" on sequence of one decimal. .
   */
  @org.junit.Test
  public void sequenceType13() {
    final XQuery query = new XQuery(
      "(1.2) castable as xs:decimal?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluate simple sequence type using castable and decimal. uses "decimal?" on sequence of two decimals. .
   */
  @org.junit.Test
  public void sequenceType14() {
    final XQuery query = new XQuery(
      "(1.2,2.1) castable as xs:decimal?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   *  Evaluate simple sequence type using castable and string. uses "string?" on sequence of one string. .
   */
  @org.junit.Test
  public void sequenceType15() {
    final XQuery query = new XQuery(
      "(\"abc\") castable as xs:string?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluate simple sequence type using castable and string. uses "string?" on sequence of two strings. .
   */
  @org.junit.Test
  public void sequenceType16() {
    final XQuery query = new XQuery(
      "(\"abc\",\"def\") castable as xs:string?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   *  Evaluate simple sequence type using castable and integer. uses "integer?" on sequence of one string. .
   */
  @org.junit.Test
  public void sequenceType17() {
    final XQuery query = new XQuery(
      "(\"abc\") castable as xs:integer?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   *  Evaluate simple sequence type using castable and integer. uses "integer?" on sequence of two strings. .
   */
  @org.junit.Test
  public void sequenceType18() {
    final XQuery query = new XQuery(
      "(\"abc\",\"def\") castable as xs:integer?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   *  Evaluate simple sequence type using instance and boolean. uses "boolean*" on sequence of two booleans. .
   */
  @org.junit.Test
  public void sequenceType19() {
    final XQuery query = new XQuery(
      "(fn:true(),fn:false()) instance of xs:boolean*",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluate simple sequence type using instance of and doubles. .
   */
  @org.junit.Test
  public void sequenceType2() {
    final XQuery query = new XQuery(
      "(1E3,2E3,3E3) instance of xs:double*",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluate simple sequence type using instance and boolean. uses "boolean?" on sequence of two booleans. .
   */
  @org.junit.Test
  public void sequenceType20() {
    final XQuery query = new XQuery(
      "(fn:true(),fn:false()) instance of xs:boolean?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   *  Evaluate simple sequence type using instance and boolean. uses "boolean+" on sequence of two booleans. .
   */
  @org.junit.Test
  public void sequenceType21() {
    final XQuery query = new XQuery(
      "(fn:true(),fn:false()) instance of xs:boolean+",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluate simple sequence type using instance of and decimal. .
   */
  @org.junit.Test
  public void sequenceType3() {
    final XQuery query = new XQuery(
      "(1.1,3.2,4.5) instance of xs:decimal*",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluate simple sequence type using instance of and string. .
   */
  @org.junit.Test
  public void sequenceType4() {
    final XQuery query = new XQuery(
      "(\"ab\",\"cde\",\"fgh\") instance of xs:string*",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluate simple sequence type using instance of and strings. uses "integer*" on string sequence. .
   */
  @org.junit.Test
  public void sequenceType5() {
    final XQuery query = new XQuery(
      "(\"ab\",\"cde\",\"fgh\") instance of xs:integer*",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   *  Evaluate simple sequence type using instance of and string. uses "integer?". .
   */
  @org.junit.Test
  public void sequenceType6() {
    final XQuery query = new XQuery(
      "(1) instance of xs:integer?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluate simple sequence type using instance of and integer. uses "integer?". .
   */
  @org.junit.Test
  public void sequenceType7() {
    final XQuery query = new XQuery(
      "(1,2) instance of xs:integer?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(false)
    );
  }

  /**
   *  Evaluate simple sequence type using instance of and integer. uses "integer+". .
   */
  @org.junit.Test
  public void sequenceType8() {
    final XQuery query = new XQuery(
      "(1,2) instance of xs:integer+",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }

  /**
   *  Evaluate simple sequence type using castable and integer. uses "integer?". .
   */
  @org.junit.Test
  public void sequenceType9() {
    final XQuery query = new XQuery(
      "(2) castable as xs:integer?",
      ctx);

    final QT3Result res = result(query);
    result = res;
    test(
      assertBoolean(true)
    );
  }
}
