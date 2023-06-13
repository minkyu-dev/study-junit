package chapter06_test;

import chapter06.Profile;
import org.junit.jupiter.api.Test;

public class ProfileTest {
    @Test
    public void test() {
        Profile profile = new Profile("Bull Hockey, Inc.");
        Question question = new BooleanQuestion(1, "Got bonuses?");
        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(question, Bool.TRUE);
        Criterion criterion = new Criterion(criteraAnswer, Weight.MustMatch);
        criteria.add(criterion);
    }
}
