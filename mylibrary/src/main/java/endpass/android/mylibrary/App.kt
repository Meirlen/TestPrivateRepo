
package endpass.android.mylibrary
import android.app.Application
import androidx.annotation.Keep
import endpass.android.endpass_sdk.presentation.di.archModule
import endpass.android.endpass_sdk.presentation.di.netModule
import endpass.android.endpass_sdk.presentation.di.utilModule


import org.koin.android.ext.android.startKoin



@Keep
open  class App : Application(){


    override fun onCreate() {
        super.onCreate()



        startKoin(this, listOf(netModule, archModule, utilModule))
    }

}
