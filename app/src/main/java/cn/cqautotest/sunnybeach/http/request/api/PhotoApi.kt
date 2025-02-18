package cn.cqautotest.sunnybeach.http.request.api

import cn.cqautotest.sunnybeach.http.response.model.HomeBannerBean
import cn.cqautotest.sunnybeach.http.response.model.HomePhotoBean
import cn.cqautotest.sunnybeach.util.DEFAULT_BANNER_URL
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface PhotoApi {

    @GET
    suspend fun loadPhotoList(
        @Url url: String = "http://service.picasso.adesk.com/v1/vertical/vertical?" +
                "disorder=true&adult=false&" +
                "first=1&url=http%3A%2F%2Fservice.picasso.adesk.com%2Fv1%2Fvertical%2Fvertical&order=hot",
        @Query("limit") limit: Int, @Query("skip") skip: Int
    ): HomePhotoBean

    @GET
    suspend fun listsHomeBannerList(@Url url: String = DEFAULT_BANNER_URL): HomeBannerBean
}