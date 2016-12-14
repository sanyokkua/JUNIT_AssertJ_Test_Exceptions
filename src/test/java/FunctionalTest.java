import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.assertEquals;

public class FunctionalTest {

    @Test
    public void testSumForBoundaryValues() {
        //test min boundary
        assertThatThrownBy(() -> new Sum().sum(-1, -1))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Sum().sum(-1, 0))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Sum().sum(0, -1))
                .isInstanceOf(IllegalArgumentException.class);
        //test max boundary
        assertThatThrownBy(() -> new Sum().sum(11, 11))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Sum().sum(11, 10))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Sum().sum(10, 11))
                .isInstanceOf(IllegalArgumentException.class);
        //test correct values
        assertEquals(new Sum().sum(0, 0), 0);
        assertEquals(new Sum().sum(10, 10), 20);
        assertEquals(new Sum().sum(5, 6), 11);
    }
}
