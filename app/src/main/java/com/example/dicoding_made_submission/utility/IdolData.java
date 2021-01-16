package com.example.dicoding_made_submission.utility;

import com.example.dicoding_made_submission.R;
import com.example.dicoding_made_submission.model.IdolModel;

import java.util.ArrayList;

public class IdolData {
    private static String[] idolNames = {
            "Kim Chae Won",
            "Lee Chae Yeon",
            "Kwon Eun Bi",
            "Honda Hitomi",
            "Kang Hye Won",
            "Kim Min Ju",
            "Yabuki Nako",
            "Miyawaki Sakura",
            "Jang Won Young",
            "Choi Ye Na",
            "An Yu Jin",
            "Jo Yu Ri",
    };

    private static String[] idolBirthday = {
            "August 1, 2000",
            "January 11, 2000",
            "September 27, 1995",
            "October 6, 2001",
            "July 5, 1999",
            "February 5, 2001",
            "June 18, 2001",
            "March 19, 1998",
            "August 31, 2004",
            "September 29, 1999",
            "September 1, 2003",
            "October 22, 2001"
    };

    private static String[] idolDetails = {
            "Her nickname is “Angel Chaewon”, “Fairy Chaewon”, “Raddish Cabbage Fairy”.",
            "Her hometown is Yongin, South Korea , She is a former JYP Ent. trainee ",
            "She was born in Siheung-Dong, Geumcheon-Gu, Seoul, South Korea .",
            "Hitomi’s nicknames are Strawberry Princess, Hyi-Chan and Pang Hitomi",
            "She was born in Yangsan, South Gyeongsang, South Korea. Attended Bokwang High School in Yangsan",
            "Her official color is a shade of white called Snow White Minju.",
            "Nako was born in Tokyo prefecture, Japan",
            "Sakura was born in Kagoshima City, Japan.",
            "She was one of the youngest trainees on Produce48 ",
            "She was born in Gil-Dong, Gangdong, South Korea.",
            "Yujin is from Daejeon but currently lives in Seoul.",
            "She is from Busan, South Korea."
    };

    private static int[] heroesImages = {
            R.drawable.chaewon,
            R.drawable.chaeyon,
            R.drawable.eunbi,
            R.drawable.hitomi,
            R.drawable.hyewon,
            R.drawable.minju,
            R.drawable.nako,
            R.drawable.sakura,
            R.drawable.wonyoung,
            R.drawable.yena,
            R.drawable.yujin,
            R.drawable.yuri
    };

    public static ArrayList<IdolModel> getListData() {
        ArrayList<IdolModel> list = new ArrayList<>();
        for (int position = 0; position < idolNames.length; position++) {
            IdolModel idolModel = new IdolModel();
            idolModel.setName(idolNames[position]);
            idolModel.setBirthday(idolBirthday[position]);
            idolModel.setDetail(idolDetails[position]);
            idolModel.setPhoto(heroesImages[position]);
            list.add(idolModel);
        }
        return list;
    }
}
