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
		System.out.println("++++++++++++++++++++++++ Address Book Data ++++++++++++++++++++++++");
		System.out.println("\tId\tname\tAddress\t City\tstate\tZip\tphone");
        for (int i = 0; i < list.size(); i++) 
        {
            Data data = list.get(i); 
			System.out.println("\t"+data.Id+"\t"+data.name+"\t"+data.Address+"\t"+data.City+"\t"+data.state+"\t"+data.Zip+"\t"+data.phone); 
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
			addValues(Id, name, Address, City, state, Zip, phone);
			System.out.println("Person Data Added successfully.\n");
			System.out.println("Do you want to Add anather Person then enter (Y/N):");
			check = sc.next();
			n++; 
		}
	}
	public void deleteDate(int AcceptUserInt){
		for (Data P : list){
				if(P.Id==AcceptUserInt){
					list.remove(P);
				}
			}
	}
	public void Update(){
		int UserID = 0;
		int Case = 0;
		System.out.println("\n\n");
		System.out.println("Enter id You want to update :");
		UserID = sc.nextInt();
		check="Y";
		for (Data P : list){
				if(P.Id==UserID){
					while(check.equals("Y")||check.equals("y")){
						System.out.println("\n\n");
						System.out.println("What You Want To Update\n1.Name\n2.Address\n3.City\n4.State\n5.ZipCode\n6.Mobile Number");
						Case = sc.nextInt();
						switch (Case){
							case 1:
								System.out.println("Enter the Name :");
								String UpdateName = sc.next();
								P.name=UpdateName;
								System.out.println("Name Updated successfully");
							break;
							case 2:
								System.out.println("Enter the Address :");
								String UpdateAddress = sc.next();
								P.Address=UpdateAddress;
								System.out.println("Address Updated successfully");
							break;
							case 3:
								System.out.println("Enter the City :");
								String UpdateCity = sc.next();
								P.City=UpdateCity;
								System.out.println("City Updated successfully");
							break;
							case 4:
								System.out.println("Enter the State :");
								String UpdateState = sc.next();
								P.state=UpdateState;
								System.out.println("State Updated successfully");
							break;
							case 5:
								System.out.println("Enter the ZipCode :");
								int UpdateZipCode = sc.nextInt();
								P.Zip=UpdateZipCode;
								System.out.println("Zip Code Updated successfully");
							break;
							case 6:
								System.out.println("Enter the Mobile Number :");
								long Updatephone = sc.nextLong();
								P.phone=Updatephone;
								System.out.println("Mobile Number Updated successfully");
							break;
						}
						System.out.println("Do you want to Update anather value then enter (Y/N):");
						check = sc.next();
					}
				}
			}
	}
	
	public void sortByName(){
		ArrayList<String> SortName=new ArrayList<>();
		for (Data P : list){
				SortName.add(P.name);
			}
		Collections.sort(SortName);
		System.out.println("++++++++++++++++++++++++ After Sorting by Name ++++++++++++++++++++++++");
		System.out.println("\tId\tname\tAddress\t City\tstate\tZip\tphone");
		for(String A : SortName){
			for (Data P : list){
				if(P.name.equals(A)){
					System.out.println("\t"+P.Id+"\t"+P.name+"\t"+P.Address+"\t"+P.City+"\t"+P.state+"\t"+P.Zip+"\t"+P.phone);
				}
			}
		}
	}
	
	public void sortByZip(){
		ArrayList<Integer> SortZip=new ArrayList<>();
		for (Data P : list){
				SortZip.add(P.Zip);
			}
		Collections.sort(SortZip);
		System.out.println("++++++++++++++++++++++++ After Sorting by Zip Code ++++++++++++++++++++++++");
		System.out.println("\tId\tname\tAddress\t City\tstate\tZip\tphone");
			for(int A : SortZip){
				for (Data P : list){
					if(P.Zip==A){
						System.out.println("\t"+P.Id+"\t"+P.name+"\t"+P.Address+"\t"+P.City+"\t"+P.state+"\t"+P.Zip+"\t"+P.phone);
					}
				}
			}
		
	}
	
	public void sort(){
		int Case=0;
		System.out.println("\n\n");
		System.out.println("1.Sort by Name\n2.Sort by Zip Code");
		Case = sc.nextInt();
		switch(Case){
			case 1:
				System.out.println("\n\n");
				sortByName();
				System.out.println("\n\n");
			break;
			case 2:
				System.out.println("\n\n");
				sortByZip();
				System.out.println("\n\n");
			break;
		}
		
	}
	
  
    public static void main(String args[]) 
    { 
		int cas = 0;
		String AcceptUser = " ";
		int AcceptUserInt=0;
		AddressBook custom = new AddressBook();
		do{
			System.out.println("\n\n");
			System.out.println("1.Add Person\n2.Display Person\n3.Delete Person\n4.Update\n5.Sort Data\n6.Exit");
			System.out.println("Enter Your Choice :");
			cas = custom.sc.nextInt();
				switch (cas){
					case 1:
						custom.NewPerson();
					break;
					case 2:
						System.out.println("\n\n");
						custom.printValues();
					break;
					case 3:
						System.out.println("\n\n");
						System.out.println("Enter the id for delete :");
						AcceptUserInt = custom.sc.nextInt();
						custom.deleteDate(AcceptUserInt);
					break;
					case 4:
						custom.Update();
					break;
					case 5:
						custom.sort();
					break;
				}
		}while(cas!=6);
    } 
} 