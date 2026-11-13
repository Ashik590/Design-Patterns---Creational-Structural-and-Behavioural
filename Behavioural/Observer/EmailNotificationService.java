public class EmailNotificationService implements AuctionObserver {
    private final String serviceContact;

    public EmailNotificationService(String serviceContact) {
        this.serviceContact = serviceContact;
    }

    @Override
    public void update(Auction auction) {
        System.out.println(
                "[EmailService] Sending notification via " + serviceContact + ": Auction '" + auction.getProductName()
                        + "' status=" + auction.getStatus() + ", highestBid=" + auction.getCurrentHighestBid()
                        + ", highestBidder=" + auction.getCurrentHighestBidder());
    }
}
