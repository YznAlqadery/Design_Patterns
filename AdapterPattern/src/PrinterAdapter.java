public class PrinterAdapter implements Printer{
    OldPrinter oldPrinter = new OldPrinter();

    @Override
    public void print(String message) {
        oldPrinter.printOld(message);
    }
}
