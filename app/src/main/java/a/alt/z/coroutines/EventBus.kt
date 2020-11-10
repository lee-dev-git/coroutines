package a.alt.z.coroutines

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.StateFlow

data class Event(val id: Long)

class EventBus {

    private val _events = MutableSharedFlow<Event>()
    val events: Flow<Event> get() = _events

    suspend fun produceEvent(event: Event) {
        _events.emit(event) /* suspend until all subscribers receive it */
    }
}