// EX.NO.8   INTER-THREAD COMMUNICATION

Class Railway {    
	Int seats = 2;    
	Synchronized void bookTicket() {        
		Try {            
			While (seats == 0) {                
				System.out.println(“No seats available. “                        + “Booking thread is waiting…”);                
				Wait();            
			}            
			Seats--;            
			System.out.println(“Ticket booked successfully.”);            
			System.out.println(“Available seats: “ + seats);        
		}          
		catch (InterruptedException e) {            
			System.out.println(e);        
		}    
	  }    
	Synchronized void cancelTicket() {        
		Seats++;        
		System.out.println(“Ticket cancelled successfully.”);        
		System.out.println(“Available seats: “ + seats);        
		notifyAll();    
	}
} 
Class Booking extends Thread {    
	Railway railway;    
	Booking(Railway railway) {        
		This.railway = railway;    
	}    
	Public void run() {        
		For (int I = 1; I <= 3; i++) {            
			Railway.bookTicket();        
		}    
	} 
} 
Class Cancellation extends Thread {    
	Railway railway;    
	Cancellation(Railway railway) {        
		This.railway = railway;    
	}    
	Public void run() {        
		Try {            
		Thread.sleep(2000);        
		}        
		catch (InterruptedException e) {           
	 		System.out.println(e);        
		}        
		Railway.cancelTicket();    
	}
} 
Public class EX_NO_8{    
	Public static void main(String[] args) {        
	Railway railway = new Railway();        
	Booking booking = new Booking(railway);        
	Cancellation cancellation = new Cancellation(railway);        
	Booking.start();        
	Cancellation.start();    
       } 
}