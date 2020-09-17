import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QATest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {

        question q = new question();
        q.answers = new String[]{"A", "A"};
        q.quest = "Are you okay ?";
        q.checkChars();
        QA qa = new QA();
        qa.questions.add(q);

    }
}