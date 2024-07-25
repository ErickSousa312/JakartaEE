package org.challenger.exampleWithJavaEE

import jakarta.enterprise.context.ApplicationScoped
import jakarta.faces.view.ViewScoped
import jakarta.inject.Named

@Named
//Se vc trocar de guia ele vai manter esse estado
@ApplicationScoped
//@ViewScoped
class TesteText2 {
//    @JvmField
    var text = ""
//        set(value) {
//            field = value
//        }

    fun getTexto():String{
        println(text)
        return text.uppercase()
    }

    fun getTexto2() = text.lowercase()

}