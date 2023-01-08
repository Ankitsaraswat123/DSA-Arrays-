//ARRAYS


//add element in array at last index

/*public class Ankit1 {
   public static void main(String[] args){
   int arr[]={1,2,3,4};
   int n=arr.length;
   int newarr[]=new int[n+1];
   for(int i=0;i<n;i++){
      newarr[i]=arr[i];
   }
   newarr[n]=5;
   System.out.println("the new array will be: ");
   for(int i=0;i<n+1;i++){
    System.out.print(newarr[i]+" ");
   }

 }
}*/

//add element in array at any given position

/*class Ankit1{
   public static void main(String[] args){
      int arr[]={1,2,3,4,5};
      int n=arr.length;
      int newarr[]=new int[n+1];
      int idx=4;
      int ele=6;
      for(int i=0;i<n;i++){
         newarr[i]=arr[i];
      }
      for(int i=n-1;i>=idx;i--){
         newarr[i+1]=arr[i];
      }
      newarr[idx]=ele;
      System.out.println("modified array will be: ");
      for(int i=0;i<=n;i++){
         System.out.print(newarr[i]+" ");
      }

   }
}*/

//delete specific  element from given array

/*class Ankit1{
   public static void main(String[] args){
      int arr[]={1,2,3,4,5};
      int n=arr.length;
      int k=3;
      int new_arr[]=new int[n-1];
      for(int i=0,j=0;i<n;i++){
         if(arr[i]!=k){
            new_arr[j]=arr[i];
            j++;
         }
      }
      System.out.println("modified array will be: ");
      for(int j=0;j<n-1;j++){
         System.out.print(new_arr[j]+" ");
      }
   }
}*/

//delete element by its index from an array

/*class Ankit1{
   public static void main(String[] args){
      int arr[]={1,2,3,4,5};
      int n=arr.length;
      int new_arr[]=new int[n-1];
      
      int idx=3;
      for(int i=0,k=0;i<n;i++){
         if(arr[i]!=arr[3]){
            new_arr[k]=arr[i];
            k++;
         }
      }
      System.out.println("modified array will be: ");
      for(int j=0;j<n-1;j++){
         System.out.print(new_arr[j]+" ");
      }

   }
}*/

//reverse an array
/*class Ankit1{
   public static void main(String[] args){
      int arr[]={1,2,3,4,5};
      int n=arr.length;
      System.out.println("array after reversing is: ");
      for(int i=n-1;i>=0;i--){
          System.out.print(arr[i]+" ");
      }
   }
}*/

//how to find the largest element in an array

/*class Ankit1{
   static int Fun(int arr[],int n){
      int max=arr[0];
      for(int i=0;i<n;i++){
         if(arr[i]>arr[0]){
            max=arr[i];
         }
      }
      return max;
   }
   public static void main(String[] args){
      int arr[]={1,2,3,4,5};
      int n=arr.length;
      System.out.println("maximum element of array will be: "+Fun(arr, n));

   }
   }*/

//how to find second largest element in an array

/*class Ankit1{
   static void SecondLargest(int arr[],int n){
      Arrays.sort(arr);
      if(n<2){
       System.out.println("invalid input");
       return;
      }//{5,5,5,5,5}
      for(int i=n-2;i>=0;i--){
        if(arr[i]!=arr[n-1]){
         System.out.println("second largest element is: "+arr[i]);
         break;
        }
      
      System.out.println("there is no such second largest elemet in this array!!!!!!!!!!");
      break;
      }
   }
   public static void main(String[] args){
      int arr[]={35,65,55,45};
      int n=arr.length;
      SecondLargest(arr, n);
   }
}*/

//how to count number of duplicate element from the given array

/*class Ankit1{
   public static void main(String[] args){
      int arr[]={1,4,2,6,7,3,2,3,3};
      int n=arr.length;
      int count=0;
      for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
         if(arr[i]==arr[j]){
            count++;
         }
      }
   }
   System.out.println("number of duplcate element will be: "+count);

   }
}*/

//how to remove duplicate from the array

/*class Ankit1{
   public static void main(String[] args){
      int arr[]={1,2,3,4,2,1,5};
      int n=arr.length;
      int temp[]=new int[n];
      int j=0;
      for(int i=0;i<n-1;i++){
         if(arr[i]!=arr[i+1]){
            temp[j++]=arr[i];
         }
      }
      temp[j++]=arr[n-1];


      for(int i=0;i<j;i++){
         arr[i]=temp[i];
      }
      System.out.println("unique array will be: ");
      for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
      }

   }
}*/

//check wheather an array is sorted or not method-1

