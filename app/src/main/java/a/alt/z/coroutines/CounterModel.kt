package a.alt.z.coroutines

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CounterModel {

    private val _counter = MutableStateFlow(0)
    val counter = _counter.asStateFlow()

    fun inc() {
        _counter.value++
    }
}