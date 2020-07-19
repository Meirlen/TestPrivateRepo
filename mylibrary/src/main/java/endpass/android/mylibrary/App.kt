
package endpass.android.mylibrary
import android.app.Application
import androidx.annotation.Keep



import org.koin.android.ext.android.startKoin



@Keep
open  class App : Application(){


    override fun onCreate() {
        super.onCreate()



       // startKoin(this, listOf(netModule, archModule, utilModule))
    }

}
