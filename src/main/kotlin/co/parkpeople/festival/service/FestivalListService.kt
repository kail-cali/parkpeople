package co.parkpeople.festival.service

import co.parkpeople.festival.api.converter.FestivalDtoMapper
import co.parkpeople.festival.domain.entity.Festival
import co.parkpeople.festival.domain.repository.FestivalCoroutineRepository
import org.springframework.stereotype.Service

@Service
class FestivalListService(
    private val festivalRepository: FestivalCoroutineRepository,
) {

    suspend fun list(request: FestivalDtoMapper.ListFestivalRequest): List<Festival> {
        return emptyList()
    }
}