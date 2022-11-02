package com.example.poo_kotlin


fun main(){

   val dog = Dog()
   val age: Int?
   val name: String = "Iris";
   age = 30;

   val manoel = Human();
   manoel.name = "Manoel Junior";

   println("${manoel?.name}")

   println("Manoel junior && $name");
   println("$age");

   dog.name = "Linux"
   dog.owner = manoel
   dog.sayHi();

   //dando um novo dono para o cachorro
   val assis = Human();
   assis.name = "Assis Soares";
   dog.name = "Linux"
   dog.owner = assis
   dog.sayHi();
}