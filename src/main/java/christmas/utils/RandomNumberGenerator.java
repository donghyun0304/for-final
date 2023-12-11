package christmas.utils;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomNumberGenerator {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;
    private static final int NUMBER_SIZE = 6;

    private RandomNumberGenerator() {
    }
        
    // MIN_NUMBER ~ MAX_NUMBER 의 사이의 숫자를 NUMBER_SIZE 개 만들어주는 메소드
    public static List<Integer> createNumbers(){
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(MIN_NUMBER, MAX_NUMBER, NUMBER_SIZE);
        validateNumberRange(numbers);
        return numbers;
    }
    
    //createNumbers 메소드 검증로직
    private static void validateNumberRange(final List<Integer> numbers){
        boolean isValidNumber = numbers.stream()
                .allMatch(number -> number >= MIN_NUMBER && number <= MAX_NUMBER);
        if(!isValidNumber){
            throw new IllegalArgumentException("[ERROR] 정해진 범위의 숫자가 아닙니다.");
        }
    }
    
    
    //최대 2개까지 중복된 숫자를 가질 수 있는 List의 값구하기
    public static List<Integer> createMax2DuplicateNumbers() {
        Map<Integer, Integer> numberCounts = new HashMap<>();
        List<Integer> numbers = new ArrayList<>();
        
        //여기 5에 List의 크기 정하기
        while (numbers.size() < 5) {
            //여기 1,5 의 값에 1에는 최소 숫자, 5는 최대숫자
            int randomNumber = Randoms.pickNumberInRange(1, 5);
            // Map에 randomNumber값이 없으면 0을 넣음
            numberCounts.putIfAbsent(randomNumber, 0);
            if (numberCounts.get(randomNumber) < 2) {
                numberCounts.put(randomNumber, numberCounts.get(randomNumber) + 1);
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }





}
