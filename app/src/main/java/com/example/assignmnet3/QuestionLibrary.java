package com.example.assignmnet3;

public class QuestionLibrary {

    private String mQuestion []={
            "Which part of plannet holds it in the soil? ",
            "This part of plant absorb energy from sun ",
            "This part of plants attracts bees,butterflies",
            "the _______ plant hold pant upright"

    };
    private String mChoice [][]={
            {"Roots","Stem","Flower"},
            {"Fruits","Leaves","Seeds"},
            {"Bark","Flower","Roots"},
            {"Flower","Leaves","Stem"}
    };

    private String mCorrectAnswer[]={"Roots","Leaves","Flower","Stem"};

    public String getquestion(int a)
    {
        String question=mQuestion[a];
        return question;
    }
    public String getchoice1(int a)
    {
        String choice0=mChoice[a][0];
        return choice0;
    }
    public String getchoice2(int a)
    {
        String choice1=mChoice[a][1];
        return choice1;
    }
public String getchoice3(int a)
{
    String choice2=mChoice[a][2];
    return choice2;

}
    public String getcorrectanswer(int a)
    {
        String answer=mCorrectAnswer[a];
        return answer;

    }


}
