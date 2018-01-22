package xyz.romakononovich.wallpapers.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Hit {

    @SerializedName("previewHeight")
    @Expose
    var previewHeight: Int? = null
    @SerializedName("likes")
    @Expose
    var likes: Int? = null
    @SerializedName("favorites")
    @Expose
    var favorites: Int? = null
    @SerializedName("tags")
    @Expose
    var tags: String? = null
    @SerializedName("webformatHeight")
    @Expose
    var webformatHeight: Int? = null
    @SerializedName("views")
    @Expose
    var views: Int? = null
    @SerializedName("webformatWidth")
    @Expose
    var webformatWidth: Int? = null
    @SerializedName("previewWidth")
    @Expose
    var previewWidth: Int? = null
    @SerializedName("comments")
    @Expose
    var comments: Int? = null
    @SerializedName("downloads")
    @Expose
    var downloads: Int? = null
    @SerializedName("pageURL")
    @Expose
    var pageURL: String? = null
    @SerializedName("previewURL")
    @Expose
    var previewURL: String? = null
    @SerializedName("webformatURL")
    @Expose
    var webformatURL: String? = null
    @SerializedName("imageWidth")
    @Expose
    var imageWidth: Int? = null
    @SerializedName("user_id")
    @Expose
    var userId: Int? = null
    @SerializedName("user")
    @Expose
    var user: String? = null
    @SerializedName("type")
    @Expose
    var type: String? = null
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("userImageURL")
    @Expose
    var userImageURL: String? = null
    @SerializedName("imageHeight")
    @Expose
    var imageHeight: Int? = null

    override fun toString(): String {
        return "Hit(previewHeight=$previewHeight, likes=$likes, favorites=$favorites, tags=$tags, webformatHeight=$webformatHeight, views=$views, webformatWidth=$webformatWidth, previewWidth=$previewWidth, comments=$comments, downloads=$downloads, pageURL=$pageURL, previewURL=$previewURL, webformatURL=$webformatURL, imageWidth=$imageWidth, userId=$userId, user=$user, type=$type, id=$id, userImageURL=$userImageURL, imageHeight=$imageHeight)"
    }

}