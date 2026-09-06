// EX.NO:7 IMPLEMENTATION OF A MULTI-THREAD PROGRAM

Import java.util.Arrays; 
Import java.util.Random; 
Class EX_NO_7 {    
	Static int[] arr = new int[10];    
	Static class Generate extends Thread {        
		Public void run() {            
			Random r = new Random();            
			For (int I = 0; I < arr.length; i++) {               
				 Arr[i] = r.nextInt(100);
		               }            
			System.out.println(“Original Array: “                    + Arrays.toString(arr));        
		}    
	}    
	Static class Ascending extends Thread {        
		Public void run() {            
			Int[] temp = arr.clone();            
			Arrays.sort(temp);            
			System.out.println(“Ascending Order: “                    + Arrays.toString(temp));        
		}    
	}    
	Static class Descending extends Thread {        
		Public void run() {            
			Int[] temp = arr.clone();            
			Arrays.sort(temp);            
			For (int I = 0; I < temp.length / 2; i++) {                
				Int t = temp[i];                
				Temp[i] = temp[temp.length – 1 – i];                
				Temp[temp.length – 1 – i] = t;            
			}            
			System.out.println(“Descending Order: “                    + Arrays.toString(temp));        
		}    
	    Public static void main(String[] args) throws Exception {        
		Generate t1 = new Generate();        
		Ascending t2 = new Ascending();       
		Descending t3 = new Descending();        
		T1.start();         
		T1.join();        
		T2.start();        
		T3.start();        
		T2.join();        
		T3.join();        
		System.out.println(“All threads completed.”);    
	  } 
}