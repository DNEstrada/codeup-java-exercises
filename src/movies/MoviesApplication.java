package src.movies;
import src.util.Input;

public class MoviesApplication {
     public static void main(String[] args) {
          Input input = new Input();
          System.out.println("What would you like to do?\n" +
                  "\n" +
                  " 0 - exit\n" +
                  " 1 - view all movies\n" +
                  " 2 - view movies in the animated category\n" +
                  " 3 - view movies in the drama category\n" +
                  " 4 - view movies in the horror category\n" +
                  " 5 - view movies in the scifi category\n" +
                  "\n" +
                  " Enter your choice: ");
          int catChoice = input.getInt();
          listMovies(catChoice);
     }

     public static void listMovies(int choice) {
          for (Movie movie : MoviesArray.findAll()) {
               switch(choice) {
                    case 0:
                         System.exit(0);
                         break;
                    case 1:
                         System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());
                         break;
                    case 2:
                         if(movie.getMovieCategory() == "animated") {
                              System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());
                         }
                         break;
                    case 3:
                         if(movie.getMovieCategory() == "drama") {
                              System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());
                         }
                         break;
                    case 4:
                         if(movie.getMovieCategory() == "horror") {
                              System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());
                         }
                         break;
                    case 5:
                         if(movie.getMovieCategory() == "scifi") {
                              System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());
                         }
                         break;
                    default:
                         break;
               }
          }
     }
}
