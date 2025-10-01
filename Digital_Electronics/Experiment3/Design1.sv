module nand_min(w1,z,a,b,c);
  input a,b,c;
  output w1,z;

  nand n1(w1,b,c);
  nand n2(z,a,w1);
  
  
 
endmodule
