package com.example.poo_kotlin2

class MotorEletrico : MotorImpl() {
   private var nivelBateria: Int = 1;

   override fun gastando(){
      println("Gatando energia, nivel é $nivelBateria")
      nivelBateria--;
   }
   override fun temAutonomia(): Boolean{
      return nivelBateria > 0;
   }
}