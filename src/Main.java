public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 1");
        int summ = 0;
        for (final int number : arr){
            summ = summ + number;
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");
    }


    public static void task2 () {
        int[] arr = generateRandomArray();
        System.out.println("Задача 2");
        int min = arr[0];
        int max = arr[0];
        for (final int current : arr) {
            System.out.print(current + ",");
            if (current > max){
                max = current;
            }
        }
        System.out.println();
        System.out.println("Max " + max);
        for (final int current : arr) {
            System.out.print(current + ",");
            if (current < min ){
                min = current;
            }
        }
        System.out.println();
        System.out.println("Min " + min);
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 3");
        double summ = 0;
        double average;
        int lengthArr = arr.length;
        for (final int number : arr) {
            summ = summ + number;
        }
        average = summ / lengthArr;
        System.out.println("Средняя сумма трат за месяц составила "+ average +" рублей в день");
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }
}