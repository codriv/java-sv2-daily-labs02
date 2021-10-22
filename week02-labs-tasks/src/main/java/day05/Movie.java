package day05;

public class Movie {
    private String title;
    private int year;
    private int averageRating;
    private int numberOfRatings;
    private int sumOfRatings;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getSumOfRatings() {
        return  sumOfRatings;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings += numberOfRatings;
    }

    public void setSumOfRatings(int sumOfRatings) {
        this.sumOfRatings += sumOfRatings;
    }

    public double getAverageRating() {
        return (double)sumOfRatings / numberOfRatings;
    }
    public double setAverageRating(int rating) {
        setSumOfRatings(rating);
        setNumberOfRatings(1);
        return getAverageRating();
    }
}
