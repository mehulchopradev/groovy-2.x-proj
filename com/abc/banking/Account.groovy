package com.abc.banking

import com.abc.banking.exceptions.MinBalNotMaintainedException

class Account {
  String name
  Integer number
  Double balance

  static final Double MIN_BAL_NEEDED = 1000

  Double deposit(Double amt) {
    this.balance += amt
  }

  Double plus(Double amt) {
    this.deposit amt
  }

  Double withdraw(Double amt) {
    println "Transaction starts..."

    try {
      if (amt <= 0) {
        throw new IllegalArgumentException('the amt to withdraw must be more than 0')
      }
      if (this.balance - amt < MIN_BAL_NEEDED) {
        throw new MinBalNotMaintainedException('Balance is going below the threshold set by the bank')
      }
      
      this.balance -= amt
    } finally {
      // set of stmts that will always execute, irrespective of whatever happens in the try block
      // clearing out resources (server connections, file connections, db connections)
      println "Transaction ends!"
    }
  }

  Double minus(Double amt) {
    this.withdraw amt
  }
}