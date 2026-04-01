import java.util.*;

public class Count_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String str1 = str.toLowerCase();

        int n = str.length();
        int count = 0;

        for(int i = 0; i<n; i++){
            char ch = str1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("Vowel found at index " + i);
                count++;
            }
        }
        System.out.println(count);
    }
}
