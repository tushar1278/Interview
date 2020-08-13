import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	
	static int final_cost;
	
	  
	

	public static void main(String[] args) {
		
		Main obj = new Main();
		int cost=0;
		int year;
		Scanner input1= new Scanner(System.in);
		
		System.out.println("Select input year...");
		year = input1.nextInt();
		
		
		obj.cycle_Inputs(cost, year);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
System.out.println("Total cost is :"+final_cost);
	}
	public void cycle_Inputs(int cost,int year){
		Main obj1 = new Main();
		Scanner input1= new Scanner(System.in);
		System.out.println("How many parts you want to add?");
		int no_Of_Parts = input1.nextInt();
		int f_Cost=0;
		int hb_Cost=0;
		int seat_Cost=0;
		int wheel_Cost=0;
		int ca_Cost=0;
		int[][] mulCost= new int[no_Of_Parts][5];
		for(int i=0;i<no_Of_Parts;i++) {
		System.out.println("Select a part number from following list...");
		System.out.println("1 - frame");
		System.out.println("2 - handle bar");
		System.out.println("3 - seating");
		System.out.println("4 - wheels");
		System.out.println("5 - chain assembly");
		
		String prt_No = input1.next();
		if(prt_No.equals("1")) {
			Frame f =new Frame();
			int[] val=new int[2];
			val=f.part(year,0);
			cost =cost +val[0];
			System.out.println("Cost of frame is :"+val[0]);
			mulCost[i][0]=1;
			mulCost[i][1]=val[1];
			mulCost[i][2]=year;
			
		}
		else if(prt_No.equals("2")) {
			HandleBar hb = new HandleBar();
			int[] val=new int[2];
			val=hb.part(year,0);
			cost =cost +val[0];
			System.out.println("Cost of handle is :"+val[0]);
			mulCost[i][0]=2;
			mulCost[i][1]=val[1];
			mulCost[i][2]=year;
			
		}
		else if(prt_No.equals("3")) {
			Seating s = new Seating();
			int[] val=new int[2];
			val=s.part(year,0);
			cost =cost +val[0];
			System.out.println("Cost of seating is :"+val[0]);
			mulCost[i][0]=3;
			mulCost[i][1]=val[1];
			mulCost[i][2]=year;
		}else if(prt_No.equals("4")) {
			Wheels w = new Wheels();
			int[] val=new int[2];
			val=w.part(year,0);
			cost =cost +val[0];
			System.out.println("Cost of wheels is :"+val[0]);
			mulCost[i][0]=4;
			mulCost[i][1]=val[1];
			mulCost[i][2]=year;
		}
		else if(prt_No.equals("5")) {
			ChainAssembly ca = new ChainAssembly();
			int[] val=new int[2];
			val=ca.part(year,0);
			cost =cost +val[0];
			System.out.println("Cost of chain assembly is :"+val[0]);
			mulCost[i][0]=5;
			mulCost[i][1]=val[1];
			mulCost[i][2]=year;
		}
		
		}
		System.out.println("Total cost of Cycle is:"+cost);
		
		System.out.println("Do you want to calculate the cost of 1000 cycles?");
		String ans = input1.next();
		int cost1 = 0;
		if(ans.equalsIgnoreCase("yes")) {
			for(int i=0;i<1000;i++) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Future<Integer> task1Future = executorService.submit(new Callable<Integer>() {
			  public Integer call() throws Exception {
			    
			   executorService.execute( obj1.multi_Cost(mulCost, no_Of_Parts, cost1));
			    
			    return cost1;
			  } 
			  
			}
	
		);
			}
			
			
		}
//		if(ans.equalsIgnoreCase("yes")) {
//			int costOfMany=0;
//			
//			for(int i=0;i<1000;i++) {
//				
//				
//				
//				int cost_final=0;
//				Thread ti = new Thread(new Runnable() {
//					
//							        @Override
//								        public void run() {
//								         
//								       obj1.multi_Cost(mulCost,no_Of_Parts,costOfMany);
//								   
//								        }
//								    });
//				
//				ti.start();
//				
//				System.out.println("Thread no :"+Thread.activeCount());
//				
//				
//			}
//			
//			System.out.println("Total cost is:"+final_cost);
//		}
		
		
		
		
		
	}
	
	public Runnable multi_Cost(int[][] mulCost,int no_Of_Parts,int cost) {
		
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	for(int i=0;i<no_Of_Parts;i++) {
		
		if(mulCost[i][0]==1) {
			Frame f=new Frame();
		 cost =cost+	f.multi_Cost(mulCost[i][1], mulCost[i][2], cost);
		 
			
			
		}else if(mulCost[i][0]==2) {
			HandleBar hb=new HandleBar();
		 cost =cost+	hb.multi_Cost(mulCost[i][1], mulCost[i][2], cost);
			
			
		}
		else if(mulCost[i][0]==3) {
			Seating s=new Seating();
		 cost =	cost+s.multi_Cost(mulCost[i][1], mulCost[i][2], cost);
			
			
		}else if(mulCost[i][0]==4) {
			Wheels w=new Wheels();
		 cost =	cost+w.multi_Cost(mulCost[i][1], mulCost[i][2], cost);
			
			
		}else if(mulCost[i][0]==5) {
			ChainAssembly ca=new ChainAssembly();
		 cost =cost+	ca.multi_Cost(mulCost[i][1], mulCost[i][2], cost);
			
			
		}
		
	}
	
	final_cost=final_cost+cost;
		
		
		return null;
		
	}
	

}

