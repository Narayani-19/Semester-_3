module adder_gates(s,c,a,b);
  input a,b;
  output s,c;

  xor n1(s,a,b);
  and n2(c,a,b);
 
 endmo
