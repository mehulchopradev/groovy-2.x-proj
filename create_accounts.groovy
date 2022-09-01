import com.abc.banking.Account

import com.abc.banking.exceptions.MinBalNotMaintainedException

def a1 = new Account(name: 'mehul', number: 1234, balance: 10000)
// println a1.deposit(2000)
println a1 + 2000
// Internally
// println a1.plus(2000)
// println Account.plus(2000, a1)

try {
  // println a1.withdraw(50)
  println a1 - 50
  // internally
  // println a1.minus(50)
  // println Account.minus(50, a1)
} catch (MinBalNotMaintainedException e) {
  e.printStackTrace()
} catch (IllegalArgumentException e) {
  println "Hey please enter the proper withdrawl amount"
}