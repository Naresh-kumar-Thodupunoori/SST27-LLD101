// Interface Segregation Principle - separate interfaces for different capabilities
interface Printable {
    void print(String text);
}

interface Scannable {
    void scan(String dstPath);
}

interface Faxable {
    void fax(String number);
}

// Composite interface that combines all capabilities
interface Machine extends Printable, Scannable, Faxable {
}
