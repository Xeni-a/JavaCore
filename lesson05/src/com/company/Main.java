package com.company;

public class Main {

    public static void main(String[] args) {

		Worker worker1 = new Worker("Xenia", "bar", "nojhoi.h@yandex.ru", "89883117009", 45000, 22);

		worker1.getInfo();


		Worker[] workers = {
				new Worker ("Boris", "manager", "hifd.g@mail.ru", "88002121300", 20000, 45),
				new Worker("Philip", "chef","hifd.g@mail.ru", "88004141200", 45000, 25),
				new Worker("Angela", "cleaner", "hifd.g@mail.ru", "88002525236", 15000, 54),
				new Worker("Marta", "technologist","hifd.g@mail.ru", "88004545477", 60000, 18),
				new Worker("Antony", "boss","hifd.g@mail.ru", "88002525589", 80000, 60)
		};

		for (int i = 0; i < workers.length; i++)
			if(workers[i].getAge() > 40) {
				System.out.println(workers[i].getFullInfo());
			}

    }
}
