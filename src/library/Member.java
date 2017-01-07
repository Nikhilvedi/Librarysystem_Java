
package library;
import java.io.Serializable;
/**
 *
* @author Nikhil Vedi
 */
public class Member implements Serializable
   
{
    private final String name;
    private final int memberNumber;
    private SetOfBooks currentLoans = new SetOfBooks();
    private static int memberCount = 0;
    
    public Member(String aName){
     name = aName;
     memberNumber = memberCount++;
     currentLoans = new SetOfBooks();
    }

    @Override
    public String toString(){
        return name;  
    }

    public void borrowBook(Book aBook){
        currentLoans.addBook(aBook);
        aBook.setBorrower(this);
    }
    
    public void returnBook(Book aBook){
        currentLoans.removeBook(aBook);
        aBook.setBorrower(null);
    }
    
   public SetOfBooks getBooksOnLoan(){
        return currentLoans;
    }
    
    //getters
   
    public String getName(){
        return name;
    }
    
    public int getMemberNumber(){
        return memberNumber;
    }
   
}

