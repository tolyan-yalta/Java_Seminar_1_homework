// Вывести все простые числа от 1 до 1000
// (простые числа - это числа которые делятся только на себя и на единицу без остатка.
// Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)

public class Task_3 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (simple_number(i)){
                System.out.println(i);
                // System.out.print(i + " ");   Вывод в одну строку через пробел
            }
        }


    }

    public static boolean simple_number(int number){
        boolean result = false;
        if (number == 1 || number == 2 || number == 3){
            result = true;
            return result;
        }
        if(number % 2 == 0){
            return result;
        }
        for(int i = 3; i * i <= number; i+= 2){
            if(number % i == 0){
                return result;
            }
        }
        result = true;
        return result;
    }
}
