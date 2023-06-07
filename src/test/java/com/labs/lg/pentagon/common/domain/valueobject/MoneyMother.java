package com.labs.lg.pentagon.common.domain.valueobject;

import org.junit.jupiter.params.provider.Arguments;

import java.math.BigDecimal;
import java.util.stream.Stream;

@SuppressWarnings("all")
class MoneyMother {
    public static Stream<Arguments> provideMoneyForIsGreaterThanZeroOperation() {
        return Stream.of(Arguments.of(
                        new Money(BigDecimal.ZERO),
                        Boolean.FALSE
                ), Arguments.of(
                        new Money(new BigDecimal("-1.23333")),
                        Boolean.FALSE
                ), Arguments.of(
                        new Money(BigDecimal.ONE),
                        Boolean.TRUE
                )
        );
    }

    public static Stream<Arguments> provideMoneyForIsGreaterThanOperation() {
        return Stream.of(Arguments.of(
                        new Money(BigDecimal.ZERO),
                        new Money(new BigDecimal("1.23333")),
                        Boolean.FALSE
                ), Arguments.of(
                        new Money(BigDecimal.ONE),
                        new Money(new BigDecimal("1.23333")),
                        Boolean.FALSE
                ), Arguments.of(
                        new Money(new BigDecimal("1.6666")),
                        new Money(new BigDecimal("2.67")),
                        Boolean.FALSE
                ), Arguments.of(
                        new Money(new BigDecimal("1.5555")),
                        new Money(new BigDecimal("1.5556")),
                        Boolean.FALSE
                ), Arguments.of(
                        new Money(new BigDecimal("2.56")),
                        new Money(new BigDecimal("1.5556")),
                        Boolean.TRUE
                ), Arguments.of(
                        new Money(new BigDecimal("1.5555")),
                        new Money(new BigDecimal("1.55")),
                        Boolean.TRUE
                )
        );
    }

    public static Stream<Arguments> provideMoneyForAddOperation() {
        return Stream.of(Arguments.of(
                        new Money(BigDecimal.ZERO),
                        new Money(new BigDecimal("1.23333")),
                        new Money(new BigDecimal("1.23"))
                ), Arguments.of(
                        new Money(BigDecimal.ONE),
                        new Money(new BigDecimal("1.23333")),
                        new Money(new BigDecimal("2.23"))
                ), Arguments.of(
                        new Money(BigDecimal.ONE),
                        new Money(new BigDecimal("1.6666")),
                        new Money(new BigDecimal("2.67"))
                ), Arguments.of(
                        new Money(BigDecimal.ONE),
                        new Money(new BigDecimal("1.555")),
                        new Money(new BigDecimal("2.56"))
                ), Arguments.of(
                        new Money(BigDecimal.ONE),
                        new Money(new BigDecimal("1.5556")),
                        new Money(new BigDecimal("2.56"))
                )
        );
    }
    public static Stream<Arguments> provideMoneyForSubtractOperation() {
        return Stream.of(Arguments.of(
                        new Money(BigDecimal.ZERO),
                        new Money(new BigDecimal("1.23333")),
                        new Money(new BigDecimal("-1.23"))
                ),Arguments.of(
                        new Money(BigDecimal.ONE),
                        new Money(BigDecimal.ONE),
                        new Money(BigDecimal.ZERO.setScale(2))
                ),
                Arguments.of(
                        new Money(BigDecimal.TEN),
                        new Money(BigDecimal.ONE),
                        new Money(new BigDecimal("9.00"))
                )
        );
    }
    public static Stream<Arguments> provideMoneyForMultiplyOperation() {
        return Stream.of(Arguments.of(
                        new Money(BigDecimal.ZERO),
                        0,
                        new Money(BigDecimal.ZERO.setScale(2))
                ),
                Arguments.of(
                        new Money(BigDecimal.TEN),
                        1,
                        new Money(BigDecimal.TEN.setScale(2))
                )
        );
    }
}
