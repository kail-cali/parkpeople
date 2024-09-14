package co.parkpeople.festival.domain.repository

import co.parkpeople.festival.domain.entity.Festival
import org.springframework.data.jpa.repository.JpaRepository

interface FestivalJpaRepository : JpaRepository<Festival, Long>