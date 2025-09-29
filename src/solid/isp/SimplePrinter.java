package solid.isp;

public class SimplePrinter implements Printable {

    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

}
