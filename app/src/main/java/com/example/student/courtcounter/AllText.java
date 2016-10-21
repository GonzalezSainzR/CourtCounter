package com.example.student.courtcounter;

public class AllText {

    public static AllText alltext;
    private String[] text;

    private AllText() {
        text = new String[] {
                "Court Counter \n" +
                        "Team 1 vs Team 2 \n" +
                        "Score: 0 \n" +
                        "Team 1 is up by 0"
        };
    }

    public static AllText get() {
        if(alltext == null) {
            alltext = new AllText();
        }
        return alltext;
    }
}
