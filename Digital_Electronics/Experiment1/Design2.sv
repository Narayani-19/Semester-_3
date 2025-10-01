module basic_gates(y,w1,z,w2,w3,p,a,b);
  input a,b;
  output y,w1,z,w2,w3,p;

  nand n1(y,a,a);
  nand n2(w1,a,b);
  nand n3(z,w1,w1);
  nand n4(w2,a,a);
  nand n5(w3,b,b);
  nand n6(p,w2,w3);
 
 endmodule
