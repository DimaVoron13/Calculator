package calc.demo;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalcImpl implements CalculatorService {

    public String answerWelcome() {
        return "Добро пожаловать в калькулятор";
    }

    public String singNull(Float one, Float two) {
        boolean confirmNull = one == null || two == null;
        String stringResult = "noNull";
        if (confirmNull) {
            stringResult = "Для расчёта необходимо указать числовые значения переменных";
        }
        return stringResult;
    }

    public String plus(Float one, Float two) {
        String resultCalculation = "";
        String resultString = "";
        if (singNull(one, two).equals("noNull")) {
            Float result = one + two;
            resultString = one + " + " + two + " = " + result;
        } else resultString = singNull(one, two);
        return resultString;
    }

    public String minus(Float one, Float two) {
        String resultCalculation = "";
        String resultString = "";
        if (singNull(one, two).equals("noNull")) {
            Float result = one - two;
            resultString = one + " - " + two + " = " + result;
        } else resultString = singNull(one, two);
        return resultString;
    }

    public String multiply(Float one, Float two) {
        String resultCalculation = "";
        String resultString = "";
        if (singNull(one, two).equals("noNull")) {
            Float result = one * two;
            resultString = one + " * " + two + " = " + result;
        } else resultString = singNull(one, two);
        return resultString;
    }

    public String divide(Float one, Float two) {
        String resultCalculation = "";
        String resultString = "";
        if (singNull(one, two).equals("noNull")) {
            if (two == 0) {
                resultString = "Недопустимое значение делителя равным нулю. На ноль делить нельзя";
            } else {
                Float result = one / two;
                resultString = one + " / " + two + " = " + result;
            }
        } else resultString = singNull(one, two);
        return resultString;
    }
}


