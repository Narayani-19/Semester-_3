module nor_min(w1,w2,w3,z,a,b,c);
  input a,b,c;
  output w1,w2,w3,z;

  nor n1(w1,a,a);
  nor n2(w2,b,w1);
  nor n3(w3,w1,c);
  nor n4(z,w2,w3);
  
 
 endmodule
