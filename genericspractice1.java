package labb6;

public class genericspractice1 {
	//non static method
	<E> void showArray(E[] s) {
		for(int i=s.length-1; i>=0; i--) {
			System.out.println(s[i]);
	}}
     public static void main(String[] args) {
    	 genericspractice1 obj=new  genericspractice1();
         //Character c[]= {'F','T','Y','J'};
    	 //obj.showArray(c);
    	// System.out.println("-------------");
    	 
    	 String names[]={"B","A","R","I","R","A","H"};
    	 obj.showArray(names);

    	 
    	
}

