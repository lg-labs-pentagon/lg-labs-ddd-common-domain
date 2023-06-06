package com.labs.lg.pentagon.common.domain.event.publisher;

import com.labs.lg.pentagon.common.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
  void publish(T domainEvent);
}
