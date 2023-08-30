import java.util.LinkedList;

public class Pebble {
    private int _x;
    private int _y;
    private Color _color;

    private int _boardSize;

    private LinkedList<Pebble> _boardPebbles;
    public Pebble(int x, int y, Color c, LinkedList<Pebble> ps)
    {
        this._x = x;
        this._y = y;
        this._color = c;
        ps.add(this);
        this._boardPebbles = ps;
    }

    public Color get_color() { return this._color;}
    public int get_x() {return this._x;}
    public int get_y() {return this._y;}

    public LinkedList<Pebble> get_boardPebbles() {return this._boardPebbles;}

    void set_x(int x) { this._x = x;}
    void set_y(int y) { this._y = y;}
    void set_color(Color c) { this._color = c;}
    void set_boardSize(int s) { this._boardSize = s;}

    public boolean diagonalCheck(int x , int  y)
    {
        return Math.abs(this._x - x) == Math.abs(this._y - y);
    }

    public boolean borderCheck(int x , int y)
    {
        if(x > _boardSize - 1 || x < 0 || y > _boardSize -1 || y < 0 )
            return true;
        return false;
    }

    public void make_move(int x , int y)
    {
        if(diagonalCheck(x,y))
        {
            throw new IllegalArgumentException("Diagonal moves are invalid");
        }
    }

}
