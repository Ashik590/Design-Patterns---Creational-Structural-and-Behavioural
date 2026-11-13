public class UnlockDecorator implements FileProcessor {
    private FileProcessor wrappee;
    public UnlockDecorator(FileProcessor wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String process(String file) {
        String processedFile = wrappee.process(file);
        return unlock(processedFile);
    }

    private String unlock(String file) {
        if(file.endsWith("_pro")) {
            return file.substring(0, file.length() - 4);
        }
        return file;
    }
    
}
