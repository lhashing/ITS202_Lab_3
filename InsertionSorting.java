public class InsertionSorting{
	public static void InsertionSorting(int a[]) {
		int n = a.length;

		for (int j = 1; j < n; j++) {  
            int key = a[j];  
            int i = j - 1;

            while ((i > -1) && (a[i] > key )) {  
                a[i+1] = a[i];  
                i--;  
            }  
            a[i+1] = key;  
        }
	}

	public static void main(String[] args){    
        int[] a = {9, 1, 3, 2, 4, 0, 5, 6, 8, 7};    
        System.out.println("Before Insertion Sort");    
        for(int i=0; i < a.length; i++){    
            System.out.print(a[i] + " ");    
        }    
        System.out.println();    
            
        InsertionSorting(a); //sorting a elements using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i=0; i < a.length; i++){    
            System.out.print(a[i] + " ");    
        }
        System.out.println();
    }   
}