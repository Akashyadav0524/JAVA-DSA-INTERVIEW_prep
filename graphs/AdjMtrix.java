package graphs;

public class AdjMtrix {
    public static void main(String[] args) {
        int adjMat[][]= new int[5][];
        addEdges(adjMat,0,1);
        addEdges(adjMat,0,2);
        addEdges(adjMat,0,3);
        addEdges(adjMat,0,1);
    }

    public static void addEdges(int adjMat[][],int i,int j){

        adjMat[i][j]=1;
        adjMat[j][i]=1;

    }
} 
