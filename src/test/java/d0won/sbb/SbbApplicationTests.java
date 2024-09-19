package d0won.sbb;

import d0won.sbb.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for(int i = 0; i < 300; i++)
        {
            String subject = String.format("테스트 데이터입니다:[%03d]", i+1);
            String content = "내용 무";
            this.questionService.create(subject, content, null);
        }
    }
}
