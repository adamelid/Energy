package is.hi.energy.Persistence.Entities;

public class Order {
    private long ID;
    private String orderInfo;
    private String orderStatus;
    private String totalPrice;

    public Order() {
    }

    public Order(String orderInfo, String orderStatus, String totalPrice) {
        this.orderInfo = orderInfo;
        this.orderStatus = orderStatus;
        this.totalPrice = totalPrice;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
