interface State {
    void edit(Document document);
    void submit(Document document);
    void verify(Document document);
    void approve(Document document);
    void reject(Document document);
    void returnForCorrection(Document document);
    void archive(Document document);
    void displayStatus();
}
