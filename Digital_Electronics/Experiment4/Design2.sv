module sub_gates(d,w1,bout,a,b);
  input a,b;
  output d,w1,bout;

  xor n1(d,a,b);
  not n2(w1,a);
  and n3(bout,w1,b);
 
 endmodule