/*  class A
{
 public static boolean isSorted(int[] a)
 {
     // base case
     if (a == null || a.length <= 1) {
         return true;
     }

     for (int i = 0; i < a.length - 1; i++)
     {
         if (a[i] > a[i + 1]) {
             return false;
         }
     }

     return true;
 }

 public static void main(String[] args)
 {
     int[] a = { 1, 2, 3, 4, 5 };
     System.out.println(isSorted(a));        // true
}
}*/

//sorting an  array  method-2

/*class Ankit1{
   public static boolean Sorted(int arr[],int n){
      for(int i=0;i<n;i++){
         if(arr[i]>arr[i+1]){
            return false;
         }
      }
      return true;
   }
   public static void main(String[] args){
      int arr[]={1,2,4,7,3};
      int n=arr.length;
      System.out.println(Sorted(arr, n));
   }
}*/

//prefix sum

/*class Ankit1{
  static void aprefixSum(int arr[],int n,int prefixSum[]){
     prefixSum[0]=arr[0];
     for(int i=1;i<n;i++){
      prefixSum[i]=prefixSum[i-1]+arr[i];
      
     }
   
   }
   public static void main(String[] args){
      int arr[]={1,2,3,4,5};
      int n=arr.length;
      int prefixSum[]=new int[n];
      aprefixSum(arr,n,prefixSum);
      for(int i=0;i<n;i++){
         System.out.print(prefixSum[i]+" ");
      }
      System.out.println();
   }
   }*/

//sliding window technique to find maximum element of given k consicutive terms

/*class Aj{
   static void As(int arr[],int n,int k){
      for(int i=0;i<n-k+1;i++){
         int max=arr[i];
         for(int j=1;j<k;j++){
            if(arr[i+j]>max){
               max=arr[i+j];
            }
            
         }
         System.out.print(max+" ");
         
      }
   }
      public static  void main(String[] args) {
         int arr[]={1,2,3,4,5,6,7};
         int n=arr.length;
         int k=3;
         As(arr, n, k);
      }
   }*/

//arrayList in java

/*class Ankit1{
   public static void main(String[] args){
      ArrayList<Integer> arrli=new ArrayList<Integer>();
      int n=5;
      for(int i=0;i<=n;i++){
         arrli.add(i);
      }
      System.out.println(arrli);
   
 arrli.remove(2);
 System.out.println(arrli);
 arrli.add(6);
 System.out.println(arrli);
 arrli.add(7);
 System.out.println(arrli);
}
}*/

//move zero to end

/*class Ankit1{
  static void Funny(int arr[],int n){
      int count=0;
      for(int i=0;i<n;i++){
         if(arr[i]!=0){
            arr[count]=arr[i];
            count++;
         }
      }
      while(count<n){
         arr[count++]=0;
      }
   }
   public static void main(String[] args){
      int arr[]={0,3,6,0,1,9,10,0};
      int n=arr.length;
      Funny(arr,n);
      System.out.println("array after pushing zeros to end");
      for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
   }
}*/

//left rotate an array by one
/*class Ankit1{
  static void  Fun(int arr[],int n){
    int temp=arr[0];//{1,2,3,4,5}={3,4,5,1,2}
    for(int i=1;i<n;i++){
      arr[i-1]=arr[i];
    }
    arr[n-1]=temp;
    System.out.println("array after left rotation");
    for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
   }
}
   public static void main(String[] args){
      int arr[]={1,2,3,4,5};
      int n=arr.length;
      Fun(arr, n);
   }
   
}
*/
//left rotate n array by d times

//but this code have time complexity of theta(n*d)

/*class Ankit1 {
   static void Fun(int arr[], int n, int d) {
      for (int i = 0; i < d; i++) {
         int temp = arr[0];
         for (int j = 1; j < n; j++) {
            arr[j - 1] = arr[j];
         }
         arr[n - 1] = temp;
      }
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
   }

   public static void main(String[] args) {
      int arr[] = { 1, 2, 3, 4, 5 };
      int n = arr.length;
      int d = 2;
      Fun(arr, n, d);
   }

}*/

//method-ii for left roatation of an array by d times
class Ankit1 {
   static void fun(int arr[], int n, int d) {// {1,2,3,4,5}={3,4,5,1,2}
   d=d%n;//
   System.out.println(d);
   int temp[]=new int[d];   
   for (int i = 0; i < d; i++) {
         temp[i]=arr[i];
      }
   for(int i=d;i<n;i++){
      arr[i-d]=arr[i];
   }
   for(int i=0;i<d;i++){
      arr[n-d+i]=temp[i];
   }
   for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
   }

   }
   public static void main(String[] args) {
      int arr[]={1,2,3,4,5};
      int n=arr.length;
      int d=2;
      fun(arr, n, d);
   }
}

