public class BasicPrinter implements Machine {
    private final BasicPrinterAdapter adapter;
    
    public BasicPrinter() {
        this.adapter = new BasicPrinterAdapter(this);
    }
    
    public void print(String text){ 
        System.out.println("Print: "+text); 
    }
    
    public void scan(String dstPath) {
        adapter.scan(dstPath);
    }
    
    public void fax(String number) {
        adapter.fax(number);
    }
}
