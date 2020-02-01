# Dragonfly-topology

In RoutingUnit.cc

the ComputeXY is the UGAL-G routing.
the Custom is the Valiant routing.

Therefore, you can input the command --routing-algorithm=1 to choose UGAL-G and --routing-algorithm=2 to choose Valiant.

All routing can be run in the se mode and get right result.
However, when it was test by benchmark, it would get an error caused by deadlock, which I tried but cannot solve it!

I also upload the result of two benchmarks.
As for uniform_random traffic, because there are too many result files in this mode, I don't upload all the results.
