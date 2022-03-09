package com.alta.rest.restandpoint.model;
import javax.persistence.*;


@Entity
@Table(name="bill")
public class billModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Double total;
    private String date;
    private int userId;



    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

 
    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

   
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
