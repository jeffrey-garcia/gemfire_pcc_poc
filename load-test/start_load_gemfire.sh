#!/usr/bin/env bash

./apache-jmeter-3.2/bin/jmeter -n -t load_gemfire.jmx -j jmeter_gemfire.log
