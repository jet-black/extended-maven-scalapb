package me.jetblack

import me.jetblack.model.first.first.FirstMessage

object Main extends App {

  val firstMessage = FirstMessage(10)
  val javaFirstMessage = FirstMessage.toJavaProto(firstMessage)
  println(javaFirstMessage)
  println(firstMessage)

}