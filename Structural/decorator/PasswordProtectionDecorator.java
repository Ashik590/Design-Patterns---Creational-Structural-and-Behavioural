public class PasswordProtectionDecorator implements FileProcessor {
    private FileProcessor wrappee;
    public PasswordProtectionDecorator(FileProcessor wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String process(String file) {
        String processedFile = wrappee.process(file);
        return addPasswordProtection(processedFile);
    }

    private String addPasswordProtection(String file) {
        return file + "_pro";
    }
    
}
