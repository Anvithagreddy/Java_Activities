package Activity3_Abstract_class;

public class ODIMatch extends Match {
	
	public float calculateRunRate() {
		float val= getCurrentover();
		float v= 50-val;
		return (remaining_runs()/(v));
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
		return 300-(balls_bowled+v);
		
	}
	
	public void display(double reqRunrate, int balls) {
	   System.out.println("Requirements:");
	   System.out.println("Need "+remaining_runs()+" runs in "+calculateBalls()+" balls");
	   System.out.println("Required Runrate: "+String.format("%.2f",calculateRunRate()));
	}


}