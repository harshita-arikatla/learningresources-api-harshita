package com.tgt.rysetii.learningresourcesapiharshita.entity;
import java.time.LocalDate;
public class learningresources {
    private Integer learningResource_Id;
    private String productName;
    private Double CP;
    private Double SP;
    private LearningResourceStatus learningResourceStatus;
    private LocalDate createdDate;
    private LocalDate publishedDate;
    private LocalDate retiredDate;

    public learningresources(){

    }

    public learningresources(Integer learningResource_Id, String productName, Double CP, Double SP, LearningResourceStatus learningResourceStatus, LocalDate createdDate, LocalDate publishedDate, LocalDate retiredDate) {
        this.learningResource_Id = learningResource_Id;
        this.productName = productName;
        this.CP = CP;
        this.SP = SP;
        this.learningResourceStatus = learningResourceStatus;
        this.createdDate = createdDate;
        this.publishedDate = publishedDate;
        this.retiredDate = retiredDate;
    }

    public Integer getLearningResource_Id() {
        return learningResource_Id;
    }

    public void setLearningResource_Id(Integer learningResource_Id) {
        this.learningResource_Id = learningResource_Id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getCP() {
        return CP;
    }

    public void setCP(Double CP) {
        this.CP = CP;
    }

    public Double getSP() {
        return SP;
    }

    public void setSP(Double SP) {
        this.SP = SP;
    }

    public LearningResourceStatus getLearningResourceStatus() {
        return learningResourceStatus;
    }

    public void setLearningResourceStatus(LearningResourceStatus learningResourceStatus) {
        this.learningResourceStatus = learningResourceStatus;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public LocalDate getRetiredDate() {
        return retiredDate;
    }

    public void setRetiredDate(LocalDate retiredDate) {
        this.retiredDate = retiredDate;
    }
}
