package christmas.validation;

import christmas.constant.Delimiter;
import christmas.domain.ErrorMessage;
import christmas.domain.RegexPattern;
import christmas.utils.Converter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class InputValidator {

    private static Pattern inputFoodPattern = Pattern.compile("^[\\p{L} ]+-\\d+$");

    /*
    // List의 숫자값들을 MIN_NUMBER ~ MAX_NUMBER 사이의 값인지 검증하는 메소드
    public static void validateNumberRange(final List<Integer> numbers){
        boolean isValidNumber = numbers.stream()
                .allMatch(number -> number >= MIN_NUMBER && number <= MAX_NUMBER);
        if(!isValidNumber){
            throw new IllegalArgumentException("[ERROR] 정해진 범위의 숫자가 아닙니다.");
        }
    }
     */
    
    //숫자인지 검증
    public static void validateOnlyNumber(String input){
        if(!RegexPattern.ONLY_NUMBER.matches(input)){
            throw new IllegalArgumentException(ErrorMessage.NOT_ALL_NUMERIC);
        }
    }
    
    // 컴마가 있는지 검증
    public static void validateIncludeComma(String input){
        if(RegexPattern.NOT_INCLUDE_COMMA.matches(input)){
            throw new IllegalArgumentException(ErrorMessage.NOT_INCLUDE_COMMA);
        }
    }

    // 포맷과 일치한지 검증
    // 이 클래스 맨위에 보면 pattern이 존재한다.
    public static void validateInputFoodFormat(List<String> input){
        boolean isValidFormat = input.stream()
                .allMatch(str -> inputFoodPattern.matcher(str).matches());
        if(!isValidFormat){
            throw new IllegalArgumentException(ErrorMessage.NOT_VALID_FORMAT);
        }
    }
    
    
    // 숫자가 1이상인지 검증
    public static void validateOverZeroNumber(String input){
        if(Integer.parseInt(input) <= 0){
            throw new IllegalArgumentException(ErrorMessage.NOT_OVER_ZERO);
        }
    }

    /*
    // 중복 검증
    public static void validateNonDuplicate(final List<Integer> numbers){
        Set<Integer> nonDuplicateNumbers = new HashSet<>(numbers);
        if(nonDuplicateNumbers.size() != NUMBER_SIZE){
            throw new IllegalArgumentException(ErrorMessage.HAS_DUPLICATE);
        }
    }

     */
    
    
    /*
    //1000단위인지 검증 UNIT에 1000이 들어감
    public void validateMultipleOfUnit(final int amount){
        if((amount % UNIT) != 0){
            throw new IllegalArgumentException("[ERROR] 1000 단위가 아닙니다.");
        }
    }

     */

    public static void validateNullOrEmptyOrWhitespace(final String input) {
        if(input == null || input.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
    }
    
    
    // 컴마로 쪼갰을때 하나만 존재하는지 확인
    public static void validateSingle(final String input) {
        List<String> names = Converter.parseToStringListByDelimiter(input, Delimiter.COMMA);
        if(names.size() < 2){
            throw new IllegalArgumentException();
        }
    }
    
    
    // 글자수체크 5가 글자수
    public static void validateOverLength(final String input) {
        boolean isOverLength = Converter.parseToStringListByDelimiter(input, Delimiter.COMMA).stream()
                .anyMatch(name -> name.length() > 5);
        if(isOverLength){
            throw new IllegalArgumentException();
        }
    }

    
    //중복이름 체크
    public static void validateDuplicateNames(final List<String> names) {
        Set<String> nonDuplicateNames = new HashSet<>(names);
        if (names.size() != nonDuplicateNames.size()) {
            throw new IllegalArgumentException();
        }
    }




}
