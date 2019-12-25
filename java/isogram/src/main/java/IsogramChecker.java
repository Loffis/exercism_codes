class IsogramChecker {

    boolean isIsogram(String phrase) {
        char[] charArray = phrase.toLowerCase().replaceAll("\\W", "").toCharArray();
        if (charArray.length > 1) {
            for (int i = 0; i < (charArray.length - 1); i++) {
                for (int j = 1; j < charArray.length; j++) {
                    if (charArray[i] == charArray[j] && i != j) {
                        return false;
                    }
                }
            }
            return true;
        }
        return true;
    }
}
