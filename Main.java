import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Main n = new Main();
        Scanner in = new Scanner(System.in);
        int x_first = n.getIntInput("введите число, знаков не менее 2: ");
        int res_first = n.sumLastNums(x_first);
        System.out.println("сумма 2 последних чисел = " + res_first);

        int x_second = n.getIntInput("введите число: ");
        boolean res_second = n.isPositive(x_second);
        System.out.println("число положительное?: " + res_second);

        out.printf("введите символ: ");
        char x_3 = in.next().charAt(0);
        boolean res_3 = n.isUpperCase(x_3);
        System.out.println("символ является большой буквой в диапазоне от A до Z?: " + res_3);

        int x_4 = n.getIntInput("введите первое число: ");
        int y_4 = n.getIntInput("введите второе число: ");
        boolean res_4 = n.isDivisor(x_4, y_4);
        System.out.println("одно число делит другое нацело?: " + res_4);

        int x_5 = n.getIntInput("введите 1 число: ");
        for (int i = 2; i < 6; i++) {
            int y_5 = n.getIntInput("введите " + i + " число: ");
            x_5 = n.lastNumSum(x_5, y_5);
        }
        System.out.println("результат поочередного сложения цифр в разряде единиц = " + x_5);

        int x_6 = n.getIntInput("введите x: ");
        int y_6 = n.getIntInput("введите y: ");
        double res_6 = n.safeDiv(x_6, y_6);
        System.out.println("результат деления x на y:" + res_6);

        int x_7 = n.getIntInput("введите x: ");
        int y_7 = n.getIntInput("введите y: ");
        String res_7 = n.makeDecision(x_7, y_7);
        System.out.println("результат: " + res_7);

        int x_8 = n.getIntInput("введите x: ");
        int y_8 = n.getIntInput("введите y: ");
        int z_8 = n.getIntInput("введите z: ");
        boolean res_8 = n.sum3(x_8, y_8, z_8);
        System.out.println("два любых числа можно сложить чтобы получить третье?: " + res_8);

        int x_9 = n.getIntInput("введите число: ");
        String res_9 = n.age(x_9);
        System.out.println("правильная форма: " + x_9 + " " + res_9);

        in.nextLine(); // Чтобы считать строку после ввода чисел
        System.out.printf("введите день недели: ");
        String x_10 = in.nextLine();
        n.printDays(x_10);

        int x_11 = n.getIntInput("введите число: ");
        System.out.println("числа от заданного до 0 наоборот: ");
        System.out.println(n.reverseListNums(x_11));

        int x_12 = n.getIntInput("введите x: ");
        int y_12 = n.getIntInput("введите y: ");
        System.out.println("число " + x_12 + " в степени " + y_12 + " = ");
        System.out.println(n.pow(x_12, y_12));

        int x_13 = n.getIntInput("введите число: ");
        System.out.println("все цифры в этом числе одинаковые?: ");
        System.out.println(n.equalNum(x_13));

        int x_14 = n.getIntInput("введите число: ");
        System.out.println("левый треугольник:");
        n.leftTriangle(x_14);

        n.guessGame();

        System.out.println("Изначальный массив: ");
        int[] arr_16 = {1, 2, 3, 4, 2, 2, 5};
        System.out.println(Arrays.toString(arr_16));
        int x_16 = n.getIntInput("введите число из массива: ");
        System.out.println("последняя позиция заданного числа");
        System.out.println(n.findLast(arr_16, x_16));

        System.out.println("Изначальный массив: ");
        int[] arr_17 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr_17));
        int x_17 = n.getIntInput("введите число для вставки: ");
        int pos = n.getIntInput("введите позиция для вставки: ");
        System.out.println("массив со вставленным числом");
        System.out.println(Arrays.toString(n.add(arr_17, x_17, pos)));

        System.out.println("Изначальный массив: ");
        int[] arr_18 = {};
        System.out.println(Arrays.toString(arr_18));
        n.reverse(arr_18);
        System.out.println("перевернутый массив");
        System.out.println(Arrays.toString(arr_18));

        System.out.println("Изначальный массив a: ");
        int[] arr1_19 = {};
        System.out.println(Arrays.toString(arr1_19));
        System.out.println("Изначальный массив b: ");
        int[] arr2_19 = {7, 8, 9};
        System.out.println(Arrays.toString(arr2_19));
        System.out.println("соединенный массив");
        System.out.println(Arrays.toString(n.concat(arr1_19, arr2_19)));

        System.out.println("Изначальный массив: ");
        int[] arr_20 = {};
        System.out.println(Arrays.toString(arr_20));
        System.out.println("массив без отрицательных чисел");
        System.out.println(Arrays.toString(n.deleteNegative(arr_20)));

        in.close();
    }

    private int getIntInput(String prompt) {
        Scanner in = new Scanner(System.in);
        System.out.printf(prompt);
        while (!in.hasNextInt()) {
            System.out.println("Ошибка ввода! Введите целое число.");
            in.next();
            System.out.printf(prompt);
        }
        return in.nextInt();
    }

    public int sumLastNums (int x) {
        return x%10 + x/10%10;
    }

    public boolean isPositive (int x) {
        if (x>0) return true;
        else return false;
    }

    public boolean isUpperCase (char x) {
        if (x >= 'A' && x <= 'Z') return true;
        else return false;
    }

    public boolean isDivisor (int a, int b) {
        if (a%b == 0 || b%a == 0) return true;
        else return false;
    }

    public int lastNumSum(int a, int b) {
        return a%10+b%10;
    }

    public double safeDiv (int x, int y) {
        if (y == 0) return 0;
        else return(double) x/y;
    }

    public String makeDecision (int x, int y) {
        if (x > y) return x + ">" + y;
        else if (x< y) return x+"<" + y;
        else return x + "=" + y;
    }

    public boolean sum3 (int x, int y, int z) {
        if (x+y ==z || x+z == y || y+z == x) return true;
        else return false;
    }

    public String age (int x) {
        switch (x) {
            case 11,12,13,14: return "лет";
            default: switch (x%10) {
                case 2,3,4: return "года";
                case 1: return "год";
                default: return "лет";
            }
        }
    }

    public void printDays (String x) {
        switch (x) {
            case "понедельник": out.println("Понедельник");
            case "вторник": out.println("Вторник");
            case "среда": out.println("Среда");
            case "четверг": out.println("Четверг");
            case "пятница": out.println("Пятница");
            case "суббота": out.println("Суббота");
            case "воскресенье": out.println("Воскресенье"); break;
            default: out.println("неправильный день недели");
        }
    }

    public String reverseListNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    public int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public boolean equalNum(int x) {
        int lastDigit = x % 10;
        while (x > 0) {
            if (x % 10 != lastDigit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void guessGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int target = random.nextInt(10);
        int attempts = 0;
        int guess = -1;

        while (guess != target) {
            System.out.print("Введите число от 0 до 9: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess != target) {
                System.out.println("Вы не угадали, попробуйте снова.");
            }
        }

        System.out.println("Вы угадали! Вы отгадали число за " + attempts + " попыток.");
    }

    public int findLast(int[] arr, int x) {
        if (arr == null || arr.length == 0) {
            System.out.println("Массив пуст или null");
            return -1;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;  // Если элемент не найден
    }

    public int[] add(int[] arr, int x, int pos) {
        if (arr == null) {
            System.out.println("Массив null");
            return new int[0];
        }

        if (pos < 0 || pos > arr.length) {
            System.out.println("Некорректная позиция: " + pos);
            return arr;  // Возвращаем оригинальный массив
        }

        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == pos) {
                newArr[i] = x;
            } else {
                newArr[i] = arr[j++];
            }
        }

        return newArr;
    }

    public void reverse(int[] arr) {
//        if (arr == null || arr.length == 0) {
//            System.out.println("Массив пуст или null");
//            return;
//        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public int[] concat(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            System.out.println("Один из массивов null");
            return new int[0];  // Возвращаем пустой массив
        }

        int[] newArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, newArr, 0, arr1.length);
        System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);
        return newArr;
    }

    public int[] deleteNegative(int[] arr) {
        if (arr == null) {
            System.out.println("Массив пуст или null");
            return new int[0];  // Возвращаем пустой массив
        }

        return Arrays.stream(arr)
                .filter(n -> n >= 0)
                .toArray();
    }
}