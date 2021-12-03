public class Main {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        MyStringClass myStringClass = new MyStringClass();

        System.out.println("Длина строки:" + str.length());

        System.out.println("Отсутствуют ли знаки препинания: " + myStringClass.checkPunctuationMarks(str));

        System.out.println("Проверка на палиднром: " + myStringClass.checkPalindrom(str));

        myStringClass.print(str);
    }
}
