public class StringAPI {
    public static void main(String[] args) {
        String s = "the belling we got kill you vibe";

        // 1. char charAt(int index);  => 返回给定索引位置的char值
        System.out.println(s.charAt(2));

        // 2. int codePointAt(int index); => 返回索引处字符的Unicode值
        System.out.println(s.codePointAt(2));

        // 3. int offsetByCodePoints(int statIndex, int cpCount) => 返回从索引index处偏移codePointOffset个代码点的索引
        System.out.println(s.offsetByCodePoints(3, 2));
    }
}
