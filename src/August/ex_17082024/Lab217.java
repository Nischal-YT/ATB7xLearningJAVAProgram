package August.ex_17082024;

public class Lab217 {
    public static void main(String[] args) {
        try {
            int a = 10/0; // Uncheck Ath E
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //try {
//            FileReader f = new FileReader(new File("c://a.txt"));/////checked exception
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
 //       }

    }
}
