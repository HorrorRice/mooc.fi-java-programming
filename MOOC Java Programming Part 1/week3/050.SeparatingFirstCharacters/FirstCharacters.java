import java.util.Scanner;

public class FirstCharacters {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
            String input = reader.nextLine();
          
//            if(input.length()>3){
//               for (int i=0;i<3;i++){
//                System.out.println((i+1)+". character: "+input.charAt(i));
//                }
//            }
              int i = 0;
              while (i < 3){
                  if(input.length() > 3){
                  System.out.println((i+1)+". character: " + input.charAt(i));
                  i++;         
                  }
              }
   
        }
    }

