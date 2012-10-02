import java.util.Random; 


public class Montecarlo {

	public void isinside(double x,double y){
	
	double radius=7;
		
	double distance = Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));

		if(distance > radius){
		System.out.println("The point "+x+","+y+" is not in the circle.");  
		} else {
		System.out.println("The point "+x+","+y+" is in the circle.");  
		}
	}
	public static void main(String[] args) {
		Montecarlo mc = new Montecarlo();
		Random rnd = new Random();
        int x;
        int y;

        for(int i=0;i<100;i++){
             x=-7 + rnd.nextInt(7);
             y=-7 + rnd.nextInt(7);                                   
             mc.isinside(x,y);
		}
	}

}

