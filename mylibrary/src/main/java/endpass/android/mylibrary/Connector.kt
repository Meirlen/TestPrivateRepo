package endpass.android.mylibrary

import android.content.Context
import endpass.android.endpass_sdk.presentation.router.MainRouter
import endpass.android.mylibrary.Connector

object Connector {

    val  mainRouter = MainRouter()

    fun testFun(context: Context){
        mainRouter.openLogin(context)

    }
}