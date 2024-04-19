package com.jamiahus.inheritanceapp

// Derieved class of BaseClass
// Inherits from BaseClass
open class Secondary: BaseClass() {

    override fun role() {
        println("Knight of the House BaseClass")
    }
}