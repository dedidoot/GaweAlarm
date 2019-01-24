package okek.bro

import android.app.Application
import android.util.Log
import java.util.*

/**
 * Created by Dedi Dot on 1/24/2019.
 * Happy Coding!
 */

class BaseApplication : Application() {

    var timer = Timer()

   companion object {
       val singleton by lazy {
           BaseApplication()
       }
   }

    override fun onTerminate() {
        timer.purge()
        Log.e("onTerminate","onTerminate")
        super.onTerminate()
    }

}