import java.util.Scanner;
import java.util.StringTokenizer;
class DisplayTokens{

    private static void displayAddTokens(StringTokenizer st){
        int sum = 0;
        System.out.println();
        while(st.hasMoreTokens()){
            int nt = Integer.parseInt(st.nextToken());
            System.out.print(nt + "  ");
            sum += nt;
        }
        System.out.println("\n\tTotal Sum:  " + sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type and separate the integers with any non numeric delimiter;\nDO NOT USE SPACE!\n\t");
        String str = sc.next();
        System.out.println("\nSpecify your delimiter:\n\t");
        String d = sc.next();
        StringTokenizer st = new StringTokenizer(str, d, false);
        displayAddTokens(st);
        sc.close();
    }
}
    // float SPEED_OF_LIGHT = 123.432;
    // User user = new User();

    // camelCase
    // PascalCase
    // SNAKE_UPPER_CASE

    // const NON_LEAP_YEAR = 365;
    // for(int i=0; i<NON_LEAP_YEAR ;i++){

    // }