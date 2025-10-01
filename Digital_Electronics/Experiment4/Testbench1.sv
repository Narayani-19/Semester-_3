module adder_test();
  reg a,b;
  wire s,c;
  adder_gates dut(.a(a),
                  .b(b),
                  .s(s),
                  .c(c));
  initial begin
        // Dump the waveform for visualization (optional)
        $dumpfile("test.vcd");
    $dumpvars(1, adder_test);
  end
  
  initial begin
        // Test case 1: 0, 0
        a = 0; b = 0; #10;
        // Test case 2: 0, 1
        a = 0; b = 1; #10;
        // Test case 3: 1, 0
        a = 1; b = 0; #10;
        // Test case 4: 1, 1
        a = 1; b = 1; #10;

        $finish; // End the simulation
      end

      
    endmodule
