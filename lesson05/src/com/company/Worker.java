package com.company;

public class Worker {
        private String name;
        private String post;
        private String email;
        private String phoneNumber;
        private int salary;
        private int age;


        Worker(String name, String post, String email, String phoneNumber, int salary, int age) {
            this.name = name;
            this.post = post;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.salary = salary;
            this.age = age;
        }

        public void getInfo() {
            System.out.println("Имя: " + name + ", занимает должность: " + post +
                    ", e-mail: " + email + ", номер телефона: " + phoneNumber + ", зарплата составляет: " + salary + " рублей, возраст: "
            + age);
        }

    int getAge() {
        return age;
    }
    String getFullInfo() {
        return "Имя: " + this.name + ", занимает должность: " +
                  this.post + ", e-mail: " + email +
                ", номер телефона: " +  this.phoneNumber  +
                ", зарплата составляет: " +  this.salary  + " рублей, возраст: " +
                this.age + " ";

    }



    }


