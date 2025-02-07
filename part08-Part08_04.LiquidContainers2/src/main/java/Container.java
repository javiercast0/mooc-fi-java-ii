public class Container {
	    private int totalAmount;
	    
	    public Container(){
	        this.totalAmount = 0;
	    }
	    
	    public int contains(){
	        return totalAmount;
	    }
	    
	    public void add(int amount){
	        if(amount <= 0){
	            return;
	        }
	        this.totalAmount += amount;
	        if(this.totalAmount > 100){
	            this.totalAmount = 100;
	        }
	    }
	    
	    public void remove(int amount){
	        if(amount <= 0){
	            return;
	        }
	        this.totalAmount -= amount;
	        if(this.totalAmount < 0){
	            this.totalAmount = 0;
	        }
	    }
	    
	    public String toString(){
	        return this.totalAmount + "/100";
	    }
	}