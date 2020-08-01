package ServiceTools;

import Service.*;

import java.time.LocalDateTime;

public class Complaint{
    /**
     * Each complaint has an issue.
     */
    private String issue;

    /**
     * Each complaint is logged at some time.
     */
    private LocalDateTime complaintTime;

    /**
     * Each complaint is associated with an order.
     */
    private Order complainedOrder;

    /**
     * Initializing our order with time of initialization.
     * @param o This is the order associated with our complaint
     * @param complaint This is the complaint logged with the order.
     */
    public Complaint(Order o,String complaint){
        complainedOrder=o;
        complaintTime=LocalDateTime.now();
        issue=complaint;
    }
}