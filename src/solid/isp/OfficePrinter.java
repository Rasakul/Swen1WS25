package solid.isp;

public class OfficePrinter implements Scanable, Printable, Stapleable, Faxable {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }

    @Override
    public void fax(String content) {
        System.out.println("Faxing: " + content);
    }

    @Override
    public void staple(String content) {
        System.out.println("Stapling: " + content);
    }
}
