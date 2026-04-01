public class even_index_to_A {
    public static void main(String[] args) {
        String str = "Sandeep Panigrahi";
        String s = "";

        for(int i = 0; i<str.length(); i++){
            if(i%2==0) {
                s += 'a';
            }
            else{
                s += str.charAt(i);
            }
        }
        System.out.println(s);
    }
}
