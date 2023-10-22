package org.example;

import Util.HiberanateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = HiberanateUtil.getSessionFactory();
        Session session = factory.openSession();

    }
}//kot