import java.util.*;

class file3{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int a[],b[],i,j,p,q;
		a = new int[30];
		b = new int[11];
		
		System.out.println("Enter marks :-- ");
		
		for(i=0; i<30; i++){
			a[i] = scanner.nextInt();
			a[i]/=10;
		}
		
		System.out.println("number\t\trange\t\tcount");
		
		for(j=0,p=0,q=9 ; j<11; j++,p+=10,q+=10){
			for(i=0; i<30; i++){
				if(a[i]==j)
					b[j]++;
			
			}
			
			if(j==10)
				System.out.println("11\t\t100\t\t"+b[j]);
			else
				System.out.println((j+1)+"\t\t"+ p+"to"+q+"\t\t"+b[j]);
		}
	}
}
//11 22 33 44 55 66 77 88 99 100 2 4 6 8 44 66 34 56 78 98 12 35 63 35 78 67 55 23 45 6