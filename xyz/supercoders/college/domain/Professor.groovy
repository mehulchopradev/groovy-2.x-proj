package xyz.supercoders.college.domain

import com.abc.salary.SalariedIndividual

// Professor IS-A (CollegeUser) (Person) (HumanBeing)
// CollegeUser super class / parent class
// Professor sub class / child class
// groovy bean
class Professor extends CollegeUser implements SalariedIndividual {
  List subjects

  Double costPerDay

  Integer noOfDays

  // must override all the methods from the interface
  Integer getNoOfDaysWorked() {
    this.noOfDays
  }

  Double getDailyCost() {
    this.costPerDay
  }

  Professor leftShift(subject) {
    this.subjects.add(subject)
    return this
  }
}