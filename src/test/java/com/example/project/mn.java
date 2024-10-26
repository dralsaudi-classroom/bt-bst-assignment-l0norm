package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mn {
    public static void main(String args[]){

      BST<Character> t = new BST<Character>();
      t.insert(20, 'A');
      t.insert(10, 'B');
      t.insert(5, 'C');
      t.insert(3, 'D');
      t.insert(1, 'E');
      t.insert(2, 'F');
      t.insert(8, 'G');
      t.insert(9, 'H');
      t.insert(6, 'I');
      t.insert(7, 'J');
      t.insert(30, 'K');
      t.insert(21, 'L');
      t.insert(26, 'M');
      t.insert(23, 'N');
      t.insert(22, 'O');
      t.insert(24, 'P');
      t.insert(38, 'Q');
      t.insert(37, 'R');
      t.insert(34, 'S');
      t.insert(31, 'T');
      t.insert(35, 'U');
      t.insert(44, 'V');

      t.countNodesIn(20);//22
      t.countNodesIn(21);//5
      t.countNodesIn(24);//1
      t.countNodesIn(5);//8
      t.countNodesIn(0);//0
      t.countNodesIn(240);//0
      t.countNodesIn(34);//3
      t.countNodesIn(4);//0
    }
}
