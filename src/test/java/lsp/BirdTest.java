package lsp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BirdTest {

    @Test
    void should_bird_fly(){
        Bird bird = new Penguin();
        Assertions.assertDoesNotThrow(bird::fly);
    }
}
