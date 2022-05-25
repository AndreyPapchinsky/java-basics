package Task_five;

public class Text {
    public static void main(String[] args) {
        palindrome(longWord(replace(count(reverse()))));
    }
    private static String longWord(String string){
        String[] array = string.split(" ");
        int longest = 0;
        for (int i = 1; i < array.length; i++){
            if (array[longest].length() < array[i].length()){
                longest = i;
            }
        }
        System.out.println(array[longest]);
        return array[longest];
    }
    private static void palindrome(String string){
        if (string.equalsIgnoreCase(new StringBuilder(string).reverse().toString())){
            System.out.println("Слово \"" + string + "\" является палиндромом");
        }else {
            System.out.println("Слово \"" + string + "\" не является палиндромом");
        }
    }
    private static String replace(String string){
        System.out.println(string.replace(" бяка", ""));
        return string;
    }
    private static String count(String string){
        System.out.println(string.split("Написать метод для поиска").length -1);
        return string;
    }
    private static String reverse (){
        String[] words = new StringBuilder("ьтасипаН дотем ялд аксиоп огомас огоннилд аволс в етскет .акяб").reverse().toString().split(" ");
        StringBuilder string = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)string.append(words[i]).append(" ");
        System.out.println(string);
        return String.valueOf(string);
    }
}
