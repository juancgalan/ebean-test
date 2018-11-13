package com.zenathark.reservacion;

import com.zenathark.reservacion.domain.Users;
import io.ebean.Ebean;
import io.ebean.EbeanServer;

import java.util.List;

public class Main {
  public static void main(String... args) {
    Users user= new Users();
    user.setId(1);
    user.setName("Hello world");


    EbeanServer server = Ebean.getDefaultServer();

    // insert the customer in the DB
    server.save(user);
    System.out.println("+++++++++++++"+ user.getId());

    // Find by Id
    Users foundHello = server.find(Users.class, 1);

    System.out.print("hello " + foundHello.getName());

    // delete the customer
    server.delete(user);
  }
}
