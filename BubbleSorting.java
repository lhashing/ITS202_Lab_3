public class BubbleSorting {  
    static void bubbleSort(int[] a) {  
        int n = a.length;  
        int temp = 0;  
        
        for(int i=0; i < n; i++){  
        	for(int j=1; j < (n-i); j++){
            	if(a[j-1] > a[j]){
					//swap elements  
					temp = a[j-1];  
					a[j-1] = a[j];  
					a[j] = temp;  
                }               
            }  
		}  
	}

    public static void main(String[] args) {  
                int a[] = {9, 1, 3, 2, 4, 0, 5, 6, 8, 7}; 
                 
                System.out.println("Before Bubble Sort");  
                for(int i=0; i < a.length; i++){  
                        System.out.print(a[i] + " ");  
                }  
                System.out.println();  

                bubbleSort(a);//sorting a elements using bubble sort  
                 
                System.out.println("After Bubble Sort");  
                for(int i=0; i < a.length; i++){  
                    System.out.print(a[i] + " ");  
                }
                System.out.println(); 
   
        }  
}
