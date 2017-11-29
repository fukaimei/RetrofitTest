package com.fukaimei.retrofittest;

import com.fukaimei.retrofittest.model.Ip;
import com.fukaimei.retrofittest.model.IpModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IpServiceForPostBody {
    @POST("getIpInfo.php")
    Call<IpModel> getIpMsg(@Body Ip ip);
}
