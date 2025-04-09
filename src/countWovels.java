public class countWovels {
    public static void main(String[] args) {

        String word = "Hello World";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                count++;
            }
            else if(word.charAt(i) == 'e'){
                count ++;
            }
            else if(word.charAt(i) == 'i'){
                count ++;
            }
            else if(word.charAt(i) == 'o'){
                count ++;
            }
            else if(word.charAt(i) == 'u'){
                count ++;
            }
        }
        System.out.println(count);
    }
}
