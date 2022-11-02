package com.example.poo_kotlin2

abstract class MotorImpl : Motor{
   private var ligado: Boolean = false;

   override fun on(){
      println("Ligando Automovel")
      ligado = true
   }
   override fun off(){
      println("Desligando Automovel")
      ligado = false
   }
   fun estaLigado(): Boolean{
      return ligado
   }
   abstract fun temAutonomia(): Boolean;
   abstract fun gastando();
}