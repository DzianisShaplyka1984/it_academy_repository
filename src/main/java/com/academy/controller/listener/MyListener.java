package com.academy.controller.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyListener implements HttpSessionAttributeListener {

  @Override
  public void attributeAdded(HttpSessionBindingEvent event) {
    System.out.println("attribute added");
  }
}
