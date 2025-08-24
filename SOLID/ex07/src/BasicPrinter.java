// BasicPrinter implements both Printable and Machine
// Machine implementation uses composition with adapter pattern
public class BasicPrinter implements Printable, Machine {
    private final BasicPrinterAdapter adapter;
    
    public BasicPrinter() {
        this.adapter = new BasicPrinterAdapter(this);
    }
    
    public void print(String text){ 
        System.out.println("Print: "+text); 
    }
    
    // Machine interface methods - delegate to adapter
    public void scan(String dstPath) {
        adapter.scan(dstPath);
    }
    
    public void fax(String number) {
        adapter.fax(number);
    }
}
