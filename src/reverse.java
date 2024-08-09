public class reverse {
    public static void main(String[] args) {
        // reversestr("Anjali");
        System.out.println(reversestr("Anjali"));
    }
    public static String reversestr(String str){
        String reversed = "";
        char ch;
        for(int i = str.length()-1;i>=0;i--){
            ch = str.charAt(i);
            reversed += ch;
        }
        return reversed;
    }
}
