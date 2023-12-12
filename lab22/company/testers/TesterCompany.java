package edu.lab22.company.testers;

import edu.lab22.company.CreateTextDocument;
import edu.lab22.company.Editor;
import edu.lab22.company.ICreateDocument;

public class TesterCompany {
    public static void main(String[] args) {
        // Создаем фабрику для документов
        ICreateDocument documentFactory = new CreateTextDocument();

        // Создаем экземпляр редактора с фабрикой документов
        Editor editor = new Editor(documentFactory);

        // Создаем новый документ
        editor.createNewDocument();

        // Открываем существующий документ
        editor.openDocument();

        // Сохраняем текущий документ
        editor.saveDocument();
    }
}
