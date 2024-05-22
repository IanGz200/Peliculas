/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.peliculas;

/**
 * -Comenta la clase-
 * @author IanGz
 */
class Pelicula {
    
    int id;
    
    String title;
    
    String year;

    /**
     * 
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return 
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return 
     */
    public String getYear() {
        return year;
    }

    /**
     * 
     * @param year 
     */
    public void setYear(String year) {
        this.year = year;
    }

    public Pelicula(String title, String year) {
        this.title = title;
        this.year = year;
    }

    public Pelicula() {
    }
    
    

}
