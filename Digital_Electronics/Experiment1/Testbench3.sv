module basic_test();
  reg a,b;
  wire y,w1,z,w2,w3,p;
  basic_gates dut(.a(a),
                  .b(b),
                  .y(y),
                  .w1(w1),
                  .w2(w2),
                  .z(z),
                  .w3(w3),
                  .p(p));
  initial begin
        // Dump the waveform for visualization (optional)
        $dumpfile("test.vcd");
    $dumpvars(1, basic_test);
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
