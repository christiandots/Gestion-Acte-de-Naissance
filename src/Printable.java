
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;



/**
 *
 * @author CHRISTIAN
 */
public interface Printable {
    public static final int PAGE_EXISTS=0;
    public static final int NO_SUCH_PAGE=1;
    
    public int print(Graphics grphcs, PageFormat pf, int i) throws PrinterException;
}
