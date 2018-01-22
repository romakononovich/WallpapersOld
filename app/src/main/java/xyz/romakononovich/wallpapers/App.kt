package xyz.romakononovich.wallpapers

import android.annotation.SuppressLint
import android.content.Context
import android.support.multidex.MultiDexApplication
import com.google.gson.Gson
import xyz.romakononovich.wallpapers.network.NetworkInterface
import xyz.romakononovich.wallpapers.network.RetrofitHelper

/**
 * Created by romank on 22.01.18.
 */
class App : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        gson = Gson()
        networkInterface = RetrofitHelper().getNetworkService()
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        var context: Context? = null
            private set
        var gson: Gson? = null
            private set
        var networkInterface: NetworkInterface? = null
            private set
    }
}