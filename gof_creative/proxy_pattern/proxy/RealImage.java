package proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage(fileName);
    }

    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadImage(String fileName) {
        System.out.println("Loading " + fileName + "...");
    }

}
