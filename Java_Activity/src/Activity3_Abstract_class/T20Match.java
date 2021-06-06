package Activity3_Abstract_class;

public class T20Match extends Match {
	
		public double calculateRunRate() {
			return (remaining_runs()/((20.0-getCurrentover())));
		}
		
		public int remaining_runs()
		{
			int score=getCurrentscore();
			int target=getTarget();
			int needed_runs=target-score;
			return needed_runs;
		}
		
		public  int calculateBalls() {
			int balls_bowled=6*(int)getCurrentover();
			float val = getCurrentover()*10;
			int v=(int)val%10;
			return 120-(balls_bowled+v);
			
		}
		
		public void display(double reqRunrate, int balls) {
		   System.out.println("Requirements:");
		   System.out.println("Need "+remaining_runs()+" runs in "+calculateBalls()+" balls");
		   System.out.println("Required Runrate: "+String.format("%.2f",calculateRunRate()));
		}



}