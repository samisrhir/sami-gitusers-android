package net.sami.gitapp.service;

import net.sami.gitapp.model.GitRepo;
import net.sami.gitapp.model.GitUsersResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GitRepoServiceAPI {
    @GET("search/users")
    public Call<GitUsersResponse> searchUsers(@Query("q") String query);
    @GET("users/{t}/repos")
    public Call<List<GitRepo>> userRepositories(@Path("t") String login);
}
