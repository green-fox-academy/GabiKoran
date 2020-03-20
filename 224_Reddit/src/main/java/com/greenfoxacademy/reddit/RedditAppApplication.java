package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.entities.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditAppApplication implements CommandLineRunner {

    private PostRepository postRepository;

    @Autowired
    public RedditAppApplication (PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        postRepository.save(new Post("These simulations show how to flatten the coronavirus growth curve", "https://www.washingtonpost.com/graphics/2020/world/corona-simulator/?fbclid=IwAR0SqkVRQCWN-GlbIkbnR3HCdSRYd2LBSicOgBQ74S5lZF_G6UfxlXd3Lq0"));
        postRepository.save(new Post("Így sikerült megállítani Tajvanban a koronavírust", "https://vilagterkep.atlatszo.hu/2020/03/16/igy-sikerult-megallitani-tajvanban-a-koronavirust/?fbclid=IwAR29YWacHJHJfd52rXcbRwHE5qnMo-6_cTWXKqOLb-WJ4YzIrlsOl9fxAl4"));
        postRepository.save(new Post("Saint Louis már száz éve megmutatta a világnak, mennyire másként alakul egy járvány, ha időben megkezdik az elkülönítést", "https://qubit.hu/2020/03/12/saint-louis-mar-szaz-eve-megmutatta-meg-a-vilagnak-mennyire-maskent-alakul-egy-jarvany-ha-idoben-megkezdik-az-elkulonitest?fbclid=IwAR26g2jqr66bhwQ4iTwLo_N1f46ZYtgWiYDjvZkywayYi8RR6h_4C70zRBA"));
        postRepository.save(new Post("index", "https://index.hu/"));
    }
}
