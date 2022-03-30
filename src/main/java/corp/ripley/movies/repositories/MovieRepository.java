package corp.ripley.movies.repositories;

import corp.ripley.movies.models.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String> {

        Movie findMovieById(String movieId);
}
