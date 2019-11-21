public class PlayPass {
    public static String playPass(String s, int n) {
        StringBuilder sequence = new StringBuilder();
        String phrase = s;
        char[] charArray = phrase.toCharArray();
        int charCode;

        for (int i = 0; i < charArray.length; i++){
            char c = charArray[i];
            if (Character.isLetter(c) && Character.isUpperCase(c)){
                charCode = (char) (((c - 'A' + n) % 26) + 'A');
                if(i % 2 != 0){
                    charCode = Character.toLowerCase(charCode);
                }
                sequence.append((char) charCode);
            }else if(Character.isDigit(c)) {
                charCode = (char)('9' - c + '0');
                sequence.append((char) charCode);
            }else{
                sequence.append(c);
            }
        }
        return sequence.reverse().toString();
    }
}
