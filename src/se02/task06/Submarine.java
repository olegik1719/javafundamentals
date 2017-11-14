package se02.task06;

public class Submarine{
   private String name;
   
   private Tourbine leftTourbine;
   private Tourbine rightTourbine;
   private Tourbine centerTourbine;
   
   class Tourbine{
       public Tourbine start(){
           System.out.printf("We all live in %s, %s, %s \n", name, name, name);
		   return this;
       }
   }

   public Submarine(String name){
       this.name = name;
       System.out.printf("In the town where I was born\nLived a man, who sailed to sea\nAnd he told us of his life\nIn the land of submarines\n");
       leftTourbine = new Tourbine();
       rightTourbine = new Tourbine();
       centerTourbine = new Tourbine();
   }

   public Submarine letsgo(){
       System.out.println("So we sailed up to the sun\nTill we found the sea of green\nAnd we lived beneath the waves\nIn our yellow submarine");
       leftTourbine.start();
       rightTourbine.start();
       centerTourbine.start();
	   return this;
   }

   public static void main(String[] args){
       Submarine yellowSubmarine = new Submarine("Yellow Submarine");
       yellowSubmarine.letsgo();
   }
}
