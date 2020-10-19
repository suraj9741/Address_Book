import java.util.ArrayList; 
import java.util.*;
  
class AddressBook 
{ 
    //int n;
	public String check="Y";
	public Scanner sc = new Scanner(System.in);
    class Data 
    { 
        int Id; 
        String name; 
        int Zip; 
        long phone;
		String Address;
		String City; 
		String state;
        Data(int Id, String name, String Address, String City, String state, int Zip, long phone) 
        { 
            this.Id = Id; 
            this.name = name;
			this.Address = Address;
			this.City = City;
			this.state = state;
            this.Zip = Zip; 
            this.phone = phone; 
        } 
    }
	public ArrayList<Data> list=new ArrayList<>();
	public void addValues(int Id, String name, String Address, String City, String state, int Zip, long phone) 
    {   
        list.add(new Data(Id, name, Address, City, state, Zip, phone));
    }
  
    public void printValues() 
    { 
        for (int i = 0; i < list.size(); i++) 
        {
            Data data = list.get(i); 
			System.out.println(data.Id+" "+data.name+" "+data.Address+" "+data.City+" "+data.state+" "+data.Zip+" "+data.phone); 
        } 
    }

	public void NewPerson(){
		int n=0;
		check="Y";
		while(check.equals("Y")||check.equals("y")){
			System.out.println("\n\n");
			System.out.println("Enter the person ID number :");
			int Id = sc.nextInt();
					sc.nextLine();
			System.out.println("Enter the Name :");
			String name = sc.nextLine();
			System.out.println("Enter the address:");
			String Address = sc.next();
			System.out.println("Enter the city:");
			String City = sc.next();
			System.out.println("Enter the State:");
			String state = sc.next();
			System.out.println("Enter the ZipCode :");
			int Zip = sc.nextInt();
			System.out.println("Enter the Mobile Number :");
			long phone = sc.nextLong();
			System.out.println("Do you want to Add anather Person then enter (Y/N):");
			check = sc.next();
			n++;
			addValues(Id, name, Address, City, state, Zip, phone); 
		}
	}
	public void deleteDate(int AcceptUserInt){
		//this.AcceptUserInt=AcceptUserInt;
		for (Data P : list){
				if(P.Id==AcceptUserInt){
					list.remove(P);
				}
			}
	}
	
  
    public static void main(String args[]) 
    { 
		int cas = 0;
		String AcceptUser = " ";
		int AcceptUserInt=0;
		AddressBook custom = new AddressBook();
		do{
			System.out.println("1.Add Person \n2.Display Person\n3.Delete Person\n4.Exit");
			cas = custom.sc.nextInt();
				switch (cas){
					case 1:
						custom.NewPerson();
					break;
					case 2:
						System.out.println("\n\n\n");
						custom.printValues();
						System.out.println("\n\n\n");
					break;
					case 3:
						System.out.println("Enter the id for delete :");
						AcceptUserInt = custom.sc.nextInt();
						custom.deleteDate(AcceptUserInt);
					break;
				}
		}while(cas!=4);
    } 
} 