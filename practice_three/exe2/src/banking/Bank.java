package banking;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers = 0;
	
	public Bank(){

		customers = new Customer[6];
	}
	
	public void addCustomer(String fisrtName,String lastName){
		customers[numberOfCustomers] = new Customer(fisrtName,lastName);
		numberOfCustomers ++;
	}
	
	public int getNumOfCustomers() {
		return this.numberOfCustomers;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
