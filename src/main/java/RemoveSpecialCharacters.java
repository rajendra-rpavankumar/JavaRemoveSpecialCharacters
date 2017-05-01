/**
 * Created by Pavan Kumar on 30/04/2017.
 */
public class RemoveSpecialCharacters {
    public String removeSpecChar(String input){
        StringBuilder stringBuilder=new StringBuilder();
        char[] charArray=input.toCharArray();
        for (char inputchar:charArray
             ) {
            if(inputchar >= 'a' && inputchar <= 'z'){
                stringBuilder.append(inputchar);
            }
        }
        return stringBuilder.toString();
    }
}
