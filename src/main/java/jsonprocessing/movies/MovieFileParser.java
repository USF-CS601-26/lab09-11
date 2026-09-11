package jsonprocessing.movies;

import java.util.ArrayList;
import java.util.List;

public class MovieFileParser {

    /** Parse a given json file with movies - see the structure of the file movies1.json
     * in the src/main/resources/movies folder of the project
     * @param jsonFilepath A path to the json file, given as a string
     * @return an ArrayList of Movie-s
    */
    public List<Movie> parseMovies(String jsonFilepath) {
        List<Movie> movies = new ArrayList<>();
         // FILL IN CODE


        return movies;
    }

    /** Traverse a given directory to find all .json files with movies,
     * parse them and return a list of Movies.
     * @param directory input directory
     * @return a list of movies extracted from all the json files in this directory
     */
    public List<Movie> findAndParseJsonFiles(String directory) {
        List<Movie> movies = new ArrayList<>();
        // FILL IN CODE
        // This method would call parseMovies

        // How can you find all files in a given directory? Use Files.newDirectoryStream
        // Please see DirectoryStreamExample in this package that shows you how to use it.

        return movies;
    }
}
