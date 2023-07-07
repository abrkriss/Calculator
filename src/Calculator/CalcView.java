package Calculator;

import java.util.Scanner;

public class CalcView {
    Scanner iscanner = new Scanner(System.in);

    public double getDouble(){
        //TODO: Добавить обработку ошибок
        System.out.println("Введите число ");
        return iscanner.nextDouble();
    }

    public char getInputOperator(){
        System.out.println("Введите оператор ");
        return iscanner.next().charAt(0);
    }
    public String getOperator(){
        System.out.println("Введите оператор ");
        return iscanner.nextLine();
    }

    public void displayResult(double result){
        System.out.println("Результат " + result);
    }



}
