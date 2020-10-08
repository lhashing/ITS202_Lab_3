public class SelectionSorting {  
    public static void SelectionSort(int[] a){  
        for (int i = 0; i < a.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < a.length; j++){  
                if (a[j] < a[index]){  
                    index = j; 
                }  
            }
            int smallerNumber = a[index];   
            a[index] = a[i];
            a[i] = smallerNumber;
        }  
    }  
       
    public static void main(String[] args) {
        int[] a = {9, 1, 3, 2, 4, 0, 5, 6, 8, 7};  
        System.out.println("Before Selection Sort");  
        for(int i=0; i < a.length; i++){  
            System.out.print(a[i] + " ");  
        } 
        System.out.println();  
          
        SelectionSort(a); //sorting a elements using selection sort 
         
        System.out.println("After Selection Sort");  
        for(int i=0; i < a.length; i++){  
            System.out.print(a[i] + " ");  
        }
        System.out.println();  
    }
}