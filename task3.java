public class Main
{
    // Используя левый указатель на начало строки и правый на конец строки, проверяем, что k и len - k - 1 символы равны
    public static boolean IsPolindrom(String str) {
        int length = str.length();
        int left = 0;
        int right = length - 1;
        boolean flag = true;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                flag = false;
            }
        }
        return flag;
    }
}
