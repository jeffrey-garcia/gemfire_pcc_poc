Please download Jmeter 3.2 and put in the load test home folder.

To run load test for Gemfire:
```
./start_load_gemfire.sh
```

To run load test for PCC:
```
./start_load_pcc.sh
```

You may update the number of loop and number of thread in jmx file. I found that 200 threads is optimum from my Macbook. 

Result can be found in report folder and jmeter log.
