package chapter11_test;

import chapter06.Profile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProfileTest {
    // 우리가 작성한 코드를 전혀 모르는 다른 사람들이 볼 때 테스트의 의도가 명확히 드러나도록 해야한다
    private Profile profile;
    private Question question;
    private Criteria criteria;

    @BeforeEach
    public void create() {
        profile = new Profile("Bull Hockey, Inc.");
        question = new BooleanQuestion(1, "Got bonuses?");
        criteria = new Criteria();
    }

    @Test
    // public void test() {
    public void matchAnswersTrueForAnyDontCareCriteria() { // 테스트명은 테스트의 의도를 담을 수 있는 적절한 이름으로 지어야 한다.
        // 준비 (arrange)
        // Criterion에 대응하는 적절한 Answer 객체가 필요하다.
        profile.add(new Answer(question, Bool.FALES));
        criteria.add(new Criterion(new Answer(question, Bool.TRUE), Weight.DontCare));

        // 실행 (act)
        boolean matches = profile.matches(criteria);

        // 단언 (assert)
        assertThat(matches).isTrue();
    }

    @Test
    // public void test() {
    public void matchAnswersTrueForAnyDontCareCriteria() { // 테스트명은 테스트의 의도를 담을 수 있는 적절한 이름으로 지어야 한다.
        // 준비 (arrange)
        // Criterion에 대응하는 적절한 Answer 객체가 필요하다.
        profile.add(new Answer(question, Bool.FALES));
        criteria.add(new Criterion(new Answer(question, Bool.TRUE), Weight.DontCare));

        // 실행 (act)
        boolean matches = profile.matches(criteria);

        // 단언 (assert)
        assertThat(matches).isTrue();
    }
}
