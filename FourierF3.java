public class FourierF3 {
	
	public static void main(String[] args) {
		
		double a0 = 5.0;
    double an = 0.0;
		double sum = 0.0;
		
		for(int n=1;n<=100;n++) {
			
      double bn = (-10 / (n * Math.PI));
      
			sum += a0 + an*Math.cos(n*Math.PI)+bn*Math.sin(n*Math.PI);
		}
		
		System.out.println("The Fourier series up to the 100th harmonic is: "+sum);
		
	}

}
