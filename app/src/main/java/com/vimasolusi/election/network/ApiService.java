package com.vimasolusi.election.network;

import com.vimasolusi.election.model.AccessToken;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {

    @POST("login")
    @FormUrlEncoded

    Call<AccessToken> login(@Field("nrp") String nrp, @Field("password") String password);

}
