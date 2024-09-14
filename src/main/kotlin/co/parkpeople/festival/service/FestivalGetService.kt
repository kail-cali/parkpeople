package co.parkpeople.festival.service

import co.parkpeople.festival.domain.entity.Festival
import co.parkpeople.festival.domain.repository.FestivalCoroutineRepository
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class FestivalGetService(
    private val festivalRepository: FestivalCoroutineRepository,
) {

    @Transactional(readOnly = true)
    suspend fun get(id: Long): Festival {
        return festivalRepository.findById(id) ?: throw ChangeSetPersister.NotFoundException()
    }
}