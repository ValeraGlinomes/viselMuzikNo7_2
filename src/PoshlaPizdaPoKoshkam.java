import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PoshlaPizdaPoKoshkam {
  static int errorShet;
  static final int maxError = 6;
static List<Character> errorChar; // буквы, которые уже вводили
static String secretnoeWord;
  static String secretnoeWordWiew;
  static DrawHangman vidViseletci;

  public static void Start()
  {
    errorShet = 0;
    errorChar = new ArrayList<Character>();
    secretnoeWord = LibWords.getSlovo().toUpperCase(Locale.ROOT);
    // vidViseletci надо докрутить отображение виселицы от ошибок
    secretnoeWordWiew = "*".repeat(secretnoeWord.length());
    boolean igraIdet = true;

    while (igraIdet == true)
    {
      System.out.println(vidViseletci);
      System.out.println("Загаданное слово:  " + secretnoeWordWiew);
      System.out.println("Ошибки  (" + errorShet + "): " + errorChar);
      System.out.print("Введите букву: ");
      Character inputChar = Main.readInput();// я ещё не придумал за что отвечатет
      if (secretnoeWord.contains(String.valueOf(inputChar)))
      {
        char[] maska = secretnoeWord.toCharArray();
        char[] maskaWiew = secretnoeWordWiew.toCharArray();

        for (int i = 0; i < secretnoeWord.length(); i++)
        {
          if (maska[i] == inputChar)
          {
            maskaWiew[i] = inputChar;
          }
        }
        secretnoeWordWiew = new String(maskaWiew);
        if (!secretnoeWordWiew.contains("*"))//это выстрелит в строке 65
        {//это выстрелит в строке 65
          igraIdet = false;//это выстрелит в строке 65
        }
        else
        {
          if (errorChar.contains(inputChar)) {
            System.out.println("ещё раз такую хуйню викинешь- пизда тебе\nвведи неповторяющуюся букву сука");
          }
          else
          {
            errorChar.add(inputChar);
          }
          errorShet++;
          //снова надо прикрутит отображение

          if (errorShet != maxError)
          {
            System.out.println("поздравляю, ты победил все баги");
          }
          else
          {
        //    igraIdet == false;// почему блять
            DrawHangman pizdec = new DrawHangman();
            System.out.println(pizdec.pizdaDodiky);
            System.out.println("ты пребал. слово было " + secretnoeWord);
            exit();

          }
        }
      }
    }
  }
  static void exit()
  {
    System.exit(1);
  }
}
