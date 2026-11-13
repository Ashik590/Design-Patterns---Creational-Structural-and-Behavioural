public class Main {
    public static void main(String[] args) {
        FileExplorer fileExplorer = new FileExplorer(new Folder("Root"));

        Folder rootFolder = (Folder) fileExplorer.getRoot();
        File file1 = new File("File1.txt", 100);
        File file2 = new File("File2.txt", 200);
        Folder subFolder = new Folder("SubFolder");
        subFolder.addComponent(file1);
        subFolder.addComponent(file2);
        rootFolder.addComponent(subFolder);

        System.out.println(rootFolder.size()); 
    }
}
