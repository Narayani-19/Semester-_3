// Code your testbench here
// or browse Examples
module basic_test();
  reg a,b;
  wire y1,y2,y3,y4,y5,y6,y7;
  basic_gates dut(.a(a),
                  .b(b),
                  .y1(y1),
                  .y2(y2),
                  .y3(y3),
                  .y4(y4),
                  .y5(y5),
                  .y6(y6),
                  .y7(y7));
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
