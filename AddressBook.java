import java.util.ArrayList; 
import java.util.*;
  
class AddressBook 
{ 
    //int n;  
    class Data 
    { 
        int roll; 
        String name; 
        int marks; 
        long phone; 
        Data(int roll, String name, int marks, long phone) 
        { 
            this.roll = roll; 
            this.name = name; 
            this.marks = marks; 
            this.phone = phone; 
        } 
    } 
	public ArrayList<Data> list=new ArrayList<>();
	public void addValues(int roll, String name, int marks, long phone) 
    {   
        list.add(new Data(roll, name, marks, phone));
    }
	public void print(int n){
		printValues(list,n);
	}
  
    public void printValues(ArrayList<Data> list , int n) 
    { 
        for (int i = 0; i < n; i++) 
        {
            Data data = list.get(i); 
			System.out.println(data.roll+" "+data.name+" "+data.marks+" "+data.phone); 
        } 
    } 
  
    public static void main(String args[]) 
    { 
		int check=1;
		int n=0;
		Scanner sc = new Scanner(System.in);
		AddressBook custom = new AddressBook();
		while(check==1){
			System.out.println("Enter the roll number :");
			int roll = sc.nextInt();
					sc.nextLine();
			System.out.println("Enter the Name :");
			String name = sc.nextLine();
			System.out.println("Enter the Marks :");
			int marks = sc.nextInt();
			System.out.println("Enter the Mobile Number :");
			long phone = sc.nextLong();
			System.out.println("Do you want to countinue then Enter (1)");
			check = sc.nextInt();
			n++;
			//System.out.println(check);
			custom.addValues(roll, name, marks, phone); 
		}
		custom.print(n);
		
    } 
} 