import java.util.*;
class StopWatch
{
	private long start = 0;
	private long stop = 0;

    public final void start() {
        start = System.currentTimeMillis();
    }

    public final void stop(/*long stopTime*/) {
        stop = System.currentTimeMillis();//stopTime;//System.currentTimeMillis();
    }
    void calculteTime()
    {
    	System.out.println("Total Time is "+(stop - start)/*/1000*/+" millisecond");
    }
    boolean yourChoice(char ch)
    {
    	if(ch == 'y' || ch == 'Y')
    	{
    		stop(/*stp*/);
			calculteTime();
			return true;
    	}
    	return false;
    }
    public static void main(String[] args) {
			StopWatch sw = new StopWatch();
			Scanner scan  = new Scanner(System.in);
			// System.out.println("Enter stop time");
			// long stp = scan.nextLong();
			System.out.println("Do you want to start stop watch time : (y/n)");
			char ch = scan.nextLine().charAt(0);
			if(ch == 'y' || ch == 'Y'){
				sw.start();

				System.out.println("If you want to stop time then only Enter Y :");

				char stopNow = scan.nextLine().charAt(0);
				while(sw.yourChoice(stopNow) != true)
				{
					System.out.println("Wrong input! you shoud enter only (y/Y) for stop");
					stopNow = scan.nextLine().charAt(0);
				}

			// 	if(stopNow == 'y' || stopNow == 'Y'){				
			// 	sw.stop(/*stp*/);
			// 	sw.calculteTime();
			// }else{
			// 	System.out.println("you shoud enter only (y/Y) for stop");
			// }

    	}	
}
}
