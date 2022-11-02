package com.example.poo_kotlin2

class Car constructor(
   private val motor: MotorImpl
) : Motor by motor{ //delegando comportamento de uma interface *injeção de dependencia ou delegate pattern
   fun anda(){
      when{
         !motor.estaLigado() -> println("Dê a partida no Carro");
         !motor.temAutonomia() ->{
            when(motor){
               is MotorEletrico -> println("Coloque na tomada!")
               is MotorCombustao -> println("Coloque Combustivel!");
            }
         }
         else -> {
            motor.gastando()
            when(motor){
               is MotorEletrico -> println("Carro Funcionando...")
               is MotorCombustao -> println("Carro Funcionando: VRUMMM")
            }
         }
      }
   }
}