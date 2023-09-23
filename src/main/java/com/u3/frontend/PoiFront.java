/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u3.frontend;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import com.u3.model.FloorMap;
import com.u3.model.Model;
import com.u3.model.Building;
import com.u3.model.Poi;
import com.u3.model.Position;

/**
 *
 * @author Otis Ding
 * 
 * This class is used to create the front end representation of a POI
 */
public class PoiFront {
    
    public JLabel point;
    private String desc;
    private int xCoord;
    private int yCoord;
    private BufferedImage pinPicture;
    private Poi Poi;
    private FloorMap floormap;
    private String building;
    private String floor;
    private Model model;

    /**
     * @param Poi The POI that this class is representing
     * @param building The building that the POI is in
     * @param floor The floor of the building that the POI is on
     * @param model The backend model that the POI is in such that information can be kept persistent
     */
    



    /**
     * Constructor - Creates the JLabel that represents the POI and sets its image, size, and location.
     */
    public PoiFront(Poi Poi, String building, String floor, Model model){
        
        
        Building bld = model.getBuilding(building);
        FloorMap floormap = bld.getFloorMap(floor);
        this.building = building;
        this.floor = floor;
        
        
        this.desc = Poi.getLocDesc();
        this.xCoord = Poi.getPos().getXPos();
        this.yCoord = Poi.getPos().getYPos();
        this.Poi = Poi;
        this.model = model;
        try{
            pinPicture = ImageIO.read(new File("data/images/map-pin.jpeg"));  //For getting the image that represents the POI
        } catch(IOException ex){
            System.out.println("IOException");
        }
        point = new JLabel(new ImageIcon(pinPicture));
        point.setSize(20,20);
        point.setLocation(this.xCoord, this.yCoord);
        point.setText("POI");
        
        point.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pointMouseClicked(evt);
            }
        });
    }
    
    
    /**
     * Sets the description of the POI
     * @return void
     */
    public void setDescription(String description){
        this.desc = description;
    }
    

    /**
     * Sets the visibility of the POI
     * @return void
     */
    public void setVisible(boolean state){
        point.setVisible(state);
    }
    

    /**
     * returns the JLabel that represents the POI
     * @return JLabel
     */
    public JLabel getLabel(){
        return point;
    }
    

    /**
     * returns the POI that this class is representing
     * @return Poi
     */
    public Poi getPoi(){
        return this.Poi;
    }
    

    /**
     * Event that triggers when the user clicks on the POI. Opens a popup window with the POI's information and other functionalies
     * @return void
     */
    private void pointMouseClicked(java.awt.event.MouseEvent evt){
        JFrame pop = new popup(this.Poi, this.building, this.floor, model, point);
        pop.setVisible(true);
        pop.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

}
