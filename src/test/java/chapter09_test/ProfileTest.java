package chapter09_test;

import chapter06.Profile;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProfileTest {
    // 우리가 작성한 코드를 전혀 모르는 다른 사람들이 볼 때 테스트의 의도가 명확히 드러나도록 해야한다

    @Test
    // public void test() {
    public void matchAnswersTrueForAnyDontCareCriteria() { // 테스트명은 테스트의 의도를 담을 수 있는 적절한 이름으로 지어야 한다.
        // 준비 (arrange)
        Profile profile = new Profile("Bull Hockey, Inc.");
        Question question = new BooleanQuestion(1, "Got bonuses?");

        // Criterion에 대응하는 적절한 Answer 객체가 필요하다.
        Answer profileAnswer = new Answer(question, Bool.FALES);
        profile.add(profileAnswer);

        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(question, Bool.TRUE);
        Criterion criterion = new Criterion(criteraAnswer, Weight.DontCare);
        criteria.add(criterion);

        // 실행 (act)
        boolean matches = profile.matches(criteria);

        // 단언 (assert)
        assertThat(matches).isTrue();
    }
}
