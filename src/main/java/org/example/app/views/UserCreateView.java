package org.example.app.views;

import java.util.Scanner;

public class UserCreateView {

    // Получение данных.
    public String[] getData() {

        Scanner scanner = new Scanner(System.in);

        String title = "Enter name: ";
        System.out.print(title);
        String name = scanner.nextLine().trim();
        title = "Enter phone in format xxx xxx-xxxx: ";
        System.out.print(title);
        String phone = scanner.nextLine().trim();
        title = "Enter email in format example@gmail.com: ";
        System.out.print(title);
        String email = scanner.nextLine().trim();

        return new String[] {name, phone, email};
    }

    // Вывод результата.
    public void getOutput(String output) {
        System.out.println(output);
    }
}
