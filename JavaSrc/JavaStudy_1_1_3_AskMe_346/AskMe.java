import java.util.Random;

enum Answers {
 NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
  Random rand = new Random();
  Answers ask()  {
    int prob = (int) (100 * rand.nextDouble());
 
    if (prob < 15)
      return Answers.MAYBE;
      else if (prob < 30) 
        return Answers.NO;
       else if (prob < 60) 
         return Answers.YES;
       else if (prob < 75) 
         return Answers.LATER;
       else if (prob < 98) 
         return Answers.SOON;
       else 
         return Answers.NEVER;
  }
}


class AskMe{   //0               
 static void answer(Answers result) { //1
  switch (result) {   //2
    case NO:
      System.out.println("Нет");
      break;
    case YES:
      System.out.println("Да");
      break;
    case MAYBE:
      System.out.println("Возможно");
      break;
    case LATER:
      System.out.println("Позднее");
      break;
    case SOON:
      System.out.println("Вскоре");
      break;
    case NEVER:
      System.out.println("Никогда");
      break;
  } //2     
} //1 


public static void main(String[] args) {   //1 
  Question q = new Question();
  answer(q.ask());
  answer(q.ask());
  answer(q.ask());
  answer(q.ask());
     
}   //1 
}   //0 
