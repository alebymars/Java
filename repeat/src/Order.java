import java.util.Arrays;

public class Order {
    public Product[] items;
    public String dateTime;
    public float total;

    public Order(Product[] items, String dateTime, float total) {
        this.items = items;
        this.dateTime = dateTime;
        this.total = total;
    }

    public Order() {
    }

    public Product[] getItems() {
        return items;
    }

    public void setItems(Product[] items) {
        this.items = items;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order [dateTime=" + dateTime + ", items=" + Arrays.toString(items) + ", total=" + total + "]";
    }
}
