

/**
 *
 * @author CHRISTIAN
 */
public class Model_Month {
    
    public int getMonth(){
        return month;
    }
    
     public void setMonth(int month){
        this.month=month;
    }
     
     public String getMonthText(){
        return monthText;
    }
     
     public void setMonthText(String monthText){
        this.monthText= monthText;
    }
     
     public Model_Month(int month, String monthText) {
         this.month=month;
         this.monthText= monthText;
     }
     public Model_Month(){
     }
     private int month;
     private String monthText;
     
     @Override
     public String toString(){
         return monthText;
     }
     
    
}
