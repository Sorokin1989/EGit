package ru.sorokin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;

    }

    public void playMusic(MusicGenre genre) {
        Random random=new Random();
int randomNum=random.nextInt(3);
if(genre==MusicGenre.CLASSICAL){
    System.out.println(classicalMusic.getSongs().get(randomNum));
} else {
    System.out.println(rockMusic.getSongs().get(randomNum));
}

    }
}
