class Song{
    private String title;
    private String genre;

    void set_song(String _title, String _genre){
        title = _title;
        genre = _genre;
    }

    void print_Song(){
        System.out.println("노래제목: " + title + "(" + genre + ")");
    }
}

class Singer{
    String name;
    Song song;

    void set_singer(String _name){
        name = _name;
    }

    void hit_song(Song _song){
        song = _song;
    }

    void print_singer(){
        System.out.println("가수이름: " + name);
        song.print_Song();
    }
}


public class MySongClass {
    public static void main(String[] args) {
        // song 객체 생성
        Song song = new Song();
        song.set_song("취중진담", "발라드");

        // singer 객체 생성
        Singer singer = new Singer();
        singer.set_singer("김동률");
        // singer의 대표곡을 지정함
        singer.hit_song(song);
        // singer의 정보를 출력합
        // 가수이름과 노래제목이 여기서 출력됨
        singer.print_singer();
    }
}
