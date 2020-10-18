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
		int cas=0;
		Scanner sc = new Scanner(System.in);
		AddressBook custom = new AddressBook();
		do{
			System.out.println("1.Add Person \n2.Display Person\n3.Exit");
			cas = sc.nextInt();
				switch (cas){
					case 1:
						check=1;
						while(check==1){
							System.out.println("\n\n");
							System.out.println("Enter the roll number :");
							int roll = sc.nextInt();
									sc.nextLine();
							System.out.println("Enter the Name :");
							String name = sc.nextLine();
							System.out.println("Enter the Marks :");
							int marks = sc.nextInt();
							System.out.println("Enter the Mobile Number :");
							long phone = sc.nextLong();
							System.out.println("Do you want to Add anather Person then enter (1):");
							check = sc.nextInt();
							n++;
							custom.addValues(roll, name, marks, phone); 
						}
					break;
					case 2:
						System.out.println("\n\n\n");
						custom.print(n);
						System.out.println("\n\n\n");
					break;
				}
		}while(cas!=3);
    } 
} 