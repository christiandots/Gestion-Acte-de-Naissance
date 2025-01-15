
import javax.print.PrintService;
import javax.print.StreamPrintServiceFactory;


/**
 *
 * @author CHRISTIAN
 */
public abstract class PrinterJob {
    public static PrinterJob getPrinterJob(){
       //compile code 
        return null;
    }
    public static PrintService[] lookupPrintServices(){
        //compile code
        return null;
    }
    public static StreamPrintServiceFactory[] lookupStreamPrintServices(){
        
        return null;  
    }
    public PrinterJob(){
    }
    public PrintService getPrintService(){
        return null;
    }
    public StreamPrintServiceFactory getStreamPrintServiceFactory(){
        return null;
    }

}
