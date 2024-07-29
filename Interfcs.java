public class Interfcs {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }
}
interface Chesspieces{
    void moves();
}
class Queen implements Chesspieces{
    public void moves(){
        System.out.println("up,down,left,right(in all four directions)");
    }
}
class King implements Chesspieces{
    public void moves(){
        System.out.println("up,down,left,right(in only 1 directions)");
    }
}
class Rook implements Chesspieces{
    public void moves(){
        System.out.println("up,down,left,right(vertically and horizontally)");
    }
}