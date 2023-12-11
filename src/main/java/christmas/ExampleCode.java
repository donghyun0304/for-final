package christmas;

import christmas.constant.Delimiter;
import christmas.utils.Converter;

import java.util.List;

public class ExampleCode {

    public static void main(String[] args) {

        List<String> foods = Converter.parseToStringListByDelimiter("입력값1,입력값2", Delimiter.COMMA);

    }
}
