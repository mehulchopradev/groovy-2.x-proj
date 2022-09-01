package xyz.supercoders.college.domain

class Contact {
  String email
  String mobile
  String country
  String state
  Integer postalCode

  String toString() {
    "${email}\n${mobile}\n${country}\n${state}\n${postalCode}"
  }
}