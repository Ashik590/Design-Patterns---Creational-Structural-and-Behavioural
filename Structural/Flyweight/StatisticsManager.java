class StatisticsManager {
    public void displayStatistics(Document document, StyleFactory styleFactory) {
        System.out.println("Total number of characters: " + document.getCharacterCount());
        System.out.println("Total number of unique styles: " + styleFactory.getStyleCount());
        System.out.println(
                "Memory Efficiency gained: "
                        + (document.getCharacterCount() / (double) styleFactory.getStyleCount() - 1) * 100
                        + "%");
    }
}
