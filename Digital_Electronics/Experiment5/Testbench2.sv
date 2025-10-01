module greybin_test();
  reg g0,g1,g2;
  wire b0,b1,b2;
  grey_bin dut(.b0(b0),
               .b1(b1),
               .b2(b2),
               .g0(g0),
               .g1(g1),
               .g2(g2));
  initial begin
        // Dump the waveform for visualization (optional)
        $dumpfile("test.vcd");
    $dumpvars(1, greybin_test);
  end
  
  initial begin
        // Test case 1: 0, 0 ,0
        g2 = 0; g1 = 0; g0 = 0; #10;
        // Test case 2: 0, 0, 1
        g2 = 0; g1 = 0; g0 = 1; #10;
        // Test case 3: 0, 1, 0
        g2 = 0; g1 = 1; g0 = 0; #10;
        // Test case 4: 0, 1, 1
        g2 = 0; g1 = 1; g0 = 1; #10;
   		 // Test case 5: 1, 0, 0
        g2 = 1; g1 = 0; g0 = 0; #10;
        // Test case 6: 1, 0, 1
        g2 = 1; g1 = 0; g0 = 1; #10;
    	// Test case 7: 1, 1, 0
        g2 = 1; g1 = 1; g0 = 0; #10;
    	// Test case 8: 1, 1, 1
        g2 = 1; g1 = 1; g0 = 1; #10;
    
        $finish; // End the simulation
      end
      
endmodule
