public class Main {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new BasicFileProcessor();

        fileProcessor = new EncryptionDecorator(fileProcessor);
        fileProcessor = new CompressionDecorator(fileProcessor);
        fileProcessor = new PasswordProtectionDecorator(fileProcessor);

        fileProcessor = new ExtractionDecorator(fileProcessor);

        System.out.println(fileProcessor.process("myFile"));
    }
}
