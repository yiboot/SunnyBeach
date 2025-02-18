package cn.cqautotest.sunnybeach.db

import androidx.room.TypeConverter
import cn.cqautotest.sunnybeach.manager.CookieStore
import cn.cqautotest.sunnybeach.util.toJson
import com.blankj.utilcode.util.GsonUtils
import com.google.gson.reflect.TypeToken
import okhttp3.Cookie

class Converters {

    @TypeConverter
    fun cookieStoreToJson(cookieStore: CookieStore): String = cookieStore.toJson()

    @TypeConverter
    fun jsonFromCookieStore(json: String): CookieStore =
        GsonUtils.fromJson(json, CookieStore::class.java)

    @TypeConverter
    fun cookieToJson(cookie: Cookie): String = cookie.toJson()

    @TypeConverter
    fun jsonFromCookie(json: String): Cookie = GsonUtils.fromJson(json, Cookie::class.java)

    @TypeConverter
    fun cookiesToJson(cookies: List<Cookie>): String = cookies.toJson()

    @TypeConverter
    fun jsonFromCookies(json: String): List<Cookie> =
        GsonUtils.fromJson(json, object : TypeToken<List<Cookie>>() {}.type)
}