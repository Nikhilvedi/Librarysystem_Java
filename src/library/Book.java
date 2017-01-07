
package library;
import java.io.Serializable;
/**
 *
* @author Nikhil Vedi
 */
public class Book implements Serializable
       
{
    
    private final String title;
    private final String ISBNNumber; 
    private Member borrower = null;
    private static int bookCount = 0;
    private final int accessionNumber;
    private final String Author; 
            
    public Book(String name, String ISBN, String Auth){
        title = name;
        ISBNNumber = ISBN;
        Author = Auth;
        accessionNumber = bookCount++;
        
    }
  
    @Override
    public String toString(){
    
        return title ;   
    }

public Boolean isOnLoan()
{
    if (this.borrower == null)
    {
        return false;
    }
        else
    {
        return true;
    }
   
}
//
//getters and setters 
    public String getName(){
        return title;
    }
    
    public String getISBNNo(){
        return ISBNNumber;
    }
    
    public String getAuthor(){
        return Author;
    }
    
    public int getAccessionNumber(){
        return accessionNumber;
    }
      void setBorrower(Member theBorrower) {
        borrower = theBorrower;
    }

    Member getBorrower() {
        return borrower;
    }
   

}
