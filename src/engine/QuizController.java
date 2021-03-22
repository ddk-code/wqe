package engine;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @GetMapping
    public Quiz getQuiz() {
        String title = "The Java Logo";
        String text = "What is depicted on the Java logo?";
        String[] options = {"Robot", "Tea leaf", "Cup of coffee", "Bug"};
        return new Quiz(title, text, options);
    }

    @PostMapping
    public Result putAnswer(@RequestParam("answer")  int answer) {
        if (answer == 2) {
            return new Result(true, "Congratulations, you're right!");
        }
        return new Result(false,"Wrong answer! Please, try again.");
    }

}