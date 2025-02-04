
class methods2
 {
     static  int BoxVolume(int i, int j, int k) {
		int vol = i*j*k;
		return vol;
	}
    static void printline()
    {
    	System.out.println("----------------------------------------");
    }
    public static void main(String[] args)
    {
    	printline();
      System.out.println("Hello");
     int m = BoxVolume(10,20,30);
     System.out.println(m);
     printline();
    }

	
  }

      
