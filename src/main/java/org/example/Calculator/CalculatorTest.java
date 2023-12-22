package org.example.Calculator;
import static org.assertj.core.api.Assertions.*;
public class CalculatorTest {

    /**
     * Задание 1. ** В классе Calculator создайте метод calculateDiscount,
     * который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
     * Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
     * Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
     * Не забудьте написать тесты для проверки этого поведения.
     */

    public static void main(String[] args) {
        assertThat(Calculator.calculatingDiscount(100,10)).isEqualTo(90);
        assertThat(Calculator.calculatingDiscount(1111,99)).isEqualTo(11);
        assertThat(Calculator.calculatingDiscount(0.1,99)).isEqualTo(0);

        assertThatThrownBy(() ->Calculator.calculatingDiscount(0,-1))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() ->Calculator.calculatingDiscount(-1,0))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() ->Calculator.calculatingDiscount(0,101))
                .isInstanceOf(IllegalArgumentException.class);
    }
}