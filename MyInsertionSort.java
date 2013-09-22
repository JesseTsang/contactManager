package contactManager;

public class MyInsertionSort 
{
	public static void main(String[] args) 
	{
        String list[] = {"Beep","Banda","Apple","Zoo","Orange"};
        
        insertionSort(list);
    }
     
    private static void printNumbers(String[] list) 
    {
         
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + ", ");
        }
        System.out.println("\n");
    }
    
    public static void insertionSort(String[] list) 
    {
        int arrayLength = list.length;
    
        for (int j = 1; j < arrayLength; j++) 
        {
            String currentKey = list[j]; //data
            int previousPosition = j-1;     //position?
                        
            while ( (previousPosition > -1) && ( list[previousPosition].compareToIgnoreCase(currentKey) > 0) )
            {
            	System.out.println("Comparing " + list[previousPosition] + " to " + currentKey + " and we get " + list[previousPosition].compareToIgnoreCase(currentKey));
            	
                list [previousPosition + 1 ] = list [previousPosition];
                previousPosition-- ;      
                
                System.out.println("Updated array ...");
                for (int i = 0; i < list.length; i++)
                {
                    System.out.print(list[i] + ", ");
                }
                System.out.println("\n");
                System.out.println("Previous position becomes " + previousPosition);
                System.out.println("\n");
            }
            
            list[previousPosition + 1] = currentKey;                    
            
            System.out.println("While loop failed .. Updated array ...");
            printNumbers(list);
        }
    }
}
