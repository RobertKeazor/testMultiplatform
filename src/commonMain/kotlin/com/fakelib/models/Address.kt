package com.fakelib.models

 class Address private constructor(
     val streetAddress: String,
     val zipCode: String,
     val state: String
 ) {
     override fun toString(): String {
         return "Address(streetAddress=$streetAddress, zipCode= $zipCode, state= $state)"
     }

     class Builder {
         private var streetAddress = ""
         private var zipCode = ""
         private var state = ""


         fun setStreetAddress(address: String) = apply { this.streetAddress = address }

         fun zipCode(zipCode: String) = apply { this.zipCode = zipCode }

         fun state (state: String) = apply { this.state = state }

         fun build() = Address(
             streetAddress = this.streetAddress,
             zipCode = this.zipCode,
             state = this.state
         )
     }
 }

