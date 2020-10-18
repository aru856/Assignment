package com.quizapplication;

public class Game {

    Question[] questions=new Question[4];
    Player player=new Player();

    String[] questionsdata={"Who won the Best Footballer 2016 in the World?","How many satellites in a single mission using PSLV C-34 launched in 2016?","Which service is used for sending or receiving mail on the internet?"," Which planet have the ‘Great Red Spot’?"};
    String[] options1={" Cristiano Ronaldo","20 satellites"," Email","Jupiter"};
    String[] options2={"Cristiano Robert","30 satellites","internet","Mars"};
    String[] options3={"Robert Paul","10 satellites","skype","Neptune"};
    String[] options4={"Mark Admin"," 05 satellites","twitter","Moon"};
    int[] answers={1,1,1,1};


    public void initGame()
    {

        for(int i=0;i<4;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<4;i++)
        {

            questions[i].question=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

        player.getDetails();
        for(int i=0;i<4;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("you did well");
                player.score++;
            }
            else{
                System.out.println("put hardwork to do well ");
            }
        }

        System.out.println(player.name+" your score is "+player.score);

    }

}