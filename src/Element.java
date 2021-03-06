public class Element {

    Node[] nodes = new Node[4];
    int id;
    int[] edge = new int[4];
    Jacobian jacobian;
    MatrixH matrixH;
    MatrixC matrixC;
    MatrixH_BC matrixH_bc;
    VectorP vectorP;

    public Element(Node n1, Node n2, Node n3, Node n4, int id) {
        this.nodes[0] = n1;
        this.nodes[1] = n2;
        this.nodes[2] = n3;
        this.nodes[3] = n4;
        this.id = id;

        for(int i = 0; i < 4; i++) {
            edge[i] = 0;
        }
    }

    public void printElement() {

        System.out.println("Element ID: " + id+ "\nNode: ");

        for (Node node:nodes) {

            node.printNode();
        }
    }
}
