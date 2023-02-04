public class Order {
    public String[] items;
    public String dateTime;
    public float total;

    public Order(String[] items, String dateTime, float total) {
        this.items = items;
        this.dateTime = dateTime;
        this.total = total;
    }

    public Order() {
    }
}
