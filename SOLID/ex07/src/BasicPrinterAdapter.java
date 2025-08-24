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
    }
    
    @Override
    public void fax(String number) {
        System.out.println("Fax operation not supported by BasicPrinter");
    }
}
