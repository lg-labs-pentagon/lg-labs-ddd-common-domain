package com.labs.lg.pentagon.common.domain.event;

/**
 * The objective is disabled fire() method,
 * It will be used in the last step SAGA pattern, so, is unnecessary producer more events...
 * remember only, in the final step of SAGA.
 * <p>
 * It will use the singleton pattern
 */
public final  class EmptyEvent implements DomainEvent<Void>{

  public static final EmptyEvent INSTANCE = new EmptyEvent();

  private EmptyEvent() {
  }

  @Override
  public void fire() {

  }
}
