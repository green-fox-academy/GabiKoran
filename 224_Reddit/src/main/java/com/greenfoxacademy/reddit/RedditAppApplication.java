package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.models.entities.User;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import com.greenfoxacademy.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class RedditAppApplication implements CommandLineRunner {

    private PostRepository postRepository;
    private UserRepository userRepository;
    private UserService userService;

    @Autowired
    public RedditAppApplication(PostRepository postRepository, UserRepository userRepository, UserService userService) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

        postRepository.save(new Post("These simulations show how to flatten the coronavirus growth curve", "https://www.washingtonpost.com/graphics/2020/world/corona-simulator/?fbclid=IwAR0SqkVRQCWN-GlbIkbnR3HCdSRYd2LBSicOgBQ74S5lZF_G6UfxlXd3Lq0"));
        postRepository.save(new Post("Így sikerült megállítani Tajvanban a koronavírust", "https://vilagterkep.atlatszo.hu/2020/03/16/igy-sikerult-megallitani-tajvanban-a-koronavirust/?fbclid=IwAR29YWacHJHJfd52rXcbRwHE5qnMo-6_cTWXKqOLb-WJ4YzIrlsOl9fxAl4"));
        postRepository.save(new Post("Saint Louis már száz éve megmutatta a világnak, mennyire másként alakul egy járvány, ha időben megkezdik az elkülönítést", "https://qubit.hu/2020/03/12/saint-louis-mar-szaz-eve-megmutatta-meg-a-vilagnak-mennyire-maskent-alakul-egy-jarvany-ha-idoben-megkezdik-az-elkulonitest?fbclid=IwAR26g2jqr66bhwQ4iTwLo_N1f46ZYtgWiYDjvZkywayYi8RR6h_4C70zRBA"));
        postRepository.save(new Post("Matematikai modellszámítással mutatjuk a távolságtartás hatását a járványgörbére", "https://atlatszo.hu/2020/03/20/matematikai-modellszamitassal-mutatjuk-a-tavolsagtartas-hatasat-a-jarvanygorbere/?fbclid=IwAR205kVStSvlGj1pv5_j-xPzIUaoTi316vJP4UEApN1AchI-dkOPOu3M9YY"));
        postRepository.save(new Post("Om Mani Padme Hum Mantra", "https://www.youtube.com/watch?v=iG_lNuNUVd4"));
        postRepository.save(new Post("Om Mani Padme Hum Mantra", "https://www.youtube.com/watch?v=R69o3Se_0og"));
        postRepository.save(new Post("Om Ah Hum Vajra Guru Padma Siddhi Hum", "https://www.youtube.com/watch?v=8QVsIWtJNsc"));
        postRepository.save(new Post("Scary Pocket - I Want It That Way - Backstreet Boys - FUNK remix ft. Casey Abrams!", "https://www.youtube.com/watch?v=VZAJMBFq85s"));
        postRepository.save(new Post("Scary Pocket - Bye Bye Bye - N Sync - FUNK cover!", "https://www.youtube.com/watch?v=VzNWZ_EnAgs"));
        postRepository.save(new Post("Scary Pocket - Kiss | Prince | funk cover ft. Rozzi", "https://www.youtube.com/watch?v=Y63m5JqCziE"));
        postRepository.save(new Post("Scary Pocket - Wonderwall - Oasis - FUNK cover feat. Darren Criss!", "https://www.youtube.com/watch?v=jftpg_6SUYk"));
        postRepository.save(new Post("Scary Pocket - Chandelier | Sia | funk cover ft. Stan Taylor", "https://www.youtube.com/watch?v=io31tL4uUJc"));
        postRepository.save(new Post("Scary Pocket - Umbrella | Rihanna | Funk cover ft. Cimorelli", "https://www.youtube.com/watch?v=UceKSaN9IW4"));
        postRepository.save(new Post("hiperkarma – jószerencsét!", "https://www.youtube.com/watch?v=PV4rM9sMF-0"));
        postRepository.save(new Post("index", "https://index.hu/"));

        userRepository.save(new User("Hajni", "hajni@gmail.hu", "12345"));
        userRepository.save(new User("Csenge", "csenge@gmail.hu", "12345"));
        userRepository.save(new User("Dóri", "dori@gmail.hu", "12345"));
        userRepository.save(new User("Viki", "viki@gmail.hu", "12345"));
        userRepository.save(new User("Eszter", "eszter@gmail.hu", "12345"));
        userRepository.save(new User("Johi", "johi@gmail.hu", "12345"));
        userRepository.save(new User("Gabi", "gabi@gmail.hu", "12345"));
    }
}
