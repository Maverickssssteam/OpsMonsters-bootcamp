#!/bin/bash







echo "Choose Your Options"
echo "-------------------"
echo "1. Disk Usage"
echo "2. Logged user"
echo "3. Current memory Usage"

read option


case $option in
1)
	echo "Your disk usage is :"
	df -h
	echo ""
	;;
2)
	echo "Logged user"
	whoami
	echo ""
	;;
3)
	echo "Current memory usage"
	free -m
	echo ""
	;;
*)
	echo "Invalid Option"
	echo "Choose any one (1/2/3)"
	;;
esac

