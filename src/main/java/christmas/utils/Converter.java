package christmas.utils;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Converter {

    public static List<String> parseToStringListByDelimiter(final String str, final String delimiter){
        return Arrays.stream(str.split(delimiter))
                .collect(Collectors.toList());
    }

    // 1000자리 단위당 컴마를 찍어주는 메소드
    public static String formatNumberWithCommas(int number) {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        return formatter.format(number);
    }




}