package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class BoardTest {

    @Test
    void testValidBoard() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();

        Board board = new Board(grid);

        assertThat(board.invariant()).isTrue();
        assertThat(board.squareAt(0, 0)).isEqualTo(grid[0][0]);
    }

    @Test
    void testBoardWithNullSquare() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;

        Board board = new Board(grid);
        board.squareAt(0, 0);
    }
}


