package com.example.poo_kotlin2


fun main(){
   val motor1 = MotorGasolina();
   val fusca = Car(motor1);
   fusca.on()
   fusca.anda();
   fusca.anda();

   println("\n------------------------\n")

   val motorV8 = MotorAlcool();
   val opala = Car(motorV8);
   opala.on()
   opala.anda();
   opala.anda();

   println("\n------------------------\n")

   val motorEletrico = MotorEletrico();
   val tesla = Car(motorEletrico)
   tesla.on();
   tesla.anda();
   tesla.anda();
   tesla.anda();

}