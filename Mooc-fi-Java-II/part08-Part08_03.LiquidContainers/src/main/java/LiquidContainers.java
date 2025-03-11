	import java.util.Scanner;
	 
	public class LiquidContainers {
	 
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        int container1 = 0;
	        int container2 = 0;
	 
	        while (true) {
	            if (container1 >=100){
	                container1 = 100;
	            }
	            if (container2 >=100){
	                container2 = 100;
	            }
	            
	            System.out.println("First: " + container1 + "/100");
	            System.out.println("Second: " + container2 + "/100");
	 
	            String input = scan.nextLine();
	            if (input.equals("quit")) {
	                break;
	            }
	            
	            String[] parts = input.split(" ");
	            String command = parts[0];
	            int amount = Integer.valueOf(parts[1]);
	            
	            if(command.equals("add")){
	                if(amount < 0){
	                    break;
	                }
	                container1 += amount;
	            }
	            
	            if(command.equals("move")){
	                if(amount >= container1){
	                    amount = container1;
	                }
	                container1 -= amount;
	                container2 += amount;
	            }
	            
	            if(command.equals("remove")){
	                if(amount >= container2){
	                    container2 = 0;
	                }else{
	                    container2 -= amount;
	                }
	            }
	        }
	    }
	}