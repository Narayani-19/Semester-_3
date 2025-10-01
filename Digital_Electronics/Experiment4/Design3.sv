module full_add(s,cout,w1,w2,w3,a,b,c);
  input a,b,c;
  output w1,w2,w3,s,cout;

  xor n1(w1,a,b);
  xor n2(s,w1,c);
  and n3(w2,a,b);
  and n4(w3,w1,c);
  or n5(cout,w2,w3);
  
  
 
endmodule
