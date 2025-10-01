module full_sub(d,bout,w1,w2,w3,w4,w5,a,b,c);
  input a,b,c;
  output w1,w2,w3,w4,w5,d,bout;

  xor n1(w1,a,b);
  xor n2(d,w1,c);
  not n3(w4,a);
  not n4(w5,w1);
  and n5(w2,w4,b);
  and n6(w3,w5,c);
  or n7(bout,w2,w3);
  
  
 
endmodule
