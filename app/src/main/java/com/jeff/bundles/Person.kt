package com.jeff.bundles

import java.io.Serializable

data class Person(
    val name : String,
    val age : Int,
    val job : String
): Serializable