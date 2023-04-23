package model;

import java.util.Objects;

public  class  Product {

    private String title;
    private boolean lend;

    private String creator;

    private String gender;



    public Product()
    {
        title = "";
        lend = false;
        creator = "";
        gender = "";

    }

    public Product(String title)
    {
        this.title= title;
    }


    public Product(String title, String creator)
    {
        this.title = title;
        this.creator = creator;
    }
    public Product(String title,String creator , String gender)
    {
        this.title = title;
        this.gender = gender;
        this.creator = creator;
    }




    /**
     * getters and setters
     * @return
     */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void lendProduct ()
    {
        lend = true;
    }

    public void returnProduct ()
    {
        lend = false;
    }
    public boolean isLend() {
        return lend;
    }


    public boolean compareTo(Object o)
    {
        boolean compare = false;
        if (o != null)
        {
            if(o instanceof Series)
            {
                Series aux = (Series)  o;
                if(getTitle().equals(aux.getTitle()))
                {
                    compare = true;
                }
            }
        }
        return compare;
    }

}




