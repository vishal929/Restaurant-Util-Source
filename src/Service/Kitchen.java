package Service;
/**
 * Class to represent a kitchen or bar where the waiter makes orders or requests from.
 */
public class Kitchen{
    /**
     * Name or identification of a kitchen or bar.
     */
    private String name;

    /**
     * Orders that have been requested for this kitchen to fulfill.
     */
    private ArrayList<Order> orders ;

    /**
     * Orders that have been fulfilled by this kitchen.
     */
    private ArrayList<Order> fulfilled ;

    /**
     * Inquiries that have been sent to the kitchen/bar.
     */
    private ArrayList<String> inquiries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Order> getFulfilled() {
        return fulfilled;
    }

    public void setFulfilled(ArrayList<Order> fulfilled) {
        this.fulfilled = fulfilled;
    }

    public ArrayList<String> getInquiries() {
        return inquiries;
    }

    public void setInquiries(ArrayList<String> inquiries) {
        this.inquiries = inquiries;
    }
}