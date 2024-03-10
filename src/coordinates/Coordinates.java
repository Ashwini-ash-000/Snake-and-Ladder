package coordinates;

public class Coordinates {
    int row;
    int col;

    public Coordinates(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    public void printCooridinates()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("[").append(this.row).append(",").append(this.col).append("]");

        System.out.println(sb);
    }

    public int getRow()
    {
        return this.row;
    }
}
