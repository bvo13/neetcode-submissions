class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>> rows = new HashMap<>();
        Map<Integer,Set<Character>> columns = new HashMap<>();
        Map<Integer,Set<Character>> table = new HashMap<>();

        for(int i = 0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                int tableIndex = (i/3)*3+(j/3);
                if(board[i][j]=='.'){
                    continue;
                }
               if(!rows.containsKey(i)){
                Set<Character> dupes = new HashSet<>();
                dupes.add(board[i][j]);
                rows.put(i,dupes);
               }
               else{
                if(rows.get(i).contains(board[i][j])){
                    return false;
                }
                else{
                    rows.get(i).add(board[i][j]);
                }
               }
               if(!columns.containsKey(j)){
                Set<Character> dupes = new HashSet<>();
                dupes.add(board[i][j]);
                columns.put(j,dupes);
               }
               else{
                if(columns.get(j).contains(board[i][j])){
                    return false;
                }
                else{
                    columns.get(j).add(board[i][j]);
                }
               }
               if(!table.containsKey(tableIndex)){
                Set<Character> dupes = new HashSet<>();
                dupes.add(board[i][j]);
                table.put(tableIndex,dupes);
               }
               else{
                if(table.get(tableIndex).contains(board[i][j])){
                    return false;
                }
                else{
                    table.get(tableIndex).add(board[i][j]);
                }
               }
            }
        }
    return true;
        
    }
}
