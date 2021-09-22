#!/usr/bin/env bash

# functions in bash must be defined before invoking them

parameters=$@
function print() # use of the keyword function is optional
{
	echo $parameters
} # there is no return statement
print $parameters # parameters are passed in similar way as they are passed to a command
exit 0
