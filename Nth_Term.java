class Nth_Term
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(findNthTerm());
      int findNthTerm(int n) {
    
        
        int result = n*(n+1)/2;
        return result;
    }
  }
}
        
        
        
  
