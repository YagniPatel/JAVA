import java.util.*;

class Student{
	int id,mar;
	String name;
}

class File4{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		Student[] list=new Student[4];
		//System.out.println("Enter marks :-- ");
		
		for(int i=0; i<list.length; i++){
			
			System.out.println("Enter "+(i+1)+" student detail :-- " );
			list[i]=new Student();
			System.out.println("Enter id :-- ");
			list[i].id = scanner.nextInt();
			System.out.println("Enter name :-- ");
			
			list[i].name = scanner.next();
			System.out.println("Enter marks :-- ");
			list[i].mar = scanner.nextInt();

			
		}
		System.out.println("id\tname\tmarks");
		for(Student i:list){
			System.out.println(i.id+"\t"+i.name+"\t"+i.mar);
		}
		
	}
}