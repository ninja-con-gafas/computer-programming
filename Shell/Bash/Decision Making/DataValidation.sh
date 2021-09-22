#!/usr/bin/env bash

valid=false

while [ $valid = false ]
do
	read -p "Enter your name and age: " name age
	if [[ ( -z $name ) || ( -z $age ) ]]
	then
		echo "Not enough parameters"
		continue
	elif [[ ! $name =~ ^[A-Za-z]+$ ]]
	then
		echo  "Non alphabetical character detected in "$name
		continue
	elif [[ ! $age =~ ^[0-9]+$ ]]
	then
		echo "Non numerical character detected in "$age
		continue
	fi
	valid=true
done
echo "Your name is $name and you are $age years old."
