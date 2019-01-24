package okek.bro

import android.app.Activity
import android.os.Bundle
import android.util.Log
import java.util.*


/**
 * Created by Dedi Dot on 1/23/2019.
 * Happy Coding!
 */

class AlarmActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("wkwk", "onCreateX " + intent.getStringExtra("data"))
        BaseApplication.singleton.timer.cancel()
        BaseApplication.singleton.timer = Timer()

        BaseApplication.singleton.timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                Log.e("wkwk", "executed ")
            }
        }, 0, 1000)

        finish()
        return
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(0, 0)
    }
}
