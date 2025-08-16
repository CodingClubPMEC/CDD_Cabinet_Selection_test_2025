class main {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target) {
                return letter;
            }
        }
        return letters[0];
    }
    public static void main(String[] args) {
        main sol = new main();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(sol.nextGreatestLetter(letters, target));
    }
}
