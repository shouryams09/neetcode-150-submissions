class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>> rows=new HashMap<>();
        Map<Integer,Set<Character>> cols=new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }

                    if(rows.containsKey(i)){
                        if(rows.get(i).contains(board[i][j])){
                            return false;
                        }
                    }else{
                        rows.put(i,new HashSet<>());
                    }

                    if(cols.containsKey(j) ){
                        if(cols.get(j).contains(board[i][j])){
                        return false;
                        }
                    }else{
                        cols.put(j,new HashSet<>());
                    }

                    String squareKey = (i / 3) + "," + (j / 3);

                    if(squares.containsKey(squareKey)){
                        if(squares.get(squareKey).contains(board[i][j])){
                        return false;
                        }
                    }else{
                        squares.put(squareKey,new HashSet<>());
                    }

                    rows.get(i).add(board[i][j]);
                    cols.get(j).add(board[i][j]);
                    squares.get(squareKey).add(board[i][j]);
            }
        }
        return true;

    }
}
