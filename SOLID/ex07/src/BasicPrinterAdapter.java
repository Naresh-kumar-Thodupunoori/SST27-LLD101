// Adapter pattern to make BasicPrinter work with Machine interface
// This follows SOLID principles and doesn't require changes to Demo07.java
public class BasicPrinterAdapter implements Machine {
    private final BasicPrinter printer;
    
    public BasicPrinterAdapter(BasicPrinter printer) {
        this.printer = printer;
    }
    
    @Override
    public void print(String text) {
        printer.print(text);
    }
    
    @Override
    public void scan(String dstPath) {
        System.out.println("Scan operation not supported by BasicPrinter");
        // Instead of throwing exception, provide graceful degradation
    }
    
    @Override
    public void fax(String number) {
        System.out.println("Fax operation not supported by BasicPrinter");
        // Instead of throwing exception, provide graceful degradation
    }
}
