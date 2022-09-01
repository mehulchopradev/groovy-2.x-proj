package com.abc.salary

class SalaryCalculator {
  static Double compute(salariedIndividual) {
    if (salariedIndividual instanceof SalariedIndividual) {
      def x = salariedIndividual.getNoOfDaysWorked()
      def y = salariedIndividual.getDailyCost()

      def cost = y * x
      def taxToDeduct = 0.1 * cost
      cost - taxToDeduct - 200
    } else {
      println "please pass in something that is a Salaried individual"
    }
  }
}