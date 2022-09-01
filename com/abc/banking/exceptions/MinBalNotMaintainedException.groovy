package com.abc.banking.exceptions;

class MinBalNotMaintainedException extends Exception {
  MinBalNotMaintainedException(String message) {
    super(message) // calls the super class constructor
    // should always be the first statement in the constructor
  }
}