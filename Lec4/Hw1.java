package Lec4;

public class Hw1 {
    public static void main(String[] args) {
        String text = "Tôi học lập trình, học lập trình rất hay";

        // Đếm số lượng từng từ
        System.out.println("a) Đếm số lượng từ:");
        countWords(text);

        // Xóa các nguyên âm
        String textWithoutVowels = removeVowels(text);
        System.out.println("Xóa các nguyên âm:");
        System.out.println(textWithoutVowels);
    }

    public static void countWords(String text) {
        text = text.toLowerCase().replace(",", "").replace(".", "");
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) continue;
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "";
                }
            }
            System.out.println(words[i] + " : " + count + " từ");
        }
    }

    public static String removeVowels(String text) {
        String result = "";
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (vowels.indexOf(c) == -1) {
                result += c;
            }
        }
        return result;
    }
}
