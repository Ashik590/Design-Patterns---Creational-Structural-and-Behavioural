public class EncryptionDecorator implements FileProcessor {
    private FileProcessor wrappee;
    public EncryptionDecorator(FileProcessor wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String process(String file) {
        String processedFile = wrappee.process(file);
        return encrypt(processedFile);
    }

    private String encrypt(String file) {
        return file + "_en";
    }

}
