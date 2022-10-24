class CocktailSort {  
  
/* function to implement Cocktail sort */  
static void cocktail(int a[], int n)  
{  
    int swap = 1;  
    int beg = 0;  
    int end = n - 1;  
    int i, temp;  
    while (swap == 1)  
    {  
        swap = 0;  
  
/* Loop similar to bubble sort to compare and swap array elements starting   
  
from left to right */  
        for (i = beg; i < end; ++i)  
        {  
            if (a[i] > a[i + 1]) {  
                temp = a[i];    
                a[i] = a[i+1];    
                a[i+1] = temp;     
                swap = 1;  
            }  
        }  
  
        if (swap == 0)  
            break;  
  
        swap = 0;  
          
        /* decrease the 'end' point by one position.   
        It is because the item at the last position is at its   
  
correct position */  
        --end;  
           
        /* This loop starts from right to left to perform the   
  
same comparison as in the previous loop */  
        for (i = end - 1; i >= beg; --i)  
        {  
            if (a[i] > a[i + 1]) {  
                temp = a[i];    
                a[i] = a[i+1];    
                a[i+1] = temp;     
                swap = 1;  
            }  
        }  
  
        /* increase the beg point by one position.   
        It is because the item at the first position is at its   
  
correct position */  
        ++beg;  
    }  
}  
  
 static void print(int a[], int n) //function to print array elements  
    {  
    int i;  
    for(i = 0; i < n; i++)    
    {    
        System.out.print(a[i] + " ");    
    }        
    }  
  
  
public static void main(String args[])   
{  
    int[] a = { 37, 3, 27, 2, 67, 0, 17 };     
    int n = a.length;   
    System.out.print("Before sorting array elements are - \n");  
    print(a, n);  
    cocktail(a, n);  
    System.out.print("\nAfter sorting array elements are - \n");    
    print(a, n);  
}  
}  
