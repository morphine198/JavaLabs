package edu.lab13;

public class TesterFiles {
    public static void main(String[] args) {

        String name = "some useless text";

        Files task = new Files();
        System.out.println("1: Реализовать запись в файл введённой с клавиатуры информации");
        task.input(name);
        System.out.println("2: Реализовать вывод информации из файла на экран");
        task.output(name);
        System.out.println('\n'+"3: Заменить информацию в файле на информацию, введённую с клавиатуры");
        task.input(name);
        System.out.println("4: Добавить в конец исходного файла текст, введённый с клавиатуры");
        task.add(name);
        System.out.println("Result");
        task.output(name);
    }
}
