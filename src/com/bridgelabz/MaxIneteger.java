package com.bridgelabz;

public class MaxIneteger {

    int x;
    int y;
    int z;

  public MaxIneteger(int x, int y, int z) {
	
		this.x = x;
		this.y = y;
		this.z = z;
	}

public static <T extends Comparable<T>> 
  
  T maximum(T x, T y, T z)  
  {
	  
   	T max = x; 

        T maximum =y;
        if (y.compareTo(max)>0) {
            max = y;
        }
        if (z.compareTo(max)>0) {
            max = z;
        }
        return max;
    }

 public static void main(String[] args) {
	
	    Integer a= 60,b = 34, c = 54;
	    float xf = 8.8f, yf = 4.7f, zf = 5.8f;
	    String x = "apple", y = "peach", z = "banana";
        System.out.println("Maximum Integer value is:");
        System.out.println( maximum(a,b,c));
        
        System.out.println("Maximum Integer value is:");
        System.out.println(maximum(xf,yf,zf));
        System.out.println("Maximum Integer value is:");
        System.out.println( maximum(x,y,z));	      
}
 
}