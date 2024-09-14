package co.parkpeople

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ParkPeopleKotlinApplication

fun main(args: Array<String>) {
    runApplication<ParkPeopleKotlinApplication>(*args)
}
