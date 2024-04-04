package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ClientTest {
    private Address address = new Address("street A");
    private Address secondAddress = new Address("street B");
    private Client client;
    @BeforeEach
    void setUp(){ //Método que se ejecuta antes de la prueba
        client = new Client();
    }
    @Test
    void afterCreationShouldHaveAddress(){//Segudno metodo en ejecutarse y vuelve a SetUp
    }

    @Test
    void shouldAllowToAddAddress(){ // tercer método y vuelve a SetUp
        client.addAddress(address);

    }

    @Test
    void shouldAllowToAddManyAddress(){ // cuarto método y vuelve a SetUp
        client.addAddress(address);
        client.addAddress(secondAddress);
    }

}
