package christmas.domain;

public abstract class AbstractExample {

    private final String title;
    private final int price;

    protected AbstractExample(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}