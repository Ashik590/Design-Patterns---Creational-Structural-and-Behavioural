public class ExtractionDecorator implements FileProcessor {
    private FileProcessor wrappee;
    public ExtractionDecorator(FileProcessor wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String process(String file) {
        String processedFile = wrappee.process(file);
        return extract(processedFile);
    }

    private String extract(String file) {
        if(file.endsWith("_comp")) {
            return file.substring(0, file.length() - 5);
        }
        return file;
    }
    
}
