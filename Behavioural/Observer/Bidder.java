public class Bidder implements AuctionObserver {
    private final String bidderId;
    private final String name;
    private final String contactInfo;

    public Bidder(String bidderId, String name, String contactInfo) {
        this.bidderId = bidderId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getBidderId() {
        return bidderId;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void placeBid(Auction auction, double amount) {
        System.out.println("[Bidder:" + name + "] Attempting to place bid: " + amount);
        auction.placeBid(name, amount);
    }

    @Override
    public void update(Auction auction) {
        System.out.println("[Bidder:" + name + "] Update received: product=" + auction.getProductName()
                + ", highestBid=" + auction.getCurrentHighestBid()
                + ", highestBidder=" + auction.getCurrentHighestBidder()
                + ", status=" + auction.getStatus());
    }

    public void leaveAuction(Auction auction) {
        System.out.println("[Bidder:" + name + "] Leaving auction for product: " + auction.getProductName());
        auction.removeBidder(this);
    }

    public void joinAuction(Auction auction) {
        System.out.println("[Bidder:" + name + "] Joining auction for product: " + auction.getProductName());
        auction.registerBidder(this);
    }
}
