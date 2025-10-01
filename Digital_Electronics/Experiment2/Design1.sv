module gate_min(w1,w2,z,a,b,c);
  input a,b,c;
  output w1,w2,z;

  or n1(w1,a,c);
  not n2(w2,b);
  and n3(z,w1,w2);
  
 
 endmodule
