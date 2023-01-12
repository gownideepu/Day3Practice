package Day3Practice;

public class LargelnArray {

	public static void main(String[] args) {
		int [] arr = new int [] {11,228,33,44,55,66,77,87,98,190};  
        
        int max = arr[0];  
        
        for (int i = 0; i < arr.length; i++) {  
              
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);

	}

}