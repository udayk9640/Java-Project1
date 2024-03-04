
class Demo{
   static int val_1;
   int val_2;
   static{
      val_1 = 67;
      System.out.println("The static block has been called.");
   }
   {
	   System.out.println("Hello");
   }
}

