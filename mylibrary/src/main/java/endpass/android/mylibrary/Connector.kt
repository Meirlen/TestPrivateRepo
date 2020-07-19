package endpass.android.mylibrary

import android.content.Context
import endpass.android.mylibrary.Connector
import endpass.android.phone_sdk.CameraConnect

object Connector {

    

    fun testFun(context: Context){
        CameraConnect.connect()
    }
}