#!/usr/bin/env bash

# while loop in bash

count=0

while [ $count -lt 10 ]
do
	echo $count
	((count++))
done

# for loop in bash, it gets executed only if the parameters are given

parameters=$@
count=1
for parameter in $parameters
do
	echo "Parameter "$count "is" $parameter
	((count++))
done
exit 0

# break and continue work as usual
