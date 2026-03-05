import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a text : ");
        String rawStr = sc.nextLine();
        String str = rawStr.trim() + " ";
        int CharWithSpaces = 0;
        int CharNoSpaces = 0;
        int wordCount = 0;
        int vowelCount = 0;
        String word = "";
        String upperCaseFormat = rawStr.toUpperCase();
        String snakeCase = "";
        String headerStyle = "";
        String initials = "";
        String fullReverse = "";
        for(int i = 0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch != ' ')
            {
                CharNoSpaces++;
            
            char lowCh = Character.toLowerCase(ch);
            if(lowCh == 'a' || lowCh == 'e' || lowCh == 'i' || lowCh == 'o' || lowCh == 'u')
            {
                vowelCount++;
            }
            word += ch;
            }
            else
            {
                if(word.length() > 0)
                {
                    wordCount++;
                    String firstLetter = word.substring(0,1).toUpperCase();
                    String restOfWord = word.substring(1).toLowerCase();
                    headerStyle += firstLetter + restOfWord + " ";
                    initials += firstLetter + ".";
                    snakeCase += word.toLowerCase() + "_";
                    word = "";
                }
                }
            }
            if(snakeCase.endsWith("_"))
            {
                snakeCase = snakeCase.substring(0 , snakeCase.length()-1);
            }
          String [] wordsArray = rawStr.split("\\s+");
          for(int i = wordsArray.length-1 ; i>=0; i--)
          {
              String current = wordsArray[i];
              String revWord = "";
              for(int j = current.length()-1; j>=0; j--)
              {
                  revWord += current.charAt(j);
              }
              fullReverse += revWord + " ";
          }
          System.out.println("\n***********************************");
          System.out.println(" TEXTPRO : STRING ANALYSIS REPORT");
          System.out.println("***********************************");
          System.out.println(" > Original : " + rawStr.trim());
          System.out.println(" > Word Count : " + wordCount);
          System.out.println(" > Characters Count (No space ) " + CharNoSpaces);
          System.out.println(" > Vowel Count : " + vowelCount);
          System.out.println(" > Header Style : " + headerStyle.trim());
          System.out.println(" > Snake Case : "+ snakeCase);
          System.out.println(" > Initials : " + initials);
          System.out.println(" > Full Reverse : " + fullReverse.trim());
          System.out.println("***********************************");
          sc.close();
    }
}
