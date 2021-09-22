#!/usr/bin/env bash

file=$1
flag=true
if [ -z $file ]
then
	echo "Error: missing file operand"
	flag=false
	exit 1
elif [ ! -e $file ]
then
	echo "Error: file does not exist"
	flag=false
	exit 2
elif [ ! -r $file ]
then
	echo "Error: file read permission denied"
	flag=false
	exit 3
elif [ $flag ]
then
	awk 'BEGIN {FS="|"};NR>1 {print $3, $2}' $file | sort -rn | awk 'NR==1 {printf("Highscore: %s\n",$2)}'
	exit 0
fi
