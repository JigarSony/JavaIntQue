package Pack1;

public class VowelAndConsonant {

    public static void main(String[] args) {

        char ch = 'E';


        if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch + " is Vowel");
        }else if(ch =='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                System.out.println(ch + " is Vowel");
            }else {
            System.out.println(ch + " is Consonant");
        }


        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is Vowel");
                break;

                default:
                    System.out.println(ch + " is Consonant");
                    break;
        }

    }
}
