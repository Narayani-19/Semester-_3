module bin_grey(g0,g1,g2,b0,b1,b2);
  input b0,b1,b2;
  output g0,g1,g2;

  xor n1(g1,b2,b1);
  xor n2(g0,b1,b0);
  assign g2=b2;
  
  
 
endmodule
