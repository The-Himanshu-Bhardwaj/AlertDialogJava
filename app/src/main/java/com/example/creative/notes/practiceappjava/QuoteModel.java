package com.example.creative.notes.practiceappjava;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QuoteModel {
    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("totalCount")
    @Expose
    private int totalCount;
    @SerializedName("page")
    @Expose
    private int page;
    @SerializedName("totalPages")
    @Expose
    private int totalPages;
    @SerializedName("lastItemIndex")
    @Expose
    private int lastItemIndex;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getLastItemIndex() {
        return lastItemIndex;
    }

    public void setLastItemIndex(int lastItemIndex) {
        this.lastItemIndex = lastItemIndex;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}

