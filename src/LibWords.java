import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LibWords
{
  String slovo;
  File file = new File("C:/Users/china/AndroidStudioProjects/viselMuzikNo7/russian_nouns.txt");
  Scanner scanirovanieSlow;

  static Random randomword = new Random();
  static List<String> listOfWords = new ArrayList<>();
  Scanner scannirovanieBukv = new Scanner(System.in);

  {
        try {
            scanirovanieSlow = new Scanner(new File(String.valueOf(file)));
        } catch (FileNotFoundException e) {
          // throw new RuntimeException(e);
            System.out.println("чтение из файла наебнулось");
        }
    }
  public LibWords() {

    while (scanirovanieSlow.hasNextLine())
    {

      slovo = scanirovanieSlow.nextLine();

      if(slovo.length() > 3 )
      {
        listOfWords.add(slovo);
      }
      else
      {
        return;
      }
    //  scanirovanieSlow.close(); надо ли?
    }

  }
  public static String getSlovo()
  {
    return listOfWords.get(randomword.nextInt(listOfWords.size()));
  }
  public char[] bukvaPustoti(char[] bukvi)
  {
    for (int i = 0; i < bukvi.length; i++) {
      if (bukvi[i] != 'p') {
        bukvi[i] = '_';
      }
    }
    return bukvi;


  } public char getBukva()
{
  return scannirovanieBukv.next().charAt(0);
}
}

