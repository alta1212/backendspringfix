package com.alta.rest.restandpoint.model;

import javax.persistence.*;


@Entity
@Table(name="user")
public class userModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String user;
        private String pass;
        private String img;
        private String name;
        @Transient
        private String token;
        @Transient
        private String role;

        public String getRole() {
            return this.role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getToken() {
            return this.token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUser() {
            return this.user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPass() {
            return this.pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public String getImg() {
            return this.img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }


}
