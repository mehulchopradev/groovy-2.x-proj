package com.abc.salary

// Prior to java 8
// interface is a 100% abstract class
// interface cannot have a constructor
/* interface SalariedIndividual {
  Integer getNoOfDaysWorked()

  Double getDailyCost()
} */

trait SalariedIndividual {
  abstract Integer getNoOfDaysWorked()

  abstract Double getDailyCost()

  Double compute() {
    def x = this.getNoOfDaysWorked()
    def y = this.getDailyCost()

    def cost = y * x
    def taxToDeduct = 0.1 * cost
    cost - taxToDeduct - 200
  }
}