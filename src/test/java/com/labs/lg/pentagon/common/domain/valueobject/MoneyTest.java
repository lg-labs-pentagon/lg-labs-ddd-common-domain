package com.labs.lg.pentagon.common.domain.valueobject;
/*
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyTest {

  @ParameterizedTest()
  @MethodSource("com.labs.lg.pentagon.common.domain.valueobject.MoneyMother#provideMoneyForIsGreaterThanZeroOperation")
  void it_should_compare_value_with_zero(Money current, Boolean resultExpected) {
    final var resultReceived = current.isGreaterThanZero();
    assertEquals(resultExpected, resultReceived);
    assertEquals("com.labs.lg.pentagon.common.domain.valueobject", getClass().getPackageName());
  }

  @ParameterizedTest()
  @MethodSource("com.labs.lg.pentagon.common.domain.valueobject.MoneyMother#provideMoneyForIsGreaterThanOperation")
  void it_should_compare_between_two_money(Money first, Money second, Boolean resultExpected) {
    final var resultReceived = first.isGreaterThan(second);
    assertEquals(resultExpected, resultReceived);
  }

  @ParameterizedTest()
  @MethodSource("com.labs.lg.pentagon.common.domain.valueobject.MoneyMother#provideMoneyForAddOperation")
  void it_should_add_money_successful(Money current, Money other, Money resultExpected) {
    final var resultReceived = current.add(other);
    assertEquals(resultExpected, resultReceived);
  }

  @ParameterizedTest()
  @MethodSource("com.labs.lg.pentagon.common.domain.valueobject.MoneyMother#provideMoneyForSubtractOperation")
  void it_should_subtract_money_successful(Money current, Money subtrahend, Money resultExpected) {
    final var resultReceived = current.subtract(subtrahend);
    assertEquals(resultExpected, resultReceived);
  }

  @ParameterizedTest()
  @MethodSource("com.labs.lg.pentagon.common.domain.valueobject.MoneyMother#provideMoneyForMultiplyOperation")
  void it_should_multiply_money_successful(Money current, int multiplier, Money resultExpected) {
    final var resultReceived = current.multiply(multiplier);
    assertEquals(resultExpected, resultReceived);
  }

}*/