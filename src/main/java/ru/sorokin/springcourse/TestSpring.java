package ru.sorokin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic3 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic4 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic5 = context.getBean("musicBean", ClassicalMusic.class);



        //Music music= context.getBean("musicBean",Music.class);
        //MusicPlayer musicPlayer=new MusicPlayer(music);

        // MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
        // boolean comparison=firstMusicPlayer==secondMusicPlayer;
        // System.out.println(comparison);
        // System.out.println(firstMusicPlayer);
        // System.out.println(secondMusicPlayer);
//
        // firstMusicPlayer.setVolume(20);
        // System.out.println(firstMusicPlayer.getVolume());
        // System.out.println(secondMusicPlayer.getVolume());
//

        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
