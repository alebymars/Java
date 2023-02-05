public class Client extends Human {

    public Order[] listOrders;

    public Client(Order newOrder[]) {
        super();
        this.listOrders = newOrder;
    }

    public Client() {
        super();
    }

    public Order[] getListOrders() {
        return listOrders;
    }

    public void setListOrders(Order[] listOrders) {
        this.listOrders = listOrders;
    }

    @Override
    public String toString() {
        return "Client{" + "listOrders=" + listOrders + '}';
    }

    // public String[] getListOrders() {
    // return listOrders;
    // }

    // public void setListOrders(String[] listOrders) {
    // this.listOrders = listOrders;
    // }

    // @Override
    // public String toString() {
    // return "Client{" + "listOrders=" + listOrders + '}';
    // }
}
