package com.example.ProjectJavaRestaurant.pojo.dto;

public class ReviewDTO {
    private Integer id;
    private Integer customerId;
    private Integer rating;
    private String comment;

    public ReviewDTO(Integer id, Integer customerId, Integer rating, String comment) {
        this.id = id;
        this.customerId = customerId;
        this.rating = rating;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}