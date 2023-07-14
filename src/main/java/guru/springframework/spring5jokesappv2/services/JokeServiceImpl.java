package guru.springframework.spring5jokesappv2.services;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by gd on 7/11/2023
 */
@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }

}
