import java.util.*;
class assigment{public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.println("zhmaray array deare bka");
	int y=s.nextInt();
	char []pet=new char[y];
	for(int i=0;i<pet.length;i++){
		System.out.println("petakan daxll bka"+pet[i]);
		pet[i]=s.next().charAt(0);
	}
	String naw="";
	for(int i=0;i<pet.length;i++){
		naw+=pet[i];
	}
	System.out.println("naw:"+naw);













}
}