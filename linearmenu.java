import java.util.*;
public class linearmenu
{
    public static int linearSearch(String menu[],String key)
    {
        for(int i=0;i<menu.length;i++)
        {
            if(menu[i]==key)
            {
            return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        String menu[] = {"Samosa","CholeBhature","IDLI","Puri","Ande"};
        String key = "IDLI";
        int index = linearSearch(menu,key);
        if(index==-1)
        {
            System.out.println("Key Not found");
        }
        else{
            System.out.println("Key is at this index:"+index);
        }
    }
}