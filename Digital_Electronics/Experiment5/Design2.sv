module grey_bin(b0,b1,b2,g0,g1,g2);
  input g0,g1,g2;
  output b0,b1,b2;

  xor n1(b1,g2,g1);
  xor n2(b0,b1,g0);
  assign b2=g2;
  
  
 
endmodule
