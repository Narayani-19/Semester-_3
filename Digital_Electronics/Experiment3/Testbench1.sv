module nand_test();
  reg a,b,c;
  wire w1,z;
  nand_min dut(.a(a),
                  .b(b),
                  .c(c),
                  .w1(w1),
                  .z(z));
  initial begin
        // Dump the waveform for visualization (optional)
        $dumpfile("test.vcd");
    $dumpvars(1, nand_test);
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
  
