package co.parkpeople.festival.domain.repository

import co.parkpeople.festival.domain.entity.Festival
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface FestivalCoroutineRepository : CoroutineCrudRepository<Festival, Long>