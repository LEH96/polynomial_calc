import org.example.Polynomial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class test {
    @Test
    @DisplayName("3 + 3 == 6")
    void t1() {
        assertThat(Polynomial.calc("3 + 3")).isEqualTo(6);
    }

    @Test
    @DisplayName("13 + 2 == 15")
    void t2() {
        assertThat(Polynomial.calc("13 + 2")).isEqualTo(15);
    }

    @Test
    @DisplayName("3 * 3 == 9")
    void t3() {
        assertThat(Polynomial.calc("3 * 3")).isEqualTo(9);
    }

    @Test
    @DisplayName("20 + 10 + 5 * 2 == 40")
    void t4() {
        assertThat(Polynomial.calc("20 + 10 + 5 * 2")).isEqualTo(40);
    }

    @Test
    @DisplayName("50 - 30 => 20")
    void t5() {
        assertThat(Polynomial.calc("50 - 30")).isEqualTo(20);
    }

    @Test
    @DisplayName("10 + 20 + 30 == 60")
    void t6() {
        assertThat(Polynomial.calc("10 + 20 + 30")).isEqualTo(60);
    }

    @Test
    @DisplayName("10 + 20 - 30 == 0")
    void t7() {
        assertThat(Polynomial.calc("10 + 20 - 30")).isEqualTo(0);
    }

    @Test
    @DisplayName("10 * 20 - 30 * 10 == -100")
    void t8() {
        assertThat(Polynomial.calc("10 * 20 - 30 * 10")).isEqualTo(-100);
    }

    @Test
    @DisplayName("(10 + 20) == 30")
    void t9() {
        assertThat(Polynomial.calc("(10 + 20)")).isEqualTo(30);
    }

    @Test
    @DisplayName("10 + ((20 - 10)) == 20")
    void t10() {
        assertThat(Polynomial.calc("10 + (20 - 10)")).isEqualTo(20);
    }

    @Test
    @DisplayName("((10 + 20)) == 30")
    void t11() {
        assertThat(Polynomial.calc("((10 + 20))")).isEqualTo(30);
    }

    @Test
    @DisplayName("(10 + 20) * 3 == 90")
    void t12() {
        assertThat(Polynomial.calc("(10 + 20) * 3")).isEqualTo(90);
    }

    @Test
    @DisplayName("10 + (10 + 5) == 25")
    void t13() {
        assertThat(Polynomial.calc("10 + (10 + 5)")).isEqualTo(25);
    }
}
