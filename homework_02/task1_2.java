public class task1_2 {
    //Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к
// падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void main(String[] args) {
        float input = InputUtils.getFloatInput();
        System.out.println("Введенное число: " + input);
    }
}