public class DecryptionDecorator implements FileProcessor {
    private FileProcessor wrappee;
    public DecryptionDecorator(FileProcessor wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String process(String file) {
        String processedFile = wrappee.process(file);
        return decrypt(processedFile);
    }

    private String decrypt(String file) {
        if (file.endsWith("_en")) {
            return file.substring(0, file.length() - 3);
        }

        return file;
    }
    
}
