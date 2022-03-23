public class swich_ {
    public static void main(String[] args) {
        String signal = "red";
        switch (signal) {
        case "red":
         System.out.println("stop!");
         break;
        case "yellow":
         System.out.println("caution!");
         break;
        case "blue":
        case "green":
         System.out.println("go!");
         break;
        default:
         System.out.println("wrong signal!");
         break;
        }

    }
}
