public class isPalindromeRecursive {

    public boolean isPalindrome(String word){

        if(word.length() <= 1)
            return true;
        else{
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);

            if(first == last)
                return isPalindrome(word.substring(1, word.length() - 1));

            return false;
        }

    }

}
