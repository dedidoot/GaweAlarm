package okek.bro

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import java.util.*

/**
 * Created by Dedi Dot on 1/23/2019.
 * Happy Coding!
 */

class BroadCast : BroadcastReceiver(){

    override fun onReceive(context: Context?, intent: Intent?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.e("woow","mantab")

        val timer = Timer()

        timer.schedule(object : TimerTask() {
            override fun run() {
                Log.e("wkwk", "executed broadcast")
            }
        }, 0, 1000)
    }

}