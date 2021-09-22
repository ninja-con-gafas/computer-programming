#!/usr/bin/env bash

# "The Awk Programming Language by Alfred Aho, Brian Kernighan and Peter Weinberger"

# "SECTION 1.1"
# Syntax: awk 'PATTERN {ACTION}' file

file=$(dirname $0)/file
awk '{print $0}' $file # default pattern is match every line, $0 prints the entire line
awk '$3~/[$]/' $file # default action is to print every line with the match

# "SECTION 1.2"
awk '{print $1,$3}' $file # comma is a seperator
awk '{print NF,$NF}' $file # NF, $NF number of fields in a line, last field in a line
awk '{print $2+$2}' $file  # awk supports arithmetic operations +,-,*,/,^
awk '{print NR}' $file # NR current row number
awk '{print "You hold",$2,"shares in",$1,"of worth",$3,"/- each"}' $file # add strings

# "SECTION 1.3"
awk '$3~/[$]/{printf("You hold %d shares in %-4s of worth %s/- each\n",$2,$1,$3)}' $file # formating

# "SECTION 1.4"
flag=$(awk '$1=="T"{print 1}' $file)
if [ $flag -eq "1" ]
then
	echo "Your are a share holder of AT&T Inc."
else
	echo "Your are not a share holder of AT&T Inc."
fi
# Syntax for regular expressions to match pattern:
#	field ~ /regex/
# to invert the matching pattern:
#	field !~ /regex/
# Anchors in regular expressins
#	^	indicates the beginning of the line
#	$	indicated the end of a line
#	\A	denotes the beginning of a string
#	\z	denotes the end of a string
#	\b	marks a word boundary
#	\w	selects any word
#	\W	invert selects any word
#	\s	selects any whitespace character
#	\S	invert any whitespcae characters
#	\d	selects any digit
#	\D	inverts selects any digit
# Grouped matches
#	(pattern)	parentheses indicate that the enclosed letters must appear continuously
#	|		means or operator in the context of a grouped match
#	[regex]		select specified regex pattern
# Quantifiers
#	.	matches any character
#	+	modifies the preceding set to mean one or more times
#	*	modifies the preceding set to mean zero or more times
#	?	modifies the preceding set to mean zero or one time
#	{n}	modifies the preceding set to mean exactly n times
#	{n,}	modifies the preceding set to mean n or more times
#	{n,m}	modifies the preceding set to mean between n and m times

# "SECTION 1.5"
# Syntax for substituting a pattern:
#	sub(/PATTERN/,REPLACE);
awk '$3~/[$]/{sub(/[$]/,"");printf("Your stake in %-4s is $%.2f/-\n",$1,$3*$2)}' $file
