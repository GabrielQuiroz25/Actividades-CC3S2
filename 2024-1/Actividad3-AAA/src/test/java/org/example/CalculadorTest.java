package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadorTest {

    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }

    @Test
    public void testRestar_PositiveNumbers_ShouldReturnPositiveNumber() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 30;
        int numeroB = 2;

        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(28, resultado, "30-2 deberia ser 28");
    }

    @Test
    public void testMultiplicarDosNumeros(){
        //Arrange
        Calculador calculador = new Calculador();
        int numeroA = 4;
        int numeroB= 20;

        // Act
        int resultado = calculador.multiplicacion(numeroA,numeroB);

        //Assert
        assertEquals(80, resultado, "4*20 deberia ser 80");

    }

}