package Service;

import ServiceTools.*;

import java.util.ArrayList;

/**
 * This class represents the waiter who services the restaurant. They will be handling requests made by customers and updated on
 * requests straight from the kitchen/console.
 */
public class Waiter{
    /**
     * Name or Identification of the Waiter.
     */
    private String name;

    /**
     * Orders that have been requested to be fulfilled from the kitchen/bar.
     */
    private ArrayList<Order> requestedOrders;

    /**
     * Orders that have been served by this waiter.
     */
    private ArrayList<Order> servedOrders;

    /**
     *  Constructor for waiter.
      * @param name Name of the waiter we wish to construct.
     */
    public Waiter(String name){
        this.name=name;
        requestedOrders=new ArrayList<Order>();
        servedOrders=new ArrayList<Order>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getRequestedOrders() {
        return requestedOrders;
    }

    public void setRequestedOrders(ArrayList<Order> requestedOrders) {
        this.requestedOrders = requestedOrders;
    }

    public ArrayList<Order> getServedOrders() {
        return servedOrders;
    }

    public void setServedOrders(ArrayList<Order> servedOrders) {
        this.servedOrders = servedOrders;
    }
}