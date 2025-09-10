// Code your design here
module basic_gates(y1,y2,y3,y4,y5,y6,y7,a,b);
  input a,b;
  output y1,y2,y3,y4,y5,y6,y7;
  not n1(y1,a);
  and n2(y2,a,b);
  nand n3(y3,a,b);
  or n4(y4,a,b);
  nor n5(y5,a,b);
  xor n6(y6,a,b);
  xnor n7(y7,a,b);
 endmodule
