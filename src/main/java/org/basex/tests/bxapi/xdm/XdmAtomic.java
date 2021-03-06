package org.basex.tests.bxapi.xdm;

import org.basex.query.QueryException;
import org.basex.query.item.Item;
import org.basex.query.item.SeqType;
import org.basex.tests.bxapi.*;
import org.basex.util.Token;

/**
 * Wrapper for representing XQuery items.
 */
final class XdmAtomic extends XdmItem {
  /** Wrapped item. */
  private final Item item;

  /**
   * Constructor.
   * @param it item
   */
  XdmAtomic(final Item it) {
    item = it;
  }

  @Override
  public boolean getBoolean() {
    try {
      return item.bool(null);
    } catch(final QueryException ex) {
      throw new XQueryException(ex);
    }
  }

  @Override
  public String getString() {
    try {
      return Token.string(item.string(null));
    } catch(final QueryException ex) {
      throw new XQueryException(ex);
    }
  }

  @Override
  public SeqType getType() {
    return item.type();
  }

  @Override
  public String toString() {
    return item.toString();
  }

  // PACKAGE PROTECTED METHODS ================================================

  @Override
  public Item internal() {
    return item;
  }
}
