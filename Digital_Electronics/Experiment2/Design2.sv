module gate_min(w1,w2,w3,w4,z,a,b,c);
  input a,b,c;
  output w1,w2,w3,w4,z;

  and n1(w1,b,c);
  not n2(w2,a);
  xor n3(w3,b,c);
  and n4(w4,w2,w3);
  or n5(z,w1,w4);
  
 
 endmodule
