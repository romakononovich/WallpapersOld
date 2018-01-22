package xyz.romakononovich.wallpapers.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_test.*
import xyz.romakononovich.wallpapers.App
import xyz.romakononovich.wallpapers.R
import xyz.romakononovich.wallpapers.models.Example
import xyz.romakononovich.wallpapers.models.Hit
import xyz.romakononovich.wallpapers.network.NetworkInterface

/**
 * Created by romank on 22.01.18.
 */
class TestActivity: AppCompatActivity() {

    private var networkInterface: NetworkInterface? = null
    private var compositeDisposable: CompositeDisposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        networkInterface = App.networkInterface
        testButton.setOnClickListener { requestTest() }
    }

    private fun requestTest() {
        compositeDisposable = CompositeDisposable()
        compositeDisposable!!
                .add(networkInterface?.queryEvents("7777255-2f5dd39fd3ed727de44fde30f","yellow+flowers","photo")?.subscribeOn(Schedulers.io())?.observeOn(AndroidSchedulers.mainThread())?.subscribe({ events -> displayTag(events.hits!!) }, { throwable -> Log.d("TAG", "Exception while querying events : " + throwable.message) })!!)

    }



    private fun displayTag(events: List<Hit>) {
        for (event in events) {
            Log.d("TAG", event.toString())
            Log.d("TAG", "----------------------------")
        }
    }
}