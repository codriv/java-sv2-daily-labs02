package day05;

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        System.out.println("\nFilm értékelése\n");
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie("Legényanya", 1989);
        int numberOfRatings = 12;
        int sumOfRatings = 45;
        movie.setNumberOfRatings(numberOfRatings);
        movie.setSumOfRatings(sumOfRatings);
        printOut(movie, scanner);
        }

    public static void printOut(Movie movie, Scanner scanner) {
        System.out.println("Film: " + movie.getTitle() + "  (" + movie.getYear() + ")");
        System.out.println(" Az eddigi értékelések száma: " + movie.getNumberOfRatings());
        System.out.println(" A film jelenlegi összesített értékelése: " + movie.getAverageRating());
        Viewer viewer = new Viewer();
        System.out.print(" Az Ön értékelése [1-5]: ");
        int currentRating = scanner.nextInt();
        int newCurrentRating = currentRating < 1 ? 1 : (currentRating > 5 ? 5 : currentRating);
        String newRating = " A film új összesített értékelése: " + viewer.watchMovie(movie, newCurrentRating);
        String modifiedRating = " korrigált értékelés: " + newCurrentRating + "\n" + newRating;
        System.out.println(currentRating < 1 ? modifiedRating : (currentRating > 5 ? modifiedRating : newRating));
    }
}
