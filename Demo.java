

class Demo{
   static int val_1;
   int val_2;
   static{
      val_1 = 67;
      System.out.println("The static block has been called.");
   }
   static{
	      val_1 = 68;
	      System.out.println("The static block has been called twice.");
	   }
   static{
	      val_1 = 68;
	      System.out.println("The static block has been called thrice.");
	   }
   
   {
	   System.out.println("Hello");
   }
}







