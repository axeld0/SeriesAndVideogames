package model;

public class Series extends Product {
    private int seasons;


    /**
     * CONSTRUCTORS PAPA.
     */
    public Series()
    {
        seasons = 3;
    }

    public Series (String title, String creator)
    {
        super(creator, title);

    }

    public Series (String title, int seasons, String creator, String gender)
    {
        super(title, creator, gender);
        this.seasons = seasons;

    }

    /**
     * getters and setters
     */


    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "Series{" +
                "title='" + super.getTitle() + '\'' +
                ", seasons=" + seasons +
                ", lend=" + super.isLend() +
                ", creator='" + super.getCreator() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                '}';
    }

}
