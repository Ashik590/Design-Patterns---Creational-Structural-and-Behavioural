public class Main {
    public static void main(String[] args) {
        Auction auction = new Auction("A-1001", "Vintage Watch", 100.0);

        Bidder alice = new Bidder("B1", "Alice", "alice@example.com");
        Bidder bob = new Bidder("B2", "Bob", "bob@example.com");
        Bidder carol = new Bidder("B3", "Carol", "carol@example.com");

        EmailNotificationService emailService = new EmailNotificationService("notify@auctions.example");
        AuctionLogger logger = new AuctionLogger("auction.log");

        alice.joinAuction(auction);
        bob.joinAuction(auction);
        carol.joinAuction(auction);
        auction.registerBidder(emailService);
        auction.registerBidder(logger);

        auction.startAuction();

        alice.placeBid(auction, 120.0);
        bob.placeBid(auction, 150.0);
        carol.placeBid(auction, 200.0);

        bob.placeBid(auction, 350.0);

        System.out.println("[Main] Removing Bob from observers.");
        bob.leaveAuction(auction);
        auction.notifyBidders();

        alice.placeBid(auction, 600.0);

        auction.closeAuction();
    }
}
