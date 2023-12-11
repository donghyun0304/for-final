package christmas.utils;

import christmas.constant.Delimiter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InputConverter {

    //List의 값을 Map의 키로 바꾸는 메소드
    public static Map<String, Integer> parseFoods(List<String> input) {
        return input.stream()
                .map(foods -> foods.split(Delimiter.HYPHEN))
                .collect(Collectors.toMap(
                        splitArray -> splitArray[0],
                        splitArray -> Integer.parseInt(splitArray[1])
                ));
    }

    /*
    // 이름1,이름2,이름3  형태로 이루어진 인풋값을 받아 Coaches 객체로 변환
    public static Coaches parseToCoaches(final String names){
        List<Coach> coaches = Converter.parseToStringListByDelimiter(names ,Delimiter.COMMA).stream()
                .map(name -> Coach.from(name))
                .collect(Collectors.toList());
        return new Coaches(coaches);
    }
     */


    /*
    // 이름1, 이름2, 이름3 형태로 이루어진 인풋값을 받아 List<Coach> 로 변환
    public static List<Coach> parseToCoaches(final String names){
        return Converter.parseToStringListByDelimiter(names ,Delimiter.COMMA).stream()
                .map(name -> Coach.from(name))
                .collect(Collectors.toList());
    }
     */

}