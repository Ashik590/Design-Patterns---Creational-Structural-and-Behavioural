public class CompressionDecorator implements FileProcessor {
    private FileProcessor wrappee;

    public CompressionDecorator(FileProcessor wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String process(String file) {
        String processedFile = wrappee.process(file);
        return compress(processedFile);
    }

    private String compress(String file) {
        return file + "_comp";
    }
}
