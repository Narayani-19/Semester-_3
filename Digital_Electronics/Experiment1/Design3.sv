module basic_gates(y,w1,w2,z,w3,p,a,b);
  input a,b;
  output y,w1,z,w2,w3,p;

  nor n1(y,a,a);
  nor n2(w1,a,a);
  nor n3(w2,b,b);
  nor n4(z,w1,w2);
  nor n5(w3,a,b);
  nor n6(p,w3,w3);
 
 endmodule
