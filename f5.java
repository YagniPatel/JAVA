import java.util.*;

class stack{
	Scanner scanner = new Scanner(System.in);
	int i=-1;
	int a[] = new int[5];
	void push(){
		int n;
		System.out.println("Enter a num : ");
		n = scanner.nextInt();
		if(i==5-1)
			System.out.println("stack oveflow.");
		else
		{
			i++;
			a[i]=n;
			System.out.println("num successfully push.");
		}
	}
	void pop(){
		if(i==-1)
			System.out.println("stack underflow.");
		else
		{
			i--;
			System.out.println("Deleted element :-- "+a[i+1]);	
		}		
	}
	void display(){
		int j;
		System.out.print("Elements of stack :-- ");
		for(j=0; j<=i; j++)
		{
			System.out.print(a[j]);
			System.out.println("   ");
		}
	}
}

class File5{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		stack s = new stack();
		int n;
		do{
			System.out.println("Menu :--");
			System.out.println("1. push\n2. pop\n3. display\n4. exit");
			n = scanner.nextInt();
		
			switch(n){
				case 1:
					s.push();
					break;
				case 2:
					s.pop();
					break;
				case 3:
					s.display();
					break;
				case 4:
					return ;
				default :
					System.out.println("\nwrong input.");
			}
		}while(n!=4);
	}
}