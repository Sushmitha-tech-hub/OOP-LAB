import java.util.Scanner; 
class TelephoneBill { 
    int cno;
    String cname; 
    int previous, current, minutes; 
    String type; double bill;
} 
public class EX_NO_1 { 
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in); 
    TelephoneBill obj = new TelephoneBill(); 
    System.out.print("Enter Customer Number: "); 
    obj.cno = sc.nextInt(); sc.nextLine(); 
    System.out.print("Enter Customer Name: "); 
    obj.cname = sc.nextLine(); 
    System.out.print("Enter Previous Month Call Duration: "); 
    obj.previous = sc.nextInt(); 
    System.out.print("Enter Current Month Call Duration: "); 
    obj.current = sc.nextInt(); 
    sc.nextLine(); 
    System.out.print("Enter Connection Type (prepaid/postpaid): "); 
    obj.type = sc.nextLine(); 
    obj.minutes = obj.current - obj.previous; 
    if(obj.type.equalsIgnoreCase("prepaid")) {
        if(obj.minutes<=100){
            obj.bill = obj.minutes*1;
        }
        else if(obj.minutes<=200){
            obj.bill = 100 + (obj.minutes-100)*1.5;
        }
        else{
            obj.bill = 100 + 150 + (obj.minutes-200)*2;
        }
    }
    else{
        if(obj.minutes<=100){
            obj.bill = obj.minutes*0.75;
        }
        else if(obj.minutes<=200){
            obj.bill = 75 + (obj.minutes-100)*1.25;
        }
        else{
            obj.bill = 75 + 125 + (obj.minutes-200)*1.75;
        }
    System.out.println("\nTelephoneBill");
    System.out.println("Customer Number : " + obj.cno);
    System.out.println("Customer Name  : " + obj.cname);
    System.out.println("Call Minutes : " + obj.minutes);
    System.out.println("Connection Type : " + obj.type);
    System.out.println("Bill Amount  : Rs. " + obj.bill);
   } 
  }
}