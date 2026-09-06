// EX NO : 12 SMART STUDY PLANNER

import java.util.*; 
class Subject {    
	String name;    
	int priority;    
	int hours;    
	Subject(String name, int priority, int hours) {        
		this.name = name;        
		this.priority = priority;        
		this.hours = hours;    
	} 
} 
public class EX_NO_12 {    
	public static void main(String[] args) {        
	Scanner sc = new Scanner(System.in);        
	System.out.print("Enter number of subjects: ");        
	int n = sc.nextInt();        
	sc.nextLine();        
	Subject[] subjects = new Subject[n];        
	for (int i = 0; i < n; i++) {            
		System.out.print("Enter subject name: ");            
		String name = sc.nextLine();            
		System.out.print("Enter priority (1-3): ");            
		int priority = sc.nextInt();            
		System.out.print("Enter study hours: ");            
		int hours = sc.nextInt();            
		sc.nextLine();            
		subjects[i] = new Subject(name, priority, hours);        
	}        
	// Sort by priority: 1 = highest priority        
	for (int i = 0; i < n - 1; i++) {            
		for (int j = i + 1; j < n; j++) {               
			 if (subjects[i].priority > subjects[j].priority) {                    
				Subject temp = subjects[i];                    
				subjects[i] = subjects[j];                    
				subjects[j] = temp;                
			}            
		}        
	}       
	System.out.println("\nSMART STUDY PLAN");        
	System.out.println("-----------------------------");        
	for (Subject s : subjects) {            
		System.out.println(s.name + " - " + s.hours                    + " hour(s), Priority: " + s.priority);        
	}        
	sc.close();    
        } 
}