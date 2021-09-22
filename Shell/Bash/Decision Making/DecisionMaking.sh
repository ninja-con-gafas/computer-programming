#!/usr/bin/env bash

# if, else and elif clause in bash

user_name=$1
if [ $user_name -eq $(whoami) ]
then
	echo "Hello A. B. Darekar"
else
	echo "Your user name is "$user_name
fi

process_id=$2
if [ $process_id -eq $$ ]
then
	echo "Your guess is correct, the current process ID is "$process_id
elif [ $process_id -lt $$ ]
then
	echo "Your guess is wrong, the current process ID is greater than "$process_id
elif [ $process_id -gt $$ ]
then
	echo "Your guess is wrong, the current process ID is less than "$process_id
fi
