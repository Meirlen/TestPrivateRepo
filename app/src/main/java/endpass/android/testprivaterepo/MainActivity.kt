package endpass.android.testprivaterepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import endpass.android.mylibrary.Connector

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         Connector.testFun(this)
        //Endpa

    }
}