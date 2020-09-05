package example

import com.typesafe.config.ConfigFactory

object TestA {
    def main(args : Array[String]) : Unit = {
        val conf = ConfigFactory.load
        println("bootstrap.servers: " + conf.getString("kafka.brokers"))

        val a = Array("apple", "banana", "orange")

        for (e <- a) println(e)

        a.foreach { e =>
            val s = e.toUpperCase
            println(s)
        }
    }
}