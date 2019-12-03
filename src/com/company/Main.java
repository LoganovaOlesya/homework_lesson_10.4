package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public final class Main {

    public static void main(final String[] args){

        Map<String, String> user = new HashMap<String, String>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter count of users");

        int n = Integer.parseInt(input.nextLine());

        System.out.println("Count of users: " + n);

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter login for user №" + i + ":\r");
            String login = input.nextLine();

            System.out.println("Enter password for user №" + i + ":\r");
            String password = input.nextLine();

            user.put(login, password);
        }

        System.out.println("Enter login:\r");
        String login = input.nextLine();

        for (Map.Entry<String, String> entry : user.entrySet()) {

            if (login.equals(entry.getKey())) {
                System.out.println("Password: " + entry.getValue());
            }
        }
    }
}