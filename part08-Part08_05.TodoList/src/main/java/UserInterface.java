	import java.util.Scanner;
	 
	 
	public class UserInterface {
	    private Scanner scanner;
	    private TodoList toDoList;
	    
	    public UserInterface(TodoList toDoList, Scanner scanner){
	        this.toDoList = toDoList;
	        this.scanner = scanner;
	    }
	    
	    public void start(){
	        while(true){
	            System.out.print("Command: ");
	            String command = scanner.nextLine();
	            if(command.equals("stop")){
	                return;
	            }else if(command.equals("add")){
	                System.out.print("To add: ");
	                this.toDoList.add(scanner.nextLine());
	            }else if(command.equals("list")){
	                this.toDoList.print();
	            }else if(command.equals("remove")){
	                System.out.println("Which one is removed?");
	                this.toDoList.remove(Integer.valueOf(scanner.nextLine()));
	            }
	        }
	    }
	}
	 