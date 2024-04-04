package org.example;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat; /*Importación estática
del método assertThat de la clase Assertions*/

public class MoneyTest {
    @Test
    void constructorShouldSetAmountAndCurrency() {/*Método de prueba*/

        Money money = new Money(10,"USD");

        //EL SUT se pone a prueba verificando los métodos estáticos AssertThat
        assertThat(money.getAmount()).isEqualTo(10);
        assertThat(money.getCurrency()).isEqualTo("USD");

    }

}