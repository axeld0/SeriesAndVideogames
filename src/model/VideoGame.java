package model;

public class VideoGame extends Product {
    private double duration;


    /**
     * CONSTRUCTORES
     */
    public VideoGame()
    {
        duration = 10;
    }

    public VideoGame (String title , double duration)
    {
        super(title);
        this.duration = duration;
    }
    public VideoGame (String title , double duration, String company, String gender)
    {
        super(company, gender, title);
        this.duration = duration;
    }


    /**
        GETTERS AND SETTER, EXCEPT LEND.
     */

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }


    /**
     * TOSTRING
     */
    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + super.getTitle() + '\'' +
                ", duration=" + duration +
                ", lend=" + super.isLend() +
                ", company='" + super.getCreator() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                '}';
    }




}
