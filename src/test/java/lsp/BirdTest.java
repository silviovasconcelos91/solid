package lsp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BirdTest {

    @Test
    void should_bird_fly(){
        Bird bird = new Sparrow();
        Assertions.assertEquals("Sparrow sound", bird.makeSound());
    }
}
