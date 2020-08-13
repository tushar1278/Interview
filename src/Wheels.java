import java.util.Scanner;

public class Wheels {

	public int[] part(int year,int cost) {
		Wheels obj = new Wheels();
		Scanner sc = new Scanner(System.in);
		String choice = "no";
		int[] val = new int[2];
		int choice_No=0;
		System.out.println("Please confirm which parts do you want...");
		System.out.println("Do you want tubeless Tires?");
		String ans = sc.next();
		if(ans.equalsIgnoreCase("Yes")) {
		cost=	obj.tubelessTires(cost,year);
			choice = "yes";
		}
		
		System.out.println("Do you want glossy rims?");
		ans = sc.next();
		if(ans.equalsIgnoreCase("yes")) {
			cost=obj.glossyRim(cost,year);
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
	
	public int tubelessTires(int cost, int year){
		
		if(year<2006) {
			cost= cost+150;}
			else {
					cost = cost+180;
		}
		return cost;		
	}
public int glossyRim(int cost,int year){
		
	if(year<2006) {
		cost= cost+70;}
		else {
				cost = cost+80;
	}
		return cost;		
	}
public int multi_Cost(int choice,int year,int cost) {
	if(choice==1) {
		if(year<2006) {
			cost= cost+150;
		}else {
			cost = cost+180;
		}
	}else if(choice==2) {
		if(year<2006) {
			cost= cost+150+70;
		}else {
			cost = cost+180+80;
		}
	
	}
	return cost;
}
	
	
	
}
