package ru.sorokin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       // Music music = context.getBean("classicalMusic", ClassicalMusic.class);
        //Music music1 = context.getBean("jazzMusic", JazzMusic.class);

       // MusicPlayer musicPlayer = new MusicPlayer(music);
        //MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        //musicPlayer1.playMusic();
        //musicPlayer.playMusic();

      //  MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
      //  //musicPlayer.playMusic();
      // // Computer computer=context.getBean("computer", Computer.class);
      //  musicPlayer.playMusic(MusicGenre.CLASSICAL);
      //  musicPlayer.playMusic(MusicGenre.ROCK);



        //System.out.println(computer);
        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        context.close();
    }
}
