package guru.springframework.spring5jokesappv2.services;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by gd on 7/11/2023
 */
@Service
public class JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
    public String getRandomQuote(){
        String joke = chuckNorrisQuotes.getRandomQuote();
        return joke;
    }

}
