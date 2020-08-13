import java.util.Scanner;

public class Frame {
	
	
	public int[] part(int year,int cost) {
		Frame obj = new Frame();
		Scanner sc = new Scanner(System.in);
		String choice = "no";
		int[] val = new int[2];
		int choice_No=0;
		System.out.println("Please confirm which parts do you want...");
		System.out.println("Do you want double frame?");
		String ans = sc.next();
		if(ans.equalsIgnoreCase("Yes")) {
			cost=obj.double_Frame(cost,year);
			choice = "yes";
		}
		
		System.out.println("Do you want Matte finish frame?");
		ans = sc.next();
		if(ans.equalsIgnoreCase("yes")) {
		cost=	obj.matte_Frame(cost,year);
			if(choice.equalsIgnoreCase("yes")) {
				choice_No=2;
			}else {
				choice_No=1;
			}
		}
		
		val[0]=cost;
		val[1]=choice_No;
	return val;	
		
	}
	
	public int double_Frame(int cost,int year){
		
		if(year<2006) {
			cost= cost+100;}
			else {
					cost = cost+120;
		}
		return cost;		
	}
public int matte_Frame(int cost,int year){
		
	if(year<2006) {
		cost= cost+80;}
		else {
				cost = cost+90;
	}
		return cost;		
	}

	public int multi_Cost(int choice,int year,int cost) {
		if(choice==1) {
			if(year<2006) {
				cost= cost+100;
		
			}else {
				cost = cost+120;
			}
		}else if(choice==2) {
			if(year<2006) {
				cost= cost+100+80;
			}else {
				cost = cost+120+90;
			}
		
		}
		return cost;
		
	}

	
	
	
	

}
