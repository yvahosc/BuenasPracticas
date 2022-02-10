package Main;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean flag=true;
        int option=0;
        Scanner keyboard = new Scanner(System.in);
        while (flag) {            
            System.out.println("unos");
            option=keyboard.nextInt();
            switch(option){
                case 1:
                    System.out.println("popo");
                    break;
            }
        }
        
    }
    
}
