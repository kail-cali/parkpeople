package co.parkpeople

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ParkpeopleKotlinApplication

fun main(args: Array<String>) {
    runApplication<ParkpeopleKotlinApplication>(*args)
}
