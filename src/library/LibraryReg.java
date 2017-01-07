
package library;
import java.io.Serializable;
/**
 *
* @author Nikhil Vedi
 */
public class LibraryReg  implements Serializable {

    public  SetOfMembers theMembers = new SetOfMembers(); 
    public  SetOfBooks holdings = new SetOfBooks(); 
    public SetOfBooks availableBooks = new SetOfBooks(); //seperate set of books for available books
     
}




