import org.example.Polynomial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class test {
    @Test
    @DisplayName("3 + 3 == 6")
    void t5() {
        assertThat(new Polynomial("3 + 3").calc()).isEqualTo(6);
    }

    @Test
    @DisplayName("13 + 2 == 15")
    void t6() {
        assertThat(new Polynomial("13 + 2").calc()).isEqualTo(15);
    }

    @Test
    @DisplayName("3 * 3 + 3 == 12")
    void t7() {
        assertThat(new Polynomial("3 * 3 + 3").calc()).isEqualTo(12);
    }

    @Test
    @DisplayName("(3 + 3) * 3 == 18")
    void t8() {
        assertThat(new Polynomial("(3 + 3) * 3").calc()).isEqualTo(18);
    }
}
