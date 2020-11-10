package a.alt.z.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.flow.combine

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aCounter = CounterModel().counter
        val bCounter = CounterModel().counter
        val sum = aCounter.combine(bCounter) { aValue, bValue -> aValue + bValue }
    }
}