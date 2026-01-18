package imp_questions_java_programing;

public class A16 {


//Check whether a character is vowel or not

    public static void main(String[] args) {
        char ch = 'A';
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is not a vowel");
        }
    }
}
