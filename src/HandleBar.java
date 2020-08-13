import java.util.Scanner;

public class HandleBar {

	
	public int[] part(int year,int cost) {
		HandleBar obj = new HandleBar();
		Scanner sc = new Scanner(System.in);
		String choice = "no";
		int[] val = new int[2];
		int choice_No=0;
		System.out.println("Please confirm which parts do you want...");
		System.out.println("Do you want disk brake in handel?");
		String ans = sc.next();
		if(ans.equalsIgnoreCase("Yes")) {
			cost = obj.diskBreak(cost,year);
			choice = "yes";
		}
		
		System.out.println("Do you want grip in handle?");
		ans = sc.next();
		if(ans.equalsIgnoreCase("yes")) {
		cost = 	obj.handleGrip(cost,year);
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
	
	public int diskBreak(int cost,int year){
		
		if(year<2006) {
			cost= cost+400;}
			else {
					cost = cost+500;
		}
		return cost;		
	}
public int handleGrip(int cost,int year){
		
	if(year<2006) {
		cost= cost+20;}
		else {
				cost = cost+40;
	}
		return cost;		
	}

public int multi_Cost(int choice,int year,int cost) {
	if(choice==1) {
		if(year<2006) {
			cost= cost+400;
		}else {
			cost = cost+500;
		}
	}else if(choice==2) {
		if(year<2006) {
			cost= cost+400+20;
		}else {
			cost = cost+500+40;
		}
	
	}
	return cost;
}
	
	
	
}
