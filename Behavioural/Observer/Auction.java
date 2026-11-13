import java.util.ArrayList;
import java.util.List;

public class Auction {
    public enum Status {
        NOT_STARTED, ACTIVE, CLOSED
    }

    private final String auctionId;
    private final String productName;
    private final double startingPrice;
    private double currentHighestBid;
    private String currentHighestBidder;
    private Status status;
    private final List<AuctionObserver> observers;

    public Auction(String auctionId, String productName, double startingPrice) {
        this.auctionId = auctionId;
        this.productName = productName;
        this.startingPrice = startingPrice;
        this.currentHighestBid = startingPrice;
        this.currentHighestBidder = null;
        this.status = Status.NOT_STARTED;
        this.observers = new ArrayList<>();
    }

    public String getAuctionId() {
        return auctionId;
    }

    public String getProductName() {
        return productName;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public double getCurrentHighestBid() {
        return currentHighestBid;
    }

    public String getCurrentHighestBidder() {
        return currentHighestBidder;
    }

    public Status getStatus() {
        return status;
    }

    public void registerBidder(AuctionObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
            notifyBidders();
        }
    }

    public void removeBidder(AuctionObserver observer) {
        observers.remove(observer);
    }

    public void notifyBidders() {
        for (AuctionObserver o : observers) {
            o.update(this);
        }
    }

    public boolean placeBid(String bidderName, double bidAmount) {
        if (status != Status.ACTIVE) {
            System.out.println("[Auction] Bid rejected: auction is not active.");
            return false;
        }
        if (bidAmount <= currentHighestBid) {
            System.out.println("[Auction] Bid rejected: bid must be greater than current highest bid.");
            return false;
        }

        currentHighestBid = bidAmount;
        currentHighestBidder = bidderName;
        System.out.println("[Auction] New highest bid: " + bidAmount + " by " + bidderName);
        notifyBidders();
        return true;
    }

    public void startAuction() {
        if (status == Status.NOT_STARTED) {
            status = Status.ACTIVE;
            System.out.println("[Auction] Auction started for " + productName + " (" + auctionId + ")");
            notifyBidders();
        }
    }

    public void closeAuction() {
        if (status == Status.ACTIVE) {
            status = Status.CLOSED;
            System.out.println("[Auction] Auction closed for " + productName + " (" + auctionId + ")");
            notifyBidders();
            System.out.println("[Auction] Winner: " + (currentHighestBidder == null ? "No bids" : currentHighestBidder)
                    + " with " + currentHighestBid);
        }
    }
}
