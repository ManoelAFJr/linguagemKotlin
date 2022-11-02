package com.example.poo_kotlin2

abstract class MotorCombustao : MotorImpl() {
   protected var nivel: Int = 2;

   abstract override fun gastando();

   override fun temAutonomia(): Boolean{
      return nivel > 0;
   }
}

class MotorGasolina: MotorCombustao(){
   override fun gastando() {
      nivel--;
      println("Gatando Combustivel, nivel é $nivel")
   }
}
class MotorAlcool: MotorCombustao(){
   override fun gastando() {
      nivel -=2;
      println("Gatando Combustivel, nivel é $nivel")
   }
}