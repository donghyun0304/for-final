package christmas.domain;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class EventDate {

    private static final int YEAR = 2023;
    private static final int MONTH = 12;

    private final LocalDate date;

    private EventDate(LocalDate date) {
        this.date = date;
    }

    public static EventDate from(int day){
        try {
            LocalDate.of(YEAR, MONTH, day);
        } catch (DateTimeException e){
            throw new IllegalArgumentException(ErrorMessage.NOT_VALID_DATE, e);
        }
        return new EventDate(LocalDate.of(YEAR, MONTH, day));
    }

    public boolean isSameDate(LocalDate date){
        return this.date.isEqual(date);
    }

    public boolean isBetween(LocalDate startDate, LocalDate endDate){
        return (this.date.isAfter(startDate) || this.date.isEqual(startDate)) &&
                (this.date.isBefore(endDate) || this.date.isEqual(endDate));
    }

    public boolean isSameDay(int day){
        return this.date.getDayOfMonth() == day;
    }

    public boolean isSameDayOfWeek(DayOfWeek dayOfWeek){
        return this.date.getDayOfWeek().equals(dayOfWeek);
    }

    public int getDay(){
        return date.getDayOfMonth();
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "EventDate{" +
                "date=" + date +
                '}';
    }
}
