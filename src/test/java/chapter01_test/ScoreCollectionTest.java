package chapter01_test;

import chapter01.ScoreCollection;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

public class ScoreCollectionTest {

    @Test
    void test() {
        fail("Not yet implemented");
    }

    @Test
    void answersArithmeticMeanOfTwoNumbers() {
        // 준비
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        // 실행
        int actualResult = collection.arithmeticMean();

        // 단언
        assertThat(actualResult)
                .isEqualTo(6);
    }
}
