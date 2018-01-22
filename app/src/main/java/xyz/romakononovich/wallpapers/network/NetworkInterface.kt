package xyz.romakononovich.wallpapers.network

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import xyz.romakononovich.wallpapers.models.Example

/**
 * Created by romank on 22.01.18.
 */
interface NetworkInterface{

    @GET("api/")
    abstract fun queryEvents(
            @Query("key") accessToken: String,
            @Query("q") color: String,
            @Query("image_type") type: String): Single<Example>
}