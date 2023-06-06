package com.labs.lg.pentagon.common.domain.event;


public interface DomainEvent<T> {
  void fire();
}
