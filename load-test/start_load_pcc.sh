#!/usr/bin/env bash

./apache-jmeter-3.2/bin/jmeter -n -t load_pcc.jmx -j jmeter_pcc.log
