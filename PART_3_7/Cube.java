package PART_3_7;
 interface Cube {
     public void cube(int a); // Method is created to find cube
     // Default method
     default void display(){
         System.out.println("Default Method");
     }
}
