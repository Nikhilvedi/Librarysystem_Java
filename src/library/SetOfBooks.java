
package library;

import java.util.ArrayList;
/**
 *
* @author Nikhil Vedi
 */
public class SetOfBooks extends ArrayList<Book>  {


public SetOfBooks(){

    super();
}

public void addBook(Book aBook){
    super.add(aBook);
}

public void removeBook(Book aBook) {
    super.remove(aBook);
}

Book findBookByAuthor(String Book)
{
     Book temp = null;
        int tempno; 
        tempno = super.size();
        
        for( int i =0; i<tempno; i++)
        {
            temp = super.get(i);
            if(temp.getAuthor().equalsIgnoreCase(Book)){
              return temp;
            }
             else {
                return null;
            }
        }
      return temp;
}

Book findBookFromTitle(String Book)
{
    
     Book temp = null;
        int tempno; 
        tempno = super.size();
        
        for( int i =0; i<tempno; i++)
        {
            temp = super.get(i);
            if(temp.getName().equalsIgnoreCase(Book)){
              return temp;
            }
        }
      return temp;
}

Book findBookFromAccNumber(int bookNo)
{

     Book temp = null;
        int tempno; 
        tempno = super.size();
        
        for( int i =0; i<tempno; i++)
        {
            temp = super.get(i);
            if(temp.getAccessionNumber() == bookNo){
              return temp;
            }
             else {
                return null;
            } 
        }
      return temp;
}

 Book findBookFromISBN(String bookNo)
{
     Book temp = null;
        int tempno; 
        tempno = super.size();
        
        for( int i =0; i<tempno; i++)
        {
            temp = super.get(i);
            if(temp.getName().equalsIgnoreCase(bookNo)){
              return temp;
            }
             else {
                return null;
            }     
        }
      return temp;
}
 
}
