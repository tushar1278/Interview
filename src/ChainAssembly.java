import java.util.Scanner;

public class ChainAssembly {

	public int[] part(int year,int cost) {
		ChainAssembly obj = new ChainAssembly();
		Scanner sc = new Scanner(System.in);
		String choice = "no";
		int[] val = new int[2];
		int choice_No=0;
		System.out.println("Please confirm which parts do you want...");
		System.out.println("Do you want Alloy Chain?");
		String ans = sc.next();
		if(ans.equalsIgnoreCase("Yes")) {
			cost=obj.alloyChain(cost,year);
			choice = "yes";
		}
		
		System.out.println("Do you want gears?");
		ans = sc.next();
		if(ans.equalsIgnoreCase("yes")) {
			cost=obj.gears(cost,year);
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
	
	public int alloyChain(int cost,int year){
		if(year<2006) {
		cost= cost+50;}
		else {
				cost = cost+70;}
		return cost;
	}
public int gears(int cost,int year){
		
	if(year<2006) {
		cost= cost+100;}
		else {
				cost = cost+150;
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
			cost= cost+50+100;
		}else {
			cost = cost+70+150;
		}
	
	}
	return cost;
}
	
	
	
}
