import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class AuctionLogger implements AuctionObserver {
    private List<String> logs;

    public AuctionLogger(String logFilePath) {
        this.logs = new ArrayList<>();
    }

    @Override
    public void update(Auction auction) {
        String line = LocalDateTime.now() + " | Auction=" + auction.getAuctionId()
                + " | Product=" + auction.getProductName()
                + " | Status=" + auction.getStatus()
                + " | HighestBid=" + auction.getCurrentHighestBid()
                + " | HighestBidder=" + auction.getCurrentHighestBidder() + "\n";

        logs.add(line);
    }
}
