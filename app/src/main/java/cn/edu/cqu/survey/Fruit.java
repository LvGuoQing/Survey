package cn.edu.cqu.survey;

/**
 * Created by lenovo on 2017/3/12.
 */


public class Fruit {

    private String name;//水果名
    private int imageId;//水果图片的资源id

    public Fruit(){}

    public Fruit(String name,int imageId){

        this.name=name;

        this.imageId=imageId;

    }



    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getImageId() {

        return imageId;

    }

    public void setImageId(int imageId) {

        this.imageId = imageId;

    }


}