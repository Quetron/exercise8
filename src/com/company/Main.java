package com.company;

public class Main {

    public static void main(String[] args) {
        Contact contact1 = new Contact("Rick Astly", "RickRoll@gmail.com");
        BuisnessContact buisnessMan = new BuisnessContact("Jim", "Jim@gmail.com", "614-867-5309");
        BigBookOfContacts book = new BigBookOfContacts();

        book.addObject(contact1);
        book.addObject(buisnessMan);

        book.showAll();

    }
}
