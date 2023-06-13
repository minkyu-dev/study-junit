package chapter07_test;

import chapter06.Profile;
import org.junit.jupiter.api.Test;

public class ProfileTest {
    @Test
    public void test() {
        Profile profile = new Profile("Bull Hockey, Inc.");
        Question question = new BooleanQuestion(1, "Got bonuses?");

        // Criterion에 대응하는 적절한 Answer 객체가 필요하다.
        Answer profileAnswer = new Answer(question, Bool.FALES);
        profile.add(profileAnswer);

        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(question, Bool.TRUE);
        Criterion criterion = new Criterion(criteraAnswer, Weight.MustMatch);
        criteria.add(criterion);
    }
}
