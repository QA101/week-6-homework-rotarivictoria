

import java.util.*;

class RemoveDuplicate
{
    
    void removeDuplicates(String str)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
         
        
        for(Character ch : lhs)
            System.out.print(ch);
    }
     
    
    public static void main(String args[])
    {
        String str = "banana";
        RemoveDuplicate r = new RemoveDuplicate();
        r.removeDuplicates(str);
    }
}
 