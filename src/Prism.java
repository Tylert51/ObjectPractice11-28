public class Prism {
    private int length;
    private int width;
    private int height;

    public Prism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void changeLength(int newLen) {
        length = newLen;
    }

    public void changeWidth(int newWidth) {
        width = newWidth;
    }

    public void changeHeight(int newHeight) {
        height = newHeight;
    }

    public String toString() {
        return "Length = " + length + "\nWidth = " + width + "\nHeight = " + height;
    }

    public int calcVolume() {
        return (length * width * height);
    }

    public int calcSurfaceArea() {
        int faceOne = length * width;
        int faceTwo = width * height;
        int faceThree = height * length;

        return (2 * (faceOne + faceTwo + faceThree));
    }
}
