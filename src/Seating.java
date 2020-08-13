import java.util.Scanner;

public class Seating {

	public int[] part(int year,int cost) {
		Seating obj = new Seating();
		Scanner sc = new Scanner(System.in);
		String choice = "no";
		int[] val = new int[2];
		int choice_No=0;
		System.out.println("Please confirm which parts do you want...");
		System.out.println("Do you want foam seat?");
		String ans = sc.next();
		if(ans.equalsIgnoreCase("Yes")) {
		cost=	obj.foamSeat(cost,year);
			choice = "yes";
		}
		
		System.out.println("Do you want adjustable seat?");
		ans = sc.next();
		if(ans.equalsIgnoreCase("yes")) {
			cost =obj.seatAdjust(cost,year);
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
	
	public int foamSeat(int cost, int year){
		
		if(year<2006) {
			cost= cost+50;}
			else {
					cost = cost+70;
		}
				return cost;
	}
public int seatAdjust(int cost, int year){
		
	if(year<2006) {
		cost= cost+60;}
		else {
				cost = cost+90;
	}
		return cost;		
	}
public int multi_Cost(int choice,int year,int cost) {
	if(choice==1) {
		if(year<2006) {
			cost= cost+50;
		}else {
			cost = cost+70;
		}
	}else if(choice==2) {
		if(year<2006) {
			cost= cost+50+60;
		}else {
			cost = cost+70+90;
		}
	
	}
	return cost;
}
	
	
	
	
}
