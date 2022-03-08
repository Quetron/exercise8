package com.company;

import java.util.ArrayList;

public class BigBookOfContacts {
    static ArrayList<Contact> collectionOfContacts = new ArrayList<>();

    public void addObject(Contact o){
        collectionOfContacts.add(o);
    }

    public void showAll(){
        for(Contact c: collectionOfContacts){
            c.display();
        }
    }

}
