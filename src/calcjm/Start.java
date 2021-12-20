package calcjm; //директория

import java.util.Scanner; // импортируем класс Scanner для чтения

public class Start {

    public static void main(String[] args) {
        try{

            System.out.println("Калькулятор для выражений вида: \"Число1 Операция Число2\", через пробел. Допускаются числа от 1 до 10 или от I до X включительно. Операции: + - * /");  // выводим первичный текст

            Scanner scanner = new Scanner(System.in); // создаем объект класса Сканер из Джава Утиль
            System.out.print("Введите выражение: "); // Выводим текст в консоль
            String inString = scanner.nextLine(); // создаем объект (String) , считывая введенную строку


            Calc calc = new Calc();   // создаем объект класса калькулятор
            String result = calc.result(inString); // создается объект result (String), передав в качестве аргумента объект inString в метод result класса Calc
            System.out.println("Ответ: " + result);  // выводим результат в консоль

        }
        catch(CalcException  e){

        }
    }
}
