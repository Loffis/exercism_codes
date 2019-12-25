class BeerSong {

    public BeerSong(){

    }

    public String sing(int verses, int startVerse){
        String song = "";
        String partOfSong = "";
        while (startVerse > 0) {
            if (verses == 0) {
                partOfSong =
                        ("No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n");
            } else if (verses == 1) {
                partOfSong =
                        (verses + " bottle of beer on the wall, " + verses + " bottle of beer.\n" +
                        "Take it down and pass it around, no more bottles of beer on the wall.\n\n");
            } else if (verses == 2) {
                partOfSong =
                        (verses + " bottles of beer on the wall, " + verses + " bottles of beer.\n" +
                        "Take one down and pass it around, " + (verses - 1) + " bottle of beer on the wall.\n\n");
            } else {
                partOfSong =
                        (verses + " bottles of beer on the wall, " + verses + " bottles of beer.\n" +
                        "Take one down and pass it around, " + (verses - 1) + " bottles of beer on the wall.\n\n");
            }
            song = song.concat(partOfSong);
            startVerse--;
            verses--;
        }
        return song;
    }

    public String singSong(){
        return sing(99, 100);
    }
}