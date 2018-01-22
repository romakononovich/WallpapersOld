package xyz.romakononovich.wallpapers.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Example {

    @SerializedName("totalHits")
    @Expose
    var totalHits: Int? = null
    @SerializedName("hits")
    @Expose
    var hits: List<Hit>? = null
    @SerializedName("total")
    @Expose
    var total: Int? = null

}