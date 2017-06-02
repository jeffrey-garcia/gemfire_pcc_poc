Please download [Jmeter 3.2](http://ftp.cuhk.edu.hk/pub/packages/apache.org//jmeter/binaries/apache-jmeter-3.2.zip) and put in the load test home folder.

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

Sample result log: 
```
> ./start_load_gemfire.sh
Creating summariser <summary>
Created the tree successfully using load_gemfire.jmx
Starting the test @ Fri Jun 02 15:05:08 HKT 2017 (1496387108049)
Waiting for possible Shutdown/StopTestNow/Heapdump message on port 4445
summary +  74475 in 00:00:22 = 3446.2/s Avg:    56 Min:     8 Max:  1115 Err:     0 (0.00%) Active: 200 Started: 200 Finished: 0
summary + 107802 in 00:00:30 = 3593.4/s Avg:    55 Min:     8 Max:  1166 Err:     0 (0.00%) Active: 200 Started: 200 Finished: 0
summary = 182277 in 00:00:52 = 3531.7/s Avg:    55 Min:     8 Max:  1166 Err:     0 (0.00%)
summary + 106346 in 00:00:30 = 3544.9/s Avg:    56 Min:     8 Max:  1199 Err:     0 (0.00%) Active: 200 Started: 200 Finished: 0
summary = 288623 in 00:01:22 = 3536.6/s Avg:    56 Min:     8 Max:  1199 Err:     0 (0.00%)
summary + 106084 in 00:00:30 = 3536.1/s Avg:    56 Min:     8 Max:  1137 Err:     0 (0.00%) Active: 150 Started: 200 Finished: 50
summary = 394707 in 00:01:52 = 3536.5/s Avg:    56 Min:     8 Max:  1199 Err:     0 (0.00%)
summary +   5293 in 00:00:03 = 2008.0/s Avg:    35 Min:     8 Max:   203 Err:     0 (0.00%) Active: 0 Started: 200 Finished: 200
summary = 400000 in 00:01:54 = 3501.2/s Avg:    55 Min:     8 Max:  1199 Err:     0 (0.00%)
Tidying up ...    @ Fri Jun 02 15:07:02 HKT 2017 (1496387222637)
... end of run

```
