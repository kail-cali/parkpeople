package co.parkpeople.festival.api.converter

import java.time.ZonedDateTime

object FestivalDtoMapper {
    data class ListFestivalRequest(
        val filter: Filter,
        val page: Page,
    )

    data class Filter(
        val name: String? = null,
        val startDate: ZonedDateTime? = null,
        val endDAte: ZonedDateTime? = null,
    )

    data class Page(
        val num: Long = 1,
        val size: Long = 40,
    )
}




