package ru.geekbrain;

import com.google.gson.Gson;

/**
 * Сериализация в JSON
 * Десериализация из JSON
 * Проверка на равенство с использованием equals
 */
public class App {
    public static void main(String[] args) {
        // Создание объекта Person
        Person person = new Person("Mike", "Ivanov", 23);

        // Сериализация в JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("Сериализованный объект в JSON: " + json);

        // Десериализация из JSON
        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println("Десериализованный объект: " + deserializedPerson);


        // Проверка на равенство с использованием equals
        System.out.println("Объекты равны: " + person.equals(deserializedPerson));
    }
}
