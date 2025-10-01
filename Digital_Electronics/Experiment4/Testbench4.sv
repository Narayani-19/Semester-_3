module fullsub_test();
  reg a,b,c;
  wire w1,w2,w3,w4,w5,d,bout;
  full_sub dut(.a(a),
               .b(b),
               .c(c),
               .w1(w1),
               .w2(w2),
               .w3(w3),
               .w4(w4),
               .w5(w5),
               .d(d),
               .bout(bout));
  initial begin
        // Dump the waveform for visualization (optional)
        $dumpfile("test.vcd");
    $dumpvars(1, fullsub_test);
  end
  
  initial begin
        // Test case 1: 0, 0 ,0
        a = 0; b = 0; c = 0; #10;
        // Test case 2: 0, 0, 1
        a = 0; b = 0; c = 1; #10;
        // Test case 3: 0, 1, 0
        a = 0; b = 1; c = 0; #10;
        // Test case 4: 0, 1, 1
        a = 0; b = 1; c = 1; #10;
   		 // Test case 5: 1, 0, 0
        a = 1; b = 0; c = 0; #10;
        // Test case 6: 1, 0, 1
        a = 1; b = 0; c = 1; #10;
    	// Test case 7: 1, 1, 0
        a = 1; b = 1; c = 0; #10;
    	// Test case 8: 1, 1, 1
        a = 1; b = 1; c = 1; #10;
    
        $finish; // End the simulation
      end
      
endmodule
