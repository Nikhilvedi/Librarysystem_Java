
package library;

import java.util.ArrayList;

/**
 *
* @author Nikhil Vedi
 */
public class SetOfMembers extends ArrayList<Member>  {

    void addMember(Member aMember) {
        super.add(aMember);
    }
    
    public void removeMember(Member aMember) {
        super.remove(aMember);
    }
    
    public Member getMemberFromName(String name){
        Member temp = null;
        int tempno; 
        tempno = super.size();
        
        for( int i =0; i<tempno; i++)
        {
            temp = super.get(i);
            if(temp.getName().equalsIgnoreCase(name)){
              return temp;
            }
        }
      return temp;
    }
    
   public Member getMemberFromNumber(int memberNumber) {
       //working 
          Member temp = null;
        int tempno; 
        tempno = super.size();
        
        for( int i =0; i<tempno; i++)
        {
            temp = super.get(i);
            if(temp.getMemberNumber() == memberNumber){
              return temp;
            }
             else {
                return null;
            }
            
        }
      return temp;
   }
    
}
