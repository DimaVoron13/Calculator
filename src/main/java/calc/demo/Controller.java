package calc.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String answerWelcome() {
        return calculatorService.answerWelcome();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam(value = "num1", required = false) Float one, @RequestParam(value = "num2", required = false) Float two) {
        return calculatorService.plus(one, two);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam(value = "num1", required = false) Float one, @RequestParam(value = "num2", required = false) Float two) {
        return calculatorService.minus(one, two);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Float one, @RequestParam(value = "num2", required = false) Float two) {
        return calculatorService.multiply(one, two);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam(value = "num1", required = false) Float one, @RequestParam(value = "num2", required = false) Float two) {
        return calculatorService.divide(one, two);
    }

}
