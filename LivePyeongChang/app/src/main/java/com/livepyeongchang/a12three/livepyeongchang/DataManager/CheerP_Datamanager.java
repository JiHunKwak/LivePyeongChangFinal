package com.livepyeongchang.a12three.livepyeongchang.DataManager;

import com.livepyeongchang.a12three.livepyeongchang.DataManager.Data.ReplyVO.ReplyVO_Post;
import com.livepyeongchang.a12three.livepyeongchang.DataManager.Remote.RetrofitService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by kwakgee on 2017. 9. 26..
 */

public class CheerP_Datamanager {

    private static CheerP_Datamanager dm;

    public CheerP_Datamanager() {
    }

    public static CheerP_Datamanager getInstance(){
        return dm;
    }

    public void sendData(String temp, String nameKey){

        RetrofitService retrofitService = (RetrofitService) RetrofitService.retrofit_replys.create(RetrofitService.class);
        Call<ReplyVO_Post> call = retrofitService.getComment(temp, nameKey);
        call.enqueue(new Callback<ReplyVO_Post>() {
            @Override
            public void onResponse(Call<ReplyVO_Post> call, Response<ReplyVO_Post> response) {
            }

            @Override
            public void onFailure(Call<ReplyVO_Post> call, Throwable t) {
            }
        });

    }

}
