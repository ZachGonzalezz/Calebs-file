import jdk.nashorn.api.tree.WhileLoopTree;

/**
 * loops
 */
public class loops {

    public static void main(String[] args) {
        int myNumber = 25;
        for(int i = 0;
         i < 5;
          i++){
            System.out.println("hello");
        }System.out.println(myNumber);
        while (myNumber < -2)
        {
            System.out.println("Test");
            myNumber--;
        }
      

    } 
}